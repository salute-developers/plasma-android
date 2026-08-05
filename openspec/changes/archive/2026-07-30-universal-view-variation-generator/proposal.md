## Why

Для Compose универсальный генератор стилей уже внедрён: `UniversalComposeVariationGenerator` управляется метой `ComposeComponentMeta` (KSP по `@ApiInfo`), компонент-специфичные генераторы ему не нужны. Для View аналога нет: `UniversalComponentConfigDelegate.createViewGenerator(...)` возвращает `null`, а стили генерируют **64 рукописных** `*StyleGeneratorView`/`*StyleGenerator` (~7.9k строк) — по одному описанию API компонента на файл.

Предыдущий change (`add-view-api-meta`) собрал недостающее звено: `declare-styleable` в `sdds-core/uikit` размечены namespace `sdds`, `build-system/conventions` собирает из них `sdds/api/uikit-api-meta.json`, `UikitApiMetaTask` умеет вычитывать мету из classpath. Потребителя у меты нет — задача зарегистрирована в `ThemeBuilderPlugin` и никуда не прокинута.

Логика View-генерации target-agnostic: обход дерева вариаций, генерация `ColorState`-enum/провайдера, сборка state-list'ов и эмиттеры XML работают от конфига, а не от типа компонента. После удаления покомпонентного кода эта логика оформляется композицией, симметричной Compose-пути: `ViewVariationTreeProcessor` отвечает за дерево и наследование, `ViewStyleResourceWriter` — за стили и связанные ресурсы, а `UniversalViewVariationGenerator` проецирует мету в их операции.

## What Changes

### Генератор и его встраивание (`sdds-core/plugin_theme_builder`)

- **Новое**: `UniversalViewVariationGenerator` (`internal/universal/view/`) — единственный генератор View-стилей, напрямую реализующий `ComponentStyleGenerator<UniversalComponentConfig>` и управляемый `ComponentMeta`: итерирует `meta.params`, диспетчеризует эмиссию по семантическому типу свойства, разрешает состояния через словарь состояний и привязки из меты. Обход дерева и запись ресурсов подключаются композицией через `ViewVariationTreeProcessor` и `ViewStyleResourceWriter`.
- **Новое**: `UniversalComponentGenerator` — единственная точка генерации стилей компонентов: обе цели описываются метой (Compose — `ComposeComponentMeta`, View — `ComponentMeta`), компонент конфига сводится с метой по имени.
- **Удаление**: слой делегатов целиком — `ComponentConfigDelegate`, `UniversalComponentConfigDelegate`, `HybridComponentConfigDelegate` и реестр `componentDelegates` на 78 записей. Реестр был нужен, пока часть компонентов обслуживали рукописные делегаты; при генерации по мете регистрация компонента не требуется.
- **Изменено**: `GenerateComponentsTask` грузит view-мету для view-цели и compose-мету для compose-цели; снимается костыль, из-за которого при генерации view compose-мета не читалась и все компоненты уходили в legacy-делегаты.
- **Изменено**: `AndroidState` дополняется значением `selected` (`android:state_selected`) — сейчас оно резолвится вручную в двух генераторах.
- **Удаление**: весь компонент-специфичный код генерации — 67 View-генераторов (`internal/components/*/view/`, `*/vs/`) с их property-энумами, 66 Compose-генераторов, 63 рукописных `*ConfigDelegate` и покомпонентные `*Config`/`*Properties`; затем удаляются фиктивный пакет `internal/components` и legacy-базы `ViewVariationGenerator`/`ViewComponentStyleGenerator`/`ComposeVariationGenerator`.

### Словарь разметки (`sdds-core/uikit`, `build-system/conventions`)

Проведён аудит существующего словаря против кода парсера и фактической разметки. Помимо добавления новых атрибутов, исправляются три расхождения в уже задеплоенном контракте.

**Обобщается (без новых слов):**
- `sdds:api_info` — семантика уточняется: это **логическое имя компонента** (join key с токен-конфигом и делегатами), а не имя styleable. Сейчас в разметке лежат имена styleable, из-за чего для 8+ компонентов join key отсутствует или неверен (`CellLayout` вместо `Cell`, `ListView` вместо `List`, `Button` вместо `BasicButton/IconButton/LinkButton`, отсутствует `TextArea` и т.д.). Значения исправляются.
- `sdds:api_state` — перестаёт быть только «enum-driven набор взаимоисключающих состояний с ordinal» и становится **привязкой состояния** `configName → (drawableAttr, флейвор, значение)`; enum-driven набор — частный случай. Это закрывает вопрос, явно отложенный предыдущим change'ом («поддержка независимых scoped-булевых состояний — отдельный вопрос модели»).
- `sdds:api_state_negated` — получает применение: несколько привязок с одним `api_name` образуют **составное состояние** (TextField: `focused` → `android:state_focused="true"` + `android:state_activated="false"`).

**Добавляется:**
- `sdds:api_core_name`, `sdds:api_def_style_attr`, `sdds:api_parent` — идентичность компонента, **per-component** (один styleable обслуживает несколько компонентов с разными `defStyleAttr`/parent: `Button`→BasicButton/IconButton/LinkButton, `TextField`→TextField/TextArea, `Badge`→Badge/IconBadge, `Note`→Note/NoteCompact). Всё это — знание uikit: `Sdds.Components.*` объявлены в самом uikit (70 стилей), `sd_*Style`/`android:*Style` — атрибуты uikit/фреймворка.
- `sdds:api_res_suffix` — суффикс имени генерируемого ресурса (`@dimen`/`@color`/`@xml`). Дефолт — snake_case от `attrName` без префикса: по замеру он даёт верный суффикс в 310 привязках из 398 (вывод из `id` — только 231/398), явное переопределение нужно в 88 привязках.
- `sdds:api_placement="overlay"` — атрибут эмитится в ThemeOverlay-стиль, а не в основной (Cell, ListItem: `defStyleAttr` вложенных компонентов).
- `sdds:api_state_value` — значение свойства под дополнительным состоянием, закрытая грамматика из двух форм: `<state>=<configKey>` (алиасный ключ конфига — TextField `readonly`, Avatar `active`) и `<state>=alpha(<configKey>)` (производное значение — Button `loading`: тот же ключ с альфой из `loadingAlpha`).

**Удаляется:**
- `sdds:api_framework` — дублирует inline-объявление: framework-атрибуты уже объявлены внутри тех же `declare-styleable` (`badge` 12, `counter` 12, `progress` 12, `chip` 10 …), а позиционная грамматика `key=attr:type` не расширяется под `res_suffix`/`placement`. 93 биндинга переносятся на элементы `<attr name="android:*">` с `sdds:api_name`; правило парсера меняется на «`android:*` попадает в мету тогда и только тогда, когда несёт `sdds:api_name`». Проверено: uikit нигде не итерирует styleable по индексам (`getIndexCount` не используется), дополнение массивов безопасно.
- `sdds:api_package` — для View не работает: `ViewColorStateGenerator` кладёт все `ColorState` в плоский пакет `<base>.colorstate`, per-component пакеты есть только в Compose (а compose-мету даёт KSP, не XML-разметка). Использований в разметке — 0.

**Отклонено в ходе аудита** (рассматривалось, но выражается существующими средствами или воспроизводит избыточность): `api_wraps_attr`/`api_wrap_suffix`, `api_state_map`, `api_state_excludes`.

**Принцип, фиксируемый спекой**: детали поведения конкретного компонента не протекают ни в словарь `sdds:*`, ни в код универсального генератора. При невыразимом случае приоритет решений — нормализация избыточного/некорректного вывода → запись существующими словами → новое **параметризованное** слово, покрывающее категорию; покомпонентный флаг в словаре и ветвление по имени компонента в движке одинаково запрещены.

### Мета (`build-system/conventions` + consumer-модель)

`ComponentMeta` расширяется идентичностью компонента, полями свойства (`resSuffix`, `placement`, `stateValues`), обобщённой моделью состояний (плоские привязки + именованные наборы) и **общим словарём shared-состояний** (`sd_state_*` из `base_attrs.xml`, 17 имён), чтобы генератор резолвил имена состояний по реальному словарю, а не форматированием строки — сейчас нераспознанное имя состояния молча теряется в state-list.

Из привязки состояния **удаляется поле `ordinal`**: оно вводилось как рантайм-контракт `ColorStateProvider`, но проверка по коду это не подтверждает — порядок значений генерируемого `XxxColorState` определяется ключами `view`-вариаций конфига, а XML-`<enum>` и Kotlin-enum эмитятся одним проходом по одному списку и согласованы по построению; рантайм-порядок enum-driven состояний компонента задаётся значениями `<enum>` темизируемого свойства (`sd_status`: `none=0`/`active=1`/`inactive=2`), которые мета уже несёт. Позиционный `ordinal` (`active=0`/`inactive=1`) не совпадал ни с одним из этих порядков. Взамен вводится проверка согласованности ключей состояний с `configName` значений соответствующего enum-свойства — она закрывает реальный риск (недостижимый элемент state-list из-за рассинхрона имён), от которого `ordinal` не защищал.

### Разметка компонентов

Разметка uikit доразмечается новым словарём **по мере необходимости** — покомпонентно, в объёме, который требуется универсальному генератору для воспроизведения текущего вывода. Полнота разметки не постулируется заранее, а определяется фикстурой «полнота разметки» (см. ниже) и семантическим сравнением сгенерированных ресурсов: если для конкретного компонента дефолтов достаточно, разметка не добавляется; если нет — добавляется ровно недостающее. Если по ходу раскатки обнаружится случай, не выражаемый текущим словарём, он SHALL сначала проверяться на избыточность/выразимость существующими средствами (как в этом аудите) и только затем становиться поводом расширить словарь.

### Валидация

- **Новое**: чистый (без Gradle-типов) сравниватель сгенерированных ресурсов + задача `compareGeneratedTheme`, регистрируемая `ThemeBuilderPlugin` на модуле темы и сравнивающая его выход с переданным эталоном.
- **Новое**: воспроизводимая процедура верификации на реальной теме (см. design → Verification Procedure): проверка того, что генерация видит локальный `uikit`, baseline sanity на неизменённом коде, полный цикл `cleanTheme` + `generateTheme` + `generateComponents`, сравнение сравнивателем и `git status`/`git diff`, скриншот-тесты. Проверено, что `convention.core-dependencies` подменяет `io.github.salute-developers:sdds-uikit` на `project :sdds-core:uikit`, поэтому правки разметки доезжают до генерации без публикации артефакта.
- **Новое**: фикстура «полнота разметки», извлечённая из рукописных генераторов **до** их удаления: таблица `(компонент, ключ конфига, attrName, resSuffix, placement, состояния)`; тест проверяет, что мета её покрывает, и переживает удаление генераторов.

Раскатка идёт волнами по компонентам, но результат change'а — **все 64 компонента на универсальном генераторе, рукописные удалены**; промежуточных состояний в `main` не остаётся.

## Contract совместимости

| Уровень | Требование |
|---|---|
| Имена ресурсов (`@dimen`/`@color`/`@xml`), имена стилей и ThemeOverlay, имена атрибутов, `ColorState`-классы/атрибуты и их ordinal | **байт-в-байт** |
| Содержимое и **порядок** элементов в state-list/selector-ресурсах | **байт-в-байт** (порядок семантичен: выигрывает первое совпадение) |
| Порядок `<item>` внутри одного `<style>` | перестановка допустима, проверяется семантическим сравнивателем |

Опечатка `SelectIem` в имени компонента консервируется через `sdds:api_core_name`; её исправление — отдельный change.

Единственное согласованное отступление от «байт-в-байт»: **обёрточные ThemeOverlay TextField/TextArea** (`ComponentOverlays.TextField<Variation>Chips`). Проверено, что все 20 обёрток в двух темах побайтово дублируют уже генерируемый собственный overlay ChipGroup, внешних ссылок на них нет (только протухшие комментарии `ReplaceWith`), поэтому они нормализуются: `sd_chipGroupStyleOverlay` начинает ссылаться на собственный overlay целевого компонента, как у остальных ~15 компонентов. Рантайм-эффект нулевой, проверяется скриншотами.

## Capabilities

### New Capabilities

- `universal-view-generator`: `UniversalViewVariationGenerator`, его встраивание в делегаты и `GenerateComponentsTask`, правила проекции `ComponentMeta` на `<style>`/state-list/ThemeOverlay, разрешение состояний, контракт обратной совместимости и его верификация.

### Modified Capabilities

- `view-api-info`: уточняется семантика `api_info`; обобщается `api_state`/`api_state_negated`; добавляются `api_core_name`/`api_def_style_attr`/`api_parent`/`api_res_suffix`/`api_placement`/`api_state_value`; удаляются `api_framework` и `api_package`; вводится требование полноты разметки относительно поведения удаляемых генераторов и правило доразметки по мере необходимости.
- `view-api-meta-generation`: модель `ComponentMeta` расширяется идентичностью, новыми полями свойств, обобщённой моделью состояний и словарём shared-состояний; unit-покрытие парсера расширяется на новый словарь.

## Impact

- **Затрагиваемые модули**: `sdds-core/plugin_theme_builder` (новый генератор, удаление 64 генераторов, делегаты, `GenerateComponentsTask`, сравниватель ресурсов и задача `compareGeneratedTheme`), `sdds-core/uikit` (доразметка `declare-styleable`, перенос 93 framework-биндингов), `build-system/conventions` (модель и парсер меты).
- **Публичный API**: Kotlin/Compose публичный API не меняется. Публичная поверхность генерируемых тем сохраняется по контракту выше. Меняется публичный «контракт данных»: словарь `sdds:` и схема `uikit-api-meta.json` — требуется обновление README по namespace и KDoc модели/задач.
- **Токены**: конфиги токенов не меняются. Сгенерированные ресурсы перегенерируются: миграционный коммит по трём view-темам (`tokens/sdds.serv.view`, `tokens/plasma-stards-view`, `tokens/plasma.sd.service.view` — 1672 закоммиченных файла) должен содержать только перестановки `<item>` плюс согласованную нормализацию `*Chips`.
- **Генерация документации**: не затрагивается.
- **Gradle-конвенции**: `ThemeBuilderPlugin` получает задачу `compareGeneratedTheme` (dev-инструмент, группа `theme-builder`); изменения в `build-system` — модель и парсер меты, инфраструктурные.
- **Валидация**: `./gradlew :build-system:conventions:test`, `:sdds-core:plugin_theme_builder:test`, `:sdds-core:uikit:assemble`, полная перегенерация трёх view-тем по процедуре верификации + `compareGeneratedTheme`, `verifyRoborazziDebug` по трём view-темам (2035 эталонов), сборка view-sandbox'ов, `detektAll`/`spotlessApplyAll`.

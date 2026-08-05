## Context

**Что есть.** Универсальная View-генерация разделена на три ответственности: `UniversalViewVariationGenerator` проецирует мету в XML-операции, `ViewVariationTreeProcessor` обходит дерево и разрешает наследование/stateful-развилки, `ViewStyleResourceWriter` записывает стили, вариации/overlay, `ColorState`, state-list'ы и dimen'ы. Низкоуровневые `ViewColorStateGenerator`, `ColorStateListGenerator`/`NumberStateListGenerator`/`StyleStateListGenerator` остаются специализированными генераторами ресурсов. Весь этот View-специфичный код находится в одном пакете `internal.universal.view`; подпакет `internal.universal.base.view` отсутствует.

**Ключевые факты, установленные при разведке:**
- `UniversalComponentConfig` реализует `Config<UniversalPropertyOwner>` (props как `JsonObject`, `view`-вариации, `merge`) и служит общим входом Compose- и View-процессоров дерева.
- Из 64 генераторов ~50 не делают ничего, кроме перечисления свойств; 9 добавляют кастомные drawable-состояния; 2 (Cell, ListItem) кладут часть атрибутов в ThemeOverlay; Button добавляет производные значения под `loading`; TextField совмещает алиасные ключи (`*ReadOnly`), составное состояние (`focused` ⇒ `!activated`) и обёрточный overlay для чипов.
- Мета есть (`uikit-api-meta.json`, 67 записей / 60 имён), `UikitApiMetaTask` её читает, но в `GenerateComponentsTask` не прокинута.
- Есть закоммиченный корпус сгенерированных ресурсов: 1672 файла в трёх view-темах + 2035 Roborazzi-эталонов + golden-тесты Button в `plugin_theme_builder`.

**Констрейнты.** Композитная Gradle-сборка; разметка живёт в `sdds-core/uikit` и не должна знать о теме; публичная поверхность генерируемых тем не должна меняться (контракт в proposal); compose-fallback-делегаты остаются живыми до отдельного follow-up change.

## Goals / Non-Goals

**Goals:**
- Один универсальный View-генератор, управляемый метой; ноль компонент-специфичных View-генераторов.
- Словарь `sdds:*`, достаточный для воспроизведения текущего вывода, минимальный по числу слов и доменно-нейтральный.
- Доказуемая обратная совместимость: golden-тесты + семантическое сравнение перегенерированных тем + скриншоты.
- Фикстура «полнота разметки», переживающая удаление рукописных генераторов.

**Non-Goals:**
- Удаление compose-fallback-делегатов и рукописных `*ComposeVariationGenerator`/`*Properties` (отдельный change).
- Исправление опечатки `SelectIem` и прочие переименования публичных ресурсов.
- Переработка низкоуровневого формата `ViewColorStateGenerator` и state-list-генераторов.
- Расширение словаря «на будущее»: слова добавляются только под доказанную потребность.

## Decisions

### 1. Генератор использует композицию, симметричную Compose-пути

`UniversalViewVariationGenerator : ComponentStyleGenerator<UniversalComponentConfig>` напрямую реализует общий контракт. `ViewVariationTreeProcessor` получает callbacks эмиссии и отвечает за обход дерева, наследование и стили цветовых состояний. `ViewStyleResourceWriter` инкапсулирует XML DSL, регистрацию ссылок, `ColorState`, dimen и накопители state-list. Такая граница повторяет связку `UniversalComposeVariationGenerator` + `ComposeVariationTreeProcessor` и не сохраняет искусственную legacy-иерархию после удаления её остальных наследников.

`UniversalComposeVariationGenerator` также напрямую реализует общий контракт и не использует прежний `ComposeVariationGenerator`. После удаления компонент-специфичных Compose-генераторов эта база не имеет наследников и удаляется; таблица соответствия стандартных интерактивных состояний остаётся локальной деталью `PropertyMapper`.

```
ComponentMeta                       UniversalComponentConfig (Config<UniversalPropertyOwner>)
 ├ componentNames (join key)         ├ props: JsonObject
 ├ coreName / defStyleAttr / parent  ├ view: {default, accent, …}   → ColorState-вариации
 ├ params[ id, attrName, type,       └ variations[…]                → дерево вариаций
 │         resSuffix, placement,
 │         stateValues ]                       ▼
 ├ stateBindings[ configName → (attr, value) ]
 └ stateSets[ name, states[…] ]      ┌────────────────────────────────────────────┐
                                     │ UniversalViewVariationGenerator            │
                                     │  for (p in params) when (p.type) → emit    │
                                     │  stateAttrs ← StateResolver                │
                                     └───────────────┬────────────────────────────┘
                                                     │ callbacks / operations
                                     ┌───────────────▼────────────────────────────┐
                                     │ ViewVariationTreeProcessor                 │
                                     │  tree + inheritance + color-state styles   │
                                     └───────────────┬────────────────────────────┘
                                                     │
                                     ┌───────────────▼────────────────────────────┐
                                     │ ViewStyleResourceWriter                    │
                                     │  XML + ColorState + dimen + state-list     │
                                     └────────────────────────────────────────────┘
```

`MetaProperty` — адаптер `PropertyMeta` → `ViewProperty`/`ViewColorProperty`: `attribute = attrName`, `fileSuffix = resSuffix`, `provide(owner) = owner.getValue(type, id)`.

**Альтернатива** — скопировать всю legacy-логику внутрь `UniversalViewVariationGenerator`: отклонена, потому что дала бы монолит вместо явных ролей процессора и writer'а.

### 2. Декодирование значения по строковому типу — общий резолвер для обоих стеков

`UniversalPropertyOwner.getValue` сейчас диспетчеризуется по sealed-иерархии `ComposePropertyMeta`. Логика декодирования (`Color`, `Dimension`, `Typography`, `Shape`, `Shadow`, `FloatValue`, `Value`, `Icon`, `ComponentStyle`, `BooleanValue`, `Integer`) выносится в резолвер, ключ которого — строковый семантический тип (общий словарь `ApiType`, уже выровненный между стеками). Compose-путь остаётся, view-путь получает вход по `PropertyMeta.type`.

**Альтернатива** — отдельный декодер для view: отклонена, это была бы вторая копия одних и тех же `decodeFromJsonElement`, расходящаяся при добавлении типов.

### 3. Идентичность компонента — в разметке, per-component

Проверено, что `Sdds.Components.*` (70 стилей) объявлены в самом uikit, а `sd_*Style`/`android:*Style` — атрибуты uikit/фреймворка, поэтому `api_parent`/`api_def_style_attr` не делают разметку зависимой от темы. `styleComponentName` (префикс dimen'ов, имена файлов стилей) по-прежнему приходит из `Component.styleName` темы — так и остаётся.

Разбивка ролей (важно, т.к. три имени часто совпадают, но не всегда):

| Роль | Источник | Пример расхождения |
|---|---|---|
| join key с конфигом/делегатами | `api_info` | `BasicButton`, `IconButton`, `LinkButton` на styleable `Button` |
| сид имён `ColorState`/attrs-файла/styleable темы | `api_core_name` (дефолт = `api_info`) | BasicButton → `Button`; SelectItem → `SelectIem` |
| префикс dimen'ов и имена файлов стилей | `Component.styleName` (тема) | `basic-button` → `basic_button_l_min_height` |

Per-component значения кодируются списком `key=value;`, консистентно с уже существующей грамматикой; при одном компоненте допускается голое значение.

**Альтернатива** — выводить `defStyleAttr`/`parent` по правилу и держать исключения в коде плагина: отклонена, исключений 9+ (`android:buttonStyle`, `android:checkboxStyle`, `android:radioButtonStyle`, `android:progressBarStyle`, `DropdownEmptyState`, `SelectIem`…), и они — знание uikit, а не плагина.

### 4. Модель состояний: плоские привязки + именованные наборы

Предыдущий change ограничил `api_state` enum-driven наборами с ordinal и явно отложил «независимые булевы состояния». Этот change снимает ограничение: базовая единица — **привязка** `configName → (drawableAttr, флейвор, value)`; несколько привязок с одним `configName` образуют составное состояние; `api_state` группирует привязки в именованный набор без семантики порядка (см. решение 10).

Порядок разрешения имени состояния из конфига:

```
1. framework-состояние по имени  → android:state_*        (AndroidState, дополняется `selected`)
2. shared-состояние по имени     → app:sd_state_<name>    (словарь sd_state_* из base_attrs, 17 имён)
3. явная привязка из меты        → attr/value из stateBindings
4. иначе                         → ошибка генерации
```

Шаг 4 — новое поведение: сейчас нераспознанное имя состояния молча теряется (`ValueStateListGenerator.addItem` удаляет элемент с совпадающим набором состояний, и базовая запись перетирает «состояние-призрак»). Словарь shared-состояний для шага 2 кладётся в мету парсером, чтобы резолвер сверялся с реальными атрибутами uikit, а не форматировал строку.

**Альтернатива** — новые слова `api_state_map`/`api_state_excludes`: отклонены аудитом, оба случая (SegmentItem `selected`→`android:state_checked`, TextField `focused`⇒`!activated`) выражаются обобщённым `api_state` + `api_state_negated`.

### 5. `api_state_value` — две формы, потому что случаи действительно разные

- **Алиасный ключ** (`readonly=valueColorReadOnly`): в конфиге есть отдельный ключ; значение попадает в тот же state-list под доп. состоянием. Так устроены TextField (10 атрибутов) и Avatar (`inactiveStatusColor` — база, `activeStatusColor` — под `active`; сегодня это `Color.combine(other, withState)`).
- **Производное значение** (`loading=alpha(loadingAlpha)`): отдельного ключа нет — берётся базовое значение с альфой из другого ключа. Так устроен Button: `color.copy(alpha = loadingAlpha)` для `textColor`/`valueTextColor`/`iconTint` и **не** для `backgroundTint`/`spinnerTint`, поэтому набор участвующих свойств несущий и должен быть объявлен.

Записи алиасных/производных значений эмитятся в state-list **перед** базовыми (в Android выигрывает первое совпадение) — так же, как это делают удаляемые генераторы.

**Альтернатива** — конвенция «ключ + суффикс состояния» без разметки: отклонена, у Avatar именование префиксное (`activeStatusColor`), а у Button отдельного ключа нет вовсе.

### 6. Framework-атрибуты — обычными элементами `<attr name="android:*">`

`api_framework` удаляется: framework-атрибуты уже объявлены внутри тех же styleable, а позиционная грамматика не расширяется под `res_suffix` и `placement` (последнее нужно как раз для трёх framework-биндингов Cell). Правило парсера: `android:*` попадает в мету **только** с `sdds:api_name` — opt-in сохраняется, неразмеченные `android:*` (напр. `android:insetLeft`) по-прежнему игнорируются. Один ключ конфига может быть привязан к нескольким атрибутам (`width` → `android:minWidth` + `android:maxWidth`) — это просто два элемента с одинаковым `api_name` и разными `api_res_suffix`.

Риск сдвига индексов `R.styleable` при добавлении элементов проверен: uikit нигде не итерирует styleable по индексам (`getIndexCount`/`getIndex` не используются), доступ везде символьный.

### 7. Дефолт `api_res_suffix` — от `attrName`

Замер по 398 привязкам, извлечённым из удаляемых генераторов: snake_case от `attrName` без префикса даёт верный суффикс в 310 случаях, от `id` — в 231. Дефолт — от `attrName`, явная разметка — в 88 привязках (61 уникальная пара `attr → suffix`). Один и тот же атрибут может требовать разных суффиксов в разных компонентах (`sd_background` → `bg_color` у Toast/Note/Drawer и `background_color` у Switch), и это разрешается естественно: `api_res_suffix` живёт на `<attr>` внутри styleable конкретного компонента.

### 8. Обратная совместимость проверяется семантически, а не текстуально

Порядок `<item>` внутри `<style>` у рукописных генераторов произвольный (Avatar: dimensions → props → colors), у универсального — порядок объявления в `declare-styleable`. Подгонять разметку под этот порядок значило бы испортить разметку, поэтому:

- сравниватель разбирает оба дерева ресурсов и сравнивает: стили — по имени и **множеству** `<item>`; state-list/selector — по имени и **последовательности** элементов; dimen/color/attrs — по имени и значению;
- каждый расхождение классифицируется как `reorder-only` либо `semantic`;
- гейт раскатки: `semantic == 0`, кроме одного заранее согласованного исключения (нормализация `*Chips`).

Сравниватель — чистый класс в `plugin_theme_builder` (покрыт unit-тестами) плюс Gradle-задача `compareGeneratedTheme`, регистрируемая `ThemeBuilderPlugin` на каждом модуле темы: она знает собственные выходные каталоги модуля и принимает только `--baseline`. Дом выбран по когезии — сравниваются выходы самого theme-builder'а, а задача должна быть доступна там же, где `cleanTheme`/`generateTheme`/`generateComponents`.

### 9. Порядок работ: фикстура снимается до удаления генераторов

Авторитетный источник знания «какой attr ↔ какой ключ конфига ↔ какой суффикс ↔ куда эмитится ↔ какие состояния» — сами удаляемые генераторы. Поэтому первым шагом это знание извлекается в машиночитаемую фикстуру (`(component, configKey, attrName, resSuffix, placement, states)`), которая становится тестом полноты разметки и остаётся после удаления кода.

### 10. `ordinal` в привязках состояний удаляется

Поле было введено как «рантайм-контракт `ColorStateProvider`», но проверка по коду это не подтверждает. Порядок значений генерируемого `XxxColorState` целиком определяется ключами `view`-вариаций конфига, а `ViewColorStateGenerator` эмитит XML-`<enum>` и Kotlin-enum одним проходом по одному списку — они согласованы по построению, пиннить нечего:

```
ключи config.view ──► colorStateAttributes ──┬──► <enum name="state_x" value="i"/>
                                             ├──► enum class XxxColorState { X, … }
                                             └──► getInt(...) → values().getOrNull(ordinal)
```

Для enum-driven состояний компонента (Avatar `Status`) авторитет — значения `<enum>` темизируемого свойства `sd_status` (`none=0`/`active=1`/`inactive=2`), которые мета уже несёт в `params[].values[].value`. Позиционный `ordinal` в наборе (`active=0`, `inactive=1`) не совпадал ни с одним из этих порядков.

Взамен вводится проверка, закрывающая реальный риск: `configName` привязок сверяется с `configName` значений соответствующего enum-свойства. Рассинхрон имён порождает недостижимый элемент state-list, и позиционный ordinal от этого не защищал.

### 11. Приоритет решений при невыразимом случае; покомпонентных исключений нет

Детали поведения конкретного компонента не протекают ни в словарь `sdds:*`, ни в код универсального генератора. При обнаружении случая, не выражаемого словарём, порядок такой:

```
1. вывод избыточен / некорректен / теряет данные, внешних ссылок нет  → нормализуем (diff под ревью + скриншоты)
2. выражается существующими словами                                    → выражаем
3. нужна новая грамматика, параметризованная и покрывающая категорию   → добавляем слово
4. получается покомпонентный флаг                                      → не добавляем, возвращаемся к 1
```

Ветвление по имени компонента внутри движка запрещено так же, как покомпонентное слово в словаре: это та же протечка, просто в другом слое. Случай, не закрываемый пунктами 1–3, эскалируется как решение по объёму change'а.

Кандидаты, найденные при разведке и разрешаемые этим правилом:
- **`adjustment` формы** игнорируется 8 компонентами (Avatar, CheckBox, RadioBox, Counter, SelectItem, ScrollBar, Slider, ProgressBar) — пункт 1: legacy теряет данные, в трёх темах adjustment у этих компонентов отсутствует, универсальное поведение корректнее.
- **Card**: `shapeAttribute("${variation}_content", …)` — собственный префикс имени dimen. Пункт 3, если оформлять как параметризованный поднеймспейс ресурсов свойства, иначе пункт 1 с одним согласованным diff'ом.
- **TextField `asRequirementModeEnum`**: фолбэк `else -> "optional"` для незамапленных значений enum. В сгенерированных темах встречаются только `start`/`end`/`optional`, то есть фолбэк, вероятно, мёртв; при необходимости — пункт 3 (значение по умолчанию у enum-свойства), иначе не воспроизводится вовсе.

### Документация

Обновляются: README по namespace `sdds` в `sdds-core/uikit` (новые слова, удалённые `api_framework`/`api_package`, уточнённая семантика `api_info`/`api_state`), KDoc модели `ComponentMeta` (producer и consumer), KDoc `UniversalViewVariationGenerator` и задачи сравнения ресурсов.

## Verification Procedure

Основной инструмент проверки — **перегенерация реальной темы и сравнение с закоммиченным результатом**. Сгенерированные ресурсы токен-модулей лежат в git (`tokens/sdds.serv.view` — 675 файлов, `plasma-stards-view` — 617, `plasma.sd.service.view` — 380), поэтому эталон брать неоткуда больше и не нужно: он уже в репозитории.

### Предусловие: генерация должна видеть локальный uikit

Токен-модули объявляют `implementation(libs.sdds.uikit)` — опубликованный артефакт. Но `tokens/build.gradle.kts` применяет `convention.core-dependencies`, который подменяет координаты на проект включённой сборки. Проверено:

```
$ ./gradlew -p tokens :sdds.serv.view:dependencyInsight \
      --dependency sdds-uikit --configuration debugCompileClasspath

io.github.salute-developers:sdds-uikit:0.47.0 -> project :sdds-core:uikit
   Selection reasons: Selected by rule: we work with the unreleased development version
                      By composite build
```

Значит `readUikitApiMeta` читает `uikit-api-meta.json` из **локально собранного** `classes.jar`, и правки разметки доезжают до генерации без публикации. Эту проверку следует повторять при смене окружения: если подстановка отвалится, вся процедура будет молча проверять старую мету.

### Полная перегенерация модуля

`generateComponents` только перезаписывает и добавляет файлы, поэтому без очистки **исчезнувшие файлы не видны в diff'е**. `cleanTheme` удаляет оба выходных каталога целиком (`src/main/theme-builder-res` и пакет в `src/main/kotlin`), а восстанавливаются они двумя задачами — токены пишет `generateTheme`, стили компонентов и `style-dimens.xml` пишет `generateComponents`. Поэтому цикл всегда полный:

```
./gradlew -p tokens :sdds.serv.view:cleanTheme \
                    :sdds.serv.view:generateTheme \
                    :sdds.serv.view:generateComponents
```

Требуется сеть для `fetchTheme`/`fetchComponents`, либо прогретый `build/theme-builder/`.

### Эталон — свежая перегенерация со `spotlessApply`

`spotlessApply` — обязательная часть цикла: сгенерированный KotlinPoet'ом код не
отформатирован по правилам репозитория, и без него появляется 26 ложных расхождений
(self-import'ы, `;` после последней enum-константы, иные переносы строк). После
`generateTheme` + `generateComponents` + `spotlessApply` темы `plasma-stards-view` и
`plasma.sd.service.view` перегенерируются **байт-в-байт** — они и служат эталонными
темами гейта.

Эталоном служит **снимок свежей перегенерации на базовом коммите**, а не файлы из git:
снимок и проверяемый прогон делаются на одной машине с одним тулчейном и одними
закэшированными источниками, поэтому любое расхождение между ними атрибутируется
change'у. `git diff` остаётся вторичным сигналом (показывает появление и исчезновение
файлов), но гейтом не является.

### Исключения для `sdds.serv.view`

Эта тема воспроизводится не полностью, и причина — не дрейф, а данные пакета компонентов:
в `components 0.15.0` семь appearance'ов не помечены `excludePlatforms: ["view-system"]`,
хотя во View-теме не нужны — `embedded-icon-button`, `ai-header-embedded-icon-button`
(оба с `componentName = icon-button`) и пять групп (`embedded-icon-button-group`,
`ai-header-embedded-icon-button-group`, `ai-answer-icon-button-group`,
`ai-answer-basic-button-group`, `ai-answer-chip-group`). Корректно размеченные
`text-field-clear`/`text-area-clear` плагин пропускает — механизм работает, разметки
не хватает именно этим семи.

Побочный эффект в текущем коде: `ButtonConfigDelegate` не передаёт `styleComponentName`,
поэтому все три appearance'а `icon-button` пишут в один `styles-iconbutton.xml` и
последний перезаписывает предыдущие — IconButton схлопывается с 265 стилей до 65
(теряются размеры `Xl`/`Xxs` и все `Pilled`). Проверено на чистом базовом коммите:
дефект предсуществующий. Универсальный генератор его снимает по построению — имя стиля
берётся из `Component.styleName` единообразно, как уже делают 25 других делегатов.

Отсюда: подготовительная перегенерация `sdds.serv.view` не выполняется (зафиксировала бы
и потерю IconButton, и пять ненужных файлов), а сама тема проверяется со списком
исключений по этим семи appearance'ам — до тех пор, пока пакет компонентов не проставит
им `excludePlatforms`.

### Порядок проверки

Ниже `<модуль>` — эталонная тема (`plasma-stards-view` либо `plasma.sd.service.view`).

```
0. предусловие      dependencyInsight → подстановка на project :sdds-core:uikit

1. снимок эталона   на базовом коммите (без изменений change'а):
                      ./gradlew -p tokens :<модуль>:cleanTheme
                      ./gradlew -p tokens :<модуль>:generateTheme
                      ./gradlew -p tokens :<модуль>:generateComponents
                      ./gradlew -p tokens :<модуль>:spotlessApply
                    cp -R tokens/<модуль>/src/main/theme-builder-res <scratch>/baseline
                    git checkout -- tokens/<модуль>/src && git clean -fd tokens/<модуль>

2. прогон ветки     на ветке change'а: тот же полный цикл, включая spotlessApply

3. сравнение        ./gradlew -p tokens :<модуль>:compareGeneratedTheme --baseline=<scratch>/baseline
                    git status --porcelain tokens/<модуль>/src   → появившиеся/удалённые файлы
                    git diff <компонент волны>                   → ревью глазами

4. скриншоты        ./gradlew -p tokens :<модуль>:verifyRoborazziDebug

5. вторая тема      то же для второй эталонной темы

6. sdds.serv.view   тот же цикл, но расхождения по семи appearance'ам без
                    excludePlatforms (см. выше) исключаются из гейта

7. откат            git checkout -- tokens/<модуль>/src && git clean -fd tokens/<модуль>
```

`cleanTheme`, `generateTheme` и `generateComponents` запускаются **раздельными вызовами
Gradle**: в одном вызове срабатывает валидация неявной зависимости между
`unpackComponentFiles` и `generateTheme` (обе задачи пишут в
`build/theme-builder/components`), и сборка падает.

Две ловушки `cleanTheme`, обе проверены на практике:

- задача удаляет **весь пакет** в `src/main/kotlin`, а не только сгенерированные файлы.
  У `plasma-stards-view` в том же пакете лежат шесть рукописных исходников
  (`StarConstraintLayout.kt`, `StarLinearLayout.kt`, `StarView.kt`, `Utils.kt`,
  `inflater/*`), и они пропадают. Рабочее дерево обязательно восстанавливается
  `git checkout` + `git clean` после цикла;
- у задачи нет объявленных выходов, поэтому после первого успешного прогона Gradle
  считает её `UP-TO-DATE` и очистка молча не выполняется. Из-за этого перегенерация
  «без изменений» может оказаться иллюзией — сравнивать нужно после фактической очистки
  (проверять по логу, что задача не `UP-TO-DATE`).

Отдельно: закоммиченный вывод содержит **ручные правки** — напр. в
`plasma-stards-view/…/styles-modal.xml` есть комментарий
`<!-- Если перезатрет, sd_overlayStyleOverlay должен быть … -->`, который генератор
произвести не может. Такие места перегенерация затирает, и это ещё одна причина
сравнивать снимок со снимком, а не с git.

Шаг 1 делается один раз в начале волны; шаги 2–3 — после каждой правки разметки;
шаги 4–5 — на границах волн и обязательно перед финальным удалением рукописных генераторов.

### Что каким инструментом ловится

| Класс регрессии | Чем ловится |
|---|---|
| Переименование `@dimen`/`@color`/`@xml`-ресурса | `compareGeneratedTheme` → `semantic` |
| Пропавший или лишний ресурс/стиль | `git status` (untracked/deleted) + `semantic` |
| Изменение значения `<item>` | `semantic` |
| Перестановка `<item>` внутри `<style>` | `reorder-only` — ожидаемо, не гейт |
| Сбитый порядок элементов selector'а | `semantic` (порядок в state-list сравнивается строго) |
| Потерянное состояние (нераспознанное имя) | ошибка генерации (решение 4) + `semantic` |
| Неверный `ColorState`-ordinal или имя класса | `semantic` по `src/main/kotlin` + падение `verifyRoborazziDebug` |
| Визуальная регрессия без изменения имён | `verifyRoborazziDebug` |
| Непокрытая разметкой привязка | тест полноты разметки (фикстура из группы 1 задач) |
| Регрессия на уровне одного компонента | golden-тесты `plugin_theme_builder` |

Три уровня независимы: golden-тесты ловят регрессию до перегенерации темы, сравниватель — на уровне всей темы, скриншоты — на уровне рендера. Ни один не заменяет остальные: сравниватель не увидит визуальной разницы при совпадающих именах, а скриншоты не увидят переименования внутреннего ресурса.

## Risks / Trade-offs

- **Big-bang: 64 компонента переезжают в одном change'е** → Митигация: раскатка волнами внутри change'а с гейтом «semantic == 0» после каждой волны; каждая волна — самостоятельно проверяемый шаг, `main` получает результат одним куском.
- **Знание теряется вместе с удаляемым кодом** → Митигация: фикстура полноты снимается до удаления (решение 9) и проверяется тестом.
- **Ошибка в `api_res_suffix` меняет имена публичных ресурсов темы** → Митигация: сравниватель ловит это как `semantic`-расхождение по именам ресурсов.
- **Ошибка в привязке состояния тихо ломает selector** → Митигация: неизвестное имя состояния становится ошибкой генерации (решение 4), плюс порядок элементов в state-list сравнивается строго.
- **Исправление значений `api_info` меняет уже задеплоенный контракт** → Митигация: потребителей у меты пока нет, ломать нечего; исправление фиксируется тестом join key ↔ ключи `components.json`.
- **Перенос 93 framework-биндингов затрагивает `R.styleable` uikit** → Митигация: проверено отсутствие индексных итераций; `:sdds-core:uikit:assemble` и сборка sandbox'ов в валидации.
- **Проверка молча деградирует, если отвалится подстановка `sdds-uikit` → `project :sdds-core:uikit`**: генерация будет читать мету из опубликованного AAR, и правки разметки просто не доедут, а diff окажется пустым «по хорошей причине» → Митигация: `dependencyInsight` вынесен в шаг 0 процедуры и повторяется при смене окружения.
- **Перегенерация без `cleanTheme` не показывает удалённые файлы** → Митигация: полный цикл `cleanTheme` + `generateTheme` + `generateComponents` зафиксирован в процедуре; появление/исчезновение файлов дополнительно контролируется `git status --porcelain`.
- **Закоммиченный вывод тем устарел относительно текущего кода и удалённых источников** (замерено: 47 файлов расхождения на `sdds.serv.view` без единого изменения генерации) → Митигация: эталон снимается свежей перегенерацией на базовом коммите, а не берётся из git; предсуществующий дрейф выносится за пределы гейта.
- **Trade-off: `api_state_value` вводит мини-грамматику `alpha(...)`** → Принято: грамматика закрытая (две формы), альтернатива — второе слово в словаре под один компонент.

## Migration Plan

1. Снять фикстуру полноты из рукописных генераторов; реализовать сравниватель ресурсов и задачу `compareGeneratedTheme`; выполнить шаги 0–1 процедуры верификации (подстановка uikit + baseline sanity на неизменённом коде).
2. Расширить парсер и модель меты новым словарём; перенести `api_framework` → inline-`<attr>`; удалить `api_package`; исправить значения `api_info`.
3. Реализовать `UniversalViewVariationGenerator` + `MetaProperty` + резолвер значений + резолвер состояний; прокинуть view-мету в `GenerateComponentsTask` и делегаты.
4. Волна 1 — пилот (`Badge`/`IconBadge`: общий styleable, простой набор свойств): golden-тесты + сравниватель.
5. Волна 2 — ~50 «чистых» компонентов.
6. Волна 3 — 9 компонентов с кастомными состояниями.
7. Волна 4 — Cell/ListItem (`placement`), Button (`alpha(...)`), Avatar (алиас + enum-набор), TextField/TextArea (алиасы + составное состояние + нормализация `*Chips`).
8. Удалить 64 рукописных генератора и legacy-переопределения `createViewGenerator`; перегенерировать три темы; прогнать скриншоты.

Каждая волна доразмечает uikit ровно в объёме, который требует гейт совместимости: если дефолтов достаточно — разметка не добавляется.

_Откат:_ до шага 8 откат тривиален (универсальный генератор просто не выбирается для компонента); после шага 8 — реверт коммита.

## Open Questions

Открытых вопросов нет: судьба `ordinal` решена (решение 10), порядок действий при невыразимом случае зафиксирован (решение 11).

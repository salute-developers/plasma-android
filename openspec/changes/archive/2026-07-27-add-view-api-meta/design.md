## Context

Compose-сторона: `@ApiInfo`/`@ApiName`/`@ApiStateSet` (`api-info-compose`) → KSP-процессор (`api-info-ksp`) собирает `List<ComposeComponentMeta>` и пишет `sdds/api/uikit-api-meta.json` в ресурсы `uikit-compose`. Потребитель — `plugin_theme_builder`: `UikitComposeApiMetaTask` вычитывает JSON из classpath, `UniversalComponentConfigDelegate` кормит им универсальный генератор compose-стилей.

View-сторона: универсального генератора нет — `UniversalComponentConfigDelegate.createViewGenerator(...)` возвращает `null`, а стили генерируют ~70 рукописных `*StyleGeneratorView`. Реальная механика генерации View-стилей уже развита: `ViewVariationGenerator` (свойства → `<style>`/`<item>`, ветки invariant vs stateful), `ViewColorStateGenerator` (генерит `XxxColorState`-enum + `XxxColorStateProvider`, читающий `getInt(...)` по **ordinal**), `ColorStateListGenerator`/`ValueStateListGenerator` (селекторы; `AndroidState` резолвится по строковому ключу). Источник истины про View-API — `declare-styleable` в `sdds-core/uikit` (`resourcePrefix = "sd_"`, `namespace = "com.sdds.uikit"`), который сейчас никто не парсит.

Констрейнты: композитная Gradle-сборка (`build-system` включён как build); KSP для XML не подходит (нет Kotlin-символов) → нужна обычная Gradle-задача; `format` атрибута живёт в месте определения, а styleable часто ссылается на attr без `format`.

## Goals / Non-Goals

**Goals:**
- Ввести opt-in разметку `declare-styleable` кастомным namespace `sdds` и Gradle-задачу, генерирующую `uikit-api-meta.json` в ресурсы `uikit`.
- Собственная модель `ComponentMeta` (XML-нативная), покрывающая корнер-кейсы, вытекающие из аналога compose-аннотаций: multi-component, зарезервированные слова, method↔config rename, enum-value rename, наборы кастомных состояний.
- Зеркало `UikitApiMetaTask` в `plugin_theme_builder` для чтения меты.
- Обязательное unit-покрытие парсера.

**Non-Goals:**
- Реализация универсального View-генератора (`createViewGenerator`) — отдельный последующий change.
- Общая нейтральная мета-модель для compose и view — сознательно отвергнута (см. Decisions).
- Изменение compose-механизма, `universal-config-model`, `universal-variation-generator`.
- Массовая разметка всех компонентов — в scope пилотный набор + инфраструктура; полная разметка идёт итеративно.

## Decisions

### 1. Разметка в исходном XML через кастомный namespace, а не комментарии/sidecar
`xmlns:sdds="http://schemas.sdds.ru/android/sdds"` на `<resources>`, атрибуты `sdds:*` на `declare-styleable`/`attr`/`enum`. Эмпирически проверено (aapt2 `compile`+`link`, build-tools 35/36/37): неизвестный namespace молча вырезается, сборка зелёная, в `R.java`/`resources.arsc` не протекает — ведёт себя как `tools:`. Задача парсит **исходный** XML напрямую, до/мимо aapt2, поэтому вырезание на этапе упаковки нерелевантно.
- _Альтернативы_: XML-комментарии (`<!-- @api_info -->`) — ноль риска для aapt, но парсинг муторнее и разметка не привязана к элементу; sidecar-файл — чисто, но легко рассинхронизировать с attr. Namespace выбран как читаемый, привязанный к элементу и (проверено) безопасный.

### 2. Opt-in, а не «парсить всё и отбрасывать префикс»
Только `declare-styleable` с `sdds:api_info` попадают в мету; внутри — авто-strip `sd_` для простых свойств, явные `sdds:api_name`/`api_type` для расхождений. Причина: XML-styleable — грязный union (тем-токены + `android:*` + строки + поведенческие флаги + shared-атрибуты вроде `sd_shapeAppearance`). Белый список чище авто-вывода.

### 3. Своя модель `ComponentMeta`, не переиспользование compose-`ComposeComponentMeta`
Модели раздельные (подтверждено с заказчиком). Compose-`ComposeComponentMeta` завязана на Kotlin (`methodName`, `paramQualifiedType`, `group` от вложенных лямбд); ядро compose-маппера эмитит `"${meta.methodName}(...)"` — вызовы Kotlin-DSL. View-генератор эмитит XML `<item name="sd_...">`, поэтому носитель — `attrName`, а не `methodName`, а `group`/`paramQualifiedType` не нужны.
- **Шов по `id`**: токен-конфиг компонента (`UniversalComponentConfig.props`) target-agnostic и адресуется по `id`. Значит `id` во View-мете ДОЛЖЕН совпадать с каноническим ключом, заданным compose-стороной (`@ApiName`/имя метода). `sdds:api_name` — это швартовка к этому ключу, а не косметика.
- Форма: `ComponentMeta { componentNames; styleableName; packageName; builderFunName; params: [PropertyMeta{ id; attrName; type; values:[(name,value,configName)] }]; stateSets: [StateSet{ name; states:[StateInfo{ configName; ordinal; drawableAttr; flavor; negated }] }] }`.

### 4. Классификация типа: `sdds:api_type` → `format` → keyword-эвристика
`format="enum"` → `value` (+ значения). `format="dimension|color|..."` → прямой маппинг. `format="reference"` неоднозначен (`sd_icon`, `sd_shapeAppearance`, `sd_iconTint` — все reference) → уточняется `sdds:api_type`, иначе keyword-эвристика по имени (как в compose-процессоре: `Shape`/`Color`/`Icon`...).
- **Закрытый список значений `sdds:api_type`** (выровнен с `@SerialName` в compose-`ComposePropertyMeta`, чтобы семантика типов совпадала между стеками): `color`, `dimension`, `typography`, `shape`, `shadow`, `icon`, `component_style`, `boolean`, `integer`, `float`, `value`. `unknown` — внутренний fallback классификатора, в разметке не указывается; значение вне списка — ошибка генерации.
- _Раскладка по `format`_: `dimension→dimension`, `boolean→boolean`, `integer→integer`, `float→float`, `enum→value`, `color→color`; `reference` требует `api_type` для `typography`/`shape`/`shadow`/`icon`/`component_style`/`color` (иначе эвристика по имени).

### 5. Двухпроходный парсинг: сначала глобальный индекс attr→format
Первый проход — собрать `attr name → format` по всем `values/*.xml` (определения). Второй — обойти размеченные styleable, разрешая ссылки без `format` через индекс. Иначе shared-атрибуты (`sd_shapeAppearance` из `base_attrs.xml`, используемый в Button без `format`) классифицируются неверно или теряются.

### 6. Состояния: framework — автоматически, кастомные — размечаются
Прошёлся по генераторам: `AndroidState` (`focused/pressed/hovered/activated/checked`) резолвится по строковому ключу (`asAndroidStates()`) — мета не нужна. Кастомные идут тремя флейворами: `android` (framework), `shared` (`sd_state_loading` из `base_attrs`), `scoped` (генерируемый `sd_<comp>_state_<name>`). Различить shared vs scoped по имени нельзя (коллизия) → флейвор размечается (`sdds:api_state_kind`). **Порядок состояний — рантайм-контракт**: `XxxColorStateProvider` читает `getInt(...)` и делает `values().getOrNull(ordinal)`; порядок итерации JSON-мапы конфига небезопасен, поэтому ordinal пиннится метой.

### 7. Размещение: задача в `build-system/conventions`, потребитель в `plugin_theme_builder`
Парсер и модель `ComponentMeta`, используемые задачей чтения, живут в `plugin_theme_builder` (как compose-`ComposeComponentMeta`); Gradle-задача генерации регистрируется convention-плагином на `uikit`. `UikitApiMetaTask` — почти копия `UikitComposeApiMetaTask` (поиск `uikit-api-meta.json` в ZIP-артефактах classpath). Логика разбора XML выделяется в чистый тестируемый класс (без Gradle-типов во входе), чтобы покрыть unit-тестами.

### Документация
Нужны: KDoc на публичную задачу/модель; README по namespace `sdds` и словарю атрибутов (`api_info`/`api_name`/`api_type`/`api_package`/`api_builder_fun`/`api_state`/`api_state_kind`) в `sdds-core/uikit`; описание схемы `uikit-api-meta.json`.

## Risks / Trade-offs

- **AGP resource merger (стадия перед aapt2) не проверялась напрямую** → Митигация: merger оперирует ресурсными элементами по имени, а не произвольными атрибутами, и лояльнее aapt2 (самая строгая стадия — пройдена чисто); подтверждается первой реальной сборкой `:sdds-core:uikit:assemble`, включённой в валидацию.
- **Рассинхрон `id` между View и compose ломает шов с общим токен-конфигом** → Митигация: авто-strip даёт совпадение в простом случае; для расхождений `sdds:api_name` обязателен; покрыть тестом соответствие ключам.
- **Неверный ordinal состояний ломает рантайм уже собранных приложений** → Митигация: порядок фиксируется метой и тестируется; не полагаться на порядок ключей конфига.
- **Дубль shared-состояния (сгенерить `sd_<comp>_state_loading` вместо переиспользования `sd_state_loading`)** → Митигация: явный `sdds:api_state_kind=shared` + тест.
- **Разметка на namespace может сбивать IDE/lint** → Trade-off: намеренно принят; namespace с URL читается как метаданные, `tools:`-прецедент показывает жизнеспособность.

## Migration Plan

1. Ввести namespace и разметить пилотный компонент (напр. `Button`) — минимальный срез для end-to-end.
2. Реализовать парсер (чистый класс) + Gradle-задачу + упаковку в ресурсы `uikit`.
3. Реализовать `ComponentMeta` + `UikitApiMetaTask` в `plugin_theme_builder`.
4. Покрыть парсер обязательными unit-тестами.
5. Итеративно доразметить остальные компоненты (вне этого change — по мере готовности универсального генератора).
- _Откат_: удаление convention-плагина/задачи и `sdds:*`-разметки безопасно — namespace не влияет на собранные ресурсы, потребитель при отсутствии JSON пишет пустой список.

## Open Questions

- Нужен ли `sdds:api_state_kind=android` явно, или framework-состояния всегда выводятся по ключу и разметка на них запрещена.
- Единая точка правды для `defStyleAttr`/`componentParent` (из top-level `<attr ...Style>` styleable или из конфига темы) — уточнить при проектировании самого View-генератора.

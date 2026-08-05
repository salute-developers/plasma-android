## Why

Для Compose уже существует механизм `@ApiInfo` (`sdds-core/api-info-compose` + `api-info-ksp`), который извлекает API-поверхность компонентов из `StyleBuilder`-интерфейсов и упаковывает её в `sdds/api/uikit-api-meta.json` внутри ресурсов `uikit-compose`. Эту мету потребляет `plugin_theme_builder` и на её основе работает **универсальный** генератор стилей (`UniversalComponentConfigDelegate`), заменяющий рукописные пер-компонентные делегаты.

Для View-системы аналогичного механизма нет: `createViewGenerator(...)` в универсальном делегате возвращает `null`, а стили генерируются ~70 рукописными `*StyleGeneratorView`. Источник истины про API View-компонентов — это `declare-styleable` в `sdds-core/uikit`, но его сейчас никто не парсит. Без машинно-читаемой меты про XML-API универсальный View-генератор построить нельзя. Этот change добавляет недостающее звено — агрегацию API View-компонентов в `uikit-api-meta.json`.

## What Changes

- В `sdds-core/uikit` вводится кастомный XML-namespace `xmlns:sdds="http://schemas.sdds.ru/android/sdds"` для opt-in разметки `declare-styleable`. Эмпирически проверено (aapt2 `compile`+`link`, build-tools 35/36/37): неизвестный namespace молча вырезается, сборку не ломает и в `R`/`resources.arsc` не протекает.
- Размечаются `declare-styleable` и `attr` атрибутами из namespace `sdds`:
  - на `<declare-styleable>`: `sdds:api_info` (имя/список компонентов), `sdds:api_package` (обход зарезервированных слов, напр. `switch`→`switcher`), `sdds:api_builder_fun` (имя генерируемой фабрики при нескольких вариантах одного стиля);
  - на `<attr>`: `sdds:api_name` (шов с ключом токен-конфига, когда `attr − resourcePrefix` ≠ ключ), `sdds:api_type` (дизамбигуация неоднозначного `format="reference"`), `sdds:api_state`/`sdds:api_state_kind` (привязка кастомного состояния к набору и его флейвору);
  - на `<enum>`: `sdds:api_name` (переименование значения enum в ключ конфига).
- Простые случаи разрешаются автоматически отбрасыванием `resourcePrefix` (`sd_`); явная разметка — только для расхождений и сложных случаев (opt-in).
- В `build-system/conventions` добавляется Gradle-задача (в отдельном convention-плагине), которая:
  - строит глобальный индекс `attr → format` по всем `values/*.xml` модуля (нужно, т.к. `format` живёт в месте определения attr, а styleable ссылается на него без `format`);
  - парсит размеченные `declare-styleable`, классифицирует свойства (по `format` + `sdds:api_type` + keyword-эвристике, как в compose), собирает наборы кастомных состояний;
  - сериализует результат в `sdds/api/uikit-api-meta.json` и упаковывает его в ресурсы `uikit` (аналогично тому, как KSP кладёт compose-мету в `uikit-compose`).
- В `plugin_theme_builder` добавляется зеркало `UikitComposeApiMetaTask` — `UikitApiMetaTask`, вычитывающее `uikit-api-meta.json` из classpath, и собственная (не общая с compose) `@Serializable`-модель `ComponentMeta`.
- **Обязательное покрытие тестами парсера/задачи**: логика разбора XML и сборки меты выносится в тестируемый класс(ы) и покрывается unit-тестами (`build-system/conventions/src/test`), обязательными как часть этого change. Тесты фиксируют корнер-кейсы, вытекающие из аналога compose-аннотаций и специфики View: авто-strip `sd_`, `sdds:api_name`/`api_type`/`api_package`/`api_builder_fun`, список компонентов в `sdds:api_info`, переименование `<enum>`, cross-file резолв `format` через глобальный индекс, отбрасывание `android:*` и неразмеченных attr, а также сборку наборов кастомных состояний с корректным флейвором и стабильным порядком (ordinal).

Не входит в scope этого change: реализация самого универсального View-генератора (`createViewGenerator`). Здесь готовится только мета-контракт, который тот генератор будет потреблять.

## Capabilities

### New Capabilities
- `view-api-info`: разметка `declare-styleable` в `sdds-core/uikit` кастомным namespace `sdds` и правила её интерпретации (авто-strip prefix, opt-in-переопределения, классификация типов, наборы состояний).
- `view-api-meta-generation`: Gradle-задача в `build-system`, генерирующая `uikit-api-meta.json` из размеченных `declare-styleable` и упаковывающая его в ресурсы `uikit`; модель `ComponentMeta`, задача чтения меты в `plugin_theme_builder` и обязательное unit-тестовое покрытие парсера.

### Modified Capabilities
<!-- Требования существующих спеков не меняются: compose-механизм, универсальный конфиг и генератор вариаций остаются как есть; данный change только добавляет параллельный View-контракт. -->

## Impact

- **Затрагиваемые модули**: `sdds-core/uikit` (разметка ресурсов + новый упакованный JSON-артефакт), `build-system/conventions` (новый convention-плагин + Gradle-задача + unit-тесты, инфраструктурное изменение), `sdds-core/plugin_theme_builder` (`UikitApiMetaTask` + модель `ComponentMeta`).
- **Публичный API**: Kotlin/Compose публичный API не меняется. Добавляется новый публичный «контракт данных» — схема `uikit-api-meta.json` и словарь разметки `sdds:` (нужны KDoc/README по namespace и его атрибутам).
- **Токены**: напрямую не затрагиваются; мета лишь описывает, как токен-конфиг проецируется на XML-атрибуты. Шов идёт по `id`/`sdds:api_name`, который ДОЛЖЕН совпадать с каноническими ключами конфига, уже заданными compose-стороной.
- **Генерация документации**: не затрагивается.
- **Gradle-конвенции**: добавляется новая задача; т.к. изменение в `build-system` инфраструктурное, требуется прогон затронутых сборок.
- **Валидация**: обязательные unit-тесты парсера (`:build-system:conventions:test`); `:sdds-core:uikit:assemble` (проверка, что aapt2 не падает на размеченных ресурсах и JSON попадает в AAR); `:sdds-core:plugin_theme_builder:test`; плюс `detektAll`/`spotlessApplyAll` для нового кода в `build-system`.

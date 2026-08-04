## Why

Генерация темы и компонентов находится в публикуемом `plugin_theme_builder`, а сбор документации и генерация адаптеров песочницы реализованы внутренними convention-плагинами `build-system`. Из-за этого единый процесс DS Builder распределён между разными Gradle API, строковыми properties и репозиторными соглашениями, хотя все возможности используют одни и те же артефакты `.sdds`.

## What Changes

- **BREAKING**: заменить публичный extension `themeBuilder {}` на единый `dsBuilder {}` и переименовать implementation плагина без compatibility-слоя.
- Разделить возможности `dsBuilder` на независимые области `theme`, `components`, `documentation` и `sandbox`, не выполняя масштабного переноса существующих theme/component классов и пакетов.
- Перенести сбор платформенных фрагментов документации и связанных Gradle tasks из documentation convention-плагинов в подпакет `documentation` модуля `sdds-core/plugin_theme_builder`.
- Перенести генерацию Compose/View адаптеров из integration convention-плагинов в подпакет `sandbox` модуля `sdds-core/plugin_theme_builder`.
- Заменить `integration.*` и `theme-alias` Gradle properties типизированным sandbox DSL.
- Использовать `.sdds` как источник стандартных `config.json`, `config-info-*` и `theme-info-*`; разрешать явные пути только как overrides.
- Автоматически выводить пакет генерируемого sandbox-кода и `themeAlias`, сохраняя возможность явного переопределения.
- Удалить специализированные documentation/integration convention-плагины после миграции потребляющих модулей `tokens`.
- Не переносить в агрегатор portal-specific Docusaurus build, npm, changelog, S3 deployment и публикацию.

## Capabilities

### New Capabilities

- `ds-builder-gradle-dsl`: единый типизированный `dsBuilder` DSL, общая резолюция директории `.sdds` и активация независимых возможностей плагина.
- `android-documentation-aggregation`: сбор Kotlin/XML snippets и платформенных info-артефактов в результат, пригодный для дальнейшей упаковки DS Builder CLI.
- `sandbox-adapter-generation`: генерация Compose и View адаптеров дизайн-системы для sandbox/demo infrastructure из `.sdds` metadata.

### Modified Capabilities

- `theme-builder-dsbuilder-source`: fallback источников темы должен работать через новый `dsBuilder` API и общую резолюцию `.sdds`, сохраняя модель нескольких tenant-вариаций одной темы.

## Impact

- `sdds-core/plugin_theme_builder`: новый публичный Gradle DSL, новые подпакеты `documentation` и `sandbox`, перенос task types, моделей и templates.
- `build-system/conventions`: удаление documentation/integration conventions и перенос принадлежащей им логики; базовые Android, Compose, testing и Docusaurus conventions остаются отдельными.
- `tokens`: миграция theme, documentation и integration-модулей на новый plugin id/DSL; физические имена `integration`-модулей на этом этапе могут сохраниться.
- Публичный Gradle API меняется несовместимо, но внешняя совместимость не требуется, поскольку плагин используется только командой разработки.
- Изменение затрагивает генерацию документации и sandbox-кода, поэтому требует focused validation для плагина и пилотных Compose/View модулей, а затем проверки всех затронутых модулей `tokens`.

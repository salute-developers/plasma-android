## Why

`sdds-core/plugin_theme_builder` сейчас требует явно заданный `themeSource`/`themeSources` и всегда подготавливает темы через скачивание zip-архива. Для модулей, где DSBuilder уже выгрузил полный набор theme data в локальную директорию `.sdds/`, это создает лишнюю сетевую зависимость и дублирует источник истины.

## What Changes

- Добавить fallback-источник тем из `.sdds/config.json`, который используется только если в `themeBuilder` extension не заданы `themeSource` или `themeSources`.
- Читать массив `tenants` из `.sdds/config.json` и строить из него локальные источники темы.
- Для каждого tenant использовать `tenant.alias`, если он задан, иначе `tenant.name`.
- Первый tenant из `.sdds/config.json` передавать в `GenerateThemeTask` как текущий `Tenant.Default` с пустым tenant suffix, сохраняя существующую семантику генераторов.
- Остальные tenants передавать в `GenerateThemeTask` с tenant suffix, равным `alias ?: name`.
- Использовать файлы токенов напрямую из tenant-директорий `.sdds/`, не скачивая и не распаковывая theme zip-архивы для локальных источников.
- Не менять работу `GenerateThemeTask` и существующих генераторов токенов, атрибутов и тем.
- Не менять текущий DSL и поведение явно заданных remote/url `themeSource`/`themeSources`.

## Capabilities

### New Capabilities
- `theme-builder-dsbuilder-source`: поддержка локального DSBuilder `.sdds/config.json` как fallback-источника тем для `sdds-core/plugin_theme_builder`.

### Modified Capabilities
- Нет.

## Impact

- Затрагивает included build `sdds-core`, модуль `sdds-core/plugin_theme_builder`.
- Затрагивает Gradle plugin behavior: добавляется новый fallback input source для подготовки генерации.
- Публичный DSL `themeBuilder` не меняется.
- Существующие генераторы токенов и тем не меняются.
- Токены как формат данных не меняются; локальные `.sdds` tenant-директории должны содержать тот же набор файлов, который генератор ожидает после unzip: `meta.json` и `android/android_*.json`.
- Валидация должна покрыть старый remote/url flow и новый локальный `.sdds` flow на уровне регистрации задач и input file resolution.

## 1. sdds-core/plugin_theme_builder — модель источников

- [x] 1.1 Добавить локальный вариант `ThemeBuilderSource` для tenant-директории `.sdds`.
- [x] 1.2 Добавить способ получить theme sources из extension без немедленного исключения, чтобы plugin мог применить fallback.
- [x] 1.3 Добавить DTO для чтения `.sdds/config.json` с полями `tenants`, `name`, `alias`, `directoryPath`.
- [x] 1.4 Реализовать resolver/reader, который читает `.sdds/config.json`, валидирует tenants и строит `ThemeBuilderSources`.

## 2. sdds-core/plugin_theme_builder — подготовка файлов генерации

- [x] 2.1 Обновить `ThemeBuilderPlugin`, чтобы explicit `themeSource`/`themeSources` имели приоритет над `.sdds/config.json`.
- [x] 2.2 Для локальных `.sdds` sources передавать первый tenant в `GenerateThemeTask` с пустым tenant suffix.
- [x] 2.3 Для остальных локальных tenants передавать suffix `alias ?: name`.
- [x] 2.4 Для локальных `.sdds` sources читать `meta.json` и `android/android_*.json` напрямую из tenant-директорий.
- [x] 2.5 Не регистрировать `fetchTheme*` и `unpackThemeFiles*` tasks для локальных `.sdds` sources.
- [x] 2.6 Сохранить существующий remote/url flow для `NameAndVersion` и `Url` sources.
- [x] 2.7 Добавить понятные ошибки для отсутствующего `.sdds/config.json`, пустого `tenants` и отсутствующих required files.

## 3. sdds-core/plugin_theme_builder — тесты

- [x] 3.1 Покрыть resolver тестами для `alias ?: name`, `directoryPath` и fallback `.sdds/<tenant.name>`.
- [x] 3.2 Покрыть mapping tenants: первый tenant -> `""`, остальные -> `alias ?: name`.
- [x] 3.3 Покрыть приоритет explicit extension sources над `.sdds/config.json`.
- [x] 3.4 Покрыть сценарий локального source без регистрации theme zip fetch/unzip tasks.
- [x] 3.5 Покрыть ошибки для missing config, empty tenants и missing required files.

## 4. Документация

- [x] 4.1 Обновить `sdds-core/plugin_theme_builder/README.MD` описанием fallback из `.sdds/config.json`.
- [x] 4.2 Задокументировать, что первый tenant из `.sdds/config.json` используется как внутренняя база `Tenant.Default`.
- [x] 4.3 Задокументировать, что локальный `.sdds` source не отменяет необходимость palette source.

## 5. Валидация

- [x] 5.1 Запустить `./gradlew :sdds-core:plugin_theme_builder:test`.
- [x] 5.2 Запустить `./gradlew :sdds-core:plugin_theme_builder:detekt`.
- [x] 5.3 Запустить `./gradlew :sdds-core:plugin_theme_builder:spotlessApply`.
- [x] 5.4 Проверить генерацию на модуле с `.sdds/config.json`, например `./gradlew :tokens:sdds-sbcom-compose:generateTheme`.

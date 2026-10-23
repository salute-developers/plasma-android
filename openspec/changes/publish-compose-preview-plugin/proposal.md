## Why

Compose preview plugin собирается в `preview-compose-plugin.zip` (`previewPluginArtifact`), но нигде не публикуется: web-клиент Design System Builder (DSB) получает его только через локальный `serve-compose-plugin.mjs`. README плагина прямо называет publication pipeline нереализованным.

Публиковать плагин в S3 прямо из `plasma-android` неправильно: у репозитория не должно быть ключей записи в хранилище DSB, а версии, совместимость с метой компонентов и очистку должен знать тот, кто владеет данными, то есть бэкенд DSB. Поэтому CI передаёт собранный архив на бэкенд DSB командой CLI `dsbuilder`, а бэкенд сам кладёт файлы в S3, импортирует мету и ведёт версии в своей БД (парный change в design-system-builder `host-compose-preview-plugin`).

## What Changes

- Manifest `preview-plugin.json` получает идентификацию билда: `version` (первые 12 символов sha коммита), `uikitComposeVersion` (из `gradle.properties` проекта `sdds-core:uikit-compose`), `apiMetaSha256`, `commit`.
- В артефакт добавляется `api-meta.json` — тот же файл, из которого генерируются фабрики стилей плагина; бэкенд DSB импортирует из него мету.
- Новый workflow публикации: по push в `develop` (с фильтром путей, когда включена переменная `DSB_PUBLISH_DEV_ENABLED`) отправляет билд на dev-бэкенд DSB, по релизному тегу (запускается из `publish-release`, когда включена переменная `DSB_PUBLISH_PROM_ENABLED`) — на prom-бэкенд. Шаги: сборка, `jvmTest`, `previewPluginBrowserTest`, проверка контракта, установка CLI `dsbuilder`, пробная отправка (dry run), отправка.
- Авторизация CI в DSB — служебная учётка с узкой ролью «публикация Compose preview»; её идентификатор и секрет хранятся в секретах репозитория отдельно для каждого окружения.
- Публикации в одно окружение выполняются последовательно; повторный запуск для того же коммита безопасен (бэкенд идемпотентен).
- README плагина описывает manifest, состав артефакта, схему публикации и локальную проверку.

Не входит: хранение файлов в S3, индекс версий, чистка билдов, выбор билда клиентом, импорт меты в БД, выдача и настройка служебной учётки (всё это в change `host-compose-preview-plugin` в design-system-builder); trust policy и подпись артефакта; публикация с feature-веток (проверяется локальным zip и прямым адресом плагина в клиенте).

## Capabilities

### New Capabilities
- `compose-preview-publication`: публикация Compose preview plugin из CI на бэкенд DSB командой CLI: триггеры и окружения, гейты качества, секреты, последовательность, идемпотентность, документация.

### Modified Capabilities
- `compose-preview-browser-bridge`: manifest production artifact идентифицирует билд и привязан к api-мете; артефакт содержит `api-meta.json`.

## Impact

- `integration-core/preview-compose-plugin`: `build.gradle.kts` (генерация manifest, копирование меты в артефакт), шаблон manifest, README. Gradle-задач публикации, S3 и расширения `S3UploadTask` нет.
- `.github/workflows`: новый workflow публикации, правка `publish-release.yml`; секреты `DSB_*` для dev и prom (адрес API, идентификатор и секрет служебной учётки).
- `build-system` не затрагивается. Публичный API библиотек, токены и документация не затрагиваются.
- Зависимость: CLI `dsbuilder` с командой `preview-plugin publish` и бэкенд из change `host-compose-preview-plugin`; в CI нужен способ запустить CLI (JVM-дистрибутив или архив релиза).
- Валидация: `:preview-compose-plugin:jvmTest`, `previewPluginArtifact`, `previewPluginBrowserTest`, `check-preview-contract` в режиме `error` на релизном теге, пробная отправка (dry run) на каждом запуске workflow.

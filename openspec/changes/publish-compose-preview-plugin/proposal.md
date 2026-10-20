## Why

Compose preview plugin собирается в zip (`previewPluginArtifact`), но нигде не публикуется: web-клиент Design System Builder (DSB) получает его только через локальный `serve-compose-plugin.mjs`. README плагина прямо называет publication pipeline нереализованным. Чтобы клиент мог загружать актуальную и совместимую версию превью, плагин нужно выкладывать в S3 по контролируемой схеме: неизменяемые билды, атомарное переключение версии и достаточно метаданных, чтобы клиент выбрал билд, согласованный с API-метой компонентов, импортированной в БД DSB.

## What Changes

- Manifest `preview-plugin.json` получает идентификацию билда: `version` (id билда), `uikitComposeVersion` (из `gradle.properties` проекта `sdds-core:uikit-compose`), `apiMetaSha256` и `commit`.
- В артефакт билда добавляется `api-meta.json` — тот же файл, из которого генерируются фабрики стилей плагина (ресурс `sdds/api/uikit-compose-api-meta.json` локального проекта `uikit-compose`).
- Новая Gradle-задача публикации на базе `S3UploadTask` из `build-system/conventions`: заливает неизменяемый билд в `compose-preview/builds/<build-id>/`, затем обновляет индекс канала. Порядок «билд, затем индекс» обеспечивает атомарное переключение.
- Индекс канала `compose-preview/protocol-<N>/<channel>/index.json` перечисляет версии `uikit-compose` и соответствующие билды; клиент использует его для выбора билда и отката на меньшую версию.
- Новые workflows: публикация в канал `dev` по push в `develop` и в канал `current` по релизному тегу (запускается из `publish-release` безусловно, а не по списку изменённых модулей, поскольку модуль в `.ignore-changed-modules`).
- Заголовки объектов в S3 задаются явно: `Content-Type: application/wasm`, `Cache-Control` (`no-cache` для индекса и manifest, `immutable` для билдов).
- Политика хранения билдов: lifecycle-правило бакета или очистка при публикации (см. design.md).
- Сборка использует локальные исходники `uikit-compose` (подмена в `convention.core-dependencies`), поэтому версия в manifest — метка, а точную привязку к мете обеспечивает sha256.

Не входит: импорт меты в БД DSB, хранение версии меты на бэкенде, выбор билда на клиенте (отдельный change в репозитории design-system-builder); trust policy и подпись артефакта; публикация с feature-веток (проверяется локальным zip).

## Capabilities

### New Capabilities
- `compose-preview-publication`: раскладка билдов и индексов в S3, правила публикации (порядок, каналы, concurrency, заголовки, хранение), триггеры workflows.

### Modified Capabilities
- `compose-preview-browser-bridge`: manifest production artifact дополнительно описывает идентификацию билда и привязку к api-мете; артефакт содержит `api-meta.json`.

## Impact

- `integration-core/preview-compose-plugin`: `build.gradle.kts` (генерация manifest, копирование меты, задача публикации), шаблон manifest, README.
- `build-system/conventions`: возможные расширения `S3UploadTask` (заголовки, content-type); затрагивает все included builds, нужна аккуратная проверка существующих `docusaurusDeploy`/`dokkaDeploy`.
- `.github/workflows`: два новых workflow, правка `publish-release.yml`; секреты записи в бакет DSB (отдельные от docs-бакета `S3_*`).
- Публичный API библиотек и токены не затрагиваются; документация генерируется без изменений.
- Валидация: `:preview-compose-plugin:jvmTest`, `previewPluginArtifact`, `previewPluginBrowserTest`, проверка Gradle-задачи публикации против тестового префикса/бакета, `check-preview-contract` в режиме `error` на релизных ветках.
- Принятое ограничение: плагин размещается в том же бакете, что и клиент DSB, поэтому их origin совпадает, и плагин в `allow-same-origin` iframe теоретически может читать токены клиента. Риск принят, пока плагин публикует только команда SDDS; разделение origin вынесено в отдельное будущее изменение. Выкладка клиента с `--delete-removed` не должна задевать файлы плагина, а ключ записи плагина — файлы клиента: префиксы раздельны.

## 1. Manifest и артефакт

- [x] 1.1 Добавить в `preview-plugin.template.json` и `generatePreviewManifest` поля `commit`, `version` (12 символов), `uikitComposeVersion` (из `sdds-core/uikit-compose/gradle.properties`), `apiMetaSha256`
- [x] 1.2 Копировать `api-meta.json` (тот же ресурс, что у `previewApiMeta`/`extractApiMetaForBrowserTest`) в `previewPluginArtifact` и считать его sha256
- [x] 1.3 Расширить `previewPluginBrowserTest`/JVM-тесты проверками полей manifest, состава zip (`api-meta.json`, manifest, wasm) и совпадения sha256 с `api-meta.json`
- [x] 1.4 Обновить README плагина: поля manifest, состав артефакта, схема публикации через бэкенд DSB, локальная проверка (сборка zip, локальный контур DSB, отправка CLI)

## 2. Workflow публикации

- [x] 2.1 Создать workflow публикации: триггеры `push` в `develop` с фильтром путей, `workflow_call`/`workflow_dispatch` с окружением и тегом; `concurrency` по окружению без отмены
- [x] 2.2 Шаги сборки и гейтов: окружение (JDK 17, Node), `previewPluginArtifact`, `jvmTest`, `previewPluginBrowserTest` с `-PpreviewChromePath=$(which google-chrome)`
- [x] 2.3 Установка CLI `dsbuilder` на `ubuntu-latest`: скачать закреплённую версию JVM-дистрибутива из GitHub Release DSB (тег `cli-vX.Y.Z`), при закрытом репозитории использовать секрет с токеном чтения; запускать CLI с Java 17
- [x] 2.4 Шаги отправки: пробная отправка без `--apply`, затем отправка с `--apply`; учётные данные из секретов через переменные окружения процесса, не в аргументах и не в логе
- [x] 2.5 Обработка результата: «без изменений» считается успехом, конфликт и ошибки валидации показываются в сообщении шага
- [x] 2.6 Добавить безусловный вызов workflow в `publish-release.yml` для релизного тега (окружение prom) и включить `check-preview-contract` в режиме `error` как гейт
- [ ] 2.7 Завести секреты `DSB_API_URL_*`, `DSB_CLIENT_ID_*`, `DSB_CLIENT_SECRET_*` для dev и prom (после выдачи учёток на стороне DSB); до выкладки бэкенда держать публикацию выключенной переменными `DSB_PUBLISH_DEV_ENABLED` (push в `develop`) и `DSB_PUBLISH_PROM_ENABLED`

## 3. Проверка и завершение

- [x] 3.1 Прогнать `./gradlew -p integration-core :preview-compose-plugin:jvmTest :preview-compose-plugin:previewPluginArtifact :preview-compose-plugin:previewPluginBrowserTest`
- [x] 3.2 Прогнать `detektAll` и `spotlessApplyAll` для затронутых модулей
- [ ] 3.3 Пробный прогон `workflow_dispatch` на ветке с пробной отправкой против dev-бэкенда; прогон с намеренно упавшим тестом подтверждает, что отправка не выполняется; проверить фильтр путей и вызов из `publish-release`
- [x] 3.4 Сквозная проверка с локальным контуром DSB: отправить zip командой CLI и увидеть плагин в клиенте
- [ ] 3.5 Первая публикация на dev с `--apply`; проверить повторный запуск того же коммита (без изменений)
- [ ] 3.6 Согласовать с командой DSB имена секретов, адреса бэкендов и формат поставки CLI; зафиксировать значения в README

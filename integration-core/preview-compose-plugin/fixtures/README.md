# Изолированные Compose Core A/B/B2

Рецепт не меняет рабочую ветку и ничего не отправляет в общие окружения.
A использует дерево `sdds-core` подтверждённого тега `release-11-11-2026`
(UIKit 0.56.0), поверх которого копируется текущий producer preview.
B убирает только `@ApiDeprecated("Use cursorColor")`, сохраняя Kotlin API,
и добавляет отдельные builder/Story `CoreChannelProbe` на основе BasicButton.
B2 меняет подпись в реальном renderer истории, сохраняя точные байты Core/меты B.

```bash
python3 integration-core/preview-compose-plugin/fixtures/prepare.py \
  --output /tmp/core-fixtures --record-fixture-commits
```

Без `--record-fixture-commits` рецепт только готовит исходники. С флагом создаёт
коммиты **только в новых временных репозиториях**, для
переносимой проверки происхождения A/B/B2; обычная сборка этого не требует. Product-ветки не коммитятся. Выходной каталог
должен отсутствовать. Тег не подменяется: его объект загружается из исходного
репозитория. `sources.json` содержит base ref, commits, Core trees и хеши overlay,
source tar, patches и bundles. Восстановление: `git clone A.bundle A-restored`
(соответственно B/B2), затем сверить HEAD и дерево Core с receipt.

В каждом fixture checkout:

```bash
# A
./gradlew -p integration-core :preview-compose-plugin:jvmTest \
  :preview-compose-plugin:previewPluginArtifact \
  :preview-compose-plugin:verifyPreviewPluginArtifact \
  :preview-compose-plugin:previewPluginBrowserTest \
  -PcoreVersion=0.56.0
# B и B2: одни и те же Core coordinates, разные настоящие build commit.
./gradlew -p integration-core :preview-compose-plugin:jvmTest \
  :preview-compose-plugin:previewPluginArtifact \
  :preview-compose-plugin:verifyPreviewPluginArtifact \
  :preview-compose-plugin:previewPluginBrowserTest \
  -PcoreVersion=0.56.0-ab.b.fixture
```

При необходимости передать `-PpreviewChromePath=<Chrome binary>`.
Повторить artifact build с теми же параметрами, сверить SHA-256 ZIP до/после.
Затем из product checkout:

```bash
python3 integration-core/preview-compose-plugin/fixtures/receipt.py /tmp/core-fixtures
```

Проверка сверяет manifest, bytes/hash меты и JVM-ресурс, настоящий Wasm,
единственный новый компонент, изменения только TextField/TextArea и идентичность
меты B/B2. Бинарники, журналы и receipt остаются вне Git.

## Проверка в DS Builder

Использовать изолированный PostgreSQL/S3/gateway и CLI из ветки
`feature/core-releases` DS Builder (HEAD спецификаций `3754be9f77e3ae7c9e7ecd0a338b1831fe7990ea`; реализация проверяется из рабочего дерева без коммита). Совместимого опубликованного CLI пока нет:
автоотправка workflow выключена до задания `DSB_CORE_RELEASE_CLI_VERSION`.
Не подставлять старый CLI. Зафиксировать точные refs/CLI version в evidence.

1. Dry-run ZIP A, затем apply. Создать две обычные ДС, явно выбрать Compose
   stable/0.56.0 в обеих. Добавить назначения `cursorColorReadOnly` с вариациями,
   сочетаниями и состояниями; `cursorColor` оставить свободным. Опубликовать A
   с непустым предметным журналом, сохранить export/model/preview SHA и IDs.
2. Импортировать **мету B отдельно**, channel dev и точные coordinates/hash,
   без ZIP B. Проверить отсутствие смены выбора обеих ДС. Явно выбрать B только
   для Compose первой ДС через core-settings с её draftId/selectionRevision.
   Вторая ДС, остальные платформы и история A сохраняются. CoreChannelProbe
   доступен только выбранному B. Новые export/fetch/publish блокирует конфликт,
   редактор доступен без preview B; локальный снимок A продолжает генерироваться
   с недоступным сервером и локальным Core B, с последующей сборкой/тестами кода.
3. На независимых копиях настроек пройти удаление старого назначения и перенос
   в свободное `cursorColor`, сверить состояние/значение/область, журнал и откат.
   Параллельная смена Core даёт CORE_SELECTION_STALE. После исправления явно
   опубликовать B **до ZIP B**. Отдельно сменить Core без предметных изменений:
   пустой журнал по-прежнему блокирует publish. Следующий draft наследует выбор.
4. Отправить ZIP B, затем B2. Ожидающий published preview заполняется B один раз,
   B2 выбирается только для draft. A и B защищены от очистки, незакреплённый
   контрольный build реально удаляется. Повторный A не переключает ни одну ДС.
   Импорт нового stable добавляет лишь доступный вариант.

IDs и токены берутся из текущего контура и не фиксируются в рецепте. Evidence
содержит команды без секретов, HTTP-коды, IDs/counts/revisions, длительности,
хеши и реальные browser-результаты. Невыполненные проверки не считаются успехом.

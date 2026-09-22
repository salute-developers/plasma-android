## Context

`build-system/docs-template/` — источник шаблонов, из которых `docusaurusGenerate` (`build-system/conventions/src/main/kotlin/convention.docusaurus.gradle.kts`) собирает Docusaurus-сайт для каждой публикуемой библиотеки (`tokens/*/docs`): копирует `common-template/` + (`compose-template/` или `xml-template/`, по `isComposeLib()`) + `override-docs/`. `common-template/docs/` сегодня содержит только `CHANGELOG.md`; навигация задаётся `common-template/sidebars.ts`.

`compose-template/` и `xml-template/` отдельно несут `structure.json` — явный whitelist markdown-страниц для docs JAR (`convention.core-fixtures`, capability `core-documentation-templates`), который параллельно читает DS Builder CLI (`DOCS_AGGREGATE` toolchain, см. `openspec/specs/android-documentation-aggregation` и соседний `design-system-builder`/`openspec/specs/platform-android-delegate`). `common-template` этого JAR-механизма не касается: она копируется в сгенерированный сайт напрямую Gradle-таском, без прохождения через docs JAR / `structure.json`.

**Уточнено во время реализации** (подтверждено прогоном `docusaurusGenerate`): `compose-template/` и `xml-template/` также несут собственные корневые `sidebars.ts`, дублирующие путь `common-template/sidebars.ts`. `docusaurusGenerate` копирует `common-template`, а затем поверх — `compose-template` или `xml-template` с `DuplicatesStrategy.INCLUDE`, поэтому для обоих существующих типов библиотек в сгенерированном сайте побеждает платформенный `sidebars.ts`, а `common-template/sidebars.ts` для них сегодня не эффективен (остаётся потенциальным fallback только для гипотетического будущего типа шаблона без своего `sidebars.ts`). Навигационная правка сделана во всех трёх файлах.

Соседний репозиторий `design-system-builder` уже реализовал MCP-сервер (`dsbuilder-mcp` npm-пакет и встроенная команда `dsbuilder mcp serve`) и CLI `dsbuilder` (macOS release-архив) с read-only tools для документации, токенов и компонентов (см. `frontend-kt/mcp-node/README.md`, `frontend-kt/cli/USAGE.md`, ADR-0004). Ни то, ни другое пока не упоминается в документации plasma-android — потребитель дизайн-системы, читающий сгенерированный Docusaurus-сайт, не узнаёт об этой возможности.

## Goals / Non-Goals

**Goals:**
- Дать внешнему потребителю дизайн-системы (разработчик приложения на `sdds-uikit`/`sdds-uikit-compose`) две независимо читаемые страницы: как подключить AI-агента через MCP и как установить/использовать CLI `dsbuilder` в consumer-сценарии.
- Встроить обе страницы в существующую навигацию (`sidebars.ts`, `quick_start.md`) так же, как уже встроены `theme/*.md` и `components/*.md`.
- Не задеть механизм `structure.json`/docs JAR, применимый только к Core-шаблонам (`compose-template`/`xml-template`).

**Non-Goals:**
- Не описывать write/maintainer-сценарии `dsbuilder` (`theme fetch/push`, `components push`, `docs publish`) — они требуют отдельной инструкции для мейнтейнеров plasma-android/design-system-builder и вне скоупа этого изменения.
- Не вводить новый Gradle-плейсхолдер (`{{ docs-projectId }}`/`{{ docs-designSystemId }}`) для персонализированной `designSystem`-ссылки — в v1 читатель подставляет `project-id`/`design-system-id` вручную.
- Не менять `structure.json`, docs JAR, `DocumentationAggregateTask` или что-либо в `compose-template`/`xml-template` кроме `quick_start.md`.
- Не публиковать и не проверять фактическую доступность `npx dsbuilder-mcp` / GitHub Release `dsbuilder-cli-macos-arm64.zip` — это ответственность `design-system-builder`, отдельная от этого изменения.

## Decisions

**Расположение — `common-template/docs/`, а не `compose-template`/`xml-template`.** MCP tools и установка CLI платформонезависимы (то же самое для Compose- и XML-потребителя, различается только флаг `--platform` внутри инструкции). Общий файл в `common-template` копируется в оба типа сайтов без дублирования контента и без риска рассинхронизации двух копий. Альтернатива — по копии в `compose-template/docs/` и `xml-template/docs/` — отклонена: увеличивает поверхность дублирования ради несуществующей на сегодня разницы в контенте.

**Две отдельные страницы (`mcp.md`, `cli.md`), а не одна общая.** У них разные точки входа читателя: кто-то хочет только настроить чат-агента (`mcp.md`, без установки чего-либо) и никогда не открывает терминал; кто-то настраивает постоянный локальный контекст через CLI и по пути узнаёт, что тот же сервер можно поднять командой `dsbuilder mcp serve` (`cli.md`). Одна страница на два сценария заставляла бы обе аудитории продираться через нерелевантную им часть. Единственная согласованная связь — по одной перекрёстной ссылке-мостику в конце каждой страницы, без пересказа содержимого другой.

**`npx dsbuilder-mcp serve` — основной путь в `mcp.md`, установка CLI — альтернативный.** Из README `mcp-node` и ADR-0004 оба launcher (`dsbuilder-mcp` и `dsbuilder mcp serve`) равноправны и имеют одинаковый MCP-контракт; но npx не требует ничего устанавливать и подходит читателю, который зашёл только настроить агента. `cli.md` — для тех, кому нужен постоянный локальный контекст проекта (`.sdds/config.json`), а не разовый запуск.

**Инструкция описывает целевое поведение, а не сегодняшнее.** На момент написания у `design-system-builder` нет release/publish workflow (`.github/workflows`) для `dsbuilder-cli-macos-arm64.zip` или npm-пакета `dsbuilder-mcp` — есть только локальные Gradle-таски (`packageMcpNodeNpm`, `frontend-kt/cli/build/distributions/...`). Решение (принято explicitly пользователем) — писать документацию "как должно быть", не дожидаясь релизного пайплайна в соседнем репозитории. Альтернатива (отложить страницы до появления релиза) отклонена, чтобы не блокировать work item на внешнюю зависимость с неопределённым сроком.

**Не трогать `structure.json`.** `structure.json` — whitelist для docs JAR, который затем читает DS Builder CLI как Core-документацию конкретного компонента/темы (`core-documentation-templates`, `android-documentation-aggregation`). `mcp.md`/`cli.md` — инфраструктурные страницы про инструментарий, а не Core-контент библиотеки; они живут в `common-template`, куда этот механизм не дотягивается, и не должны туда искусственно затягиваться.

## Risks / Trade-offs

- **[Risk]** До появления реального релиза в `design-system-builder` команды `npx dsbuilder-mcp serve` и ссылка на GitHub Release в `cli.md` не будут работать у читателя. → **Mitigation**: осознанно принято пользователем (design ahead of infrastructure); страницы должны быть быстро проверены/поправлены, как только в `design-system-builder` появится публикация npm-пакета и релиз CLI — стоит завести это как последующий task/issue в `design-system-builder`, а не в этом репозитории.
- **[Risk]** Другие языковые платформы SDDS (iOS, Web), если у них есть аналогичный `docs-template`, не получат эту инструкцию автоматически — рассинхронизация между платформами. → **Mitigation**: вне скоупа этого изменения; при необходимости — отдельный change в соответствующем платформенном репозитории.
- **[Trade-off]** Явный `<project-id>`/`<design-system-id>` вместо готовой персонализированной ссылки — читателю нужно самому найти эти идентификаторы в DS Builder UI. → Принято ради минимального скоупа v1; не блокирует полезность страницы.

## Migration Plan

Не требуется — изменение чисто аддитивное (новые страницы, две строки в `sidebars.ts`, два новых пункта в двух `quick_start.md`). Существующие сгенерированные сайты обновятся на следующем прогоне `docusaurusGenerate`/`docusaurusDeploy` для каждой библиотеки; отката не требуется, при проблеме — обычный revert коммита.

## Open Questions

- Когда в `design-system-builder` появится реальный release/publish pipeline — нужно ли заводить отдельный task на проверку актуальности команд в `mcp.md`/`cli.md` (версии, имена пакетов, URL релиза)?
- Стоит ли в будущем добавить `{{ docs-projectId }}`/`{{ docs-designSystemId }}` в `DocsProjectUtils.kt`, чтобы `mcp.md` мог показывать готовую персональную `designSystem`-ссылку конкретной библиотеки вместо плейсхолдера?
- Нужна ли отдельная страница/раздел для write/maintainer-сценариев `dsbuilder` (публикация тем, компонентов, доков) — и если да, для какой аудитории (contributors plasma-android vs другие потребители с правом записи)?

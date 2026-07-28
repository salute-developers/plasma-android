## Context

После change `package-core-documentation-templates` Android plugin получает версионированный Core docs JAR, насыщает публичный Core markdown и формирует `.sdds/temp/docs`. User documentation уже существует в `tokens/*/docs/override-docs`, но legacy Docusaurus воспринимает её как файловый overlay: обычный файл заменяет Core page, а `+Name.md` дописывается к ней функцией `mergePlusPrefixedDocs`.

ADR-0003 требует сохранять Core и user content раздельно, чтобы DS Builder CLI построил итоговую navigation и `contentRefs` с `source=core|user`. Поэтому Android не должен повторять merge Docusaurus, но обязан разрешить физические legacy sources в логические user paths, насытить их теми же platform data и передать обе structures.

Текущие реальные user markdown ограничены `plasma.homeds.compose` (три append и две standalone pages) и `sdds-sbcom-compose` (одна append page). Остальные `override-docs` содержат screenshots и не требуют фиктивной user structure.

## Goals / Non-Goals

**Goals:**

- ввести явный user source contract в `override-docs/structure.json`;
- сохранить текущий Docusaurus overlay и `+*.md` append без изменения результата;
- насыщать Core и user markdown одним processor, но записывать в разные namespaces;
- передавать CLI независимые `structure-core.json` и `structure-user.json`;
- мигрировать существующие user overrides на декларативную структуру;
- валидировать неоднозначные logical/physical paths и merge modes.

**Non-Goals:**

- merge Core и user navigation/content;
- формирование `docs.json`, `manifest.json` и `contentRefs`;
- поддержка `prepend` в legacy Docusaurus;
- удаление `+` convention;
- создание user docs для token modules, где сейчас есть только screenshots;
- Docusaurus build, npm, S3 upload и publication;
- изменение Core docs JAR или публикационного Gradle variant.

## Decisions

### 1. User source root остаётся `override-docs`

Структура располагается рядом с существующей директорией `docs`:

```text
override-docs/
├── structure.json
├── docs/
│   ├── components/+EditableUsage.md
│   └── components/FloatingButtonBar.md
└── static/screenshots-docusaurus/
```

Это сохраняет единственный авторский источник и повторяет layout Core template, где `structure.json` расположен рядом с `docs/`. Альтернатива с новой директорией `user-docs` отклонена: она потребовала бы дублировать или перемещать legacy Docusaurus inputs.

`DocumentationCapability` получает configurable user root с convention на `project.layout.projectDirectory.dir("override-docs")`. Directory является optional Gradle input; отсутствие structure означает отсутствие user layer.

### 2. Structure содержит logical path, filesystem сохраняет legacy marker

Для append к Core page:

```text
structure path: components/EditableUsage.md
merge: append
physical source: docs/components/+EditableUsage.md
output: content/user/components/EditableUsage.md
```

Префикс `+` не попадает ни в structure output, ни в content path. Он остаётся адаптером только для `mergePlusPrefixedDocs`.

Для standalone page physical и logical paths совпадают. Для replace существующей Core page используется обычный файл и явный `merge: replace`, что соответствует текущему overlay Docusaurus.

Альтернатива хранить `+` в structure path отклонена: тогда CLI не сможет сопоставить user page с Core page по path. Альтернатива немедленно удалить `+` отклонена: legacy Docusaurus потеряет append semantics.

### 3. Пересечения с Core требуют явного merge

Aggregator строит allowlist Core logical paths и валидирует user navigation:

- новый path → обычный markdown, поле `merge` отсутствует;
- Core path + `append` → только `+Name.md`;
- Core path + `replace` → только обычный `Name.md`;
- Core path без `merge` → ошибка;
- new path с `+Name.md` → ошибка;
- `prepend` → ошибка до миграции legacy Docusaurus.

Явность предотвращает расхождение нового bundle и Docusaurus. Хотя ADR называет append значением по умолчанию, переходный Android contract требует explicit merge для пересечений, потому что физическое имя файла определяет legacy поведение.

### 4. Enrichment разделяется на parsing и materialization

Существующий Core-specific container обобщается до документационного слоя:

- structure JSON;
- logical path → source markdown;
- source label (`core`/`user`);
- output namespace.

Один processor заменяет Kotlin/XML samples и Compose style API и сохраняет screenshot directives. Это исключает расхождение поведения Core и user pages. Ошибки unresolved samples содержат source layer, logical path и reference.

### 5. Platform output всегда сохраняет происхождение content

Новый layout:

```text
.sdds/temp/docs/
├── structure-core.json
├── structure-user.json        # только если user layer существует
├── content/
│   ├── core/**                # только если Core structure существует
│   └── user/**                # только если user structure существует
├── assets/
│   ├── examples/{kotlin,xml}/**
│   └── screenshots/**
└── meta/**
```

Android не объединяет одинаковые logical paths. Раздельные namespaces позволяют CLI сформировать `contentRefs` без копирования или повторного platform enrichment.

Это breaking change относительно недавно введённого `content/**` Core output, но потребителей финального Android layout ещё нет; корректировка сейчас дешевле, чем поддержка неоднозначного промежуточного формата.

### 6. User structure валидируется рядом с platform aggregation

Основная runtime validation выполняется в `DocumentationAggregateTask`, потому что ей доступны обе structures и можно определить collision с Core. Для существующих token sources добавляются focused tests, проверяющие:

- все user navigation paths разрешаются;
- `+` соответствует `append`;
- standalone pages не используют `+`;
- unlisted markdown не публикуется.

Legacy Docusaurus task не начинает интерпретировать structure в этом change. Его regression-проверка подтверждает, что `mergePlusPrefixedDocs` продолжает выдавать прежний объединённый markdown.

### 7. Относительные ссылки должны быть bundle-safe

User markdown SHALL ссылаться на Core/user pages логическими относительными ссылками внутри будущего content tree, а не путями к `build-system/docs-template`. Существующие repository-relative ссылки в `FloatingButtonBar.md` мигрируют на ссылки, которые DS Builder CLI сможет разрешить после merge.

Полная link validation остаётся ответственностью CLI, но Android tests фиксируют отсутствие прямых ссылок на repository template paths в публикуемом user content.

## Risks / Trade-offs

- [Logical path отличается от physical `+` source] → централизовать resolver и покрыть append/replace/new page table-driven tests.
- [Core и user output layout breaking для ранних потребителей] → изменить до появления CLI consumer и явно проверить отсутствие файлов непосредственно под `content`.
- [Docusaurus и structure могут разойтись] → валидировать текущие overrides и сохранять один physical markdown source.
- [ADR допускает prepend, а legacy Docusaurus нет] → fail fast с диагностикой; добавить режим после миграции legacy generator.
- [Обычный colliding file без merge может случайно заменить Core в Docusaurus] → считать это ошибкой Android validation и требовать explicit `replace`.
- [User component отсутствует в components info] → выдавать ошибку с user logical path при `@style-api`, как для Core enrichment.
- [Общие screenshot/example namespaces могут содержать collisions] → сохранять текущие стабильные IDs и fail fast при разных файлах на одном output path.

## Migration Plan

1. Перевести Core output в `content/core` и обновить tests.
2. Добавить optional user root/structure inputs и logical source resolver.
3. Добавить `structure.json` к `plasma.homeds.compose` и `sdds-sbcom-compose`, не переименовывая `+*.md`.
4. Насыщать user pages в `content/user` и сохранить `structure-user.json`.
5. Исправить repository-relative links в standalone user pages.
6. Проверить plugin unit tests, обе существующие user structures, Compose aggregation с user layer, View aggregation без него и legacy Docusaurus merge.

Rollback возвращает Core output в `content/**` и отключает optional user inputs. Файлы `override-docs/structure.json` не влияют на legacy Docusaurus и могут оставаться как неиспользуемые декларативные данные.

## Open Questions

- Нужно ли следующим change перевести legacy Docusaurus на чтение `structure.json`, чтобы разрешить удаление `+` и поддержку `prepend`?
- Должен ли CLI валидировать совпадение screenshot keys с filenames до S3 upload или это останется ответственностью documentation service?

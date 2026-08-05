# android-documentation-aggregation Specification

## Purpose
TBD - created by archiving change unify-ds-builder-plugin. Update Purpose after archive.
## Requirements
### Requirement: Плагин собирает платформенные фрагменты документации
Documentation capability SHALL собирать Kotlin и XML snippets, metadata и платформенные info-артефакты в объявленные Gradle outputs.

#### Scenario: Compose documentation
- **WHEN** модуль включает `documentation { compose() }`
- **THEN** плагин SHALL зарегистрировать задачи извлечения Kotlin snippets и включить Compose `componentsInfoFile` и `themeInfoFile` в агрегированный результат

#### Scenario: View documentation
- **WHEN** модуль включает `documentation { view() }`
- **THEN** плагин SHALL зарегистрировать задачи извлечения Kotlin/XML snippets и включить View `componentsInfoFile` и `themeInfoFile` в агрегированный результат

### Requirement: Core snippets принимаются как Gradle artifacts
Documentation capability SHALL предоставлять resolvable configuration для версионированных Core documentation artifacts и распаковывать их templates, snippets и metadata из `META-INF/sdds-docs` с проверкой безопасных относительных путей.

#### Scenario: Подключён один или несколько core artifacts
- **WHEN** configuration Core documentation содержит JAR-артефакты с `META-INF/sdds-docs`
- **THEN** задача агрегации SHALL обработать документационные файлы всех артефактов в детерминированном порядке и SHALL завершиться понятной ошибкой при конфликтующих Core template paths

#### Scenario: Core artifacts отсутствуют
- **WHEN** configuration Core documentation не содержит артефактов
- **THEN** локальные snippets и info-артефакты SHALL собираться без ошибки, а Core content SHALL оставаться пустым

#### Scenario: Legacy Core artifact содержит meta.json
- **WHEN** Core artifact содержит `META-INF/sdds-docs/meta.json`
- **THEN** aggregator SHALL объединить его записи с локальной metadata в `.sdds/temp/docs/meta/samples.json` и SHALL NOT копировать `meta.json` как Kotlin snippet

#### Scenario: Legacy Core artifact содержит snippets без template namespace
- **WHEN** Core artifact содержит прежний snippets-only layout внутри `META-INF/sdds-docs`
- **THEN** aggregator SHALL нормализовать snippets и metadata в текущий output layout без требования `structure.json`

#### Scenario: Локальная metadata переопределяет Core sample
- **WHEN** Core и локальная metadata содержат одинаковый sample id
- **THEN** запись локальной metadata SHALL иметь приоритет

#### Scenario: Core artifact содержит небезопасный путь
- **WHEN** путь ZIP entry выходит за пределы documentation output
- **THEN** задача MUST завершиться ошибкой и SHALL NOT записывать файл за пределами output

### Requirement: Агрегированный результат пригоден для DS Builder CLI
Documentation capability SHALL производить раздельный платформенно насыщенный Core и user результат с Gradle-declared inputs и outputs, который DS Builder CLI может объединить без знания исходных source sets, Docusaurus и задач Android-проекта.

#### Scenario: Задача агрегации завершена
- **WHEN** выполняется lifecycle-задача агрегации документации с Core и user structures
- **THEN** `.sdds/temp/docs` SHALL содержать Core markdown в `content/core`, user markdown в `content/user`, `structure-core.json`, `structure-user.json`, snippets в `assets/examples/kotlin` и `assets/examples/xml`, screenshots в `assets/screenshots`, metadata в `meta/samples.json` и доступные platform info files в `meta`

#### Scenario: Задача агрегации завершена без user layer
- **WHEN** user structure отсутствует
- **THEN** Core output и общие artifacts SHALL быть созданы, а `structure-user.json` и `content/user` SHALL отсутствовать

#### Scenario: Sample path разрешается от documentation root
- **WHEN** aggregator записывает Kotlin или XML sample metadata
- **THEN** `snippetPath` SHALL быть относительным к `.sdds/temp/docs` и начинаться с `assets/examples/kotlin/` или `assets/examples/xml/`

#### Scenario: Входной файл отсутствует
- **WHEN** обязательный для выбранной платформы info-файл отсутствует
- **THEN** задача MUST завершиться ошибкой с точным путём отсутствующего файла

#### Scenario: Core template отсутствует
- **WHEN** Core documentation artifact не содержит `structure.json` и markdown template
- **THEN** snippets, user layer и info-артефакты SHALL агрегироваться без создания фиктивной Core structure

### Requirement: Portal build и публикация не входят в capability
Documentation capability SHALL NOT выполнять Docusaurus template generation, npm-команды, changelog synchronization, S3 upload или публикацию документации.

#### Scenario: Выполняется агрегация документации
- **WHEN** запускается lifecycle-задача documentation capability
- **THEN** она SHALL завершаться созданием локального платформенного результата и SHALL NOT запускать portal build или network publication

### Requirement: Core markdown насыщается платформенными examples
Documentation capability SHALL обрабатывать существующие Kotlin/XML sample directives в Core markdown и записывать результат в `.sdds/temp/docs/content/core`, сохраняя относительные логические пути страниц.

#### Scenario: Kotlin sample существует
- **WHEN** Core markdown содержит Kotlin `@sample` directive, разрешимый по Core или локальным snippets
- **THEN** directive SHALL быть заменён содержимым соответствующего Kotlin example

#### Scenario: XML sample существует
- **WHEN** Core markdown содержит XML `@sample` directive, разрешимый по Core или локальным snippets
- **THEN** directive SHALL быть заменён содержимым соответствующего XML example

#### Scenario: Локальный example переопределяет Core example
- **WHEN** Core и локальный example разрешаются по одному пути
- **THEN** при насыщении SHALL использоваться локальный example

#### Scenario: Обязательный sample не разрешается
- **WHEN** Core markdown содержит `@sample` directive, для которого отсутствует example
- **THEN** задача MUST завершиться ошибкой с путём markdown-файла и значением directive

### Requirement: Core structure сопровождает насыщенный content
Documentation capability SHALL сохранять `structure.json` из Core documentation artifact как `structure-core.json` и SHALL сохранять Core content отдельно от user content.

#### Scenario: Core structure валидно ссылается на templates
- **WHEN** все пути страниц из Core `structure.json` существуют в Core template
- **THEN** aggregator SHALL скопировать structure и создать соответствующие насыщенные файлы в `content/core`

#### Scenario: Structure ссылается на отсутствующий markdown
- **WHEN** публичный path из Core `structure.json` отсутствует в Core template
- **THEN** задача MUST завершиться ошибкой с отсутствующим относительным путём

#### Scenario: Template отсутствует в structure
- **WHEN** markdown-файл Core template не указан в Core `structure.json`
- **THEN** файл SHALL считаться непубличным и SHALL NOT попадать в `content/core`

### Requirement: Style API насыщает markdown, а screenshots остаются внешним ресурсом
Documentation capability SHALL заменять существующие style-api directives платформенными данными, SHALL сохранять screenshot directives как ключи и SHALL копировать локальные screenshot assets для последующей публикации documentation service.

#### Scenario: Markdown содержит screenshot directive
- **WHEN** markdown содержит `@screenshot` directive
- **THEN** aggregator SHALL сохранить directive без изменений, SHALL скопировать доступные PNG в `assets/screenshots` и SHALL NOT создавать локальную публичную ссылку

#### Scenario: Compose style API существует
- **WHEN** markdown содержит `@style-api` directive и component info содержит style API
- **THEN** directive SHALL быть заменён таблицей параметров и примером выбора готового стиля

### Requirement: User markdown насыщается независимо от Core
Documentation capability SHALL применять platform enrichment к публичному user markdown и SHALL сохранять его в `.sdds/temp/docs/content/user` без предварительного merge с Core content.

#### Scenario: User sample существует
- **WHEN** публичный user markdown содержит разрешимый Kotlin или XML `@sample` directive
- **THEN** directive SHALL быть заменён соответствующим локальным example

#### Scenario: User style API существует
- **WHEN** публичный Compose user markdown содержит `@style-api` и platform components info содержит соответствующий component
- **THEN** directive SHALL быть заменён таблицей параметров и примером выбора готового стиля

#### Scenario: User screenshot key существует
- **WHEN** публичный user markdown содержит `@screenshot`
- **THEN** directive SHALL остаться неизменным, а доступный PNG SHALL находиться в общем `assets/screenshots`

#### Scenario: Core и user имеют одинаковый logical path
- **WHEN** обе structures содержат один path
- **THEN** Android output SHALL содержать оба файла в разных namespaces и SHALL NOT объединять их содержимое

### Requirement: User structure передаётся DS Builder CLI без merge
Documentation capability SHALL копировать валидный user structure как `.sdds/temp/docs/structure-user.json`, сохраняя navigation metadata и merge directives.

#### Scenario: User structure валидно
- **WHEN** все публичные user paths разрешены и поддерживаемые merge modes валидны
- **THEN** aggregator SHALL записать `structure-user.json` без слияния с `structure-core.json`

#### Scenario: Android aggregation получает merge metadata
- **WHEN** user page содержит `merge`, `hidden` или `subjects`
- **THEN** эти поля SHALL быть сохранены для последующей обработки DS Builder CLI


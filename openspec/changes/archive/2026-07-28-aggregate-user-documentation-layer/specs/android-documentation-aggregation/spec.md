## MODIFIED Requirements

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

## ADDED Requirements

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

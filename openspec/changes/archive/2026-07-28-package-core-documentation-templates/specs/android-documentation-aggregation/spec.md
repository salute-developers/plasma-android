## MODIFIED Requirements

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
Documentation capability SHALL производить платформенно насыщенный файловый результат с Gradle-declared inputs и outputs, который DS Builder CLI может использовать без знания исходных source sets, Docusaurus и задач Android-проекта.

#### Scenario: Задача агрегации завершена
- **WHEN** выполняется lifecycle-задача агрегации документации
- **THEN** `.sdds/temp/docs` SHALL содержать насыщенный Core markdown непосредственно в `content`, Core structure в `structure-core.json`, snippets в `assets/examples/kotlin` и `assets/examples/xml`, screenshots в `assets/screenshots`, metadata в `meta/samples.json` и доступные platform info files в `meta`

#### Scenario: Sample path разрешается от documentation root
- **WHEN** aggregator записывает Kotlin или XML sample metadata
- **THEN** `snippetPath` SHALL быть относительным к `.sdds/temp/docs` и начинаться с `assets/examples/kotlin/` или `assets/examples/xml/`

#### Scenario: Входной файл отсутствует
- **WHEN** обязательный для выбранной платформы info-файл отсутствует
- **THEN** задача MUST завершиться ошибкой с точным путём отсутствующего файла

#### Scenario: Core template отсутствует
- **WHEN** Core documentation artifact не содержит `structure.json` и markdown template
- **THEN** snippets и info-артефакты SHALL агрегироваться в legacy-compatible режиме без создания фиктивной структуры

## ADDED Requirements

### Requirement: Core markdown насыщается платформенными examples
Documentation capability SHALL обрабатывать существующие Kotlin/XML sample directives в Core markdown и записывать результат в `.sdds/temp/docs/content`, сохраняя относительные пути страниц.

#### Scenario: Kotlin sample существует
- **WHEN** markdown содержит Kotlin `@sample` directive, разрешимый по Core или локальным snippets
- **THEN** directive SHALL быть заменён содержимым соответствующего Kotlin example

#### Scenario: XML sample существует
- **WHEN** markdown содержит XML `@sample` directive, разрешимый по Core или локальным snippets
- **THEN** directive SHALL быть заменён содержимым соответствующего XML example

#### Scenario: Локальный example переопределяет Core example
- **WHEN** Core и локальный example разрешаются по одному пути
- **THEN** при насыщении SHALL использоваться локальный example

#### Scenario: Обязательный sample не разрешается
- **WHEN** markdown содержит `@sample` directive, для которого отсутствует example
- **THEN** задача MUST завершиться ошибкой с путём markdown-файла и значением directive

### Requirement: Core structure сопровождает насыщенный content
Documentation capability SHALL сохранять `structure.json` из Core documentation artifact рядом с платформенным результатом в стабильном пути, доступном DS Builder CLI.

#### Scenario: Core structure валидно ссылается на templates
- **WHEN** все пути страниц из `structure.json` существуют в Core template
- **THEN** aggregator SHALL скопировать структуру и создать соответствующие насыщенные файлы в `content`

#### Scenario: Structure ссылается на отсутствующий markdown
- **WHEN** публичный path из `structure.json` отсутствует в Core template
- **THEN** задача MUST завершиться ошибкой с отсутствующим относительным путём

#### Scenario: Template отсутствует в structure
- **WHEN** markdown-файл Core template не указан в `structure.json`
- **THEN** файл SHALL считаться непубличным и SHALL NOT попадать в `content`

### Requirement: Style API насыщает markdown, а screenshots остаются внешним ресурсом
Documentation capability SHALL заменять существующие style-api directives платформенными данными, SHALL сохранять screenshot directives как ключи и SHALL копировать локальные screenshot assets для последующей публикации documentation service.

#### Scenario: Markdown содержит screenshot directive
- **WHEN** markdown содержит `@screenshot` directive
- **THEN** aggregator SHALL сохранить directive без изменений, SHALL скопировать доступные PNG в `assets/screenshots` и SHALL NOT создавать локальную публичную ссылку

#### Scenario: Compose style API существует
- **WHEN** markdown содержит `@style-api` directive и component info содержит style API
- **THEN** directive SHALL быть заменён таблицей параметров и примером выбора готового стиля

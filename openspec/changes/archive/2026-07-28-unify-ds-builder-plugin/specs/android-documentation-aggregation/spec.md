## ADDED Requirements

### Requirement: Плагин собирает платформенные фрагменты документации
Documentation capability SHALL собирать Kotlin и XML snippets, metadata и платформенные info-артефакты в объявленные Gradle outputs.

#### Scenario: Compose documentation
- **WHEN** модуль включает `documentation { compose() }`
- **THEN** плагин SHALL зарегистрировать задачи извлечения Kotlin snippets и включить Compose `componentsInfoFile` и `themeInfoFile` в агрегированный результат

#### Scenario: View documentation
- **WHEN** модуль включает `documentation { view() }`
- **THEN** плагин SHALL зарегистрировать задачи извлечения Kotlin/XML snippets и включить View `componentsInfoFile` и `themeInfoFile` в агрегированный результат

### Requirement: Core snippets принимаются как Gradle artifacts
Documentation capability SHALL предоставлять resolvable configuration для артефактов core snippets и распаковывать содержимое `META-INF/sdds-docs` в директорию агрегирования.

#### Scenario: Подключён один или несколько core artifacts
- **WHEN** configuration core snippets содержит JAR-артефакты с `META-INF/sdds-docs`
- **THEN** задача агрегации SHALL распаковать документационные файлы всех артефактов в общий output с детерминированным поведением при совпадении путей

#### Scenario: Core artifacts отсутствуют
- **WHEN** configuration core snippets не содержит артефактов
- **THEN** локальные snippets и info-артефакты SHALL собираться без ошибки

#### Scenario: Legacy Core artifact содержит meta.json
- **WHEN** Core artifact содержит `META-INF/sdds-docs/meta.json`
- **THEN** aggregator SHALL объединить его записи с локальной metadata в `.sdds/temp/docs/meta/samples.json` и SHALL NOT копировать `meta.json` как Kotlin snippet

#### Scenario: Локальная metadata переопределяет Core sample
- **WHEN** Core и локальная metadata содержат одинаковый sample id
- **THEN** запись локальной metadata SHALL иметь приоритет

### Requirement: Агрегированный результат пригоден для DS Builder CLI
Documentation capability SHALL производить платформенно насыщенный файловый результат с Gradle-declared inputs и outputs, который DS Builder CLI может использовать без знания исходных source sets и задач Android-проекта.

#### Scenario: Задача агрегации завершена
- **WHEN** выполняется lifecycle-задача агрегации документации
- **THEN** `.sdds/temp/docs` SHALL содержать snippets в `assets/examples/kotlin` и `assets/examples/xml`, metadata в `meta/samples.json` и доступные platform info files в `meta`

#### Scenario: Sample path разрешается от documentation root
- **WHEN** aggregator записывает Kotlin или XML sample metadata
- **THEN** `snippetPath` SHALL быть относительным к `.sdds/temp/docs` и начинаться с `assets/examples/kotlin/` или `assets/examples/xml/`

#### Scenario: Входной файл отсутствует
- **WHEN** обязательный для выбранной платформы info-файл отсутствует
- **THEN** задача MUST завершиться ошибкой с точным путём отсутствующего файла

### Requirement: Portal build и публикация не входят в capability
Documentation capability SHALL NOT выполнять Docusaurus template generation, npm-команды, changelog synchronization, S3 upload или публикацию документации.

#### Scenario: Выполняется агрегация документации
- **WHEN** запускается lifecycle-задача documentation capability
- **THEN** она SHALL завершаться созданием локального платформенного результата и SHALL NOT запускать portal build или network publication

## ADDED Requirements

### Requirement: User documentation имеет явную структуру
Android documentation source SHALL принимать опциональный user layer из `override-docs/structure.json` и `override-docs/docs/**/*.md`, где structure явно перечисляет публичные логические пути страниц.

#### Scenario: User layer отсутствует
- **WHEN** `override-docs/structure.json` отсутствует
- **THEN** Android aggregation SHALL завершиться без user structure и user content

#### Scenario: User structure содержит самостоятельную страницу
- **WHEN** user structure ссылается на путь, отсутствующий в Core structure, и соответствующий markdown существует
- **THEN** страница SHALL считаться самостоятельной публичной user page

#### Scenario: Markdown отсутствует в user structure
- **WHEN** user markdown не указан в `override-docs/structure.json`
- **THEN** файл SHALL считаться непубличным и SHALL NOT попадать в platform output

#### Scenario: User structure ссылается на отсутствующий markdown
- **WHEN** публичный логический путь не разрешается в user markdown source
- **THEN** aggregation MUST завершиться ошибкой с логическим путём

### Requirement: Legacy append сохраняет Docusaurus-совместимый source
User documentation SHALL поддерживать физический `+Name.md` как переходное представление логической страницы `Name.md` с `merge: append`.

#### Scenario: Append дополняет Core page
- **WHEN** user structure содержит Core path с `merge: append`
- **THEN** source SHALL разрешаться из `+Name.md`, а user output SHALL сохранять логический путь `Name.md` без префикса

#### Scenario: Legacy Docusaurus собирает append page
- **WHEN** выполняется существующая Docusaurus generation
- **THEN** `mergePlusPrefixedDocs` SHALL продолжать дописывать `+Name.md` к соответствующей Core page

#### Scenario: Append source имеет неверное имя
- **WHEN** Core path объявлен с `merge: append`, но существует только обычный `Name.md`
- **THEN** validation MUST завершиться ошибкой и указать ожидаемый `+Name.md`

#### Scenario: Самостоятельная page использует plus prefix
- **WHEN** логический path отсутствует в Core structure, но source назван `+Name.md`
- **THEN** validation MUST завершиться ошибкой, потому что plus prefix допустим только для append к Core page

### Requirement: User merge contract однозначен для обоих pipelines
User structure SHALL явно отличать append и replace существующей Core page, а неподдерживаемый legacy merge mode SHALL отклоняться до насыщения.

#### Scenario: User page заменяет Core page
- **WHEN** user structure содержит Core path с `merge: replace` и обычный `Name.md`
- **THEN** Android aggregation SHALL сохранить отдельный user content, а legacy Docusaurus SHALL продолжить использовать overlay replacement

#### Scenario: Пересекающийся path не имеет merge
- **WHEN** user path существует в Core structure, но merge mode не задан
- **THEN** validation MUST завершиться ошибкой и потребовать явный `append` или `replace`

#### Scenario: Prepend запрошен при включённой legacy совместимости
- **WHEN** user structure содержит `merge: prepend`
- **THEN** validation MUST завершиться понятной ошибкой, поскольку legacy Docusaurus не поддерживает prepend

### Requirement: Существующие user overrides получают декларативную навигацию
Существующие user markdown в token docs modules SHALL быть описаны user structure без изменения их Docusaurus merge semantics.

#### Scenario: Homeds overrides валидируются
- **WHEN** проверяется `plasma.homeds.compose/docs/override-docs`
- **THEN** все текущие append и standalone markdown SHALL быть перечислены в user structure с соответствующими логическими paths

#### Scenario: Sbcom overrides валидируются
- **WHEN** проверяется `sdds-sbcom-compose/docs/override-docs`
- **THEN** текущий `+IndicationUsage.md` SHALL быть представлен логическим Core path с `merge: append`


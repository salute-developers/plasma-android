# view-api-meta-generation Specification

## Purpose
TBD - created by archiving change add-view-api-meta. Update Purpose after archive.
## Requirements
### Requirement: Gradle-задача генерирует uikit-api-meta.json
В `build-system/conventions` SHALL присутствовать Gradle-задача, регистрируемая через convention-плагин на модуле `uikit`, которая парсит размеченные `declare-styleable` и сериализует результат в `sdds/api/uikit-api-meta.json`. Задача SHALL быть инкрементальной (корректно объявлять входы/выходы).

#### Scenario: Генерация меты из размеченных ресурсов
- **WHEN** задача выполняется на модуле с размеченными `declare-styleable`
- **THEN** SHALL создаваться файл `sdds/api/uikit-api-meta.json` со списком `ComponentMeta`

#### Scenario: Пустой результат при отсутствии разметки
- **WHEN** ни один `declare-styleable` не помечен `sdds:api_info`
- **THEN** задача SHALL записывать пустой JSON-массив, не завершаясь ошибкой

### Requirement: Глобальный индекс attr → format
Перед классификацией задача SHALL построить индекс всех `<attr>`-определений (имя → `format`) по всем `values/*.xml` модуля и использовать его для разрешения атрибутов, которые внутри `declare-styleable` указаны без `format` (ссылки на определения из других файлов).

#### Scenario: Резолв атрибута без format по ссылке
- **WHEN** `declare-styleable` содержит `<attr name="sd_shapeAppearance" />` без `format`, а определение `<attr name="sd_shapeAppearance" format="reference" />` находится в другом файле
- **THEN** свойство SHALL классифицироваться на основе `format` из определения, а не отбрасываться

### Requirement: Модель ComponentMeta
Мета View SHALL описываться собственной `@Serializable`-моделью `ComponentMeta` в `plugin_theme_builder`, отдельной от compose-`ComposeComponentMeta`. Модель SHALL нести: имена компонентов, имя styleable, `packageName`, `builderFunName`, список свойств (`id`, `attrName`, `type`, значения enum как `(name, value, configName)`) и наборы состояний (имя набора и упорядоченные состояния с `configName`, `drawableAttr`, флейвором и признаком инверсии).

#### Scenario: Свойство сериализуется с XML-нативными полями
- **WHEN** размеченный `attr` попадает в мету
- **THEN** его запись SHALL содержать `id`, `attrName` (полное имя с префиксом) и семантический `type`

#### Scenario: Набор состояний сохраняет порядок
- **WHEN** компонент имеет кастомный набор состояний
- **THEN** состояния в мете SHALL храниться в детерминированном порядке, задающем стабильный ordinal для генерируемого `ColorState`-enum

### Requirement: Упаковка меты в ресурсы uikit
Сгенерированный `uikit-api-meta.json` SHALL упаковываться в артефакт (AAR) модуля `uikit` по пути `sdds/api/uikit-api-meta.json`, аналогично тому, как compose-мета упаковывается в `uikit-compose`.

#### Scenario: JSON присутствует в собранном AAR
- **WHEN** модуль `uikit` собран
- **THEN** `sdds/api/uikit-api-meta.json` SHALL находиться внутри артефакта и быть доступным по classpath потребителям

### Requirement: Чтение меты в plugin_theme_builder
В `plugin_theme_builder` SHALL присутствовать задача `UikitApiMetaTask` — зеркало `UikitComposeApiMetaTask` — которая находит `uikit-api-meta.json` в ZIP-артефактах classpath, десериализует его в `List<ComponentMeta>` и записывает в выходной файл; при отсутствии файла SHALL записывать пустой список.

#### Scenario: Мета вычитывается из classpath
- **WHEN** в classpath присутствует артефакт с `uikit-api-meta.json`
- **THEN** `UikitApiMetaTask` SHALL десериализовать его в `List<ComponentMeta>` и записать выходной файл

#### Scenario: Отсутствие меты не ломает задачу
- **WHEN** `uikit-api-meta.json` не найден ни в одном артефакте classpath
- **THEN** `UikitApiMetaTask` SHALL записывать пустой список без ошибки

### Requirement: Обязательное unit-тестовое покрытие парсера
Логика разбора XML и построения меты SHALL быть выделена в тестируемый класс(ы) и покрыта unit-тестами в `build-system/conventions/src/test`. Тесты SHALL являться обязательной частью change и покрывать корнер-кейсы разметки и классификации.

#### Scenario: Тест на авто-strip и явное переименование
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться, что `sd_valuePadding` → `id="valuePadding"`, а `sdds:api_name` переопределяет `id`

#### Scenario: Тест на cross-file резолв format
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться классификация атрибута, указанного в styleable без `format`, по глобальному индексу определений

#### Scenario: Тест на список компонентов и переименование enum
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться, что `sdds:api_info="A,B"` даёт два компонента, а `<enum sdds:api_name="...">` даёт корректный `configName`

#### Scenario: Тест на фильтрацию не-темизируемых атрибутов
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться, что `android:*` и непомеченные/непопадающие attr исключаются из меты

#### Scenario: Тест на сборку наборов состояний
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться, что кастомные состояния собираются в набор с корректным флейвором и детерминированным порядком, а framework-состояния разрешаются автоматически


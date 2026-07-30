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
Мета View SHALL описываться собственной `@Serializable`-моделью `ComponentMeta` в `plugin_theme_builder`, отдельной от compose-`ComposeComponentMeta`, и зеркальной producer-моделью в `build-system/conventions`. Модель SHALL нести:

- **идентичность**: логические имена компонентов (join key), имя `declare-styleable` и per-component идентичность — `coreName`, `defStyleAttr`, `parent`;
- **свойства** (`params`): `id` (ключ токен-конфига), `attrName` (полное имя атрибута, включая `android:`-префикс для framework-атрибутов), семантический `type`, `resSuffix` (суффикс имени генерируемого ресурса), `placement` (`style` | `overlay`), `stateValues` (значения под состояниями: алиасный ключ конфига либо производное значение), значения enum как `(name, value, configName)`;
- **состояния**: плоский список привязок `configName → (drawableAttr, флейвор, значение)` с группировкой в именованные наборы; несколько привязок с одним `configName` образуют составное состояние; поле `ordinal` в привязке SHALL отсутствовать (см. отдельный requirement);
- **словарь shared-состояний**: имена и атрибуты общего словаря `sd_state_*`, собранные из `base_attrs.xml`, — чтобы потребитель резолвил имена состояний по реальному словарю uikit, а не форматированием строки.

Поле `packageName` во view-мете SHALL быть удалено: per-component пакеты применимы только к Compose (см. `view-api-info`).

#### Scenario: Свойство сериализуется с XML-нативными полями
- **WHEN** размеченный `attr` попадает в мету
- **THEN** его запись SHALL содержать `id`, `attrName` (полное имя с префиксом), семантический `type`, `resSuffix` и `placement`

#### Scenario: Идентичность различается внутри одного styleable
- **WHEN** `declare-styleable` обслуживает несколько компонентов с разными `defStyleAttr`/`parent`/`coreName`
- **THEN** мета SHALL содержать отдельную идентичность для каждого компонента

#### Scenario: Составное состояние сохраняется как несколько привязок
- **WHEN** одно имя состояния конфига размечено двумя привязками (одна из них инвертированная)
- **THEN** мета SHALL содержать обе привязки с общим `configName`, и потребитель SHALL разворачивать их в набор атрибутов элемента state-list

#### Scenario: Словарь shared-состояний присутствует в мете
- **WHEN** мета сгенерирована
- **THEN** она SHALL содержать словарь имён shared-состояний (`sd_state_*`) с их атрибутами, собранный из ресурсов модуля

#### Scenario: Набор состояний сохраняет порядок объявления
- **WHEN** компонент имеет набор состояний
- **THEN** привязки SHALL храниться в порядке объявления в разметке — для детерминированности сериализации, но без семантики рантайм-порядка

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
Логика разбора XML и построения меты SHALL быть выделена в тестируемый класс(ы) и покрыта unit-тестами в `build-system/conventions/src/test`. Тесты SHALL являться обязательной частью change и покрывать корнер-кейсы разметки и классификации, включая весь словарь `sdds:*`:

- именование (`api_name`, авто-strip, один ключ на нескольких атрибутах) и cross-file резолв `format`;
- идентичность компонента (per-component `api_def_style_attr`/`api_parent`/`api_core_name`, дефолт `coreName = api_info`, ошибка при отсутствии обязательного поля);
- `api_res_suffix` (дефолт от `attrName`, переопределение, разные суффиксы одного атрибута в разных styleable);
- `api_placement` (дефолт `style`, `overlay` на `sd_`- и `android:*`-атрибуте);
- `api_state_value` (обе формы грамматики, ошибка при недопустимой форме);
- состояния (одиночная привязка, составное состояние с инверсией, enum-driven набор, недопустимый флейвор → ошибка, отсутствие `ordinal` в модели, рассинхрон ключа состояния с `configName` enum-значения → ошибка);
- framework-атрибуты (включение по наличию `api_name`, игнорирование без него);
- сбор словаря shared-состояний;
- round-trip producer-JSON → consumer-модель для всех полей, включая новые.

#### Scenario: Тест на авто-strip и явное переименование
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться, что `sd_valuePadding` → `id="valuePadding"`, а `sdds:api_name` переопределяет `id`

#### Scenario: Тест на новый словарь разметки
- **WHEN** запускаются тесты парсера
- **THEN** SHALL проверяться идентичность компонента, `api_res_suffix`, `api_placement`, `api_state_value` и обобщённая модель состояний, включая сценарии ошибок

### Requirement: Позиция привязки состояния не является рантайм-контрактом
Модель привязки состояния SHALL NOT содержать поля `ordinal`. Позиция привязки в наборе SHALL использоваться только для детерминированной сериализации.

Обоснование: рантайм-порядок enum-driven состояний задаётся значениями `<enum>` темизируемого свойства компонента (напр. `sd_status` с `none=0`/`active=1`/`inactive=2`), которые мета уже несёт в значениях этого свойства, а порядок значений генерируемого `XxxColorState` определяется ключами `view`-вариаций конфига темы: `ViewColorStateGenerator` эмитит XML-`<enum>` и Kotlin-enum одним проходом по одному списку, поэтому они согласованы по построению и внешнего пиннинга не требуют. Позиционный `ordinal` в мете не совпадал ни с одним из этих порядков и вводил в заблуждение.

Вместо позиционного контракта модель SHALL поддерживать проверку согласованности имён: `configName` привязок состояний сверяется с `configName` значений соответствующего enum-свойства компонента, если такое свойство есть.

#### Scenario: Модель не содержит ordinal
- **WHEN** мета сериализована
- **THEN** записи привязок состояний SHALL содержать `configName`, `drawableAttr`, флейвор и значение, и SHALL NOT содержать `ordinal`

#### Scenario: Рантайм-порядок берётся из значений enum-свойства
- **WHEN** потребителю нужен рантайм-порядок взаимоисключающих состояний компонента
- **THEN** он SHALL определяться значениями `<enum>` соответствующего свойства меты, а не позицией привязок в наборе

#### Scenario: Рассинхрон имён состояния и enum-значения выявляется
- **WHEN** ключ привязки состояния не совпадает ни с одним `configName` значений соответствующего enum-свойства
- **THEN** генерация SHALL завершаться ошибкой


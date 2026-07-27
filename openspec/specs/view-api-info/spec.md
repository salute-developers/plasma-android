# view-api-info Specification

## Purpose
TBD - created by archiving change add-view-api-meta. Update Purpose after archive.
## Requirements
### Requirement: Кастомный namespace для API-разметки ресурсов
Модуль `sdds-core/uikit` SHALL использовать XML-namespace `xmlns:sdds="http://schemas.sdds.ru/android/sdds"` для разметки API-метаинформации в файлах `res/values/*.xml`. Namespace SHALL применяться только для метаданных генерации и не влиять на скомпилированные ресурсы.

#### Scenario: Namespace объявлен на корне ресурсного файла
- **WHEN** в `values/*attrs*.xml` присутствует хотя бы одна `sdds:`-разметка
- **THEN** на корневом элементе `<resources>` SHALL быть объявлен `xmlns:sdds="http://schemas.sdds.ru/android/sdds"`

#### Scenario: Разметка не протекает в собранные ресурсы
- **WHEN** модуль `uikit` собирается (`aapt2 compile`+`link`)
- **THEN** сборка SHALL завершаться успешно, а атрибуты namespace `sdds` SHALL отсутствовать в `R` и `resources.arsc`

### Requirement: Opt-in разметка компонентов через sdds:api_info
`declare-styleable`, описывающий API компонента, SHALL помечаться атрибутом `sdds:api_info`. Только помеченные `declare-styleable` SHALL попадать в мету; непомеченные SHALL игнорироваться.

#### Scenario: Один styleable — один компонент
- **WHEN** `<declare-styleable name="Button" sdds:api_info="Button">`
- **THEN** в мету SHALL попасть компонент с именем `Button`

#### Scenario: Один styleable — несколько компонентов
- **WHEN** `sdds:api_info` содержит список через запятую (напр. `sdds:api_info="TextField,TextArea"`)
- **THEN** в мету SHALL попасть по одному компоненту на каждое имя из списка с общей API-поверхностью

#### Scenario: Непомеченный styleable игнорируется
- **WHEN** `declare-styleable` не имеет атрибута `sdds:api_info`
- **THEN** он SHALL быть исключён из результирующей меты

### Requirement: Именование свойств — авто-strip префикса и явное переопределение
Для каждого размеченного `attr` идентификатор свойства (`id`) SHALL определяться так: если задан `sdds:api_name`, используется его значение; иначе `id` SHALL вычисляться отбрасыванием `resourcePrefix` модуля (`sd_`) от имени атрибута. `id` SHALL совпадать с ключом токен-конфига компонента.

Авто-strip — это удобный дефолт, но НЕ типовой случай: словарь имён styleable-атрибутов (Android-конвенции: `*Tint`/`*Appearance`/`*Padding`) систематически расходится со словарём токен-конфига (семантика ДС: `*Color`/`shape`/`*Margin`). Поэтому `sdds:api_name` SHALL проставляться на большинстве темизируемых атрибутов. Авторитетный источник значений `sdds:api_name` — маппинг `attr → ключ конфига`, зашитый в рукописных `*StyleGeneratorView` (пары `props.<key> → "sd_<attr>"` и enum-цвета `CONST("sd_attr") -> owner.<field>`); значение SHALL браться из `owner.<field>`, а не из имени enum-константы.

#### Scenario: Простой случай — отбрасывание префикса
- **WHEN** `<attr name="sd_valuePadding" format="dimension" />` без `sdds:api_name`
- **THEN** свойство SHALL иметь `id = "valuePadding"`

#### Scenario: Имя атрибута расходится с ключом конфига (типовой случай)
- **WHEN** `<attr name="sd_iconTint" sdds:api_name="iconColor" />` (генератор: `ICON_COLOR("sd_iconTint") -> owner.iconColor`)
- **THEN** свойство SHALL иметь `id = "iconColor"` и джойниться с ключом конфига `iconColor`

### Requirement: Ограничение покрытия — свойства конфига без sd_-атрибута
Разметка styleable SHALL покрывать только те свойства токен-конфига, у которых есть соответствующий `sd_`-атрибут в `declare-styleable` компонента. Свойства конфига, проецируемые генератором не на `sd_`-атрибут (framework-атрибут, drawable/selector, атрибут вложенного styleable), SHALL отсутствовать в текущей view-мете; сниженная (< 100%) доля покрытых ключей конфига для части компонентов SHALL считаться ожидаемой, а не дефектом разметки.

Целевая форма покрытия таких свойств универсальным view-генератором — **гибрид** (по образцу существующего compose-`HybridComponentConfigDelegate`): универсальная генерация для свойств, выразимых метой, плюс bespoke-код для остального. Механизм покрытия зависит от того, куда проецируется свойство:

- **Атрибуты вложенного styleable** (напр. размеры thumb/track у `Switch` → `SdSwitchDrawable`) — РЕАЛИЗОВАНО механизмом мультистайлбл-разметки: компонент-специфичный вложенный styleable (`Sd<Component>Drawable`) SHALL размечаться `sdds:api_info` + `sdds:api_name` и джойниться к компоненту по `componentNames` (тот же паттерн, что `SdAvatarStatus` → `Avatar`). Общие/базовые styleable (`SdCheckable`, `SdAlphaHelper`, `SdFocusSelector`, `SdDecoratedFieldBox`, `FrameLayout` и т.п.) SHALL NOT размечаться `api_info` одного компонента — они шарятся между компонентами.
- **Стандартные framework-атрибуты** (`height`→`android:minHeight`, `paddingStart`/`paddingEnd`→`android:padding*`, `labelColor`→`android:textColor`, `labelStyle`→`android:textAppearance`, `backgroundColor`→`android:backgroundTint`) — РЕАЛИЗОВАНО атрибутом `sdds:api_framework` на `<declare-styleable>` (см. отдельный requirement): т.к. framework-атрибут не объявлен в styleable как `<attr>`, биндинг `config-key → framework-attr:type` декларируется строкой на самом styleable и SHALL попадать в `params` со значением `attrName`, начинающимся с `android:`.
- **Свойства — параметры процедурной генерации** (`loadingAlpha`, `adjustment` и т.п.): НЕ имеют целевого атрибута — генератор потребляет их как входы алгоритма (напр. `loadingAlpha` → производный цвет `color.copy(alpha=…)` и инъекция item'а с drawable-состоянием `sd_state_loading` в генерируемый ColorStateList). Такие свойства SHALL отсутствовать в `params` как самостоятельные записи. Важно: view-генераторы drawable-РЕСУРСЫ НЕ создают — они производят `<style>`, state-list-ресурсы (`<selector>`/ColorStateList) и ColorState-классы; сами drawable строит рантайм-код компонента из атрибутов. Поэтому покрытие таких свойств — это НЕ «генерация drawable», а **движок сборки state-list'ов и производных значений**, управляемый `stateSets` и типами из меты. Движок универсален (общий алгоритм, не покомпонентные данные) и SHALL быть частью универсального view-генератора (вне данного change). Остаток покомпонентного знания (напр. какое цветовое свойство имеет loading-вариант) SHALL выражаться существующим общим механизмом состояний (`sdds:api_state`/`stateSets`) либо нормализовываться в движке; словарь `sdds:*` SHALL NOT расширяться покомпонентными флагами конкретных состояний (`api_loading`, `api_pressed` и т.п.) — см. отдельный requirement-принцип.

#### Scenario: Параметр процедурной генерации отсутствует в params
- **WHEN** конфиг компонента содержит ключ `loadingAlpha`, который генератор потребляет как параметр сборки ColorStateList (нет целевого атрибута — ни `sd_`, ни framework-биндинга)
- **THEN** `loadingAlpha` SHALL отсутствовать в `params` как самостоятельное свойство, и это НЕ SHALL считаться ошибкой разметки

### Requirement: Словарь sdds намеренно общий (без покомпонентных флагов)
Разметка `sdds:*` описывает API-поверхность styleable в общих терминах (атрибуты, типы, шов `id`↔конфиг, общий механизм состояний) и SHALL оставаться доменно-нейтральной. Словарь `sdds:*` SHALL NOT пополняться атрибутами, кодирующими конкретное состояние или поведение отдельного компонента (напр. `sdds:api_loading`, `sdds:api_pressed`, `sdds:api_hovered`). Семантика генерации (деривация значений, сборка state-list, alpha-правила) SHALL жить в движке генератора, а покомпонентная вариативность состояний SHALL выражаться общим `sdds:api_state` с именованными наборами (`stateSets`), а не выделенными флагами. Мотив: не допустить протечки деталей конкретного компонента в общий язык разметки и разрастания словаря по одному флагу на состояние.

#### Scenario: Покомпонентный флаг состояния отклоняется как подход
- **WHEN** для покрытия loading-поведения предлагается добавить атрибут вида `sdds:api_loading` на свойство
- **THEN** такой подход SHALL быть отклонён в пользу общего `sdds:api_state` (набор состояний) или нормализации правила в движке, чтобы словарь `sdds:*` не накапливал покомпонентные флаги состояний

### Requirement: Framework-биндинги через sdds:api_framework
Свойства конфига, проецируемые генератором на стандартный framework-атрибут (а не на `sd_`-атрибут), SHALL декларироваться атрибутом `sdds:api_framework` на элементе `<declare-styleable>`. Значение — список записей `configKey=android:attr:type`, разделённых `;`; тип (последний сегмент после `:`) SHALL принадлежать закрытому множеству `sdds:api_type`. Каждая запись SHALL становиться отдельным свойством в `params` с `id = configKey`, `attrName = "android:attr"`, соответствующим `type`. Некорректная запись или недопустимый тип SHALL приводить к ошибке генерации.

#### Scenario: Framework-биндинг попадает в params
- **WHEN** `<declare-styleable name="Button" sdds:api_info="Button" sdds:api_framework="height=android:minHeight:dimension;labelColor=android:textColor:color">`
- **THEN** мета Button SHALL содержать свойства `id="height"` (`attrName="android:minHeight"`, `type="dimension"`) и `id="labelColor"` (`attrName="android:textColor"`, `type="color"`)

### Requirement: Классификация типа свойства
Тип свойства SHALL определяться в порядке приоритета: явный `sdds:api_type`, затем `format` атрибута, затем keyword-эвристика по имени (как в compose-процессоре). Для `format="reference"`, если тип не удаётся однозначно вывести, SHALL использоваться `sdds:api_type`.

Допустимые значения `sdds:api_type` SHALL совпадать с семантическими типами compose-меты (`@SerialName` в `ComposePropertyMeta`) и ограничиваться закрытым множеством:
`color`, `dimension`, `typography`, `shape`, `shadow`, `icon`, `component_style`, `boolean`, `integer`, `float`, `value`.
Значение `unknown` — это внутренний fallback классификатора и SHALL NOT указываться в разметке явно. `sdds:api_type` с любым значением вне перечисленного множества SHALL считаться ошибкой генерации.

#### Scenario: Допустимое значение api_type принимается
- **WHEN** `sdds:api_type` равен одному из `color`/`dimension`/`typography`/`shape`/`shadow`/`icon`/`component_style`/`boolean`/`integer`/`float`/`value`
- **THEN** свойство SHALL получить соответствующий тип, переопределяя вывод по `format` и эвристике

#### Scenario: Недопустимое значение api_type отвергается
- **WHEN** `sdds:api_type` равен значению вне закрытого множества (в т.ч. `unknown`)
- **THEN** задача генерации SHALL завершаться ошибкой с указанием атрибута и недопустимого значения

#### Scenario: Дизамбигуация reference по api_type
- **WHEN** несколько атрибутов имеют `format="reference"` (напр. `sd_icon`, `sd_shapeAppearance`, `sd_iconTint`), а их семантика различна
- **THEN** тип каждого SHALL задаваться `sdds:api_type` (`icon`, `shape`, `color` соответственно)

#### Scenario: Тип из format
- **WHEN** `<attr name="sd_valuePadding" format="dimension" />`
- **THEN** свойство классифицируется как `dimension`

#### Scenario: Неоднозначный reference уточняется явно
- **WHEN** `<attr name="sd_icon" format="reference" sdds:api_type="icon" />`
- **THEN** свойство классифицируется как `icon`, а не как обобщённый reference

#### Scenario: enum-атрибут даёт список значений
- **WHEN** `attr` имеет `format="enum"` с вложенными `<enum name=".." value="N" />`
- **THEN** свойство классифицируется как `value` и SHALL содержать список значений с тройкой `(name, value, configName)`

### Requirement: Переименование значений enum
Значение `<enum>` SHALL проецироваться на ключ конфига через `sdds:api_name`, если он задан; иначе `configName` SHALL совпадать с атрибутом `name` элемента `<enum>`.

#### Scenario: enum-значение переименовано
- **WHEN** `<enum name="spaceBetween" value="1" sdds:api_name="space-between" />`
- **THEN** значение SHALL иметь `name="spaceBetween"`, `value=1`, `configName="space-between"`

### Requirement: Игнорирование не-темизируемых атрибутов
Атрибуты из namespace `android` и атрибуты без `sdds`-разметки, не подпадающие под авто-strip внутри размеченного styleable, SHALL исключаться из меты, если они не относятся к API-поверхности.

#### Scenario: android-атрибут исключён
- **WHEN** внутри размеченного styleable присутствует `<attr name="android:insetLeft" />`
- **THEN** он SHALL быть исключён из меты компонента

### Requirement: Разметка обходных случаев именования генерации
`declare-styleable` SHALL поддерживать `sdds:api_package` (для компонентов, имя которых конфликтует с зарезервированным словом языка генерации, напр. `switch` → `switcher` в имени пакета генерируемого `XxxColorState`). Атрибут `sdds:api_builder_fun` во view НЕ поддерживается: он моделировал имя фабричной функции compose-`StyleBuilder` (Kotlin style-объект), тогда как view-генерация производит XML-`<style>`-ресурсы и style-builder'а не имеет — концепт остаётся исключительно compose-специфичным.

#### Scenario: Обход зарезервированного слова
- **WHEN** `<declare-styleable name="Switch" sdds:api_info="Switch" sdds:api_package="switcher">`
- **THEN** мета компонента SHALL содержать `packageName = "switcher"`

### Requirement: Разметка наборов кастомных состояний
Кастомные (не-framework) состояния компонента SHALL размечаться так, чтобы мета несла для каждого состояния: имя набора (`sdds:api_state`), флейвор drawable-состояния (`sdds:api_state_kind` ∈ `android` | `shared` | `scoped`), ключ конфига (`sdds:api_name`) и детерминированный порядок. Framework-состояния (`focused`/`pressed`/`hovered`/`activated`/`checked`) SHALL разрешаться автоматически без разметки.

`sdds:api_state` моделирует **enum-driven наборы взаимоисключающих состояний** с рантайм-контрактом ordinal (напр. `Avatar.Status`: `NONE`/`ACTIVE`/`INACTIVE`, читается по `getInt`-ordinal) — именно для них позиция задаёт ordinal и генерируется `XxxColorState`-enum. Категории состояний, которые `sdds:api_state` покрывать НЕ должен:
- **framework-состояния** — разрешаются автоматически по имени;
- **shared булевы состояния** (`sd_state_loading`/`error`/`indeterminate`/`collapsed`, тональные `primary`…`clear` из общих `SdInteractiveState`/`SdViewState`) — общий словарь, разрешается по имени, SHALL NOT размечаться `api_state` одного компонента;
- **независимые (не взаимоисключающие) scoped-булевы состояния** (напр. `SdTextFieldState`: `readonly` + `inner_label`, которые могут быть истинны одновременно) — их SHALL NOT размечать как `api_state`-набор, т.к. модель набора с ordinal изобразила бы их упорядоченным enum и ввела потребителя в заблуждение; генератор трактует их как независимые предикаты state-list (`addToStateList(..., extraAttrs)`), а не как `ColorState`-enum. Поддержка независимых scoped-булевых состояний в мете — отдельный вопрос модели, вне данного change.

#### Scenario: Кастомное состояние привязано к набору
- **WHEN** `<attr name="sd_status_active" format="boolean" sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="active" />` (реально существующий в `SdAvatarStatus` атрибут)
- **THEN** в мете набор `AvatarStatus` SHALL содержать состояние с `configName="active"`, флейвором `scoped` и позицией, задающей его ordinal

#### Scenario: Framework-состояние не требует разметки
- **WHEN** ключ состояния в конфиге равен `pressed`/`hovered`/`activated`/`checked`/`focused`
- **THEN** состояние SHALL разрешаться в соответствующий `android:state_*` без `sdds`-разметки


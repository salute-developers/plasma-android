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

Значение `sdds:api_info` — это **логическое имя компонента**, то есть join key с токен-конфигом темы и с делегатами генерации (`Component.componentName`/имя, под которым компонент зарегистрирован в `componentDelegates`). Оно SHALL NOT выводиться из имени `declare-styleable`: имена совпадают в большинстве случаев, но систематически расходятся там, где uikit-класс называется иначе, чем компонент дизайн-системы (`CellLayout`→`Cell`, `ListView`→`List`, `ListItemView`→`ListItem`, `ImageView`→`Image`, `ModalView`→`Modal`, `AccordionItemView`→`AccordionItem`, `DropdownEmptyStateView`→`DropdownEmptyState`), и там, где один styleable обслуживает несколько компонентов (`Button`→`BasicButton`/`IconButton`/`LinkButton`, `TextField`→`TextField`/`TextArea`, `Badge`→`Badge`/`IconBadge`, `Note`→`Note`/`NoteCompact`).

Имя uikit-класса, если оно нужно генерации, SHALL задаваться отдельно через `sdds:api_core_name` (см. соответствующий requirement), а не через `sdds:api_info`.

#### Scenario: Один styleable — один компонент
- **WHEN** `<declare-styleable name="Avatar" sdds:api_info="Avatar">`
- **THEN** в мету SHALL попасть компонент с именем `Avatar`

#### Scenario: Имя styleable отличается от имени компонента
- **WHEN** `<declare-styleable name="CellLayout" sdds:api_info="Cell">`
- **THEN** в мету SHALL попасть компонент с именем `Cell`, и оно SHALL резолвиться в запись компонента `cell` в конфиге темы

#### Scenario: Один styleable — несколько компонентов
- **WHEN** `sdds:api_info` содержит список через запятую (напр. `sdds:api_info="TextField,TextArea"`)
- **THEN** в мету SHALL попасть по одному компоненту на каждое имя из списка с общей API-поверхностью

#### Scenario: Вложенный styleable привязывается к компоненту
- **WHEN** компонент-специфичный вложенный styleable помечен именем компонента (напр. `<declare-styleable name="SdAvatarStatus" sdds:api_info="Avatar">`)
- **THEN** его свойства и привязки состояний SHALL сливаться с остальными записями того же компонента

#### Scenario: Непомеченный styleable игнорируется
- **WHEN** `declare-styleable` не имеет атрибута `sdds:api_info`
- **THEN** он SHALL быть исключён из результирующей меты

### Requirement: Именование свойств — авто-strip префикса и явное переопределение
Для каждого размеченного `attr` идентификатор свойства (`id`) SHALL определяться так: если задан `sdds:api_name`, используется его значение; иначе `id` SHALL вычисляться отбрасыванием `resourcePrefix` модуля (`sd_`) от имени атрибута. `id` SHALL совпадать с ключом токен-конфига компонента.

Авто-strip — это удобный дефолт, но НЕ типовой случай: словарь имён styleable-атрибутов (Android-конвенции: `*Tint`/`*Appearance`/`*Padding`) систематически расходится со словарём токен-конфига (семантика ДС: `*Color`/`shape`/`*Margin`). Поэтому `sdds:api_name` SHALL проставляться на большинстве темизируемых атрибутов.

Один ключ конфига MAY быть привязан к нескольким атрибутам: несколько `<attr>` с одинаковым `sdds:api_name` SHALL давать несколько записей в `params` с общим `id` и разными `attrName`/`resSuffix` (напр. `width` → `android:minWidth` и `android:maxWidth`).

#### Scenario: Простой случай — отбрасывание префикса
- **WHEN** `<attr name="sd_valuePadding" format="dimension" />` без `sdds:api_name`
- **THEN** свойство SHALL иметь `id = "valuePadding"`

#### Scenario: Имя атрибута расходится с ключом конфига (типовой случай)
- **WHEN** `<attr name="sd_iconTint" sdds:api_name="iconColor" />`
- **THEN** свойство SHALL иметь `id = "iconColor"` и джойниться с ключом конфига `iconColor`

#### Scenario: Один ключ конфига на нескольких атрибутах
- **WHEN** в styleable объявлены `<attr name="android:minWidth" sdds:api_name="width" sdds:api_res_suffix="min_width" />` и `<attr name="android:maxWidth" sdds:api_name="width" sdds:api_res_suffix="max_width" />`
- **THEN** в `params` SHALL попасть две записи с `id="width"` и разными `attrName`/`resSuffix`

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
Атрибуты без `sdds`-разметки, не подпадающие под авто-strip внутри размеченного styleable, SHALL исключаться из меты, если они не относятся к API-поверхности.

Атрибуты из namespace `android` SHALL попадать в мету **тогда и только тогда**, когда они несут явную разметку — `sdds:api_name` либо разметку, задающую значение или место эмиссии (`sdds:api_placement`, `sdds:api_value`). Неразмеченные `android:*` SHALL игнорироваться. Такой opt-in заменяет собой ранее существовавший механизм `sdds:api_framework`: framework-атрибуты объявляются обычными элементами `<attr name="android:*">` внутри `declare-styleable` (эта форма уже широко используется в ресурсах uikit), что позволяет применять к ним весь per-attr словарь (`sdds:api_type`, `sdds:api_res_suffix`, `sdds:api_placement`, `sdds:api_state_value`).

Для framework-атрибутов `format` в месте использования отсутствует, поэтому тип SHALL задаваться `sdds:api_type`.

#### Scenario: Размеченный framework-атрибут попадает в мету
- **WHEN** `<attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color" sdds:api_res_suffix="text_color" />`
- **THEN** в `params` SHALL попасть свойство `id="labelColor"`, `attrName="android:textColor"`, `type="color"`, `resSuffix="text_color"`

#### Scenario: Неразмеченный android-атрибут исключён
- **WHEN** внутри размеченного styleable присутствует `<attr name="android:insetLeft" />` без `sdds`-разметки
- **THEN** он SHALL быть исключён из меты компонента

### Requirement: Разметка обходных случаев именования генерации
`sdds:api_package` во view SHALL NOT поддерживаться: он моделировал per-component пакет генерируемых Kotlin-сущностей, тогда как View-генерация складывает все `XxxColorState` в один плоский пакет `<base>.colorstate`; per-component пакеты существуют только в Compose, а compose-мета формируется KSP-процессором, а не XML-разметкой. `sdds:api_builder_fun` во view также НЕ поддерживается: он моделировал имя фабричной функции compose-`StyleBuilder`, тогда как view-генерация производит XML-`<style>`-ресурсы и style-builder'а не имеет.

Обходные случаи именования генерируемых сущностей во view SHALL решаться атрибутом `sdds:api_core_name` (имена `XxxColorState`, attrs-файла и styleable темы) и `sdds:api_res_suffix` (имена генерируемых ресурсов).

#### Scenario: Разметка пакета отвергается как неприменимая
- **WHEN** на `declare-styleable` указан `sdds:api_package`
- **THEN** атрибут SHALL игнорироваться view-парсером и SHALL NOT влиять на мету

### Requirement: Разметка наборов кастомных состояний
Базовой единицей описания состояний SHALL быть **привязка состояния**: `configName` (ключ состояния в токен-конфиге) → drawable-атрибут, флейвор (`sdds:api_state_kind` ∈ `android` | `shared` | `scoped`) и значение (`true`, либо `false` при `sdds:api_state_negated="true"`). Привязка размечается на элементе `<attr>`, имя которого и есть drawable-атрибут; ключ конфига задаётся `sdds:api_name`.

`sdds:api_state` SHALL группировать привязки в **именованный набор**. Позиция привязки в наборе SHALL NOT нести семантики: она не является рантайм-контрактом и не задаёт ordinal. Для enum-driven наборов взаимоисключающих состояний (напр. `Avatar.Status`) авторитетным источником рантайм-порядка SHALL быть `value` соответствующих элементов `<enum>` темизируемого свойства (`sd_status`), которые мета уже несёт в значениях свойства; разметка состояний SHALL NOT дублировать этот порядок.

Ключи состояний в привязках SHALL быть согласованы с `configName` значений соответствующего enum-свойства, если такое свойство есть: рассинхрон имён приводит к элементу state-list, который никогда не сматчится, и SHALL выявляться проверкой.

Несколько привязок с **одним и тем же** `sdds:api_name` внутри набора SHALL образовывать **составное состояние**: одно имя состояния конфига разворачивается в несколько атрибутов элемента state-list.

Состояния, разрешаемые без разметки, SHALL NOT размечаться:
- **framework-состояния** (`focused`/`pressed`/`hovered`/`activated`/`checked`/`selected`) — резолвятся по имени в `android:state_*`;
- **shared булевы состояния** из общего словаря `sd_state_*` (`loading`/`error`/`readonly`/`indeterminate`/`collapsed`, тональные `primary`…`clear`) — резолвятся по имени в `app:sd_state_<name>`.

Разметка требуется там, где имя состояния конфига НЕ разрешается по этим правилам: собственный scoped-атрибут (`sd_status_active`), ремап на другой framework-атрибут (`selected` → `android:state_checked` у компонентов-`Checkable`), составное состояние.

#### Scenario: Одиночная scoped-привязка
- **WHEN** `<attr name="sd_status_active" format="boolean" sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="active" />`
- **THEN** набор `AvatarStatus` SHALL содержать привязку `configName="active"` → `sd_status_active="true"` с флейвором `scoped`

#### Scenario: Ремап имени состояния на framework-атрибут
- **WHEN** `<attr name="android:state_checked" sdds:api_state="SegmentItemSelection" sdds:api_state_kind="android" sdds:api_name="selected" />`
- **THEN** состояние конфига `selected` для этого компонента SHALL разворачиваться в `android:state_checked="true"`, а не в `android:state_selected`

#### Scenario: Составное состояние из двух привязок
- **WHEN** внутри одного набора объявлены `<attr name="android:state_focused" … sdds:api_name="focused" />` и `<attr name="android:state_activated" … sdds:api_name="focused" sdds:api_state_negated="true" />`
- **THEN** состояние конфига `focused` SHALL разворачиваться в пару атрибутов `android:state_focused="true"` и `android:state_activated="false"`

#### Scenario: Framework- и shared-состояния не требуют разметки
- **WHEN** ключ состояния в конфиге равен `pressed`/`hovered`/`activated`/`checked`/`focused`/`selected` либо присутствует в общем словаре `sd_state_*`
- **THEN** состояние SHALL разрешаться автоматически и SHALL NOT требовать `sdds`-разметки

#### Scenario: Рассинхрон ключа состояния с enum-значением выявляется
- **WHEN** компонент имеет enum-свойство со значением `configName="active"` и привязку состояния, размеченную как `sdds:api_name="activated"`
- **THEN** проверка согласованности SHALL сообщать об ошибке, а не порождать недостижимый элемент state-list

### Requirement: Идентичность компонента в разметке
`declare-styleable` SHALL нести идентичность обслуживаемых компонентов: `sdds:api_def_style_attr` (атрибут стиля по умолчанию), `sdds:api_parent` (родительский стиль из uikit) и `sdds:api_core_name` (сид имён генерируемых сущностей — `XxxColorState`, attrs-файла и styleable темы; дефолт — значение `sdds:api_info`).

Идентичность SHALL задаваться **per-component**, т.к. один styleable может обслуживать несколько компонентов с разными `defStyleAttr` и родителем. Формат значения — список записей `componentName=value`, разделённых `;`; при единственном компоненте допускается голое значение.

Все три атрибута описывают знание uikit (`Sdds.Components.*` объявлены в самом uikit, `sd_*Style`/`android:*Style` — атрибуты uikit и фреймворка) и SHALL NOT содержать имён, специфичных для конкретной темы. Имя стиля темы и префикс генерируемых dimen'ов SHALL по-прежнему приходить из конфига темы, а не из разметки.

#### Scenario: Однокомпонентный styleable
- **WHEN** `<declare-styleable name="Avatar" sdds:api_info="Avatar" sdds:api_def_style_attr="sd_avatarStyle" sdds:api_parent="Sdds.Components.Avatar">`
- **THEN** мета компонента `Avatar` SHALL содержать `defStyleAttr="sd_avatarStyle"`, `parent="Sdds.Components.Avatar"`, `coreName="Avatar"`

#### Scenario: Мультикомпонентный styleable с разной идентичностью
- **WHEN** `sdds:api_info="BasicButton,IconButton,LinkButton"`, `sdds:api_def_style_attr="BasicButton=android:buttonStyle;IconButton=sd_iconButtonStyle;LinkButton=sd_linkButtonStyle"`, `sdds:api_core_name="BasicButton=Button"`
- **THEN** каждый из трёх компонентов SHALL получить свой `defStyleAttr`, при этом `BasicButton` SHALL получить `coreName="Button"`, а `IconButton`/`LinkButton` — `coreName`, равный их именам

#### Scenario: Отсутствие обязательной идентичности — ошибка
- **WHEN** размеченный `declare-styleable` не задаёт `sdds:api_def_style_attr` или `sdds:api_parent` для одного из перечисленных компонентов
- **THEN** задача генерации SHALL завершаться ошибкой с указанием компонента и отсутствующего атрибута

### Requirement: Область владения палитрой ColorState
Разметка SHALL задавать, кому принадлежит палитра цветовых состояний компонента — классу uikit или виду компонента, — атрибутом `sdds:api_color_state_scope` на `declare-styleable` со значениями `class` (по умолчанию) и `variety`. Значение SHALL задаваться per-component в том же формате `componentName=value;…`, что и остальная идентичность.

`class` SHALL означать, что имена генерируемых сущностей палитры (enum `XxxColorState`, boolean-атрибуты состояний, enum-атрибут `<prefix>_xxxColors`) образуются от `sdds:api_core_name`, и все виды компонента ссылаются на одну сущность. `variety` SHALL означать, что имена образуются от вида компонента в конфиге темы, и каждый вид получает собственную сущность.

`variety` SHALL применяться там, где виды одного класса набирают разные палитры: общая сущность в этом случае либо перезатирается видом, сгенерированным последним, либо заставляет вид ссылаться на состояния, которых у него нет.

Значение вне закрытого списка SHALL прерывать генерацию.

#### Scenario: По умолчанию палитра принадлежит классу
- **WHEN** `declare-styleable` компонента `Badge` не задаёт `sdds:api_color_state_scope`
- **THEN** мета SHALL содержать `colorStateScope="class"`, а все виды (`badge-clear`, `badge-solid`, `badge-transparent`) SHALL ссылаться на `BadgeColorState`

#### Scenario: Палитра принадлежит виду компонента
- **WHEN** `<declare-styleable name="Counter" … sdds:api_color_state_scope="variety">`
- **THEN** вид `counter` SHALL получить `CounterColorState`, а вид `segment-item-counter` — собственный `SegmentItemCounterColorState` со своей парой состояний

#### Scenario: Область задаётся только одному компоненту мультикомпонентного styleable
- **WHEN** `sdds:api_info="BasicButton,IconButton,LinkButton"` и `sdds:api_color_state_scope="IconButton=variety"`
- **THEN** `IconButton` SHALL получить `colorStateScope="variety"`, а `BasicButton` и `LinkButton` SHALL сохранить `class`

#### Scenario: Недопустимое значение — ошибка
- **WHEN** `sdds:api_color_state_scope="appearance"`
- **THEN** задача генерации SHALL завершаться ошибкой с именем атрибута и списком допустимых значений

### Requirement: Имя генерируемого ресурса через sdds:api_res_suffix
Свойство SHALL нести суффикс имени генерируемого ресурса (`@dimen`, `@color`, `@xml`-селектор). По умолчанию суффикс SHALL вычисляться как snake_case от имени атрибута без `resourcePrefix` и без namespace-префикса (`android:minWidth` → `min_width`, `sd_valuePadding` → `value_padding`). `sdds:api_res_suffix` SHALL переопределять дефолт.

Суффикс SHALL разрешаться в контексте конкретного `declare-styleable`: один и тот же атрибут MAY иметь разные суффиксы у разных компонентов.

#### Scenario: Суффикс выводится по умолчанию
- **WHEN** `<attr name="sd_valuePadding" format="dimension" />` без `sdds:api_res_suffix`
- **THEN** свойство SHALL иметь `resSuffix = "value_padding"`

#### Scenario: Суффикс переопределён
- **WHEN** `<attr name="sd_boxTint" sdds:api_name="backgroundColor" sdds:api_res_suffix="bg_color" />`
- **THEN** свойство SHALL иметь `resSuffix = "bg_color"`

#### Scenario: Один атрибут — разные суффиксы в разных компонентах
- **WHEN** `sd_background` размечен как `bg_color` в одном styleable и как `background_color` в другом
- **THEN** каждая запись меты SHALL нести суффикс своего styleable

### Requirement: Размещение атрибута через sdds:api_placement
Свойство SHALL нести признак размещения генерируемого `<item>`: `style` (основной стиль компонента, значение по умолчанию) либо `overlay` (ThemeOverlay-стиль вариации). Размещение `overlay` предназначено для атрибутов, которые задают стиль по умолчанию вложенных компонентов и работают только будучи применёнными как тема.

#### Scenario: Атрибут уходит в ThemeOverlay
- **WHEN** `<attr name="android:checkboxStyle" sdds:api_name="checkBoxStyle" sdds:api_type="component_style" sdds:api_placement="overlay" />`
- **THEN** соответствующий `<item>` SHALL эмитироваться в ThemeOverlay-стиль вариации, а не в основной стиль компонента

#### Scenario: Дефолтное размещение
- **WHEN** `sdds:api_placement` не задан
- **THEN** свойство SHALL размещаться в основном стиле компонента

### Requirement: Вложенная семья стилей через sdds:api_sub_style
Компонент MAY генерировать не один стиль на вариацию, а пару: собственный стиль и стиль вложенного вида (контент карточки, группа чипов поля ввода). Такая семья SHALL объявляться на отдельном `declare-styleable` через `sdds:api_sub_style` (суффикс имени стиля) и `sdds:api_style_ref` (атрибут, которым владелец на неё ссылается); `sdds:api_sub_style_kind` SHALL принимать значения `style` (семья стилей плюс её ThemeOverlay) либо `overlay` (только ThemeOverlay), по умолчанию `style`.

Вложенная семья SHALL повторять дерево вариаций владельца и SHALL NOT нести идентичность: она не самостоятельный компонент. Ссылки на неё SHALL публиковаться только тогда, когда у вариации есть собственные значения свойств семьи, — иначе тема ссылалась бы на пустой стиль.

#### Scenario: Семья стилей вложенного вида
- **WHEN** `<declare-styleable name="CardContent" sdds:api_info="Card" sdds:api_sub_style="Content" sdds:api_style_ref="sd_cardContentStyle" sdds:api_parent="Sdds.Components.CardContent">`
- **THEN** для каждой вариации SHALL генерироваться стиль `Components.<Компонент>Content.<Вариация>`, а ссылка на него SHALL публиковаться атрибутом `sd_cardContentStyle`

#### Scenario: Только ThemeOverlay
- **WHEN** `sdds:api_sub_style_kind="overlay"`
- **THEN** SHALL генерироваться только ThemeOverlay-стиль вариации, а ссылка на него SHALL публиковаться в стиле вариации владельца

#### Scenario: Объявление без атрибута ссылки
- **WHEN** `sdds:api_sub_style` задан без `sdds:api_style_ref`
- **THEN** задача генерации SHALL завершаться ошибкой: неизвестно, каким атрибутом владелец ссылается на семью

### Requirement: Ссылка на ThemeOverlay через sdds:api_placement="theme"
Свойство MAY нести размещение `theme` — тогда в стиль вариации SHALL эмитироваться ссылка на ThemeOverlay: собственный ThemeOverlay вариации, если свойство объявлено в `declare-styleable` компонента, либо ThemeOverlay вложенной семьи, если оно объявлено в её `declare-styleable`. Ссылка SHALL публиковаться, только если целевой ThemeOverlay несёт что-то помимо стандартной ссылки на стиль вариации.

#### Scenario: Тема вложенного вида
- **WHEN** `<attr name="android:theme" sdds:api_placement="theme" />` объявлен в `declare-styleable` вложенной семьи
- **THEN** стиль вариации владельца SHALL получить `android:theme` со ссылкой на ThemeOverlay этой семьи

### Requirement: Вычисляемое и условное значение через sdds:api_value и sdds:api_when
Свойство MAY получать значение не из ключа токен-конфига, а из разметки — через `sdds:api_value`. Значение этого атрибута SHALL соответствовать закрытой грамматике из двух форм: литерал (печатается как есть) либо `ratio(<ключ>,<ключ>)` (частное двух числовых значений конфига); любая иная форма SHALL считаться ошибкой генерации. Эмиссия MAY ограничиваться условием `sdds:api_when="<ключ конфига>=<значение>"`.

Framework-атрибуты (`android:*`) SHALL попадать в мету не только по `sdds:api_name`, но и по любой разметке, задающей значение или место эмиссии (`sdds:api_placement`, `sdds:api_value`): такая разметка так же явно объявляет атрибут частью API компонента.

#### Scenario: Соотношение сторон
- **WHEN** `<attr name="sd_aspectRatio" sdds:api_value="ratio(width,height)" />`
- **THEN** значение атрибута SHALL вычисляться как частное значений конфига `width` и `height`

#### Scenario: Условная константа
- **WHEN** `<attr name="sd_fsDuplicateParentState" sdds:api_value="true" sdds:api_when="fsTarget=content" />`
- **THEN** `<item>` SHALL эмитироваться со значением `true` только у вариаций, где ключ конфига `fsTarget` равен `content`

#### Scenario: Неразбираемое выражение отвергается
- **WHEN** значение `sdds:api_value` имеет форму `ratio(...)` с числом аргументов, отличным от двух
- **THEN** задача генерации SHALL завершаться ошибкой с указанием атрибута

### Requirement: Значение под состоянием через sdds:api_state_value
Свойство MAY нести дополнительное значение, применяемое под конкретным состоянием, через `sdds:api_state_value`. Значение атрибута SHALL быть списком записей, разделённых `;`, с закрытой грамматикой из двух форм:

- `<state>=<configKey>` — значение берётся из другого ключа токен-конфига (алиасный ключ);
- `<state>=alpha(<configKey>)` — значение выводится из базового значения свойства применением альфы из указанного ключа конфига (производное значение).

`<state>` SHALL разрешаться теми же правилами, что и прочие состояния. Любая иная форма SHALL считаться ошибкой генерации.

Обе формы описывают одно и то же с точки зрения потребителя: дополнительный элемент state-list под указанным состоянием. Разметка перечисляет свойства, участвующие в состоянии, поимённо — набор участников несущий и не выводится автоматически.

#### Scenario: Алиасный ключ конфига
- **WHEN** `<attr name="sd_valueColor" sdds:api_name="valueColor" sdds:api_state_value="readonly=valueColorReadOnly" />`
- **THEN** мета свойства SHALL содержать привязку состояния `readonly` к ключу конфига `valueColorReadOnly`

#### Scenario: Производное значение с альфой
- **WHEN** `<attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color" sdds:api_state_value="loading=alpha(loadingAlpha)" />`
- **THEN** мета свойства SHALL содержать привязку состояния `loading` к базовому значению с альфой из ключа `loadingAlpha`

#### Scenario: Недопустимая форма отвергается
- **WHEN** значение `sdds:api_state_value` не соответствует ни одной из двух форм
- **THEN** задача генерации SHALL завершаться ошибкой с указанием атрибута и некорректной записи

### Requirement: Полнота разметки относительно генерируемого вывода
Для каждого компонента, обслуживаемого универсальным View-генератором, разметка SHALL покрывать все привязки, необходимые для воспроизведения текущего вывода: ключ конфига (`sdds:api_name`), целевой атрибут, имя генерируемого ресурса, размещение и состояния. Полнота SHALL проверяться автоматически — фикстурой, снятой с компонент-специфичных генераторов до их удаления, и семантическим сравнением перегенерированных ресурсов.

Разметка SHALL добавляться **по мере необходимости**: если дефолтных правил (авто-strip, вывод суффикса из имени атрибута, разрешение состояний по имени, дефолтное размещение) достаточно для прохождения проверки, дополнительная разметка SHALL NOT добавляться.

#### Scenario: Недостающая привязка обнаруживается тестом
- **WHEN** для компонента разметка не покрывает свойство, которое эмитировал удалённый генератор
- **THEN** тест полноты разметки SHALL падать с указанием компонента и недостающей привязки

#### Scenario: Дефолтов достаточно — разметка не добавляется
- **WHEN** для атрибута дефолтные правила дают верные `id`, тип, суффикс и размещение
- **THEN** дополнительные `sdds:*`-атрибуты SHALL NOT проставляться

### Requirement: Расширение словаря только под доказанную потребность
Детали поведения конкретного компонента SHALL NOT протекать в общий словарь `sdds:*`. Если по ходу разметки обнаруживается случай, не выражаемый текущим словарём, решение SHALL приниматься в следующем порядке приоритета:

1. вывод компонент-специфичного генератора доказуемо избыточен, некорректен или теряет данные, а внешних ссылок на затронутые ресурсы нет → вывод **нормализуется**, расхождение фиксируется как согласованное и подтверждается семантическим сравнением и скриншот-тестами;
2. случай выражается существующими атрибутами словаря → используется существующая запись;
3. требуется новая грамматика, но она параметризована состоянием, ключом конфига или значением и покрывает **категорию** случаев → слово добавляется в словарь;
4. запись получилась бы покомпонентным флагом (имя компонента, имя конкретного состояния, конкретное поведение одного генератора) → слово SHALL NOT добавляться; применяется пункт 1.

Компонент-специфичные ветвления SHALL NOT переноситься и в код генератора: отсутствие слова в словаре не является поводом завести исключение в движке. Случай, который не удаётся закрыть ни одним из четырёх пунктов, SHALL эскалироваться как отдельное решение по объёму change'а, а не разрешаться покомпонентным кодом или покомпонентной разметкой.

#### Scenario: Покомпонентный флаг отклоняется в пользу нормализации
- **WHEN** для воспроизведения поведения одного компонента потребовалось бы слово, кодирующее его частный случай
- **THEN** слово SHALL NOT добавляться, а вывод SHALL нормализовываться по пункту 1

#### Scenario: Параметризованное слово допустимо
- **WHEN** новая грамматика параметризована состоянием/ключом/значением и применима к любому компоненту с той же формой случая
- **THEN** слово MAY быть добавлено в словарь

#### Scenario: Исключение в движке отклоняется
- **WHEN** предлагается закрыть случай ветвлением по имени компонента внутри универсального генератора
- **THEN** такое решение SHALL быть отклонено

#### Scenario: Избыточный вывод нормализуется вместо расширения словаря
- **WHEN** компонент-специфичный генератор порождает ресурс, побайтово дублирующий уже генерируемый другим компонентом, и внешних ссылок на него нет
- **THEN** вывод SHALL нормализовываться (с фиксацией согласованного семантического отличия), а словарь `sdds:*` SHALL NOT расширяться ради его воспроизведения

#### Scenario: Случай выражается существующими средствами
- **WHEN** для нового случая существует запись через уже имеющиеся атрибуты (напр. составное состояние через две привязки с одним `sdds:api_name`)
- **THEN** SHALL использоваться существующая запись, а новое слово SHALL NOT вводиться

### Requirement: Владение adjustment формы через sdds:api_shape_adjustment
`sd_shapeAppearanceAdjustment` объявлен в styleable `SdShape` парно к `sd_shapeAppearance` и в стиле встречается один раз — на все формы компонента. Поэтому shape-свойство SHALL нести признак владения этим атрибутом, задаваемый разметкой `sdds:api_shape_adjustment` со значениями `true`/`false`.

По умолчанию владельцем SHALL быть основной `<prefix>shapeAppearance`; прочие shape-атрибуты (`sd_externalShapeAppearance`, `sd_itemShapeAppearance`, …) adjustment SHALL NOT печатать, пока владение не задано явно. Разметка на свойстве, тип которого не `shape`, SHALL завершать разбор ошибкой.

#### Scenario: Дефолтный владелец — основная форма
- **WHEN** `<attr name="sd_shapeAppearance" sdds:api_name="shape" />` размечен без `sdds:api_shape_adjustment`
- **THEN** свойство SHALL владеть `sd_shapeAppearanceAdjustment`

#### Scenario: Прочие формы adjustment не печатают
- **WHEN** компонент несёт `sd_externalShapeAppearance` и `sd_internalShapeAppearance` без явной разметки
- **THEN** ни одно из этих свойств SHALL NOT владеть `sd_shapeAppearanceAdjustment`

#### Scenario: Владение задаётся явно
- **WHEN** `<attr name="sd_itemSelectorShapeAppearance" sdds:api_name="itemSelectorShape" sdds:api_shape_adjustment="true" />`
- **THEN** adjustment SHALL печататься рядом с этой формой

#### Scenario: Разметка на не-shape свойстве отклоняется
- **WHEN** `sdds:api_shape_adjustment` задан на свойстве типа `dimension`
- **THEN** разбор разметки SHALL завершаться ошибкой

### Requirement: Один атрибут — одна запись в declare-styleable
Атрибут SHALL быть объявлен внутри `declare-styleable` не более одного раза: повторное объявление ловится android lint как `DuplicateDefinition` и делает тему несобираемой. Несколько ключей токен-конфига, проецируемых в один XML-атрибут, SHALL выражаться `sdds:api_state_value` либо нормализацией конфига, а не вторым `<attr>`.

#### Scenario: Дубль атрибута отклоняется
- **WHEN** `declare-styleable` содержит два `<attr>` с одинаковым `name`
- **THEN** `lintDebug` модуля `uikit` SHALL падать с `DuplicateDefinition`, и разметка SHALL исправляться удалением дубля


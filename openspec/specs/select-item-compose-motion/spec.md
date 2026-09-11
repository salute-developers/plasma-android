# select-item-compose-motion Specification

## Purpose

Определить StatefulValue-стиль и Motion заливок SelectItem, переключение формы и размеров без анимации, семантическую выбранность и общий контекст встроенных компонентов, совместимость API, генерацию и документацию.

## Requirements

### Requirement: SelectItem exposes stateful visual values

SelectItemStyle SHALL предоставлять `shapes: StatefulValue<Shape>`. SelectItemColors SHALL предоставлять backgroundBrush и iconBrush типа StatefulValue<Brush>. SelectItemDimensions SHALL предоставлять controlSizeValues, controlMarginValues, paddingStartValues, paddingEndValues, paddingTopValues, paddingBottomValues и heightValues типа StatefulValue<Dp>. Отрисовка SHALL разрешать эти значения через полный MotionContext элемента. itemType, disableAlpha, checkBoxStyle, cellStyle, iconSource и deprecated icon SHALL сохранять существующие типы и defaults.

#### Scenario: Selection affects color and dimensions
- **WHEN** checked меняется и стиль задаёт другие фон, tint, высоту, controlSize/controlMargin и padding для Selected
- **THEN** компонент использует значения нового состояния для каждого соответствующего свойства

#### Scenario: Gradient and arbitrary shape
- **WHEN** стиль содержит градиентный Brush и Shape, не являющуюся CornerBasedShape
- **THEN** SelectItem отображает градиент и разрешённую форму без преобразования в Color или сужения типа формы

### Requirement: SelectItem legacy style adapters preserve ordinary callers

Старые shape, цвета и размеры SHALL сохранять типы и иметь Deprecated/ReplaceWith. Getters формы и размеров SHALL возвращать default-значения нового контракта. Цветовые getters SHALL возвращать Color.Transparent.asInteractive(), как в Cell/Chip. Все default и комбинированные состояния старых цветовых builder-вызовов SHALL сохраняться в новом Brush-контракте; обратная адаптация Brush в InteractiveColor не требуется. Builder-ы SHALL сохранять обычные Shape/Dp/Color/InteractiveColor-вызовы и принимать соответствующие StatefulValue, а цветовые builder-ы — также Brush. Имена параметров и существующий ImageSource/drawable-контракт SHALL сохраняться. Требование дополнить собственные реализации style/builder-интерфейсов SHALL быть документировано.

#### Scenario: Existing builder and getters
- **WHEN** существующий код строит SelectItemStyle обычными вызовами и читает прежние свойства
- **THEN** код компилируется, defaults сохраняются, а getters возвращают ожидаемые старые типы

#### Scenario: Legacy combined colors
- **WHEN** цвет задаётся InteractiveColor с default, selected и selected+pressed
- **THEN** все три значения доступны через новый Brush-контракт; deprecated legacy-getter возвращает Transparent

#### Scenario: Gradient fallback
- **WHEN** новое Brush-свойство содержит градиент для состояния
- **THEN** реальная отрисовка использует градиент, а legacy InteractiveColor для этого состояния возвращает прозрачный цвет согласно документации

### Requirement: SelectItem Motion API covers its own visual properties

Библиотека SHALL предоставлять SelectItemMotionStyle, SelectItemMotionStyleBuilder, LocalSelectItemMotionStyle и rememberSelectItemMotion. Стиль SHALL содержать backgroundColor/iconColor типа MotionProperty<Brush>. Форма и все семь размеров SHALL разрешаться через getValueAsState(motion.context), без MotionProperty<Dp> и без дополнительных адаптеров неконечных значений. Все defaults SHALL быть noMotion(). Каждое свойство SHALL управлять соответствующим значением отрисовки. remember-helper SHALL использовать переданные стиль/контекст, а по умолчанию — локальный стиль и независимый запоминаемый контекст.

#### Scenario: Timed brushes and immediate dimensions
- **WHEN** для фона и tint настроены переходы и изменяется состояние, влияющее также на размеры
- **THEN** заливки проходят промежуточные значения и достигают целевых за настроенную длительность, а размеры сразу переключаются через getValueAsState

#### Scenario: Local override and default noMotion
- **WHEN** rememberSelectItemMotion вызывается без style
- **THEN** используется LocalSelectItemMotionStyle; без его переопределения значения переключаются без новой анимационной задержки

#### Scenario: Unspecified dimension
- **WHEN** размер содержит Dp.Unspecified или другое неконечное значение
- **THEN** значение не интерполируется в NaN-геометрию, а сохраняет прежнюю семантику размерного модификатора

### Requirement: SelectItem overloads retain existing call signatures

Обе формы SelectItem — произвольный content и overload со слотами встроенной Cell — SHALL сохранять публичные сигнатуры, порядок и defaults параметров. Каждая SHALL иметь новый аналог с обязательным `Motion<SelectItemMotionStyle>` без отдельного interactionSource. Старые формы SHALL делегировать общему пути с Motion, использующим исходный interactionSource и LocalSelectItemMotionStyle.

#### Scenario: Existing trailing content call
- **WHEN** потребитель вызывает SelectItem старым способом с content/titleContent lambda и interactionSource
- **THEN** вызов остаётся однозначным, компилируется и взаимодействия поступают в общий путь отрисовки

#### Scenario: Explicit Motion in both overloads
- **WHEN** потребитель использует любую новую форму SelectItem с Motion
- **THEN** клики, чтение состояний и переходы используют источники переданного контекста

### Requirement: Checked state is semantic and isolated per item

checked SHALL публиковаться как InteractiveState.Selected в semanticStateSource Motion строки. Снятие checked SHALL снимать Selected без удаления посторонних состояний. Компонент SHALL поддерживать сочетания Selected с Pressed/Hovered/Focused и обновление стиля при сохранённом Motion. Выбранность SHALL не требовать SelectInteraction и SHALL не менять контексты соседей или контейнера.

#### Scenario: Selected and pressed
- **WHEN** checked=true и interactionSource строки получает PressInteraction, затем Release
- **THEN** стиль проходит selected+pressed и возвращается к selected; после checked=false возвращается к соответствующему невыбранному состоянию

#### Scenario: Neighbor remains independent
- **WHEN** у первой из двух строк меняются checked и взаимодействия
- **THEN** вторая строка со своим Motion не меняет выбранность и визуальные состояния

#### Scenario: Replace style with retained Motion
- **WHEN** выбранная строка получает новый SelectItemStyle без замены Motion
- **THEN** фон, tint, форма и размеры определяются новым стилем и текущими состояниями

### Requirement: Built-in Cell and CheckBox share the item context

Cell, создаваемая overload-ом со слотами, и встроенный CheckBox SHALL получать MotionContext своей строки и сохранять собственные CellMotionStyle/CheckBoxMotionStyle из соответствующих локальных настроек. CheckBox SHALL сохранять checked/enabled и свои семантические состояния, не подменяя Selected строки. Выбор SHALL по-прежнему управляться onClick строки без двойных callbacks. Пользовательский content SHALL сохранять возможность явно передать общий context; его содержимое не переподключается автоматически.

#### Scenario: Shared state in the built-in Cell
- **WHEN** строка выбрана или нажата, а stateful-цвет текста встроенной Cell содержит соответствующее состояние
- **THEN** Cell видит состояния той же строки и применяет собственные доступные переходы

#### Scenario: Multiple selection control
- **WHEN** multiple-строка меняет checked и получает нажатие
- **THEN** встроенный CheckBox видит общий источник взаимодействий и свою выбранность; внешний onClick не вызывается дополнительно самим контролом

#### Scenario: Explicit context for custom content
- **WHEN** потребитель создаёт Cell внутри произвольного content и передаёт ей Motion на основе контекста строки
- **THEN** эта Cell разрешает поддерживаемые свойства по состояниям строки без глобального объединения контекстов списка

### Requirement: SelectItem layout and shape behavior remain compatible

height SHALL оставаться минимальной высотой. Control slot, controlMargin, padding, выравнивание, disableAlpha, single/multiple и поведение отсутствующей иконки SHALL сохраняться. Одна разрешённая форма SHALL применяться к фону и shapeable indication без плавной интерполяции. disabled-строка SHALL не обрабатывать клики и SHALL сохранять прежнюю прозрачность.

#### Scenario: Single item without a checked icon
- **WHEN** single-строка не выбрана либо её iconSource отсутствует
- **THEN** контрольная иконка не рисуется, а существующее резервирование места и отступов сохраняется

#### Scenario: Stateful shape and indication
- **WHEN** состояние выбирает другую Shape и строка отображает indication
- **THEN** фон и shapeable indication используют ту же новую форму без промежуточной геометрии

#### Scenario: Disabled item
- **WHEN** enabled=false при статическом стиле
- **THEN** сохраняются прежняя раскладка и disableAlpha, а нажатие не вызывает onClick

### Requirement: SelectItem metadata and generation support stateful inputs

KSP-метаданные SelectItem SHALL содержать Shape/Brush/Dp stateful-перегрузки с корректными типами. Штатный универсальный генератор SHALL создавать компилируемые стили из обычных и stateful-конфигураций. ApiInfo SHALL сохраняться на style builder; MotionStyleBuilder SHALL не аннотироваться ApiInfo. Генерация SHALL сохранять ComboBox component_style-ссылки и не изменять результаты генерации DropdownMenu/Popover этой задачей.

#### Scenario: Representative generated stateful style
- **WHEN** конфигурация содержит selected/selected+pressed, размеры, форму и градиент SelectItem
- **THEN** стандартный генератор создаёт код, компилирующийся с новыми builder-ами и сохраняющий указанные значения

#### Scenario: Existing generated consumers
- **WHEN** старые сгенерированные SelectItem/ComboBox-стили собираются с новой библиотекой
- **THEN** существующие builder-вызовы компилируются до регенерации без изменения значений дизайн-токенов

### Requirement: SelectItem documentation explains state and Motion ownership

KDoc, разделы SelectItem в ComboBoxUsage/SelectUsage и примеры fixtures SHALL описывать новые stateful-свойства, Motion API, checked/Selected, контексты встроенных и пользовательских компонентов, noMotion defaults, совместимость старых вызовов и ограничения legacy-градиентов. Примеры SHALL компилироваться с публичным API.

#### Scenario: Consumer configures selected motion
- **WHEN** потребитель использует пример со StatefulValue, SelectItemMotionStyle и изменяемым checked
- **THEN** пример компилируется и показывает переходы строки и явную передачу context пользовательской Cell

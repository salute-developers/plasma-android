## ADDED Requirements

### Requirement: Stateful visual values for SegmentItem

SegmentItemStyle SHALL предоставлять shapes типа StatefulValue<CornerBasedShape>, labelStyles и valueStyles типа StatefulValue<TextStyle>. SegmentItemColors SHALL предоставлять backgroundBrush, labelBrush, valueBrush, startContentBrush и endContentBrush типа StatefulValue<Brush>. SegmentItemDimensions SHALL предоставлять minHeightValues, minWidthValues, paddingStartValues, paddingEndValues, startContentPaddingValues, endContentPaddingValues, valueMarginValues, startContentSizeValues и endContentSizeValues типа StatefulValue<Dp>. Отрисовка SHALL разрешать все эти значения через MotionContext элемента. counterStyle SHALL оставаться обычным CounterStyle, disabledAlpha — Float с существующим default.

#### Scenario: Selection changes multiple visual properties
- **WHEN** isSelected изменяется и для selected заданы другие фон, типографика, minHeight и размеры иконок
- **THEN** элемент применяет значения selected для всех указанных свойств, включая обе Painter-иконки и соответствующие слоты

#### Scenario: Gradient text and icon tint
- **WHEN** для текущего состояния заданы Brush-градиенты labelBrush, valueBrush, startContentBrush или endContentBrush
- **THEN** соответствующий текст или штатная Icon отображает Brush через поддерживаемый механизм текста/tint без сведения к однотонному Color

#### Scenario: Updated style with retained context
- **WHEN** SegmentItemStyle меняется при сохранённом Motion и selected-состоянии
- **THEN** элемент разрешает значения нового стиля для текущего состояния

### Requirement: Public SegmentItem Motion API

Библиотека SHALL предоставлять SegmentItemMotionStyle, SegmentItemMotionStyleBuilder, LocalSegmentItemMotionStyle и rememberSegmentItemMotion. SegmentItemMotionStyle SHALL расширять CommonButtonMotionStyle и поддерживать MotionProperty для пяти Brush-значений, двух TextStyle и всех девяти Dp-полей. Все эти свойства SHALL реально управлять соответствующими переходами и по умолчанию равняться noMotion(). rememberSegmentItemMotion SHALL использовать переданные стиль/контекст, а по умолчанию — LocalSegmentItemMotionStyle и запоминаемый MotionContext.

#### Scenario: Configurable transitions beyond text
- **WHEN** настроены переходы для backgroundColor, startContentColor, minWidth и valueMargin и меняется selected-состояние
- **THEN** каждое из перечисленных свойств проходит свой настроенный переход и достигает целевого значения

#### Scenario: Default transitions and CompositionLocal
- **WHEN** rememberSegmentItemMotion вызывается без явного style
- **THEN** он использует LocalSegmentItemMotionStyle, а без его переопределения свойства переключаются без анимационной задержки

### Requirement: SegmentItem overload compatibility

Все три существующие формы SegmentItem — с Painter/Counter, со строками и слотами, с labelContent/valueContent — SHALL сохранять публичные сигнатуры, порядок и defaults параметров. Каждая форма SHALL иметь новый аналог с обязательным Motion<SegmentItemMotionStyle> без отдельных interactionSource/semanticStateSource. Старые перегрузки SHALL делегировать общему пути отрисовки, сохраняя оба переданных источника.

#### Scenario: Existing overloads remain callable
- **WHEN** потребитель собирает существующие вызовы любой из трёх форм SegmentItem без motion
- **THEN** они компилируются без изменения аргументов и новой неоднозначности перегрузок

#### Scenario: External click source remains connected
- **WHEN** clickable использует interactionSource, переданный старой перегрузке или взятый из motion.context новой перегрузки
- **THEN** взаимодействия этого источника определяют визуальные состояния элемента, не теряясь при делегировании

### Requirement: Semantic and interactive states remain consistent

SegmentItem SHALL записывать isSelected в semanticStateSource своего MotionContext и учитывать его совместно с pressed/hovered/focused из interactionSource. Разрешение комбинаций SHALL соответствовать существующему алгоритму StatefulValue. Изменение одного элемента SHALL не менять состояния соседнего элемента с другим контекстом.

#### Scenario: Selected and pressed combination
- **WHEN** выбранный элемент получает pressed и стиль содержит отдельное значение для selected+pressed
- **THEN** используется комбинированное значение, а после отпускания — значение selected

#### Scenario: Selection is removed
- **WHEN** isSelected переключается с true на false при сохранённом focused
- **THEN** из семантического набора удаляется selected и применяется значение, соответствующее оставшемуся focused

### Requirement: Stateful and animated value margin

Отступ между label и value в SegmentItem SHALL учитывать полный MotionContext, включая семантический selected, и управляться SegmentItemMotionStyle.valueMargin. Общий ButtonText SHALL сохранять поддержку существующих вызывающих компонентов и учитывать semanticStateSource при чтении StatefulValue-отступа.

#### Scenario: Semantic selection changes margin
- **WHEN** selected задан через isSelected, SelectInteraction не отправляется и valueMarginValues содержит отдельный selected-отступ
- **THEN** видимый value получает selected-отступ и настроенный переход valueMargin

#### Scenario: Existing ButtonText consumer
- **WHEN** обычная кнопка использует прежний внутренний путь ButtonText со статическим или stateful valueMargin
- **THEN** label/value сохраняют корректную раскладку, а stateful-отступ учитывает переданный semanticStateSource

### Requirement: Independent start and end icon dimensions

SegmentItem SHALL использовать startContentSizeValues для начальной иконки и endContentSizeValues для конечной иконки во всех перегрузках, включая LocalIconDefaultSize в слотах. Размеры и отступы слотов SHALL разрешаться через Motion элемента.

#### Scenario: Unequal icon sizes
- **WHEN** startContentSize равен 16.dp, endContentSize равен 24.dp и заданы обе иконки
- **THEN** начальная иконка использует 16.dp, конечная — 24.dp как в Painter-перегрузке, так и в слотах со штатной Icon

#### Scenario: End size changes independently
- **WHEN** только endContentSizeValues меняется по selected-состоянию
- **THEN** конечная иконка обновляет размер через свой MotionProperty, а начальная сохраняет прежний размер

### Requirement: Counter shares the parent MotionContext

Встроенный Counter SHALL получать тот же MotionContext, что и SegmentItem, сохраняя собственные CounterStyle и CounterMotionStyle. Непустой counter SHALL отображаться только при отсутствии endIcon. Передача состояний произвольным пользовательским слотам SHALL оставаться явной.

#### Scenario: Selected Counter follows the item
- **WHEN** элемент со встроенным Counter переключает isSelected, затем получает pressed
- **THEN** Counter и элемент видят одни и те же semantic/interaction-состояния и разрешают каждый свой стиль

#### Scenario: End icon takes precedence
- **WHEN** одновременно заданы endIcon и непустой counter
- **THEN** отображается конечная иконка, а Counter не создаётся

#### Scenario: Empty Counter
- **WHEN** endIcon отсутствует и counter равен null или пустой строке
- **THEN** встроенный Counter и его дополнительное место в раскладке не создаются

### Requirement: Legacy SegmentItem styles and baseline appearance

Старые свойства SHALL сохранять типы и быть deprecated с указанием замен. Builder-ы SHALL поддерживать старые обычные значения и новые StatefulValue, а цветовые builder-ы — Color/InteractiveColor/Brush/StatefulValue<Brush>. Адаптеры SHALL сохранять default, selected и комбинированные состояния, представимые в обоих контрактах. Статические legacy-getters SHALL возвращать default-значения; ограничение цветовых getters для градиентов SHALL быть документировано. Без новых настроек SHALL сохраняться текущие defaults, disabledAlpha, раскладка и семантика кликов, за исключением явно описанного исправления конечного размера иконки.

#### Scenario: Existing generated style preserves selection colors
- **WHEN** существующий сгенерированный стиль вызывает color-builder с InteractiveColor, содержащим selected и selected+focused
- **THEN** стиль компилируется и сохраняет эти состояния при отрисовке и в поддерживаемом legacy-представлении

#### Scenario: Static style and disabled appearance
- **WHEN** существующий стиль используется с enabled=false без новых Motion-настроек
- **THEN** сохраняется прежняя прозрачность disabledAlpha без новой анимации или новой логики обработки кликов

### Requirement: SegmentItem shape switching

SegmentItem SHALL разрешать shapes через MotionContext без плавной интерполяции и применять одну разрешённую форму к фону и focus selector.

#### Scenario: Selected shape while focused
- **WHEN** сфокусированный элемент переключается в selected, для которого задана другая форма
- **THEN** фон и focus selector используют новую форму после обновления состояния без промежуточных форм

### Requirement: SegmentItem metadata and usage documentation

Stateful-перегрузки builder-ов SHALL присутствовать в API-метаданных; маппинги startContentPadding → iconMargin и endContentPadding → counterMargin SHALL сохраняться. Штатный генератор SHALL создавать компилируемые стили с цветами, типографикой, формами и размерами по состояниям. Документация SHALL содержать пример настройки Motion и общего контекста взаимодействий, описание совместимости и ограничения анимации формы.

#### Scenario: Generation preserves aliases and combined states
- **WHEN** генератор получает конфигурацию SegmentItem с iconMargin, counterMargin, stateful-типографикой и комбинированными состояниями цветов
- **THEN** результат использует соответствующие builder-методы, сохраняет значения состояний и компилируется с обновлённым uikit-compose

#### Scenario: Public Motion usage example
- **WHEN** потребитель использует документированный пример SegmentItem с clickable и selected-переходом размеров/цвета
- **THEN** пример компилируется через публичный API и использует согласованный MotionContext для взаимодействий и отображения

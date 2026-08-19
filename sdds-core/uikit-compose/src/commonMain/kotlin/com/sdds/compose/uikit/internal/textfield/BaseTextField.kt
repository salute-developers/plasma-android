package com.sdds.compose.uikit.internal.textfield

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.IndicatorMode
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextFieldAnimation
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldIndicatorAlignmentMode
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldSemanticState
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.bottomAlignmentLine
import com.sdds.compose.uikit.endAlignmentLine
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.fs.isDisabled
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.graphics.maybeShapeable
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.activatable
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.transform
import com.sdds.compose.uikit.internal.common.drawIndicator
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.textfield.TextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.rememberTextFieldMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.scrollbar
import com.sdds.compose.uikit.startAlignmentLine
import com.sdds.compose.uikit.topAlignmentLine

/**
 * Поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param placeholderText заглушка если пустое [value] и тип [TextFieldLabelPlacement.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param optionalText текст опционального поля
 * @param prefix текст префикса
 * @param suffix текст суффикса
 * @param startContent иконка, которая будет находиться в начале поля ввода
 * @param endContent иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту.
 * @param animation параметры анимации [TextFieldAnimation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation].
 * Используется, только если отсутствуют [prefix] и [suffix].
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * когда [FocusSelectorSettings] != None
 * @param interactionSource источник взаимодействия с полем
 * @param fakeTextField флаг, выключающий возможность ввода текста в textfield. Например, для использования в Select.
 * @param onDecorationBoxClicked обработчик нажатий на контейнер textfield. Работает только для [fakeTextField] == true.
 */
@Composable
@Suppress("LongMethod")
internal fun BaseTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: TextFieldStyle = LocalTextFieldStyle.current,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholderText: String? = null,
    labelText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    startContent: @Composable (() -> Unit)? = null,
    endContent: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    animation: TextFieldAnimation = TextFieldAnimation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<TextFieldMotionStyle> = rememberTextFieldMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
    fakeTextField: Boolean = false,
    onDecorationBoxClicked: (() -> Unit)? = null,
) {
    SideEffect {
        motion.context.semanticStateSource.set(
            TextFieldSemanticState.Readonly,
            readOnly,
        )
    }
    val colors = style.colors

    val indicatorAlignmentMode = style.indicatorAlignmentMode
    val fieldType = style.fieldType
    val labelPlacement = style.labelPlacement
    val captionPlacement = style.captionPlacement
    val counterPlacement = style.counterPlacement

    val valueColor by style.colors.valueBrush.getBrushAsState(motion.context, motion.style.valueColor)
    val valueStyle = style.valueStyles
        .getTextStyleAsState(motion.context, motion.style.valueStyle)
        .value
        .copy(valueColor)

    val singleLine = style.singleLine
    val enabledAlpha = 1f
    val disabledAlpha = colors.disabledAlpha
    val scrollBar = style.scrollBar

    val finalLabelText =
        if (labelPlacement == TextFieldLabelPlacement.None) "" else labelText
    val finalOptionalText =
        if (labelPlacement == TextFieldLabelPlacement.None) "" else optionalText

    var isComponentFocused by remember { mutableStateOf(false) }

    /**
     * Activatable модификатор компонента.
     * Если внещний фокус включен, то компонент должен стать focusable
     * и уметь отправлять ивенты focused и activated.
     */
    val activatableModifier =
        if (focusSelectorSettings.isEnabled()) {
            Modifier
                .activatable(enabled, motion.context.interactionSource) { isComponentFocused = it.isFocused }
                .focusable(enabled, motion.context.interactionSource)
        } else {
            Modifier
                .activatable(
                    enabled = enabled,
                    interactionSource = motion.context.interactionSource,
                    isActivatedEqualsFocused = true,
                ) { isComponentFocused = it.isFocused }
        }

    val verticalScrollState = if (!singleLine) rememberScrollState() else null
    val horizontalScrollState = if (singleLine) rememberScrollState() else null

    var textLayoutResult by remember { mutableStateOf<TextLayoutResult?>(null) }
    var innerFieldSize by remember { mutableStateOf(IntSize.Zero) }
    var chipGroupSize by remember { mutableStateOf(IntSize.Zero) }
    var prefixSize by remember { mutableStateOf(IntSize.Zero) }
    val innerTextFieldInfo = remember {
        derivedStateOf {
            InnerTextFieldLayoutInfo(
                fieldSize = innerFieldSize,
                prefixSize = prefixSize,
                chipGroupSize = chipGroupSize,
            )
        }
    }
    val textFieldValue = value.coerceTextRangesInBounds()

    LaunchedEffect(textFieldValue.text, textFieldValue.selection, innerTextFieldInfo.value) {
        textLayoutResult?.let { layout ->
            scrollToCaret(
                textFieldValue,
                layout,
                horizontalScrollState,
                verticalScrollState,
                innerTextFieldInfo.value,
            )
        }
    }
    /**
     * Источник взаимодействий внутреннего поля.
     * Когда внешний фокус выключен, он совпадает с [interactionSource].
     * Когда внешний фокус включен, необходимо иметь дополнительный источник взаимодействий для
     * [BasicTextField], т.к. он не поймет ивенты activation из [interactionSource].
     */
    val innerInteractionSource =
        if (focusSelectorSettings.isDisabled()) {
            motion.context.interactionSource
        } else {
            remember { MutableInteractionSource() }
        }

    val cursorBrush =
        style.colors.cursorBrush.getValue(motion.context.interactionSource, motion.context.semanticStateSource)
    val startColor = style.colors.startContentBrush.getBrushAsState(motion.context, motion.style.startContentColor)
    val endColor = style.colors.endContentBrush.getBrushAsState(motion.context, motion.style.endContentColor)
    val indicatorColor = style.colors.indicatorBrush.getBrushAsState(motion.context, motion.style.indicatorColor)
    val bottomPadding by style.dimensionValues.labelPaddingValues.getValueAsState(motion.context)
    val boxMinHeight by style.dimensionValues.boxMinHeightValues.getValueAsState(motion.context)
    val helperPadding by style.dimensionValues.helperTextPaddingValues.getValueAsState(motion.context)
    val indicatorHorizontalPadding = style.dimensionValues.indicatorDimensions.horizontalPaddingValues.getValueAsState(
        motion.context,
    )
    val indicatorVerticalPadding = style.dimensionValues.indicatorDimensions.verticalPaddingValues.getValueAsState(
        motion.context,
    )
    val indicatorSize = style.dimensionValues.indicatorDimensions.indicatorSizeValues.getValueAsState(motion.context)
    val dividerThickness = style.dimensionValues.dividerThicknessValues.getValueAsState(motion.context)
    BasicTextField(
        modifier = modifier
            .then(activatableModifier)
            .textFieldClickable(
                enabled,
                fakeTextField,
                onDecorationBoxClicked,
                motion,
                style.shapes.transform { it as Shape },
            )
            .testTag("textField"),
        value = textFieldValue,
        onValueChange = onValueChange,
        onTextLayout = { textLayoutResult = it },
        enabled = enabled && !fakeTextField,
        readOnly = readOnly || fakeTextField,
        textStyle = valueStyle,
        keyboardOptions = keyboardOptions.updateKeyboardOptions(singleLine),
        keyboardActions = keyboardActions.updateKeyboardActions(singleLine),
        maxLines = if (singleLine) 1 else Int.MAX_VALUE,
        visualTransformation = visualTransformation,
        interactionSource = innerInteractionSource,
        cursorBrush = cursorBrush,
        decorationBox = {
            Layout(
                measurePolicy = remember(chipsContent != null) {
                    BaseTextFieldMeasurePolicy()
                },
                content = {
                    OuterTopContent(
                        modifier = Modifier
                            .layoutId(TOP_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(bottom = bottomPadding)
                            .applyLabelIndicator(
                                fieldType = fieldType,
                                labelPlacement = labelPlacement,
                                indicatorColor = { indicatorColor.value },
                                enabled = enabled,
                                disabledAlpha = style.colors.disabledAlpha,
                                horizontalPadding = indicatorHorizontalPadding,
                                verticalPadding = indicatorVerticalPadding,
                                indicatorSize = indicatorSize,
                            )
                            .enableAlpha(enabled, enabledAlpha, disabledAlpha),
                        labelPlacement = labelPlacement,
                        fieldType = fieldType,
                        labelText = finalLabelText,
                        optionalText = finalOptionalText,
                        style = style,
                        horizontalSpacing = style.dimensionValues.optionalPaddingValues,
                        motion = motion,
                    )
                    val innerFieldContent = getInnerFieldContent(
                        fakeTextField = fakeTextField,
                        enabled = enabled,
                        value = textFieldValue,
                        valueStyle = valueStyle,
                        innerTextField = it,
                    )
                    val shape =
                        style.shapes.getValue(motion.context.interactionSource, motion.context.semanticStateSource)
                    val backgroundColor =
                        style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
                    val dividerColorColor =
                        style.colors.dividerBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
                    DecorationBox(
                        modifier = Modifier
                            .layoutId(FIELD_CONTENT_ID)
                            .focusSelector(
                                settings = focusSelectorSettings,
                                shape = shape,
                            ) { isComponentFocused }
                            .defaultMinSize(minHeight = boxMinHeight)
                            .applyFieldIndicator(
                                fieldType = fieldType,
                                labelPlacement = labelPlacement,
                                indicatorAlignmentMode = indicatorAlignmentMode,
                                indicatorColor = { indicatorColor.value },
                                enabled = enabled,
                                disabledAlpha = style.colors.disabledAlpha,
                                horizontalPadding = indicatorHorizontalPadding,
                                verticalPadding = indicatorVerticalPadding,
                                indicatorSize = indicatorSize,
                            )
                            .clip(shape)
                            .enableAlpha(enabled, enabledAlpha, disabledAlpha)
                            .drawFieldAppearance(
                                backgroundColor = { backgroundColor.value },
                                dividerColor = { dividerColorColor.value },
                                dividerThickness = dividerThickness,
                            )
                            .then(
                                if (scrollBar != null) {
                                    Modifier.applyVerticalScrollBar(
                                        scrollState = verticalScrollState,
                                        scrollBarTrackColor = scrollBar.indicatorColor.colorForInteraction(
                                            motion.context.interactionSource,
                                        ),
                                        scrollBarThumbColor = scrollBar.backgroundColor.colorForInteraction(
                                            motion.context.interactionSource,
                                        ),
                                        scrollBarThickness = scrollBar.indicatorThickness,
                                        scrollBarPaddingEnd = scrollBar.padding
                                            .calculateEndPadding(LocalLayoutDirection.current),
                                        scrollBarPaddingTop = scrollBar.padding.calculateTopPadding(),
                                        scrollBarPaddingBottom = scrollBar.padding.calculateBottomPadding(),
                                    )
                                } else {
                                    Modifier
                                },
                            ),
                        value = textFieldValue.text,
                        textLayoutResult = textLayoutResult,
                        innerTextField = innerFieldContent,
                        interactionSource = innerInteractionSource,
                        motion = motion,
                        innerLabel = innerLabel(
                            label = finalLabelText,
                            labelPlacement = labelPlacement,
                            isFocused = { innerInteractionSource.collectIsFocusedAsState().value },
                            value = textFieldValue,
                            style = style,
                            hasChips = chipsContent != null,
                            motion = motion,
                        ),
                        innerOptional = innerOptional(
                            labelPlacement = labelPlacement,
                            fieldType = fieldType,
                            optionalText = finalOptionalText,
                            isFocused = { innerInteractionSource.collectIsFocusedAsState().value },
                            value = textFieldValue,
                            style = style,
                            hasChips = chipsContent != null,
                            motion = motion,
                        ),
                        placeholder = placeholder(
                            placeholder = placeholderText,
                            prefix = prefix,
                            suffix = suffix,
                            style = style,
                            motion = motion,
                        ),
                        startIcon = icon(
                            startContent,
                            { startColor.value },
                        ),
                        endIcon = icon(
                            endContent,
                            { endColor.value },
                        ),
                        innerCaption = innerCaption(
                            captionPlacement,
                            captionText,
                            style.captionStyles,
                            style.colors.captionBrush,
                            motion,
                        ),
                        innerCounter = innerCounter(
                            counterPlacement,
                            counterText,
                            style.counterStyles,
                            style.colors.counterBrush,
                            motion,
                        ),
                        animation = animation,
                        chips = chipsContent,
                        chipGroupStyle = style.chipGroupStyle,
                        dimensions = style.dimensionValues,
                        verticalScrollState = verticalScrollState,
                        horizontalScrollState = horizontalScrollState,
                        singleLine = singleLine,
                        enabled = enabled,
                        valueTextStyle = valueStyle,
                        innerLabelTextStyle = style.labelStyles,
                        prefix = textOrNull(
                            modifier = Modifier.graphicsLayer(alpha = if (textFieldValue.text.isEmpty()) 0f else 1f),
                            text = prefix,
                            textStyle = style.prefixStyles,
                            motion = motion,
                            styleProperty = motion.style.prefixStyle,
                            colorProperty = motion.style.prefixColor,
                            textColor = style.colors.prefixBrush,
                        ),
                        suffix = textOrNull(
                            modifier = Modifier.graphicsLayer(alpha = if (textFieldValue.text.isEmpty()) 0f else 1f),
                            text = suffix,
                            textStyle = style.suffixStyles,
                            motion = motion,
                            styleProperty = motion.style.suffixStyle,
                            colorProperty = motion.style.suffixColor,
                            textColor = style.colors.suffixBrush,
                        ),
                        onInnerTextFieldSizeChanged = { fieldSize -> innerFieldSize = fieldSize },
                        onChipGroupSizeChanged = { chipsSize -> chipGroupSize = chipsSize },
                        onPrefixSizeChanged = { prefix -> prefixSize = prefix },
                    )

                    OuterBottomText(
                        modifier = Modifier
                            .layoutId(CAPTION_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(top = helperPadding)
                            .enableAlpha(enabled, enabledAlpha, disabledAlpha),
                        text = captionText,
                        textStyle = style.captionStyles,
                        helperTextPlacement = captionPlacement,
                        motion = motion,
                        styleProperty = motion.style.captionStyle,
                        textColor = style.colors.captionBrush,
                        colorProperty = motion.style.captionColor,
                    )
                    OuterBottomText(
                        modifier = Modifier
                            .layoutId(COUNTER_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(top = helperPadding)
                            .enableAlpha(enabled, enabledAlpha, disabledAlpha),
                        text = counterText,
                        textStyle = style.counterStyles,
                        helperTextPlacement = counterPlacement,
                        motion = motion,
                        styleProperty = motion.style.counterStyle,
                        textColor = style.colors.counterBrush,
                        colorProperty = motion.style.counterColor,
                    )
                },
            )
        },
    )
}

private fun Modifier.enableAlpha(enabled: Boolean, enabledAlpha: Float, disabledAlpha: Float): Modifier {
    return this.graphicsLayer { alpha = if (enabled) enabledAlpha else disabledAlpha }
}

private fun TextFieldValue.coerceTextRangesInBounds(): TextFieldValue {
    val textLength = text.length
    val coercedSelection = selection.coerceIn(0, textLength)
    val coercedComposition = composition?.coerceIn(0, textLength)
    return if (coercedSelection == selection && coercedComposition == composition) {
        this
    } else {
        copy(
            selection = coercedSelection,
            composition = coercedComposition,
        )
    }
}

private fun TextRange.coerceIn(minimumValue: Int, maximumValue: Int): TextRange {
    return TextRange(
        start = start.coerceIn(minimumValue, maximumValue),
        end = end.coerceIn(minimumValue, maximumValue),
    )
}

private suspend fun scrollToCaret(
    value: TextFieldValue,
    layout: TextLayoutResult,
    horizontalScrollState: ScrollState?,
    verticalScrollState: ScrollState?,
    innerFieldInfo: InnerTextFieldLayoutInfo,
) {
    val prefixSize = innerFieldInfo.prefixSize
    val caretOffset = value.selection.end.coerceIn(0, layout.layoutInput.text.length)
    val cursorRect = layout
        .getCursorRect(caretOffset)
        .translate(prefixSize.width.toFloat(), 0f)
    horizontalScrollState?.let { scroll ->
        val chipsWidth = innerFieldInfo.chipGroupSize.width
        val fieldWidth = innerFieldInfo.fieldSize.width
        val cursorRight = cursorRect.right.toInt()
        val cursorLeft = cursorRect.left.toInt()
        val target = when {
            chipsWidth + cursorRight > scroll.value + fieldWidth -> chipsWidth + cursorRight - fieldWidth
            chipsWidth + cursorLeft < scroll.value -> chipsWidth + cursorLeft
            else -> null
        }
        if (target != null && target != scroll.value) scroll.scrollTo(target)
    }
    verticalScrollState?.let { scroll ->
        val chipsHeight = innerFieldInfo.chipGroupSize.height
        val fieldHeight = innerFieldInfo.fieldSize.height
        val cursorTop = cursorRect.top.toInt()
        val cursorBottom = cursorRect.bottom.toInt()
        val target = when {
            chipsHeight + cursorBottom > scroll.value + fieldHeight -> chipsHeight + cursorBottom - fieldHeight
            chipsHeight + cursorTop < scroll.value -> chipsHeight + cursorTop
            else -> null
        }
        if (target != null && target != scroll.value) scroll.scrollTo(target)
    }
}

@Composable
private fun Modifier.textFieldClickable(
    enabled: Boolean,
    fakeTextField: Boolean,
    onDecorationBoxClicked: (() -> Unit)?,
    motion: Motion<TextFieldMotionStyle>,
    shape: StatefulValue<Shape>,
): Modifier {
    return if (fakeTextField && onDecorationBoxClicked != null) {
        this
            .clickable(
                enabled = enabled,
                indication = LocalIndication
                    .current
                    .maybeShapeable(
                        shape.getValue(
                            motion.context.interactionSource,
                            motion.context.semanticStateSource,
                        ),
                    ),
                interactionSource = motion.context.interactionSource,
            ) { onDecorationBoxClicked() }
    } else {
        this
    }
}

private fun getInnerFieldContent(
    fakeTextField: Boolean,
    enabled: Boolean,
    value: TextFieldValue,
    valueStyle: TextStyle,
    innerTextField: @Composable () -> Unit,
): @Composable () -> Unit {
    return if (fakeTextField) {
        {
            if (enabled) {
                SelectionContainer {
                    Text(
                        text = value.annotatedString,
                        style = valueStyle,
                    )
                }
            } else {
                Text(
                    text = value.annotatedString,
                    style = valueStyle,
                )
            }
        }
    } else {
        innerTextField
    }
}

private fun Modifier.drawFieldAppearance(
    backgroundColor: BrushProducer,
    dividerColor: BrushProducer,
    dividerThickness: State<Dp>,
): Modifier {
    return this.drawBehind {
        val backColor = backgroundColor()
        drawRect(backColor)
        val thickness = dividerThickness.value
        if (thickness.value != 0f) {
            drawLine(
                brush = dividerColor(),
                start = Offset(0f, size.height),
                end = Offset(size.width, size.height),
                strokeWidth = thickness.toPx(),
                cap = StrokeCap.Round,
            )
        }
    }
}

private fun Modifier.applyVerticalScrollBar(
    scrollState: ScrollState?,
    scrollBarThickness: Dp,
    scrollBarPaddingTop: Dp,
    scrollBarPaddingBottom: Dp,
    scrollBarPaddingEnd: Dp,
    scrollBarTrackColor: Color,
    scrollBarThumbColor: Color,
): Modifier {
    return if (scrollState != null) {
        this.scrollbar(
            state = scrollState,
            direction = Orientation.Vertical,
            indicatorThickness = scrollBarThickness,
            indicatorColor = scrollBarTrackColor,
            backgroundColor = scrollBarThumbColor,
            alpha = if (scrollState.isScrollInProgress) 0.8f else 0f,
            alphaAnimationSpec = tween(
                delayMillis = if (scrollState.isScrollInProgress) 0 else 1500,
                durationMillis = if (scrollState.isScrollInProgress) 150 else 500,
            ),
            padding = PaddingValues(
                end = scrollBarPaddingEnd,
                top = scrollBarPaddingTop,
                bottom = scrollBarPaddingBottom,
            ),
        )
    } else {
        this
    }
}

private fun icon(
    iconContent: @Composable (() -> Unit)?,
    contentBrush: BrushProducer,
): @Composable (() -> Unit)? {
    return if (iconContent != null) {
        {
            CompositionLocalProvider(
                LocalTintBrushProducer provides { contentBrush() },
            ) {
                iconContent()
            }
        }
    } else {
        null
    }
}

private fun innerOptional(
    labelPlacement: TextFieldLabelPlacement,
    fieldType: TextFieldType,
    optionalText: String?,
    isFocused: @Composable () -> Boolean,
    value: TextFieldValue,
    style: TextFieldStyle,
    hasChips: Boolean,
    motion: Motion<TextFieldMotionStyle>,
): (@Composable () -> Unit)? {
    if (fieldType != TextFieldType.Optional) return null
    return if (labelPlacement == TextFieldLabelPlacement.Inner && !hasChips && !optionalText.isNullOrEmpty()) {
        {
            val color = style.colors.optionalBrush
                .getBrushAsState(motion.context, motion.style.optionalColor)
            val textStyle = if (!isFocused() && value.text.isEmpty()) {
                style.placeholderStyles
                    .getTextStyleAsState(motion.context, motion.style.placeholderStyle)
                    .value
            } else {
                style.optionalStyles
                    .getTextStyleAsState(motion.context, motion.style.optionalStyle)
                    .value
            }
            Text(
                text = optionalText,
                style = textStyle,
                brush = { color.value },
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
    } else {
        null
    }
}

private fun innerLabel(
    label: String?,
    labelPlacement: TextFieldLabelPlacement,
    isFocused: @Composable () -> Boolean,
    value: TextFieldValue,
    style: TextFieldStyle,
    hasChips: Boolean,
    motion: Motion<TextFieldMotionStyle>,
): (@Composable () -> Unit)? {
    return if (labelPlacement == TextFieldLabelPlacement.Inner && !hasChips && !label.isNullOrEmpty()) {
        {
            val shouldUsePlaceholderStyle = !isFocused() && value.text.isEmpty()
            val placeColor = style.colors.placeholderBrush
                .getBrushAsState(motion.context, motion.style.placeholderColor)
            val labelColor = style.colors.labelBrush
                .getBrushAsState(motion.context, motion.style.labelColor)
            val textStyle = if (shouldUsePlaceholderStyle) {
                style.placeholderStyles
                    .getTextStyleAsState(motion.context, motion.style.placeholderStyle)
                    .value
            } else {
                style.labelStyles
                    .getTextStyleAsState(motion.context, motion.style.labelStyle)
                    .value
            }

            Text(
                text = label,
                style = textStyle,
                brush = { if (shouldUsePlaceholderStyle) placeColor.value else labelColor.value },
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
    } else {
        null
    }
}

private fun innerCaption(
    helperTextPlacement: TextFieldHelperTextPlacement,
    captionText: String?,
    innerCaptionStyle: StatefulValue<TextStyle>,
    innerCaptionColor: StatefulValue<Brush>,
    motion: Motion<TextFieldMotionStyle>,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == TextFieldHelperTextPlacement.Inner) {
        textOrNull(
            text = captionText,
            textStyle = innerCaptionStyle,
            textColor = innerCaptionColor,
            motion = motion,
            styleProperty = motion.style.captionStyle,
            colorProperty = motion.style.captionColor,
        )
    } else {
        null
    }
}

private fun innerCounter(
    helperTextPlacement: TextFieldHelperTextPlacement,
    counterText: String?,
    innerCounterStyle: StatefulValue<TextStyle>,
    innerCounterColor: StatefulValue<Brush>,
    motion: Motion<TextFieldMotionStyle>,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == TextFieldHelperTextPlacement.Inner) {
        textOrNull(
            text = counterText,
            textStyle = innerCounterStyle,
            textColor = innerCounterColor,
            motion = motion,
            styleProperty = motion.style.counterStyle,
            colorProperty = motion.style.counterColor,
        )
    } else {
        null
    }
}

private fun Modifier.applyFieldIndicator(
    fieldType: TextFieldType,
    labelPlacement: TextFieldLabelPlacement,
    indicatorAlignmentMode: TextFieldIndicatorAlignmentMode,
    horizontalPadding: State<Dp>,
    verticalPadding: State<Dp>,
    indicatorSize: State<Dp>,
    indicatorColor: BrushProducer,
    enabled: Boolean,
    disabledAlpha: Float,
): Modifier {
    if (fieldType == TextFieldType.Optional || labelPlacement == TextFieldLabelPlacement.Outer) return this

    val alignment = fieldIndicatorAlignment(fieldType)
    val horizontalMode = fieldIndicatorHorizontalMode(indicatorAlignmentMode)

    return this.drawIndicator(
        alignment = alignment,
        brush = indicatorColor,
        horizontalPadding = horizontalPadding,
        verticalPadding = verticalPadding,
        indicatorSize = indicatorSize,
        horizontalMode = horizontalMode,
        verticalMode = IndicatorMode.Inner,
        alpha = if (enabled) 1f else disabledAlpha,
    )
}

private fun fieldIndicatorAlignment(fieldType: TextFieldType): Alignment {
    return when (fieldType) {
        TextFieldType.RequiredStart -> Alignment.TopStart
        TextFieldType.RequiredEnd -> Alignment.TopEnd
        else -> Alignment.TopStart
    }
}

private fun fieldIndicatorHorizontalMode(indicatorAlignmentMode: TextFieldIndicatorAlignmentMode): IndicatorMode {
    return when (indicatorAlignmentMode) {
        TextFieldIndicatorAlignmentMode.Inside -> IndicatorMode.Inner
        TextFieldIndicatorAlignmentMode.Outside -> IndicatorMode.Outer
    }
}

private fun Modifier.applyLabelIndicator(
    fieldType: TextFieldType,
    labelPlacement: TextFieldLabelPlacement,
    indicatorColor: BrushProducer,
    horizontalPadding: State<Dp>,
    verticalPadding: State<Dp>,
    indicatorSize: State<Dp>,
    enabled: Boolean,
    disabledAlpha: Float,
): Modifier {
    if (fieldType == TextFieldType.Optional || labelPlacement != TextFieldLabelPlacement.Outer) return this
    val alignment = outerLabelIndicatorAlignment(fieldType)

    return this.drawIndicator(
        alignment = alignment,
        brush = indicatorColor,
        horizontalPadding = horizontalPadding,
        verticalPadding = verticalPadding,
        indicatorSize = indicatorSize,
        horizontalMode = IndicatorMode.Outer,
        verticalMode = IndicatorMode.Inner,
        alpha = if (enabled) 1f else disabledAlpha,
    )
}

private fun outerLabelIndicatorAlignment(fieldType: TextFieldType): Alignment {
    return when (fieldType) {
        TextFieldType.RequiredStart -> Alignment.TopStart
        TextFieldType.RequiredEnd -> Alignment.TopEnd
        TextFieldType.Optional -> Alignment.TopStart
    }
}

private fun placeholder(
    prefix: String?,
    suffix: String?,
    placeholder: String?,
    style: TextFieldStyle,
    motion: Motion<TextFieldMotionStyle>,
): @Composable (() -> Unit)? {
    if (placeholder.isNullOrEmpty() && prefix.isNullOrEmpty() && suffix.isNullOrEmpty()) return null
    return {
        PrefixSuffixWrapper(
            mainContent = {
                placeholder?.let {
                    val textStyle by style.placeholderStyles.getTextStyleAsState(
                        motion.context,
                        motion.style.placeholderStyle,
                    )
                    val color =
                        style.colors.placeholderBrush.getBrushAsState(motion.context, motion.style.placeholderColor)
                    Text(
                        text = it,
                        style = textStyle,
                        brush = { color.value },
                    )
                }
            },
            prefix = textOrNull(
                text = prefix,
                textStyle = style.prefixStyles,
                textColor = style.colors.prefixBrush,
                motion = motion,
                styleProperty = motion.style.prefixStyle,
                colorProperty = motion.style.prefixColor,
            ),
            suffix = textOrNull(
                text = suffix,
                textStyle = style.suffixStyles,
                textColor = style.colors.suffixBrush,
                motion = motion,
                styleProperty = motion.style.suffixStyle,
                colorProperty = motion.style.suffixColor,
            ),
        )
    }
}

private fun textOrNull(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: StatefulValue<TextStyle>?,
    textColor: StatefulValue<Brush>,
    motion: Motion<TextFieldMotionStyle>,
    styleProperty: MotionProperty<TextStyle>,
    colorProperty: MotionProperty<Brush>,
): @Composable (() -> Unit)? {
    return if (!text.isNullOrEmpty() && textStyle != null) {
        {
            val style by textStyle.getTextStyleAsState(motion.context, styleProperty)
            val color = textColor.getBrushAsState(motion.context, colorProperty)
            Text(
                modifier = modifier,
                text = text,
                style = style,
                brush = { color.value },
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
    } else {
        null
    }
}

@Composable
private fun OuterTopContent(
    modifier: Modifier,
    labelPlacement: TextFieldLabelPlacement,
    fieldType: TextFieldType,
    labelText: String?,
    optionalText: String?,
    style: TextFieldStyle,
    horizontalSpacing: StatefulValue<Dp>,
    motion: Motion<TextFieldMotionStyle>,
) {
    val hasContent =
        !labelText.isNullOrEmpty() || fieldType == TextFieldType.Optional && !optionalText.isNullOrEmpty()
    val shouldShowTopContent = labelPlacement == TextFieldLabelPlacement.Outer && hasContent
    if (!shouldShowTopContent) return
    val spacing by horizontalSpacing.getValueAsState(motion.context)
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spacing),
    ) {
        TextOrEmpty(
            modifier = Modifier.weight(1f, fill = false),
            text = labelText,
            textStyle = style.labelStyles,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            motion = motion,
            styleProperty = motion.style.labelStyle,
            textColor = style.colors.labelBrush,
            colorProperty = motion.style.labelColor,
        )
        if (fieldType == TextFieldType.Optional) {
            TextOrEmpty(
                text = optionalText,
                textStyle = style.optionalStyles,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                motion = motion,
                styleProperty = motion.style.optionalStyle,
                textColor = style.colors.optionalBrush,
                colorProperty = motion.style.optionalColor,
            )
        }
    }
}

@Composable
private fun OuterBottomText(
    modifier: Modifier,
    text: String?,
    textStyle: StatefulValue<TextStyle>,
    textColor: StatefulValue<Brush>,
    helperTextPlacement: TextFieldHelperTextPlacement,
    motion: Motion<TextFieldMotionStyle>,
    styleProperty: MotionProperty<TextStyle>,
    colorProperty: MotionProperty<Brush>,
) {
    val isEmpty = text.isNullOrEmpty()
    if (helperTextPlacement != TextFieldHelperTextPlacement.Outer || isEmpty) return
    Box(modifier = modifier) {
        TextOrEmpty(
            text = text,
            textStyle = textStyle,
            motion = motion,
            styleProperty = styleProperty,
            textColor = textColor,
            colorProperty = colorProperty,
        )
    }
}

@Composable
private fun TextOrEmpty(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: StatefulValue<TextStyle>,
    textColor: StatefulValue<Brush>,
    motion: Motion<TextFieldMotionStyle>,
    styleProperty: MotionProperty<TextStyle>,
    colorProperty: MotionProperty<Brush>,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isNullOrEmpty()) return
    val style by textStyle.getTextStyleAsState(motion.context, styleProperty)
    val color = textColor.getBrushAsState(motion.context, colorProperty)
    Text(
        modifier = modifier,
        text = text,
        style = style,
        brush = { color.value },
        maxLines = maxLines,
        overflow = overflow,
    )
}

@Composable
private fun TextStyle.applyColor(
    color: InteractiveColor,
    interactionSource: InteractionSource,
): TextStyle =
    this.copy(color = color.colorForInteraction(interactionSource))

private class BaseTextFieldMeasurePolicy : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        // measure top text (label + optional)
        val topPlaceable = measurables.find { it.layoutId == TOP_CONTENT_ID }
            ?.measure(looseConstraints)

        // measure counter
        val counterPlaceable = measurables.find { it.layoutId == COUNTER_CONTENT_ID }
            ?.measure(looseConstraints)

        // measure caption
        val captionPlaceable = measurables.find { it.layoutId == CAPTION_CONTENT_ID }
            ?.measure(looseConstraints.offset(horizontal = -counterPlaceable.widthOrZero()))

        // calculate field constraints
        val maxBottomTextHeight =
            maxOf(counterPlaceable.heightOrZero(), captionPlaceable.heightOrZero())
        val occupiedSpaceVertical = topPlaceable.heightOrZero() + maxBottomTextHeight
        val topContentWidth = topPlaceable.widthOrZero()
        val bottomContentWidth = counterPlaceable.widthOrZero() + captionPlaceable.widthOrZero()
        val outerContentMaxWidth = maxOf(topContentWidth, bottomContentWidth)
        val fieldConstraints = if (!constraints.hasFixedWidth) {
            constraints.copy(minWidth = outerContentMaxWidth)
        } else {
            constraints
        }.offset(vertical = -occupiedSpaceVertical)

        // measure field
        val fieldContent = measurables.find { it.layoutId == FIELD_CONTENT_ID }
            ?.measure(fieldConstraints)

        // calculate width and height
        val totalHeight = minOf(
            topPlaceable.heightOrZero() + fieldContent.heightOrZero() + maxBottomTextHeight,
            constraints.maxHeight,
        )
        val totalWidth = minOf(fieldContent.widthOrZero(), constraints.maxWidth)

        return layout(
            width = totalWidth,
            height = totalHeight,
            alignmentLines = mapOf(
                topAlignmentLine to (topPlaceable.heightOrZero()),
                bottomAlignmentLine to (topPlaceable.heightOrZero() + fieldContent.heightOrZero()),
                startAlignmentLine to 0,
                endAlignmentLine to totalWidth,
            ),
        ) {
            topPlaceable?.placeRelative(0, 0)
            fieldContent?.placeRelative(0, topPlaceable.heightOrZero())
            captionPlaceable?.placeRelative(
                0,
                topPlaceable.heightOrZero() + fieldContent.heightOrZero(),
            )
            counterPlaceable?.placeRelative(
                fieldContent.widthOrZero() - counterPlaceable.widthOrZero(),
                topPlaceable.heightOrZero() + fieldContent.heightOrZero(),
            )
        }
    }
}

internal fun KeyboardOptions.updateKeyboardOptions(singleLine: Boolean): KeyboardOptions {
    return if (singleLine) {
        KeyboardOptions(
            capitalization = capitalization,
            autoCorrectEnabled = autoCorrectEnabled,
            keyboardType = keyboardType,
            imeAction = if (imeAction == ImeAction.Unspecified) ImeAction.Done else imeAction,
            platformImeOptions = platformImeOptions,
            showKeyboardOnFocus = showKeyboardOnFocus,
            hintLocales = hintLocales,
        )
    } else {
        this
    }
}

internal fun KeyboardActions.updateKeyboardActions(singleLine: Boolean): KeyboardActions {
    return if (singleLine) {
        KeyboardActions(
            onDone = if (onDone == null) {
                { defaultKeyboardAction(ImeAction.Done) }
            } else {
                onDone
            },
            onGo = onGo,
            onNext = onNext,
            onPrevious = onPrevious,
            onSearch = onSearch,
            onSend = onSend,
        )
    } else {
        this
    }
}

private const val TOP_CONTENT_ID = "TopContentId"
private const val FIELD_CONTENT_ID = "FieldContentId"
private const val CAPTION_CONTENT_ID = "CaptionContentId"
private const val COUNTER_CONTENT_ID = "CounterContentId"

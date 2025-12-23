package com.sdds.compose.uikit.internal.textfield

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextFieldAnimation
import com.sdds.compose.uikit.TextFieldColors
import com.sdds.compose.uikit.TextFieldDimensions
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldIndicatorAlignmentMode
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.bottomAlignmentLine
import com.sdds.compose.uikit.endAlignmentLine
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.fs.isDisabled
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.activatable
import com.sdds.compose.uikit.internal.common.drawIndicator
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
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
) {
    val dimensions = style.dimensions
    val colors = style.colors

    val indicatorAlignmentMode = style.indicatorAlignmentMode
    val fieldType = style.fieldType
    val labelPlacement = style.labelPlacement
    val captionPlacement = style.captionPlacement
    val counterPlacement = style.counterPlacement

    val labelStyle = style.labelStyle.applyColor(
        color = colors.labelColor(readOnly),
        interactionSource = interactionSource,
    )
    val optionalStyle = style.optionalStyle.applyColor(
        color = colors.optionalColor(readOnly),
        interactionSource = interactionSource,
    )
    val valueStyle = style.valueStyle.applyColor(
        color = colors.valueColor(readOnly),
        interactionSource = interactionSource,
    )
    val captionStyle = style.captionStyle.applyColor(
        color = colors.captionColor(readOnly),
        interactionSource = interactionSource,
    )
    val counterStyle = style.counterStyle.applyColor(
        color = colors.counterColor(readOnly),
        interactionSource = interactionSource,
    )
    val placeholderStyle = style.placeholderStyle.applyColor(
        color = colors.placeholderColor(readOnly),
        interactionSource = interactionSource,
    )
    val prefixStyle = style.prefixStyle.applyColor(
        color = colors.prefixColor(readOnly),
        interactionSource = interactionSource,
    )
    val suffixStyle = style.suffixStyle.applyColor(
        color = colors.suffixColor(readOnly),
        interactionSource = interactionSource,
    )
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
                .activatable(enabled, interactionSource) { isComponentFocused = it.isFocused }
                .focusable(enabled, interactionSource)
        } else {
            Modifier
                .activatable(
                    enabled = enabled,
                    interactionSource = interactionSource,
                    isActivatedEqualsFocused = true,
                ) { isComponentFocused = it.isFocused }
        }

    val verticalScrollState = if (!singleLine) rememberScrollState() else null
    val horizontalScrollState = if (singleLine) rememberScrollState() else null
    var textLayoutResult by remember { mutableStateOf<TextLayoutResult?>(null) }
    var innerFieldSize by remember { mutableStateOf(IntSize.Zero) }
    var chipGroupSize by remember { mutableStateOf(IntSize.Zero) }
    val innerTextFieldInfo = remember {
        derivedStateOf {
            InnerTextFieldLayoutInfo(innerFieldSize, chipGroupSize)
        }
    }

    LaunchedEffect(value.text, value.selection, innerTextFieldInfo.value) {
        textLayoutResult?.let { layout ->
            scrollToCaret(
                value,
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
            interactionSource
        } else {
            remember { MutableInteractionSource() }
        }

    BasicTextField(
        modifier = modifier
            .then(activatableModifier)
            .testTag("textField"),
        value = value,
        onValueChange = onValueChange,
        onTextLayout = { textLayoutResult = it },
        enabled = enabled,
        readOnly = readOnly,
        textStyle = valueStyle,
        keyboardOptions = keyboardOptions.updateKeyboardOptions(singleLine),
        keyboardActions = keyboardActions.updateKeyboardActions(singleLine),
        maxLines = if (singleLine) 1 else Int.MAX_VALUE,
        visualTransformation = visualTransformation,
        interactionSource = innerInteractionSource,
        cursorBrush = SolidColor(
            colors.cursorColor(readOnly).colorForInteraction(interactionSource),
        ),
        decorationBox = {
            Layout(
                measurePolicy = remember {
                    BaseTextFieldMeasurePolicy()
                },
                content = {
                    OuterTopContent(
                        modifier = Modifier
                            .layoutId(TOP_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(bottom = dimensions.labelPadding)
                            .applyLabelIndicator(
                                fieldType = fieldType,
                                labelPlacement = labelPlacement,
                                indicatorColor = colors.indicatorColor(
                                    readOnly = readOnly,
                                    enabled = enabled,
                                    interactionSource = interactionSource,
                                ),
                                dimensions = dimensions,
                            )
                            .enable(enabled, enabledAlpha, disabledAlpha),
                        labelPlacement = labelPlacement,
                        fieldType = fieldType,
                        labelText = finalLabelText,
                        optionalText = finalOptionalText,
                        labelTextStyle = labelStyle,
                        optionalTextStyle = optionalStyle,
                        horizontalSpacing = dimensions.optionalPadding,
                    )

                    DecorationBox(
                        modifier = Modifier
                            .layoutId(FIELD_CONTENT_ID)
                            .focusSelector(
                                settings = focusSelectorSettings,
                                shape = style.shape,
                            ) { isComponentFocused }
                            .defaultMinSize(minHeight = dimensions.boxMinHeight)
                            .applyFieldIndicator(
                                fieldType,
                                labelPlacement,
                                indicatorAlignmentMode,
                                dimensions,
                                colors.indicatorColor(readOnly, enabled, interactionSource),
                            )
                            .clip(style.shape)
                            .enable(enabled, enabledAlpha, disabledAlpha)
                            .drawFieldAppearance(
                                backgroundColor = colors
                                    .backgroundColor(readOnly)
                                    .colorForInteraction(interactionSource),
                                dividerColor = colors
                                    .dividerColor(readOnly)
                                    .colorForInteraction(interactionSource),
                                dividerThickness = dimensions.dividerThickness,
                            )
                            .then(
                                if (scrollBar != null) {
                                    Modifier.applyVerticalScrollBar(
                                        scrollState = verticalScrollState,
                                        scrollBarTrackColor = scrollBar.indicatorColor.colorForInteraction(
                                            interactionSource,
                                        ),
                                        scrollBarThumbColor = scrollBar.backgroundColor.colorForInteraction(
                                            interactionSource,
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
                        value = value.text,
                        textLayoutResult = textLayoutResult,
                        innerTextField = it,
                        interactionSource = innerInteractionSource,
                        innerLabel = innerLabel(
                            label = finalLabelText,
                            labelPlacement = labelPlacement,
                            isFocused = { innerInteractionSource.collectIsFocusedAsState().value },
                            value = value,
                            placeHolderStyle = placeholderStyle,
                            innerLabelStyle = labelStyle,
                            hasChips = chipsContent != null,
                        ),
                        innerOptional = innerOptional(
                            labelPlacement = labelPlacement,
                            fieldType = fieldType,
                            optionalText = finalOptionalText,
                            isFocused = { innerInteractionSource.collectIsFocusedAsState().value },
                            value = value,
                            placeHolderStyle = placeholderStyle,
                            innerOptionalStyle = optionalStyle,
                            hasChips = chipsContent != null,
                        ),
                        placeholder = placeholder(
                            placeholder = placeholderText,
                            prefix = prefix,
                            suffix = suffix,
                            textStyle = placeholderStyle,
                            prefixStyle = prefixStyle,
                            suffixStyle = suffixStyle,
                        ),
                        startIcon = icon(
                            startContent,
                            colors
                                .startContentColor(readOnly)
                                .colorForInteraction(interactionSource),
                        ),
                        endIcon = icon(
                            endContent,
                            colors
                                .endContentColor(readOnly)
                                .colorForInteraction(interactionSource),
                        ),
                        innerCaption = innerCaption(captionPlacement, captionText, captionStyle),
                        innerCounter = innerCounter(counterPlacement, counterText, counterStyle),
                        animation = animation,
                        chips = chipsContent,
                        chipGroupStyle = style.chipGroupStyle,
                        dimensions = dimensions,
                        verticalScrollState = verticalScrollState,
                        horizontalScrollState = horizontalScrollState,
                        singleLine = singleLine,
                        valueTextStyle = valueStyle,
                        innerLabelTextStyle = labelStyle,
                        prefix = textOrNull(
                            modifier = Modifier.graphicsLayer(alpha = if (value.text.isEmpty()) 0f else 1f),
                            text = prefix,
                            textStyle = prefixStyle,
                        ),
                        suffix = textOrNull(
                            modifier = Modifier.graphicsLayer(alpha = if (value.text.isEmpty()) 0f else 1f),
                            text = suffix,
                            textStyle = suffixStyle,
                        ),
                        onInnerTextFieldSizeChanged = { fieldSize -> innerFieldSize = fieldSize },
                        onChipGroupSizeChanged = { chipsSize -> chipGroupSize = chipsSize },
                    )

                    OuterBottomText(
                        modifier = Modifier
                            .layoutId(CAPTION_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(top = dimensions.helperTextPadding)
                            .enable(enabled, enabledAlpha, disabledAlpha),
                        text = captionText,
                        textStyle = captionStyle,
                        helperTextPlacement = captionPlacement,
                    )
                    OuterBottomText(
                        modifier = Modifier
                            .layoutId(COUNTER_CONTENT_ID)
                            .focusProperties { canFocus = false }
                            .padding(top = dimensions.helperTextPadding)
                            .enable(enabled, enabledAlpha, disabledAlpha),
                        text = counterText,
                        textStyle = counterStyle,
                        helperTextPlacement = counterPlacement,
                    )
                },
            )
        },
    )
}

private suspend fun scrollToCaret(
    value: TextFieldValue,
    layout: TextLayoutResult,
    horizontalScrollState: ScrollState?,
    verticalScrollState: ScrollState?,
    innerFieldInfo: InnerTextFieldLayoutInfo,
) {
    val cursorRect = layout.getCursorRect(value.selection.end)
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
private fun TextFieldColors.indicatorColor(
    readOnly: Boolean,
    enabled: Boolean,
    interactionSource: InteractionSource,
): Color {
    return indicatorColor(readOnly)
        .colorForInteraction(interactionSource)
        .let { color ->
            if (enabled) color else color.copy(alpha = disabledAlpha)
        }
}

private fun Modifier.drawFieldAppearance(
    backgroundColor: Color,
    dividerColor: Color,
    dividerThickness: Dp,
): Modifier {
    return this.drawBehind {
        if (backgroundColor.value != Color.Transparent.value) drawRect(backgroundColor)
        if (dividerColor.value != Color.Transparent.value && dividerThickness.value != 0f) {
            drawLine(
                color = dividerColor,
                start = Offset(0f, size.height),
                end = Offset(size.width, size.height),
                strokeWidth = dividerThickness.toPx(),
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
    contentColor: Color,
): @Composable (() -> Unit)? {
    return if (iconContent != null) {
        {
            CompositionLocalProvider(LocalTint provides contentColor) {
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
    placeHolderStyle: TextStyle,
    innerOptionalStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    if (fieldType != TextFieldType.Optional) return null
    return if (labelPlacement == TextFieldLabelPlacement.Inner && !hasChips && !optionalText.isNullOrEmpty()) {
        {
            Text(
                text = optionalText,
                style = if (!isFocused() && value.text.isEmpty()) {
                    placeHolderStyle.copy(color = innerOptionalStyle.color)
                } else {
                    innerOptionalStyle
                },
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
    placeHolderStyle: TextStyle,
    innerLabelStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPlacement == TextFieldLabelPlacement.Inner && !hasChips && !label.isNullOrEmpty()) {
        {
            Text(
                text = label,
                style = if (!isFocused() && value.text.isEmpty()) {
                    placeHolderStyle
                } else {
                    innerLabelStyle
                },
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
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == TextFieldHelperTextPlacement.Inner) {
        textOrNull(
            text = captionText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun innerCounter(
    helperTextPlacement: TextFieldHelperTextPlacement,
    counterText: String?,
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == TextFieldHelperTextPlacement.Inner) {
        textOrNull(
            text = counterText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun Modifier.applyFieldIndicator(
    fieldType: TextFieldType,
    labelPlacement: TextFieldLabelPlacement,
    indicatorAlignmentMode: TextFieldIndicatorAlignmentMode,
    dimensions: TextFieldDimensions,
    indicatorColor: Color,
): Modifier {
    if (fieldType == TextFieldType.Optional || labelPlacement == TextFieldLabelPlacement.Outer) return this

    val alignment = fieldIndicatorAlignment(fieldType)
    val horizontalMode = fieldIndicatorHorizontalMode(indicatorAlignmentMode)

    return this.drawIndicator(
        alignment = alignment,
        color = indicatorColor,
        horizontalPadding = dimensions.indicatorDimensions.horizontalPadding,
        verticalPadding = dimensions.indicatorDimensions.verticalPadding,
        indicatorSize = dimensions.indicatorDimensions.indicatorSize,
        horizontalMode = horizontalMode,
        verticalMode = IndicatorMode.Inner,
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
    indicatorColor: Color,
    dimensions: TextFieldDimensions,
): Modifier {
    if (fieldType == TextFieldType.Optional || labelPlacement != TextFieldLabelPlacement.Outer) return this
    val alignment = outerLabelIndicatorAlignment(fieldType)

    return this.drawIndicator(
        alignment = alignment,
        color = indicatorColor,
        horizontalPadding = dimensions.indicatorDimensions.horizontalPadding,
        verticalPadding = dimensions.indicatorDimensions.verticalPadding,
        indicatorSize = dimensions.indicatorDimensions.indicatorSize,
        horizontalMode = IndicatorMode.Outer,
        verticalMode = IndicatorMode.Inner,
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
    prefixStyle: TextStyle,
    suffixStyle: TextStyle,
    textStyle: TextStyle,
): @Composable (() -> Unit)? {
    if (placeholder.isNullOrEmpty() && prefix.isNullOrEmpty() && suffix.isNullOrEmpty()) return null
    return {
        PrefixSuffixWrapper(
            mainContent = {
                placeholder?.let {
                    Text(
                        text = it,
                        style = textStyle,
                    )
                }
            },
            prefix = textOrNull(text = prefix, textStyle = prefixStyle),
            suffix = textOrNull(text = suffix, textStyle = suffixStyle),
        )
    }
}

private fun textOrNull(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: TextStyle?,
): @Composable (() -> Unit)? {
    return if (!text.isNullOrEmpty() && textStyle != null) {
        {
            Text(
                modifier = modifier,
                text = text,
                style = textStyle,
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
    labelTextStyle: TextStyle,
    optionalTextStyle: TextStyle,
    horizontalSpacing: Dp,
) {
    val hasContent =
        !labelText.isNullOrEmpty() || fieldType == TextFieldType.Optional && !optionalText.isNullOrEmpty()
    val shouldShowTopContent = labelPlacement == TextFieldLabelPlacement.Outer && hasContent
    if (!shouldShowTopContent) return

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(horizontalSpacing),
    ) {
        TextOrEmpty(
            modifier = Modifier.weight(1f, fill = false),
            text = labelText,
            textStyle = labelTextStyle,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        if (fieldType == TextFieldType.Optional) {
            TextOrEmpty(
                text = optionalText,
                textStyle = optionalTextStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun OuterBottomText(
    modifier: Modifier,
    text: String?,
    textStyle: TextStyle,
    helperTextPlacement: TextFieldHelperTextPlacement,
) {
    val isEmpty = text.isNullOrEmpty()
    if (helperTextPlacement != TextFieldHelperTextPlacement.Outer || isEmpty) return
    Box(modifier = modifier) {
        TextOrEmpty(
            text = text,
            textStyle = textStyle,
        )
    }
}

@Composable
private fun TextOrEmpty(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: TextStyle,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isNullOrEmpty()) return
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
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

private fun KeyboardOptions.updateKeyboardOptions(singleLine: Boolean): KeyboardOptions {
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

private fun KeyboardActions.updateKeyboardActions(singleLine: Boolean): KeyboardActions {
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

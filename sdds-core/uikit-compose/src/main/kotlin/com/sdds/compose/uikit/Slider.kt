package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.slider.BaseSlider
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.abs

/**
 * Компонент Slider.
 * Применяется для указания значения (value) из заданного диапозона.
 * Представляет собой полосу прогресса совместно с Label, блоком, включающим в себя заголовок (title)
 * и иконку (labelContent), с возможностью конфигурирования расположения этих блоков.
 *
 * @param modifier модификатор для контейнера Slider
 * @param style стиль компонента
 * @param value начальное значение прогресса
 * @param title текст заголовка
 * @param labelContent контент расположенный рядом с заголовком, как правило - иконка
 * @param onValueChange колбэк изменения прогрессса
 * @param slideDirection направление slide
 * @param alignment выравнивание всего контента
 * @param valueRange диапазон значений полосы прогресса (от минимального до максимального значений)
 * @param valueMode режим отображения выбранного значения
 * @param valuePlacement расположение выбранного значения отностильно ползунка
 * @param valueFormatTransformer лямбда форматирующая значение (value) прогресса, а так же
 * отображение граничных значений.
 * @param thumbEnabled отображение ползунка (thumb) на полосе прогресса
 * @param labelEnabled отображение блока Label
 * @param limitLabelEnabled отображение лэйблов с граничными значениями
 * @param interactionSource источник взаимодействий
 */
@Composable
@Suppress("LongMethod")
fun Slider(
    modifier: Modifier = Modifier,
    style: SliderStyle = LocalSliderStyle.current,
    value: Float = 0f,
    title: String = "",
    labelContent: (@Composable () -> Unit)? = null,
    onValueChange: ((Float) -> Unit),
    slideDirection: SlideDirection = style.slideDirection,
    alignment: SliderAlignment = style.alignment,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    valueMode: ValueMode = ValueMode.Interaction,
    valuePlacement: ValuePlacement = style.valuePlacement,
    valueFormatTransformer: ValueFormatTransformer = ValueFormatTransformer { it.toString() },
    thumbEnabled: Boolean = true,
    labelEnabled: Boolean = true,
    limitLabelEnabled: Boolean = true,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val textColor = style.colors.limitLabelColor.colorForInteraction(interactionSource)
    val titleColor = style.colors.titleColor.colorForInteraction(interactionSource)
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val isLabelHorizontal = isLabelHorizontal(style.orientation, alignment)
    val titlePaddings = getTitlePaddings(isLabelHorizontal, style.titleAlignment, style.dimensions.titleMargin)
    val limitsValue = resolveValueInLimits(isHorizontal, slideDirection, valueRange)
    SliderComposition(
        modifier = modifier,
        style = style,
        alignment = alignment,
        title = {
            if (labelEnabled && style.titleAlignment != TitleAlignment.None) {
                LabelTitle(titlePaddings, title, style.titleStyle, titleColor)
            }
        },
        labelContent = { if (labelEnabled) LabelContent(iconColor, style.dimensions.iconSize, labelContent) },
        minLabel = {
            if (limitLabelEnabled) {
                Text(
                    text = valueFormatTransformer.transform(limitsValue.first),
                    modifier = Modifier,
                    style = style.limitLabelStyle,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = { textColor },
                )
            }
        },
        maxLabel = {
            if (limitLabelEnabled) {
                Text(
                    text = valueFormatTransformer.transform(limitsValue.second),
                    modifier = Modifier,
                    style = style.limitLabelStyle,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = { textColor },
                )
            }
        },
        slider = {
            BaseSlider(
                modifier = Modifier,
                style = style,
                value = value,
                onValueChange = onValueChange,
                valueFormatTransformer = valueFormatTransformer,
                valueRange = valueRange,
                valueMode = valueMode,
                valuePlacement = valuePlacement,
                slideDirection = slideDirection,
                thumbEnabled = thumbEnabled,
            )
        },
        labelEnabled = labelEnabled,
        limitLabelEnabled = limitLabelEnabled,
    )
}

/**
 * Преобразователь формата отображаемого прогресса
 */
fun interface ValueFormatTransformer {

    /**
     * Колбэк изменения формата
     * @param value текущее значение прогресса
     */
    fun transform(value: Float): String
}

/**
 * Расположение полосы прогресса
 */
enum class SliderOrientation {

    /**
     * Горизонтальное расположение
     */
    Horizontal,

    /**
     * Вертикальное расположение
     */
    Vertical,
}

/**
 * Расположение заголовка в блоке Label
 */
enum class TitleAlignment {

    /**
     * Заголовок не отображается
     */
    None,

    /**
     * Заголовок вначале
     */
    Start,

    /**
     * Заголовок вконце
     */
    End,
}

/**
 * Расположение блока Label относительно полосы прогресса
 */
enum class LabelAlignment {

    /**
     * Расположение блока Label над полосой прогресса
     */
    Top,

    /**
     * Расположение блока Label на одном уровне с полосой прогресса
     * в горизонтальной оринетации
     */
    Center,

    /**
     * Расположение блока Label под полосой прогресса
     */
    Bottom,
}

/**
 * Выравнивание всего контента (работает как Gravity)
 */
enum class SliderAlignment {

    /**
     * Выравнивает весь контент к началу
     */
    Start,

    /**
     * Выравнивает весь контент по центру
     */
    Center,

    /**
     * Выравнивает весь контент к концу
     */
    End,
}

/**
 * Расположение лэйблов ограничений
 */
enum class LimitLabelAlignment {

    /**
     * Расположение сверху или вначале
     */
    Start,

    /**
     * Расположение в одну линию со Slider
     */
    Center,

    /**
     * Расположение снизу или вконце
     */
    End,
}

/**
 * Направление slide
 */
enum class SlideDirection {

    /**
     * Увеличение значения происходит слева направо, либо снизу вверх
     */
    Normal,

    /**
     * Увеличение значения происходит справо налево, либо сверху вниз
     */
    Reversed,
}

/**
 * Расположение текста установленного значения
 */
enum class ValuePlacement {

    /**
     * Расположение вначале
     */
    Start,

    /**
     * Расположение сверху
     */
    Top,

    /**
     * Расположение вконце
     */
    End,

    /**
     * Расположение снизу
     */
    Bottom,
}

/**
 * Режим отображения выбранного значения
 */
enum class ValueMode {

    /**
     * Значение не отображается
     */
    None,

    /**
     * Значение отображается пока идет взаимодействие с ползунком
     */
    Interaction,
}

private fun resolveValueInLimits(
    isHorizontal: Boolean,
    slideDirection: SlideDirection,
    valueRange: ClosedFloatingPointRange<Float>,
): Pair<Float, Float> {
    return if (isHorizontal) {
        val minValue = if (slideDirection == SlideDirection.Normal) valueRange.start else valueRange.endInclusive
        val maxValue = if (slideDirection == SlideDirection.Normal) valueRange.endInclusive else valueRange.start
        minValue to maxValue
    } else {
        val maxValue = if (slideDirection == SlideDirection.Normal) valueRange.start else valueRange.endInclusive
        val minValue = if (slideDirection == SlideDirection.Normal) valueRange.endInclusive else valueRange.start
        minValue to maxValue
    }
}

@Composable
private fun LabelTitle(
    paddingValues: PaddingValues,
    text: String,
    textStyle: TextStyle,
    textColor: Color,
) {
    if (text.isNotBlank()) {
        StyledText(
            modifier = Modifier.padding(paddingValues),
            text = text,
            textStyle = textStyle,
            textColor = textColor,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun LabelContent(
    iconColor: Color,
    iconSize: Dp,
    content: (@Composable () -> Unit)? = null,
) {
    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
    CompositionLocalProvider(
        LocalTint provides iconColor,
        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
    ) {
        content?.invoke()
    }
}

private fun getTitlePaddings(
    isHorizontal: Boolean,
    titleAlignment: TitleAlignment,
    margin: Dp,
) = when {
    titleAlignment == TitleAlignment.None -> PaddingValues(0.dp)
    isHorizontal && titleAlignment == TitleAlignment.End -> PaddingValues(start = margin)
    isHorizontal && titleAlignment == TitleAlignment.Start -> PaddingValues(end = margin)
    !isHorizontal && titleAlignment == TitleAlignment.End -> PaddingValues(top = margin)
    else -> PaddingValues(bottom = margin)
}

@Composable
private fun SliderComposition(
    modifier: Modifier,
    style: SliderStyle,
    alignment: SliderAlignment,
    title: @Composable () -> Unit,
    labelContent: @Composable () -> Unit,
    minLabel: @Composable () -> Unit,
    maxLabel: @Composable () -> Unit,
    slider: (@Composable () -> Unit),
    labelEnabled: Boolean,
    limitLabelEnabled: Boolean,
) {
    val limitMargin = calculateMargin(style).px
    val labelMargin = style.dimensions.labelMargin.px
    val measurePolicy = remember(
        style.orientation,
        style.titleAlignment,
        style.limitLabelAlignment,
        style.labelAlignment,
        alignment,
        labelEnabled,
        limitLabelEnabled,
    ) {
        SliderMeasurePolicy(style, alignment, limitMargin, labelMargin)
    }
    Layout(
        modifier = modifier,
        measurePolicy = measurePolicy,
        content = {
            Box(modifier = Modifier.layoutId(TITLE)) {
                title()
            }
            Box(modifier = Modifier.layoutId(CONTENT)) {
                labelContent()
            }
            Box(modifier = Modifier.layoutId(MIN_LABEL)) {
                minLabel()
            }
            Box(modifier = Modifier.layoutId(MAX_LABEL)) {
                maxLabel()
            }
            Box(
                modifier = Modifier
                    .layoutId(SLIDER),
            ) {
                slider()
            }
        },
    )
}

private fun calculateMargin(style: SliderStyle): Dp {
    val margin = style.dimensions.limitLabelMargin
    val thickness = maxOf(style.dimensions.trackThickness, style.dimensions.indicatorThickness)
    val thumbOffset = (style.dimensions.thumbSize - thickness) / 2
    val marginFromThumb = if (thumbOffset > margin) 0.dp else margin - thumbOffset
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Center -> margin
        else -> marginFromThumb
    }
}

private class SliderMeasurePolicy(
    private val style: SliderStyle,
    private val alignment: SliderAlignment,
    limMargin: Int,
    labMargin: Int,
) : MeasurePolicy {
    private var limitMargin = limMargin
    private var labelMargin = labMargin

    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val title = measurables.find { it.layoutId == TITLE }
        val content = measurables.find { it.layoutId == CONTENT }
        val minLabel = measurables.find { it.layoutId == MIN_LABEL }
        val maxLabel = measurables.find { it.layoutId == MAX_LABEL }
        val slider = measurables.find { it.layoutId == SLIDER }

        val titlePlaceable = title?.measure(constraints)
        val titleW = titlePlaceable.widthOrZero()
        val titleH = titlePlaceable.heightOrZero()
        val crsAfterTitle = constraints.offset(
            horizontal = -titleW,
            vertical = -titleH,
        )

        val contentPlaceable = content?.measure(crsAfterTitle)
        val contentW = contentPlaceable.widthOrZero()
        val contentH = contentPlaceable.heightOrZero()
        val crsAfterContent = constraintsAfterContent(
            titleW,
            titleH,
            contentW,
            contentH,
            crsAfterTitle,
            alignment,
            style.orientation,
        )

        val isLabelHorizontal = isLabelHorizontal(style.orientation, alignment)
        val (labelW, labelH) = calculateLabelSize(titleW, titleH, contentW, contentH, isLabelHorizontal)

        if (labelH == 0 || labelW == 0) labelMargin = 0
        val crsAfterLabel = constraintsAfterLabel(labelMargin, style, constraints, crsAfterContent)

        val minLPlaceable = minLabel?.measure(crsAfterLabel)
        val minLabelW = minLPlaceable.widthOrZero()
        val minLabelH = minLPlaceable.heightOrZero()

        val maxLPlaceable = maxLabel?.measure(
            constraintsAfterMinLimit(minLabelW, minLabelH, limitMargin, style, crsAfterLabel),
        )
        val maxLabelW = maxLPlaceable.widthOrZero()
        val maxLabelH = maxLPlaceable.heightOrZero()
        if (minLabelH == 0 || maxLabelH == 0) limitMargin = 0
        val crsAfterLimits = constraintsAfterLimits(
            minLabelW,
            minLabelH,
            maxLabelW,
            maxLabelH,
            limitMargin,
            style,
            crsAfterLabel,
        )

        val sliderPlaceable = slider?.measure(crsAfterLimits)
        val sliderW = sliderPlaceable.widthOrZero()
        val sliderH = sliderPlaceable.heightOrZero()

        val finalH = constraints.constrainHeight(
            calculateTotalHeight(labelH, minLabelH, maxLabelH, sliderH, limitMargin, labelMargin, style),
        )
        val finalW = constraints.constrainWidth(
            calculateTotalWidth(
                labelW, contentW, minLabelW, maxLabelW, sliderW, limitMargin, labelMargin, style, alignment,
            ),
        )
        val (labelOffsetX, labelOffsetY) = resolveLabelCords(
            contentW,
            labelW to labelH,
            minLPlaceable,
            maxLPlaceable,
            sliderPlaceable,
            finalW to finalH,
            limitMargin,
            labelMargin,
            alignment,
            style,
        )

        val (titleOffsetX, titleOffsetY) = resolveTitleCords(
            labelOffsetX,
            labelOffsetY,
            labelW to labelH,
            titlePlaceable,
            contentPlaceable,
            isLabelHorizontal,
            style.titleAlignment,
        )

        val (contentOffsetX, contentOffsetY) = resolveContentCords(
            labelOffsetX,
            labelOffsetY,
            labelW to labelH,
            titlePlaceable,
            contentPlaceable,
            isLabelHorizontal,
            style.titleAlignment,
        )

        val (sliderOffsetX, sliderOffsetY) = resolveSliderCords(
            contentW,
            labelW to labelH,
            minLPlaceable,
            maxLPlaceable,
            sliderPlaceable,
            finalW,
            limitMargin,
            labelMargin,
            style,
            alignment,
        )

        val (minLabOffsetX, minLabOffsetY) = resolveMinLabelCords(
            sliderOffsetX,
            sliderOffsetY,
            minLPlaceable,
            sliderPlaceable,
            limitMargin,
            style,
        )
        val (maxLabOffsetX, maxLabOffsetY) = resolveMaxLabelCords(
            sliderOffsetX,
            sliderOffsetY,
            maxLPlaceable,
            sliderPlaceable,
            finalW,
            limitMargin,
            style,
        )

        return layout(finalW, finalH) {
            titlePlaceable?.placeRelative(titleOffsetX, titleOffsetY)
            contentPlaceable?.placeRelative(contentOffsetX, contentOffsetY)
            sliderPlaceable?.placeRelative(sliderOffsetX, sliderOffsetY)
            minLPlaceable?.placeRelative(minLabOffsetX, minLabOffsetY)
            maxLPlaceable?.placeRelative(maxLabOffsetX, maxLabOffsetY)
        }
    }
}

private fun calculateLabelSize(
    titleW: Int,
    titleH: Int,
    contentW: Int,
    contentH: Int,
    isLabelHorizontal: Boolean,
): Pair<Int, Int> {
    val labelW = if (isLabelHorizontal) {
        titleW + contentW
    } else {
        maxOf(titleW, contentW)
    }
    val labelH = if (isLabelHorizontal) {
        maxOf(titleH, contentH)
    } else {
        titleH + contentH
    }
    return labelW to labelH
}

private fun isLabelHorizontal(
    orientation: SliderOrientation,
    alignment: SliderAlignment,
): Boolean {
    val isHorizontal = orientation == SliderOrientation.Horizontal
    return isHorizontal || (!isHorizontal && alignment != SliderAlignment.Center)
}

private fun constraintsAfterContent(
    titleW: Int,
    titleH: Int,
    contentW: Int,
    contentH: Int,
    constraints: Constraints,
    alignment: SliderAlignment,
    orientation: SliderOrientation,
): Constraints {
    val isHorizontal = orientation == SliderOrientation.Horizontal
    val isLabelHorizontal = isHorizontal || (!isHorizontal && alignment != SliderAlignment.Center)
    val extraW = titleW - contentW
    val extraH = titleH - contentH
    val deltaWidth = if (isLabelHorizontal) {
        contentW
    } else {
        if (extraW < 0) abs(extraW) else 0
    }
    val deltaHeight = if (isLabelHorizontal) {
        if (extraH < 0) abs(extraH) else 0
    } else {
        contentH
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun constraintsAfterLabel(
    labelMargin: Int,
    style: SliderStyle,
    originConstraints: Constraints,
    newConstraints: Constraints,
): Constraints {
    val maxWidth = when {
        style.orientation == SliderOrientation.Horizontal && style.labelAlignment == LabelAlignment.Center ->
            newConstraints.maxWidth - labelMargin

        else -> originConstraints.maxWidth
    }
    val maxHeight = when {
        style.orientation == SliderOrientation.Vertical ||
            style.orientation == SliderOrientation.Horizontal && style.labelAlignment != LabelAlignment.Center ->
            newConstraints.maxHeight - labelMargin

        else -> originConstraints.maxHeight
    }
    return newConstraints.copy(maxWidth = maxWidth.coerceAtLeast(0), maxHeight = maxHeight.coerceAtLeast(0))
}

private fun constraintsAfterMinLimit(
    minLabelW: Int,
    minLabelH: Int,
    limitMargin: Int,
    style: SliderStyle,
    constraints: Constraints,
): Constraints {
    val orient = style.orientation
    val deltaWidth = when {
        orient == SliderOrientation.Horizontal -> minLabelW + limitMargin
        else -> 0
    }
    val deltaHeight = when {
        style.orientation == SliderOrientation.Vertical -> minLabelH + limitMargin
        else -> 0
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun constraintsAfterLimits(
    minLabelW: Int,
    minLabelH: Int,
    maxLabelW: Int,
    maxLabelH: Int,
    limitMargin: Int,
    style: SliderStyle,
    constraints: Constraints,
): Constraints {
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    val limitsWSum = minLabelW + maxLabelW + limitMargin * 2
    val limitsWMax = maxOf(minLabelW, maxLabelW)
    val deltaWidth = when {
        orientation == SliderOrientation.Horizontal && limitsPlace == LimitLabelAlignment.Center ->
            limitsWSum

        orientation == SliderOrientation.Vertical && limitsPlace != LimitLabelAlignment.Center ->
            limitsWMax + limitMargin

        else -> 0
    }
    val limitsHSum = minLabelH + maxLabelH + limitMargin * 2
    val limitsHMax = maxOf(minLabelH, maxLabelH)
    val deltaHeight = when {
        orientation == SliderOrientation.Vertical && limitsPlace == LimitLabelAlignment.Center ->
            limitsHSum

        orientation == SliderOrientation.Horizontal && limitsPlace != LimitLabelAlignment.Center ->
            limitsHMax + limitMargin

        else -> 0
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun calculateTotalHeight(
    labelH: Int,
    minLabelH: Int,
    maxLabelH: Int,
    sliderH: Int,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
): Int {
    val labelPlacement = style.labelAlignment
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    var height: Int
    when (orientation) {
        SliderOrientation.Horizontal -> {
            height = when {
                labelPlacement == LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                    maxOf(labelH, minLabelH, maxLabelH, sliderH)

                labelPlacement != LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                    labelH + labelMargin + maxOf(minLabelH, maxLabelH, sliderH)

                labelPlacement != LabelAlignment.Center && limitsPlace != LimitLabelAlignment.Center ->
                    labelH + labelMargin + sliderH + maxOf(minLabelH, maxLabelH) + limitMargin

                else -> calculateHeightAccordingLimits(labelH, minLabelH, maxLabelH, sliderH, limitMargin)
            }
        }

        else -> {
            height = when {
                limitsPlace == LimitLabelAlignment.Center ->
                    labelH + labelMargin + minLabelH + maxLabelH + sliderH + limitMargin * 2

                else -> labelH + labelMargin + sliderH
            }
        }
    }
    return height
}

private fun calculateHeightAccordingLimits(
    labelH: Int,
    minLabelH: Int,
    maxLabelH: Int,
    sliderH: Int,
    limitMargin: Int,
): Int {
    val extra = (labelH - sliderH) / 2
    val maxOfLabels = maxOf(minLabelH, maxLabelH)
    if (extra < 0) return sliderH + maxOfLabels + limitMargin
    return if (extra < maxOfLabels + limitMargin) {
        sliderH + limitMargin + maxOfLabels + extra
    } else {
        labelH
    }
}

private fun calculateTotalWidth(
    labelW: Int,
    contentW: Int,
    minLabelW: Int,
    maxLabelW: Int,
    sliderW: Int,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val labelPlacement = style.labelAlignment
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    return when (orientation) {
        SliderOrientation.Horizontal -> {
            when {
                labelPlacement == LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                    labelW + labelMargin + minLabelW + sliderW + maxLabelW + limitMargin * 2

                labelPlacement == LabelAlignment.Center && limitsPlace != LimitLabelAlignment.Center ->
                    labelW + labelMargin + sliderW

                labelPlacement != LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                    minLabelW + maxLabelW + sliderW + limitMargin * 2

                else -> sliderW
            }
        }

        else ->
            calculateWidthVertical(labelW, contentW, minLabelW, maxLabelW, sliderW, limitMargin, style, alignment)
    }
}

private fun calculateWidthVertical(
    labelW: Int,
    contentW: Int,
    minLabelW: Int,
    maxLabelW: Int,
    sliderW: Int,
    limitMargin: Int,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val limitsPlace = style.limitLabelAlignment
    val maxOfLimitsW = maxOf(minLabelW, maxLabelW)
    val sliderWithLimitsW = if (limitsPlace != LimitLabelAlignment.Center) {
        sliderW + limitMargin + maxOfLimitsW
    } else {
        if (sliderW > maxOfLimitsW) sliderW else maxOfLimitsW
    }
    val contentExtra = (contentW - sliderW) / 2
    val labelBigger = labelW > sliderWithLimitsW
    val needToCentering = needToCenteringContentAndSlider(style, alignment)
    return when (alignment) {
        SliderAlignment.Center ->
            widthVerticalAlignmentCenter(labelW, minLabelW, maxLabelW, sliderW, limitMargin, style)

        else -> {
            if (needToCentering) {
                if (contentExtra >= 0) {
                    maxOf(labelW, sliderWithLimitsW + contentExtra)
                } else {
                    maxOf((abs(contentExtra) + labelW), sliderWithLimitsW)
                }
            } else {
                if (labelBigger) labelW else sliderWithLimitsW
            }
        }
    }
}

private fun widthVerticalAlignmentCenter(
    labelW: Int,
    minLabelW: Int,
    maxLabelW: Int,
    sliderW: Int,
    limitMargin: Int,
    style: SliderStyle,
): Int {
    val maxOfLimitsW = maxOf(minLabelW, maxLabelW)
    if (style.limitLabelAlignment == LimitLabelAlignment.Center) {
        return maxOf(labelW, sliderW, maxOfLimitsW)
    }
    val extraLabel = (labelW - sliderW) / 2
    return when {
        extraLabel <= 0 -> sliderW + limitMargin + maxOfLimitsW
        extraLabel >= maxOfLimitsW + limitMargin -> labelW
        else -> extraLabel + sliderW + maxOfLimitsW + limitMargin
    }
}

private fun needToCenteringContentAndSlider(
    style: SliderStyle,
    alignment: SliderAlignment,
): Boolean {
    val limitsEnd = style.limitLabelAlignment == LimitLabelAlignment.End
    val titleEnd = style.titleAlignment == TitleAlignment.End

    val limitsStart = style.limitLabelAlignment == LimitLabelAlignment.Start
    val titleStart = style.titleAlignment == TitleAlignment.Start

    return when (alignment) {
        SliderAlignment.Start -> limitsEnd && titleEnd
        SliderAlignment.End -> limitsStart && titleStart
        else -> false
    }
}

private fun resolveLabelCords(
    contentW: Int,
    label: Pair<Int, Int>,
    minLPlaceable: Placeable?,
    maxLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    final: Pair<Int, Int>,
    limitMargin: Int,
    labelMargin: Int,
    alignment: SliderAlignment,
    style: SliderStyle,
): Pair<Int, Int> {
    return if (style.orientation == SliderOrientation.Horizontal) {
        val x = if (alignment == SliderAlignment.End) final.first - label.first else 0
        val y = labelYHorizontal(
            label,
            minLPlaceable,
            maxLPlaceable,
            sliderPlaceable,
            limitMargin,
            labelMargin,
            style,
        )
        x to y
    } else {
        val x = labelXVertical(
            contentW, label, minLPlaceable, maxLPlaceable, sliderPlaceable, final, limitMargin, alignment, style,
        )
        val y = if (style.labelAlignment == LabelAlignment.Bottom) final.second - label.second else 0
        x to y
    }
}

private fun labelYHorizontal(
    label: Pair<Int, Int>,
    minLPlaceable: Placeable?,
    maxLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
): Int {
    val labelH = label.second
    val minLabelH = minLPlaceable.heightOrZero()
    val maxLabelH = maxLPlaceable.heightOrZero()
    val sliderH = sliderPlaceable.heightOrZero()
    val labelPlacement = style.labelAlignment
    val limitsPlace = style.limitLabelAlignment
    val maxOfLabels = maxOf(minLabelH, maxLabelH)
    return when (labelPlacement) {
        LabelAlignment.Top -> 0
        LabelAlignment.Center ->
            offsetYWhenLabelCenter(labelH, minLabelH, maxLabelH, sliderH, limitMargin, style)

        LabelAlignment.Bottom -> {
            when (limitsPlace) {
                LimitLabelAlignment.Center -> maxOf(maxOfLabels, sliderH) + labelMargin
                else -> maxOfLabels + limitMargin + sliderH + labelMargin
            }
        }
    }
}

private fun offsetYWhenLabelCenter(
    labelH: Int,
    minLabelH: Int,
    maxLabelH: Int,
    sliderH: Int,
    limitMargin: Int,
    style: SliderStyle,
): Int {
    val limitsPlace = style.limitLabelAlignment
    val extra = (labelH - sliderH) / 2
    val maxOfLabels = maxOf(minLabelH, maxLabelH)
    return when (limitsPlace) {
        LimitLabelAlignment.Start -> {
            if (extra < 0) {
                maxOfLabels + limitMargin + abs(extra)
            } else if (extra in 0..maxOfLabels + limitMargin) {
                maxOfLabels + limitMargin - extra
            } else {
                0
            }
        }

        LimitLabelAlignment.Center -> {
            val maximum = maxOf(labelH, minLabelH, maxLabelH, sliderH)
            if (maximum == labelH) {
                0
            } else {
                abs((labelH - maxOf(minLabelH, maxLabelH, sliderH)) / 2)
            }
        }

        LimitLabelAlignment.End -> {
            if (extra > 0) 0 else abs(extra)
        }
    }
}

private fun labelXVertical(
    contentW: Int,
    label: Pair<Int, Int>,
    minLPlaceable: Placeable?,
    maxLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    final: Pair<Int, Int>,
    limitMargin: Int,
    alignment: SliderAlignment,
    style: SliderStyle,
): Int {
    val labelW = label.first
    val minLabelW = minLPlaceable.widthOrZero()
    val maxLabelW = maxLPlaceable.widthOrZero()
    val sliderW = sliderPlaceable.widthOrZero()
    val finalW = final.first
    val maxLimitW = maxOf(minLabelW, maxLabelW)
    val sliderAndLimitsW = maxLimitW + limitMargin + sliderW
    val offset = when (alignment) {
        SliderAlignment.Start ->
            labelXVerticalAlignmentStart(contentW, labelW, minLabelW, maxLabelW, sliderW, style)

        SliderAlignment.Center ->
            labelXVerticalAlignmentCenter(labelW, sliderW, maxLimitW, limitMargin, finalW, style)

        SliderAlignment.End ->
            labelXVerticalAlignmentEnd(contentW, labelW, minLabelW, maxLabelW, sliderW, sliderAndLimitsW, finalW, style)
    }
    return offset
}

private fun labelXVerticalAlignmentStart(
    contentW: Int,
    labelW: Int,
    minLabelW: Int,
    maxLabelW: Int,
    sliderW: Int,
    style: SliderStyle,
): Int {
    val maxLimitW = maxOf(minLabelW, maxLabelW)
    val maxContentW = maxOf(maxLimitW, sliderW)
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> 0
        LimitLabelAlignment.Center -> if (labelW > maxContentW) 0 else (maxContentW - labelW) / 2
        LimitLabelAlignment.End -> {
            if (style.titleAlignment == TitleAlignment.End) {
                if (sliderW < contentW) 0 else (sliderW - contentW) / 2
            } else {
                0
            }
        }
    }
}

private fun labelXVerticalAlignmentCenter(
    labelW: Int,
    sliderW: Int,
    maxLimitW: Int,
    limitMargin: Int,
    finalW: Int,
    style: SliderStyle,
): Int {
    val extra = (labelW - sliderW) / 2
    val extraAccordingLimits = if (extra >= maxLimitW + limitMargin) extra else maxLimitW + limitMargin
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (extraAccordingLimits == extra) {
                0
            } else {
                if (extra >= 0) {
                    extraAccordingLimits - extra
                } else {
                    extraAccordingLimits + abs(extra)
                }
            }
        }

        LimitLabelAlignment.End -> if (extra > 0) 0 else abs(extra)
        LimitLabelAlignment.Center -> (finalW - labelW) / 2
    }
}

private fun labelXVerticalAlignmentEnd(
    contentW: Int,
    labelW: Int,
    minLabelW: Int,
    maxLabelW: Int,
    sliderW: Int,
    sliderAndLimitsW: Int,
    finalW: Int,
    style: SliderStyle,
): Int {
    val start = finalW - labelW
    val maxLimitW = maxOf(minLabelW, maxLabelW)
    val maxContentW = maxOf(maxLimitW, sliderW)
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (style.titleAlignment == TitleAlignment.Start) {
                if (sliderW < contentW) start else start - (sliderW - contentW) / 2
            } else {
                start
            }
        }

        LimitLabelAlignment.Center -> if (labelW > maxContentW) 0 else start
        LimitLabelAlignment.End -> if (labelW > sliderAndLimitsW) 0 else start
    }
}

private fun resolveTitleCords(
    labelX: Int,
    labelY: Int,
    label: Pair<Int, Int>,
    titlePlaceable: Placeable?,
    contentPlaceable: Placeable?,
    isLabelHorizontal: Boolean,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    if (titlePlaceable == null) return 0 to 0
    val titleH = titlePlaceable.heightOrZero()
    val contentH = contentPlaceable.heightOrZero()
    val labelH = label.second
    val titleW = titlePlaceable.widthOrZero()
    val contentW = titlePlaceable.widthOrZero()
    val labelW = label.first
    return if (isLabelHorizontal) {
        titleCordsHorizontal(labelX, labelY, titleH, titleW, contentH, labelW, titleAlignment)
    } else {
        titleCordsVertical(labelX, labelY, titleH, titleW, contentW, labelH, titleAlignment)
    }
}

private fun titleCordsHorizontal(
    labelX: Int,
    labelY: Int,
    titleH: Int,
    titleW: Int,
    contentH: Int,
    labelW: Int,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    val isTitleHigher = titleH > contentH
    val y = if (isTitleHigher) labelY else labelY + (contentH - titleH) / 2
    val x = if (titleAlignment == TitleAlignment.End) {
        labelX + (labelW - titleW)
    } else {
        labelX
    }
    return x to y
}

private fun titleCordsVertical(
    labelX: Int,
    labelY: Int,
    titleH: Int,
    titleW: Int,
    contentW: Int,
    labelH: Int,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    val isTitleWider = titleW > contentW
    val x = if (isTitleWider) labelX else labelX + (contentW - titleW) / 2
    val y = if (titleAlignment == TitleAlignment.End) {
        labelY + (labelH - titleH)
    } else {
        labelY
    }
    return x to y
}

private fun resolveContentCords(
    labelX: Int,
    labelY: Int,
    label: Pair<Int, Int>,
    titlePlaceable: Placeable?,
    contentPlaceable: Placeable?,
    isLabelHorizontal: Boolean,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    if (contentPlaceable == null) return 0 to 0
    val titleH = titlePlaceable.heightOrZero()
    val contentH = contentPlaceable.heightOrZero()
    val labelH = label.second
    val titleW = titlePlaceable.widthOrZero()
    val contentW = contentPlaceable.widthOrZero()
    val labelW = label.first
    return if (isLabelHorizontal) {
        contentCordsHorizontal(labelX, labelY, titleH, contentH, labelW, titleAlignment)
    } else {
        contentCordsVertical(labelX, labelY, titleW, contentW, contentH, labelH, titleAlignment)
    }
}

private fun contentCordsHorizontal(
    labelX: Int,
    labelY: Int,
    titleH: Int,
    contentH: Int,
    labelW: Int,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    val isContentHigher = contentH >= titleH
    val y = if (isContentHigher) labelY else labelY + (titleH - contentH) / 2
    val x = if (titleAlignment == TitleAlignment.Start) {
        labelX + (labelW - contentH)
    } else {
        labelX
    }
    return x to y
}

private fun contentCordsVertical(
    labelX: Int,
    labelY: Int,
    titleW: Int,
    contentW: Int,
    contentH: Int,
    labelH: Int,
    titleAlignment: TitleAlignment,
): Pair<Int, Int> {
    val isContentWider = contentW >= titleW
    val x = if (isContentWider) labelX else labelX + (titleW - contentW) / 2
    val y = if (titleAlignment == TitleAlignment.Start) {
        labelY + (labelH - contentH)
    } else {
        labelY
    }
    return x to y
}

private fun resolveSliderCords(
    contentW: Int,
    label: Pair<Int, Int>,
    minLPlaceable: Placeable?,
    maxLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    finalW: Int,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
    alignment: SliderAlignment,
): Pair<Int, Int> {
    val labelW = label.first
    val labelH = label.second
    val minLabelW = minLPlaceable.widthOrZero()
    val minLabelH = minLPlaceable.heightOrZero()
    val maxLabelW = maxLPlaceable.widthOrZero()
    val maxLabelH = maxLPlaceable.heightOrZero()
    val sliderW = sliderPlaceable.widthOrZero()
    val sliderH = sliderPlaceable.heightOrZero()
    val maxLimitW = maxOf(minLabelW, maxLabelW)
    return if (style.orientation == SliderOrientation.Horizontal) {
        val x = sliderXHorizontal(labelW, minLabelW, limitMargin, labelMargin, style, alignment)
        val y = sliderYHorizontal(labelH, minLabelH, maxLabelH, limitMargin, labelMargin, sliderH, style)
        x to y
    } else {
        val x = sliderXVertical(contentW, labelW, sliderW, maxLimitW, finalW, limitMargin, alignment, style)
        val y = sliderYVertical(labelH, minLabelH, limitMargin, labelMargin, style)
        x to y
    }
}

private fun sliderXHorizontal(
    labelW: Int,
    minLabelW: Int,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val limitsPlace = style.limitLabelAlignment
    return when (style.labelAlignment) {
        LabelAlignment.Center -> {
            if (alignment == SliderAlignment.End) {
                if (limitsPlace == LimitLabelAlignment.Center) minLabelW + limitMargin else 0
            } else {
                if (limitsPlace == LimitLabelAlignment.Center) {
                    labelW + labelMargin + minLabelW + limitMargin
                } else {
                    labelW + labelMargin
                }
            }
        }

        else -> if (limitsPlace == LimitLabelAlignment.Center) minLabelW + limitMargin else 0
    }
}

private fun sliderYHorizontal(
    labelH: Int,
    minLabelH: Int,
    maxLabelH: Int,
    limitMargin: Int,
    labelMargin: Int,
    sliderH: Int,
    style: SliderStyle,
): Int {
    val maxLimitsH = maxOf(minLabelH, maxLabelH)
    return when (style.labelAlignment) {
        LabelAlignment.Center ->
            sliderYHorizontalLimitsCenter(labelH, maxLimitsH, sliderH, limitMargin, style.limitLabelAlignment)

        else -> {
            val labelHeight = if (style.labelAlignment == LabelAlignment.Top) labelH + labelMargin else 0
            when (style.limitLabelAlignment) {
                LimitLabelAlignment.End -> labelHeight
                LimitLabelAlignment.Start -> labelHeight + maxLimitsH + limitMargin
                else -> {
                    val extra = (sliderH - maxLimitsH) / 2
                    if (extra > 0) labelHeight else labelHeight + extra
                }
            }
        }
    }
}

private fun sliderYHorizontalLimitsCenter(
    labelH: Int,
    maxLimitsH: Int,
    sliderH: Int,
    limitMargin: Int,
    limitLabelAlignment: LimitLabelAlignment,
): Int {
    val extra = (labelH - sliderH) / 2
    val bigLabel = extra >= maxLimitsH + limitMargin
    val limitsExtra = (maxLimitsH - sliderH) / 2
    val bigLimits = limitsExtra > 0
    return when (limitLabelAlignment) {
        LimitLabelAlignment.End -> if (extra < 0) 0 else extra
        LimitLabelAlignment.Start -> if (bigLabel) extra else maxLimitsH + limitMargin
        else -> {
            if (extra < 0) {
                if (bigLimits) limitsExtra else 0
            } else {
                extra
            }
        }
    }
}

private fun sliderXVertical(
    contentW: Int,
    labelW: Int,
    sliderW: Int,
    maxLimitW: Int,
    finalW: Int,
    limitMargin: Int,
    alignment: SliderAlignment,
    style: SliderStyle,
): Int {
    return when (alignment) {
        SliderAlignment.Start -> sliderXVerticalAlignmentStart(contentW, sliderW, maxLimitW, limitMargin, style)
        SliderAlignment.Center -> sliderXVerticalAlignmentCenter(labelW, sliderW, maxLimitW, finalW, limitMargin, style)
        SliderAlignment.End -> sliderXVerticalAlignmentEnd(contentW, sliderW, maxLimitW, finalW, limitMargin, style)
    }
}

private fun sliderXVerticalAlignmentStart(
    contentW: Int,
    sliderW: Int,
    maxLimitW: Int,
    limitMargin: Int,
    style: SliderStyle,
): Int {
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> maxLimitW + limitMargin
        LimitLabelAlignment.Center -> if (sliderW > maxLimitW) 0 else (maxLimitW - sliderW) / 2
        LimitLabelAlignment.End -> {
            if (style.titleAlignment == TitleAlignment.End) {
                if (sliderW < contentW) (contentW - sliderW) / 2 else 0
            } else {
                0
            }
        }
    }
}

private fun sliderXVerticalAlignmentCenter(
    labelW: Int,
    sliderW: Int,
    maxLimitW: Int,
    finalW: Int,
    limitMargin: Int,
    style: SliderStyle,
): Int {
    val extra = (labelW - sliderW) / 2
    val extraAccordingLimits = if (extra >= maxLimitW + limitMargin) extra else maxLimitW + limitMargin
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (extra < 0) maxLimitW + limitMargin else extraAccordingLimits
        }

        LimitLabelAlignment.End -> if (extra < 0) 0 else extra
        LimitLabelAlignment.Center -> (finalW - sliderW) / 2
    }
}

private fun sliderXVerticalAlignmentEnd(
    contentW: Int,
    sliderW: Int,
    maxLimitW: Int,
    finalW: Int,
    limitMargin: Int,
    style: SliderStyle,
): Int {
    val start = finalW - sliderW
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (style.titleAlignment == TitleAlignment.Start) {
                if (sliderW > contentW) start else start - (contentW - sliderW) / 2
            } else {
                start
            }
        }

        LimitLabelAlignment.Center ->
            if (sliderW > maxLimitW) start else start - (maxLimitW - sliderW) / 2

        LimitLabelAlignment.End -> finalW - maxLimitW - limitMargin - sliderW
    }
}

private fun sliderYVertical(
    labelH: Int,
    minLabelH: Int,
    limitMargin: Int,
    labelMargin: Int,
    style: SliderStyle,
): Int {
    val limitsHeight = if (style.limitLabelAlignment == LimitLabelAlignment.Center) minLabelH + limitMargin else 0
    return if (style.labelAlignment == LabelAlignment.Bottom) limitsHeight else labelH + labelMargin + limitsHeight
}

private fun resolveMinLabelCords(
    sliderX: Int,
    sliderY: Int,
    minLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    limitMargin: Int,
    style: SliderStyle,
): Pair<Int, Int> {
    if (minLPlaceable == null) return 0 to 0
    val minLabelW = minLPlaceable.widthOrZero()
    val minLabelH = minLPlaceable.heightOrZero()
    val sliderW = sliderPlaceable.widthOrZero()
    val sliderH = sliderPlaceable.heightOrZero()
    return when (style.orientation) {
        SliderOrientation.Horizontal ->
            minLabelCordsHorizontal(
                sliderX,
                sliderY,
                sliderH,
                minLabelW,
                minLabelH,
                limitMargin,
                style.limitLabelAlignment,
            )

        else ->
            minLabelCordsVertical(
                sliderX,
                sliderY,
                sliderW,
                minLabelW,
                minLabelH,
                limitMargin,
                style.limitLabelAlignment,
            )
    }
}

private fun minLabelCordsHorizontal(
    sliderX: Int,
    sliderY: Int,
    sliderH: Int,
    minLabelW: Int,
    minLabelH: Int,
    limitMargin: Int,
    limitsAlignment: LimitLabelAlignment,
): Pair<Int, Int> {
    val x = if (limitsAlignment == LimitLabelAlignment.Center) {
        sliderX - limitMargin - minLabelW
    } else {
        sliderX
    }
    val y = limitLabelYHorizontal(sliderY, minLabelH, sliderH, limitMargin, limitsAlignment)
    return x to y
}

private fun minLabelCordsVertical(
    sliderX: Int,
    sliderY: Int,
    sliderW: Int,
    minLabelW: Int,
    minLabelH: Int,
    limitMargin: Int,
    limitsAlignment: LimitLabelAlignment,
): Pair<Int, Int> {
    val x = limitLabelXVertical(sliderX, minLabelW, sliderW, limitMargin, limitsAlignment)
    val y = if (limitsAlignment != LimitLabelAlignment.Center) {
        sliderY
    } else {
        sliderY - limitMargin - minLabelH
    }
    return x to y
}

private fun resolveMaxLabelCords(
    sliderX: Int,
    sliderY: Int,
    maxLPlaceable: Placeable?,
    sliderPlaceable: Placeable?,
    finalW: Int,
    limitMargin: Int,
    style: SliderStyle,
): Pair<Int, Int> {
    if (maxLPlaceable == null) return 0 to 0
    val maxLabelW = maxLPlaceable.widthOrZero()
    val maxLabelH = maxLPlaceable.heightOrZero()
    val sliderW = sliderPlaceable.widthOrZero()
    val sliderH = sliderPlaceable.heightOrZero()
    return when (style.orientation) {
        SliderOrientation.Horizontal ->
            maxLabelCordsHorizontal(
                sliderX,
                sliderY,
                sliderW,
                sliderH,
                maxLabelW,
                maxLabelH,
                finalW,
                limitMargin,
                style.limitLabelAlignment,
            )

        else ->
            maxLabelCordsVertical(
                sliderX,
                sliderY,
                sliderW,
                sliderH,
                maxLabelW,
                maxLabelH,
                limitMargin,
                style.limitLabelAlignment,
            )
    }
}

private fun maxLabelCordsHorizontal(
    sliderX: Int,
    sliderY: Int,
    sliderW: Int,
    sliderH: Int,
    maxLabelW: Int,
    maxLabelH: Int,
    finalW: Int,
    limitMargin: Int,
    limitsAlignment: LimitLabelAlignment,
): Pair<Int, Int> {
    val x = if (limitsAlignment == LimitLabelAlignment.Center) {
        sliderX + sliderW + limitMargin
    } else {
        finalW - maxLabelW
    }
    val y = limitLabelYHorizontal(sliderY, maxLabelH, sliderH, limitMargin, limitsAlignment)
    return x to y
}

private fun maxLabelCordsVertical(
    sliderX: Int,
    sliderY: Int,
    sliderW: Int,
    sliderH: Int,
    maxLabelW: Int,
    maxLabelH: Int,
    limitMargin: Int,
    limitsAlignment: LimitLabelAlignment,
): Pair<Int, Int> {
    val x = limitLabelXVertical(sliderX, maxLabelW, sliderW, limitMargin, limitsAlignment)
    val y = if (limitsAlignment != LimitLabelAlignment.Center) {
        sliderY + sliderH - maxLabelH
    } else {
        sliderY + sliderH + limitMargin
    }
    return x to y
}

private fun limitLabelYHorizontal(
    sliderY: Int,
    limitLabelH: Int,
    sliderH: Int,
    limitMargin: Int,
    limitAlignment: LimitLabelAlignment,
): Int {
    return when (limitAlignment) {
        LimitLabelAlignment.Start -> sliderY - limitMargin - limitLabelH
        LimitLabelAlignment.End -> sliderY + sliderH + limitMargin
        else -> sliderY + (sliderH - limitLabelH) / 2
    }
}

private fun limitLabelXVertical(
    sliderX: Int,
    limitLabelW: Int,
    sliderW: Int,
    limitMargin: Int,
    limitAlignment: LimitLabelAlignment,
): Int {
    return when (limitAlignment) {
        LimitLabelAlignment.Start -> sliderX - limitMargin - limitLabelW
        LimitLabelAlignment.End -> sliderX + sliderW + limitMargin
        else -> sliderX + (sliderW - limitLabelW) / 2
    }
}

private const val TITLE = "title"
private const val CONTENT = "content"
private const val MIN_LABEL = "minLabel"
private const val MAX_LABEL = "maxLabel"
private const val SLIDER = "slider"

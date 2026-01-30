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
    val isLabelHorizontal = isHorizontal || style.alignment != SliderAlignment.Center
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
 * Заголовка в блоке Label
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
    private val sizes: MeasuredSizes = MeasuredSizes().apply {
        limitMargin = limMargin
        labelMargin = labMargin
    }

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val title = measurables.find { it.layoutId == TITLE }
        val content = measurables.find { it.layoutId == CONTENT }
        val minLabel = measurables.find { it.layoutId == MIN_LABEL }
        val maxLabel = measurables.find { it.layoutId == MAX_LABEL }
        val slider = measurables.find { it.layoutId == SLIDER }
        val placeableList = mutableListOf<Child>()

        val titlePlaceable = title?.measure(constraints)
        sizes.titleW = titlePlaceable.widthOrZero()
        sizes.titleH = titlePlaceable.heightOrZero()
        val crsAfterTitle = constraints.offset(
            horizontal = -sizes.titleW,
            vertical = -sizes.titleH,
        )
        titlePlaceable?.let { placeableList.add(Child(TITLE, it)) }

        val contentPlaceable = content?.measure(crsAfterTitle)
        sizes.contentW = contentPlaceable.widthOrZero()
        sizes.contentH = contentPlaceable.heightOrZero()
        val crsAfterContent = constraintsAfterContent(crsAfterTitle, sizes, alignment, style.orientation)
        contentPlaceable?.let { placeableList.add(Child(CONTENT, it)) }

        calculateLabelSize(sizes, style, alignment).let {
            sizes.labelW = it.first
            sizes.labelH = it.second
        }
        if (sizes.labelH == 0 || sizes.labelW == 0) sizes.labelMargin = 0
        val crsAfterLabel = constraintsAfterLabel(sizes, style, constraints, crsAfterContent)

        val minLPlaceable = minLabel?.measure(crsAfterLabel)
        sizes.minLabelW = minLPlaceable.widthOrZero()
        sizes.minLabelH = minLPlaceable.heightOrZero()
        minLPlaceable?.let { placeableList.add(Child(MIN_LABEL, it)) }

        val maxLPlaceable = maxLabel?.measure(constraintsAfterMinLimit(sizes, style, crsAfterLabel))
        sizes.maxLabelW = maxLPlaceable.widthOrZero()
        sizes.maxLabelH = maxLPlaceable.heightOrZero()
        val crsAfterLimits = constraintsAfterLimits(sizes, style, crsAfterLabel)
        maxLPlaceable?.let { placeableList.add(Child(MAX_LABEL, it)) }

        if (sizes.minLabelH == 0 || sizes.maxLabelH == 0) sizes.limitMargin = 0

        val sliderPlaceable = slider?.measure(crsAfterLimits)
        sizes.sliderW = sliderPlaceable.widthOrZero()
        sizes.sliderH = sliderPlaceable.heightOrZero()
        sliderPlaceable?.let { placeableList.add(Child(SLIDER, it)) }

        sizes.finalHeight = constraints.constrainHeight(calculateTotalHeight(sizes, style))
        sizes.finalWidth = constraints.constrainWidth(calculateTotalWidth(sizes, style, alignment))
        val placements = resolvePlacements(style, alignment, sizes, placeableList)
        return layout(sizes.finalWidth, sizes.finalHeight) {
            placements.forEach {
                it.placeable.placeRelative(it.x, it.y)
            }
        }
    }
}

private fun calculateLabelSize(
    sizes: MeasuredSizes,
    style: SliderStyle,
    alignment: SliderAlignment,
) = with(sizes) {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val isLabelHorizontal = isHorizontal || (!isHorizontal && alignment != SliderAlignment.Center)
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
    labelW to labelH
}

private fun constraintsAfterContent(
    constraints: Constraints,
    sizes: MeasuredSizes,
    alignment: SliderAlignment,
    orientation: SliderOrientation,
): Constraints {
    val isHorizontal = orientation == SliderOrientation.Horizontal
    val isLabelHorizontal = isHorizontal || (!isHorizontal && alignment != SliderAlignment.Center)
    val extraW = sizes.titleW - sizes.contentW
    val extraH = sizes.titleH - sizes.contentH
    val deltaWidth = if (isLabelHorizontal) {
        sizes.contentW
    } else {
        if (extraW < 0) abs(extraW) else 0
    }
    val deltaHeight = if (isLabelHorizontal) {
        if (extraH < 0) abs(extraH) else 0
    } else {
        sizes.contentH
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun constraintsAfterLabel(
    sizes: MeasuredSizes,
    style: SliderStyle,
    originConstraints: Constraints,
    newConstraints: Constraints,
): Constraints {
    val maxWidth = when {
        style.orientation == SliderOrientation.Horizontal && style.labelAlignment == LabelAlignment.Center ->
            newConstraints.maxWidth - sizes.labelMargin

        else -> originConstraints.maxWidth
    }
    val maxHeight = when {
        style.orientation == SliderOrientation.Vertical ||
            style.orientation == SliderOrientation.Horizontal && style.labelAlignment != LabelAlignment.Center ->
            newConstraints.maxHeight - sizes.labelMargin

        else -> originConstraints.maxHeight
    }
    return newConstraints.copy(maxWidth = maxWidth.coerceAtLeast(0), maxHeight = maxHeight.coerceAtLeast(0))
}

private fun constraintsAfterMinLimit(
    sizes: MeasuredSizes,
    style: SliderStyle,
    constraints: Constraints,
): Constraints {
    val orient = style.orientation
    val deltaWidth = when {
        orient == SliderOrientation.Horizontal -> sizes.minLabelW + sizes.limitMargin
        else -> 0
    }
    val deltaHeight = when {
        style.orientation == SliderOrientation.Vertical -> sizes.minLabelH + sizes.limitMargin
        else -> 0
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun constraintsAfterLimits(
    sizes: MeasuredSizes,
    style: SliderStyle,
    constraints: Constraints,
): Constraints {
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    val limitsWSum = sizes.minLabelW + sizes.maxLabelW + sizes.limitMargin * 2
    val limitsWMax = maxOf(sizes.minLabelW, sizes.maxLabelW)
    val deltaWidth = when {
        orientation == SliderOrientation.Horizontal && limitsPlace == LimitLabelAlignment.Center ->
            limitsWSum

        orientation == SliderOrientation.Vertical && limitsPlace != LimitLabelAlignment.Center ->
            limitsWMax + sizes.limitMargin

        else -> 0
    }
    val limitsHSum = sizes.minLabelH + sizes.maxLabelH + sizes.limitMargin * 2
    val limitsHMax = maxOf(sizes.minLabelH, sizes.maxLabelH)
    val deltaHeight = when {
        orientation == SliderOrientation.Vertical && limitsPlace == LimitLabelAlignment.Center ->
            limitsHSum

        orientation == SliderOrientation.Horizontal && limitsPlace != LimitLabelAlignment.Center ->
            limitsHMax + sizes.limitMargin

        else -> 0
    }
    return constraints.offset(horizontal = -deltaWidth, vertical = -deltaHeight)
}

private fun calculateTotalHeight(
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val labelPlacement = style.labelAlignment
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    var height: Int
    with(sizes) {
        when (orientation) {
            SliderOrientation.Horizontal -> {
                height = when {
                    labelPlacement == LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                        maxOf(labelH, minLabelH, maxLabelH, sliderH)

                    labelPlacement != LabelAlignment.Center && limitsPlace == LimitLabelAlignment.Center ->
                        labelH + labelMargin + maxOf(minLabelH, maxLabelH, sliderH)

                    labelPlacement != LabelAlignment.Center && limitsPlace != LimitLabelAlignment.Center ->
                        labelH + labelMargin + sliderH + maxOf(minLabelH, maxLabelH) + limitMargin

                    else -> calculateHeightAccordingLimits(sizes)
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
    }
    return height
}

private fun calculateHeightAccordingLimits(
    sizes: MeasuredSizes,
): Int {
    with(sizes) {
        val extra = (labelH - sliderH) / 2
        val maxOfLabels = maxOf(minLabelH, maxLabelH)
        if (extra < 0) return sliderH + maxOfLabels + limitMargin
        return if (extra < maxOfLabels + limitMargin) {
            sliderH + limitMargin + maxOfLabels + extra
        } else {
            labelH
        }
    }
}

private fun calculateTotalWidth(
    sizes: MeasuredSizes,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val labelPlacement = style.labelAlignment
    val orientation = style.orientation
    val limitsPlace = style.limitLabelAlignment
    return with(sizes) {
        when (orientation) {
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

            else -> calculateWidthVertical(sizes, style, alignment)
        }
    }
}

private fun calculateWidthVertical(
    sizes: MeasuredSizes,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val limitsPlace = style.limitLabelAlignment
    val maxOfLimitsW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    val sliderWithLimitsW = if (limitsPlace != LimitLabelAlignment.Center) {
        sizes.sliderW + sizes.limitMargin + maxOfLimitsW
    } else {
        if (sizes.sliderW > maxOfLimitsW) sizes.sliderW else maxOfLimitsW
    }
    val contentExtra = (sizes.contentW - sizes.sliderW) / 2
    val labelBigger = sizes.labelW > sliderWithLimitsW
    val needToCentering = needToCenteringContentAndSlider(style, alignment)
    return when (alignment) {
        SliderAlignment.Center -> widthVerticalAlignmentCenter(sizes, style)

        else -> {
            if (needToCentering) {
                if (contentExtra >= 0) {
                    maxOf(sizes.labelW, sliderWithLimitsW + contentExtra)
                } else {
                    maxOf((abs(contentExtra) + sizes.labelW), sliderWithLimitsW)
                }
            } else {
                if (labelBigger) sizes.labelW else sliderWithLimitsW
            }
        }
    }
}

private fun widthVerticalAlignmentCenter(
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val maxOfLimitsW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    if (style.limitLabelAlignment == LimitLabelAlignment.Center) {
        return maxOf(sizes.labelW, sizes.sliderW, maxOfLimitsW)
    }
    val extraLabel = (sizes.labelW - sizes.sliderW) / 2
    return when {
        extraLabel <= 0 -> sizes.sliderW + sizes.limitMargin + maxOfLimitsW
        extraLabel >= maxOfLimitsW + sizes.limitMargin -> sizes.labelW
        else -> extraLabel + sizes.sliderW + maxOfLimitsW + sizes.limitMargin
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

private fun resolvePlacements(
    style: SliderStyle,
    alignment: SliderAlignment,
    sizes: MeasuredSizes,
    placeableList: List<Child>,
): List<ChildPlacement> {
    val isHorizontal = style.orientation == SliderOrientation.Horizontal
    val isLabelHorizontal = isHorizontal || (!isHorizontal && alignment != SliderAlignment.Center)
    val placements = mutableListOf<ChildPlacement>()
    val labelCords = resolveLabelCords(sizes, alignment, style)
    placeableList.find { it.id == TITLE }?.let {
        val titleCords = resolveTitleCords(labelCords.first, labelCords.second, isLabelHorizontal, style, sizes)
        placements.add(ChildPlacement(it.placeable, titleCords.first, titleCords.second))
    }
    placeableList.find { it.id == CONTENT }?.let {
        val contentCords = resolveContentCords(labelCords.first, labelCords.second, isLabelHorizontal, style, sizes)
        placements.add(ChildPlacement(it.placeable, contentCords.first, contentCords.second))
    }

    var sliderX = 0
    var sliderY = 0
    placeableList.find { it.id == SLIDER }?.let {
        val sliderCords = resolveSliderCords(sizes, style, alignment)
        sliderX = sliderCords.first
        sliderY = sliderCords.second
        placements.add(ChildPlacement(it.placeable, sliderCords.first, sliderCords.second))
    }

    placeableList.find { it.id == MIN_LABEL }?.let {
        val minLabelCords = resolveMinLabelCords(sliderX, sliderY, sizes, style)
        placements.add(ChildPlacement(it.placeable, minLabelCords.first, minLabelCords.second))
    }

    placeableList.find { it.id == MAX_LABEL }?.let {
        val maxLabelCords = resolveMaxLabelCords(sliderX, sliderY, sizes, style)
        placements.add(ChildPlacement(it.placeable, maxLabelCords.first, maxLabelCords.second))
    }
    return placements
}

private fun resolveLabelCords(
    sizes: MeasuredSizes,
    alignment: SliderAlignment,
    style: SliderStyle,
): Pair<Int, Int> =
    if (style.orientation == SliderOrientation.Horizontal) {
        val x = if (alignment == SliderAlignment.End) sizes.finalWidth - sizes.labelW else 0
        val y = labelYHorizontal(sizes, style)
        x to y
    } else {
        val x = labelXVertical(sizes, alignment, style)
        val y = if (style.labelAlignment == LabelAlignment.Bottom) sizes.finalHeight - sizes.labelH else 0
        x to y
    }

private fun labelYHorizontal(
    sizes: MeasuredSizes,
    style: SliderStyle,
) = with(sizes) {
    val labelPlacement = style.labelAlignment
    val limitsPlace = style.limitLabelAlignment
    val maxOfLabels = maxOf(minLabelH, maxLabelH)
    when (labelPlacement) {
        LabelAlignment.Top -> 0
        LabelAlignment.Center -> offsetYWhenLabelCenter(sizes, style)
        LabelAlignment.Bottom -> {
            when (limitsPlace) {
                LimitLabelAlignment.Center -> maxOf(maxOfLabels, sliderH) + labelMargin
                else -> maxOfLabels + limitMargin + sliderH + labelMargin
            }
        }
    }
}

private fun offsetYWhenLabelCenter(
    sizes: MeasuredSizes,
    style: SliderStyle,
) = with(sizes) {
    val limitsPlace = style.limitLabelAlignment
    val extra = (labelH - sliderH) / 2
    val maxOfLabels = maxOf(minLabelH, maxLabelH)
    when (limitsPlace) {
        LimitLabelAlignment.Start -> {
            if (extra < 0) {
                maxOfLabels + sizes.limitMargin + abs(extra)
            } else if (extra in 0..maxOfLabels + sizes.limitMargin) {
                maxOfLabels + sizes.limitMargin - extra
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
    sizes: MeasuredSizes,
    alignment: SliderAlignment,
    style: SliderStyle,
): Int {
    val maxLimitW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    val sliderAndLimitsW = maxLimitW + sizes.limitMargin + sizes.sliderW
    val offset = when (alignment) {
        SliderAlignment.Start -> labelXVerticalAlignmentStart(sizes, style)
        SliderAlignment.Center -> labelXVerticalAlignmentCenter(maxLimitW, sizes, style)
        SliderAlignment.End -> labelXVerticalAlignmentEnd(sliderAndLimitsW, sizes, style)
    }
    return offset
}

private fun labelXVerticalAlignmentStart(
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val maxLimitW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    val maxContentW = maxOf(maxLimitW, sizes.sliderW)
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> 0
        LimitLabelAlignment.Center -> if (sizes.labelW > maxContentW) 0 else (maxContentW - sizes.labelW) / 2
        LimitLabelAlignment.End -> {
            if (style.titleAlignment == TitleAlignment.End) {
                if (sizes.sliderW < sizes.contentW) 0 else (sizes.sliderW - sizes.contentW) / 2
            } else {
                0
            }
        }
    }
}

private fun labelXVerticalAlignmentCenter(
    maxLimitW: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val extra = (sizes.labelW - sizes.sliderW) / 2
    val extraAccordingLimits = if (extra >= maxLimitW + sizes.limitMargin) extra else maxLimitW + sizes.limitMargin
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
        LimitLabelAlignment.Center -> (sizes.finalWidth - sizes.labelW) / 2
    }
}

private fun labelXVerticalAlignmentEnd(
    sliderAndLimitsW: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val start = sizes.finalWidth - sizes.labelW
    val maxLimitW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    val maxContentW = maxOf(maxLimitW, sizes.sliderW)
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (style.titleAlignment == TitleAlignment.Start) {
                if (sizes.sliderW < sizes.contentW) start else start - (sizes.sliderW - sizes.contentW) / 2
            } else {
                start
            }
        }

        LimitLabelAlignment.Center -> if (sizes.labelW > maxContentW) 0 else start
        LimitLabelAlignment.End -> if (sizes.labelW > sliderAndLimitsW) 0 else start
    }
}

private fun resolveTitleCords(
    labelX: Int,
    labelY: Int,
    isLabelHorizontal: Boolean,
    style: SliderStyle,
    sizes: MeasuredSizes,
): Pair<Int, Int> =
    if (isLabelHorizontal) {
        titleCordsHorizontal(labelX, labelY, sizes, style.titleAlignment)
    } else {
        titleCordsVertical(labelX, labelY, sizes, style.titleAlignment)
    }

private fun titleCordsHorizontal(
    labelX: Int,
    labelY: Int,
    sizes: MeasuredSizes,
    titleAlignment: TitleAlignment,
) = with(sizes) {
    val isTitleHigher = titleH > contentH
    val y = if (isTitleHigher) labelY else labelY + (contentH - titleH) / 2
    val x = if (titleAlignment == TitleAlignment.End) {
        labelX + (labelW - titleW)
    } else {
        labelX
    }
    x to y
}

private fun titleCordsVertical(
    labelX: Int,
    labelY: Int,
    sizes: MeasuredSizes,
    titleAlignment: TitleAlignment,
) = with(sizes) {
    val isTitleWider = titleW > contentW
    val x = if (isTitleWider) labelX else labelX + (contentW - titleW) / 2
    val y = if (titleAlignment == TitleAlignment.End) {
        labelY + (labelH - titleH)
    } else {
        labelY
    }
    x to y
}

private fun resolveContentCords(
    labelX: Int,
    labelY: Int,
    isLabelHorizontal: Boolean,
    style: SliderStyle,
    sizes: MeasuredSizes,
): Pair<Int, Int> =
    if (isLabelHorizontal) {
        contentCordsHorizontal(labelX, labelY, sizes, style.titleAlignment)
    } else {
        contentCordsVertical(labelX, labelY, sizes, style.titleAlignment)
    }

private fun contentCordsHorizontal(
    labelX: Int,
    labelY: Int,
    sizes: MeasuredSizes,
    titleAlignment: TitleAlignment,
) = with(sizes) {
    val isContentHigher = contentH > titleH
    val y = if (isContentHigher) labelY else labelY + (titleH - contentH) / 2
    val x = if (titleAlignment == TitleAlignment.Start) {
        labelX + (labelW - contentH)
    } else {
        labelX
    }
    x to y
}

private fun contentCordsVertical(
    labelX: Int,
    labelY: Int,
    sizes: MeasuredSizes,
    titleAlignment: TitleAlignment,
) = with(sizes) {
    val isContentWider = contentW > titleW
    val x = if (isContentWider) labelX else labelX + (titleW - contentW) / 2
    val y = if (titleAlignment == TitleAlignment.Start) {
        labelY + (labelH - contentH)
    } else {
        labelY
    }
    x to y
}

private fun resolveSliderCords(
    sizes: MeasuredSizes,
    style: SliderStyle,
    alignment: SliderAlignment,
): Pair<Int, Int> {
    return if (style.orientation == SliderOrientation.Horizontal) {
        val x = sliderXHorizontal(sizes, style, alignment)
        val y = sliderYHorizontal(sizes, style)
        x to y
    } else {
        val x = sliderXVertical(sizes, alignment, style)
        val y = sliderYVertical(sizes, style)
        x to y
    }
}

private fun sliderXHorizontal(
    sizes: MeasuredSizes,
    style: SliderStyle,
    alignment: SliderAlignment,
): Int {
    val limitsPlace = style.limitLabelAlignment
    return when (style.labelAlignment) {
        LabelAlignment.Center -> {
            if (alignment == SliderAlignment.End) {
                if (limitsPlace == LimitLabelAlignment.Center) sizes.minLabelW + sizes.limitMargin else 0
            } else {
                if (limitsPlace == LimitLabelAlignment.Center) {
                    sizes.labelW + sizes.labelMargin + sizes.minLabelW + sizes.limitMargin
                } else {
                    sizes.labelW + sizes.labelMargin
                }
            }
        }

        else -> if (limitsPlace == LimitLabelAlignment.Center) sizes.minLabelW + sizes.limitMargin else 0
    }
}

private fun sliderYHorizontal(
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val maxLimitsH = maxOf(sizes.minLabelH, sizes.maxLabelH)
    return when (style.labelAlignment) {
        LabelAlignment.Center -> sliderYHorizontalLimitsCenter(maxLimitsH, sizes, style)
        else -> {
            val labelHeight = if (style.labelAlignment == LabelAlignment.Top) sizes.labelH + sizes.labelMargin else 0
            when (style.limitLabelAlignment) {
                LimitLabelAlignment.End -> labelHeight
                LimitLabelAlignment.Start -> labelHeight + maxLimitsH + sizes.limitMargin
                else -> {
                    val extra = (sizes.sliderH - maxLimitsH) / 2
                    if (extra > 0) labelHeight else labelHeight + extra
                }
            }
        }
    }
}

private fun sliderYHorizontalLimitsCenter(
    maxLimitsH: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val extra = (sizes.labelH - sizes.sliderH) / 2
    val bigLabel = extra >= maxLimitsH + sizes.limitMargin
    val limitsExtra = (maxLimitsH - sizes.sliderH) / 2
    val bigLimits = limitsExtra > 0
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.End -> if (extra < 0) 0 else extra
        LimitLabelAlignment.Start -> if (bigLabel) extra else maxLimitsH + sizes.limitMargin
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
    sizes: MeasuredSizes,
    alignment: SliderAlignment,
    style: SliderStyle,
): Int {
    val maxLimitW = maxOf(sizes.minLabelW, sizes.maxLabelW)
    return when (alignment) {
        SliderAlignment.Start -> sliderXVerticalAlignmentStart(maxLimitW, sizes, style)
        SliderAlignment.Center -> sliderXVerticalAlignmentCenter(maxLimitW, sizes, style)
        SliderAlignment.End -> sliderXVerticalAlignmentEnd(maxLimitW, sizes, style)
    }
}

private fun sliderXVerticalAlignmentStart(
    maxLimitW: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> maxLimitW + sizes.limitMargin
        LimitLabelAlignment.Center -> if (sizes.sliderW > maxLimitW) 0 else (maxLimitW - sizes.sliderW) / 2
        LimitLabelAlignment.End -> {
            if (style.titleAlignment == TitleAlignment.End) {
                if (sizes.sliderW < sizes.contentW) (sizes.contentW - sizes.sliderW) / 2 else 0
            } else {
                0
            }
        }
    }
}

private fun sliderXVerticalAlignmentCenter(
    maxLimitW: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
) = with(sizes) {
    val extra = (labelW - sliderW) / 2
    val extraAccordingLimits = if (extra >= maxLimitW + limitMargin) extra else maxLimitW + limitMargin
    when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (extra < 0) maxLimitW + limitMargin else extraAccordingLimits
        }

        LimitLabelAlignment.End -> if (extra < 0) 0 else extra
        LimitLabelAlignment.Center -> (finalWidth - sliderW) / 2
    }
}

private fun sliderXVerticalAlignmentEnd(
    maxLimitW: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Int {
    val start = sizes.finalWidth - sizes.sliderW
    return when (style.limitLabelAlignment) {
        LimitLabelAlignment.Start -> {
            if (style.titleAlignment == TitleAlignment.Start) {
                if (sizes.sliderW > sizes.contentW) start else start - (sizes.contentW - sizes.sliderW) / 2
            } else {
                start
            }
        }

        LimitLabelAlignment.Center ->
            if (sizes.sliderW > maxLimitW) start else start - (maxLimitW - sizes.sliderW) / 2

        LimitLabelAlignment.End -> sizes.finalWidth - maxLimitW - sizes.limitMargin - sizes.sliderW
    }
}

private fun sliderYVertical(
    sizes: MeasuredSizes,
    style: SliderStyle,
) = with(sizes) {
    val limitsHeight = if (style.limitLabelAlignment == LimitLabelAlignment.Center) minLabelH + limitMargin else 0
    if (style.labelAlignment == LabelAlignment.Bottom) limitsHeight else labelH + labelMargin + limitsHeight
}

private fun resolveMinLabelCords(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Pair<Int, Int> =
    when (style.orientation) {
        SliderOrientation.Horizontal ->
            minLabelCordsHorizontal(sliderX, sliderY, sizes, style.limitLabelAlignment)

        else ->
            minLabelCordsVertical(sliderX, sliderY, sizes, style.limitLabelAlignment)
    }

private fun minLabelCordsHorizontal(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    limitsAlignment: LimitLabelAlignment,
) = with(sizes) {
    val x = if (limitsAlignment == LimitLabelAlignment.Center) {
        sliderX - limitMargin - minLabelW
    } else {
        sliderX
    }
    val y = limitLabelYHorizontal(sliderY, minLabelH, sizes, limitsAlignment)
    x to y
}

private fun minLabelCordsVertical(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    limitsAlignment: LimitLabelAlignment,
) = with(sizes) {
    val x = limitLabelXVertical(sliderX, minLabelW, sizes, limitsAlignment)
    val y = if (limitsAlignment != LimitLabelAlignment.Center) {
        sliderY
    } else {
        sliderY - limitMargin - minLabelH
    }
    x to y
}

private fun resolveMaxLabelCords(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    style: SliderStyle,
): Pair<Int, Int> =
    when (style.orientation) {
        SliderOrientation.Horizontal ->
            maxLabelCordsHorizontal(sliderX, sliderY, sizes, style.limitLabelAlignment)

        else ->
            maxLabelCordsVertical(sliderX, sliderY, sizes, style.limitLabelAlignment)
    }

private fun maxLabelCordsHorizontal(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    limitsAlignment: LimitLabelAlignment,
) = with(sizes) {
    val x = if (limitsAlignment == LimitLabelAlignment.Center) {
        sliderX + sliderW + limitMargin
    } else {
        finalWidth - maxLabelW
    }
    val y = limitLabelYHorizontal(sliderY, maxLabelH, sizes, limitsAlignment)
    x to y
}

private fun maxLabelCordsVertical(
    sliderX: Int,
    sliderY: Int,
    sizes: MeasuredSizes,
    limitsAlignment: LimitLabelAlignment,
) = with(sizes) {
    val x = limitLabelXVertical(sliderX, maxLabelW, sizes, limitsAlignment)
    val y = if (limitsAlignment != LimitLabelAlignment.Center) {
        sliderY + sliderH - maxLabelH
    } else {
        sliderY + sliderH + limitMargin
    }
    x to y
}

private fun limitLabelYHorizontal(
    sliderY: Int,
    limitLabelH: Int,
    sizes: MeasuredSizes,
    limitAlignment: LimitLabelAlignment,
) = with(sizes) {
    when (limitAlignment) {
        LimitLabelAlignment.Start -> sliderY - limitMargin - limitLabelH
        LimitLabelAlignment.End -> sliderY + sliderH + limitMargin
        else -> sliderY + (sliderH - limitLabelH) / 2
    }
}

private fun limitLabelXVertical(
    sliderX: Int,
    limitLabelW: Int,
    sizes: MeasuredSizes,
    limitAlignment: LimitLabelAlignment,
) = with(sizes) {
    when (limitAlignment) {
        LimitLabelAlignment.Start -> sliderX - limitMargin - limitLabelW
        LimitLabelAlignment.End -> sliderX + sliderW + limitMargin
        else -> sliderX + (sliderW - limitLabelW) / 2
    }
}

private class MeasuredSizes {
    var titleW: Int = 0
    var titleH: Int = 0
    var contentW: Int = 0
    var contentH: Int = 0
    var labelW: Int = 0
    var labelH: Int = 0
    var minLabelW: Int = 0
    var minLabelH: Int = 0
    var maxLabelW: Int = 0
    var maxLabelH: Int = 0
    var sliderW: Int = 0
    var sliderH: Int = 0
    var limitMargin: Int = 0
    var labelMargin: Int = 0
    var finalWidth: Int = 0
    var finalHeight: Int = 0
}

private data class ChildPlacement(
    val placeable: Placeable,
    val x: Int,
    val y: Int,
)

private data class Child(
    val id: String,
    val placeable: Placeable,
)

private const val TITLE = "title"
private const val CONTENT = "content"
private const val MIN_LABEL = "minLabel"
private const val MAX_LABEL = "maxLabel"
private const val SLIDER = "slider"

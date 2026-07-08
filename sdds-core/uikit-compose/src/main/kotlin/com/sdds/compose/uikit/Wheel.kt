package com.sdds.compose.uikit

import android.util.Log
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.wheel.BaseWheel
import com.sdds.compose.uikit.internal.wheel.WheelItemAlignment
import com.sdds.compose.uikit.motion.components.divider.rememberDividerMotion
import com.sdds.compose.uikit.motion.getBrushAsState

/**
 * Вертикальное колесо выбора.
 * Используется для выбора одного значения из списка с визуальным фокусом на текущем значении.
 *
 * @param modifier модификатор компонента
 * @param style стиль компонента
 * @param wheelCount количество колёс
 * @param hasControls наличие кнопок перемотки
 * @param visibleItemsCount количество видимых элементов в колесе
 * @param wheelSeparator тип разделителя между колёсами [WheelSeparator]
 * @param alignment выравнивание контента в колёсах [WheelAlignment]
 * @param dataEdgePlacement способ размещения данных в колесе [DataEdgePlacement]
 * @param wheelConstraints способ ограничения колёс по ширине [WheelConstraints]
 * @param interactionSource источник взаимодействий [InteractionSource]
 * @param onItemSelected колбэк сигнализирубщий о выбранном элементе.
 * Первый параметр лямбды - индекс колеса, второй - индекс элемента в колесе.
 * @param onSetData колбэк установки набора данных. Вызывается [wheelCount] раз.
 * В параметре лямбды доступен индекс колеса, начиная с 0.
 * Лямбда должна вернуть набор данных [WheelDataSet], необходимый для конфигурации каждого колеса.
 */
@Composable
fun Wheel(
    modifier: Modifier = Modifier,
    style: WheelStyle = LocalWheelStyle.current,
    wheelCount: Int = style.wheelCount,
    hasControls: Boolean = true,
    visibleItemsCount: Int = style.visibleItemsCount,
    wheelSeparator: WheelSeparator = WheelSeparator.None,
    alignment: WheelAlignment = style.itemAlignment,
    wheelConstraints: WheelConstraints = WheelConstraints.Strict,
    dataEdgePlacement: DataEdgePlacement = DataEdgePlacement.WheelCenter,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    onItemSelected: (wheel: Int, item: Int) -> Unit = { _, _ -> },
    onSetData: (Int) -> WheelDataSet,
) {
    val dividerMotion = rememberDividerMotion()
    val textMeasurer = rememberTextMeasurer()
    var labelOffsetFromCenter by remember { mutableFloatStateOf(0f) }
    var wheelItemHeight by remember { mutableIntStateOf(0) }
    val separatorTextStyle = style.itemTextStyle
        .copy(style.colors.separatorColor.colorForInteraction(interactionSource))
    val dividerColor = style.dividerStyle.color.backgroundBrush.getBrushAsState(
        dividerMotion.context,
        dividerMotion.style.backgroundColor,
    )
    val dividerThickness = style.dividerStyle.dimensions.thicknessValues.getValueAsState(
        dividerMotion.context,
    )
    val separatorColor = style.colors.separatorColor.colorForInteraction(interactionSource)

    val selectorBrush = style.colors.selectionIndicatorBrush.getValue(interactionSource)
    val selectorShape = style.selectionIndicatorShape.getValue(interactionSource)
    val selectorPaddingTopPx = style.dimensions.selectionIndicatorPaddingTop.getValue(interactionSource)
    val selectorPaddingBottomPx = style.dimensions.selectionIndicatorPaddingBottom.getValue(interactionSource)
    val selectorPaddingStartPx = style.dimensions.selectionIndicatorPaddingStart.getValue(interactionSource)
    val selectorPaddingEndPx = style.dimensions.selectionIndicatorPaddingEnd.getValue(interactionSource)
    val itemSpacingPx = style.dimensions.itemMinSpacing

    WheelLayout(
        modifier = modifier.drawBehind {
            if (!style.selectionIndicatorEnabled || wheelItemHeight == 0) return@drawBehind
            val selectorHeightPx = (
                wheelItemHeight +
                    selectorPaddingTopPx.toPx() + selectorPaddingBottomPx.toPx() -
                    itemSpacingPx.toPx()
                ).coerceAtLeast(0f)
            if (selectorHeightPx == 0f) return@drawBehind
            val selectorLeft = -selectorPaddingStartPx.toPx()
            val selectorWidth = (
                size.width + selectorPaddingStartPx.toPx() + selectorPaddingEndPx.toPx()
                ).coerceAtLeast(0f)
            val selectorTop = (size.height - selectorHeightPx) / 2f
            val outline = selectorShape.createOutline(
                size = Size(selectorWidth, selectorHeightPx),
                layoutDirection = layoutDirection,
                density = this,
            )
            withTransform({ translate(selectorLeft, selectorTop) }) {
                drawOutline(outline, selectorBrush)
            }
        },
        wheelCount = wheelCount,
        style = style,
        alignment = alignment,
        wheelConstraints = wheelConstraints,
        wheelSeparatorContent = {
            WheelSeparatorBox(
                style = style,
                wheelSeparator = wheelSeparator,
                dividerColor = dividerColor,
                dividerThickness = dividerThickness,
                separatorColor = separatorColor,
                textMeasurer = textMeasurer,
                separatorTextStyle = separatorTextStyle,
                labelOffsetFromCenter = labelOffsetFromCenter,
            )
        },
    ) { wheelIndex ->
        val data = onSetData(wheelIndex)
        BaseWheel(
            items = data.dataSet,
            description = data.description,
            textStyle = style.itemTextStyle,
            textAfterStyle = style.itemTextAfterStyle,
            descriptionStyle = style.descriptionStyle,
            textAfterPadding = style.dimensions.itemTextAfterPadding,
            descriptionPadding = style.dimensions.descriptionPadding,
            itemSpacing = style.dimensions.itemMinSpacing,
            textColor = style.colors.itemTextColor,
            textAfterColor = style.colors.itemTextAfterColor,
            descriptionColor = style.colors.descriptionColor,
            iconUpColor = style.colors.controlIconUpColor,
            iconDownColor = style.colors.controlIconDownColor,
            alignment = getBaseWheelAlignment(alignment, wheelIndex, wheelCount),
            dataEdgePlacement = dataEdgePlacement,
            initialIndex = data.initialIndex,
            visibleItemsCount = visibleItemsCount,
            textAfterMode = style.textAfterMode,
            staticTextAfter = data.staticTextAfter,
            onItemSelected = { index ->
                onItemSelected.invoke(wheelIndex, index)
            },
            onLabelPositionCalculated = { labelOffsetFromCenter = it },
            onItemHeightCalculated = { wheelItemHeight = it },
            interactionSource = interactionSource,
            iconUp = style.controlIconUp,
            iconDown = style.controlIconDown,
            hasControls = hasControls,
        )
    }
}

@Composable
private fun WheelLayout(
    modifier: Modifier,
    wheelCount: Int,
    style: WheelStyle,
    alignment: WheelAlignment,
    wheelConstraints: WheelConstraints,
    wheelSeparatorContent: @Composable () -> Unit,
    wheelContent: @Composable (wheelIndex: Int) -> Unit,
) {
    val separatorId = remember { WheelLayoutId.Separator }
    Layout(
        content = {
            repeat(wheelCount) { wheelIndex ->
                if (wheelIndex > 0) {
                    Box(
                        modifier = Modifier.layoutId(separatorId),
                        propagateMinConstraints = true,
                    ) {
                        wheelSeparatorContent()
                    }
                }
                Box(
                    modifier = Modifier.layoutId(WheelLayoutId.Wheel(wheelIndex)),
                    propagateMinConstraints = true,
                ) {
                    wheelContent(wheelIndex)
                }
            }
        },
        modifier = modifier,
    ) { measurables, constraints ->
        val stretchWheels = constraints.hasFixedWidth
        val separatorWidth = style.dimensions.separatorSpacing.roundToPx()
        val separatorsWidth = separatorWidth * (wheelCount - 1).coerceAtLeast(0)
        val maxWheelsWidth = (constraints.maxWidth - separatorsWidth).coerceAtLeast(0)
        val maxStrictWheelWidth = if (constraints.hasBoundedWidth && wheelCount > 0) {
            maxWheelsWidth / wheelCount
        } else {
            Constraints.Infinity
        }
        val wheelMeasurables = measurables.filter { it.layoutId is WheelLayoutId.Wheel }
        val separatorMeasurables = measurables.filter { it.layoutId == separatorId }
        val stretchWheelCount = if (stretchWheels) {
            (0 until wheelCount).count { wheelIndex ->
                shouldStretchWheel(
                    alignment = alignment,
                    wheelIndex = wheelIndex,
                    wheelCount = wheelCount,
                )
            }
        } else {
            0
        }

        val compactWheelPlaceables = wheelMeasurables
            .filterNot { measurable ->
                val wheelIndex = (measurable.layoutId as WheelLayoutId.Wheel).index
                stretchWheels && shouldStretchWheel(alignment, wheelIndex, wheelCount)
            }
            .associate { measurable ->
                val wheelIndex = (measurable.layoutId as WheelLayoutId.Wheel).index
                val wheelConstraints = constraints.compactWheelConstraints(
                    maxStrictWheelWidth = maxStrictWheelWidth,
                    wheelConstraints = wheelConstraints,
                )
                wheelIndex to measurable.measure(wheelConstraints)
            }
        val compactWheelsWidth = compactWheelPlaceables.values.sumOf { it.width }
        val stretchWheelWidth = if (stretchWheelCount > 0) {
            ((constraints.maxWidth - separatorsWidth - compactWheelsWidth) / stretchWheelCount)
                .coerceAtLeast(0)
        } else {
            0
        }
        val stretchWheelPlaceables = wheelMeasurables
            .filter { measurable ->
                val wheelIndex = (measurable.layoutId as WheelLayoutId.Wheel).index
                stretchWheels && shouldStretchWheel(alignment, wheelIndex, wheelCount)
            }
            .associate { measurable ->
                val wheelIndex = (measurable.layoutId as WheelLayoutId.Wheel).index
                wheelIndex to measurable.measure(
                    constraints.copy(
                        minWidth = stretchWheelWidth,
                        maxWidth = stretchWheelWidth,
                        minHeight = 0,
                    ),
                )
            }
        val wheelPlaceables = compactWheelPlaceables + stretchWheelPlaceables
        val wheelsWidth = wheelPlaceables.values.sumOf { it.width }
        val contentWidth = wheelsWidth + separatorsWidth
        val layoutWidth = if (stretchWheels) constraints.maxWidth else contentWidth
        val layoutHeight = wheelPlaceables.values.maxOfOrNull { it.height } ?: 0
        val separatorPlaceables = separatorMeasurables.map {
            it.measure(Constraints.fixed(separatorWidth, layoutHeight))
        }

        layout(
            width = layoutWidth.coerceIn(constraints.minWidth, constraints.maxWidth),
            height = layoutHeight.coerceIn(constraints.minHeight, constraints.maxHeight),
        ) {
            var xPosition = 0
            var separatorIndex = 0
            repeat(wheelCount) { wheelIndex ->
                if (wheelIndex > 0) {
                    separatorPlaceables[separatorIndex].place(xPosition, 0)
                    xPosition += separatorWidth
                    separatorIndex += 1
                }
                wheelPlaceables[wheelIndex]?.let { placeable ->
                    placeable.place(xPosition, 0)
                    xPosition += placeable.width
                }
            }
        }
    }
}

@Composable
private fun WheelSeparatorBox(
    style: WheelStyle,
    wheelSeparator: WheelSeparator,
    dividerColor: State<Brush>,
    dividerThickness: State<Dp>,
    separatorColor: Color,
    textMeasurer: TextMeasurer,
    separatorTextStyle: TextStyle,
    labelOffsetFromCenter: Float,
) {
    Box(
        modifier = Modifier
            .width(style.dimensions.separatorSpacing)
            .fillMaxHeight()
            .drawSeparator(
                style = style,
                wheelSeparator = wheelSeparator,
                dividerColor = dividerColor,
                dividerThickness = dividerThickness,
                separatorColor = separatorColor,
                textMeasurer = textMeasurer,
                separatorTextStyle = separatorTextStyle,
                labelOffsetFromCenter = labelOffsetFromCenter,
            ),
    )
}

private sealed interface WheelLayoutId {
    data class Wheel(val index: Int) : WheelLayoutId
    data object Separator : WheelLayoutId
}

private fun Constraints.compactWheelConstraints(
    maxStrictWheelWidth: Int,
    wheelConstraints: WheelConstraints,
): Constraints {
    val resolvedMaxWidth = when (wheelConstraints) {
        WheelConstraints.Strict -> maxStrictWheelWidth
        WheelConstraints.Loose -> maxWidth
    }
    return copy(minWidth = 0, maxWidth = resolvedMaxWidth, minHeight = 0)
}

private fun shouldStretchWheel(
    alignment: WheelAlignment,
    wheelIndex: Int,
    wheelCount: Int,
): Boolean {
    return alignment != WheelAlignment.Mixed || wheelIndex == 0 || wheelIndex == wheelCount - 1
}

private fun getBaseWheelAlignment(
    alignment: WheelAlignment,
    wheelIndex: Int,
    wheelCount: Int,
): WheelItemAlignment {
    return when (alignment) {
        WheelAlignment.Start -> WheelItemAlignment.Start
        WheelAlignment.End -> WheelItemAlignment.End
        WheelAlignment.Center -> WheelItemAlignment.Center
        WheelAlignment.Mixed -> {
            if (wheelIndex == 0) {
                WheelItemAlignment.End
            } else if (wheelIndex == wheelCount - 1) {
                WheelItemAlignment.Start
            } else {
                WheelItemAlignment.Center
            }
        }
    }
}

private fun Modifier.drawSeparator(
    style: WheelStyle,
    wheelSeparator: WheelSeparator,
    dividerColor: State<Brush>,
    dividerThickness: State<Dp>,
    separatorColor: Color,
    textMeasurer: TextMeasurer,
    separatorTextStyle: TextStyle,
    labelOffsetFromCenter: Float,
): Modifier {
    return drawBehind {
        val separatorCenter = style.dimensions.separatorSpacing.toPx() / 2f
        when (wheelSeparator) {
            WheelSeparator.Divider -> {
                drawLine(
                    brush = dividerColor.value,
                    start = Offset(separatorCenter, 0f),
                    end = Offset(separatorCenter, size.height),
                    cap = StrokeCap.Round,
                    strokeWidth = dividerThickness.value.toPx(),
                )
            }

            WheelSeparator.Dots -> {
                val textLayoutResult =
                    textMeasurer.measure(SEPARATOR_TEXT, separatorTextStyle)
                drawText(
                    textLayoutResult = textLayoutResult,
                    color = separatorColor,
                    topLeft = Offset(
                        separatorCenter - textLayoutResult.size.width / 2f,
                        center.y + labelOffsetFromCenter,
                    ),
                )
            }

            WheelSeparator.None -> {}
        }
    }
}

/**
 * Режим отображения дополнительного текста.
 * [EachItem] использует [WheelItemData.textAfter], [Static] использует [WheelDataSet.staticTextAfter].
 */
enum class TextAfterMode {
    /**
     * Дополнительный текст отображается у каждого элемента и прокручивается вместе с ним
     */
    EachItem,

    /**
     * Дополнительный текст отображается статично рядом с центральным (выбранным) элементом;
     * при прокрутке колеса элементы движутся, а суффикс остаётся неподвижным
     */
    Static,
}

/**
 * Ограничения колёс по ширине
 */
enum class WheelConstraints {
    /**
     * Каждое колесо ограничено по ширине 1/3 доступного пространства
     */
    Strict,

    /**
     * У колёс нет ограничений по ширине
     */
    Loose,
}

/**
 * Режим выравнивания составных частей компонента
 */
enum class WheelAlignment {
    /**
     * Все колёса имеют выравнивание по левому краю
     */
    Start,

    /**
     * Все колёса имеют выравнивание по правому краю
     */
    End,

    /**
     * Все колёса имеют выравнивание по центру
     */
    Center,

    /**
     * Колеса до центрального имеют выравнивание по правому краю, центральное - по центру,
     * колеса после центрального - по левому краю
     */
    Mixed,
}

/**
 * Способ размещения данных на колесе
 */
enum class DataEdgePlacement {

    /**
     * Данные начинаются и заканчиваются на середине колеса
     */
    WheelCenter,

    /**
     * Данные начинаются и заканчиваются на краю колеса
     */
    WheelEdge,
}

/**
 * Тип разделителя
 */
enum class WheelSeparator {
    /**
     * Разделитель отсутствует
     */
    None,

    /**
     * Две точки в качестве разделителя
     */
    Dots,

    /**
     * Divider в качестве разделителя
     */
    Divider,
}

/**
 * Набор данных, необходимый для отображения колеса
 *
 * @property dataSet основной набор данных
 * @property description описание
 * @property initialIndex начальный индекс
 * @property staticTextAfter статичный дополнительный текст, общий для всех элементов колеса
 *
 */
@Immutable
data class WheelDataSet @JvmOverloads constructor(
    val dataSet: List<WheelItemData>,
    val description: String? = null,
    val initialIndex: Int = 0,
    val staticTextAfter: String? = null,
)

/**
 * Данные элемента колеса
 *
 * @property text основной текст
 * @property textAfter дополнительный текст
 */
@Immutable
data class WheelItemData(
    val text: String = "",
    val textAfter: String = "",
)

@Composable
@Preview(showBackground = true)
private fun WheelPreview() {
    Wheel(
        modifier = Modifier,
        alignment = WheelAlignment.Mixed,
        hasControls = true,
        wheelCount = 2,
        wheelSeparator = WheelSeparator.Dots,
        onItemSelected = { wheelIndex, index ->
            Log.d("testtag", "Selected on wheel $wheelIndex at index $index")
        },
    ) { wheelIndex ->
        WheelDataSet(
            dataSet = listOf(
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("LabelLong$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
            ),
            description = "description$wheelIndex",
            initialIndex = 0,
        )
    }
}

private const val SEPARATOR_TEXT = ":"

package com.sdds.compose.uikit

import android.util.Log
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.wheel.BaseWheel
import com.sdds.compose.uikit.internal.wheel.WheelItemAlignment

/**
 * Вертикальное колесо выбора.
 * Используется для выбора одного значения из списка с визуальным фокусом на текущем значении.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param hasControls наличие контролов
 * @param visibleItemsCount количество видимых элементов в колесе
 * @param wheelSeparator тип разделителя [WheelSeparator]
 * @param alignment выравнивание [WheelAlignment]
 * @param dataEdgePlacement способ размещения данных в начале и в конце
 * @param wheelConstraints способ ограничения колёс по ширине [WheelConstraints]
 * @param interactionSource источник взаимодействий
 * @param onItemSelected колбэк сигнализирубщий о выбранном элементе
 * @param onSetData колбэк установки набора данных
 */
@Suppress("UnusedBoxWithConstraintsScope")
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
    val textMeasurer = rememberTextMeasurer()
    var labelOffsetFromCenter by remember { mutableFloatStateOf(0f) }
    val separatorTextStyle = style.itemTextStyle
        .copy(style.colors.separatorColor.colorForInteraction(interactionSource))
    val dividerColor = style.dividerStyle.color.backgroundColor.colorForInteraction(interactionSource)
    val separatorColor = style.colors.separatorColor.colorForInteraction(interactionSource)

    BoxWithConstraints(modifier) {
        Row {
            repeat(wheelCount) { wheelIndex ->
                val data = onSetData(wheelIndex)
                BaseWheel(
                    modifier = Modifier
                        .separatorModifier(
                            wheelIndex = wheelIndex,
                            style = style,
                            wheelSeparator = wheelSeparator,
                            dividerColor = dividerColor,
                            separatorColor = separatorColor,
                            textMeasurer = textMeasurer,
                            separatorTextStyle = separatorTextStyle,
                            labelOffsetFromCenter = labelOffsetFromCenter,
                        )
                        .constraintsModifier(
                            maxWidth = this@BoxWithConstraints.maxWidth,
                            style = style,
                            wheelCount = wheelCount,
                            wheelConstraints = wheelConstraints,
                        ),
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
                    onItemSelected = { index ->
                        onItemSelected.invoke(wheelIndex, index)
                    },
                    onLabelPositionCalculated = { labelOffsetFromCenter = it },
                    interactionSource = interactionSource,
                    iconUp = style.controlIconUp,
                    iconDown = style.controlIconDown,
                    hasControls = hasControls,
                )
            }
        }
    }
}

private fun Modifier.constraintsModifier(
    maxWidth: Dp,
    style: WheelStyle,
    wheelCount: Int,
    wheelConstraints: WheelConstraints,
): Modifier {
    val maxItemWidth =
        (maxWidth - (style.dimensions.separatorSpacing * (wheelCount - 1))) / wheelCount
    return when (wheelConstraints) {
        WheelConstraints.Strict -> this.requiredWidthIn(max = maxItemWidth)
        else -> this
    }
}

private fun Modifier.separatorModifier(
    wheelIndex: Int,
    style: WheelStyle,
    wheelSeparator: WheelSeparator,
    dividerColor: Color,
    separatorColor: Color,
    textMeasurer: TextMeasurer,
    separatorTextStyle: TextStyle,
    labelOffsetFromCenter: Float,
): Modifier {
    return if (wheelIndex > 0) {
        this
            .padding(start = style.dimensions.separatorSpacing)
            .drawSeparator(
                style = style,
                wheelSeparator = wheelSeparator,
                dividerColor = dividerColor,
                separatorColor = separatorColor,
                textMeasurer = textMeasurer,
                separatorTextStyle = separatorTextStyle,
                labelOffsetFromCenter = labelOffsetFromCenter,
            )
    } else {
        this
    }
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
    dividerColor: Color,
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
                    color = dividerColor,
                    start = Offset(-separatorCenter, 0f),
                    end = Offset(-separatorCenter, size.height),
                    cap = StrokeCap.Round,
                    strokeWidth = style.dividerStyle.dimensions.thickness.toPx(),
                )
            }

            WheelSeparator.Dots -> {
                val textLayoutResult =
                    textMeasurer.measure(SEPARATOR_TEXT, separatorTextStyle)
                drawText(
                    textLayoutResult = textLayoutResult,
                    color = separatorColor,
                    topLeft = Offset(
                        -separatorCenter - textLayoutResult.size.width / 2f,
                        center.y + labelOffsetFromCenter,
                    ),
                )
            }

            WheelSeparator.None -> {}
        }
    }
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
 * Режим выравнивания составных частей компонент
 */
enum class WheelAlignment {
    /**
     * Все колёса имеют выравнивание по левому
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
     * Колеса до центрального имеют выравнивание по левому краю, центральное - по центру,
     * колеса после центрального - по правому краю
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
 *
 */
@Immutable
data class WheelDataSet(
    val dataSet: List<WheelItemData>,
    val description: String? = null,
    val initialIndex: Int = 0,
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

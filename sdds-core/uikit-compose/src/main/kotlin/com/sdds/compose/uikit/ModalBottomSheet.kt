package com.sdds.compose.uikit

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.BaseModalBottomSheet
import com.sdds.compose.uikit.internal.modal.BottomSheetState
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Hidden
import com.sdds.compose.uikit.internal.modal.handle
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState

/**
 * Компонент ModalBottomSheet
 *
 * @param modifier модификатор
 * @param style стиль компонента [ModalBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param interactionSource источник взаимодействий
 * @param fitContent ModalBottomSheet открывается по высоте контента
 * @param header заголовок
 * @param footer нижний колонтитул
 * @param body основной контент
 */
@OptIn(ExperimentalFoundationApi::class)
@Suppress("LongMethod")
@Composable
fun ModalBottomSheet(
    modifier: Modifier = Modifier,
    style: ModalBottomSheetStyle = LocalModalBottomSheetStyle.current,
    sheetState: BottomSheetState = rememberModalBottomSheetState(Hidden),
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    handlePlacement: BottomSheetHandlePlacement = BottomSheetHandlePlacement.Auto,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    fitContent: Boolean,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    body: (@Composable () -> Unit),
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val handleColor = style.colors.handleColor.colorForInteraction(interactionSource)
    val newShape = style.shape.copy(
        bottomEnd = ZeroCornerSize,
        bottomStart = ZeroCornerSize,
    )
    val draggableAreaHeight = style.dimensions.handleHeight + style.dimensions.handleOffset
    val measurePolicy = BottomSheetMeasurePolicy(fitContent)
    BaseModalBottomSheet(
        modifier = modifier
            .handle(
                handleShape = style.handleShape,
                handleColor = handleColor,
                handleWidth = style.dimensions.handleWidth,
                handleHeight = style.dimensions.handleHeight,
                handleOffset = style.dimensions.handleOffset,
                progress = (sheetState.progressFromHalfExpandedToExpanded),
                handlePlacement = handlePlacement,
            )
            .background(
                backgroundColor,
                newShape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
        sheetGesturesEnabled = sheetGesturesEnabled,
        bottomSheetState = sheetState,
        onDismiss = onDismiss,
        hasHandle = handlePlacement != BottomSheetHandlePlacement.None,
        draggableAreaHeight = draggableAreaHeight,
    ) {
        Layout(
            measurePolicy = measurePolicy,
            content = {
                header?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(HEADER)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center,
                    ) {
                        header()
                    }
                }
                Box(
                    modifier = Modifier
                        .layoutId(BODY)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    body()
                }
                footer?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(FOOTER)
                            .fillMaxWidth()
                            .graphicsLayer {
                                translationY = -sheetState.requireOffset()
                                    .coerceAtMost(
                                        sheetState.anchoredDraggableState
                                            .anchors.positionOf(Hidden) -
                                            this.size.height - style.dimensions.paddingBottom.roundToPx() -
                                            style.dimensions.paddingTop.roundToPx(),
                                    )
                            },
                        contentAlignment = Alignment.Center,
                    ) {
                        footer()
                    }
                }
            },
        )
    }
}

/**
 * Режимы размещения handle относительно границы ModalBottomSheet
 */
enum class BottomSheetHandlePlacement {

    /**
     * Режим размещения, при котором изначально handle находится
     * снаружи, но по мере выдвижения ModalBottomSheet - смещается
     * во внутрь
     */
    Auto,

    /**
     * Режим размещения handle внутри ModalBottomSheet
     */
    Inner,

    /**
     * Режим размещения handle снаружи ModalBottomSheet
     */
    Outer,

    /**
     * Отображение handle отключено
     */
    None,
}

private class BottomSheetMeasurePolicy(
    val fitContent: Boolean,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val layoutWidth = constraints.maxWidth
        var layoutHeight = constraints.maxHeight
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)

        val header = measurables.find { it.layoutId == HEADER }
        val footer = measurables.find { it.layoutId == FOOTER }
        val body = measurables.find { it.layoutId == BODY }

        val footerPlaceable = footer?.measure(looseConstraints)
        val headerPlaceable = header?.measure(looseConstraints)

        val headerHeight = headerPlaceable.heightOrZero()
        val footerHeight = footerPlaceable.heightOrZero()
        val bodyConstraints =
            looseConstraints.copy(maxHeight = layoutHeight - headerHeight - footerHeight)

        val bodyPlaceable = body?.measure(bodyConstraints)
        val bodyHeight = bodyPlaceable.heightOrZero()
        if (fitContent) layoutHeight = bodyHeight + headerHeight + footerHeight
        return layout(
            width = layoutWidth,
            height = layoutHeight,
        ) {
            headerPlaceable?.placeRelative(0, 0)
            bodyPlaceable?.placeRelative(0, headerHeight)
            footerPlaceable?.placeRelative(0, constraints.maxHeight - footerHeight)
        }
    }
}

private const val FOOTER = "footer"
private const val HEADER = "header"
private const val BODY = "body"

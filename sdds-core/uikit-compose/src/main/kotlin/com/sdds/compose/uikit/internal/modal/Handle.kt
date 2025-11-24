package com.sdds.compose.uikit.internal.modal

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import kotlinx.coroutines.launch

/**
 * Модификатор, который декорирует компонент как Handle,
 *  с возможностью отрисовки Handle как внутри,
 *  так и снаружи декорируемого компонента.
 * @param alignment положение Handle относительно сторон компонента
 * @param handleShape форма скругления Handle
 * @param handleColor цвет Handle
 * @param handleWidth ширина Handle
 * @param handleHeight высота Handle
 * @param handleOffset смещение Handle относительно края компонента
 * @param handlePlacement расположение Handle в компоненте
 * @see BottomSheetHandlePlacement
 * @param progress используется для режима handlePlacement.Auto
 * величина  0f..1f регулирует положение Handle от Outer при 1f до
 * Inner при 0f
 */

@Composable
internal fun Modifier.handle(
    alignment: Alignment = Alignment.TopCenter,
    handleShape: CornerBasedShape = RoundedCornerShape(50),
    handleColor: Color = Color.Gray,
    handleWidth: Dp = 30.dp,
    handleHeight: Dp = 10.dp,
    handleOffset: Dp = 5.dp,
    handlePlacement: BottomSheetHandlePlacement = BottomSheetHandlePlacement.Inner,
    progressProvider: () -> Float = { 0f },
    sheetState: BottomSheetState? = null,
): Modifier =
    if (handlePlacement == BottomSheetHandlePlacement.None) {
        this
    } else {
        this then Modifier
            .drawWithCache {
                val verticalOffset = handleOffset.roundToPx()
                val handleWidthPx = handleWidth.roundToPx()
                val handleHeightPx = handleHeight.roundToPx()
                val outer = -verticalOffset * 2
                val inner = verticalOffset * 2 + handleHeightPx * 2
                val outline = handleShape.createOutline(
                    Size(handleWidthPx.toFloat(), handleHeightPx.toFloat()),
                    layoutDirection = layoutDirection,
                    density = this,
                )
                onDrawWithContent {
                    val deltaSpace = IntOffset(
                        x = 0,
                        y = when (handlePlacement) {
                            BottomSheetHandlePlacement.Inner -> outer
                            BottomSheetHandlePlacement.Outer -> inner
                            else -> lerp(outer, inner, progressProvider())
                        },
                    )
                    val offset = alignment.align(
                        IntSize(
                            handleWidthPx,
                            handleHeightPx,
                        ),
                        IntSize(
                            (size.width + deltaSpace.x).toInt(),
                            (size.height + deltaSpace.y).toInt(),
                        ),
                        layoutDirection = layoutDirection,
                    )
                    val resultOffset = offset - deltaSpace / 2f
                    if (sheetState?.currentValue != BottomSheetValue.Hidden) {
                        drawContent()
                        translate(resultOffset.x.toFloat(), resultOffset.y.toFloat()) {
                            drawOutline(outline, handleColor)
                        }
                    }
                }
            }
    }

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun DraggableHandleArea(
    modifier: Modifier = Modifier,
    sheetState: BottomSheetState,
) {
    val coroutineScope = rememberCoroutineScope()
    Box(
        modifier = modifier
            .fillMaxWidth()
            .pointerInput(sheetState) {
                detectDragGestures(
                    onDragEnd = {
                        val target = sheetState.anchoredDraggableState.targetValue
                        coroutineScope.launch {
                            sheetState.animateTo(target)
                        }
                    },
                ) { change, dragAmount ->
                    change.consume()
                    sheetState.anchoredDraggableState.dispatchRawDelta(dragAmount.y)
                }
            },
    )
}

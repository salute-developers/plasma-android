package com.sdds.compose.uikit.internal.modal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Hidden
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

/**
 * Основа для  ModalBottomSheet
 *
 * @param modifier модификатор
 * @param bottomSheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param dimBackground затемнение фона
 * @param useNativeBlackout будет ли использовано стандартное затемнение
 * @param overlayStyle стиль накладываемого слоя overlay
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param hasHandle включение ручки (handle)
 * @param handleHeight высота ручки
 * @param handleOffset отступ ручки
 * @param edgeToEdge включен ли режим от "края до края"
 * @param blurRadius радиус размытия
 * @param content контент
 */
@Composable
@Suppress("LongMethod")
internal fun BaseModalBottomSheet(
    modifier: Modifier = Modifier,
    bottomSheetState: BottomSheetState,
    dimBackground: Boolean,
    useNativeBlackout: Boolean,
    overlayStyle: OverlayStyle,
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    hasHandle: Boolean = false,
    handleHeight: State<Dp>,
    handleOffset: State<Dp>,
    edgeToEdge: Boolean = true,
    blurRadius: State<Dp>,
    content: @Composable BoxScope.() -> Unit,
) {
    val scope = rememberCoroutineScope()
    val dialogState by bottomSheetState.dialogState.collectAsState()
    var wasVisible by remember { mutableStateOf(bottomSheetState.currentValue != Hidden) }
    LaunchedEffect(bottomSheetState.currentValue) {
        if (bottomSheetState.currentValue != Hidden) {
            wasVisible = true
        } else if (wasVisible) {
            bottomSheetState.hideDialog()
            onDismiss()
            wasVisible = false
        }
    }
    if (dialogState == DialogState.Show) {
        val currentBlurRadius = blurRadius.value
        EdgeToEdgeDialog(
            edgeToEdge = edgeToEdge,
            useNativeBlackout = dimBackground && useNativeBlackout,
            blurRadius = currentBlurRadius,
            onDismissRequest = {
                if (bottomSheetState.confirmValueChange(Hidden)) {
                    scope.launch { bottomSheetState.hide() }
                }
            },
        ) {
            OverlayOrBox(
                hasOverlay = dimBackground && !useNativeBlackout,
                overlayStyle = overlayStyle,
            ) {
                BoxWithConstraints(Modifier.fillMaxSize()) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .clickable(
                                indication = null,
                                onClick = {
                                    if (bottomSheetState.confirmValueChange(Hidden)) {
                                        scope.launch { bottomSheetState.hide() }
                                    }
                                },
                                interactionSource = remember { MutableInteractionSource() },
                            ),
                    )
                    if (hasHandle) {
                        val draggableAreaHeight = handleHeight.value + handleOffset.value
                        DraggableHandleArea(
                            sheetState = bottomSheetState,
                            modifier = Modifier
                                .height(draggableAreaHeight)
                                .offset {
                                    IntOffset(
                                        0,
                                        bottomSheetState.requireOffset()
                                            .roundToInt() - draggableAreaHeight.roundToPx(),
                                    )
                                },
                        )
                    }
                    BottomSheet(
                        modifier = modifier,
                        sheetState = bottomSheetState,
                        sheetGesturesEnabled = sheetGesturesEnabled,
                        content = content,
                    )
                }
            }
        }
    }
}

@Composable
private fun OverlayOrBox(
    hasOverlay: Boolean,
    overlayStyle: OverlayStyle,
    sheetContent: @Composable BoxScope.() -> Unit,
) {
    if (hasOverlay) {
        Overlay(
            modifier = Modifier.fillMaxSize(),
            style = overlayStyle,
            content = sheetContent,
        )
    } else {
        Box(
            modifier = Modifier.fillMaxSize(),
            content = sheetContent,
        )
    }
}

internal enum class DialogState {
    Show,
    Hide,
}

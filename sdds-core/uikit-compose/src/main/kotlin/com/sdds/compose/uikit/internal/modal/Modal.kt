package com.sdds.compose.uikit.internal.modal

import android.view.WindowManager
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
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogWindowProvider
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
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param hasHandle включение ручки (handle)
 * @param draggableAreaHeight область вокруг ручки поддерживающая жесты
 * @param content контент
 */
@Composable
@Suppress("LongMethod")
internal fun BaseModalBottomSheet(
    modifier: Modifier = Modifier,
    bottomSheetState: BottomSheetState,
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    hasHandle: Boolean = false,
    draggableAreaHeight: Dp = 10.dp,
    edgeToEdge: Boolean = true,
    dimBackground: Boolean,
    useNativeBlackout: Boolean,
    overlayStyle: OverlayStyle,
    content: @Composable BoxScope.() -> Unit,
) {
    val scope = rememberCoroutineScope()
    val dialogState by bottomSheetState.dialogState.collectAsState()
    LaunchedEffect(bottomSheetState.currentValue) {
        if (bottomSheetState.currentValue == Hidden) bottomSheetState.hideDialog()
    }
    if (dialogState == DialogState.Show) {
        EdgeToEdgeDialog(
            edgeToEdge = edgeToEdge,
            onDismissRequest = {
                if (bottomSheetState.confirmValueChange(Hidden)) {
                    scope.launch { bottomSheetState.hide() }
                    onDismiss()
                }
            },
        ) {
            ConfigureWindow(useNativeBlackout, dimBackground)
            OverlayOrBox(
                hasOverlay = dimBackground && !useNativeBlackout,
                overlayStyle = overlayStyle,
            ) {
                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable(
                            indication = null,
                            onClick = {
                                if (bottomSheetState.confirmValueChange(Hidden)) {
                                    scope.launch { bottomSheetState.hide() }
                                    onDismiss()
                                }
                            },
                            interactionSource = remember { MutableInteractionSource() },
                        ),
                ) {
                    if (hasHandle) {
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

@Composable
private fun ConfigureWindow(useNativeBlackout: Boolean, dimBackground: Boolean) {
    val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
    SideEffect {
        dialogWindowProvider?.window ?: return@SideEffect
        dialogWindowProvider.apply {
            window.setWindowAnimations(-1)
            if (!useNativeBlackout || !dimBackground) {
                window.setDimAmount(0f)
                window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }
        }
    }
}

internal enum class DialogState {
    Show,
    Hide,
}

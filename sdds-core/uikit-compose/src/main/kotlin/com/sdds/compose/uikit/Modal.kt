package com.sdds.compose.uikit

import android.view.WindowManager
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.DummyInteractionSource
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент Modal
 *
 * @param show будет ли показан Modal
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Modal
 * @param modifier модификатор для контента [content]
 * @param style стиль компонента
 * @param dialogProperties свойства [DialogProperties]
 * @param hasClose должна ли показываться иконка закрытия в правом верхнем углу контента [content]
 * @param closeIcon иконка закрытия
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [Modal]
 * @param interactionSource источник взаимодействий
 * @param content контент Modal
 */
@Composable
fun Modal(
    show: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    style: ModalStyle = LocalModalStyle.current,
    dialogProperties: DialogProperties = DefaultDialogProperties,
    hasClose: Boolean = true,
    closeIcon: Painter? = null,
    useNativeBlackout: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit,
) {
    if (!show) return
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = dialogProperties,
    ) {
        if (!useNativeBlackout) {
            val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
            dialogWindowProvider?.apply {
                window.setDimAmount(0f)
                window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }
        }
        val outsideClickableModifier = if (dialogProperties.dismissOnClickOutside) {
            Modifier.clickable(
                indication = null,
                interactionSource = DummyInteractionSource,
            ) { onDismissRequest.invoke() }
        } else {
            Modifier
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .then(outsideClickableModifier),
        ) {
            val shadowModifier = if (useNativeBlackout) {
                Modifier
            } else {
                Modifier.shadow(style.shadow, style.shape)
            }
            Box(
                modifier = modifier
                    .then(shadowModifier)
                    .background(
                        brush = style.colors.backgroundColor.getValue(interactionSource),
                        shape = style.shape,
                    )
                    .padding(
                        start = style.dimensions.paddingStart,
                        end = style.dimensions.paddingEnd,
                        top = style.dimensions.paddingTop,
                        bottom = style.dimensions.paddingBottom,
                    ),
            ) {
                content.invoke(this)
                if (hasClose && closeIcon != null) {
                    IconClose(style, onDismissRequest, closeIcon)
                }
            }
        }
    }
}

@Composable
private fun BoxScope.IconClose(
    style: ModalStyle,
    onDismissRequest: () -> Unit,
    closeIcon: Painter,
) {
    val size = style.dimensions.closeSize
    Icon(
        modifier = Modifier
            .size(size)
            .defaultMinSize(size, size)
            .align(Alignment.TopEnd)
            .clickable(
                indication = null,
                interactionSource = DummyInteractionSource,
            ) { onDismissRequest.invoke() },
        painter = closeIcon,
        contentDescription = "",
    )
}

private val DefaultDialogProperties = DialogProperties()

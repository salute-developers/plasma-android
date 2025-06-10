package com.sdds.testing.compose.toast

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.icons.R

/**
 * Тест кейсы для Toast
 */

/**
 * Preview для меню песочницы
 */
@Composable
fun ToastForSandbox(style: ToastStyle) {
    val overlayManager = LocalOverlayManager.current
    Button(
        label = "Show Toast",
        onClick = {
            overlayManager.showToast(
                position = OverlayPosition.BottomCenter,
            ) {
                Toast(
                    style = style,
                    text = "Toast Text",
                    contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
                    contentEnd = {
                        Icon(
                            modifier = Modifier.clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                overlayManager.remove(it)
                            },
                            painter = painterResource(R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
            }
        },
    )
}

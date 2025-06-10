package com.sdds.testing.compose.overlay

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.icons.R

/**
 * Тест кейсы для Overlay
 */

/**
 * Preview для меню песочницы
 */
@Composable
fun OverlayForSandbox(style: OverlayStyle, iconButtonStyle: ButtonStyle) {
    var showOverlay by remember { mutableStateOf(false) }
    Button(
        label = "Show Overlay",
        onClick = {
            showOverlay = true
        },
    )
    if (showOverlay) {
        Overlay(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
            style = style,
        ) {
            IconButton(
                modifier = Modifier
                    .align(Alignment.CenterEnd),
                style = iconButtonStyle,
                icon = painterResource(id = R.drawable.ic_close_24),
                onClick = { showOverlay = false },
            )
        }
    }
}

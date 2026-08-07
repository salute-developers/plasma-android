package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.SddsIcons

/**
 * PLASMA-T2049
 */
@Composable
fun NotificationCompactMTopCenterHasCloseActionButton(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationHasCloseTextActionButton(
            modifier = Modifier.align(Alignment.TopCenter),
            style = style,
            buttonStyle = buttonStyle,
        )
    }
}

/**
 * PLASMA-T2053
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun NotificationLooseMCenterEndTextHasClose(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationHasCloseText(
            modifier = Modifier.align(Alignment.CenterEnd),
            style = style,
        )
    }
}

/**
 * PLASMA-T2054
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun NotificationLooseSBottomStartText(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NotificationText(
            modifier = Modifier.align(Alignment.BottomStart),
            style = style,
        )
    }
}

/**
 * Notification с текстом
 */
@Composable
fun NotificationText(
    style: NotificationStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = false,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Notification")
            }
        },
    )
}

/**
 * Notification с текстом и hasClose
 */
@Composable
fun NotificationHasCloseText(
    style: NotificationStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 32.dp),
            ) {
                Text(text = "Notification")
                Spacer(Modifier.size(8.dp))
            }
        },
    )
}

/**
 * Notification с текстом, hasClose и ActionButton
 */
@Composable
fun NotificationHasCloseTextActionButton(
    style: NotificationStyle,
    buttonStyle: ButtonStyle,
    modifier: Modifier = Modifier,
) {
    Notification(
        modifier = modifier,
        style = style,
        hasClose = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 32.dp),
            ) {
                Text(text = "Notification")
                Spacer(Modifier.size(8.dp))
                Button(
                    style = buttonStyle,
                    label = "Action",
                    onClick = {},
                )
            }
        },
    )
}

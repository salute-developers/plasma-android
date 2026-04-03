package com.sdds.compose.uikit.fixtures.samples.notificationcontent

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationContentButtonLayout
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun NotificationContent_Simple() {
    composableCodeSnippet {
        NotificationContent(
            modifier = Modifier.fillMaxWidth(),
            title = "Title",
            text = "Notification Text",
            buttons = {
                button { Button(label = "Ok", onClick = {}) }
                button { Button(label = "Cancel", onClick = {}) }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun NotificationContent_Style() {
    composableCodeSnippet {
        NotificationContentStyle.builder()
            .buttonLayout(NotificationContentButtonLayout.Stretch)
            .buttonGroupStyle(placeholder(ButtonGroupStyle.builder().style(), "/** Стиль компонента */"))
            .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                iconSize(24.0.dp)
                textPadding(4.0.dp)
                contentStartPadding(4.0.dp)
                contentTopPadding(2.0.dp)
                textBoxBottomPadding(6.0.dp)
                buttonGroupTopPadding(6.0.dp)
            }
            .style()
    }
}

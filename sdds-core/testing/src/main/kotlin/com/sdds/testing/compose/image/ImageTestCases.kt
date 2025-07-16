package com.sdds.testing.compose.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ImageStyle
import com.sdds.icons.R

/**
 * Тест кейсы для [Image]
 */

@Composable
fun ImageTestCase(style: ImageStyle) {
    Image(
        painter = painterResource(R.drawable.ic_alarm_done_fill_36),
        contentDescription = null,
        modifier = Modifier
            .height(100.dp)
            .background(Color.Gray),
        style = style,
    )
}

package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ImageStyle
import com.sdds.icons.compose.AlarmDoneFill36
import com.sdds.icons.compose.SddsIcons

/**
 * Тест кейсы для [Image]
 */

@Composable
fun ImageTestCase(style: ImageStyle) {
    Image(
        painter = rememberVectorPainter(SddsIcons.AlarmDoneFill36),
        contentDescription = null,
        modifier = Modifier
            .height(100.dp)
            .background(Color.Gray),
        style = style,
    )
}

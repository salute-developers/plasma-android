package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons

/**
 * Иконка с цветом
 */
@Composable
fun IconFillColor() {
    Icon(
        painter = rememberVectorPainter(SddsIcons.Plasma24),
        contentDescription = "Icon",
        modifier = Modifier.size(48.dp),
        brush = {
            Color(0xFF27AE60).asBrush()
        },
    )
}

/**
 * Иконка с цветом LocalTintBrushProducer
 */
@Composable
fun IconTint() {
    CompositionLocalProvider(
        LocalTintBrushProducer provides { Color(0xFF2F80ED).asBrush() },
    ) {
        Icon(
            source = imageVectorSource(SddsIcons.Plasma24),
            contentDescription = "Icon",
            modifier = Modifier.size(48.dp),
        )
    }
}

/**
 * Иконка с градиентом
 */
@Composable
fun IconFillBrush() {
    Icon(
        source = imageVectorSource(SddsIcons.Plasma24),
        contentDescription = "Icon",
        modifier = Modifier.size(48.dp),
        brush = {
            Brush.linearGradient(
                colors = listOf(
                    Color(0xFF11994A),
                    Color(0xFFff5757),
                ),
            )
        },
    )
}

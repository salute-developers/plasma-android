package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Space16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Space16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 7.5 C 1.776 7.5 2.0 7.724 2.0 8.0 v 1.55 c 0.0 0.288 0.0 0.474 0.012 0.616 c 0.011 0.136 0.03 0.186 0.042 0.211 c 0.048 0.094 0.125 0.17 0.219 0.218 c 0.025 0.013 0.075 0.032 0.21 0.043 C 2.627 10.65 2.813 10.65 3.1 10.65 h 9.8 c 0.288 0.0 0.474 0.0 0.616 -0.012 c 0.136 -0.011 0.186 -0.03 0.211 -0.043 c 0.094 -0.047 0.17 -0.124 0.218 -0.218 c 0.013 -0.025 0.032 -0.075 0.043 -0.21 C 14.0 10.023 14.0 9.837 14.0 9.55 V 8.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 S 15.0 7.724 15.0 8.0 v 1.57 c 0.0 0.263 0.0 0.49 -0.015 0.678 c -0.016 0.197 -0.052 0.394 -0.149 0.583 c -0.143 0.282 -0.373 0.512 -0.655 0.655 c -0.19 0.097 -0.386 0.133 -0.583 0.149 c -0.188 0.015 -0.415 0.015 -0.679 0.015 H 3.081 c -0.264 0.0 -0.491 0.0 -0.679 -0.015 c -0.197 -0.016 -0.394 -0.052 -0.583 -0.149 c -0.282 -0.143 -0.512 -0.373 -0.656 -0.655 c -0.096 -0.19 -0.132 -0.386 -0.148 -0.583 C 1.0 10.06 1.0 9.833 1.0 9.569 V 8.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}

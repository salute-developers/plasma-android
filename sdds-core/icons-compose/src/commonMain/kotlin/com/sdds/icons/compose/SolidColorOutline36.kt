package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SolidColorOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SolidColorOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.571 3.0 C 30.121 3.0 33.0 5.878 33.0 9.429 V 26.57 C 33.0 30.121 30.122 33.0 26.571 33.0 H 9.43 C 5.879 33.0 3.0 30.122 3.0 26.571 V 9.43 C 3.0 5.879 5.878 3.0 9.429 3.0 H 26.57 Z M 9.43 5.143 c -2.367 0.0 -4.286 1.919 -4.286 4.286 V 26.57 c 0.0 2.367 1.919 4.286 4.286 4.286 H 26.57 c 2.367 0.0 4.286 -1.919 4.286 -4.286 V 9.43 c 0.0 -2.367 -1.919 -4.286 -4.286 -4.286 H 9.43 Z m 15.0 4.286 c 1.183 0.0 2.142 0.959 2.142 2.142 V 24.43 c 0.0 1.183 -0.959 2.142 -2.142 2.142 H 11.57 c -1.183 0.0 -2.142 -0.959 -2.142 -2.142 V 11.57 c 0.0 -1.183 0.959 -2.142 2.142 -2.142 H 24.43 Z")
        )
    }.build()
}

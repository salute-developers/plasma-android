package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GradientColorOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GradientColorOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.902 3.009 C 30.3 3.18 33.0 5.989 33.0 9.429 V 26.57 l -0.009 0.331 c -0.166 3.287 -2.802 5.922 -6.089 6.09 L 26.572 33.0 H 9.428 c -3.44 0.0 -6.248 -2.701 -6.42 -6.098 L 3.0 26.572 V 9.428 C 3.0 5.879 5.878 3.0 9.429 3.0 H 26.57 l 0.331 0.009 Z M 9.43 7.286 h 4.285 v 4.285 H 9.429 v 4.286 h 4.285 v 4.286 H 9.429 v 4.286 h 4.285 v 4.285 H 9.429 v 2.143 h 4.285 v -2.143 H 18.0 v 2.143 h 8.571 c 2.367 0.0 4.286 -1.919 4.286 -4.286 V 9.43 c 0.0 -2.367 -1.919 -4.286 -4.286 -4.286 H 18.0 v 2.143 h -4.286 V 5.143 H 9.429 v 2.143 Z m 12.857 21.428 H 18.0 v -4.285 h 4.286 v 4.285 Z M 18.0 24.429 h -4.286 v -4.286 H 18.0 v 4.286 Z m 8.571 0.0 h -4.285 v -4.286 h 4.285 v 4.286 Z m -4.285 -4.286 H 18.0 v -4.286 h 4.286 v 4.286 Z M 18.0 15.857 h -4.286 v -4.286 H 18.0 v 4.286 Z m 8.571 0.0 h -4.285 v -4.286 h 4.285 v 4.286 Z m -4.285 -4.286 H 18.0 V 7.286 h 4.286 v 4.285 Z")
        )
    }.build()
}

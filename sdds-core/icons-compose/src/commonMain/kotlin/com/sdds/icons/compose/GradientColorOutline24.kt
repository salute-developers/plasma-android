package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GradientColorOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GradientColorOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.935 2.006 C 20.199 2.12 22.0 3.993 22.0 6.286 v 11.428 l -0.006 0.22 c -0.11 2.192 -1.868 3.95 -4.06 4.06 L 17.715 22.0 H 6.286 c -2.293 0.0 -4.165 -1.8 -4.28 -4.065 L 2.0 17.714 V 6.286 C 2.0 3.92 3.92 2.0 6.286 2.0 h 11.428 l 0.22 0.006 Z M 6.286 4.857 h 2.857 v 2.857 H 6.286 v 2.857 h 2.857 v 2.858 H 6.286 v 2.857 h 2.857 v 2.857 H 6.286 v 1.428 h 2.857 v -1.428 H 12.0 v 1.428 h 5.714 c 1.578 0.0 2.857 -1.28 2.857 -2.857 V 6.286 c 0.0 -1.578 -1.28 -2.857 -2.857 -2.857 H 12.0 v 1.428 H 9.143 V 3.43 H 6.286 v 1.428 Z m 8.571 14.286 H 12.0 v -2.857 h 2.857 v 2.857 Z M 12.0 16.286 H 9.143 V 13.43 H 12.0 v 2.857 Z m 5.714 0.0 h -2.857 V 13.43 h 2.857 v 2.857 Z m -2.857 -2.857 H 12.0 V 10.57 h 2.857 v 2.858 Z M 12.0 10.57 H 9.143 V 7.714 H 12.0 v 2.857 Z m 5.714 0.0 h -2.857 V 7.714 h 2.857 v 2.857 Z m -2.857 -2.857 H 12.0 V 4.857 h 2.857 v 2.857 Z")
        )
    }.build()
}

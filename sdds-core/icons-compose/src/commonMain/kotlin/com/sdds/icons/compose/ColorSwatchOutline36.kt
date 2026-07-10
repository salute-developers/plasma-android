package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 24.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 0.015 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 25.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.5 3.5 c -1.06 0.0 -2.078 0.422 -2.828 1.172 S 3.5 6.439 3.5 7.5 v 18.0 c 0.0 1.857 0.737 3.637 2.05 4.95 c 1.313 1.313 3.093 2.05 4.95 2.05 h 18.0 c 1.06 0.0 2.078 -0.422 2.828 -1.172 S 32.5 29.561 32.5 28.5 v -6.0 c 0.0 -1.06 -0.422 -2.078 -1.172 -2.828 S 29.561 18.5 28.5 18.5 h -1.093 l 1.284 -1.284 c 0.75 -0.75 1.171 -1.768 1.171 -2.828 c 0.0 -1.06 -0.42 -2.078 -1.17 -2.828 l -4.243 -4.242 c -0.75 -0.75 -1.767 -1.171 -2.828 -1.172 c -1.06 0.0 -2.078 0.422 -2.828 1.171 L 17.5 8.611 V 7.5 c 0.0 -1.06 -0.422 -2.078 -1.172 -2.828 S 14.561 3.5 13.5 3.5 h -6.0 Z m 21.0 17.0 c 0.53 0.0 1.039 0.21 1.414 0.586 C 30.29 21.46 30.5 21.97 30.5 22.5 v 6.0 c 0.0 0.53 -0.21 1.039 -0.586 1.414 C 29.54 30.29 29.03 30.5 28.5 30.5 H 15.407 l 10.0 -10.0 H 28.5 Z m -15.0 -15.0 c 0.53 0.0 1.039 0.21 1.414 0.586 C 15.29 6.46 15.5 6.97 15.5 7.5 v 18.0 l -0.006 0.248 c -0.061 1.236 -0.58 2.408 -1.459 3.287 c -0.938 0.938 -2.209 1.465 -3.535 1.465 s -2.597 -0.527 -3.535 -1.465 C 6.027 28.097 5.5 26.826 5.5 25.5 v -18.0 c 0.0 -0.53 0.21 -1.039 0.586 -1.414 C 6.46 5.71 6.97 5.5 7.5 5.5 h 6.0 Z m 8.121 2.646 c 0.53 0.0 1.04 0.211 1.414 0.586 l 4.241 4.242 c 0.375 0.375 0.586 0.883 0.586 1.414 c 0.0 0.53 -0.21 1.039 -0.586 1.414 l -9.778 9.78 L 17.5 25.5 V 11.44 l 2.707 -2.708 c 0.375 -0.375 0.884 -0.586 1.414 -0.586 Z")
        )
    }.build()
}

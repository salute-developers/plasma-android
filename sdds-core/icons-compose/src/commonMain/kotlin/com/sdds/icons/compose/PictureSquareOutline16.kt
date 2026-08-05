package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureSquareOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureSquareOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.486 1.015 C 13.898 1.158 15.0 2.35 15.0 3.8 v 8.4 l -0.015 0.286 c -0.133 1.318 -1.18 2.365 -2.499 2.5 L 12.2 15.0 H 3.8 c -1.45 0.0 -2.642 -1.102 -2.785 -2.514 L 1.0 12.2 V 3.8 C 1.0 2.254 2.254 1.0 3.8 1.0 h 8.4 l 0.286 0.015 Z m -1.234 7.767 c -0.35 -0.376 -0.899 -0.376 -1.248 0.0 l -2.686 2.895 l -0.003 0.003 L 5.122 14.0 H 12.2 c 0.994 0.0 1.8 -0.806 1.8 -1.8 v -0.47 c -0.023 -0.017 -0.046 -0.036 -0.066 -0.058 l -2.682 -2.89 Z M 5.65 10.67 c -0.349 -0.376 -0.899 -0.376 -1.248 0.0 l -2.197 2.365 C 2.5 13.595 3.08 13.98 3.754 13.997 c 0.01 -0.014 0.02 -0.028 0.033 -0.04 l 2.48 -2.624 l -0.617 -0.664 Z M 3.8 2.0 C 2.806 2.0 2.0 2.806 2.0 3.8 v 7.987 l 1.67 -1.799 c 0.745 -0.802 1.968 -0.802 2.713 0.0 l 0.568 0.613 l 2.32 -2.5 c 0.745 -0.801 1.969 -0.802 2.713 0.0 L 14.0 10.274 V 3.8 C 14.0 2.806 13.194 2.0 12.2 2.0 H 3.8 Z m 1.225 1.8 c 0.677 0.0 1.225 0.549 1.225 1.225 c 0.0 0.677 -0.548 1.225 -1.225 1.225 C 4.35 6.25 3.8 5.702 3.8 5.025 C 3.8 4.35 4.349 3.8 5.025 3.8 Z")
        )
    }.build()
}

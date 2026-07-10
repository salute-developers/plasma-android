package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mir36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mir36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.817 14.0 l -0.043 0.001 H 3.0 V 22.0 h 2.68 v -4.717 h 0.18 L 7.356 22.0 h 2.017 l 1.494 -4.714 h 0.18 V 22.0 h 2.68 v -7.999 h -2.63 h -0.066 c -0.375 -0.005 -1.147 -0.016 -1.468 1.042 c -0.199 0.657 -0.565 1.885 -1.098 3.685 H 8.262 c -0.497 -1.707 -0.859 -2.935 -1.086 -3.685 c -0.321 -1.06 -1.058 -1.047 -1.36 -1.042 Z m 11.76 4.719 V 14.0 h -2.738 V 22.0 h 2.595 s 0.787 -0.07 1.14 -0.838 l 1.782 -3.88 h 0.214 V 22.0 h 2.737 v -7.999 h -2.594 s -0.752 0.067 -1.105 0.839 l -1.818 3.879 h -0.214 Z m 12.281 0.898 c 1.328 0.0 2.526 -0.757 2.908 -1.815 h -8.38 V 22.0 h 2.602 v -2.383 h 2.87 Z m -5.608 -5.616 h 5.734 c 2.207 0.0 3.273 1.826 2.964 3.306 h -5.369 c -1.624 0.0 -3.192 -1.525 -3.329 -3.305 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.717 8.45 C 14.89 8.369 15.0 8.193 15.0 8.0 s -0.11 -0.367 -0.283 -0.45 l -13.0 -6.25 C 1.529 1.207 1.303 1.245 1.152 1.392 C 1.001 1.54 0.96 1.766 1.046 1.957 L 3.801 8.0 l -2.755 6.043 c -0.087 0.192 -0.045 0.417 0.105 0.565 c 0.15 0.147 0.377 0.184 0.567 0.093 l 12.999 -6.25 Z M 4.403 6.91 L 2.529 2.799 L 13.346 8.0 L 2.53 13.202 L 4.403 9.09 L 6.78 8.163 c 0.149 -0.058 0.149 -0.268 0.0 -0.326 L 4.403 6.91 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.601 1.5 c -0.192 0.0 -0.37 0.103 -0.462 0.27 c -0.093 0.166 -0.087 0.369 0.016 0.529 l 1.502 2.347 h 6.686 l 1.502 -2.347 c 0.103 -0.16 0.109 -0.363 0.016 -0.53 c -0.093 -0.166 -0.27 -0.269 -0.462 -0.269 H 3.6 Z m 8.38 4.146 H 4.02 C 3.005 6.418 2.249 7.52 1.927 8.818 l -0.059 0.24 C 1.244 11.572 3.174 14.0 5.798 14.0 h 4.403 c 2.625 0.0 4.555 -2.427 3.93 -4.943 l -0.059 -0.24 c -0.321 -1.297 -1.077 -2.399 -2.09 -3.171 Z")
        )
    }.build()
}

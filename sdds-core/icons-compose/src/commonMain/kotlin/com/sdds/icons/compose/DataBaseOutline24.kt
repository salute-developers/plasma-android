package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c 4.924 0.0 8.922 2.197 8.996 4.923 C 21.0 6.948 21.0 6.974 21.0 7.0 v 10.191 c 0.0 0.07 -0.013 0.135 -0.03 0.199 C 20.612 19.969 16.734 22.0 12.0 22.0 c -4.734 0.0 -8.613 -2.031 -8.97 -4.61 C 3.011 17.326 3.0 17.26 3.0 17.19 V 7.0 c 0.0 -2.761 4.03 -5.0 9.0 -5.0 Z m 7.5 12.764 C 17.888 16.11 15.13 17.0 12.0 17.0 s -5.888 -0.889 -7.5 -2.236 V 17.0 c 0.0 0.589 0.447 1.437 1.864 2.225 C 7.731 19.984 9.721 20.5 12.0 20.5 c 2.28 0.0 4.27 -0.516 5.636 -1.275 C 19.053 18.437 19.5 17.589 19.5 17.0 v -2.236 Z m 0.0 -5.0 C 17.888 11.11 15.13 12.0 12.0 12.0 s -5.888 -0.889 -7.5 -2.236 V 12.0 c 0.0 0.589 0.447 1.437 1.864 2.225 C 7.731 14.984 9.721 15.5 12.0 15.5 c 2.28 0.0 4.27 -0.516 5.636 -1.275 C 19.053 13.437 19.5 12.589 19.5 12.0 V 9.764 Z M 12.0 3.5 c -2.28 0.0 -4.27 0.516 -5.636 1.275 C 4.947 5.563 4.5 6.411 4.5 7.0 c 0.0 0.589 0.447 1.437 1.864 2.225 C 7.731 9.984 9.721 10.5 12.0 10.5 c 2.28 0.0 4.27 -0.516 5.636 -1.275 C 19.053 8.437 19.5 7.589 19.5 7.0 c 0.0 -0.589 -0.447 -1.437 -1.864 -2.225 C 16.269 4.016 14.279 3.5 12.0 3.5 Z")
        )
    }.build()
}

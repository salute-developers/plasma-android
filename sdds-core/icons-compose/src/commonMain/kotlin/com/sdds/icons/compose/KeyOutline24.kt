package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 9.0 C 17.328 9.0 18.0 8.328 18.0 7.5 S 17.328 6.0 16.5 6.0 S 15.0 6.672 15.0 7.5 S 15.672 9.0 16.5 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 8.5 C 22.0 4.91 19.09 2.0 15.5 2.0 S 9.0 4.91 9.0 8.5 c 0.0 0.376 0.032 0.744 0.093 1.103 l -6.742 6.743 c -0.188 0.188 -0.293 0.442 -0.293 0.707 v 3.89 c 0.0 0.552 0.447 1.0 1.0 1.0 H 6.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 19.0 h 2.25 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -1.25 h 1.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -1.064 C 14.13 14.89 14.803 15.0 15.5 15.0 c 3.59 0.0 6.5 -2.91 6.5 -6.5 Z m -6.5 -5.0 c 2.761 0.0 5.0 2.239 5.0 5.0 s -2.239 5.0 -5.0 5.0 c -0.737 0.0 -1.435 -0.16 -2.063 -0.444 C 12.807 12.771 12.0 13.194 12.0 13.972 v 1.278 h -1.75 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 1.25 H 7.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 1.942 H 3.558 V 17.26 l 6.851 -6.851 c 0.204 -0.204 0.285 -0.497 0.22 -0.772 C 10.546 9.272 10.5 8.892 10.5 8.5 c 0.0 -2.761 2.239 -5.0 5.0 -5.0 Z")
        )
    }.build()
}

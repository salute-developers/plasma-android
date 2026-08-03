package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.375 15.5 c 1.174 0.0 2.125 0.951 2.125 2.125 v 6.75 c 0.0 1.174 -0.951 2.125 -2.125 2.125 h -6.75 c -1.174 0.0 -2.125 -0.951 -2.125 -2.125 V 22.0 h 3.25 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 15.5 h 2.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.375 9.5 c 1.174 0.0 2.125 0.951 2.125 2.125 v 6.75 c 0.0 1.174 -0.951 2.125 -2.125 2.125 h -6.75 c -1.174 0.0 -2.125 -0.951 -2.125 -2.125 v -6.75 c 0.0 -1.174 0.951 -2.125 2.125 -2.125 h 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.75 3.0 C 31.993 3.0 33.0 4.007 33.0 5.25 c 0.0 0.883 -0.51 1.644 -1.25 2.013 v 21.473 l 0.072 0.035 C 32.524 29.152 33.0 29.896 33.0 30.75 c 0.0 1.243 -1.007 2.25 -2.25 2.25 c -0.854 0.0 -1.598 -0.476 -1.979 -1.178 l -0.035 -0.072 H 7.264 l -0.035 0.072 C 6.848 32.524 6.104 33.0 5.25 33.0 C 4.007 33.0 3.0 31.993 3.0 30.75 c 0.0 -0.854 0.476 -1.598 1.178 -1.979 l 0.072 -0.035 V 7.263 C 3.51 6.894 3.0 6.133 3.0 5.25 C 3.0 4.007 4.007 3.0 5.25 3.0 c 0.883 0.0 1.645 0.51 2.014 1.25 h 21.472 C 29.105 3.51 29.867 3.0 30.75 3.0 Z M 7.264 6.25 C 7.045 6.689 6.689 7.044 6.25 7.263 v 21.473 l 0.072 0.035 c 0.383 0.208 0.699 0.524 0.907 0.907 l 0.035 0.072 h 21.472 l 0.035 -0.072 c 0.208 -0.383 0.524 -0.699 0.907 -0.907 l 0.072 -0.035 V 7.263 c -0.439 -0.219 -0.795 -0.574 -1.014 -1.013 H 7.264 Z")
        )
    }.build()
}

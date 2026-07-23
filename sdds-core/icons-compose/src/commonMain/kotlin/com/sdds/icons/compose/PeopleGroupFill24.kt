package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.0 8.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 s -1.79 4.0 -4.0 4.0 s -4.0 -1.79 -4.0 -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.07 15.282 C 4.77 14.156 6.81 13.5 9.0 13.5 c 2.19 0.0 4.23 0.656 5.93 1.782 c 0.719 0.476 1.07 1.283 1.07 2.072 C 16.0 18.815 14.815 20.0 13.354 20.0 H 4.646 C 3.185 20.0 2.0 18.815 2.0 17.354 c 0.0 -0.789 0.351 -1.596 1.07 -2.072 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.083 7.417 c -1.61 0.0 -2.916 1.306 -2.916 2.916 c 0.0 1.611 1.306 2.917 2.916 2.917 c 1.611 0.0 2.917 -1.306 2.917 -2.917 c 0.0 -1.61 -1.306 -2.916 -2.917 -2.916 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.083 13.75 c -0.718 0.0 -1.412 0.102 -2.07 0.293 C 16.202 14.736 17.0 16.025 17.0 17.5 c 0.0 0.375 -0.052 0.739 -0.148 1.083 h 3.134 c 1.112 0.0 2.014 -0.901 2.014 -2.014 c 0.0 -0.596 -0.266 -1.219 -0.826 -1.59 c -1.173 -0.777 -2.58 -1.229 -4.09 -1.229 Z")
        )
    }.build()
}

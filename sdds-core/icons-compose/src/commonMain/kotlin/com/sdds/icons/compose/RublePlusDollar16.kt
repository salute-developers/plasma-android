package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RublePlusDollar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RublePlusDollar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.356 1.4 c 0.194 0.197 0.19 0.513 -0.006 0.707 l -12.0 11.784 c -0.197 0.194 -0.513 0.19 -0.707 -0.006 c -0.193 -0.197 -0.19 -0.514 0.007 -0.707 l 12.0 -11.785 c 0.196 -0.193 0.513 -0.19 0.706 0.007 Z M 2.591 1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.03 c 1.163 0.0 2.106 0.943 2.106 2.107 c 0.0 1.164 -0.943 2.107 -2.107 2.107 H 3.59 v 0.785 H 4.91 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 3.591 v 0.572 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 7.249 H 2.0 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.59 V 5.464 H 2.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.59 V 1.75 Z m 1.0 2.714 h 1.53 c 0.61 0.0 1.106 -0.496 1.106 -1.107 S 5.731 2.25 5.12 2.25 H 3.59 v 2.214 Z m 9.126 2.642 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 0.575 C 10.804 7.74 10.081 8.5 10.081 9.428 c 0.0 0.966 0.784 1.75 1.75 1.75 h 0.773 c 0.414 0.0 0.75 0.335 0.75 0.75 c 0.0 0.413 -0.336 0.75 -0.75 0.75 h -1.66 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.275 0.224 0.5 0.5 0.5 h 0.773 v 0.57 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 v -0.574 c 0.914 -0.059 1.637 -0.818 1.637 -1.747 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 H 11.83 c -0.414 0.0 -0.75 -0.335 -0.75 -0.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.659 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 h -0.773 v -0.57 Z")
        )
    }.build()
}

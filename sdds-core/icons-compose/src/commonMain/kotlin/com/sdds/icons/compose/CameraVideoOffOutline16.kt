package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.352 3.356 c 0.196 -0.195 0.198 -0.511 0.004 -0.708 c -0.194 -0.196 -0.511 -0.198 -0.707 -0.004 l -2.187 2.163 C 10.149 4.163 9.488 3.72 8.724 3.72 H 2.931 C 1.865 3.719 1.0 4.584 1.0 5.65 v 4.638 c 0.0 1.066 0.865 1.931 1.931 1.931 h 0.037 l -1.32 1.305 c -0.196 0.194 -0.198 0.51 -0.003 0.707 c 0.194 0.197 0.51 0.198 0.707 0.004 l 11.0 -10.88 Z m -9.373 7.863 l 5.675 -5.613 C 9.631 5.112 9.224 4.72 8.724 4.72 H 2.931 C 2.417 4.719 2.0 5.136 2.0 5.65 v 4.638 c 0.0 0.514 0.417 0.931 0.931 0.931 h 1.048 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.724 11.219 H 6.557 l -1.05 1.0 h 3.217 c 1.067 0.0 1.931 -0.865 1.931 -1.931 V 7.316 l -1.0 0.952 v 2.02 c 0.0 0.514 -0.417 0.931 -0.93 0.931 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.892 -1.14 -0.468 l -2.264 2.29 c -0.25 0.252 -0.257 0.657 -0.017 0.919 l 2.263 2.468 C 14.252 11.28 15.0 10.99 15.0 10.382 V 5.623 Z")
        )
    }.build()
}

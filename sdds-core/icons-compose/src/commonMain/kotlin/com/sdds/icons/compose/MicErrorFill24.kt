package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 0.297 0.0 0.585 0.04 0.86 0.114 C 11.134 3.283 10.0 5.259 10.0 7.5 c 0.0 3.047 2.097 5.605 4.926 6.308 C 14.301 14.828 13.224 15.5 12.0 15.5 c -1.933 0.0 -3.5 -1.679 -3.5 -3.75 v -6.0 C 8.5 3.679 10.067 2.0 12.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.41 15.697 c 0.544 -0.477 0.979 -1.056 1.284 -1.7 c 0.594 -0.017 1.168 -0.114 1.712 -0.281 c -0.364 1.196 -1.056 2.275 -2.007 3.109 c -1.042 0.914 -2.335 1.48 -3.7 1.633 v 2.292 c 0.0 0.414 -0.336 0.75 -0.75 0.75 c -0.415 0.0 -0.75 -0.336 -0.75 -0.75 v -2.292 c -1.366 -0.152 -2.659 -0.72 -3.7 -1.633 c -1.232 -1.08 -2.029 -2.57 -2.242 -4.194 c -0.055 -0.41 0.235 -0.787 0.645 -0.841 c 0.41 -0.054 0.788 0.235 0.842 0.645 c 0.166 1.263 0.786 2.422 1.743 3.262 C 9.445 16.537 10.675 17.0 11.95 17.0 c 1.273 0.0 2.504 -0.463 3.461 -1.303 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 7.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 11.0 10.538 11.0 7.5 S 13.462 2.0 16.5 2.0 S 22.0 4.462 22.0 7.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 16.5 6.793 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 17.207 7.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 16.5 8.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 15.793 7.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Cutlery24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Cutlery24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.75 3.0 C 8.164 3.0 8.5 3.336 8.5 3.75 v 6.96 c 0.11 -0.002 0.206 -0.006 0.293 -0.012 c 0.24 -0.016 0.358 -0.046 0.435 -0.078 c 0.307 -0.127 0.55 -0.37 0.677 -0.676 c 0.032 -0.078 0.061 -0.195 0.078 -0.435 C 10.0 9.26 10.0 8.94 10.0 8.465 V 3.75 C 10.0 3.336 10.336 3.0 10.75 3.0 s 0.75 0.336 0.75 0.75 v 4.74 c 0.0 0.445 0.0 0.816 -0.02 1.12 c -0.022 0.318 -0.07 0.617 -0.19 0.908 c -0.278 0.673 -0.814 1.209 -1.488 1.488 c -0.29 0.12 -0.59 0.167 -0.907 0.188 c -0.12 0.009 -0.253 0.014 -0.395 0.017 v 8.038 C 8.5 20.664 8.164 21.0 7.75 21.0 S 7.0 20.664 7.0 20.25 v -8.038 c -0.143 -0.003 -0.274 -0.008 -0.395 -0.017 c -0.317 -0.021 -0.617 -0.068 -0.907 -0.188 c -0.674 -0.28 -1.21 -0.815 -1.489 -1.488 c -0.12 -0.29 -0.167 -0.59 -0.188 -0.907 C 4.0 9.306 4.0 8.935 4.0 8.49 V 3.75 C 4.0 3.336 4.336 3.0 4.75 3.0 S 5.5 3.336 5.5 3.75 v 4.715 c 0.0 0.477 0.0 0.796 0.017 1.044 c 0.017 0.24 0.046 0.357 0.078 0.435 c 0.127 0.306 0.37 0.55 0.677 0.676 c 0.077 0.032 0.194 0.062 0.435 0.078 C 6.794 10.704 6.89 10.708 7.0 10.71 V 3.75 C 7.0 3.336 7.336 3.0 7.75 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.248 3.0 h -0.496 c -1.519 0.0 -2.75 1.231 -2.75 2.75 v 7.979 c 0.0 1.435 1.098 2.61 2.495 2.739 v 3.782 c 0.0 0.414 0.336 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.336 0.75 -0.75 V 3.75 c 0.0 -0.199 -0.078 -0.39 -0.219 -0.53 C 17.638 3.08 17.447 3.0 17.248 3.0 Z")
        )
    }.build()
}

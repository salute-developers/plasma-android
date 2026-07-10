package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.065 1.75 c -0.08 0.0 -0.167 0.0 -0.242 0.006 c -0.086 0.007 -0.196 0.023 -0.31 0.079 C 2.359 1.909 2.23 2.028 2.145 2.177 c -0.063 0.11 -0.087 0.219 -0.1 0.303 c -0.011 0.075 -0.018 0.161 -0.023 0.241 L 1.759 6.387 C 1.629 8.2 2.93 9.765 4.674 10.02 v 2.864 C 3.371 13.0 2.382 13.569 2.382 14.253 h 5.584 c 0.0 -0.684 -0.989 -1.252 -2.292 -1.37 V 10.02 C 7.417 9.765 8.72 8.2 8.59 6.387 L 8.326 2.721 c -0.005 -0.08 -0.011 -0.166 -0.023 -0.24 c -0.013 -0.085 -0.037 -0.194 -0.1 -0.304 c -0.086 -0.149 -0.214 -0.268 -0.368 -0.342 c -0.114 -0.056 -0.224 -0.072 -0.31 -0.08 C 7.45 1.75 7.363 1.75 7.283 1.75 H 3.065 Z m -0.043 1.0 h 4.304 l 0.266 3.709 c 0.1 1.403 -1.011 2.597 -2.418 2.597 c -1.407 0.0 -2.518 -1.194 -2.418 -2.597 L 3.022 2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.13 3.142 c -0.086 0.0 -0.178 0.0 -0.257 0.006 c -0.09 0.007 -0.206 0.025 -0.326 0.086 c -0.16 0.082 -0.29 0.212 -0.371 0.372 c -0.061 0.12 -0.079 0.236 -0.086 0.325 c -0.007 0.08 -0.007 0.17 -0.007 0.257 v 5.19 c 0.0 0.97 0.669 1.785 1.57 2.009 V 12.9 c -0.914 0.15 -1.593 0.698 -1.593 1.352 h 4.188 c 0.0 -0.654 -0.68 -1.203 -1.594 -1.352 v -1.514 c 0.902 -0.224 1.57 -1.039 1.57 -2.01 v -5.19 c 0.0 -0.085 0.0 -0.177 -0.006 -0.256 c -0.008 -0.09 -0.026 -0.206 -0.087 -0.325 c -0.081 -0.16 -0.211 -0.29 -0.371 -0.372 c -0.12 -0.06 -0.236 -0.079 -0.325 -0.086 c -0.08 -0.007 -0.171 -0.006 -0.257 -0.006 h -2.049 Z m -0.047 1.0 h 2.141 v 5.235 c 0.0 0.591 -0.48 1.07 -1.07 1.07 c -0.591 0.0 -1.07 -0.479 -1.07 -1.07 V 4.142 Z")
        )
    }.build()
}

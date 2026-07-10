package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankXmlFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankXmlFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 2.007 V 5.55 c 0.0 0.547 -0.001 1.004 0.03 1.375 c 0.03 0.38 0.098 0.736 0.27 1.073 c 0.263 0.517 0.684 0.939 1.202 1.202 c 0.337 0.172 0.693 0.24 1.073 0.27 c 0.371 0.031 0.828 0.03 1.375 0.03 h 3.543 C 20.0 9.655 20.0 9.82 20.0 10.003 v 7.278 c 0.0 0.674 0.0 1.225 -0.036 1.672 c -0.038 0.463 -0.12 0.882 -0.319 1.273 c -0.311 0.611 -0.808 1.108 -1.42 1.42 c -0.39 0.199 -0.809 0.28 -1.272 0.318 C 16.506 22.0 15.955 22.0 15.281 22.0 H 8.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.036 c -0.463 -0.038 -0.882 -0.12 -1.273 -0.319 c -0.61 -0.311 -1.108 -0.808 -1.42 -1.42 c -0.199 -0.39 -0.28 -0.809 -0.318 -1.272 C 4.0 18.506 4.0 17.955 4.0 17.281 V 6.72 c 0.0 -0.674 0.0 -1.225 0.036 -1.672 c 0.038 -0.463 0.12 -0.882 0.318 -1.273 c 0.312 -0.61 0.81 -1.108 1.42 -1.42 c 0.391 -0.199 0.81 -0.28 1.273 -0.318 C 7.494 2.0 8.045 2.0 8.719 2.0 h 3.278 c 0.183 0.0 0.348 0.0 0.503 0.007 Z M 8.045 16.415 L 7.07 18.2 h 0.9 l 0.59 -1.175 l 0.58 1.175 h 0.93 l -0.975 -1.8 l 0.925 -1.7 H 9.13 l -0.55 1.09 l -0.55 -1.09 H 7.12 l 0.925 1.715 Z m 2.499 1.785 h 0.75 v -1.95 c 0.0 -0.1 -0.003 -0.183 -0.01 -0.25 l -0.014 -0.25 h 0.02 l 0.044 0.135 c 0.013 0.036 0.025 0.075 0.035 0.115 c 0.014 0.037 0.027 0.075 0.04 0.115 l 0.056 0.135 l 0.48 1.25 h 0.65 l 0.48 -1.25 c 0.02 -0.05 0.036 -0.095 0.049 -0.135 l 0.08 -0.23 l 0.045 -0.135 h 0.02 c -0.01 0.1 -0.017 0.183 -0.02 0.25 c -0.003 0.067 -0.005 0.15 -0.005 0.25 v 1.95 h 0.75 v -3.5 h -0.97 l -0.74 1.925 l -0.74 -1.925 h -1.0 v 3.5 Z m 4.248 0.0 h 2.15 v -0.7 h -1.37 v -2.8 h -0.78 v 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 2.503 c 0.22 0.159 0.422 0.358 0.666 0.602 l 4.229 4.229 C 19.139 7.578 19.338 7.78 19.497 8.0 H 16.45 c -0.572 0.0 -0.957 0.0 -1.253 -0.024 c -0.287 -0.024 -0.424 -0.067 -0.514 -0.113 c -0.236 -0.12 -0.426 -0.31 -0.546 -0.546 c -0.046 -0.09 -0.09 -0.227 -0.113 -0.514 C 14.0 6.507 14.0 6.123 14.0 5.55 V 2.503 Z")
        )
    }.build()
}

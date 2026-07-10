package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.547 10.216 V 6.97 L 3.29 8.023 v 0.001 l 3.534 2.133 c 0.557 0.336 0.735 0.435 0.911 0.474 c 0.174 0.039 0.354 0.039 0.528 0.0 c 0.177 -0.039 0.354 -0.138 0.911 -0.474 l 3.534 -2.133 V 8.023 l 2.537 -1.53 c 0.16 -0.097 0.256 -0.27 0.254 -0.457 c -0.002 -0.186 -0.102 -0.358 -0.262 -0.451 L 9.585 2.316 C 9.143 2.061 8.822 1.874 8.47 1.8 c -0.31 -0.067 -0.63 -0.067 -0.94 0.0 c -0.352 0.074 -0.673 0.26 -1.115 0.516 L 0.762 5.585 C 0.6 5.679 0.5 5.853 0.5 6.041 v 4.175 c 0.0 0.29 0.234 0.526 0.523 0.526 c 0.29 0.0 0.524 -0.236 0.524 -0.526 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.71 9.25 l -3.062 1.848 c -0.458 0.276 -0.791 0.478 -1.158 0.559 c -0.323 0.07 -0.657 0.07 -0.98 0.0 c -0.367 -0.081 -0.7 -0.283 -1.158 -0.56 L 3.291 9.252 v 2.922 c 0.0 0.154 0.067 0.3 0.184 0.4 C 4.732 13.653 6.335 14.25 8.0 14.25 c 1.665 0.0 3.268 -0.598 4.525 -1.676 c 0.117 -0.1 0.184 -0.247 0.184 -0.4 V 9.25 Z")
        )
    }.build()
}

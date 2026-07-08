package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.254 4.5 c -0.173 0.0 -0.356 0.0 -0.514 0.012 c -0.178 0.015 -0.404 0.049 -0.638 0.162 C 5.784 4.827 5.52 5.073 5.345 5.378 c -0.13 0.226 -0.18 0.449 -0.207 0.626 c -0.024 0.157 -0.037 0.34 -0.05 0.512 L 4.52 14.462 c -0.28 3.91 2.546 7.281 6.318 7.794 v 6.266 c -2.866 0.238 -5.05 1.479 -5.05 2.973 h 12.1 c 0.0 -1.495 -2.184 -2.735 -5.05 -2.973 v -6.266 c 3.771 -0.513 6.598 -3.885 6.317 -7.794 l -0.57 -7.946 c -0.012 -0.173 -0.025 -0.355 -0.049 -0.512 c -0.026 -0.177 -0.077 -0.4 -0.206 -0.626 c -0.176 -0.305 -0.44 -0.55 -0.757 -0.704 c -0.234 -0.113 -0.46 -0.147 -0.639 -0.162 C 16.775 4.5 16.593 4.5 16.42 4.5 H 7.254 Z M 7.082 6.686 L 7.096 6.5 H 7.28 h 9.111 h 0.186 l 0.014 0.186 l 0.568 7.92 c 0.221 3.089 -2.226 5.717 -5.323 5.717 c -3.098 0.0 -5.544 -2.628 -5.323 -5.718 l 0.568 -7.92 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.732 7.514 c -0.185 0.0 -0.38 0.0 -0.546 0.013 C 24.0 7.543 23.76 7.58 23.516 7.705 c -0.33 0.167 -0.597 0.435 -0.765 0.764 c -0.125 0.245 -0.162 0.484 -0.177 0.67 C 22.56 9.308 22.56 9.5 22.56 9.687 v 11.248 c 0.0 2.088 1.454 3.836 3.404 4.29 v 3.33 c -2.025 0.303 -3.538 1.505 -3.538 2.941 h 9.076 c 0.0 -1.436 -1.513 -2.638 -3.538 -2.94 v -3.332 c 1.95 -0.453 3.403 -2.201 3.403 -4.29 V 9.686 c 0.0 -0.185 0.0 -0.378 -0.013 -0.545 c -0.016 -0.187 -0.053 -0.426 -0.177 -0.67 c -0.168 -0.33 -0.436 -0.598 -0.765 -0.765 c -0.245 -0.125 -0.484 -0.162 -0.67 -0.178 c -0.167 -0.013 -0.361 -0.013 -0.546 -0.013 h -4.464 Z m -0.172 2.2 v -0.2 h 0.2 h 4.407 h 0.2 v 0.2 v 11.22 c 0.0 1.327 -1.076 2.403 -2.403 2.403 c -1.328 0.0 -2.404 -1.076 -2.404 -2.403 V 9.714 Z")
        )
    }.build()
}

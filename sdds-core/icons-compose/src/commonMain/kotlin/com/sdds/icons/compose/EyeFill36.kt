package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.046 15.478 C 6.136 10.393 11.678 7.0 18.0 7.0 c 6.323 0.0 11.863 3.393 14.954 8.478 l 0.023 0.038 c 0.3 0.492 0.54 0.887 0.69 1.569 c 0.064 0.286 0.083 0.631 0.083 0.915 c 0.0 0.284 -0.02 0.63 -0.083 0.915 c -0.15 0.683 -0.39 1.077 -0.69 1.57 l -0.023 0.037 C 29.864 25.607 24.323 29.0 18.0 29.0 c -6.322 0.0 -11.863 -3.393 -14.954 -8.478 l -0.023 -0.038 c -0.3 -0.492 -0.54 -0.887 -0.69 -1.569 C 2.269 18.63 2.25 18.284 2.25 18.0 c 0.0 -0.284 0.02 -0.63 0.083 -0.915 c 0.15 -0.683 0.39 -1.077 0.69 -1.57 l 0.023 -0.037 Z M 9.407 18.0 c 0.0 -4.818 3.847 -8.724 8.593 -8.724 s 8.593 3.906 8.593 8.724 s -3.847 8.724 -8.593 8.724 S 9.407 22.818 9.407 18.0 Z M 18.0 24.069 c 3.302 0.0 5.978 -2.717 5.978 -6.069 S 21.302 11.931 18.0 11.931 c -3.301 0.0 -5.978 2.717 -5.978 6.069 S 14.7 24.069 18.0 24.069 Z")
        )
    }.build()
}

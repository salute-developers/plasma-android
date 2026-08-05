package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HomeAltFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HomeAltFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.662 1.973 c -0.436 -0.098 -0.888 -0.098 -1.324 0.0 c -0.495 0.112 -0.943 0.391 -1.537 0.76 L 3.966 6.362 c -0.535 0.332 -0.939 0.583 -1.24 0.934 C 2.46 7.604 2.26 7.963 2.137 8.352 C 1.999 8.792 2.0 9.268 2.0 9.898 v 6.783 c 0.0 0.604 0.0 1.102 0.033 1.508 c 0.035 0.422 0.109 0.81 0.294 1.173 c 0.288 0.565 0.747 1.024 1.311 1.311 c 0.364 0.186 0.752 0.26 1.173 0.294 C 5.217 21.0 5.715 21.0 6.32 21.0 h 11.362 c 0.604 0.0 1.102 0.0 1.508 -0.033 c 0.421 -0.034 0.81 -0.108 1.173 -0.294 c 0.565 -0.287 1.024 -0.746 1.311 -1.31 c 0.186 -0.365 0.26 -0.752 0.294 -1.174 C 22.0 17.783 22.0 17.285 22.0 16.681 V 9.898 c 0.0 -0.63 0.0 -1.105 -0.138 -1.546 c -0.122 -0.389 -0.322 -0.748 -0.587 -1.057 c -0.302 -0.351 -0.706 -0.602 -1.241 -0.934 l -5.835 -3.627 c -0.594 -0.37 -1.042 -0.649 -1.537 -0.76 Z M 15.0 11.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 5.5 h 6.0 V 14.0 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 Z")
        )
    }.build()
}

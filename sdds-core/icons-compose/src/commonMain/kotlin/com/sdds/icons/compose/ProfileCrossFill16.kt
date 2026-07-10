package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCrossFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCrossFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.926 4.975 c 0.0 1.643 -1.332 2.975 -2.975 2.975 S 4.976 6.618 4.976 4.975 S 6.308 2.0 7.95 2.0 s 2.975 1.332 2.975 2.975 Z M 8.102 14.25 C 7.72 13.588 7.5 12.82 7.5 12.0 c 0.0 -0.986 0.317 -1.899 0.856 -2.64 C 8.22 9.352 8.086 9.35 7.95 9.35 c -2.025 0.0 -3.906 0.698 -5.464 1.894 C 2.165 11.49 1.988 11.879 2.0 12.284 c 0.014 0.461 0.056 0.761 0.183 1.01 c 0.168 0.33 0.436 0.598 0.765 0.765 c 0.374 0.191 0.864 0.191 1.844 0.191 h 3.31 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.136 -0.357 -0.136 -0.494 0.0 c -0.137 0.137 -0.137 0.358 0.0 0.495 L 11.505 12.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.136 0.36 0.136 0.496 0.0 L 12.0 12.495 l 1.198 1.199 c 0.137 0.136 0.359 0.136 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 12.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.136 -0.359 -0.136 -0.496 0.0 L 12.0 11.505 l -1.2 -1.199 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePlusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePlusFill16",
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
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 0.35 -5.795 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.695 H 9.955 c -0.194 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.194 0.156 0.35 0.35 0.35 h 1.695 v 1.696 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -1.695 h 1.696 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 H 12.35 V 9.954 Z")
        )
    }.build()
}

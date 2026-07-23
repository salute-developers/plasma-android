package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FloorTypeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FloorTypeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.259 9.894 c 0.183 -0.095 0.41 -0.025 0.506 0.159 c 0.095 0.183 0.025 0.41 -0.159 0.505 L 8.49 13.755 c -0.281 0.147 -0.61 0.166 -0.904 0.055 l -0.124 -0.055 l -6.117 -3.197 l -0.064 -0.04 c -0.135 -0.11 -0.178 -0.305 -0.094 -0.465 C 1.27 9.892 1.453 9.818 1.62 9.866 l 0.07 0.028 L 7.81 13.09 l 0.08 0.03 c 0.085 0.021 0.174 0.01 0.253 -0.03 l 6.117 -3.196 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.623 2.593 c 0.22 -0.12 0.485 -0.12 0.704 0.0 L 14.56 5.99 c 0.05 0.028 0.087 0.066 0.118 0.107 c 0.152 0.086 0.255 0.246 0.256 0.433 V 8.21 c 0.0 0.164 -0.082 0.31 -0.204 0.4 c -0.032 0.058 -0.08 0.11 -0.145 0.146 l -0.545 0.296 l -5.712 3.116 l -0.085 0.04 c -0.172 0.067 -0.363 0.067 -0.535 0.0 l -0.084 -0.04 L 1.38 8.764 C 1.316 8.729 1.268 8.679 1.236 8.623 c -0.131 -0.09 -0.218 -0.24 -0.218 -0.412 V 6.527 c 0.0 -0.189 0.105 -0.352 0.26 -0.437 c 0.03 -0.039 0.067 -0.073 0.114 -0.099 l 6.231 -3.398 Z m -5.605 5.35 l 1.652 0.86 l 0.936 0.463 l 2.87 1.565 V 9.953 L 2.018 6.976 v 0.966 Z m 6.458 2.01 v 0.877 l 2.862 -1.562 l 0.941 -0.465 l 1.654 -0.937 v -0.89 L 8.476 9.953 Z M 5.964 7.99 l 2.01 1.097 L 9.25 8.39 l -2.02 -1.104 L 5.964 7.99 Z m 2.04 -1.135 l 2.028 1.109 l 3.028 -1.65 l -2.058 -1.124 l -2.997 1.665 Z M 2.89 6.313 l 2.296 1.252 L 8.128 5.93 L 5.863 4.69 L 2.89 6.313 Z m 3.757 -2.05 l 2.257 1.235 l 1.32 -0.733 L 7.975 3.54 l -1.33 0.724 Z")
        )
    }.build()
}

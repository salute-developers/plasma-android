package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.105 0.898 c 0.194 0.196 0.193 0.513 -0.003 0.707 l -2.5 2.478 C 1.406 4.278 1.089 4.276 0.895 4.08 C 0.7 3.884 0.702 3.568 0.898 3.373 l 2.5 -2.478 C 3.594 0.7 3.91 0.702 4.105 0.898 Z m 7.79 0.0 c 0.194 -0.196 0.51 -0.197 0.707 -0.003 l 2.5 2.478 c 0.195 0.195 0.197 0.511 0.002 0.707 c -0.194 0.196 -0.51 0.198 -0.707 0.003 l -2.5 -2.478 c -0.196 -0.194 -0.197 -0.51 -0.003 -0.707 Z M 3.868 12.74 l -1.351 1.339 c -0.196 0.194 -0.513 0.193 -0.707 -0.003 c -0.194 -0.196 -0.193 -0.513 0.003 -0.707 l 1.345 -1.333 c -0.95 -1.102 -1.522 -2.532 -1.522 -4.095 c 0.0 -3.484 2.849 -6.308 6.363 -6.308 c 3.515 0.0 6.364 2.824 6.364 6.308 c 0.0 1.742 -0.712 3.318 -1.863 4.46 l 0.977 0.968 c 0.196 0.194 0.197 0.51 0.003 0.707 c -0.195 0.196 -0.511 0.197 -0.707 0.003 l -1.039 -1.03 c -1.049 0.756 -2.34 1.2 -3.735 1.2 c -1.576 0.0 -3.02 -0.568 -4.131 -1.51 Z m 3.602 -8.277 c 0.276 0.0 0.5 0.224 0.5 0.5 v 3.004 h 1.974 c 0.277 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.223 0.5 -0.5 0.5 h -2.3 c -0.372 0.0 -0.674 -0.302 -0.674 -0.675 v -3.33 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}

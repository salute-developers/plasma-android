package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraPhotoFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraPhotoFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.419 2.25 H 8.58 c 0.374 0.0 0.686 0.0 0.941 0.02 c 0.266 0.022 0.516 0.068 0.752 0.186 c 0.362 0.18 0.657 0.47 0.841 0.825 c 0.093 0.179 0.19 0.318 0.287 0.408 c 0.09 0.083 0.158 0.106 0.223 0.106 h 0.072 c 0.471 0.0 0.857 0.0 1.17 0.025 c 0.324 0.026 0.617 0.081 0.89 0.218 c 0.429 0.214 0.777 0.555 0.995 0.975 c 0.14 0.268 0.196 0.556 0.222 0.874 C 15.0 6.194 15.0 6.572 15.0 7.034 v 3.476 c 0.0 0.463 0.0 0.84 -0.026 1.148 c -0.026 0.318 -0.083 0.605 -0.222 0.874 c -0.218 0.42 -0.566 0.76 -0.994 0.975 c -0.274 0.136 -0.567 0.192 -0.89 0.218 c -0.314 0.025 -0.7 0.025 -1.171 0.025 H 4.303 c -0.471 0.0 -0.857 0.0 -1.17 -0.025 c -0.324 -0.026 -0.617 -0.082 -0.89 -0.218 c -0.429 -0.214 -0.777 -0.556 -0.995 -0.975 c -0.14 -0.269 -0.196 -0.556 -0.222 -0.874 C 1.0 11.351 1.0 10.973 1.0 10.51 V 7.034 c 0.0 -0.462 0.0 -0.84 0.026 -1.147 c 0.026 -0.318 0.083 -0.606 0.222 -0.874 c 0.218 -0.42 0.566 -0.761 0.994 -0.975 c 0.274 -0.137 0.567 -0.192 0.89 -0.218 c 0.314 -0.025 0.7 -0.025 1.171 -0.025 h 0.072 c 0.065 0.0 0.134 -0.023 0.223 -0.106 c 0.098 -0.09 0.194 -0.23 0.287 -0.408 c 0.184 -0.355 0.479 -0.644 0.841 -0.825 c 0.236 -0.118 0.486 -0.164 0.752 -0.186 c 0.255 -0.02 0.567 -0.02 0.94 -0.02 Z M 7.95 6.183 c -1.243 0.0 -2.25 1.007 -2.25 2.25 c 0.0 1.242 1.007 2.25 2.25 2.25 s 2.25 -1.008 2.25 -2.25 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 Z M 4.7 8.433 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 s 3.25 1.455 3.25 3.25 s -1.455 3.25 -3.25 3.25 s -3.25 -1.455 -3.25 -3.25 Z m 8.2 -1.892 c 0.387 0.0 0.7 -0.307 0.7 -0.686 c 0.0 -0.38 -0.313 -0.687 -0.7 -0.687 c -0.387 0.0 -0.7 0.307 -0.7 0.687 c 0.0 0.379 0.313 0.686 0.7 0.686 Z")
        )
    }.build()
}

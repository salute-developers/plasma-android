package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeClosedFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeClosedFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.749 4.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 6.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 3.436 -3.437 c -2.307 -1.459 -4.257 -3.444 -5.683 -5.79 l -0.023 -0.038 c -0.299 -0.492 -0.539 -0.887 -0.69 -1.57 C 2.27 18.63 2.25 18.285 2.25 18.0 c 0.0 -0.284 0.02 -0.63 0.083 -0.915 c 0.151 -0.682 0.391 -1.077 0.69 -1.57 l 0.023 -0.038 C 6.136 10.393 11.678 7.0 18.0 7.0 c 2.905 0.0 5.644 0.717 8.057 1.984 l 4.692 -4.691 Z M 18.0 9.275 c -4.746 0.0 -8.593 3.907 -8.593 8.725 c 0.0 2.14 0.759 4.099 2.018 5.616 l 1.873 -1.873 c -0.798 -1.031 -1.275 -2.33 -1.275 -3.743 c 0.0 -3.352 2.676 -6.07 5.977 -6.07 c 1.424 0.0 2.73 0.509 3.758 1.353 l 1.872 -1.872 c -1.508 -1.33 -3.476 -2.136 -5.63 -2.136 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.38 11.25 c 1.398 1.208 2.606 2.636 3.574 4.228 l 0.023 0.037 c 0.299 0.493 0.539 0.888 0.69 1.57 C 33.73 17.37 33.75 17.716 33.75 18.0 c 0.0 0.284 -0.02 0.629 -0.083 0.915 c -0.151 0.682 -0.391 1.077 -0.69 1.57 l -0.023 0.036 C 29.864 25.606 24.322 29.0 18.0 29.0 c -1.915 0.0 -3.758 -0.311 -5.483 -0.887 l 2.093 -2.094 c 1.04 0.454 2.186 0.705 3.39 0.705 c 4.746 0.0 8.593 -3.906 8.593 -8.724 c 0.0 -1.175 -0.229 -2.296 -0.644 -3.32 l 3.43 -3.43 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.856 16.774 c 0.08 0.396 0.121 0.806 0.121 1.226 c 0.0 3.352 -2.676 6.068 -5.977 6.068 c -0.445 0.0 -0.879 -0.049 -1.296 -0.142 l 7.152 -7.152 Z")
        )
    }.build()
}

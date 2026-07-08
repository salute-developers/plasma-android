package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FolderPlusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FolderPlusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.877 2.5 c 0.544 0.0 0.713 0.005 0.838 0.04 C 7.077 2.64 7.36 2.924 7.46 3.285 c 0.02 0.07 0.03 0.153 0.035 0.307 H 4.36 c -1.176 0.0 -1.764 0.0 -2.213 0.229 c -0.04 0.02 -0.08 0.042 -0.118 0.064 c 0.003 -0.137 0.008 -0.254 0.016 -0.359 c 0.02 -0.231 0.054 -0.353 0.098 -0.439 c 0.103 -0.202 0.267 -0.367 0.47 -0.47 C 2.698 2.573 2.82 2.54 3.051 2.52 C 3.289 2.5 3.596 2.5 4.045 2.5 h 1.832 Z M 1.025 5.614 V 4.499 c 0.0 -0.423 0.0 -0.771 0.024 -1.054 c 0.023 -0.294 0.075 -0.561 0.203 -0.812 c 0.198 -0.39 0.516 -0.708 0.906 -0.907 C 2.41 1.598 2.677 1.547 2.97 1.523 C 3.253 1.5 3.601 1.5 4.025 1.5 H 5.95 c 0.438 0.0 0.758 0.0 1.034 0.077 c 0.698 0.196 1.243 0.74 1.438 1.438 c 0.048 0.17 0.066 0.356 0.073 0.577 h 3.144 c 1.176 0.0 1.764 0.0 2.213 0.229 c 0.396 0.201 0.717 0.522 0.918 0.917 C 15.0 5.188 15.0 5.776 15.0 6.952 v 3.187 c 0.0 1.176 0.0 1.764 -0.229 2.213 c -0.201 0.396 -0.523 0.717 -0.918 0.918 c -0.449 0.23 -1.037 0.23 -2.213 0.23 H 4.36 c -1.176 0.0 -1.764 0.0 -2.213 -0.23 c -0.396 -0.201 -0.717 -0.522 -0.918 -0.918 C 1.0 11.903 1.0 11.315 1.0 10.14 V 6.952 c 0.0 -0.565 0.0 -0.995 0.025 -1.338 Z M 8.0 5.72 c 0.29 0.0 0.525 0.235 0.525 0.525 V 8.02 h 1.75 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -1.75 v 1.775 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 9.07 h -1.75 C 5.435 9.07 5.2 8.836 5.2 8.546 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 1.75 V 6.246 C 7.475 5.956 7.71 5.72 8.0 5.72 Z")
        )
    }.build()
}

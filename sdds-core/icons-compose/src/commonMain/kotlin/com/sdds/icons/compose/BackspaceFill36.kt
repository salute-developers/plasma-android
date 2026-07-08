package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackspaceFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackspaceFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.669 7.5 c -0.805 0.0 -1.393 0.0 -1.958 0.135 c -0.5 0.12 -0.977 0.316 -1.415 0.583 c -0.496 0.303 -0.911 0.717 -1.48 1.284 l -4.358 4.34 c -0.568 0.567 -1.043 1.04 -1.4 1.458 c -0.37 0.436 -0.68 0.885 -0.855 1.425 c -0.27 0.829 -0.27 1.721 0.0 2.55 c 0.176 0.54 0.484 0.99 0.856 1.425 c 0.356 0.418 0.83 0.89 1.4 1.457 l 4.357 4.34 c 0.569 0.568 0.984 0.982 1.48 1.285 c 0.438 0.267 0.915 0.464 1.415 0.583 c 0.565 0.136 1.153 0.135 1.958 0.135 h 11.225 c 1.014 0.0 1.844 0.0 2.518 -0.055 c 0.697 -0.056 1.327 -0.178 1.916 -0.476 c 0.92 -0.468 1.67 -1.213 2.139 -2.13 c 0.3 -0.587 0.421 -1.214 0.478 -1.91 C 33.0 23.26 33.0 22.433 33.0 21.423 v -6.844 c 0.0 -1.01 0.0 -1.836 -0.055 -2.508 c -0.057 -0.694 -0.179 -1.322 -0.478 -1.908 c -0.47 -0.917 -1.218 -1.663 -2.14 -2.13 c -0.588 -0.3 -1.218 -0.42 -1.915 -0.477 C 27.738 7.5 26.908 7.5 25.894 7.5 H 14.67 Z m 2.472 5.291 c -0.392 -0.39 -1.025 -0.388 -1.414 0.003 c -0.39 0.392 -0.389 1.025 0.002 1.415 L 19.536 18.0 l -3.807 3.791 c -0.391 0.39 -0.392 1.023 -0.002 1.415 c 0.39 0.391 1.022 0.392 1.414 0.003 l 3.812 -3.798 l 3.812 3.797 c 0.391 0.39 1.024 0.389 1.414 -0.002 c 0.39 -0.392 0.388 -1.025 -0.003 -1.415 L 22.37 18.0 l 3.806 -3.791 c 0.391 -0.39 0.393 -1.023 0.003 -1.415 c -0.39 -0.391 -1.023 -0.392 -1.414 -0.003 l -3.812 3.798 l -3.812 -3.797 Z")
        )
    }.build()
}

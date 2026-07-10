package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NewsFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NewsFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.328 4.5 h 11.344 c 1.01 0.0 1.836 0.0 2.508 0.055 c 0.695 0.057 1.322 0.178 1.908 0.476 c 0.918 0.468 1.663 1.214 2.13 2.13 c 0.3 0.587 0.42 1.215 0.477 1.91 c 0.055 0.67 0.055 1.497 0.055 2.507 v 12.844 c 0.0 1.01 0.0 1.836 -0.055 2.508 c -0.057 0.695 -0.178 1.322 -0.476 1.908 c -0.468 0.918 -1.213 1.663 -2.13 2.13 c -0.587 0.3 -1.214 0.42 -1.91 0.477 c -0.67 0.055 -1.497 0.055 -2.507 0.055 H 12.328 c -1.01 0.0 -1.836 0.0 -2.508 -0.055 c -0.694 -0.057 -1.322 -0.178 -1.908 -0.476 c -0.917 -0.468 -1.663 -1.213 -2.13 -2.13 c -0.3 -0.587 -0.42 -1.214 -0.477 -1.91 c -0.055 -0.67 -0.055 -1.497 -0.055 -2.507 V 11.578 c 0.0 -1.01 0.0 -1.836 0.055 -2.508 c 0.057 -0.694 0.178 -1.322 0.476 -1.908 c 0.468 -0.917 1.214 -1.663 2.13 -2.13 c 0.587 -0.3 1.215 -0.42 1.91 -0.477 C 10.49 4.5 11.317 4.5 12.327 4.5 Z M 27.75 24.9 c 0.0 1.26 0.0 1.89 -0.245 2.372 c -0.216 0.423 -0.56 0.767 -0.983 0.983 C 26.04 28.5 25.41 28.5 24.15 28.5 h -12.3 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 C 8.25 26.79 8.25 26.16 8.25 24.9 v -9.3 c 0.0 -1.26 0.0 -1.89 0.245 -2.371 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 C 9.959 12.0 10.589 12.0 11.85 12.0 h 12.3 c 1.26 0.0 1.89 0.0 2.372 0.245 c 0.423 0.216 0.767 0.56 0.983 0.984 c 0.245 0.48 0.245 1.11 0.245 2.371 v 9.3 Z M 9.375 7.0 c -0.69 0.0 -1.25 0.56 -1.25 1.25 s 0.56 1.25 1.25 1.25 h 8.25 c 0.69 0.0 1.25 -0.56 1.25 -1.25 S 18.315 7.0 17.625 7.0 h -8.25 Z")
        )
    }.build()
}

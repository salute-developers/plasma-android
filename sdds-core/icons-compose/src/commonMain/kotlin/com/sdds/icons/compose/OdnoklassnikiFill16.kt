package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OdnoklassnikiFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OdnoklassnikiFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.306 8.8 c 0.296 -0.468 0.916 -0.609 1.385 -0.315 c 1.414 0.884 3.21 0.884 4.624 0.0 c 0.466 -0.286 1.077 -0.147 1.374 0.313 c 0.302 0.467 0.167 1.089 -0.3 1.39 c -0.614 0.386 -1.289 0.666 -1.996 0.827 l 1.92 1.92 c 0.392 0.393 0.392 1.029 0.0 1.421 c -0.393 0.392 -1.029 0.392 -1.422 0.0 L 8.004 12.47 l -1.886 1.886 c -0.389 0.367 -0.996 0.367 -1.385 0.0 c -0.404 -0.382 -0.422 -1.02 -0.04 -1.423 l 1.92 -1.92 c -0.705 -0.16 -1.38 -0.44 -1.993 -0.825 H 4.619 C 4.149 9.89 4.009 9.27 4.306 8.8 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.003 1.35 c 1.896 0.0 3.435 1.535 3.435 3.431 c 0.0 1.895 -1.536 3.432 -3.433 3.433 c -1.896 -0.002 -3.434 -1.536 -3.436 -3.43 c 0.0 -1.896 1.537 -3.434 3.434 -3.434 Z m 0.002 2.012 C 7.22 3.363 6.583 4.0 6.582 4.783 c 0.0 0.785 0.637 1.422 1.423 1.422 c 0.785 0.0 1.422 -0.636 1.422 -1.42 c 0.0 -0.786 -0.637 -1.423 -1.422 -1.423 Z")
        )
    }.build()
}

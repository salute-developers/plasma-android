package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 11.0 c 0.487 0.0 0.961 0.053 1.417 0.155 C 18.972 10.778 19.0 10.392 19.0 10.0 c 0.0 -4.418 -3.582 -8.0 -8.0 -8.0 s -8.0 3.582 -8.0 8.0 c 0.0 0.73 0.098 1.435 0.28 2.107 c 0.318 1.166 0.191 2.45 -0.116 3.619 C 3.057 16.133 3.0 16.56 3.0 17.0 c 0.0 2.761 2.239 5.0 5.0 5.0 c 1.454 0.0 2.762 -0.62 3.676 -1.61 C 11.243 19.518 11.0 18.537 11.0 17.5 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 Z m -4.289 -5.484 c -0.837 -0.413 -1.772 -0.583 -2.701 -0.492 c -0.929 0.092 -1.813 0.441 -2.554 1.01 C 7.216 6.6 6.65 7.364 6.32 8.238 c -0.328 0.873 -0.406 1.821 -0.224 2.736 c 0.182 0.916 0.617 1.762 1.255 2.443 c 0.314 0.336 0.566 0.749 0.684 1.149 c 0.115 0.394 0.087 0.72 -0.06 0.977 L 7.35 16.625 c -0.207 0.359 -0.084 0.817 0.275 1.024 c 0.359 0.208 0.817 0.085 1.025 -0.274 l 0.624 -1.081 c 0.407 -0.706 0.396 -1.48 0.2 -2.15 c -0.195 -0.664 -0.584 -1.277 -1.029 -1.751 c -0.446 -0.477 -0.75 -1.07 -0.878 -1.71 c -0.127 -0.64 -0.073 -1.304 0.157 -1.916 c 0.23 -0.611 0.627 -1.146 1.145 -1.544 c 0.519 -0.397 1.138 -0.642 1.788 -0.706 c 0.65 -0.064 1.305 0.055 1.891 0.344 c 0.586 0.289 1.08 0.736 1.424 1.29 c 0.272 0.438 0.444 0.929 0.504 1.437 c 0.048 0.412 0.421 0.706 0.833 0.657 c 0.411 -0.049 0.705 -0.422 0.656 -0.833 c -0.086 -0.726 -0.33 -1.427 -0.719 -2.052 c -0.493 -0.793 -1.198 -1.432 -2.035 -1.844 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 1.768 1.768 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 18.207 17.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 17.5 18.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 1.768 -1.768 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}

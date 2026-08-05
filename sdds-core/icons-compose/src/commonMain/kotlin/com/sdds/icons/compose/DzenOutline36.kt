package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.214 7.715 c 0.104 0.0 0.19 0.084 0.193 0.186 c 0.14 3.699 0.61 5.946 2.184 7.52 c 1.571 1.571 3.816 2.042 7.507 2.181 c 0.103 0.005 0.186 0.091 0.186 0.194 l -0.002 0.43 c 0.0 0.105 -0.084 0.19 -0.186 0.193 c -3.69 0.14 -5.934 0.609 -7.507 2.182 c -1.571 1.57 -2.04 3.812 -2.182 7.496 c -0.005 0.102 -0.09 0.186 -0.193 0.186 h -0.432 c -0.104 0.0 -0.19 -0.084 -0.193 -0.186 c -0.141 -3.684 -0.61 -5.925 -2.182 -7.496 c -1.57 -1.571 -3.817 -2.042 -7.507 -2.182 c -0.102 -0.005 -0.186 -0.09 -0.186 -0.192 v -0.431 c 0.0 -0.104 0.084 -0.19 0.186 -0.194 c 3.69 -0.14 5.934 -0.608 7.507 -2.181 c 1.575 -1.574 2.044 -3.823 2.184 -7.52 c 0.005 -0.102 0.09 -0.186 0.192 -0.186 h 0.43 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.055 4.5 c 5.339 0.0 8.474 0.54 10.676 2.68 c 2.248 2.293 2.767 5.405 2.767 10.745 v 0.15 c 0.0 5.341 -0.519 8.475 -2.767 10.745 c -2.204 2.14 -5.317 2.68 -10.678 2.68 h -0.108 c -5.36 0.0 -8.495 -0.54 -10.678 -2.68 C 5.019 26.528 4.5 23.415 4.5 18.075 v -0.15 c 0.0 -5.34 0.519 -8.475 2.767 -10.745 C 9.47 5.04 12.586 4.5 17.947 4.5 h 0.108 Z m -0.108 2.0 c -4.739 0.0 -7.834 0.705 -9.287 2.115 c -1.44 1.455 -2.16 4.558 -2.16 9.31 v 0.15 c 0.0 4.737 0.732 7.852 2.195 9.345 c 1.416 1.387 4.499 2.08 9.25 2.08 h 0.108 c 4.738 0.0 7.833 -0.705 9.286 -2.115 c 1.44 -1.455 2.159 -4.559 2.159 -9.31 v -0.15 c 0.0 -4.719 -0.726 -7.828 -2.178 -9.327 C 25.862 7.199 22.773 6.5 18.055 6.5 h -0.108 Z")
        )
    }.build()
}

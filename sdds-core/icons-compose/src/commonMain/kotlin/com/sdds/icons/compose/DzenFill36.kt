package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.055 4.5 c 5.339 0.0 8.474 0.54 10.676 2.68 c 2.248 2.293 2.767 5.406 2.767 10.745 v 0.15 c 0.0 5.341 -0.519 8.475 -2.767 10.745 c -2.204 2.14 -5.317 2.68 -10.678 2.68 h -0.108 c -5.36 0.0 -8.495 -0.54 -10.678 -2.68 C 5.019 26.528 4.5 23.414 4.5 18.075 v -0.15 c 0.0 -5.34 0.519 -8.475 2.767 -10.745 C 9.47 5.04 12.585 4.5 17.947 4.5 h 0.108 Z m -0.27 3.215 c -0.104 0.0 -0.19 0.083 -0.194 0.185 c -0.14 3.697 -0.608 5.947 -2.183 7.52 c -1.573 1.574 -3.817 2.043 -7.508 2.182 c -0.102 0.004 -0.186 0.089 -0.186 0.193 v 0.43 c 0.0 0.103 0.084 0.19 0.186 0.194 c 3.69 0.14 5.937 0.61 7.508 2.182 c 1.571 1.57 2.04 3.812 2.182 7.496 c 0.003 0.102 0.088 0.186 0.192 0.186 h 0.433 c 0.102 0.0 0.187 -0.084 0.192 -0.186 c 0.142 -3.684 0.61 -5.925 2.182 -7.496 c 1.573 -1.573 3.817 -2.042 7.508 -2.182 c 0.102 -0.003 0.186 -0.09 0.186 -0.193 l 0.001 -0.431 c 0.0 -0.103 -0.084 -0.188 -0.186 -0.193 c -3.69 -0.14 -5.936 -0.61 -7.507 -2.181 c -1.575 -1.574 -2.044 -3.822 -2.184 -7.52 c -0.003 -0.103 -0.088 -0.186 -0.192 -0.186 h -0.43 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WalletFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WalletFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.47 2.574 c 0.222 -0.024 0.356 -0.039 0.457 -0.041 c 0.06 -0.002 0.087 0.002 0.094 0.004 c 0.034 0.014 0.062 0.04 0.08 0.071 c 0.003 0.007 0.01 0.033 0.015 0.093 c 0.009 0.099 0.009 0.233 0.009 0.455 v 1.67 L 3.191 4.23 c -0.225 -0.017 -0.4 -0.203 -0.4 -0.427 c 0.0 -0.218 0.166 -0.401 0.385 -0.426 l 7.293 -0.803 Z M 3.06 2.351 C 2.316 2.434 1.75 3.06 1.75 3.803 v 6.947 c 0.0 0.432 0.0 0.787 0.023 1.077 c 0.024 0.3 0.075 0.572 0.2 0.83 c 0.197 0.405 0.512 0.741 0.904 0.966 c 0.25 0.143 0.52 0.214 0.82 0.26 c 0.29 0.046 0.647 0.072 1.082 0.105 l 5.946 0.446 c 0.5 0.038 0.907 0.069 1.239 0.066 c 0.342 -0.003 0.653 -0.04 0.946 -0.17 c 0.457 -0.2 0.833 -0.547 1.07 -0.983 c 0.152 -0.28 0.214 -0.585 0.242 -0.923 c 0.028 -0.327 0.028 -0.732 0.028 -1.229 V 8.071 c 0.0 -0.433 0.0 -0.787 -0.023 -1.077 c -0.024 -0.3 -0.075 -0.572 -0.2 -0.83 c -0.197 -0.405 -0.512 -0.742 -0.904 -0.967 c -0.25 -0.143 -0.52 -0.214 -0.82 -0.26 l -0.136 -0.02 v -1.78 c 0.0 -0.197 0.0 -0.376 -0.013 -0.524 c -0.014 -0.158 -0.045 -0.332 -0.139 -0.5 c -0.133 -0.24 -0.343 -0.426 -0.597 -0.531 c -0.18 -0.074 -0.358 -0.085 -0.518 -0.081 c -0.15 0.004 -0.33 0.023 -0.526 0.045 L 3.06 2.351 Z m 7.061 6.653 C 9.846 8.984 9.606 9.19 9.585 9.465 c -0.02 0.276 0.186 0.516 0.461 0.537 l 1.737 0.13 c 0.275 0.02 0.515 -0.186 0.536 -0.461 c 0.02 -0.276 -0.186 -0.516 -0.462 -0.536 l -1.736 -0.13 Z")
        )
    }.build()
}

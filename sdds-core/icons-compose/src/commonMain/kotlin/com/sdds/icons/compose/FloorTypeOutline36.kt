package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FloorTypeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FloorTypeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.466 21.899 c 0.44 -0.176 0.952 0.007 1.177 0.437 c 0.24 0.458 0.063 1.025 -0.396 1.265 L 19.138 30.45 c -0.729 0.38 -1.598 0.38 -2.327 0.0 L 3.703 23.6 L 3.62 23.552 c -0.397 -0.261 -0.54 -0.786 -0.315 -1.216 c 0.225 -0.43 0.737 -0.613 1.178 -0.437 l 0.088 0.04 l 13.107 6.849 c 0.185 0.096 0.406 0.096 0.591 0.0 l 13.109 -6.849 l 0.087 -0.04 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.221 6.41 c 0.47 -0.255 1.038 -0.255 1.508 0.0 l 13.354 7.283 c 0.162 0.089 0.275 0.221 0.34 0.37 c 0.237 0.183 0.39 0.468 0.39 0.79 v 3.597 c 0.0 0.28 -0.117 0.532 -0.303 0.714 c -0.056 0.184 -0.18 0.351 -0.373 0.457 l -13.409 7.311 l -0.18 0.085 c -0.369 0.144 -0.779 0.144 -1.147 0.0 l -0.18 -0.085 l -13.378 -7.295 c -0.187 -0.102 -0.31 -0.262 -0.369 -0.44 c -0.206 -0.182 -0.336 -0.449 -0.337 -0.746 v -3.608 c 0.0 -0.324 0.155 -0.613 0.395 -0.796 c 0.067 -0.142 0.179 -0.268 0.336 -0.354 L 17.22 6.411 Z M 5.137 17.842 l 3.613 1.88 l 1.987 0.985 l 6.238 3.402 v -1.885 L 5.137 15.767 v 2.074 Z m 13.838 4.382 v 1.883 l 6.218 -3.39 L 27.2 19.72 l 3.613 -2.047 v -1.906 l -11.837 6.455 Z m -5.512 -4.193 l 4.512 2.46 l 2.938 -1.602 l -4.533 -2.48 l -2.917 1.622 Z m 4.466 -2.483 l 4.548 2.488 l 6.696 -3.65 l -4.616 -2.518 l -6.628 3.68 Z M 6.777 14.384 l 5.128 2.796 l 6.512 -3.618 l -5.059 -2.767 l -6.58 3.59 Z m 8.146 -4.443 l 5.045 2.76 l 3.03 -1.684 l -5.023 -2.74 l -3.052 1.664 Z")
        )
    }.build()
}

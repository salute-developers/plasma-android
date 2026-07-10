package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.382 5.082 c 0.404 -0.11 0.83 -0.11 1.235 0.0 c 0.412 0.11 0.819 0.401 2.073 1.37 l 11.948 9.232 c 0.437 0.338 1.065 0.257 1.402 -0.18 c 0.338 -0.437 0.257 -1.065 -0.18 -1.402 L 21.754 4.746 c -1.026 -0.793 -1.768 -1.368 -2.617 -1.596 c -0.745 -0.201 -1.53 -0.201 -2.276 0.0 c -0.848 0.228 -1.59 0.803 -2.616 1.596 L 2.14 14.102 c -0.437 0.337 -0.518 0.965 -0.18 1.402 c 0.337 0.437 0.965 0.518 1.402 0.18 L 15.31 6.452 c 1.254 -0.969 1.661 -1.26 2.073 -1.37 Z M 6.419 17.933 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 8.706 c 0.0 0.909 0.0 1.652 0.05 2.256 c 0.05 0.624 0.16 1.187 0.427 1.713 c 0.42 0.823 1.089 1.492 1.912 1.912 c 0.525 0.267 1.088 0.376 1.713 0.427 c 0.604 0.05 1.347 0.05 2.256 0.05 h 14.446 c 0.909 0.0 1.652 0.0 2.256 -0.05 c 0.624 -0.05 1.187 -0.16 1.713 -0.427 c 0.823 -0.42 1.492 -1.089 1.912 -1.912 c 0.267 -0.526 0.376 -1.089 0.427 -1.713 c 0.05 -0.604 0.05 -1.347 0.05 -2.256 v -8.706 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 8.664 c 0.0 0.961 -0.001 1.622 -0.043 2.135 c -0.041 0.5 -0.116 0.771 -0.216 0.968 c -0.228 0.447 -0.591 0.81 -1.038 1.038 c -0.197 0.1 -0.467 0.175 -0.968 0.216 c -0.513 0.042 -1.174 0.043 -2.135 0.043 h -1.988 v -7.73 c 0.0 -2.868 -2.325 -5.194 -5.193 -5.194 c -2.869 0.0 -5.194 2.326 -5.194 5.194 v 7.73 H 10.82 c -0.962 0.0 -1.623 -0.001 -2.135 -0.043 c -0.501 -0.041 -0.772 -0.116 -0.968 -0.216 c -0.447 -0.228 -0.81 -0.591 -1.038 -1.038 c -0.1 -0.197 -0.175 -0.467 -0.216 -0.968 c -0.042 -0.513 -0.043 -1.174 -0.043 -2.135 v -8.664 Z m 14.774 5.334 v 7.73 h -6.387 v -7.73 c 0.0 -1.764 1.43 -3.194 3.194 -3.194 s 3.193 1.43 3.193 3.194 Z")
        )
    }.build()
}

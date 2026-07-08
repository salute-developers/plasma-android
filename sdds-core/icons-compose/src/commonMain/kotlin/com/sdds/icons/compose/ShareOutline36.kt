package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.65 6.91 l -0.001 0.478 v 3.702 c 0.0 0.651 -0.52 1.183 -1.171 1.198 c -7.827 0.177 -14.221 6.01 -15.313 13.54 C 6.3 24.413 7.532 23.1 9.132 22.04 c 2.397 -1.587 5.534 -2.553 10.283 -2.694 h 0.029 c 0.18 -0.006 0.372 -0.011 0.54 -0.002 c 0.19 0.01 0.43 0.044 0.677 0.164 c 0.336 0.162 0.617 0.435 0.79 0.767 c 0.128 0.246 0.167 0.486 0.183 0.677 c 0.015 0.168 0.015 0.364 0.015 0.548 v 2.724 l 0.001 0.478 l 0.34 -0.336 l 8.593 -8.56 l -8.593 -8.56 l -0.34 -0.337 Z m -1.583 -1.741 c 0.363 -0.426 0.909 -0.652 1.467 -0.61 c 0.474 0.038 0.833 0.312 1.045 0.488 c 0.23 0.192 0.497 0.458 0.792 0.753 l 9.335 9.298 C 32.894 15.286 33.0 15.541 33.0 15.807 c 0.0 0.266 -0.106 0.52 -0.294 0.708 l -9.335 9.299 c -0.295 0.294 -0.563 0.56 -0.792 0.752 c -0.212 0.177 -0.571 0.45 -1.045 0.487 c -0.558 0.044 -1.104 -0.183 -1.467 -0.609 c -0.308 -0.361 -0.368 -0.81 -0.392 -1.084 c -0.026 -0.298 -0.026 -0.676 -0.026 -1.092 V 21.53 v -0.188 l -0.175 0.005 c -4.498 0.133 -7.239 1.038 -9.238 2.362 c -2.005 1.326 -3.355 3.123 -5.012 5.327 L 5.161 29.12 C 4.468 30.042 3.0 29.552 3.0 28.4 v -0.28 c 0.0 -9.43 7.328 -17.18 16.649 -17.796 V 7.346 c 0.0 -0.417 0.0 -0.795 0.026 -1.092 c 0.024 -0.276 0.084 -0.723 0.392 -1.085 Z")
        )
    }.build()
}

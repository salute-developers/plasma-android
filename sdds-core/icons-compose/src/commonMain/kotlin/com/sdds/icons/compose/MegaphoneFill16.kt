package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MegaphoneFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MegaphoneFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.615 2.07 c 0.326 -0.072 0.642 -0.105 0.956 -0.018 c 0.47 0.13 0.874 0.44 1.133 0.868 c 0.173 0.286 0.237 0.61 0.267 0.955 c 0.03 0.336 0.03 0.758 0.03 1.272 v 5.371 c 0.0 0.514 0.0 0.935 -0.03 1.272 c -0.03 0.345 -0.094 0.67 -0.267 0.955 c -0.259 0.427 -0.664 0.738 -1.133 0.868 c -0.314 0.087 -0.63 0.054 -0.956 -0.019 c -0.318 -0.07 -0.705 -0.196 -1.177 -0.348 l -2.165 -0.7 c -0.312 0.514 -0.769 0.925 -1.317 1.173 c -0.688 0.31 -1.465 0.338 -2.172 0.078 c -0.707 -0.26 -1.287 -0.787 -1.63 -1.469 c -0.24 -0.479 -0.35 -1.011 -0.327 -1.542 l -1.276 -0.413 l -0.075 -0.024 c -0.35 -0.112 -0.656 -0.21 -0.894 -0.412 c -0.208 -0.175 -0.37 -0.403 -0.469 -0.662 C 0.999 8.979 1.0 8.645 1.0 8.265 V 7.4 C 1.0 7.02 1.0 6.686 1.113 6.39 c 0.1 -0.259 0.261 -0.487 0.47 -0.662 c 0.237 -0.201 0.544 -0.3 0.893 -0.412 l 0.075 -0.024 l 8.887 -2.873 c 0.472 -0.152 0.86 -0.277 1.177 -0.348 Z m -7.783 9.04 l 3.45 1.115 c -0.198 0.252 -0.45 0.453 -0.738 0.582 c -0.449 0.203 -0.954 0.221 -1.415 0.051 c -0.461 -0.17 -0.849 -0.517 -1.08 -0.978 c -0.121 -0.24 -0.194 -0.503 -0.217 -0.77 Z M 4.824 6.377 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.912 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 6.376 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleEndOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleEndOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 s 13.0 5.82 13.0 13.0 s -5.82 13.0 -13.0 13.0 S 5.0 25.18 5.0 18.0 Z M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z m 5.293 18.586 C 24.875 21.88 27.0 21.956 27.0 20.262 c 0.0 -1.35 0.0 -6.756 -9.0 -6.756 s -9.0 5.406 -9.0 6.756 c 0.0 1.693 2.124 1.617 3.708 1.324 c 0.472 -0.087 0.708 -0.13 0.904 -0.24 c 0.214 -0.121 0.294 -0.193 0.437 -0.393 c 0.13 -0.183 0.264 -0.628 0.53 -1.518 c 0.33 -1.101 1.197 -2.323 3.421 -2.323 c 2.224 0.0 3.091 1.222 3.421 2.323 c 0.266 0.89 0.4 1.335 0.53 1.518 c 0.143 0.2 0.223 0.272 0.437 0.393 c 0.196 0.11 0.432 0.153 0.904 0.24 Z")
        )
    }.build()
}

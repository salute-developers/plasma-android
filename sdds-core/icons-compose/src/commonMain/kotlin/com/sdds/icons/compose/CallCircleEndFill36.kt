package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleEndFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleEndFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 5.293 -11.414 C 24.875 21.88 27.0 21.956 27.0 20.262 c 0.0 -1.35 0.0 -6.756 -9.0 -6.756 s -9.0 5.406 -9.0 6.756 c 0.0 1.694 2.124 1.617 3.708 1.324 c 0.472 -0.087 0.708 -0.13 0.904 -0.24 c 0.214 -0.12 0.294 -0.192 0.437 -0.393 c 0.13 -0.182 0.264 -0.627 0.53 -1.517 c 0.33 -1.102 1.197 -2.324 3.421 -2.324 c 2.224 0.0 3.091 1.222 3.421 2.324 c 0.266 0.89 0.4 1.335 0.53 1.517 c 0.143 0.2 0.223 0.272 0.437 0.393 c 0.196 0.11 0.432 0.153 0.904 0.24 Z")
        )
    }.build()
}

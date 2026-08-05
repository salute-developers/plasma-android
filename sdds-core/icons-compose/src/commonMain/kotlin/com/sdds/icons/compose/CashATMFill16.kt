package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.785 2.0 h 8.43 v 0.029 h 2.283 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 1.502 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.283 V 2.0 Z m 0.0 1.912 h 8.43 V 12.6 c 0.0 0.49 0.0 0.735 -0.095 0.922 c -0.084 0.165 -0.217 0.299 -0.382 0.383 C 11.55 14.0 11.306 14.0 10.816 14.0 h -5.63 c -0.49 0.0 -0.736 0.0 -0.923 -0.095 c -0.164 -0.084 -0.298 -0.218 -0.382 -0.383 c -0.096 -0.187 -0.096 -0.432 -0.096 -0.922 V 3.912 Z m 5.647 3.382 c 0.0 -0.798 -0.643 -1.44 -1.432 -1.44 c -0.788 0.0 -1.432 0.642 -1.432 1.44 c 0.0 0.799 0.644 1.441 1.432 1.441 c 0.789 0.0 1.432 -0.642 1.432 -1.44 Z M 8.0 4.854 c 1.345 0.0 2.432 1.094 2.432 2.44 c 0.0 1.346 -1.087 2.441 -2.432 2.441 S 5.568 8.64 5.568 7.295 c 0.0 -1.347 1.087 -2.442 2.432 -2.442 Z m -0.7 6.0 c -0.277 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.223 0.5 0.5 0.5 h 1.404 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 7.3 Z")
        )
    }.build()
}

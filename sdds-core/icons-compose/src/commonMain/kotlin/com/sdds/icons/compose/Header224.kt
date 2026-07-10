package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header224: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header224",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.658 12.705 v 4.545 h 1.407 V 6.75 h -1.407 v 4.23 H 6.895 V 6.75 H 5.5 v 10.5 h 1.395 v -4.545 h 3.763 Z M 13.0 17.25 h 6.0 v -1.703 h -3.748 l 0.515 -0.518 c 2.227 -2.207 2.994 -3.555 2.994 -5.258 c 0.0 -1.821 -0.994 -3.006 -2.843 -3.02 c -1.245 -0.016 -2.214 0.532 -2.641 1.036 v 1.97 c 0.578 -0.785 1.409 -1.215 2.415 -1.2 c 0.943 0.0 1.522 0.578 1.522 1.6 c 0.0 1.066 -0.566 2.162 -4.214 5.82 v 1.273 Z")
        )
    }.build()
}

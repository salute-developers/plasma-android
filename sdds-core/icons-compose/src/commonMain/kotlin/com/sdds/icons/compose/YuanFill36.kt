package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.YuanFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "YuanFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 18.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 Z m -14.0 1.665 h 3.2 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.349 l 3.485 -5.317 c 0.303 -0.462 0.174 -1.082 -0.288 -1.384 c -0.462 -0.303 -1.082 -0.174 -1.384 0.288 L 18.0 16.842 l -3.664 -5.59 c -0.302 -0.462 -0.922 -0.591 -1.384 -0.288 c -0.462 0.303 -0.591 0.922 -0.288 1.384 l 3.485 5.317 H 13.8 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 H 17.0 v 1.924 h -3.2 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 H 17.0 v 0.961 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -0.961 h 3.2 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 19.0 v -1.924 Z")
        )
    }.build()
}

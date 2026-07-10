package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.92 15.527 c -0.157 0.369 -0.519 0.608 -0.92 0.608 h -4.517 v 13.529 c 0.0 1.428 -1.158 2.586 -2.586 2.586 h -5.793 c -1.429 0.0 -2.587 -1.158 -2.587 -2.586 V 16.135 H 8.0 c -0.401 0.0 -0.763 -0.24 -0.92 -0.609 c -0.157 -0.368 -0.078 -0.796 0.2 -1.085 l 10.0 -10.385 C 17.468 3.861 17.728 3.75 18.0 3.75 c 0.272 0.0 0.532 0.11 0.72 0.306 l 10.0 10.386 c 0.279 0.288 0.357 0.716 0.2 1.085 Z M 18.0 6.191 l -7.649 7.943 h 3.166 c 0.553 0.0 1.0 0.448 1.0 1.0 v 14.529 c 0.0 0.323 0.263 0.586 0.587 0.586 h 5.793 c 0.323 0.0 0.586 -0.262 0.586 -0.586 V 15.135 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 h 3.166 L 18.0 6.192 Z")
        )
    }.build()
}

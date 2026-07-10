package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.527 7.08 c 0.369 0.157 0.608 0.519 0.608 0.92 v 4.517 h 13.529 c 1.428 0.0 2.586 1.158 2.586 2.587 v 5.793 c 0.0 1.428 -1.158 2.586 -2.586 2.586 H 16.135 V 28.0 c 0.0 0.401 -0.24 0.763 -0.609 0.92 c -0.368 0.157 -0.796 0.078 -1.085 -0.2 l -10.385 -10.0 C 3.861 18.532 3.75 18.272 3.75 18.0 c 0.0 -0.272 0.11 -0.532 0.306 -0.72 l 10.386 -10.0 c 0.288 -0.278 0.716 -0.357 1.085 -0.2 Z M 6.191 18.0 l 7.943 7.649 v -3.166 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 14.529 c 0.323 0.0 0.586 -0.263 0.586 -0.586 v -5.793 c 0.0 -0.324 -0.262 -0.587 -0.586 -0.587 H 15.135 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 v -3.166 L 6.192 18.0 Z")
        )
    }.build()
}

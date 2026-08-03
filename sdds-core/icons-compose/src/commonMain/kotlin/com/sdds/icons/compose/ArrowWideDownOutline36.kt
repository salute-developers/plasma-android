package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.08 20.474 c 0.157 -0.37 0.519 -0.61 0.92 -0.61 h 4.517 V 6.337 c 0.0 -1.428 1.158 -2.586 2.587 -2.586 h 5.793 c 1.428 0.0 2.586 1.158 2.586 2.586 v 13.529 H 28.0 c 0.401 0.0 0.763 0.24 0.92 0.609 c 0.157 0.369 0.078 0.796 -0.2 1.084 l -10.0 10.386 c -0.188 0.195 -0.448 0.306 -0.72 0.306 c -0.272 0.0 -0.532 -0.11 -0.72 -0.306 l -10.0 -10.386 c -0.278 -0.288 -0.357 -0.715 -0.2 -1.084 Z M 18.0 29.808 l 7.649 -7.943 h -3.166 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 V 6.336 c 0.0 -0.324 -0.263 -0.586 -0.586 -0.586 h -5.793 c -0.324 0.0 -0.587 0.262 -0.587 0.586 v 14.529 c 0.0 0.552 -0.447 1.0 -1.0 1.0 h -3.166 L 18.0 29.808 Z")
        )
    }.build()
}

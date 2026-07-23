package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbAFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbAFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.286 8.916 C 2.0 9.552 2.0 10.368 2.0 12.0 c 0.0 1.632 0.0 2.448 0.286 3.084 c 0.326 0.724 0.906 1.304 1.63 1.63 C 4.552 17.0 5.368 17.0 7.0 17.0 h 10.0 c 1.632 0.0 2.448 0.0 3.084 -0.286 c 0.724 -0.326 1.304 -0.906 1.63 -1.63 C 22.0 14.448 22.0 13.632 22.0 12.0 c 0.0 -1.632 0.0 -2.448 -0.286 -3.084 c -0.326 -0.724 -0.906 -1.304 -1.63 -1.63 C 19.448 7.0 18.632 7.0 17.0 7.0 H 7.0 C 5.368 7.0 4.552 7.0 3.916 7.286 c -0.724 0.326 -1.304 0.906 -1.63 1.63 Z M 5.75 12.5 C 5.336 12.5 5.0 12.836 5.0 13.25 S 5.336 14.0 5.75 14.0 h 12.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 5.75 Z")
        )
    }.build()
}

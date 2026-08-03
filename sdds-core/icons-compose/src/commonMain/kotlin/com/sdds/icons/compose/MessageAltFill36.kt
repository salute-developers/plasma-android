package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.11 5.25 c -6.98 0.0 -12.64 5.659 -12.64 12.64 c 0.0 1.502 0.263 2.944 0.745 4.283 c 0.29 0.804 0.373 1.593 0.178 2.288 L 5.324 28.28 c -0.409 1.46 0.937 2.806 2.397 2.397 l 3.818 -1.07 c 0.695 -0.194 1.484 -0.11 2.288 0.179 c 1.339 0.482 2.781 0.745 4.283 0.745 c 6.981 0.0 12.64 -5.66 12.64 -12.64 c 0.0 -6.981 -5.659 -12.64 -12.64 -12.64 Z m -5.833 9.695 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 11.668 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 12.277 Z m 0.0 4.537 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 5.834 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -5.834 Z")
        )
    }.build()
}

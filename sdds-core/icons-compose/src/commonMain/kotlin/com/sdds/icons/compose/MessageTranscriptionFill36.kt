package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageTranscriptionFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageTranscriptionFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 c 6.981 0.0 12.64 5.659 12.64 12.64 c 0.0 6.98 -5.659 12.64 -12.64 12.64 c -1.502 0.0 -2.944 -0.263 -4.283 -0.745 c -0.804 -0.29 -1.593 -0.373 -2.288 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z m 13.965 -6.16 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 12.964 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 11.731 Z m -4.86 3.566 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.447 -1.0 1.0 v 5.834 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -5.834 Z m 9.721 0.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 5.834 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -5.834 Z")
        )
    }.build()
}

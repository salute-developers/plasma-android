package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 c 2.201 0.0 4.271 0.563 6.074 1.552 C 22.71 7.843 21.75 9.56 21.75 11.5 c 0.0 3.176 2.574 5.75 5.75 5.75 c 1.164 0.0 2.247 -0.346 3.152 -0.94 c 0.065 0.517 0.098 1.045 0.098 1.58 c 0.0 6.98 -5.659 12.64 -12.64 12.64 c -1.502 0.0 -2.944 -0.263 -4.283 -0.745 c -0.804 -0.29 -1.593 -0.373 -2.288 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.5 15.25 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.27 11.174 c 0.85 0.0 1.497 0.757 1.363 1.592 l -0.815 5.075 c -0.083 0.52 0.05 1.052 0.371 1.47 l 2.349 3.07 c 0.97 1.268 0.062 3.092 -1.537 3.093 h -3.784 v 6.05 l -1.398 1.65 l -1.397 -1.65 v -6.05 h -3.784 c -1.6 0.0 -2.507 -1.825 -1.538 -3.092 l 2.35 -3.07 c 0.32 -0.42 0.454 -0.951 0.37 -1.471 l -0.815 -5.075 c -0.134 -0.836 0.514 -1.592 1.363 -1.592 h 6.902 Z M 13.036 18.5 c 2.01 0.0 3.935 0.377 5.709 1.063 l -1.235 1.616 c -1.714 2.24 -0.553 5.312 1.882 6.11 H 6.265 c -1.892 -0.001 -3.425 -1.535 -3.425 -3.426 c 0.0 -1.034 0.468 -2.08 1.4 -2.702 C 6.765 19.48 9.79 18.5 13.036 18.5 Z m 0.001 -13.012 c 3.182 0.0 5.736 2.616 5.736 5.809 s -2.554 5.808 -5.736 5.808 s -5.736 -2.614 -5.736 -5.808 s 2.554 -5.809 5.736 -5.809 Z")
        )
    }.build()
}

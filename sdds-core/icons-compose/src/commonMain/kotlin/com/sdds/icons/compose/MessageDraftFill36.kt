package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageDraftFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageDraftFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.834 26.01 l -1.069 5.342 c -0.104 0.525 0.358 0.988 0.883 0.883 l 5.342 -1.068 c -0.037 -0.609 -0.175 -1.207 -0.409 -1.772 c -0.276 -0.667 -0.681 -1.273 -1.192 -1.784 c -0.51 -0.51 -1.117 -0.916 -1.784 -1.192 c -0.565 -0.234 -1.163 -0.372 -1.771 -0.409 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.905 30.308 c 0.152 -0.117 0.297 -0.245 0.434 -0.382 l 15.157 -15.157 c -0.008 -0.206 -0.025 -0.412 -0.052 -0.617 c -0.186 -1.419 -0.836 -2.736 -1.848 -3.748 s -2.329 -1.662 -3.748 -1.848 c -0.205 -0.027 -0.41 -0.044 -0.616 -0.052 L 6.074 23.661 c -0.136 0.137 -0.264 0.282 -0.381 0.434 c 0.574 0.093 1.137 0.252 1.677 0.476 c 0.91 0.377 1.737 0.93 2.433 1.626 c 0.697 0.696 1.25 1.523 1.626 2.433 c 0.224 0.54 0.383 1.103 0.476 1.678 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.953 11.312 l -1.691 1.691 C 28.896 11.49 28.12 10.1 27.01 8.99 c -1.109 -1.11 -2.499 -1.886 -4.012 -2.252 l 1.69 -1.69 c 1.73 -1.73 4.535 -1.73 6.265 0.0 c 1.73 1.73 1.73 4.534 0.0 6.264 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.87 32.0 l 3.0 -3.0 H 30.0 c 0.828 0.0 1.5 0.672 1.5 1.5 S 30.828 32.0 30.0 32.0 H 12.87 Z")
        )
    }.build()
}

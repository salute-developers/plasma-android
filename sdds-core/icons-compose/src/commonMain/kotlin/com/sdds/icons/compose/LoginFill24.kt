package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LoginFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LoginFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.555 2.75 c 1.73 0.0 2.596 0.0 3.258 0.337 c 0.581 0.296 1.055 0.769 1.351 1.35 c 0.337 0.662 0.337 1.527 0.337 3.258 v 8.61 c 0.0 1.73 0.0 2.596 -0.337 3.258 c -0.296 0.581 -0.77 1.054 -1.352 1.35 c -0.66 0.337 -1.527 0.337 -3.257 0.337 h -1.7 c -1.73 0.0 -2.596 0.0 -3.257 -0.337 c -0.582 -0.296 -1.056 -0.769 -1.352 -1.35 C 8.91 18.9 8.91 18.035 8.91 16.305 v -3.516 h 5.922 l -1.998 2.005 c -0.292 0.293 -0.291 0.768 0.002 1.06 c 0.293 0.293 0.768 0.292 1.06 -0.002 l 3.273 -3.284 l 0.05 -0.056 c 0.24 -0.295 0.223 -0.728 -0.05 -1.002 l -3.272 -3.284 c -0.293 -0.294 -0.768 -0.294 -1.061 -0.002 c -0.293 0.292 -0.294 0.767 -0.002 1.06 l 1.998 2.005 H 8.91 V 7.695 c 0.0 -1.73 0.0 -2.596 0.337 -3.258 c 0.296 -0.581 0.77 -1.054 1.352 -1.35 c 0.66 -0.337 1.527 -0.337 3.257 -0.337 h 1.7 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.91 11.29 v 1.5 H 4.272 c -0.414 0.0 -0.75 -0.337 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 H 8.91 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustHeight36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustHeight36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 21.469 c 0.552 0.0 1.0 0.448 1.0 1.0 v 6.246 l 2.361 -2.442 c 0.384 -0.396 1.017 -0.407 1.414 -0.023 c 0.397 0.384 0.408 1.017 0.024 1.414 l -4.08 4.219 C 18.53 32.077 18.27 32.188 18.0 32.188 c -0.271 0.0 -0.53 -0.111 -0.719 -0.306 l -4.075 -4.218 l -0.067 -0.077 c -0.314 -0.398 -0.281 -0.977 0.091 -1.337 c 0.373 -0.36 0.952 -0.373 1.34 -0.046 l 0.074 0.07 L 17.0 28.712 v -6.243 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.0 16.969 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 9.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.75 c 0.27 0.0 0.53 0.11 0.719 0.305 l 4.08 4.218 c 0.384 0.397 0.373 1.03 -0.024 1.415 c -0.396 0.383 -1.03 0.373 -1.414 -0.024 L 19.0 7.223 v 6.246 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 7.226 l -2.356 2.437 l -0.075 0.07 c -0.387 0.327 -0.966 0.314 -1.339 -0.046 c -0.397 -0.383 -0.408 -1.015 -0.024 -1.413 l 4.075 -4.218 C 17.47 3.86 17.73 3.75 18.0 3.75 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.018 1.5 c 0.69 0.0 1.25 0.56 1.25 1.25 v 6.047 H 12.5 c 0.2 0.0 0.381 0.12 0.46 0.304 c 0.079 0.184 0.04 0.397 -0.099 0.542 l -4.5 4.703 C 8.267 14.444 8.136 14.5 8.001 14.5 c -0.137 0.0 -0.268 -0.056 -0.362 -0.154 l -4.5 -4.703 C 3.0 9.498 2.962 9.285 3.04 9.1 C 3.12 8.917 3.3 8.797 3.5 8.797 h 2.232 V 2.75 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 2.036 Z")
        )
    }.build()
}

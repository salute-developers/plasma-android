package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NumberedView24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NumberedView24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 9.5 V 8.506 h 1.647 V 4.328 L 3.0 5.433 V 4.328 L 4.99 3.0 h 0.806 v 5.506 H 7.0 V 9.5 H 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.076 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.598 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 9.826 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.076 12.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.598 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 9.826 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.826 17.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 10.598 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 9.826 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.838 18.577 v 0.775 h 4.4 v -1.04 H 4.584 L 4.71 18.21 c 1.557 -1.286 2.5 -2.066 2.5 -3.451 c 0.0 -1.14 -0.579 -1.906 -2.268 -1.906 c -0.772 0.0 -1.476 0.173 -1.978 0.42 v 1.303 c 0.454 -0.374 1.081 -0.638 1.756 -0.638 c 0.83 0.0 1.216 0.356 1.216 1.112 c 0.0 0.904 -0.773 1.552 -1.906 2.501 c -0.365 0.305 -0.766 0.641 -1.191 1.027 Z")
        )
    }.build()
}

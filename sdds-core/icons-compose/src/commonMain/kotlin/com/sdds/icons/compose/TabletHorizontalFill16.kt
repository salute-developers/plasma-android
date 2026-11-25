package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TabletHorizontalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TabletHorizontalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.005 4.575 c 0.0 -0.285 0.0 -0.53 0.017 -0.73 c 0.017 -0.206 0.054 -0.409 0.152 -0.603 c 0.149 -0.291 0.387 -0.529 0.678 -0.678 c 0.194 -0.099 0.398 -0.136 0.604 -0.153 c 0.2 -0.016 0.444 -0.015 0.73 -0.015 h 9.635 c 0.285 0.0 0.53 -0.001 0.73 0.015 c 0.206 0.017 0.409 0.055 0.603 0.153 c 0.291 0.149 0.529 0.387 0.678 0.678 c 0.098 0.194 0.136 0.397 0.153 0.603 C 15.0 4.045 15.0 4.29 15.0 4.575 v 6.845 c 0.0 0.286 0.0 0.53 -0.016 0.73 c -0.017 0.206 -0.054 0.41 -0.153 0.604 c -0.149 0.291 -0.387 0.528 -0.678 0.677 c -0.194 0.099 -0.397 0.136 -0.603 0.153 c -0.2 0.016 -0.445 0.016 -0.73 0.016 H 3.186 c -0.286 0.0 -0.53 0.0 -0.73 -0.016 c -0.206 -0.017 -0.41 -0.054 -0.604 -0.153 c -0.291 -0.149 -0.53 -0.385 -0.678 -0.677 c -0.099 -0.194 -0.135 -0.398 -0.152 -0.604 c -0.016 -0.2 -0.017 -0.444 -0.017 -0.73 V 4.575 Z m 2.0 5.425 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 6.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 4.0 Z")
        )
    }.build()
}

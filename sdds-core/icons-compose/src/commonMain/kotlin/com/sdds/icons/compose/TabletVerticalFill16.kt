package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TabletVerticalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TabletVerticalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.425 1.0 c 0.286 0.0 0.53 0.0 0.73 0.017 c 0.206 0.016 0.41 0.053 0.603 0.152 c 0.292 0.149 0.53 0.386 0.678 0.678 c 0.099 0.194 0.136 0.397 0.153 0.603 c 0.017 0.2 0.016 0.445 0.016 0.73 v 9.635 c 0.0 0.286 0.0 0.53 -0.016 0.73 c -0.017 0.207 -0.054 0.41 -0.153 0.603 c -0.149 0.292 -0.386 0.53 -0.678 0.678 c -0.194 0.099 -0.397 0.137 -0.602 0.153 c -0.2 0.017 -0.445 0.016 -0.73 0.016 H 4.58 c -0.286 0.0 -0.53 0.0 -0.73 -0.015 c -0.207 -0.017 -0.41 -0.055 -0.604 -0.154 c -0.292 -0.148 -0.529 -0.386 -0.677 -0.678 c -0.1 -0.194 -0.137 -0.396 -0.153 -0.602 C 2.4 13.346 2.4 13.1 2.4 12.816 V 3.18 c 0.0 -0.286 0.0 -0.53 0.016 -0.73 C 2.433 2.243 2.47 2.04 2.57 1.846 c 0.148 -0.292 0.385 -0.53 0.677 -0.678 c 0.194 -0.1 0.397 -0.136 0.603 -0.152 C 4.05 1.0 4.295 1.0 4.58 1.0 h 6.845 Z M 6.0 3.0 C 5.724 3.0 5.5 3.224 5.5 3.5 S 5.724 4.0 6.0 4.0 h 4.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 10.277 3.0 10.0 3.0 H 6.0 Z")
        )
    }.build()
}

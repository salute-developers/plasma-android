package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NumberedView16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NumberedView16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 7.3 V 6.566 h 1.235 V 3.481 L 1.5 4.297 V 3.48 L 2.993 2.5 h 0.604 v 4.066 H 4.5 V 7.3 h -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.035 4.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.492 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 6.535 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.035 8.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.492 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 6.535 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.535 11.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 7.492 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 6.535 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 12.86 v 0.572 h 3.25 v -0.768 H 2.79 l 0.092 -0.076 c 1.15 -0.95 1.847 -1.526 1.847 -2.55 c 0.0 -0.84 -0.428 -1.406 -1.675 -1.406 c -0.57 0.0 -1.09 0.127 -1.461 0.31 v 0.962 C 1.928 9.628 2.39 9.433 2.89 9.433 c 0.613 0.0 0.898 0.262 0.898 0.821 c 0.0 0.667 -0.572 1.146 -1.409 1.847 c -0.269 0.225 -0.565 0.473 -0.879 0.758 Z")
        )
    }.build()
}

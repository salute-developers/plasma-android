package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageDraftFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageDraftFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.257 14.33 l 0.498 -2.486 c 0.285 0.017 0.565 0.08 0.83 0.19 c 0.31 0.128 0.59 0.316 0.828 0.553 c 0.237 0.237 0.425 0.518 0.553 0.828 c 0.11 0.264 0.173 0.544 0.19 0.829 L 1.669 14.74 c -0.245 0.049 -0.46 -0.167 -0.412 -0.412 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.313 13.653 c -0.062 0.063 -0.128 0.12 -0.198 0.175 c -0.044 -0.273 -0.12 -0.54 -0.225 -0.796 c -0.179 -0.43 -0.44 -0.822 -0.77 -1.152 c -0.33 -0.33 -0.722 -0.591 -1.153 -0.77 c -0.256 -0.106 -0.523 -0.181 -0.796 -0.225 c 0.054 -0.07 0.112 -0.136 0.175 -0.199 l 7.16 -7.158 c 0.105 0.002 0.21 0.01 0.314 0.025 c 0.667 0.087 1.285 0.392 1.76 0.867 c 0.476 0.475 0.78 1.094 0.869 1.76 c 0.013 0.105 0.022 0.21 0.024 0.315 l -7.16 7.158 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.358 5.611 l 0.779 -0.779 c 0.82 -0.82 0.82 -2.148 0.0 -2.967 c -0.82 -0.82 -2.147 -0.82 -2.967 0.0 l -0.78 0.779 c 0.716 0.176 1.373 0.544 1.898 1.069 c 0.525 0.525 0.894 1.182 1.07 1.898 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.543 13.25 H 5.25 v 0.293 l 0.293 -0.293 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.457 14.75 H 14.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 6.957 l -1.5 1.5 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.455 8.477 c 0.331 -1.008 1.758 -1.008 2.09 0.0 l 0.802 2.441 c 0.223 0.678 0.756 1.21 1.435 1.434 l 2.441 0.803 c 1.008 0.332 1.009 1.759 0.0 2.09 l -2.441 0.803 c -0.679 0.223 -1.212 0.756 -1.435 1.434 l -0.803 2.44 c -0.331 1.01 -1.758 1.01 -2.09 0.0 l -0.802 -2.44 c -0.223 -0.678 -0.756 -1.211 -1.435 -1.434 l -2.44 -0.803 c -1.008 -0.332 -1.008 -1.758 0.0 -2.09 l 2.44 -0.803 c 0.679 -0.224 1.212 -0.755 1.435 -1.434 l 0.803 -2.441 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.31 4.32 c 0.057 -0.187 0.323 -0.187 0.38 0.0 l 0.441 1.427 c 0.195 0.632 0.69 1.127 1.322 1.322 l 1.427 0.44 c 0.188 0.058 0.188 0.325 0.0 0.383 l -1.427 0.44 c -0.632 0.194 -1.127 0.69 -1.322 1.321 l -0.44 1.427 c -0.058 0.188 -0.324 0.188 -0.382 0.0 l -0.44 -1.427 c -0.195 -0.632 -0.69 -1.127 -1.323 -1.322 l -1.426 -0.44 c -0.188 -0.058 -0.188 -0.324 0.0 -0.382 l 1.426 -0.44 c 0.633 -0.195 1.128 -0.69 1.323 -1.322 l 0.44 -1.427 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedMediumOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedMediumOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.897 4.4 c 0.195 -0.2 0.511 -0.2 0.707 0.0 l 3.164 3.251 c 0.189 0.194 0.189 0.504 0.0 0.698 l -3.164 3.25 c -0.196 0.201 -0.512 0.201 -0.707 0.0 c -0.196 -0.2 -0.196 -0.525 0.0 -0.726 L 4.692 8.0 L 1.897 5.127 C 1.7 4.927 1.7 4.601 1.897 4.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.047 4.4 c 0.195 -0.2 0.512 -0.2 0.707 0.0 l 3.164 3.251 c 0.189 0.194 0.189 0.504 0.0 0.698 l -3.164 3.25 c -0.195 0.201 -0.512 0.201 -0.707 0.0 c -0.195 -0.2 -0.195 -0.525 0.0 -0.726 L 8.843 8.0 L 6.047 5.127 c -0.195 -0.2 -0.195 -0.526 0.0 -0.727 Z")
        )
    }.build()
}

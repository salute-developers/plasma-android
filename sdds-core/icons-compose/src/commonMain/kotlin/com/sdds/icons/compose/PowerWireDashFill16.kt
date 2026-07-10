package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.25 8.024 c 0.0 0.979 -0.429 1.908 -1.173 2.544 L 9.825 11.64 C 9.778 11.68 9.75 11.738 9.75 11.8 V 15.0 h -3.5 v -3.043 l 6.0 -6.0 v 2.067 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.145 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 2.883 h 0.357 l 2.736 -2.737 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 3.007 -3.006 C 4.157 9.884 3.75 8.977 3.75 8.024 V 5.596 c 0.0 -0.671 0.545 -1.213 1.215 -1.213 h 0.393 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.277 0.0 0.5 0.224 0.5 0.5 v 2.883 h 3.286 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}

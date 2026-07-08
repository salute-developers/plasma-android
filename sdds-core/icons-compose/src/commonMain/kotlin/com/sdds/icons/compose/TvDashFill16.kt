package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.738 1.647 c 0.196 -0.196 0.512 -0.196 0.707 0.0 c 0.196 0.195 0.196 0.511 0.0 0.707 L 2.566 14.232 c -0.195 0.196 -0.512 0.196 -0.708 0.0 c -0.194 -0.195 -0.195 -0.511 0.0 -0.707 l 1.746 -1.745 H 2.4 c -0.49 0.0 -0.735 0.0 -0.922 -0.095 c -0.165 -0.084 -0.298 -0.218 -0.382 -0.382 C 1.0 11.116 1.0 10.87 1.0 10.38 V 3.9 c 0.0 -0.49 0.0 -0.735 0.096 -0.922 C 1.18 2.813 1.313 2.68 1.478 2.596 C 1.665 2.5 1.91 2.5 2.4 2.5 h 10.485 l 0.853 -0.853 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.6 13.5 H 4.708 l 1.006 -1.006 H 13.6 V 13.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.977 3.23 C 15.0 3.39 15.0 3.599 15.0 3.9 v 6.48 c 0.0 0.49 0.0 0.736 -0.096 0.923 c -0.084 0.164 -0.217 0.298 -0.381 0.382 c -0.188 0.095 -0.433 0.095 -0.923 0.095 H 6.427 l 8.55 -8.55 Z")
        )
    }.build()
}

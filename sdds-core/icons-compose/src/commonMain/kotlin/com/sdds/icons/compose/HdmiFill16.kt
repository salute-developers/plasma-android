package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HdmiFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HdmiFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.947 10.188 l 1.466 -1.44 c 0.217 -0.213 0.325 -0.319 0.402 -0.443 c 0.07 -0.11 0.12 -0.231 0.15 -0.358 C 15.0 7.805 15.0 7.653 15.0 7.35 V 7.21 c 0.0 -0.686 0.0 -1.03 -0.133 -1.291 c -0.118 -0.23 -0.305 -0.418 -0.536 -0.535 C 14.07 5.25 13.726 5.25 13.04 5.25 H 2.96 c -0.686 0.0 -1.03 0.0 -1.291 0.134 C 1.439 5.5 1.25 5.688 1.134 5.919 C 1.0 6.18 1.0 6.524 1.0 7.21 v 0.14 c 0.0 0.303 0.0 0.455 0.035 0.597 c 0.03 0.127 0.08 0.247 0.15 0.358 c 0.077 0.124 0.185 0.23 0.402 0.443 l 1.466 1.44 c 0.211 0.208 0.317 0.311 0.44 0.385 c 0.108 0.066 0.227 0.115 0.35 0.144 c 0.14 0.033 0.288 0.033 0.584 0.033 h 7.146 c 0.296 0.0 0.444 0.0 0.584 -0.033 c 0.123 -0.03 0.242 -0.078 0.35 -0.144 c 0.123 -0.074 0.229 -0.177 0.44 -0.385 Z m -1.972 -1.86 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.95 c -0.277 0.0 -0.5 0.224 -0.5 0.5 s 0.223 0.5 0.5 0.5 h 5.95 Z")
        )
    }.build()
}

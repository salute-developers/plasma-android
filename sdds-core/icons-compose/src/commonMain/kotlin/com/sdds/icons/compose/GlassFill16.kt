package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GlassFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GlassFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.092 1.926 c -0.04 0.07 -0.047 0.16 -0.06 0.344 L 1.758 6.095 c -0.114 1.594 1.016 2.973 2.54 3.223 l -0.002 0.04 v 3.464 c -1.368 0.118 -2.408 0.713 -2.408 1.428 h 5.817 c 0.0 -0.716 -1.04 -1.31 -2.409 -1.428 V 9.359 l -0.001 -0.04 c 1.524 -0.25 2.654 -1.63 2.54 -3.224 L 7.561 2.27 C 7.548 2.087 7.54 1.995 7.5 1.926 C 7.466 1.865 7.413 1.816 7.35 1.785 C 7.278 1.75 7.186 1.75 7.002 1.75 H 2.591 c -0.184 0.0 -0.276 0.0 -0.348 0.035 c -0.063 0.03 -0.116 0.08 -0.151 0.14 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.47 3.39 c -0.038 0.075 -0.038 0.173 -0.038 0.37 v 5.412 c 0.0 0.731 0.48 1.35 1.142 1.56 c -0.004 0.025 -0.005 0.05 -0.005 0.076 v 2.031 c -0.964 0.15 -1.682 0.725 -1.682 1.411 h 4.363 c 0.0 -0.686 -0.717 -1.26 -1.681 -1.411 v -2.03 c 0.0 -0.027 -0.002 -0.052 -0.006 -0.077 c 0.662 -0.21 1.142 -0.829 1.142 -1.56 V 3.759 c 0.0 -0.196 0.0 -0.294 -0.038 -0.369 c -0.034 -0.066 -0.087 -0.12 -0.153 -0.153 C 13.439 3.2 13.34 3.2 13.144 3.2 h -2.152 c -0.196 0.0 -0.294 0.0 -0.369 0.038 c -0.065 0.034 -0.119 0.087 -0.152 0.153 Z")
        )
    }.build()
}

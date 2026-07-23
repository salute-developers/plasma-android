package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.282 4.5 c 0.137 0.0 0.249 0.11 0.253 0.244 c 0.184 4.854 0.8 7.805 2.866 9.871 c 2.063 2.062 5.01 2.681 9.854 2.865 c 0.135 0.006 0.245 0.117 0.245 0.252 l -0.002 0.565 c 0.0 0.137 -0.11 0.25 -0.245 0.254 c -4.844 0.183 -7.79 0.799 -9.854 2.863 c -2.062 2.062 -2.678 5.004 -2.864 9.839 c -0.006 0.135 -0.118 0.245 -0.253 0.245 h -0.567 c -0.137 0.0 -0.249 -0.11 -0.253 -0.245 c -0.186 -4.835 -0.801 -7.777 -2.863 -9.839 c -2.063 -2.062 -5.011 -2.68 -9.855 -2.863 C 4.61 18.544 4.5 18.43 4.5 18.297 v -0.565 c 0.0 -0.136 0.11 -0.248 0.244 -0.252 c 4.844 -0.184 7.79 -0.8 9.855 -2.865 c 2.066 -2.066 2.681 -5.019 2.865 -9.87 C 17.47 4.608 17.583 4.5 17.718 4.5 h 0.564 Z")
        )
    }.build()
}

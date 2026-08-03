package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarRFocusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarRFocusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.744 2.5 h 8.512 c 0.374 0.0 0.686 0.0 0.941 0.02 c 0.266 0.022 0.516 0.068 0.752 0.186 c 0.362 0.181 0.657 0.47 0.841 0.826 c 0.12 0.232 0.168 0.477 0.19 0.739 C 15.0 4.52 15.0 4.827 15.0 5.195 v 5.61 c 0.0 0.367 0.0 0.674 -0.02 0.925 c -0.023 0.26 -0.07 0.506 -0.19 0.738 c -0.184 0.355 -0.479 0.645 -0.841 0.826 c -0.236 0.118 -0.486 0.164 -0.752 0.186 c -0.255 0.02 -0.567 0.02 -0.94 0.02 H 3.743 c -0.374 0.0 -0.686 0.0 -0.941 -0.02 c -0.266 -0.022 -0.516 -0.068 -0.752 -0.186 c -0.362 -0.181 -0.657 -0.47 -0.841 -0.826 c -0.12 -0.232 -0.167 -0.477 -0.19 -0.739 C 1.0 11.48 1.0 11.174 1.0 10.806 v -5.61 C 1.0 4.827 1.0 4.52 1.02 4.27 c 0.023 -0.262 0.07 -0.507 0.19 -0.739 c 0.184 -0.355 0.479 -0.645 0.841 -0.826 c 0.236 -0.118 0.486 -0.164 0.752 -0.186 C 3.058 2.5 3.37 2.5 3.743 2.5 Z M 11.5 3.531 c -0.58 0.0 -1.05 0.47 -1.05 1.05 v 6.838 c 0.0 0.58 0.47 1.05 1.05 1.05 h 1.4 c 0.58 0.0 1.05 -0.47 1.05 -1.05 V 4.58 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 h -1.4 Z")
        )
    }.build()
}

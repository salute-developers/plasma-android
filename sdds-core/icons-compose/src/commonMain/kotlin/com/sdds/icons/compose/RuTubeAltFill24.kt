package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeAltFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeAltFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.94 8.46 c 0.625 0.001 1.132 0.069 1.539 0.188 c 0.406 0.138 0.745 0.342 1.048 0.633 c 0.288 0.307 0.49 0.65 0.609 1.043 c 0.118 0.394 0.186 0.907 0.186 1.557 v 0.855 c 0.0 1.096 -0.186 1.917 -0.557 2.43 c -0.372 0.513 -0.824 0.825 -1.828 0.976 l 2.724 3.73 h -3.163 l -2.47 -3.714 H 5.824 v 3.713 H 3.0 V 8.461 h 9.94 Z m -7.116 2.516 v 2.668 h 6.66 c 0.388 0.0 0.659 -0.05 0.794 -0.17 c 0.136 -0.12 0.22 -0.342 0.22 -0.684 v -0.958 c 0.0 -0.325 -0.084 -0.547 -0.22 -0.667 c -0.135 -0.12 -0.406 -0.19 -0.795 -0.19 H 5.824 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.83 4.12 c 1.198 0.0 2.17 0.972 2.17 2.17 s -0.972 2.17 -2.17 2.17 s -2.169 -0.972 -2.169 -2.17 s 0.97 -2.17 2.17 -2.17 Z")
        )
    }.build()
}

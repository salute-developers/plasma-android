package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackwardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackwardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.857 1.744 c -0.104 -0.121 -0.221 -0.264 -0.5 -0.242 c -0.242 0.02 -0.422 0.159 -0.522 0.242 C 5.726 1.835 5.6 1.962 5.463 2.098 l -4.31 4.305 c -0.204 0.205 -0.204 0.537 0.0 0.742 l 4.31 4.304 c 0.137 0.137 0.263 0.263 0.372 0.354 c 0.1 0.084 0.28 0.223 0.521 0.242 c 0.244 0.008 0.45 -0.243 0.524 -0.341 c 0.075 -0.099 0.163 -0.411 0.174 -0.541 c 0.013 -0.142 0.013 -0.32 0.013 -0.514 V 8.958 V 8.93 l 0.02 0.001 c 2.07 0.062 3.558 0.254 4.47 0.859 c 0.917 0.61 1.536 1.435 2.305 2.46 c 0.0 0.0 0.055 0.08 0.088 0.153 c 0.317 0.7 1.05 0.804 1.05 0.21 v -0.158 c 0.0 -4.37 -3.617 -7.61 -7.933 -7.926 V 2.796 c 0.0 -0.193 0.0 -0.372 -0.013 -0.513 c -0.011 -0.13 -0.04 -0.355 -0.197 -0.54 Z")
        )
    }.build()
}

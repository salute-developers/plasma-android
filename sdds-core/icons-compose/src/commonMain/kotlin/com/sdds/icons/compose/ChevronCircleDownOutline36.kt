package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleDownOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleDownOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.936 17.986 c 0.0 -7.206 5.842 -13.049 13.048 -13.049 c 7.207 0.0 13.05 5.843 13.05 13.05 c 0.0 7.206 -5.843 13.048 -13.05 13.048 c -7.206 0.0 -13.048 -5.842 -13.048 -13.049 Z M 17.984 2.937 c -8.31 0.0 -15.048 6.738 -15.048 15.05 c 0.0 8.31 6.737 15.048 15.048 15.048 s 15.05 -6.737 15.05 -15.049 c 0.0 -8.31 -6.738 -15.049 -15.05 -15.049 Z M 11.2 14.47 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 7.493 7.493 c 0.39 0.39 1.024 0.39 1.414 0.0 l 7.493 -7.493 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -6.786 6.786 L 11.2 14.47 Z")
        )
    }.build()
}

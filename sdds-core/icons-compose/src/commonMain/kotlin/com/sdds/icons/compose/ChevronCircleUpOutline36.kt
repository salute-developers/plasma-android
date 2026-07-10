package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleUpOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleUpOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.033 17.986 c 0.0 7.207 -5.842 13.049 -13.049 13.049 c -7.206 0.0 -13.048 -5.842 -13.048 -13.049 c 0.0 -7.206 5.842 -13.049 13.048 -13.049 c 7.207 0.0 13.05 5.843 13.05 13.05 Z M 17.984 33.035 c 8.311 0.0 15.05 -6.737 15.05 -15.049 c 0.0 -8.31 -6.738 -15.049 -15.05 -15.049 c -8.31 0.0 -15.048 6.738 -15.048 15.05 c 0.0 8.31 6.737 15.048 15.048 15.048 Z m 6.785 -11.532 c 0.391 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.391 0.39 -1.024 0.0 -1.415 l -7.493 -7.493 c -0.39 -0.39 -1.024 -0.39 -1.415 0.0 l -7.493 7.493 c -0.39 0.39 -0.39 1.024 0.0 1.415 c 0.39 0.39 1.024 0.39 1.415 0.0 l 6.786 -6.786 l 6.785 6.786 Z")
        )
    }.build()
}

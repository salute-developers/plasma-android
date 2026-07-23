package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.125 15.186 c 2.167 1.25 2.167 4.378 0.0 5.629 l -15.75 9.093 C 11.208 31.16 8.5 29.596 8.5 27.094 V 8.907 c 0.0 -2.502 2.708 -4.065 4.875 -2.814 l 15.75 9.093 Z m -1.0 3.897 c 0.833 -0.481 0.833 -1.684 0.0 -2.165 l -15.75 -9.093 C 11.542 7.344 10.5 7.945 10.5 8.907 v 18.187 c 0.0 0.962 1.042 1.563 1.875 1.082 l 15.75 -9.093 Z")
        )
    }.build()
}

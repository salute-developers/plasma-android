package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.028 2.054 c -0.23 -0.093 -0.492 -0.065 -0.699 0.075 C 11.123 2.269 11.0 2.501 11.0 2.75 v 11.76 c -0.741 -0.63 -1.701 -1.01 -2.75 -1.01 C 5.903 13.5 4.0 15.403 4.0 17.75 S 5.903 22.0 8.25 22.0 s 4.25 -1.903 4.25 -4.25 V 9.108 l 6.471 2.588 c 0.232 0.093 0.493 0.065 0.7 -0.075 C 19.877 11.481 20.0 11.25 20.0 11.0 V 6.766 c 0.0 -0.92 -0.56 -1.748 -1.414 -2.09 l -6.557 -2.622 Z M 11.0 17.75 C 11.0 16.231 9.769 15.0 8.25 15.0 S 5.5 16.231 5.5 17.75 s 1.231 2.75 2.75 2.75 S 11.0 19.269 11.0 17.75 Z m 7.5 -7.858 l -6.0 -2.4 V 3.858 l 5.529 2.211 C 18.313 6.183 18.5 6.46 18.5 6.766 v 3.126 Z")
        )
    }.build()
}

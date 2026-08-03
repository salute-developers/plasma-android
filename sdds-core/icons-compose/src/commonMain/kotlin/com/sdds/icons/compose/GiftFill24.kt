package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.72 2.72 c 0.983 -0.983 2.577 -0.983 3.56 0.0 L 12.0 4.44 l 1.72 -1.72 c 0.983 -0.983 2.577 -0.983 3.56 0.0 c 0.984 0.983 0.984 2.577 0.0 3.56 L 16.56 7.0 h 3.19 C 20.44 7.0 21.0 7.56 21.0 8.25 v 3.25 h -8.25 V 7.0 h -1.5 v 4.5 H 3.0 V 8.25 C 3.0 7.56 3.56 7.0 4.25 7.0 h 3.19 L 6.72 6.28 c -0.984 -0.983 -0.984 -2.577 0.0 -3.56 Z M 14.44 7.0 h -1.69 V 5.81 l 2.03 -2.03 c 0.398 -0.397 1.042 -0.397 1.44 0.0 c 0.397 0.398 0.397 1.042 0.0 1.44 L 14.44 7.0 Z m -3.19 -1.19 V 7.0 H 9.56 L 7.78 5.22 c -0.397 -0.398 -0.397 -1.042 0.0 -1.44 c 0.398 -0.397 1.042 -0.397 1.44 0.0 l 2.03 2.03 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 13.0 v 5.75 C 4.0 20.545 5.455 22.0 7.25 22.0 h 4.0 v -9.0 H 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 22.0 h 4.0 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 13.0 h -7.25 v 9.0 Z")
        )
    }.build()
}

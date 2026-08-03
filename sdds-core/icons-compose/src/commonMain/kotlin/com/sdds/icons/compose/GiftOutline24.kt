package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.28 2.72 c -0.983 -0.983 -2.577 -0.983 -3.56 0.0 c -0.984 0.983 -0.984 2.577 0.0 3.56 L 7.44 7.0 H 4.25 C 3.56 7.0 3.0 7.56 3.0 8.25 v 3.5 c 0.0 0.605 0.43 1.11 1.0 1.225 v 5.775 C 4.0 20.545 5.455 22.0 7.25 22.0 h 9.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 v -5.775 c 0.57 -0.116 1.0 -0.62 1.0 -1.225 v -3.5 C 21.0 7.56 20.44 7.0 19.75 7.0 h -3.19 l 0.72 -0.72 c 0.984 -0.983 0.984 -2.577 0.0 -3.56 c -0.983 -0.983 -2.577 -0.983 -3.56 0.0 L 12.0 4.44 l -1.72 -1.72 Z M 14.44 7.0 l 1.78 -1.78 c 0.397 -0.398 0.397 -1.042 0.0 -1.44 c -0.398 -0.397 -1.042 -0.397 -1.44 0.0 l -2.03 2.03 V 7.0 h 1.69 Z m -3.19 0.0 V 5.81 L 9.22 3.78 c -0.398 -0.397 -1.042 -0.397 -1.44 0.0 c -0.397 0.398 -0.397 1.042 0.0 1.44 L 9.56 7.0 h 1.69 Z M 4.5 11.5 v -3.0 h 6.75 v 3.0 H 4.5 Z m 8.25 0.0 v -3.0 h 6.75 v 3.0 h -6.75 Z M 5.5 13.0 h 5.75 v 7.5 h -4.0 c -0.966 0.0 -1.75 -0.783 -1.75 -1.75 V 13.0 Z m 7.25 0.0 v 7.5 h 4.0 c 0.966 0.0 1.75 -0.783 1.75 -1.75 V 13.0 h -5.75 Z")
        )
    }.build()
}

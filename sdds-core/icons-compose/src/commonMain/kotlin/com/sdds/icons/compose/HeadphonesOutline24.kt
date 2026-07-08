package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeadphonesOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeadphonesOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 v 1.01 c 0.505 -0.322 1.106 -0.51 1.75 -0.51 c 1.795 0.0 3.25 1.455 3.25 3.25 v 3.0 C 8.5 20.545 7.045 22.0 5.25 22.0 S 2.0 20.545 2.0 18.75 V 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 v 6.75 c 0.0 1.795 -1.455 3.25 -3.25 3.25 s -3.25 -1.455 -3.25 -3.25 v -3.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 c 0.644 0.0 1.245 0.188 1.75 0.51 V 12.0 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 Z m 8.5 12.25 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 S 17.0 14.784 17.0 15.75 v 3.0 c 0.0 0.966 0.784 1.75 1.75 1.75 s 1.75 -0.784 1.75 -1.75 v -3.0 Z m -17.0 0.0 C 3.5 14.784 4.284 14.0 5.25 14.0 S 7.0 14.784 7.0 15.75 v 3.0 c 0.0 0.966 -0.784 1.75 -1.75 1.75 S 3.5 19.716 3.5 18.75 v -3.0 Z")
        )
    }.build()
}

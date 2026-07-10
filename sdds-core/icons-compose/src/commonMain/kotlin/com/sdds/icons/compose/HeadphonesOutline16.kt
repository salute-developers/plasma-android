package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeadphonesOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeadphonesOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.975 2.0 C 4.675 2.0 2.0 4.675 2.0 7.975 v 0.754 C 2.358 8.489 2.787 8.35 3.25 8.35 c 1.243 0.0 2.25 1.007 2.25 2.25 v 2.1 c 0.0 1.243 -1.007 2.25 -2.25 2.25 S 1.0 13.943 1.0 12.7 V 7.975 C 1.0 4.123 4.123 1.0 7.975 1.0 c 3.852 0.0 6.975 3.123 6.975 6.975 V 12.7 c 0.0 1.243 -1.007 2.25 -2.25 2.25 s -2.25 -1.007 -2.25 -2.25 v -2.1 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 c 0.463 0.0 0.893 0.14 1.25 0.379 V 7.975 C 13.95 4.675 11.275 2.0 7.975 2.0 Z m 5.975 8.598 c 0.0 -0.69 -0.56 -1.248 -1.25 -1.248 s -1.25 0.56 -1.25 1.25 v 2.1 c 0.0 0.69 0.56 1.25 1.25 1.25 s 1.25 -0.56 1.25 -1.25 v -2.102 Z M 2.0 10.6 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 S 4.5 9.91 4.5 10.6 v 2.1 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 2.0 13.39 2.0 12.7 v -2.1 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppsOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppsOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.25 7.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 S 6.045 1.0 4.25 1.0 S 1.0 2.455 1.0 4.25 S 2.455 7.5 4.25 7.5 Z M 2.0 11.75 C 2.0 10.507 3.007 9.5 4.25 9.5 s 2.25 1.007 2.25 2.25 S 5.493 14.0 4.25 14.0 S 2.0 12.993 2.0 11.75 Z M 4.25 8.5 C 2.455 8.5 1.0 9.955 1.0 11.75 S 2.455 15.0 4.25 15.0 s 3.25 -1.455 3.25 -3.25 S 6.045 8.5 4.25 8.5 Z m 7.5 -6.5 C 10.507 2.0 9.5 3.007 9.5 4.25 s 1.007 2.25 2.25 2.25 S 14.0 5.493 14.0 4.25 S 12.993 2.0 11.75 2.0 Z M 8.5 4.25 C 8.5 2.455 9.955 1.0 11.75 1.0 S 15.0 2.455 15.0 4.25 S 13.545 7.5 11.75 7.5 S 8.5 6.045 8.5 4.25 Z m 1.0 7.5 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 S 14.0 10.507 14.0 11.75 S 12.993 14.0 11.75 14.0 S 9.5 12.993 9.5 11.75 Z m 2.25 -3.25 c -1.795 0.0 -3.25 1.455 -3.25 3.25 S 9.955 15.0 11.75 15.0 S 15.0 13.545 15.0 11.75 S 13.545 8.5 11.75 8.5 Z")
        )
    }.build()
}

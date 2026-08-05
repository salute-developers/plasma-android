package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOnFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOnFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.75 3.5 C 13.097 3.5 15.0 5.403 15.0 7.75 S 13.097 12.0 10.75 12.0 h -5.5 C 2.903 12.0 1.0 10.097 1.0 7.75 S 2.903 3.5 5.25 3.5 h 5.5 Z m 0.0 2.0 C 9.507 5.5 8.5 6.507 8.5 7.75 S 9.507 10.0 10.75 10.0 S 13.0 8.993 13.0 7.75 S 11.993 5.5 10.75 5.5 Z")
        )
    }.build()
}

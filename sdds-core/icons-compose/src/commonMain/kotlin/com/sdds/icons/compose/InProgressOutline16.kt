package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.0 c 3.866 0.0 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 Z m 0.0 1.0 C 4.686 2.0 2.0 4.686 2.0 8.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 Z m 3.0 4.0 c 1.105 0.0 2.0 0.895 2.0 2.0 s -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 Z M 4.0 7.0 c 0.552 0.0 1.0 0.448 1.0 1.0 S 4.552 9.0 4.0 9.0 S 3.0 8.552 3.0 8.0 s 0.448 -1.0 1.0 -1.0 Z m 3.0 0.0 c 0.552 0.0 1.0 0.448 1.0 1.0 S 7.552 9.0 7.0 9.0 S 6.0 8.552 6.0 8.0 s 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}

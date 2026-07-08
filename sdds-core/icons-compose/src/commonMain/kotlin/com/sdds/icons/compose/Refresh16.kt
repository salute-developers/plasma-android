package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Refresh16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Refresh16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 C 4.686 2.0 2.0 4.686 2.0 8.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 1.0 8.276 1.0 8.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 c 2.547 0.0 4.775 1.36 6.0 3.393 V 2.944 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 2.528 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -0.498 h -0.023 h -2.007 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.21 C 12.14 3.194 10.208 2.0 8.0 2.0 Z m 6.5 5.5 C 14.776 7.5 15.0 7.724 15.0 8.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 c -2.547 0.0 -4.775 -1.36 -6.0 -3.393 v 1.449 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 1.0 13.332 1.0 13.056 v -2.528 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.498 h 0.023 h 2.007 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.21 C 3.86 12.806 5.792 14.0 8.0 14.0 c 3.314 0.0 6.0 -2.686 6.0 -6.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}

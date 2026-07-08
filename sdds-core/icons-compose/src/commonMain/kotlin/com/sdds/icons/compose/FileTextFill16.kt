package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileTextFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileTextFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.748 2.242 C 2.5 2.73 2.5 3.366 2.5 4.64 v 6.72 c 0.0 1.274 0.0 1.911 0.248 2.398 c 0.218 0.428 0.566 0.776 0.994 0.994 C 4.23 15.0 4.866 15.0 6.14 15.0 h 3.72 c 1.274 0.0 1.911 0.0 2.398 -0.248 c 0.428 -0.218 0.776 -0.566 0.994 -0.994 C 13.5 13.27 13.5 12.634 13.5 11.36 V 4.64 c 0.0 -1.274 0.0 -1.911 -0.248 -2.398 c -0.218 -0.428 -0.566 -0.776 -0.994 -0.994 C 11.77 1.0 11.134 1.0 9.86 1.0 H 6.14 C 4.866 1.0 4.229 1.0 3.742 1.248 C 3.314 1.466 2.966 1.814 2.748 2.242 Z M 5.25 3.3 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.062 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 5.25 Z m 0.0 2.8 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z m 0.0 2.8 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z m 0.0 2.8 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z")
        )
    }.build()
}

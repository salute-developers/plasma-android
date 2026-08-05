package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnAdd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnAdd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.462 5.5 5.5 S 20.538 23.0 17.5 23.0 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 Z m 0.0 2.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 V 17.0 h -2.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 17.0 v 2.5 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 18.0 h 2.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 20.776 17.0 20.5 17.0 H 18.0 v -2.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 2.0 C 18.433 2.0 20.0 3.567 20.0 5.5 v 5.998 c -0.448 -0.187 -0.92 -0.323 -1.412 -0.406 V 5.5 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 h -1.882 c -1.104 0.0 -2.0 0.895 -2.0 2.0 v 7.611 c -0.636 0.695 -1.124 1.529 -1.412 2.45 V 5.5 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 H 7.412 c -1.104 0.0 -2.0 0.895 -2.0 2.0 v 13.0 c 0.0 1.105 0.896 2.0 2.0 2.0 h 1.882 c 0.894 0.0 1.65 -0.587 1.906 -1.396 c 0.28 1.106 0.845 2.098 1.612 2.896 H 7.5 C 5.567 22.0 4.0 20.433 4.0 18.5 v -13.0 C 4.0 3.567 5.567 2.0 7.5 2.0 h 9.0 Z")
        )
    }.build()
}

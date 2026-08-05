package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowAdd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowAdd24",
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
            pathData = addPathNodes("M 18.5 4.0 C 20.433 4.0 22.0 5.567 22.0 7.5 v 5.312 c -0.798 -0.767 -1.79 -1.331 -2.896 -1.612 c 0.809 -0.256 1.396 -1.012 1.396 -1.906 V 7.412 c 0.0 -1.104 -0.895 -2.0 -2.0 -2.0 h -13.0 c -1.105 0.0 -2.0 0.896 -2.0 2.0 v 1.882 c 0.0 1.104 0.895 2.0 2.0 2.0 h 10.062 c -0.922 0.288 -1.756 0.775 -2.45 1.412 H 5.5 c -1.105 0.0 -2.0 0.896 -2.0 2.0 v 1.882 c 0.0 1.104 0.895 2.0 2.0 2.0 h 5.593 c 0.083 0.491 0.22 0.964 0.406 1.412 H 5.5 C 3.567 20.0 2.0 18.433 2.0 16.5 v -9.0 C 2.0 5.567 3.567 4.0 5.5 4.0 h 13.0 Z")
        )
    }.build()
}

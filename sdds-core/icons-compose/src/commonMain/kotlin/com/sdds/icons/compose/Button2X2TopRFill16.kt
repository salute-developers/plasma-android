package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopRFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopRFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.45 1.026 c 0.856 0.0 1.55 0.694 1.55 1.55 V 5.82 c 0.0 0.856 -0.694 1.55 -1.55 1.55 h -3.243 c -0.856 0.0 -1.55 -0.694 -1.55 -1.55 V 2.576 c 0.0 -0.856 0.694 -1.55 1.55 -1.55 h 3.243 Z M 14.0 2.576 c 0.0 -0.303 -0.246 -0.55 -0.55 -0.55 h -3.243 c -0.304 0.0 -0.55 0.247 -0.55 0.55 V 5.82 c 0.0 0.304 0.246 0.55 0.55 0.55 h 3.243 c 0.304 0.0 0.55 -0.246 0.55 -0.55 V 2.576 Z M 5.263 1.703 c 0.677 0.0 1.225 0.549 1.225 1.225 v 2.536 c 0.0 0.677 -0.548 1.225 -1.225 1.225 H 2.727 c -0.677 0.0 -1.225 -0.548 -1.225 -1.225 V 2.928 c 0.0 -0.676 0.548 -1.225 1.225 -1.225 h 2.536 Z m 1.225 9.061 c 0.0 -0.676 -0.548 -1.225 -1.225 -1.225 H 2.727 c -0.677 0.0 -1.225 0.549 -1.225 1.225 V 13.3 c 0.0 0.677 0.548 1.225 1.225 1.225 h 2.536 c 0.677 0.0 1.225 -0.548 1.225 -1.225 v -2.536 Z M 13.1 9.54 c 0.677 0.0 1.225 0.549 1.225 1.225 V 13.3 c 0.0 0.677 -0.548 1.225 -1.225 1.225 h -2.536 c -0.677 0.0 -1.225 -0.548 -1.225 -1.225 v -2.536 c 0.0 -0.676 0.548 -1.225 1.225 -1.225 h 2.536 Z")
        )
    }.build()
}

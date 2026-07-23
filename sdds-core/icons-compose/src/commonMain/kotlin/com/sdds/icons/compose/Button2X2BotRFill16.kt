package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2BotRFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2BotRFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 13.45 c 0.0 0.856 -0.694 1.55 -1.55 1.55 h -3.242 c -0.856 0.0 -1.55 -0.694 -1.55 -1.55 v -3.243 c 0.0 -0.856 0.694 -1.55 1.55 -1.55 h 3.242 c 0.856 0.0 1.55 0.694 1.55 1.55 v 3.243 Z M 13.45 14.0 c 0.304 0.0 0.55 -0.246 0.55 -0.55 v -3.243 c 0.0 -0.304 -0.246 -0.55 -0.55 -0.55 h -3.242 c -0.304 0.0 -0.55 0.246 -0.55 0.55 v 3.243 c 0.0 0.304 0.246 0.55 0.55 0.55 h 3.242 Z m 0.872 -8.738 c 0.0 0.677 -0.548 1.225 -1.225 1.225 h -2.536 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 V 2.726 c 0.0 -0.677 0.549 -1.225 1.225 -1.225 h 2.536 c 0.677 0.0 1.225 0.548 1.225 1.225 v 2.536 Z m -9.06 1.225 c 0.676 0.0 1.224 -0.548 1.224 -1.225 V 2.726 c 0.0 -0.677 -0.548 -1.225 -1.225 -1.225 H 2.725 C 2.05 1.5 1.5 2.049 1.5 2.726 v 2.536 c 0.0 0.677 0.549 1.225 1.225 1.225 h 2.536 Z M 6.485 13.1 c 0.0 0.677 -0.548 1.225 -1.225 1.225 H 2.725 C 2.05 14.324 1.5 13.776 1.5 13.1 v -2.537 c 0.0 -0.676 0.549 -1.224 1.225 -1.224 h 2.536 c 0.677 0.0 1.225 0.548 1.225 1.225 v 2.536 Z")
        )
    }.build()
}

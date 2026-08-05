package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2BotLFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2BotLFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.025 13.45 c 0.0 0.856 0.694 1.55 1.55 1.55 h 3.242 c 0.857 0.0 1.55 -0.694 1.55 -1.55 v -3.243 c 0.0 -0.856 -0.693 -1.55 -1.55 -1.55 H 2.575 c -0.856 0.0 -1.55 0.694 -1.55 1.55 v 3.243 Z M 2.575 14.0 c -0.303 0.0 -0.55 -0.246 -0.55 -0.55 v -3.243 c 0.0 -0.304 0.247 -0.55 0.55 -0.55 h 3.242 c 0.304 0.0 0.55 0.246 0.55 0.55 v 3.243 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 2.575 Z M 1.703 5.262 c 0.0 0.677 0.549 1.225 1.225 1.225 h 2.536 c 0.677 0.0 1.225 -0.548 1.225 -1.225 V 2.726 C 6.69 2.049 6.141 1.5 5.464 1.5 H 2.928 c -0.676 0.0 -1.225 0.548 -1.225 1.225 v 2.536 Z m 9.061 1.225 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 V 2.726 c 0.0 -0.677 0.549 -1.225 1.225 -1.225 H 13.3 c 0.677 0.0 1.225 0.548 1.225 1.225 v 2.536 c 0.0 0.677 -0.548 1.225 -1.225 1.225 h -2.536 Z M 9.54 13.1 c 0.0 0.677 0.549 1.225 1.225 1.225 H 13.3 c 0.677 0.0 1.225 -0.548 1.225 -1.225 v -2.537 c 0.0 -0.676 -0.548 -1.224 -1.225 -1.224 h -2.536 c -0.676 0.0 -1.225 0.548 -1.225 1.225 v 2.536 Z")
        )
    }.build()
}

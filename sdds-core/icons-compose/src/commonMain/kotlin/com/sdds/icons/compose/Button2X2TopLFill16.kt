package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopLFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopLFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.575 1.025 c -0.856 0.0 -1.55 0.694 -1.55 1.55 v 3.232 c 0.0 0.856 0.694 1.55 1.55 1.55 h 3.232 c 0.856 0.0 1.55 -0.694 1.55 -1.55 V 2.575 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 H 2.575 Z m -0.55 1.55 c 0.0 -0.303 0.247 -0.55 0.55 -0.55 h 3.232 c 0.304 0.0 0.55 0.247 0.55 0.55 v 3.232 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 2.575 c -0.303 0.0 -0.55 -0.246 -0.55 -0.55 V 2.575 Z m 8.721 -0.873 c -0.676 0.0 -1.225 0.549 -1.225 1.225 v 2.527 c 0.0 0.676 0.549 1.225 1.225 1.225 h 2.527 c 0.677 0.0 1.225 -0.549 1.225 -1.225 V 2.927 c 0.0 -0.676 -0.548 -1.225 -1.225 -1.225 h -2.527 Z m -1.225 9.046 c 0.0 -0.677 0.549 -1.226 1.225 -1.226 h 2.527 c 0.677 0.0 1.225 0.549 1.225 1.226 v 2.526 c 0.0 0.677 -0.548 1.225 -1.225 1.225 h -2.527 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 v -2.526 Z M 2.926 9.521 c -0.676 0.0 -1.225 0.549 -1.225 1.226 v 2.526 c 0.0 0.677 0.549 1.225 1.225 1.225 h 2.527 c 0.676 0.0 1.225 -0.548 1.225 -1.225 v -2.526 c 0.0 -0.677 -0.549 -1.226 -1.225 -1.226 H 2.926 Z")
        )
    }.build()
}

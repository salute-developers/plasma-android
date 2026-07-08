package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.749 3.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 8.249 2.586 8.249 3.0 v 4.0 h -0.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 3.41 c 0.0 1.272 0.51 2.485 1.406 3.373 l -4.422 4.422 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 12.41 -12.409 l 1.063 -1.063 l 3.498 -3.498 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.061 0.0 L 15.938 7.0 H 15.75 V 3.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 4.0 h -4.5 V 3.0 Z m 4.69 5.5 h -6.69 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 3.41 c 0.0 0.872 0.35 1.704 0.966 2.313 L 14.438 8.5 Z m -4.94 9.182 l 1.2 -1.2 c 0.194 0.286 0.3 0.626 0.3 0.978 v 3.04 h 2.0 v -3.04 c 0.0 -0.51 0.223 -0.996 0.611 -1.329 l 1.754 -1.503 c 0.72 -0.618 1.135 -1.519 1.135 -2.468 v -1.478 l 1.5 -1.5 v 2.978 c 0.0 1.387 -0.606 2.704 -1.659 3.607 l -1.754 1.503 c -0.055 0.048 -0.087 0.117 -0.087 0.19 V 22.0 h -5.0 v -4.318 Z")
        )
    }.build()
}

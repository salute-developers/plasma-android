package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery100Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery100Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 2.0 C 9.448 2.0 9.0 2.448 9.0 3.0 v 1.108 C 8.712 4.16 8.468 4.236 8.247 4.348 c -0.602 0.308 -1.091 0.797 -1.398 1.4 C 6.5 6.431 6.5 7.327 6.5 9.12 v 7.76 c 0.0 1.792 0.0 2.688 0.349 3.373 c 0.307 0.602 0.796 1.091 1.398 1.398 C 8.932 22.0 9.827 22.0 11.62 22.0 h 0.76 c 1.792 0.0 2.688 0.0 3.373 -0.349 c 0.602 -0.307 1.091 -0.796 1.398 -1.398 c 0.349 -0.685 0.349 -1.58 0.349 -3.373 V 9.12 c 0.0 -1.792 0.0 -2.688 -0.349 -3.373 c -0.307 -0.602 -0.796 -1.091 -1.398 -1.398 c -0.221 -0.113 -0.465 -0.19 -0.753 -0.24 V 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -4.0 Z M 9.0 20.5 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 19.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 9.0 Z m -1.0 -3.1 c 0.0 0.276 0.224 0.5 0.5 0.5 h 7.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -7.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.0 Z m 0.5 -2.1 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -1.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -7.0 Z M 8.0 12.2 c 0.0 0.276 0.224 0.5 0.5 0.5 h 7.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -7.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.0 Z m 0.5 -2.1 C 8.224 10.1 8.0 9.876 8.0 9.6 v -1.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -7.0 Z M 8.0 7.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 7.0 C 15.776 7.5 16.0 7.276 16.0 7.0 V 6.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 9.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 V 7.0 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery80Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery80Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 3.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.108 c 0.288 0.052 0.532 0.128 0.753 0.24 c 0.602 0.308 1.091 0.797 1.398 1.4 C 17.5 6.431 17.5 7.327 17.5 9.12 v 7.76 c 0.0 1.792 0.0 2.688 -0.349 3.373 c -0.307 0.602 -0.796 1.091 -1.398 1.398 C 15.068 22.0 14.173 22.0 12.38 22.0 h -0.76 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 6.5 19.568 6.5 18.673 6.5 16.88 V 9.12 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 8.468 4.236 8.712 4.159 9.0 4.109 V 3.0 Z M 8.0 19.5 c 0.0 0.552 0.448 1.0 1.0 1.0 h 6.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 19.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -7.0 C 8.224 18.5 8.0 18.724 8.0 19.0 v 0.5 Z m 0.5 -1.6 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -1.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -7.0 Z M 8.0 14.8 c 0.0 0.276 0.224 0.5 0.5 0.5 h 7.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -7.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.0 Z m 0.5 -2.1 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -1.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -7.0 Z M 8.0 9.6 c 0.0 0.276 0.224 0.5 0.5 0.5 h 7.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -7.0 C 8.224 8.1 8.0 8.324 8.0 8.6 v 1.0 Z")
        )
    }.build()
}

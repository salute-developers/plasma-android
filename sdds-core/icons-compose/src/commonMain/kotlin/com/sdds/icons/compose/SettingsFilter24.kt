package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 9.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 16.828 6.5 16.0 6.5 S 14.5 7.172 14.5 8.0 s 0.672 1.5 1.5 1.5 Z m 0.0 1.5 c 1.398 0.0 2.573 -0.956 2.905 -2.25 H 21.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.414 7.25 21.0 7.25 h -2.095 C 18.573 5.956 17.398 5.0 16.0 5.0 s -2.572 0.956 -2.905 2.25 H 3.0 C 2.586 7.25 2.25 7.586 2.25 8.0 S 2.586 8.75 3.0 8.75 h 10.095 C 13.427 10.044 14.601 11.0 16.0 11.0 Z m -8.0 6.5 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 s -0.672 1.5 -1.5 1.5 Z M 8.0 19.0 c -1.398 0.0 -2.572 -0.956 -2.905 -2.25 H 3.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 2.586 15.25 3.0 15.25 h 2.095 C 5.428 13.956 6.602 13.0 8.0 13.0 s 2.572 0.956 2.905 2.25 H 21.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 10.905 C 10.573 18.044 9.399 19.0 8.0 19.0 Z")
        )
    }.build()
}

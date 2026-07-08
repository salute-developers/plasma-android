package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.837 15.181 C 20.0 14.861 20.0 14.441 20.0 13.6 V 7.4 c 0.0 -0.84 0.0 -1.26 -0.163 -1.581 c -0.144 -0.282 -0.374 -0.512 -0.656 -0.656 C 18.861 5.0 18.441 5.0 17.6 5.0 H 6.4 C 5.56 5.0 5.14 5.0 4.819 5.163 C 4.537 5.307 4.307 5.537 4.163 5.82 C 4.0 6.139 4.0 6.559 4.0 7.4 v 6.2 c 0.0 0.84 0.0 1.26 0.163 1.581 c 0.144 0.282 0.374 0.512 0.656 0.655 C 5.139 16.0 5.559 16.0 6.4 16.0 h 11.2 c 0.84 0.0 1.26 0.0 1.581 -0.164 c 0.282 -0.143 0.512 -0.373 0.655 -0.655 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 17.0 C 2.336 17.0 2.0 17.336 2.0 17.75 s 0.336 0.75 0.75 0.75 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.664 17.0 21.25 17.0 H 2.75 Z")
        )
    }.build()
}

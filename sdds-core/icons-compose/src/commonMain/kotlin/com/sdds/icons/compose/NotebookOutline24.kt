package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.074 16.0 c 0.19 0.0 0.374 0.0 0.53 -0.013 c 0.171 -0.014 0.373 -0.047 0.577 -0.15 c 0.282 -0.144 0.512 -0.374 0.655 -0.656 c 0.104 -0.204 0.137 -0.406 0.151 -0.577 C 20.0 14.448 20.0 14.264 20.0 14.074 V 6.926 c 0.0 -0.19 0.0 -0.374 -0.013 -0.53 c -0.014 -0.171 -0.047 -0.373 -0.15 -0.577 c -0.144 -0.282 -0.374 -0.512 -0.656 -0.656 c -0.204 -0.103 -0.406 -0.136 -0.577 -0.15 C 18.448 5.0 18.264 5.0 18.074 5.0 H 5.926 c -0.19 0.0 -0.374 0.0 -0.53 0.013 C 5.225 5.027 5.023 5.06 4.82 5.163 C 4.537 5.307 4.307 5.537 4.163 5.82 C 4.06 6.023 4.027 6.225 4.013 6.396 C 4.0 6.552 4.0 6.736 4.0 6.926 v 7.148 c 0.0 0.19 0.0 0.374 0.013 0.53 c 0.014 0.171 0.047 0.373 0.15 0.577 c 0.144 0.282 0.374 0.512 0.656 0.655 c 0.204 0.104 0.406 0.137 0.577 0.151 C 5.552 16.0 5.736 16.0 5.926 16.0 h 12.148 Z m 0.418 -1.518 v 0.01 h -0.01 C 18.393 14.5 18.271 14.5 18.05 14.5 H 5.95 c -0.222 0.0 -0.344 0.0 -0.432 -0.008 h -0.01 v -0.01 C 5.5 14.394 5.5 14.271 5.5 14.05 v -7.1 c 0.0 -0.222 0.0 -0.344 0.008 -0.432 v -0.01 h 0.01 C 5.606 6.5 5.728 6.5 5.95 6.5 h 12.1 c 0.222 0.0 0.344 0.0 0.431 0.008 h 0.01 l 0.001 0.01 C 18.5 6.606 18.5 6.728 18.5 6.95 v 7.1 c 0.0 0.222 0.0 0.344 -0.008 0.431 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 17.0 C 2.336 17.0 2.0 17.336 2.0 17.75 s 0.336 0.75 0.75 0.75 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.664 17.0 21.25 17.0 H 2.75 Z")
        )
    }.build()
}

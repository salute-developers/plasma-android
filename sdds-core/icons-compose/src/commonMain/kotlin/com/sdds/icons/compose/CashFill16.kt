package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.25 11.6 V 6.0 c 0.0 -0.49 0.0 -0.735 -0.096 -0.923 c -0.084 -0.164 -0.217 -0.298 -0.382 -0.382 c -0.131 -0.067 -0.29 -0.087 -0.543 -0.093 V 9.53 c 0.0 0.218 0.0 0.44 -0.015 0.63 c -0.017 0.21 -0.059 0.472 -0.194 0.738 c -0.185 0.362 -0.48 0.657 -0.842 0.841 c -0.266 0.136 -0.528 0.177 -0.738 0.195 c -0.19 0.015 -0.412 0.015 -0.63 0.015 H 2.82 c 0.003 0.235 0.014 0.377 0.06 0.496 c 0.09 0.226 0.268 0.405 0.495 0.494 c 0.154 0.06 0.348 0.06 0.737 0.06 h 9.738 c 0.49 0.0 0.735 0.0 0.922 -0.095 c 0.165 -0.084 0.298 -0.217 0.382 -0.382 c 0.096 -0.187 0.096 -0.432 0.096 -0.922 Z M 11.78 2.5 c 0.49 0.0 0.736 0.0 0.923 0.095 c 0.164 0.084 0.298 0.218 0.382 0.383 c 0.095 0.187 0.095 0.432 0.095 0.922 v 5.6 c 0.0 0.49 0.0 0.735 -0.095 0.922 c -0.084 0.165 -0.218 0.299 -0.382 0.383 C 12.516 10.9 12.27 10.9 11.78 10.9 h -9.63 c -0.49 0.0 -0.735 0.0 -0.922 -0.095 c -0.164 -0.084 -0.298 -0.218 -0.382 -0.383 C 0.75 10.235 0.75 9.99 0.75 9.5 V 3.9 c 0.0 -0.49 0.0 -0.735 0.096 -0.922 c 0.084 -0.165 0.218 -0.299 0.382 -0.383 C 1.416 2.5 1.661 2.5 2.151 2.5 h 9.63 Z M 6.967 5.275 c -0.766 0.0 -1.399 0.632 -1.399 1.425 c 0.0 0.794 0.633 1.425 1.4 1.425 c 0.765 0.0 1.398 -0.631 1.398 -1.425 c 0.0 -0.793 -0.633 -1.425 -1.399 -1.425 Z M 4.568 6.7 c 0.0 -1.332 1.068 -2.425 2.4 -2.425 c 1.33 0.0 2.398 1.093 2.398 2.425 c 0.0 1.333 -1.068 2.425 -2.399 2.425 S 4.568 8.033 4.568 6.7 Z")
        )
    }.build()
}

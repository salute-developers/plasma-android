package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RedCrossOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RedCrossOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 1f,
            strokeLineJoin = StrokeJoin.Round,
            pathData = addPathNodes("M 5.793 1.882 C 5.717 2.032 5.717 2.228 5.717 2.62 v 3.097 H 2.62 c -0.392 0.0 -0.588 0.0 -0.738 0.076 C 1.75 5.86 1.643 5.967 1.576 6.1 C 1.5 6.249 1.5 6.445 1.5 6.837 v 2.327 c 0.0 0.392 0.0 0.588 0.076 0.738 c 0.067 0.132 0.174 0.239 0.306 0.306 c 0.15 0.076 0.346 0.076 0.738 0.076 h 3.097 v 3.096 c 0.0 0.392 0.0 0.588 0.076 0.738 c 0.067 0.131 0.174 0.239 0.306 0.306 C 6.249 14.5 6.445 14.5 6.837 14.5 h 2.327 c 0.392 0.0 0.588 0.0 0.738 -0.076 c 0.132 -0.067 0.239 -0.175 0.306 -0.306 c 0.076 -0.15 0.076 -0.346 0.076 -0.738 v -3.096 h 3.096 c 0.392 0.0 0.588 0.0 0.738 -0.076 c 0.131 -0.067 0.239 -0.174 0.306 -0.306 C 14.5 9.752 14.5 9.556 14.5 9.164 V 6.837 c 0.0 -0.392 0.0 -0.588 -0.076 -0.738 c -0.067 -0.132 -0.175 -0.239 -0.306 -0.306 c -0.15 -0.076 -0.346 -0.076 -0.738 -0.076 h -3.096 V 2.62 c 0.0 -0.392 0.0 -0.588 -0.076 -0.738 c -0.067 -0.132 -0.174 -0.239 -0.306 -0.306 C 9.752 1.5 9.556 1.5 9.164 1.5 H 6.837 c -0.392 0.0 -0.588 0.0 -0.738 0.076 C 5.967 1.643 5.86 1.75 5.793 1.882 Z")
        )
    }.build()
}

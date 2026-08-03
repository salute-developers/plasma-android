package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicWithLightFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicWithLightFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.309 2.12 c 0.058 -0.188 0.324 -0.188 0.382 0.0 l 0.204 0.663 c 0.195 0.633 0.69 1.127 1.322 1.322 L 14.88 4.31 c 0.188 0.058 0.188 0.324 0.0 0.382 l -0.663 0.204 c -0.632 0.195 -1.127 0.69 -1.322 1.322 l -0.204 0.663 c -0.058 0.188 -0.324 0.188 -0.382 0.0 l -0.205 -0.663 c -0.195 -0.632 -0.69 -1.127 -1.321 -1.322 L 10.12 4.692 c -0.189 -0.058 -0.189 -0.324 0.0 -0.382 l 0.663 -0.205 c 0.632 -0.195 1.126 -0.69 1.321 -1.322 l 0.205 -0.662 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.262 7.223 c 0.076 -0.23 0.4 -0.23 0.475 0.0 l 0.28 0.849 c 0.297 0.905 1.007 1.615 1.912 1.912 l 0.849 0.28 c 0.229 0.075 0.229 0.399 0.0 0.474 l -0.849 0.28 c -0.905 0.297 -1.615 1.007 -1.913 1.912 l -0.279 0.849 c -0.075 0.229 -0.4 0.229 -0.475 0.0 L 4.983 12.93 c -0.297 -0.905 -1.007 -1.615 -1.912 -1.913 l -0.85 -0.279 c -0.228 -0.075 -0.228 -0.4 0.0 -0.475 l 0.85 -0.279 c 0.905 -0.297 1.615 -1.007 1.912 -1.912 l 0.28 -0.85 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 9.22 c 0.0 -0.981 -0.925 -1.698 -1.875 -1.453 l -6.25 1.613 c -0.662 0.17 -1.125 0.768 -1.125 1.452 v 6.377 c -0.306 -0.134 -0.645 -0.208 -1.0 -0.208 c -1.38 0.0 -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 v -5.669 l 6.25 -1.613 v 3.99 C 19.194 16.075 18.855 16.0 18.5 16.0 c -1.38 0.0 -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 V 9.22 Z")
        )
    }.build()
}

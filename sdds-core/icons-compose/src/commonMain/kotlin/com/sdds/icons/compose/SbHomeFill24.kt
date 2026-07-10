package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbHomeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbHomeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.125 13.25 h -1.0 V 12.5 h 1.0 v 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.125 11.75 h -1.0 V 11.0 h 1.0 v 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.25 4.25 C 21.664 4.25 22.0 4.586 22.0 5.0 c 0.0 0.298 -0.175 0.553 -0.427 0.674 c 0.067 0.202 0.086 0.4 0.088 0.584 c 0.003 0.216 -0.017 0.477 -0.038 0.763 l -0.713 9.807 c -0.027 0.38 -0.052 0.71 -0.093 0.979 c -0.042 0.278 -0.11 0.553 -0.261 0.815 c -0.226 0.393 -0.565 0.708 -0.973 0.904 c -0.272 0.132 -0.551 0.181 -0.832 0.204 c -0.272 0.021 -0.601 0.02 -0.982 0.02 H 6.23 c -0.38 0.0 -0.71 0.001 -0.982 -0.02 c -0.28 -0.023 -0.56 -0.072 -0.832 -0.204 c -0.408 -0.196 -0.747 -0.511 -0.973 -0.904 c -0.15 -0.262 -0.219 -0.537 -0.261 -0.815 c -0.042 -0.27 -0.066 -0.599 -0.093 -0.979 L 2.377 7.021 c -0.02 -0.286 -0.04 -0.547 -0.038 -0.763 c 0.002 -0.183 0.02 -0.382 0.087 -0.584 C 2.174 5.553 2.0 5.298 2.0 5.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 18.5 Z m -13.75 6.0 c -0.207 0.0 -0.375 0.168 -0.375 0.375 v 3.0 C 7.125 13.832 7.293 14.0 7.5 14.0 s 0.375 -0.168 0.375 -0.375 v -3.0 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 Z m 1.5 0.0 c -0.345 0.0 -0.625 0.28 -0.625 0.625 v 2.5 C 8.375 13.72 8.655 14.0 9.0 14.0 h 1.25 c 0.345 0.0 0.625 -0.28 0.625 -0.625 v -2.5 c 0.0 -0.345 -0.28 -0.625 -0.625 -0.625 H 9.0 Z m 6.25 0.0 c -0.207 0.0 -0.375 0.168 -0.375 0.375 v 1.125 h -1.0 v -1.125 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 s -0.375 0.168 -0.375 0.375 v 1.25 c 0.0 0.345 0.28 0.625 0.625 0.625 h 1.125 v 1.125 c 0.0 0.207 0.168 0.375 0.375 0.375 s 0.375 -0.168 0.375 -0.375 v -3.0 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 Z m 1.25 0.0 c -0.207 0.0 -0.375 0.168 -0.375 0.375 v 3.0 c 0.0 0.207 0.168 0.375 0.375 0.375 s 0.375 -0.168 0.375 -0.375 v -3.0 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 Z M 12.0 12.375 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 Z m 0.0 -1.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 Z")
        )
    }.build()
}

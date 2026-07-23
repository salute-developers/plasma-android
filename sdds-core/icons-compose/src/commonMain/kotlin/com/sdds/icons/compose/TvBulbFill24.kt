package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.53 4.0 h 16.94 c 0.122 0.0 0.255 0.0 0.37 0.01 c 0.13 0.01 0.3 0.036 0.477 0.126 c 0.236 0.12 0.427 0.311 0.547 0.547 c 0.09 0.176 0.116 0.348 0.127 0.478 C 22.0 5.275 22.0 5.408 22.0 5.53 V 11.0 c -0.912 -1.215 -2.364 -2.0 -4.0 -2.0 c -2.761 0.0 -5.0 2.239 -5.0 5.0 c 0.0 1.126 0.372 2.164 1.0 3.0 H 3.53 c -0.122 0.0 -0.255 0.0 -0.37 -0.01 c -0.13 -0.01 -0.3 -0.036 -0.477 -0.126 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.547 c -0.09 -0.176 -0.116 -0.348 -0.127 -0.478 C 2.0 15.725 2.0 15.592 2.0 15.47 V 5.53 c 0.0 -0.122 0.0 -0.255 0.01 -0.37 c 0.01 -0.13 0.036 -0.3 0.126 -0.477 c 0.12 -0.236 0.311 -0.427 0.547 -0.547 C 2.859 4.046 3.03 4.02 3.16 4.01 C 3.275 4.0 3.408 4.0 3.53 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 18.0 H 4.0 v 1.5 h 11.0 V 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.995 18.524 c 0.036 -0.18 0.091 -0.355 0.16 -0.524 h -4.31 c 0.069 0.169 0.124 0.343 0.16 0.524 l 0.2 1.005 C 16.378 20.384 17.129 21.0 18.0 21.0 c 0.872 0.0 1.623 -0.616 1.794 -1.47 l 0.201 -1.006 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.137 16.483 c -0.135 0.17 -0.27 0.34 -0.398 0.517 h -5.478 c -0.128 -0.176 -0.263 -0.348 -0.397 -0.517 C 14.322 15.8 14.0 14.938 14.0 14.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 c 0.0 0.938 -0.323 1.8 -0.863 2.483 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvBulbOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvBulbOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 17.0 c -0.337 -0.448 -0.6 -0.954 -0.771 -1.5 H 3.5 v -10.0 h 17.0 v 4.169 c 0.585 0.338 1.096 0.792 1.5 1.33 V 5.137 c 0.0 -0.058 0.0 -0.139 -0.006 -0.212 c -0.007 -0.088 -0.026 -0.229 -0.103 -0.379 c -0.096 -0.188 -0.249 -0.341 -0.437 -0.437 c -0.15 -0.076 -0.29 -0.096 -0.379 -0.103 C 21.002 4.0 20.921 4.0 20.863 4.0 H 3.137 C 3.079 4.0 2.998 4.0 2.925 4.006 C 2.837 4.013 2.696 4.033 2.546 4.109 C 2.358 4.205 2.205 4.358 2.109 4.546 c -0.076 0.15 -0.096 0.29 -0.103 0.379 C 2.0 4.998 2.0 5.079 2.0 5.137 v 10.726 c 0.0 0.058 0.0 0.139 0.006 0.212 c 0.007 0.088 0.027 0.229 0.103 0.379 c 0.096 0.188 0.249 0.341 0.437 0.437 c 0.15 0.077 0.29 0.096 0.379 0.103 C 2.998 17.0 3.079 17.0 3.137 17.0 H 14.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 18.0 h 11.0 v 1.5 H 4.0 V 18.0 Z")
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

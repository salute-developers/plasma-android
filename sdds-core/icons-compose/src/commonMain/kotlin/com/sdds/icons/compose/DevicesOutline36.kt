package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DevicesOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DevicesOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.295 25.5 c 0.086 0.0 0.208 0.0 0.318 -0.009 c 0.132 -0.01 0.343 -0.04 0.568 -0.154 c 0.282 -0.144 0.512 -0.374 0.656 -0.656 c 0.114 -0.225 0.143 -0.436 0.154 -0.568 c 0.01 -0.11 0.01 -0.232 0.009 -0.318 V 7.705 c 0.0 -0.086 0.0 -0.208 -0.009 -0.318 c -0.01 -0.132 -0.04 -0.343 -0.154 -0.568 c -0.144 -0.282 -0.374 -0.512 -0.656 -0.655 c -0.225 -0.115 -0.436 -0.144 -0.568 -0.155 c -0.11 -0.01 -0.232 -0.01 -0.318 -0.009 H 4.705 C 4.62 6.0 4.497 6.0 4.387 6.009 c -0.132 0.01 -0.343 0.04 -0.568 0.155 c -0.282 0.143 -0.512 0.373 -0.655 0.655 C 3.049 7.044 3.02 7.255 3.009 7.387 C 2.999 7.497 3.0 7.62 3.0 7.705 v 16.09 c 0.0 0.086 0.0 0.208 0.009 0.318 c 0.01 0.132 0.04 0.343 0.155 0.568 c 0.143 0.282 0.373 0.512 0.655 0.655 c 0.225 0.115 0.436 0.144 0.568 0.155 c 0.11 0.01 0.232 0.01 0.318 0.009 H 17.25 v -2.25 h -12.0 v -15.0 h 25.5 V 25.5 h 0.545 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 27.0 h 11.25 v 2.25 H 6.0 V 27.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 18.9 c 0.0 -0.84 0.0 -1.26 0.163 -1.581 c 0.144 -0.282 0.374 -0.512 0.656 -0.655 c 0.32 -0.164 0.74 -0.164 1.581 -0.164 h 4.2 c 0.84 0.0 1.26 0.0 1.581 0.163 c 0.282 0.144 0.512 0.374 0.655 0.656 c 0.164 0.32 0.164 0.74 0.164 1.581 v 10.2 c 0.0 0.84 0.0 1.26 -0.163 1.581 c -0.144 0.282 -0.374 0.512 -0.656 0.655 c -0.32 0.164 -0.74 0.164 -1.581 0.164 h -4.2 c -0.84 0.0 -1.26 0.0 -1.581 -0.163 c -0.282 -0.144 -0.512 -0.374 -0.655 -0.656 c -0.164 -0.32 -0.164 -0.74 -0.164 -1.581 V 18.9 Z m 1.5 9.975 c 0.0 -0.207 0.168 -0.375 0.375 -0.375 h 5.25 c 0.207 0.0 0.375 0.168 0.375 0.375 v 0.75 C 27.0 29.832 26.832 30.0 26.625 30.0 h -5.25 C 21.168 30.0 21.0 29.832 21.0 29.625 v -0.75 Z")
        )
    }.build()
}

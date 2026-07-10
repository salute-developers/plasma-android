package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.3 2.022 c 0.351 -0.1 0.7 0.164 0.7 0.529 v 1.041 L 6.549 5.415 V 4.063 c 0.0 -0.246 0.163 -0.462 0.4 -0.53 L 12.3 2.023 Z m 0.7 7.45 v -4.84 L 6.549 6.453 v 6.289 c 0.0 1.25 -1.024 2.254 -2.275 2.254 c -1.25 0.0 -2.274 -1.004 -2.274 -2.254 s 1.023 -2.255 2.274 -2.255 c 0.471 0.0 0.91 0.143 1.275 0.388 V 4.063 c 0.0 -0.694 0.46 -1.303 1.128 -1.492 l 5.351 -1.512 C 13.018 0.78 14.0 1.523 14.0 2.551 v 8.788 c 0.0 1.25 -1.024 2.254 -2.275 2.254 c -1.25 0.0 -2.274 -1.004 -2.274 -2.254 s 1.024 -2.255 2.274 -2.255 c 0.472 0.0 0.91 0.143 1.275 0.388 Z m -1.275 0.612 c -0.709 0.0 -1.274 0.567 -1.274 1.255 c 0.0 0.687 0.565 1.254 1.274 1.254 c 0.709 0.0 1.274 -0.567 1.274 -1.254 c 0.0 -0.688 -0.565 -1.255 -1.274 -1.255 Z m -7.451 1.404 C 3.565 11.488 3.0 12.055 3.0 12.743 c 0.0 0.687 0.565 1.254 1.274 1.254 c 0.709 0.0 1.274 -0.567 1.274 -1.254 c 0.0 -0.688 -0.565 -1.255 -1.274 -1.255 Z")
        )
    }.build()
}

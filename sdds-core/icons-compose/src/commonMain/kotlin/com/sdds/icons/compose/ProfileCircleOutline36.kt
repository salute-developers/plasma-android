package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 3.294 -1.224 6.3 -3.244 8.592 c -2.102 -2.414 -5.747 -3.917 -9.756 -3.917 c -4.008 0.0 -7.653 1.503 -9.755 3.917 C 6.224 24.3 5.0 21.294 5.0 17.999 Z m 13.0 6.675 c 3.643 0.0 6.697 1.394 8.317 3.315 c -2.254 1.88 -5.153 3.009 -8.318 3.009 c -3.164 0.0 -6.063 -1.13 -8.318 -3.01 c 1.62 -1.92 4.675 -3.314 8.318 -3.314 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 4.27 1.786 8.125 4.649 10.855 C 10.339 31.422 13.986 33.0 17.999 33.0 c 4.014 0.0 7.66 -1.577 10.351 -4.144 C 31.213 26.125 33.0 22.27 33.0 18.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -3.541 11.973 c 0.0 -1.955 1.585 -3.54 3.54 -3.54 c 1.956 0.0 3.54 1.585 3.54 3.54 s -1.584 3.54 -3.54 3.54 c -1.955 0.0 -3.54 -1.585 -3.54 -3.54 Z m 3.54 -5.54 c -3.06 0.0 -5.54 2.48 -5.54 5.54 s 2.48 5.54 5.54 5.54 s 5.54 -2.48 5.54 -5.54 s -2.48 -5.54 -5.54 -5.54 Z")
        )
    }.build()
}

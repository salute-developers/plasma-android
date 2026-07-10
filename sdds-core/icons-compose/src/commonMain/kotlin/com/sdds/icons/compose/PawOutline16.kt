package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PawOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PawOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 3.502 C 5.0 3.086 5.337 2.75 5.75 2.75 S 6.5 3.086 6.5 3.502 c 0.0 0.417 -0.337 0.753 -0.75 0.753 S 5.0 3.919 5.0 3.502 Z M 5.75 1.75 C 4.783 1.75 4.0 2.535 4.0 3.502 s 0.783 1.753 1.75 1.753 S 7.5 4.469 7.5 3.502 c 0.0 -0.967 -0.783 -1.752 -1.75 -1.752 Z m -3.0 4.5 C 2.337 6.25 2.0 6.586 2.0 7.002 C 2.0 7.42 2.337 7.755 2.75 7.755 S 3.5 7.419 3.5 7.002 c 0.0 -0.416 -0.337 -0.752 -0.75 -0.752 Z M 1.0 7.002 C 1.0 6.035 1.783 5.25 2.75 5.25 S 4.5 6.035 4.5 7.002 S 3.717 8.755 2.75 8.755 S 1.0 7.969 1.0 7.002 Z M 6.097 6.85 c 0.9 -1.465 2.905 -1.465 3.806 0.0 l 2.217 3.604 c 0.495 0.806 0.476 1.747 0.118 2.484 c -0.36 0.738 -1.085 1.313 -2.021 1.313 H 5.783 c -0.936 0.0 -1.661 -0.575 -2.02 -1.313 c -0.36 -0.737 -0.378 -1.678 0.117 -2.484 L 6.097 6.85 Z M 9.05 7.372 c -0.51 -0.83 -1.592 -0.83 -2.102 0.0 l -2.217 3.605 c -0.3 0.489 -0.293 1.065 -0.07 1.522 c 0.221 0.456 0.632 0.751 1.121 0.751 h 4.434 c 0.489 0.0 0.9 -0.295 1.121 -0.751 c 0.223 -0.457 0.23 -1.033 -0.07 -1.522 L 9.05 7.372 Z M 13.25 6.25 c -0.413 0.0 -0.75 0.336 -0.75 0.752 c 0.0 0.417 0.337 0.753 0.75 0.753 S 14.0 7.419 14.0 7.002 c 0.0 -0.416 -0.337 -0.752 -0.75 -0.752 Z M 11.5 7.002 c 0.0 -0.967 0.783 -1.752 1.75 -1.752 S 15.0 6.035 15.0 7.002 s -0.783 1.753 -1.75 1.753 s -1.75 -0.786 -1.75 -1.753 Z m -2.25 -3.5 C 9.25 3.086 9.587 2.75 10.0 2.75 s 0.75 0.336 0.75 0.752 c 0.0 0.417 -0.337 0.753 -0.75 0.753 S 9.25 3.919 9.25 3.502 Z M 10.0 1.75 c -0.967 0.0 -1.75 0.785 -1.75 1.752 S 9.033 5.255 10.0 5.255 s 1.75 -0.786 1.75 -1.753 c 0.0 -0.967 -0.783 -1.752 -1.75 -1.752 Z")
        )
    }.build()
}

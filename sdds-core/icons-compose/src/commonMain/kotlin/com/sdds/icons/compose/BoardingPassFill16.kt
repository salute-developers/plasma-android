package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoardingPassFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoardingPassFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.5 3.5 H 3.52 c -0.882 0.0 -1.323 0.0 -1.66 0.172 c -0.296 0.15 -0.537 0.392 -0.688 0.688 C 1.0 4.697 1.0 5.138 1.0 6.02 v 3.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 2.197 12.5 2.638 12.5 3.52 12.5 h 7.98 c 0.0 -0.478 0.392 -0.865 0.875 -0.865 c 0.48 0.0 0.871 0.383 0.875 0.858 c 0.404 -0.014 0.67 -0.052 0.89 -0.165 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 C 15.0 11.303 15.0 10.862 15.0 9.98 V 6.02 c 0.0 -0.882 0.0 -1.323 -0.172 -1.66 c -0.15 -0.296 -0.392 -0.537 -0.688 -0.688 c -0.22 -0.113 -0.486 -0.152 -0.89 -0.165 c -0.004 0.475 -0.394 0.858 -0.875 0.858 c -0.483 0.0 -0.875 -0.387 -0.875 -0.865 Z M 3.625 6.462 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 4.9 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 h -4.9 Z m 0.0 2.077 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 3.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 h -3.5 Z m 9.625 -2.79 c 0.0 0.479 -0.392 0.866 -0.875 0.866 S 11.5 6.228 11.5 5.75 s 0.392 -0.865 0.875 -0.865 s 0.875 0.387 0.875 0.865 Z m -0.875 3.116 c 0.483 0.0 0.875 -0.387 0.875 -0.865 s -0.392 -0.866 -0.875 -0.866 S 11.5 7.522 11.5 8.0 s 0.392 0.865 0.875 0.865 Z m 0.875 1.385 c 0.0 0.478 -0.392 0.866 -0.875 0.866 S 11.5 10.728 11.5 10.25 s 0.392 -0.865 0.875 -0.865 s 0.875 0.387 0.875 0.865 Z")
        )
    }.build()
}

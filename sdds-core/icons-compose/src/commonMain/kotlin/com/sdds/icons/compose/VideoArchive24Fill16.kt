package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoArchive24Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoArchive24Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.857 2.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 7.287 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.357 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.639 1.237 h 7.009 c 0.374 0.0 0.686 0.0 0.942 0.021 c 0.266 0.022 0.516 0.069 0.752 0.19 c 0.362 0.184 0.657 0.479 0.842 0.841 c 0.12 0.236 0.167 0.486 0.189 0.752 c 0.02 0.256 0.02 0.568 0.02 0.942 v 5.77 c 0.0 0.375 0.0 0.687 -0.02 0.943 c -0.022 0.266 -0.069 0.515 -0.19 0.752 c -0.184 0.362 -0.479 0.657 -0.841 0.842 c -0.236 0.12 -0.486 0.167 -0.752 0.189 c -0.255 0.02 -0.568 0.02 -0.942 0.02 h -7.01 c -0.373 0.0 -0.686 0.0 -0.94 -0.02 c -0.267 -0.022 -0.517 -0.069 -0.753 -0.19 c -0.363 -0.184 -0.657 -0.479 -0.842 -0.841 c -0.12 -0.237 -0.167 -0.486 -0.19 -0.752 c -0.02 -0.256 -0.02 -0.568 -0.02 -0.942 v -5.77 c 0.0 -0.375 0.0 -0.687 0.02 -0.943 c 0.023 -0.266 0.07 -0.516 0.19 -0.752 c 0.185 -0.362 0.48 -0.657 0.842 -0.842 c 0.236 -0.12 0.486 -0.167 0.752 -0.189 c 0.255 -0.02 0.568 -0.02 0.942 -0.02 Z m 5.766 5.335 c 0.23 0.135 0.23 0.469 0.0 0.604 L 7.14 11.004 c -0.233 0.137 -0.527 -0.031 -0.527 -0.302 V 7.045 c 0.0 -0.27 0.294 -0.439 0.527 -0.302 l 3.12 1.829 Z")
        )
    }.build()
}

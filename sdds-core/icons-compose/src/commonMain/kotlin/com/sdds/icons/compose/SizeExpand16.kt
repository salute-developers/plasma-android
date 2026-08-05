package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeExpand16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeExpand16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.75 2.25 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.788 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.58 L 5.74 5.033 c 0.195 0.195 0.195 0.511 0.0 0.707 c -0.196 0.195 -0.512 0.195 -0.707 0.0 L 2.75 3.457 v 1.58 c 0.0 0.277 -0.224 0.5 -0.5 0.5 s -0.5 -0.223 -0.5 -0.5 V 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.75 13.75 c 0.0 0.276 0.224 0.5 0.5 0.5 h 2.788 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -1.58 l 2.282 -2.283 c 0.195 -0.195 0.195 -0.511 0.0 -0.707 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 L 2.75 12.543 v -1.58 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 v 2.787 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 2.25 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -2.788 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.58 L 10.26 5.033 c -0.195 0.195 -0.195 0.511 0.0 0.707 c 0.196 0.195 0.512 0.195 0.707 0.0 l 2.283 -2.283 v 1.58 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 V 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 13.75 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -2.788 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.58 l -2.282 -2.283 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 c 0.196 -0.195 0.512 -0.195 0.707 0.0 l 2.283 2.283 v -1.58 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 s 0.5 0.223 0.5 0.5 v 2.787 Z")
        )
    }.build()
}

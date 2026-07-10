package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbDiodeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbDiodeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 1.0 C 4.907 1.0 2.4 3.507 2.4 6.6 c 0.0 1.62 0.689 3.08 1.788 4.102 c 0.34 0.317 0.782 0.448 1.197 0.448 h 5.23 c 0.415 0.0 0.856 -0.13 1.197 -0.448 C 12.912 9.68 13.6 8.22 13.6 6.6 C 13.6 3.507 11.093 1.0 8.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.025 12.55 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 4.9 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -4.9 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.725 14.475 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 3.5 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -3.5 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 Z")
        )
    }.build()
}

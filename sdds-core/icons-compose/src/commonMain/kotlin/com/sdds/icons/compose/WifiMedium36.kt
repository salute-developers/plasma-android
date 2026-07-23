package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiMedium36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiMedium36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.875 23.04 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.875 15.5 c 3.05 0.0 5.975 1.212 8.132 3.368 c 0.39 0.39 0.39 1.024 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -1.782 -1.781 -4.199 -2.782 -6.718 -2.782 c -2.52 0.0 -4.936 1.0 -6.718 2.782 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 c 2.157 -2.156 5.082 -3.368 8.132 -3.368 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 10.375 c 4.243 0.0 8.313 1.686 11.313 4.687 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -2.625 -2.626 -6.186 -4.101 -9.9 -4.101 c -3.712 0.0 -7.273 1.475 -9.898 4.1 c -0.39 0.391 -1.024 0.39 -1.415 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 c 3.001 -3.0 7.07 -4.686 11.314 -4.686 Z")
        )
    }.build()
}

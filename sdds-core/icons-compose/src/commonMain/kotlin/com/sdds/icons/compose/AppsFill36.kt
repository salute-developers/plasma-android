package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppsFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppsFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.203 16.594 c 3.754 0.0 6.797 -3.043 6.797 -6.797 C 33.0 6.043 29.957 3.0 26.203 3.0 c -3.754 0.0 -6.797 3.043 -6.797 6.797 c 0.0 3.754 3.043 6.797 6.797 6.797 Z M 5.125 9.75 c 0.0 -2.554 2.07 -4.625 4.625 -4.625 c 2.554 0.0 4.625 2.07 4.625 4.625 s -2.07 4.625 -4.625 4.625 c -2.554 0.0 -4.625 -2.07 -4.625 -4.625 Z M 9.75 3.125 c -3.659 0.0 -6.625 2.966 -6.625 6.625 c 0.0 3.66 2.966 6.625 6.625 6.625 s 6.625 -2.966 6.625 -6.625 s -2.966 -6.625 -6.625 -6.625 Z M 33.0 26.203 C 33.0 29.957 29.957 33.0 26.203 33.0 c -3.754 0.0 -6.797 -3.043 -6.797 -6.797 c 0.0 -3.754 3.043 -6.797 6.797 -6.797 c 3.754 0.0 6.797 3.043 6.797 6.797 Z M 9.797 33.0 c 3.754 0.0 6.797 -3.043 6.797 -6.797 c 0.0 -3.754 -3.043 -6.797 -6.797 -6.797 C 6.043 19.406 3.0 22.45 3.0 26.203 C 3.0 29.957 6.043 33.0 9.797 33.0 Z")
        )
    }.build()
}

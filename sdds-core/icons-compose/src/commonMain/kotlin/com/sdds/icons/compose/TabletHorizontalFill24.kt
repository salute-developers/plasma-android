package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TabletHorizontalFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TabletHorizontalFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 7.15 c 0.0 -0.407 -0.001 -0.759 0.022 -1.046 c 0.025 -0.297 0.079 -0.592 0.223 -0.875 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 c 0.283 -0.144 0.578 -0.198 0.875 -0.223 C 4.39 4.0 4.743 4.0 5.15 4.0 h 13.7 c 0.407 0.0 0.759 -0.001 1.046 0.022 c 0.297 0.025 0.592 0.079 0.875 0.223 c 0.424 0.216 0.768 0.56 0.984 0.984 c 0.144 0.283 0.198 0.578 0.223 0.875 C 22.0 6.39 22.0 6.743 22.0 7.15 v 9.7 c 0.0 0.407 0.001 0.759 -0.023 1.046 c -0.024 0.297 -0.078 0.592 -0.222 0.875 c -0.216 0.424 -0.56 0.768 -0.983 0.984 c -0.284 0.144 -0.58 0.198 -0.875 0.223 C 19.608 20.0 19.256 20.0 18.85 20.0 H 5.15 c -0.407 0.0 -0.759 0.001 -1.046 -0.023 c -0.297 -0.024 -0.592 -0.078 -0.875 -0.222 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 c -0.144 -0.284 -0.198 -0.58 -0.223 -0.875 C 2.0 17.608 2.0 17.256 2.0 16.85 v -9.7 Z m 2.95 7.35 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -5.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 4.95 9.086 4.95 9.5 v 5.0 Z")
        )
    }.build()
}

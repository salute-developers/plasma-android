package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.333 1.516 c 0.683 -0.688 1.79 -0.688 2.473 0.0 L 8.0 2.718 l 1.194 -1.202 c 0.683 -0.688 1.79 -0.688 2.473 0.0 c 0.683 0.687 0.683 1.802 0.0 2.49 l -0.5 0.503 h 2.215 c 0.48 0.0 0.868 0.392 0.868 0.875 v 2.272 H 8.525 V 4.51 h -1.05 v 3.146 H 1.75 V 5.384 c 0.0 -0.483 0.389 -0.875 0.868 -0.875 h 2.215 l -0.5 -0.503 c -0.683 -0.688 -0.683 -1.803 0.0 -2.49 Z m -1.889 7.19 v 4.021 c 0.0 1.255 1.01 2.273 2.257 2.273 h 2.774 V 8.706 h -5.03 Z M 8.524 15.0 H 11.3 c 1.246 0.0 2.257 -1.018 2.257 -2.273 v -4.02 H 8.525 V 15.0 Z m 1.17 -10.49 H 8.521 V 3.677 l 1.41 -1.42 c 0.276 -0.278 0.723 -0.278 1.0 0.0 c 0.275 0.278 0.275 0.728 0.0 1.006 L 9.693 4.51 Z M 7.479 3.677 v 0.831 H 6.306 L 5.07 3.264 c -0.276 -0.278 -0.276 -0.728 0.0 -1.006 s 0.723 -0.278 1.0 0.0 l 1.41 1.42 Z")
        )
    }.build()
}

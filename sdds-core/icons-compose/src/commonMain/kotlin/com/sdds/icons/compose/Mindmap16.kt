package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mindmap16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mindmap16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.92 3.5 c -0.605 0.0 -1.08 0.48 -1.08 1.052 c 0.0 0.572 0.475 1.052 1.08 1.052 c 0.606 0.0 1.082 -0.48 1.082 -1.052 c 0.0 -0.572 -0.476 -1.052 -1.082 -1.052 Z M 9.053 5.05 H 10.9 c 0.226 0.897 1.05 1.554 2.02 1.554 c 1.14 0.0 2.08 -0.91 2.08 -2.052 S 14.062 2.5 12.922 2.5 c -0.968 0.0 -1.791 0.654 -2.019 1.55 h -1.85 c -0.856 0.0 -1.55 0.694 -1.55 1.55 V 7.5 h -2.4 c -0.227 -0.897 -1.05 -1.553 -2.019 -1.553 c -1.14 0.0 -2.081 0.91 -2.081 2.052 s 0.94 2.052 2.081 2.052 c 0.968 0.0 1.791 -0.655 2.019 -1.551 h 2.4 v 1.898 c 0.0 0.856 0.694 1.55 1.55 1.55 h 1.85 c 0.227 0.897 1.05 1.552 2.019 1.552 c 1.14 0.0 2.08 -0.91 2.08 -2.052 s -0.94 -2.052 -2.08 -2.052 c -0.968 0.0 -1.792 0.656 -2.02 1.552 h -1.85 c -0.303 0.0 -0.55 -0.246 -0.55 -0.55 V 5.6 c 0.0 -0.303 0.247 -0.55 0.55 -0.55 Z M 2.002 8.0 c 0.0 -0.572 0.475 -1.052 1.081 -1.052 S 4.164 7.428 4.164 8.0 c 0.0 0.572 -0.475 1.052 -1.081 1.052 S 2.002 8.572 2.002 8.0 Z m 9.838 3.45 c 0.0 -0.573 0.475 -1.052 1.08 -1.052 c 0.606 0.0 1.082 0.48 1.082 1.051 c 0.0 0.572 -0.476 1.052 -1.082 1.052 c -0.605 0.0 -1.08 -0.48 -1.08 -1.052 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.186 9.38 c -0.638 2.788 -3.165 4.87 -6.186 4.87 c -3.02 0.0 -5.547 -2.082 -6.185 -4.87 c -0.051 0.006 -0.103 0.01 -0.156 0.01 C 0.881 9.39 0.25 8.766 0.25 8.0 c 0.0 -0.767 0.63 -1.388 1.41 -1.388 c 0.052 0.0 0.104 0.002 0.155 0.008 C 2.452 3.832 4.98 1.75 8.0 1.75 c 3.021 0.0 5.549 2.082 6.186 4.87 c 0.051 -0.006 0.103 -0.008 0.155 -0.008 c 0.778 0.0 1.41 0.621 1.41 1.388 c 0.0 0.767 -0.632 1.39 -1.41 1.39 c -0.052 0.0 -0.104 -0.004 -0.155 -0.01 Z M 4.18 7.224 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 Z m 8.639 -1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.447 1.0 1.0 Z M 9.636 7.292 c -0.22 0.216 -0.48 0.387 -0.769 0.502 C 8.58 7.908 8.271 7.964 7.96 7.959 c -0.31 -0.005 -0.617 -0.072 -0.9 -0.196 c -0.285 -0.125 -0.54 -0.304 -0.752 -0.528 L 5.57 7.912 C 5.876 8.234 6.242 8.492 6.65 8.67 c 0.407 0.179 0.847 0.274 1.293 0.282 C 8.388 8.96 8.83 8.879 9.245 8.714 c 0.413 -0.165 0.788 -0.41 1.104 -0.72 L 9.636 7.292 Z")
        )
    }.build()
}

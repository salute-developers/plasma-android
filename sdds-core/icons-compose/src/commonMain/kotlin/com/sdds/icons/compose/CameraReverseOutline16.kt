package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraReverseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraReverseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.687 1.146 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 13.8 2.552 c 0.196 0.195 0.196 0.512 0.0 0.707 l -1.405 1.405 c -0.195 0.196 -0.512 0.196 -0.707 0.0 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 l 0.552 -0.552 H 4.86 c -0.596 0.0 -1.013 0.0 -1.339 0.027 C 3.202 3.458 3.016 3.507 2.874 3.58 c -0.301 0.153 -0.546 0.398 -0.7 0.699 c -0.072 0.142 -0.121 0.329 -0.147 0.648 C 2.0 5.252 2.0 5.669 2.0 6.265 v 4.37 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 1.0 10.911 1.0 10.635 V 6.244 c 0.0 -0.57 0.0 -1.028 0.03 -1.399 c 0.031 -0.38 0.097 -0.713 0.253 -1.02 c 0.25 -0.49 0.647 -0.887 1.137 -1.136 c 0.306 -0.157 0.639 -0.222 1.02 -0.253 c 0.37 -0.03 0.829 -0.03 1.398 -0.03 h 7.4 l -0.551 -0.552 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 Z M 14.5 4.865 c 0.276 0.0 0.5 0.224 0.5 0.5 v 4.391 c 0.0 0.57 0.0 1.028 -0.03 1.399 c -0.031 0.38 -0.097 0.713 -0.253 1.02 c -0.25 0.49 -0.647 0.887 -1.137 1.136 c -0.306 0.157 -0.639 0.222 -1.02 0.253 c -0.37 0.03 -0.829 0.03 -1.399 0.03 h -7.4 l 0.552 0.552 c 0.195 0.196 0.195 0.512 0.0 0.708 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 2.2 13.448 c -0.094 -0.094 -0.147 -0.22 -0.147 -0.353 c 0.0 -0.133 0.053 -0.26 0.147 -0.354 l 1.405 -1.405 c 0.195 -0.196 0.512 -0.196 0.707 0.0 c 0.195 0.195 0.195 0.511 0.0 0.707 l -0.552 0.552 h 7.379 c 0.596 0.0 1.013 0.0 1.339 -0.027 c 0.319 -0.026 0.505 -0.075 0.647 -0.148 c 0.301 -0.153 0.546 -0.398 0.7 -0.699 c 0.072 -0.142 0.121 -0.329 0.147 -0.648 C 14.0 10.748 14.0 10.331 14.0 9.735 v -4.37 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFF2960B1)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 5.75 C 6.757 5.75 5.75 6.757 5.75 8.0 S 6.757 10.25 8.0 10.25 S 10.25 9.243 10.25 8.0 S 9.243 5.75 8.0 5.75 Z M 4.75 8.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 S 11.25 6.205 11.25 8.0 S 9.795 11.25 8.0 11.25 S 4.75 9.795 4.75 8.0 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.257 4.508 c 0.45 -0.6 1.33 -0.682 1.851 -0.174 l 3.713 3.622 c 0.52 0.508 0.436 1.366 -0.179 1.805 l -3.734 2.668 c -0.383 0.273 -0.64 0.684 -0.71 1.136 l -0.516 3.316 c -0.213 1.368 -1.932 1.96 -2.914 1.002 l -2.16 -2.107 l -3.855 3.762 L 2.0 19.88 l 0.35 -1.71 l 3.857 -3.762 l -2.275 -2.219 C 2.951 11.232 3.557 9.555 4.96 9.347 l 3.399 -0.503 c 0.464 -0.07 0.885 -0.32 1.165 -0.693 l 2.734 -3.643 Z m 7.264 2.434 c -0.41 0.0 -0.743 0.325 -0.743 0.726 c 0.0 0.4 0.333 0.725 0.743 0.725 h 1.735 C 21.667 8.393 22.0 8.068 22.0 7.668 c 0.0 -0.4 -0.333 -0.726 -0.744 -0.726 h -1.735 Z M 15.307 18.55 c -0.41 0.0 -0.743 0.325 -0.743 0.726 c 0.0 0.4 0.333 0.725 0.743 0.725 h 5.702 c 0.41 0.0 0.743 -0.325 0.743 -0.725 c 0.0 -0.401 -0.333 -0.726 -0.743 -0.726 h -5.702 Z m 1.488 -5.078 c 0.0 -0.4 0.333 -0.725 0.743 -0.725 h 3.718 c 0.411 0.0 0.744 0.324 0.744 0.725 c 0.0 0.4 -0.333 0.726 -0.744 0.726 h -3.718 c -0.41 0.0 -0.743 -0.325 -0.743 -0.726 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FolderPlusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FolderPlusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.004 9.75 H 2.0 V 7.32 C 2.0 6.714 2.0 6.216 2.033 5.81 C 2.068 5.39 2.142 5.002 2.327 4.638 c 0.288 -0.564 0.747 -1.023 1.311 -1.311 c 0.364 -0.185 0.752 -0.26 1.173 -0.294 C 5.217 3.0 5.715 3.0 6.32 3.0 h 2.784 c 0.597 0.0 1.04 0.0 1.424 0.102 c 1.035 0.278 1.843 1.086 2.12 2.122 c 0.063 0.23 0.087 0.482 0.097 0.776 H 17.2 c 1.68 0.0 2.52 0.0 3.162 0.327 c 0.565 0.288 1.023 0.747 1.311 1.311 C 22.0 8.28 22.0 9.12 22.0 10.8 v 4.4 c 0.0 1.68 0.0 2.52 -0.327 3.162 c -0.288 0.565 -0.746 1.024 -1.311 1.311 C 19.72 20.0 18.88 20.0 17.2 20.0 H 6.8 c -1.68 0.0 -2.52 0.0 -3.162 -0.327 c -0.564 -0.287 -1.023 -0.746 -1.311 -1.311 C 2.0 17.72 2.0 16.88 2.0 15.2 v -4.4 c 0.0 -0.393 0.0 -0.74 0.004 -1.05 Z M 9.0 4.5 c 0.746 0.0 0.972 0.007 1.138 0.051 c 0.518 0.139 0.922 0.543 1.06 1.06 c 0.025 0.09 0.038 0.196 0.045 0.39 H 6.8 C 5.12 6.0 4.28 6.0 3.638 6.326 C 3.593 6.35 3.549 6.374 3.506 6.398 C 3.51 6.223 3.517 6.07 3.528 5.933 C 3.555 5.605 3.604 5.436 3.663 5.32 C 3.807 5.037 4.037 4.807 4.32 4.664 c 0.117 -0.06 0.285 -0.109 0.614 -0.136 C 5.271 4.501 5.708 4.5 6.35 4.5 H 9.0 Z M 12.0 9.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 h 2.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.5 v 2.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -2.5 h -2.5 C 8.336 13.75 8.0 13.414 8.0 13.0 s 0.336 -0.75 0.75 -0.75 h 2.5 v -2.5 C 11.25 9.336 11.586 9.0 12.0 9.0 Z")
        )
    }.build()
}

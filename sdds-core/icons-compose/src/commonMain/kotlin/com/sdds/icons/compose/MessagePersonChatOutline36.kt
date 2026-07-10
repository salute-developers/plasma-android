package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.78 17.64 c 0.0 -5.841 4.736 -10.578 10.579 -10.578 c 5.649 0.0 10.263 4.428 10.563 10.003 c 0.708 0.206 1.382 0.492 2.012 0.849 c 0.002 -0.09 0.003 -0.182 0.003 -0.273 c 0.0 -6.947 -5.632 -12.578 -12.578 -12.578 c -6.947 0.0 -12.579 5.631 -12.579 12.578 c 0.0 1.5 0.263 2.94 0.746 4.276 c 0.283 0.784 0.363 1.55 0.175 2.223 l -1.069 3.816 c -0.41 1.469 0.943 2.822 2.412 2.411 l 3.816 -1.069 c 0.672 -0.188 1.439 -0.108 2.222 0.175 c 1.124 0.407 2.322 0.657 3.566 0.727 c -0.305 -0.654 -0.538 -1.348 -0.688 -2.072 c -0.762 -0.1 -1.497 -0.282 -2.198 -0.536 c -1.039 -0.375 -2.248 -0.554 -3.441 -0.22 L 7.579 28.42 l 1.048 -3.741 c 0.334 -1.194 0.155 -2.403 -0.22 -3.441 c -0.405 -1.122 -0.627 -2.333 -0.627 -3.597 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 c 0.0 -4.695 -3.806 -8.5 -8.5 -8.5 c -4.695 0.0 -8.5 3.805 -8.5 8.5 c 0.0 4.694 3.805 8.5 8.5 8.5 Z m 3.477 -11.978 c 0.0 1.92 -1.557 3.477 -3.477 3.477 s -3.478 -1.557 -3.478 -3.477 s 1.557 -3.478 3.478 -3.478 c 1.92 0.0 3.477 1.557 3.477 3.478 Z m 2.362 7.258 c -1.24 1.91 -3.392 3.174 -5.838 3.174 c -2.447 0.0 -4.599 -1.264 -5.839 -3.174 c 1.74 -0.933 3.727 -1.462 5.838 -1.462 c 2.112 0.0 4.1 0.529 5.839 1.462 Z")
        )
    }.build()
}

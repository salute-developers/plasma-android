package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.5 11.502 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -4.0 v 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 v -4.0 h -4.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 s 0.447 -1.0 1.0 -1.0 h 4.0 v -4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.322 5.102 c 6.946 0.0 12.578 5.631 12.578 12.578 c 0.0 6.947 -5.631 12.579 -12.578 12.579 c -1.5 0.0 -2.94 -0.263 -4.277 -0.746 c -0.783 -0.284 -1.55 -0.363 -2.222 -0.175 l -3.817 1.068 c -1.468 0.411 -2.822 -0.942 -2.41 -2.41 l 1.069 -3.817 c 0.188 -0.672 0.108 -1.44 -0.175 -2.223 c -0.483 -1.336 -0.746 -2.777 -0.746 -4.276 c 0.0 -6.947 5.631 -12.578 12.578 -12.578 Z m 0.0 2.0 c -5.842 0.0 -10.578 4.736 -10.578 10.578 c 0.0 1.264 0.221 2.475 0.627 3.596 c 0.375 1.039 0.553 2.248 0.22 3.442 l -1.05 3.741 l 3.743 -1.047 c 1.193 -0.334 2.403 -0.155 3.441 0.22 c 1.121 0.405 2.332 0.627 3.597 0.627 c 5.842 0.0 10.578 -4.737 10.578 -10.58 c 0.0 -5.841 -4.736 -10.577 -10.578 -10.577 Z")
        )
    }.build()
}

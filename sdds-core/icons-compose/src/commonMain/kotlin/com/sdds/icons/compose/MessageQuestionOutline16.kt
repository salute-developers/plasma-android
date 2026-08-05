package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageQuestionOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageQuestionOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.955 5.491 C 6.77 5.635 6.578 5.922 6.578 6.578 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.863 0.264 -1.488 0.763 -1.876 c 0.474 -0.368 1.066 -0.447 1.561 -0.447 c 0.495 0.0 1.087 0.079 1.56 0.447 c 0.5 0.388 0.764 1.013 0.764 1.876 c 0.0 1.022 -0.648 1.534 -1.112 1.882 c -0.52 0.39 -0.712 0.544 -0.712 0.854 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -0.837 0.615 -1.289 1.017 -1.584 l 0.095 -0.07 c 0.448 -0.336 0.712 -0.584 0.712 -1.082 c 0.0 -0.656 -0.192 -0.943 -0.377 -1.087 c -0.21 -0.163 -0.53 -0.236 -0.947 -0.236 c -0.417 0.0 -0.736 0.073 -0.947 0.236 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.511 10.833 c 0.0 0.336 -0.272 0.608 -0.608 0.608 c -0.336 0.0 -0.608 -0.272 -0.608 -0.608 c 0.0 -0.336 0.272 -0.608 0.608 -0.608 c 0.336 0.0 0.608 0.272 0.608 0.608 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 1.975 c -3.297 0.0 -5.97 2.673 -5.97 5.97 c 0.0 0.716 0.125 1.403 0.357 2.04 c 0.13 0.36 0.166 0.71 0.08 1.015 l -0.51 1.821 c -0.198 0.71 0.457 1.366 1.167 1.167 l 1.821 -0.51 c 0.305 -0.086 0.656 -0.05 1.016 0.08 c 0.637 0.232 1.324 0.358 2.04 0.358 c 3.297 0.0 5.97 -2.673 5.97 -5.97 c 0.0 -3.298 -2.673 -5.971 -5.97 -5.971 Z m -4.97 5.97 c 0.0 -2.745 2.225 -4.97 4.97 -4.97 c 2.745 0.0 4.971 2.225 4.971 4.97 c 0.0 2.746 -2.225 4.971 -4.97 4.971 c -0.598 0.0 -1.17 -0.105 -1.699 -0.297 c -0.489 -0.178 -1.06 -0.263 -1.626 -0.104 l -1.73 0.484 l 0.485 -1.73 c 0.158 -0.565 0.073 -1.137 -0.104 -1.626 c -0.193 -0.529 -0.298 -1.1 -0.298 -1.697 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.322 5.102 c 6.946 0.0 12.578 5.631 12.578 12.578 c 0.0 6.946 -5.632 12.579 -12.578 12.579 c -1.5 0.0 -2.94 -0.263 -4.277 -0.746 c -0.783 -0.283 -1.55 -0.363 -2.222 -0.175 l -3.817 1.068 c -1.468 0.411 -2.822 -0.942 -2.41 -2.41 l 1.068 -3.817 c 0.189 -0.672 0.109 -1.44 -0.174 -2.223 c -0.483 -1.336 -0.746 -2.777 -0.746 -4.276 c 0.0 -6.947 5.631 -12.578 12.578 -12.578 Z m 0.178 6.4 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 4.0 h -4.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 4.0 v 4.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -4.0 h 4.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -4.0 v -4.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 Z")
        )
    }.build()
}

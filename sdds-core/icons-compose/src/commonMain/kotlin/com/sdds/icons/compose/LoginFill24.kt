package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LoginFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LoginFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.55 19.748 c -0.3 -0.588 -0.3 -1.358 -0.3 -2.898 v -4.1 h 4.69 l -1.72 1.72 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.0 -3.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -3.0 -3.0 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 1.72 1.72 h -4.69 v -4.1 c 0.0 -1.54 0.0 -2.31 0.3 -2.898 c 0.263 -0.518 0.684 -0.939 1.201 -1.202 c 0.589 -0.3 1.359 -0.3 2.899 -0.3 h 1.7 c 1.54 0.0 2.31 0.0 2.898 0.3 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.3 0.588 0.3 1.358 0.3 2.898 v 9.7 c 0.0 1.54 0.0 2.31 -0.3 2.898 c -0.263 0.518 -0.684 0.939 -1.201 1.202 c -0.589 0.3 -1.359 0.3 -2.899 0.3 h -1.7 c -1.54 0.0 -2.31 0.0 -2.899 -0.3 c -0.517 -0.263 -0.938 -0.684 -1.201 -1.201 Z m -0.3 -8.498 h -4.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 4.0 v -1.5 Z")
        )
    }.build()
}

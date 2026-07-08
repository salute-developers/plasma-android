package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RombFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RombFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.18 3.257 l 0.027 0.027 L 32.594 15.67 c 0.237 0.238 0.46 0.461 0.633 0.664 c 0.188 0.221 0.38 0.49 0.493 0.838 c 0.159 0.49 0.159 1.018 0.0 1.508 c -0.113 0.347 -0.306 0.617 -0.493 0.838 c -0.172 0.203 -0.396 0.427 -0.633 0.664 L 20.18 32.595 c -0.237 0.237 -0.46 0.46 -0.663 0.633 c -0.221 0.188 -0.49 0.38 -0.838 0.493 c -0.49 0.16 -1.018 0.16 -1.508 0.0 c -0.347 -0.113 -0.617 -0.305 -0.838 -0.493 c -0.203 -0.172 -0.427 -0.396 -0.664 -0.633 L 3.256 20.182 c -0.237 -0.237 -0.46 -0.46 -0.633 -0.664 c -0.188 -0.22 -0.38 -0.49 -0.493 -0.838 c -0.16 -0.49 -0.16 -1.018 0.0 -1.508 c 0.113 -0.347 0.305 -0.617 0.493 -0.838 c 0.172 -0.203 0.396 -0.426 0.633 -0.664 L 15.643 3.284 c 0.008 -0.01 0.017 -0.018 0.026 -0.027 c 0.237 -0.237 0.46 -0.46 0.664 -0.633 c 0.22 -0.188 0.49 -0.38 0.838 -0.493 c 0.49 -0.16 1.018 -0.16 1.508 0.0 c 0.347 0.113 0.617 0.305 0.838 0.493 c 0.203 0.172 0.426 0.396 0.663 0.633 Z")
        )
    }.build()
}

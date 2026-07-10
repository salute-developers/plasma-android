package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.25 16.5 v 4.0 H 7.254 c -0.414 0.0 -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 h 9.492 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 H 12.75 v -4.0 h -1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.722 15.0 c -0.239 -0.01 -0.46 -0.133 -0.593 -0.332 c -0.14 -0.208 -0.166 -0.472 -0.07 -0.703 L 8.54 3.085 c 0.27 -0.655 0.91 -1.083 1.618 -1.083 h 3.676 c 0.709 0.0 1.347 0.427 1.617 1.082 l 4.49 10.88 c 0.096 0.231 0.07 0.495 -0.07 0.703 c -0.133 0.2 -0.354 0.323 -0.593 0.333 H 4.722 Z")
        )
    }.build()
}

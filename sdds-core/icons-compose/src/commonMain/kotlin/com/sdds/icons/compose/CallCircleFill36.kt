package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -1.737 -20.749 c -0.913 -1.326 -2.36 -2.882 -3.558 -1.685 c -0.954 0.955 -4.777 4.777 1.587 11.141 s 10.187 2.542 11.141 1.587 c 1.198 -1.197 -0.358 -2.645 -1.685 -3.558 c -0.396 -0.272 -0.594 -0.409 -0.81 -0.47 c -0.237 -0.066 -0.344 -0.071 -0.586 -0.03 c -0.222 0.036 -0.63 0.257 -1.448 0.698 c -1.012 0.546 -2.49 0.796 -4.062 -0.777 c -1.573 -1.572 -1.322 -3.05 -0.776 -4.061 c 0.44 -0.818 0.661 -1.227 0.698 -1.448 c 0.04 -0.243 0.035 -0.35 -0.031 -0.587 c -0.061 -0.216 -0.197 -0.414 -0.47 -0.81 Z")
        )
    }.build()
}

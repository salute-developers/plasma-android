package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleEndOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleEndOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.025 8.0 C 2.025 4.7 4.7 2.025 8.0 2.025 S 13.975 4.7 13.975 8.0 S 11.3 13.975 8.0 13.975 S 2.025 11.3 2.025 8.0 Z M 8.0 1.025 C 4.148 1.025 1.025 4.148 1.025 8.0 c 0.0 3.852 3.123 6.975 6.975 6.975 c 3.852 0.0 6.975 -3.123 6.975 -6.975 c 0.0 -3.852 -3.123 -6.975 -6.975 -6.975 Z m 2.47 8.648 c 0.739 0.137 1.73 0.173 1.73 -0.617 c 0.0 -0.63 0.0 -3.153 -4.2 -3.153 S 3.8 8.426 3.8 9.056 c 0.0 0.79 0.991 0.754 1.73 0.617 c 0.22 -0.04 0.33 -0.06 0.422 -0.112 c 0.1 -0.056 0.137 -0.09 0.204 -0.183 C 6.217 9.293 6.28 9.085 6.403 8.67 C 6.557 8.156 6.962 7.586 8.0 7.586 c 1.038 0.0 1.443 0.57 1.596 1.084 c 0.125 0.415 0.187 0.623 0.248 0.708 C 9.91 9.47 9.948 9.505 10.048 9.56 c 0.091 0.051 0.201 0.072 0.422 0.112 Z")
        )
    }.build()
}

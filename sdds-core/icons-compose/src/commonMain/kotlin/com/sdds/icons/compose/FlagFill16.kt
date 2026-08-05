package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.212 1.608 C 3.495 0.705 4.62 0.427 5.663 0.516 C 6.68 0.604 7.567 1.04 8.354 1.437 L 8.44 1.48 c 0.78 0.395 1.463 0.74 2.203 0.845 c 0.73 0.103 1.552 -0.026 2.577 -0.722 c 0.153 -0.103 0.35 -0.115 0.514 -0.028 C 13.898 1.662 14.0 1.832 14.0 2.017 v 7.668 c 0.0 0.17 -0.087 0.33 -0.23 0.421 c -1.206 0.77 -2.249 0.962 -3.218 0.826 c -0.867 -0.12 -1.645 -0.504 -2.352 -0.852 L 8.038 10.0 C 7.263 9.62 6.545 9.296 5.727 9.232 C 4.979 9.173 4.103 9.331 3.0 9.97 v 4.53 C 3.0 14.777 2.776 15.0 2.5 15.0 S 2.0 14.777 2.0 14.5 V 2.018 c 0.0 -0.162 0.079 -0.315 0.212 -0.409 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowLeftOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowLeftOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.0 v 0.042 C 7.933 4.053 7.866 4.067 7.8 4.083 c 0.177 -0.042 0.359 -0.07 0.546 -0.08 L 8.5 4.0 H 19.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 10.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 8.5 l -0.154 -0.004 c -0.151 -0.008 -0.298 -0.03 -0.443 -0.06 c 0.033 0.007 0.064 0.017 0.097 0.022 V 20.0 H 5.0 c -1.605 0.0 -2.916 -1.26 -2.996 -2.846 L 2.0 17.0 V 7.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 3.0 Z M 3.0 15.92 L 6.081 19.0 h 0.187 c -0.444 -0.495 -0.728 -1.137 -0.764 -1.846 L 5.5 17.032 L 3.0 14.53 v 1.39 Z M 3.0 17.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 0.02 L 3.0 16.98 V 17.0 Z M 5.0 5.0 C 4.583 5.0 4.197 5.129 3.877 5.347 L 5.5 6.97 L 5.5 7.0 c 0.0 -0.564 0.158 -1.09 0.429 -1.541 L 5.469 5.0 H 5.0 Z m -2.0 8.47 l 2.5 2.499 V 14.03 l -2.5 -2.5 v 1.939 Z m 0.0 -3.0 l 2.5 2.499 V 11.03 L 3.0 8.531 v 1.939 Z m 0.347 -4.593 C 3.129 6.197 3.0 6.583 3.0 7.0 v 0.47 l 2.5 2.499 V 8.03 L 3.347 5.877 Z M 7.0 17.0 c 0.0 0.828 0.672 1.5 1.5 1.5 H 19.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 7.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 8.5 C 7.672 5.5 7.0 6.172 7.0 7.0 v 10.0 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightbulbFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightbulbFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.75 6.25 C 2.75 3.35 5.1 1.0 8.0 1.0 s 5.25 2.35 5.25 5.25 c 0.0 1.578 -0.697 2.995 -1.799 3.956 c -0.201 0.176 -0.332 0.373 -0.38 0.574 l -0.158 0.648 c -0.209 0.864 -0.982 1.472 -1.87 1.472 H 6.957 c -0.889 0.0 -1.662 -0.608 -1.871 -1.472 L 4.93 10.78 c -0.049 -0.2 -0.18 -0.398 -0.381 -0.574 C 3.447 9.245 2.75 7.828 2.75 6.25 Z m 3.129 0.329 c 0.205 -0.205 0.537 -0.205 0.742 0.0 L 8.0 7.958 l 1.379 -1.38 c 0.205 -0.204 0.537 -0.204 0.742 0.0 c 0.205 0.206 0.205 0.538 0.0 0.743 L 8.525 8.917 v 1.533 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 8.917 L 5.879 7.321 c -0.205 -0.205 -0.205 -0.537 0.0 -0.742 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.25 13.95 c -0.29 0.0 -0.525 0.235 -0.525 0.525 C 5.725 14.765 5.96 15.0 6.25 15.0 h 3.5 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 h -3.5 Z")
        )
    }.build()
}

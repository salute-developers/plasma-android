package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Link36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Link36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.91 28.33 c -2.392 -2.392 -2.392 -6.27 0.0 -8.662 l 2.916 -2.917 c 0.391 -0.39 0.391 -1.023 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -2.917 2.917 c -3.173 3.173 -3.173 8.317 0.0 11.49 s 8.318 3.173 11.491 0.0 l 2.917 -2.916 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 l -2.917 2.917 c -2.392 2.392 -6.27 2.392 -8.662 0.0 Z m 7.336 -18.826 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 19.577 8.0 c 2.392 -2.392 6.27 -2.392 8.662 0.0 c 2.392 2.392 2.392 6.27 0.0 8.662 l -2.917 2.917 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 l 2.917 -2.917 c 3.173 -3.173 3.173 -8.317 0.0 -11.49 s -8.317 -3.173 -11.49 0.0 l -2.917 2.917 Z m -3.712 13.788 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.023 0.39 1.414 0.0 L 24.615 13.04 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 11.534 23.292 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RublePlus36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RublePlus36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.533 4.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.19 c 2.442 0.0 4.422 1.98 4.422 4.422 c 0.0 2.443 -1.98 4.423 -4.422 4.423 h -3.19 v 1.802 h 2.806 c 0.553 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.447 1.0 -1.0 1.0 H 8.533 v 1.282 c 0.0 0.552 -0.447 1.0 -1.0 1.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -1.282 H 5.25 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 1.283 v -1.802 H 5.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 1.283 V 4.5 Z m 2.0 5.845 h 3.19 c 1.338 0.0 2.422 -1.085 2.422 -2.423 c 0.0 -1.337 -1.084 -2.422 -2.422 -2.422 h -3.19 v 4.845 Z m 22.543 -5.031 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.955 31.825 c -0.39 0.39 -1.023 0.39 -1.413 0.0 c -0.39 -0.392 -0.39 -1.025 0.0 -1.415 L 29.662 5.313 c 0.39 -0.39 1.023 -0.39 1.414 0.0 Z M 26.42 20.85 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 4.323 h -4.328 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 4.328 v 4.324 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -4.324 h 4.328 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -4.328 v -4.323 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupBigFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupBigFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.998 17.25 c 2.9 0.0 5.25 -2.35 5.25 -5.25 s -2.35 -5.25 -5.25 -5.25 s -5.25 2.35 -5.25 5.25 s 2.35 5.25 5.25 5.25 Z m -8.891 4.922 C 11.657 20.483 14.715 19.5 18.0 19.5 c 3.285 0.0 6.344 0.983 8.894 2.672 c 1.08 0.716 1.606 1.926 1.606 3.108 c 0.0 2.193 -1.777 3.97 -3.97 3.97 H 11.47 c -2.193 0.0 -3.97 -1.777 -3.97 -3.97 c 0.0 -1.182 0.527 -2.392 1.607 -3.108 Z M 30.0 25.5 c 0.0 1.408 -0.485 2.702 -1.297 3.726 h 2.777 c 1.67 0.0 3.022 -1.353 3.022 -3.022 c 0.0 -0.895 -0.399 -1.828 -1.239 -2.384 c -1.274 -0.844 -2.732 -1.433 -4.3 -1.694 C 29.616 23.088 30.0 24.25 30.0 25.5 Z M 7.296 29.226 C 6.485 28.202 6.0 26.908 6.0 25.5 c 0.0 -1.25 0.383 -2.412 1.037 -3.373 c -1.567 0.26 -3.025 0.85 -4.298 1.693 c -0.84 0.556 -1.239 1.49 -1.239 2.384 c 0.0 1.67 1.353 3.022 3.021 3.022 h 2.775 Z M 32.248 16.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m -24.75 3.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z")
        )
    }.build()
}

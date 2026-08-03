package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizChargeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizChargeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 10.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -1.045 c -0.044 -0.524 -0.131 -0.914 -0.304 -1.253 c -0.307 -0.602 -0.796 -1.091 -1.398 -1.398 C 17.568 6.0 16.673 6.0 14.88 6.0 H 7.12 C 5.328 6.0 4.432 6.0 3.747 6.349 C 3.145 6.656 2.656 7.145 2.35 7.747 C 2.0 8.432 2.0 9.327 2.0 11.12 v 1.76 c 0.0 1.792 0.0 2.688 0.349 3.373 c 0.307 0.602 0.796 1.091 1.398 1.398 C 4.432 18.0 5.327 18.0 7.12 18.0 h 7.76 c 1.792 0.0 2.688 0.0 3.373 -0.349 c 0.602 -0.307 1.091 -0.796 1.398 -1.398 c 0.173 -0.339 0.26 -0.729 0.304 -1.253 H 21.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -4.0 Z m -5.5 -2.5 c 1.105 0.0 2.0 0.895 2.0 2.0 v 5.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 h -11.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -5.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 11.0 Z m -8.436 4.766 c -0.162 0.223 0.0 0.7 0.28 0.7 h 2.707 l -1.022 2.785 c -0.045 0.349 0.412 0.525 0.619 0.24 l 3.88 -4.324 c 0.163 -0.223 0.01 -0.7 -0.268 -0.7 h -2.74 l 0.99 -2.785 c 0.045 -0.349 -0.412 -0.525 -0.619 -0.24 l -3.827 4.324 Z")
        )
    }.build()
}

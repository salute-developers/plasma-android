package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedometerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedometerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z M 14.652 9.916 c 1.78 -0.737 3.752 -0.866 5.613 -0.368 c 0.533 0.143 1.081 -0.173 1.224 -0.707 c 0.143 -0.533 -0.173 -1.082 -0.707 -1.225 c -2.285 -0.612 -4.71 -0.453 -6.896 0.452 c -2.186 0.906 -4.013 2.508 -5.196 4.557 c -1.183 2.05 -1.657 4.432 -1.348 6.778 c 0.309 2.346 1.383 4.525 3.057 6.198 c 0.39 0.39 1.023 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.023 0.0 -1.414 c -1.362 -1.362 -2.237 -3.135 -2.488 -5.045 c -0.252 -1.91 0.134 -3.849 1.097 -5.517 c 0.963 -1.668 2.45 -2.972 4.23 -3.709 Z m 12.507 4.595 c 0.533 -0.143 1.082 0.173 1.225 0.707 c 0.488 1.822 0.488 3.742 0.0 5.564 c -0.489 1.823 -1.448 3.485 -2.783 4.82 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.391 -0.39 -1.024 0.0 -1.415 c 1.086 -1.086 1.867 -2.439 2.265 -3.922 c 0.397 -1.484 0.397 -3.046 0.0 -4.53 c -0.143 -0.533 0.173 -1.082 0.707 -1.224 Z m -1.662 -4.136 c -0.331 -0.277 -0.815 -0.273 -1.14 0.01 l -8.055 7.009 c -1.188 1.034 -1.171 2.885 0.035 3.897 c 1.207 1.013 3.033 0.708 3.845 -0.642 l 5.503 -9.149 c 0.222 -0.37 0.143 -0.847 -0.188 -1.125 Z")
        )
    }.build()
}

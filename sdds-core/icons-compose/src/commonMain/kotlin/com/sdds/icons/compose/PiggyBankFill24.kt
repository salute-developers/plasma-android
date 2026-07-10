package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PiggyBankFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PiggyBankFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.25 3.25 c 0.342 0.0 0.672 0.054 0.98 0.153 c 0.394 0.128 0.611 0.55 0.484 0.945 c -0.128 0.394 -0.55 0.61 -0.944 0.483 C 5.61 4.78 5.434 4.75 5.25 4.75 c -0.893 0.0 -1.5 0.647 -1.5 1.309 c 0.0 0.415 0.106 0.757 0.241 1.013 C 5.674 5.268 8.256 4.14 11.075 4.14 c 4.122 0.0 7.699 2.388 8.76 5.783 c 0.045 0.142 0.103 0.191 0.143 0.217 c 0.055 0.034 0.16 0.071 0.347 0.071 c 0.987 0.0 1.675 0.854 1.675 1.762 v 1.471 c 0.0 0.643 -0.351 1.18 -0.72 1.578 c -0.379 0.41 -0.873 0.778 -1.358 1.097 c -0.49 0.322 -1.008 0.616 -1.45 0.864 c -0.46 0.26 -0.805 0.454 -1.015 0.601 c -0.047 0.033 -0.082 0.095 -0.082 0.165 V 20.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -1.85 c -0.247 0.0 -0.479 -0.122 -0.619 -0.326 l -0.623 -0.91 c -1.607 0.39 -3.308 0.39 -4.915 0.0 l -0.625 0.91 c -0.14 0.204 -0.37 0.326 -0.618 0.326 h -1.85 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -2.274 c 0.0 -0.06 -0.029 -0.137 -0.102 -0.2 C 3.04 16.125 2.0 14.165 2.0 11.972 c 0.0 -1.329 0.377 -2.564 1.034 -3.643 C 2.601 7.811 2.25 7.022 2.25 6.06 c 0.0 -1.613 1.407 -2.809 3.0 -2.809 Z m 10.903 6.306 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 0.01 c 0.551 0.0 0.999 -0.448 1.0 -1.0 c 0.0 -0.553 -0.449 -1.0 -1.0 -1.0 h -0.01 Z M 11.538 6.5 c -0.776 0.0 -1.517 0.2 -2.2 0.559 C 8.973 7.25 8.832 7.705 9.024 8.07 C 9.216 8.438 9.67 8.58 10.036 8.387 C 10.523 8.13 11.026 8.0 11.538 8.0 s 1.014 0.131 1.501 0.387 c 0.367 0.192 0.82 0.05 1.013 -0.316 c 0.192 -0.366 0.05 -0.82 -0.316 -1.012 C 13.054 6.7 12.314 6.5 11.538 6.5 Z")
        )
    }.build()
}

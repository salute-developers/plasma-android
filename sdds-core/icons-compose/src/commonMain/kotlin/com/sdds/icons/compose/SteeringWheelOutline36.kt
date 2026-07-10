package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.847 20.0 c 0.1 -0.652 0.153 -1.32 0.153 -2.0 c 0.0 -0.507 -0.03 -1.008 -0.086 -1.5 c -3.207 -0.019 -5.125 -1.082 -6.883 -2.056 l -0.016 -0.008 c -1.722 -0.954 -3.283 -1.814 -6.015 -1.814 c -2.64 0.0 -4.003 0.8 -5.576 1.721 l -0.138 0.08 c -1.71 1.002 -3.625 2.06 -7.2 2.077 C 5.029 16.992 5.0 17.493 5.0 18.0 c 0.0 0.68 0.052 1.348 0.153 2.0 H 10.5 c 3.038 0.0 5.5 2.462 5.5 5.5 v 5.347 c 0.652 0.1 1.32 0.153 2.0 0.153 c 0.68 0.0 1.348 -0.052 2.0 -0.153 V 25.5 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 h 5.347 Z m -0.474 2.0 H 25.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 v 4.873 c 3.962 -1.28 7.093 -4.41 8.373 -8.373 Z M 14.0 30.373 c -3.962 -1.28 -7.093 -4.41 -8.373 -8.373 H 10.5 c 1.933 0.0 3.5 1.567 3.5 3.5 v 4.873 Z m -8.521 -15.88 C 7.009 9.017 12.036 5.0 18.0 5.0 s 10.99 4.016 12.52 9.49 c -2.44 -0.094 -3.916 -0.907 -5.535 -1.804 l -0.016 -0.008 c -1.773 -0.983 -3.71 -2.056 -6.969 -2.056 c -3.184 0.0 -4.936 1.027 -6.57 1.986 l -0.154 0.09 c -1.505 0.88 -2.992 1.71 -5.797 1.795 Z M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 3.0 -15.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 s 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 10.0 c 0.0 -1.933 1.567 -3.5 3.5 -3.5 S 14.0 8.067 14.0 10.0 s -1.567 3.5 -3.5 3.5 S 7.0 11.933 7.0 10.0 Z m 3.5 -2.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.5 8.53 c 0.0 -0.122 0.0 -0.255 -0.01 -0.37 c -0.01 -0.13 -0.036 -0.3 -0.126 -0.477 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 c -0.176 -0.09 -0.348 -0.116 -0.477 -0.127 C 21.225 7.0 21.091 7.0 20.97 7.0 H 19.5 V 5.53 c 0.0 -0.122 0.0 -0.255 -0.01 -0.37 c -0.01 -0.13 -0.036 -0.3 -0.126 -0.477 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 c -0.176 -0.09 -0.348 -0.116 -0.477 -0.127 C 18.225 4.0 18.091 4.0 17.97 4.0 H 3.03 C 2.908 4.0 2.775 4.0 2.66 4.01 c -0.13 0.01 -0.3 0.036 -0.477 0.126 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 1.546 4.859 1.52 5.03 1.51 5.16 C 1.5 5.275 1.5 5.408 1.5 5.53 v 8.94 c 0.0 0.122 0.0 0.255 0.01 0.37 c 0.01 0.13 0.036 0.3 0.126 0.478 c 0.12 0.235 0.311 0.426 0.547 0.546 c 0.176 0.09 0.348 0.116 0.478 0.127 C 2.775 16.0 2.908 16.0 3.03 16.0 H 4.5 v 1.47 c 0.0 0.122 0.0 0.255 0.01 0.37 c 0.01 0.13 0.036 0.3 0.126 0.477 c 0.12 0.236 0.311 0.427 0.547 0.547 c 0.176 0.09 0.348 0.116 0.478 0.127 C 5.775 19.0 5.908 19.0 6.03 19.0 h 14.94 c 0.122 0.0 0.255 0.0 0.37 -0.01 c 0.13 -0.01 0.3 -0.036 0.477 -0.126 c 0.236 -0.12 0.427 -0.311 0.547 -0.547 c 0.09 -0.176 0.116 -0.348 0.127 -0.477 c 0.01 -0.115 0.009 -0.248 0.009 -0.37 V 8.53 Z M 6.0 16.0 v 1.5 h 15.0 v -9.0 h -1.5 v 5.97 c 0.0 0.122 0.0 0.255 -0.01 0.37 c -0.01 0.13 -0.036 0.3 -0.126 0.478 c -0.12 0.235 -0.311 0.426 -0.547 0.546 c -0.176 0.09 -0.348 0.116 -0.477 0.127 C 18.225 16.0 18.091 16.0 17.97 16.0 H 6.0 Z m -3.0 -1.5 h 15.0 v -9.0 H 3.0 v 9.0 Z")
        )
    }.build()
}

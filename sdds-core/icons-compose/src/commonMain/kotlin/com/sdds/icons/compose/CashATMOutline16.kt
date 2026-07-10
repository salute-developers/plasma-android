package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 3.0 C 14.776 3.0 15.0 2.776 15.0 2.5 S 14.776 2.0 14.5 2.0 h -3.328 h -0.03 H 4.86 h -0.03 h -3.326 c -0.276 0.0 -0.5 0.224 -0.5 0.5 S 1.227 3.0 1.503 3.0 h 2.31 v 0.046 v 9.907 c 0.0 0.086 0.0 0.177 0.006 0.257 c 0.007 0.089 0.025 0.205 0.086 0.325 c 0.081 0.16 0.212 0.29 0.371 0.371 c 0.12 0.061 0.236 0.08 0.326 0.086 C 4.68 14.0 4.772 14.0 4.859 14.0 h 6.283 c 0.086 0.0 0.178 0.0 0.257 -0.007 c 0.09 -0.007 0.206 -0.025 0.326 -0.086 c 0.16 -0.081 0.29 -0.211 0.371 -0.371 c 0.061 -0.12 0.079 -0.236 0.086 -0.325 c 0.007 -0.08 0.007 -0.171 0.007 -0.257 V 3.046 V 3.0 h 2.31 Z m -3.311 0.0 V 13.0 H 4.812 V 3.0 h 6.377 Z M 8.002 5.838 c 0.786 0.0 1.431 0.645 1.431 1.451 c 0.0 0.807 -0.645 1.452 -1.431 1.452 c -0.787 0.0 -1.432 -0.645 -1.432 -1.452 c 0.0 -0.806 0.645 -1.451 1.432 -1.451 Z m 2.431 1.451 c 0.0 -1.349 -1.084 -2.451 -2.431 -2.451 c -1.348 0.0 -2.432 1.102 -2.432 2.451 c 0.0 1.35 1.084 2.452 2.432 2.452 c 1.347 0.0 2.431 -1.103 2.431 -2.452 Z M 7.3 11.87 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.405 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 7.299 Z")
        )
    }.build()
}

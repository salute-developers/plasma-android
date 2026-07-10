package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.5 13.445 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -13.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 13.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.8 11.695 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.2 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 11.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.325 6.745 c 0.193 0.0 0.35 0.157 0.35 0.35 v 3.633 c 0.0 0.194 -0.157 0.35 -0.35 0.35 h -1.4 c -0.193 0.0 -0.35 -0.156 -0.35 -0.35 V 7.096 c 0.0 -0.194 0.157 -0.35 0.35 -0.351 h 1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.7 6.745 c 0.193 0.0 0.35 0.157 0.35 0.35 v 3.633 c 0.0 0.194 -0.157 0.35 -0.35 0.35 H 7.3 c -0.193 0.0 -0.35 -0.156 -0.35 -0.35 V 7.096 c 0.0 -0.194 0.157 -0.35 0.35 -0.351 h 1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.075 6.745 c 0.193 0.0 0.35 0.157 0.35 0.35 v 3.633 c 0.0 0.194 -0.157 0.35 -0.35 0.35 h -1.4 c -0.193 0.0 -0.35 -0.156 -0.35 -0.35 V 7.096 c 0.0 -0.194 0.157 -0.35 0.35 -0.351 h 1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.501 1.28 c 0.317 -0.146 0.682 -0.146 0.999 0.0 l 5.49 2.51 c 0.177 0.081 0.291 0.26 0.291 0.455 v 1.322 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 2.228 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 4.245 l 0.004 -0.072 C 1.757 4.007 1.864 3.86 2.02 3.79 L 7.5 1.28 Z m 0.583 0.908 c -0.053 -0.024 -0.114 -0.024 -0.167 0.0 l -5.19 2.377 v 0.502 h 10.554 v -0.5 L 8.084 2.187 Z")
        )
    }.build()
}

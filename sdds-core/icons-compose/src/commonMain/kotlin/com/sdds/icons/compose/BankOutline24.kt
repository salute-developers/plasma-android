package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.25 19.85 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 2.75 C 2.336 21.35 2.0 21.014 2.0 20.6 s 0.336 -0.75 0.75 -0.75 h 18.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.25 17.35 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.75 C 3.336 18.85 3.0 18.514 3.0 18.1 s 0.336 -0.75 0.75 -0.75 h 16.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.75 10.35 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.19 c 0.0 0.277 -0.224 0.5 -0.5 0.5 h -2.0 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 v -5.19 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 10.35 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.19 c 0.0 0.277 -0.224 0.5 -0.5 0.5 h -2.0 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 v -5.19 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.25 10.35 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.19 c 0.0 0.277 -0.224 0.5 -0.5 0.5 h -2.0 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 v -5.19 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.271 2.51 c 0.463 -0.212 0.995 -0.212 1.457 0.0 l 7.842 3.586 c 0.267 0.122 0.439 0.389 0.439 0.682 v 1.89 c 0.0 0.413 -0.336 0.75 -0.75 0.75 H 3.753 c -0.414 0.0 -0.75 -0.337 -0.75 -0.75 v -1.89 L 3.01 6.67 c 0.036 -0.25 0.196 -0.467 0.43 -0.574 l 7.83 -3.587 Z m 0.833 1.363 c -0.065 -0.03 -0.142 -0.03 -0.207 0.0 L 4.502 7.259 v 0.659 h 15.006 V 7.26 l -7.405 -3.387 Z")
        )
    }.build()
}

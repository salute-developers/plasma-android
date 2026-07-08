package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxPackFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxPackFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.75 2.25 C 15.75 2.112 15.862 2.0 16.0 2.0 h 2.0 c 0.138 0.0 0.25 0.112 0.25 0.25 V 4.0 c 0.0 0.37 -0.201 0.693 -0.5 0.866 v 6.136 c 0.69 0.008 1.109 0.04 1.461 0.171 c 0.747 0.28 1.337 0.869 1.616 1.616 C 21.0 13.254 21.0 13.836 21.0 15.0 v 3.0 c 0.0 1.164 0.0 1.746 -0.173 2.211 c -0.28 0.747 -0.869 1.337 -1.616 1.616 C 18.746 22.0 18.164 22.0 17.0 22.0 s -1.746 0.0 -2.211 -0.173 c -0.747 -0.28 -1.337 -0.869 -1.616 -1.616 C 13.0 19.746 13.0 19.164 13.0 18.0 v -3.0 c 0.0 -1.164 0.0 -1.746 0.173 -2.211 c 0.28 -0.747 0.869 -1.337 1.616 -1.616 c 0.352 -0.131 0.772 -0.163 1.461 -0.17 V 4.865 C 15.951 4.693 15.75 4.37 15.75 4.0 V 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 3.0 C 3.895 3.0 3.0 3.895 3.0 5.0 v 15.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 4.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 V 5.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 H 5.0 Z m 2.0 7.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 7.828 7.0 7.0 7.0 S 5.5 7.672 5.5 8.5 S 6.172 10.0 7.0 10.0 Z m 0.75 1.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 S 6.586 11.0 7.0 11.0 s 0.75 0.336 0.75 0.75 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mir24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mir24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.878 9.5 H 3.849 H 2.0 v 5.456 h 1.787 v -3.217 h 0.12 l 0.996 3.216 h 1.345 l 0.996 -3.214 h 0.12 v 3.215 h 1.787 V 9.5 H 7.398 H 7.353 C 7.103 9.497 6.59 9.49 6.375 10.21 c -0.133 0.448 -0.377 1.286 -0.732 2.513 H 5.508 c -0.331 -1.164 -0.572 -2.002 -0.724 -2.513 C 4.57 9.49 4.08 9.497 3.878 9.501 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.717 12.718 V 9.5 H 9.893 v 5.455 h 1.73 s 0.525 -0.048 0.76 -0.572 l 1.188 -2.645 h 0.143 v 3.216 h 1.824 V 9.502 h -1.73 s -0.5 0.045 -0.736 0.572 l -1.212 2.645 h -0.143 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.906 13.33 c 0.885 0.0 1.684 -0.516 1.938 -1.237 h -5.587 v 2.863 h 1.735 V 13.33 h 1.914 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.166 9.5 h 3.823 c 1.471 0.0 2.182 1.246 1.976 2.255 h -3.58 c -1.082 0.0 -2.128 -1.04 -2.219 -2.254 Z")
        )
    }.build()
}

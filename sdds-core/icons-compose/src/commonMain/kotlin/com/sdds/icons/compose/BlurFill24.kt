package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlurFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlurFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 0.854 -18.146 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 l -9.0 9.0 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.196 0.195 0.512 0.195 0.708 0.0 l 9.0 -9.0 Z M 16.03 5.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -11.0 11.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 11.0 -11.0 Z m 4.0 4.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -11.0 11.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 11.0 -11.0 Z m 0.824 2.116 c 0.195 0.196 0.195 0.512 0.0 0.708 l -9.0 9.0 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 9.0 -9.0 c 0.196 -0.195 0.512 -0.195 0.708 0.0 Z M 18.53 5.47 c 0.293 0.293 0.293 0.767 0.0 1.06 l -12.0 12.0 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 12.0 -12.0 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z m 1.324 10.884 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 l -3.5 3.5 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.196 0.195 0.512 0.195 0.708 0.0 l 3.5 -3.5 Z M 8.354 4.146 c 0.195 0.196 0.195 0.512 0.0 0.708 l -3.5 3.5 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 3.5 -3.5 c 0.196 -0.195 0.512 -0.195 0.708 0.0 Z")
        )
    }.build()
}

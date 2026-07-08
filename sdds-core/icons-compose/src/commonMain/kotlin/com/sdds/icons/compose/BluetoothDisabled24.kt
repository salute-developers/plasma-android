package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothDisabled24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothDisabled24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.08 15.914 c 0.178 0.142 0.282 0.358 0.282 0.586 c 0.0 0.228 -0.104 0.444 -0.282 0.586 l -5.625 4.5 c -0.225 0.18 -0.534 0.215 -0.794 0.09 S 11.237 21.288 11.237 21.0 v -6.192 l 1.5 -1.162 v 5.793 L 16.41 16.5 l -3.619 -2.896 l 1.221 -0.944 l 4.068 3.254 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.661 2.324 c 0.26 -0.125 0.57 -0.09 0.794 0.09 l 4.866 3.893 l 3.395 -2.627 c 0.328 -0.254 0.8 -0.194 1.053 0.133 c 0.253 0.328 0.193 0.799 -0.135 1.052 L 3.839 18.635 c -0.327 0.253 -0.8 0.192 -1.053 -0.135 c -0.253 -0.328 -0.192 -0.798 0.135 -1.052 l 7.46 -5.772 l -4.488 -3.59 C 5.569 7.827 5.517 7.355 5.776 7.03 c 0.258 -0.323 0.73 -0.376 1.054 -0.117 l 4.407 3.525 V 3.0 c 0.0 -0.288 0.165 -0.55 0.424 -0.676 Z m 1.076 7.53 L 16.1 7.25 l -3.363 -2.69 v 5.292 Z")
        )
    }.build()
}

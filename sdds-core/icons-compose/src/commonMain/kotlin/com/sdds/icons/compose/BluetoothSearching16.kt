package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothSearching16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothSearching16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.285 1.049 c 0.174 -0.083 0.38 -0.059 0.53 0.063 l 4.0 3.25 C 9.932 4.457 10.0 4.599 10.0 4.75 c 0.0 0.15 -0.068 0.293 -0.185 0.388 L 6.293 8.0 l 3.522 2.862 C 9.932 10.957 10.0 11.099 10.0 11.25 c 0.0 0.15 -0.068 0.293 -0.185 0.388 l -4.0 3.25 c -0.15 0.122 -0.356 0.146 -0.53 0.063 C 5.111 14.87 5.0 14.694 5.0 14.5 V 9.05 l -3.185 2.588 c -0.214 0.174 -0.529 0.142 -0.703 -0.073 c -0.174 -0.214 -0.142 -0.529 0.073 -0.703 L 4.707 8.0 L 1.185 5.138 C 0.97 4.964 0.938 4.65 1.112 4.435 C 1.286 4.22 1.601 4.188 1.815 4.362 L 5.0 6.95 V 1.5 c 0.0 -0.193 0.111 -0.369 0.285 -0.451 Z M 6.0 9.05 l 2.707 2.2 L 6.0 13.45 v -4.4 Z m 0.0 -2.1 v -4.4 l 2.707 2.2 L 6.0 6.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.0 8.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 9.5 8.414 9.5 8.0 s 0.336 -0.75 0.75 -0.75 S 11.0 7.586 11.0 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.063 4.007 c 0.134 -0.241 0.438 -0.328 0.68 -0.194 c 0.76 0.422 1.392 1.03 1.833 1.765 c 0.441 0.735 0.674 1.571 0.674 2.423 c 0.0 0.852 -0.233 1.687 -0.674 2.423 c -0.441 0.735 -1.074 1.343 -1.833 1.765 c -0.242 0.134 -0.546 0.047 -0.68 -0.194 c -0.134 -0.242 -0.047 -0.546 0.194 -0.68 c 0.61 -0.338 1.112 -0.824 1.461 -1.406 c 0.35 -0.581 0.532 -1.24 0.532 -1.908 c 0.0 -0.669 -0.183 -1.327 -0.532 -1.908 c -0.349 -0.582 -0.852 -1.068 -1.46 -1.406 c -0.242 -0.134 -0.33 -0.438 -0.195 -0.68 Z")
        )
    }.build()
}

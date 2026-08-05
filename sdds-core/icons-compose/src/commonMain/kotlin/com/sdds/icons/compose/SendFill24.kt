package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.582 12.673 C 21.838 12.546 22.0 12.286 22.0 12.0 c 0.0 -0.286 -0.162 -0.546 -0.418 -0.673 l -18.25 -9.0 C 3.049 2.187 2.708 2.24 2.48 2.46 C 2.253 2.678 2.186 3.016 2.315 3.305 l 2.657 5.978 c 0.106 0.239 0.3 0.426 0.542 0.523 l 4.906 1.962 c 0.21 0.084 0.21 0.38 0.0 0.464 l -4.906 1.962 c -0.242 0.097 -0.436 0.284 -0.542 0.523 l -2.657 5.978 c -0.129 0.289 -0.062 0.627 0.165 0.846 c 0.228 0.219 0.569 0.271 0.852 0.132 l 18.25 -9.0 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageDraftFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageDraftFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.19 17.505 l -0.68 3.397 c -0.07 0.35 0.238 0.658 0.588 0.588 l 3.397 -0.68 c -0.022 -0.394 -0.11 -0.783 -0.261 -1.15 c -0.176 -0.424 -0.434 -0.81 -0.76 -1.135 c -0.324 -0.325 -0.71 -0.583 -1.135 -0.759 c -0.366 -0.151 -0.755 -0.24 -1.15 -0.26 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.936 20.205 c 0.102 -0.078 0.199 -0.163 0.29 -0.254 L 18.249 9.927 c -0.002 -0.16 -0.014 -0.321 -0.035 -0.482 c -0.122 -0.927 -0.547 -1.789 -1.209 -2.45 c -0.661 -0.662 -1.523 -1.087 -2.45 -1.209 c -0.16 -0.02 -0.322 -0.033 -0.482 -0.035 L 4.049 15.774 c -0.091 0.091 -0.176 0.188 -0.254 0.29 c 0.383 0.061 0.758 0.168 1.118 0.317 c 0.607 0.25 1.158 0.62 1.623 1.084 C 7.0 17.928 7.368 18.48 7.619 19.087 c 0.15 0.36 0.256 0.735 0.317 1.118 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.635 7.541 L 19.577 8.6 c -0.252 -1.005 -0.773 -1.928 -1.511 -2.666 c -0.738 -0.738 -1.66 -1.259 -2.666 -1.51 l 1.059 -1.059 c 1.153 -1.153 3.023 -1.153 4.176 0.0 s 1.153 3.023 0.0 4.176 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.531 21.5 l 2.0 -2.0 H 20.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 8.531 Z")
        )
    }.build()
}

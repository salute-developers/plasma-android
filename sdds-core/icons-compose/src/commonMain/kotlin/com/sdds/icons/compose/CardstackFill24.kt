package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CardstackFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CardstackFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 3.75 C 7.0 3.336 7.338 3.0 7.75 3.0 h 8.5 C 16.666 3.0 17.0 3.336 17.0 3.75 S 16.666 4.5 16.25 4.5 h -8.5 C 7.338 4.5 7.0 4.164 7.0 3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.317 11.0 h 13.368 c 0.595 0.0 1.088 0.0 1.488 0.034 c 0.415 0.035 0.804 0.112 1.163 0.311 c 0.546 0.303 0.973 0.783 1.21 1.361 c 0.156 0.38 0.187 0.776 0.173 1.191 c -0.013 0.402 -0.07 0.892 -0.14 1.482 l -0.254 2.16 c -0.056 0.477 -0.103 0.876 -0.167 1.202 c -0.067 0.341 -0.163 0.658 -0.346 0.954 c -0.282 0.457 -0.691 0.82 -1.178 1.048 c -0.315 0.146 -0.64 0.205 -0.988 0.231 C 19.316 21.0 18.913 21.0 18.434 21.0 H 5.568 c -0.479 0.0 -0.881 0.0 -1.212 -0.026 c -0.347 -0.026 -0.673 -0.085 -0.988 -0.231 c -0.487 -0.227 -0.896 -0.591 -1.178 -1.048 c -0.183 -0.296 -0.279 -0.613 -0.346 -0.954 c -0.064 -0.326 -0.111 -0.725 -0.167 -1.201 l -0.254 -2.16 c -0.07 -0.591 -0.127 -1.082 -0.14 -1.483 c -0.014 -0.415 0.017 -0.81 0.173 -1.19 c 0.237 -0.579 0.664 -1.059 1.21 -1.362 c 0.36 -0.199 0.748 -0.276 1.163 -0.31 C 4.229 11.0 4.722 11.0 5.317 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.02 6.0 c 0.487 0.0 0.893 0.0 1.225 0.024 c 0.344 0.025 0.669 0.078 0.979 0.217 c 0.678 0.305 1.205 0.872 1.458 1.57 c 0.116 0.32 0.146 0.648 0.145 0.993 c 0.0 0.21 -0.016 0.436 -0.037 0.696 H 3.212 c -0.02 -0.26 -0.037 -0.487 -0.037 -0.696 c 0.0 -0.345 0.029 -0.673 0.145 -0.992 c 0.253 -0.7 0.78 -1.266 1.458 -1.57 c 0.31 -0.14 0.635 -0.193 0.979 -0.218 C 6.088 6.0 6.495 6.0 6.983 6.0 h 10.036 Z")
        )
    }.build()
}

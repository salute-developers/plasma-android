package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TrashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TrashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.431 3.819 c 0.0 -1.138 0.914 -2.069 2.052 -2.069 h 1.035 c 1.138 0.0 2.052 0.931 2.052 2.069 v 0.546 H 13.0 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -0.88 v 6.178 c 0.0 0.373 0.0 0.683 -0.02 0.936 c -0.021 0.263 -0.067 0.508 -0.183 0.739 c -0.18 0.356 -0.466 0.646 -0.82 0.829 c -0.23 0.118 -0.475 0.165 -0.736 0.186 c -0.251 0.021 -0.558 0.021 -0.927 0.021 H 6.566 c -0.369 0.0 -0.676 0.0 -0.927 -0.02 c -0.26 -0.022 -0.505 -0.069 -0.735 -0.188 c -0.354 -0.182 -0.641 -0.472 -0.82 -0.828 c -0.117 -0.231 -0.163 -0.476 -0.184 -0.739 c -0.02 -0.253 -0.02 -0.563 -0.02 -0.936 V 5.365 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 2.431 V 3.819 Z m 1.0 0.546 H 9.57 V 3.819 c 0.0 -0.596 -0.476 -1.069 -1.052 -1.069 H 7.483 c -0.576 0.0 -1.052 0.473 -1.052 1.069 v 0.546 Z m -1.552 1.0 v 6.158 c 0.0 0.399 0.0 0.668 0.018 0.876 c 0.016 0.202 0.045 0.301 0.08 0.369 c 0.084 0.168 0.22 0.304 0.385 0.39 c 0.064 0.033 0.161 0.062 0.36 0.079 c 0.204 0.017 0.47 0.017 0.865 0.017 h 2.828 c 0.394 0.0 0.66 0.0 0.864 -0.017 c 0.2 -0.017 0.296 -0.046 0.36 -0.08 c 0.166 -0.085 0.3 -0.22 0.386 -0.39 c 0.034 -0.067 0.063 -0.166 0.08 -0.368 c 0.016 -0.208 0.017 -0.477 0.017 -0.876 V 5.365 H 4.879 Z m 1.744 1.963 c 0.276 0.0 0.5 0.224 0.5 0.5 v 4.183 c 0.0 0.277 -0.224 0.5 -0.5 0.5 s -0.5 -0.223 -0.5 -0.5 V 7.829 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z m 3.256 0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 4.183 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 V 7.829 Z")
        )
    }.build()
}

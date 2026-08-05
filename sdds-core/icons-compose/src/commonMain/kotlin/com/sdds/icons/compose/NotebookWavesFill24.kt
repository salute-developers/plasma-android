package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookWavesFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookWavesFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 20.538 1.0 17.5 1.0 S 12.0 3.462 12.0 6.5 s 2.462 5.5 5.5 5.5 Z m -1.788 -6.156 c -0.4 -0.107 -0.812 0.13 -0.919 0.53 c -0.107 0.4 0.13 0.811 0.53 0.919 c 0.266 0.07 0.501 0.228 0.669 0.446 c 0.167 0.218 0.258 0.486 0.258 0.761 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 c 0.0 -0.605 -0.2 -1.194 -0.568 -1.674 c -0.369 -0.48 -0.885 -0.826 -1.47 -0.982 Z M 15.57 3.526 c 0.107 -0.4 0.518 -0.637 0.918 -0.53 c 1.223 0.328 2.303 1.05 3.074 2.054 c 0.77 1.004 1.188 2.234 1.188 3.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -0.936 -0.309 -1.845 -0.878 -2.587 c -0.57 -0.742 -1.368 -1.276 -2.272 -1.518 c -0.4 -0.107 -0.638 -0.519 -0.53 -0.919 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.4 5.0 h 4.774 C 11.06 5.482 11.0 5.984 11.0 6.5 c 0.0 3.59 2.91 6.5 6.5 6.5 c 0.886 0.0 1.73 -0.177 2.5 -0.498 V 13.6 c 0.0 0.84 0.0 1.26 -0.163 1.581 c -0.144 0.282 -0.374 0.512 -0.656 0.655 C 18.861 16.0 18.441 16.0 17.6 16.0 H 6.4 c -0.84 0.0 -1.26 0.0 -1.581 -0.164 c -0.282 -0.143 -0.512 -0.373 -0.656 -0.655 C 4.0 14.861 4.0 14.441 4.0 13.6 V 7.4 c 0.0 -0.84 0.0 -1.26 0.163 -1.581 c 0.144 -0.282 0.374 -0.512 0.656 -0.656 C 5.139 5.0 5.559 5.0 6.4 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 17.0 C 2.336 17.0 2.0 17.336 2.0 17.75 s 0.336 0.75 0.75 0.75 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.664 17.0 21.25 17.0 H 2.75 Z")
        )
    }.build()
}

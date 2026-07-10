package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.992 3.071 c -0.308 -0.123 -0.657 -0.085 -0.932 0.101 C 16.786 3.358 16.621 3.668 16.621 4.0 v 18.104 c -1.128 -1.054 -2.645 -1.7 -4.311 -1.7 c -3.483 0.0 -6.31 2.818 -6.31 6.298 s 2.827 6.297 6.31 6.297 c 3.482 0.0 6.31 -2.817 6.31 -6.297 h 0.001 v -13.28 l 10.008 3.993 c 0.308 0.123 0.657 0.085 0.931 -0.101 c 0.275 -0.186 0.44 -0.496 0.44 -0.828 v -6.42 c 0.0 -1.33 -0.81 -2.527 -2.046 -3.02 l -9.962 -3.975 Z M 28.0 15.011 l -9.379 -3.743 V 5.476 l 8.592 3.428 C 27.688 9.094 28.0 9.554 28.0 10.065 v 4.945 Z M 8.0 26.7 c 0.0 -2.37 1.927 -4.296 4.31 -4.296 c 2.383 0.0 4.31 1.926 4.31 4.297 c 0.0 2.37 -1.928 4.297 -4.31 4.297 c -2.383 0.0 -4.31 -1.926 -4.31 -4.297 Z")
        )
    }.build()
}

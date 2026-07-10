package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoteOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoteOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.017 1.039 c -0.154 -0.063 -0.33 -0.045 -0.468 0.048 S 7.33 1.335 7.33 1.502 v 8.307 C 6.816 9.356 6.148 9.08 5.413 9.08 C 3.796 9.08 2.5 10.414 2.5 12.04 c 0.0 1.625 1.296 2.958 2.914 2.958 s 2.914 -1.333 2.914 -2.958 V 5.934 l 4.484 1.827 c 0.155 0.062 0.33 0.044 0.468 -0.049 c 0.138 -0.092 0.221 -0.248 0.221 -0.414 V 4.315 c 0.0 -0.63 -0.382 -1.197 -0.965 -1.435 l -4.52 -1.841 Z M 12.5 6.554 l -4.173 -1.7 V 2.246 l 3.83 1.56 c 0.208 0.084 0.343 0.286 0.343 0.51 v 2.238 Z M 3.5 12.04 c 0.0 -1.09 0.866 -1.96 1.914 -1.96 s 1.914 0.87 1.914 1.96 c 0.0 1.09 -0.866 1.958 -1.914 1.958 S 3.5 13.13 3.5 12.04 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.77 6.0 C 5.973 6.0 4.52 7.455 4.52 9.25 v 8.394 c 0.0 1.795 1.454 3.25 3.25 3.25 H 17.0 v 3.205 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 5.0 v -1.661 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 5.31 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 27.35 h 10.75 c 1.794 0.0 3.25 -1.455 3.25 -3.25 v -3.205 h 6.207 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 9.25 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 H 7.769 Z M 6.52 9.25 C 6.52 8.56 7.078 8.0 7.77 8.0 h 17.437 c 0.69 0.0 1.25 0.56 1.25 1.25 v 8.394 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 7.769 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 V 9.25 Z M 33.0 10.031 c 0.0 -0.347 -0.18 -0.668 -0.474 -0.85 c -0.295 -0.183 -0.663 -0.2 -0.973 -0.044 l -0.758 0.38 c -0.339 0.168 -0.553 0.515 -0.553 0.893 v 6.07 c 0.0 0.379 0.214 0.725 0.553 0.895 l 0.758 0.379 c 0.31 0.154 0.678 0.138 0.973 -0.044 C 32.821 17.527 33.0 17.206 33.0 16.859 v -6.828 Z M 9.053 11.548 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 h 5.296 c 0.553 0.0 1.0 0.448 1.0 1.0 s -0.447 1.0 -1.0 1.0 h -5.296 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}

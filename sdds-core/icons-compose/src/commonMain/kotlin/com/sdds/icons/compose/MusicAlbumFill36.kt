package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 2.588 -24.66 c -0.533 -0.142 -1.082 0.174 -1.225 0.708 c -0.142 0.533 0.174 1.082 0.708 1.225 c 1.356 0.363 2.593 1.077 3.586 2.07 c 0.993 0.993 1.707 2.23 2.07 3.586 c 0.143 0.534 0.692 0.85 1.225 0.708 c 0.534 -0.143 0.85 -0.692 0.707 -1.225 c -0.454 -1.696 -1.347 -3.242 -2.588 -4.483 c -1.241 -1.241 -2.787 -2.134 -4.483 -2.588 Z M 9.048 19.364 c 0.533 -0.142 1.082 0.174 1.225 0.708 c 0.363 1.356 1.077 2.593 2.07 3.586 c 0.993 0.993 2.23 1.707 3.586 2.07 c 0.534 0.143 0.85 0.692 0.708 1.225 c -0.143 0.534 -0.692 0.85 -1.225 0.707 c -1.696 -0.454 -3.242 -1.347 -4.483 -2.588 c -1.241 -1.241 -2.134 -2.787 -2.588 -4.483 c -0.143 -0.533 0.173 -1.082 0.707 -1.225 Z M 18.0 22.125 c 2.278 0.0 4.125 -1.847 4.125 -4.125 S 20.278 13.875 18.0 13.875 S 13.875 15.722 13.875 18.0 s 1.847 4.125 4.125 4.125 Z")
        )
    }.build()
}

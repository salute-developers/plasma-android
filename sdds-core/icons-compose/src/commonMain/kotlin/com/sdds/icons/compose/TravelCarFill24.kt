package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TravelCarFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TravelCarFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.875 3.0 C 9.203 3.0 8.658 3.0 8.21 3.033 C 7.748 3.067 7.34 3.14 6.946 3.31 c -0.63 0.274 -1.173 0.715 -1.57 1.276 c -0.247 0.35 -0.4 0.736 -0.529 1.182 c -0.114 0.4 -0.218 0.888 -0.342 1.482 H 3.75 C 3.336 7.25 3.0 7.586 3.0 8.0 s 0.336 0.75 0.75 0.75 h 0.442 L 4.071 9.334 C 3.719 9.55 3.433 9.859 3.245 10.229 C 3.0 10.709 3.0 11.338 3.0 12.6 v 7.15 c 0.0 0.966 0.784 1.75 1.75 1.75 s 1.75 -0.784 1.75 -1.75 V 18.5 h 11.0 v 1.25 c 0.0 0.966 0.784 1.75 1.75 1.75 S 21.0 20.716 21.0 19.75 V 12.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.188 -0.37 -0.474 -0.679 -0.826 -0.895 L 19.808 8.75 h 0.442 C 20.664 8.75 21.0 8.414 21.0 8.0 s -0.336 -0.75 -0.75 -0.75 h -0.755 c -0.124 -0.594 -0.228 -1.082 -0.342 -1.482 c -0.128 -0.446 -0.282 -0.832 -0.53 -1.182 c -0.396 -0.56 -0.939 -1.002 -1.569 -1.276 c -0.393 -0.17 -0.802 -0.243 -1.265 -0.277 C 15.342 3.0 14.797 3.0 14.125 3.0 h -4.25 Z m 8.453 6.0 l -0.266 -1.276 c -0.144 -0.692 -0.245 -1.17 -0.351 -1.542 c -0.104 -0.362 -0.2 -0.571 -0.313 -0.73 c -0.238 -0.337 -0.563 -0.602 -0.941 -0.766 c -0.179 -0.077 -0.403 -0.13 -0.779 -0.157 C 15.293 4.5 14.803 4.5 14.097 4.5 H 9.903 c -0.707 0.0 -1.196 0.0 -1.581 0.029 c -0.376 0.028 -0.6 0.08 -0.779 0.157 C 7.165 4.85 6.84 5.116 6.602 5.452 C 6.489 5.61 6.392 5.82 6.289 6.182 c -0.106 0.371 -0.207 0.85 -0.35 1.542 L 5.671 9.0 h 12.656 Z M 16.5 15.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 S 15.0 13.172 15.0 14.0 s 0.672 1.5 1.5 1.5 Z M 9.0 14.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 S 6.0 14.828 6.0 14.0 s 0.672 -1.5 1.5 -1.5 S 9.0 13.172 9.0 14.0 Z")
        )
    }.build()
}

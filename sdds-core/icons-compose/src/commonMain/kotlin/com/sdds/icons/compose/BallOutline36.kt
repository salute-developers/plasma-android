package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.329 6.133 C 8.598 7.996 5.25 12.607 5.25 18.0 c 0.0 1.054 0.979 2.37 3.409 3.485 c 0.643 0.296 1.36 0.563 2.138 0.794 C 10.603 20.919 10.5 19.482 10.5 18.0 c 0.0 -3.956 0.734 -7.592 1.97 -10.28 c 0.255 -0.556 0.542 -1.09 0.859 -1.587 Z M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z m 12.75 15.0 c 0.0 -7.042 -5.708 -12.75 -12.75 -12.75 c -1.054 0.0 -2.37 0.979 -3.486 3.409 C 13.444 10.99 12.75 14.293 12.75 18.0 c 0.0 1.717 0.149 3.348 0.415 4.835 c 1.487 0.266 3.117 0.415 4.835 0.415 c 3.707 0.0 7.009 -0.693 9.341 -1.765 c 2.43 -1.116 3.409 -2.43 3.409 -3.485 Z m -17.029 7.203 C 15.081 25.397 16.518 25.5 18.0 25.5 c 3.956 0.0 7.592 -0.734 10.28 -1.97 c 0.556 -0.255 1.09 -0.542 1.587 -0.859 C 28.004 27.402 23.393 30.75 18.0 30.75 c -1.054 0.0 -2.37 -0.979 -3.486 -3.409 c -0.295 -0.643 -0.562 -1.36 -0.793 -2.138 Z m -2.455 -0.469 c -1.302 -0.315 -2.497 -0.721 -3.547 -1.204 c -0.555 -0.255 -1.09 -0.542 -1.586 -0.859 c 1.294 3.285 3.911 5.902 7.196 7.196 c -0.317 -0.496 -0.604 -1.03 -0.86 -1.586 c -0.482 -1.05 -0.888 -2.245 -1.203 -3.547 Z")
        )
    }.build()
}

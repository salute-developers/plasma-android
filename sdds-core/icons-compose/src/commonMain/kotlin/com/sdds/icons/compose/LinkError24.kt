package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LinkError24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LinkError24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.282 18.718 c -1.562 -1.562 -1.562 -4.095 0.0 -5.657 l 1.945 -1.944 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 L 4.221 12.0 c -2.148 2.148 -2.148 5.63 0.0 7.779 c 2.01 2.01 5.188 2.139 7.348 0.387 c -0.226 -0.501 -0.39 -1.037 -0.483 -1.596 l -0.148 0.148 c -1.562 1.562 -4.094 1.562 -5.657 0.0 Z M 19.778 4.222 c 2.01 2.01 2.14 5.188 0.388 7.348 c -0.502 -0.225 -1.037 -0.39 -1.597 -0.482 l 0.148 -0.148 c 1.563 -1.562 1.563 -4.095 0.0 -5.657 c -1.562 -1.562 -4.094 -1.562 -5.656 0.0 l -1.945 1.944 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.292 -0.294 -0.767 0.0 -1.06 L 12.0 4.222 c 2.148 -2.148 5.63 -2.148 7.778 0.0 Z M 7.581 15.36 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.292 0.294 0.767 0.294 1.06 0.0 l 7.778 -7.777 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 7.58 15.359 Z M 23.0 17.5 c 0.0 3.038 -2.463 5.5 -5.5 5.5 c -3.038 0.0 -5.5 -2.462 -5.5 -5.5 c 0.0 -3.037 2.462 -5.5 5.5 -5.5 c 3.037 0.0 5.5 2.463 5.5 5.5 Z m -7.975 -2.474 c 0.195 -0.196 0.512 -0.196 0.707 0.0 l 1.768 1.767 l 1.768 -1.767 c 0.195 -0.196 0.511 -0.196 0.707 0.0 c 0.195 0.195 0.195 0.511 0.0 0.707 L 18.207 17.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.196 0.196 -0.512 0.196 -0.707 0.0 L 17.5 18.208 l -1.768 1.767 c -0.195 0.196 -0.512 0.196 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 1.768 -1.768 l -1.768 -1.767 c -0.195 -0.196 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}

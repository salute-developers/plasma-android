package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.184 3.684 c 1.745 -1.746 4.333 -2.133 6.452 -1.167 c 0.224 0.102 0.384 0.307 0.427 0.55 c 0.044 0.241 -0.034 0.489 -0.207 0.663 L 16.25 6.336 c -0.098 0.097 -0.098 0.256 0.0 0.353 l 1.06 1.06 c 0.098 0.099 0.256 0.099 0.354 0.0 l 2.606 -2.605 c 0.174 -0.174 0.422 -0.251 0.663 -0.208 c 0.242 0.044 0.447 0.204 0.55 0.427 c 0.966 2.12 0.578 4.707 -1.168 6.453 c -1.468 1.469 -3.534 1.976 -5.413 1.524 l -7.675 7.675 c -1.172 1.172 -3.071 1.172 -4.243 0.0 c -1.171 -1.171 -1.171 -3.07 0.0 -4.242 l 7.675 -7.675 c -0.451 -1.88 0.056 -3.945 1.525 -5.414 Z m 4.729 -0.133 c -1.297 -0.203 -2.67 0.195 -3.669 1.194 c -1.172 1.172 -1.517 2.86 -1.031 4.338 c 0.088 0.269 0.018 0.564 -0.182 0.765 l -7.986 7.986 c -0.586 0.585 -0.586 1.535 0.0 2.12 c 0.586 0.587 1.535 0.587 2.121 0.0 l 7.986 -7.985 c 0.2 -0.2 0.496 -0.27 0.765 -0.182 c 1.477 0.486 3.165 0.14 4.338 -1.032 c 0.998 -0.998 1.397 -2.37 1.193 -3.668 l -1.724 1.724 c -0.683 0.683 -1.791 0.683 -2.474 0.0 L 15.189 7.75 c -0.684 -0.683 -0.684 -1.792 0.0 -2.475 l 1.724 -1.724 Z")
        )
    }.build()
}

package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageQuestionFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageQuestionFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 c 6.981 0.0 12.64 5.659 12.64 12.64 c 0.0 6.98 -5.659 12.64 -12.64 12.64 c -1.502 0.0 -2.944 -0.263 -4.283 -0.745 c -0.804 -0.29 -1.593 -0.373 -2.288 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z m 9.276 -2.917 c 0.0 -1.445 0.425 -2.13 0.887 -2.489 c 0.506 -0.393 1.246 -0.55 2.152 -0.55 c 0.907 0.0 1.647 0.157 2.152 0.55 c 0.463 0.36 0.887 1.044 0.887 2.489 c 0.0 1.175 -0.645 1.76 -1.604 2.48 c -0.064 0.048 -0.13 0.097 -0.2 0.147 c -0.864 0.638 -2.085 1.537 -2.085 3.207 c 0.0 0.47 0.38 0.85 0.85 0.85 s 0.85 -0.38 0.85 -0.85 c 0.0 -0.79 0.522 -1.182 1.605 -1.994 c 0.986 -0.74 2.284 -1.774 2.284 -3.84 c 0.0 -1.796 -0.547 -3.056 -1.543 -3.83 c -0.953 -0.742 -2.157 -0.91 -3.196 -0.91 c -1.038 0.0 -2.243 0.168 -3.195 0.91 c -0.996 0.774 -1.544 2.034 -1.544 3.83 c 0.0 0.47 0.38 0.85 0.85 0.85 s 0.85 -0.38 0.85 -0.85 Z m 3.04 10.37 c 0.716 0.0 1.296 -0.58 1.296 -1.297 c 0.0 -0.716 -0.58 -1.296 -1.296 -1.296 c -0.716 0.0 -1.297 0.58 -1.297 1.296 c 0.0 0.716 0.58 1.297 1.297 1.297 Z")
        )
    }.build()
}

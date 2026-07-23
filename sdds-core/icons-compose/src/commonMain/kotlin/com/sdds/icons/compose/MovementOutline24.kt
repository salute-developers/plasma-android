package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MovementOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MovementOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.717 7.386 c 1.44 -0.64 3.121 -0.855 4.662 -0.72 c 0.72 0.063 1.259 0.505 1.602 0.94 C 15.62 8.41 16.34 8.71 16.976 8.69 c 0.646 -0.02 1.346 -0.37 1.924 -1.141 c 0.249 -0.331 0.719 -0.399 1.05 -0.15 c 0.331 0.248 0.399 0.719 0.15 1.05 c -0.797 1.063 -1.893 1.704 -3.078 1.74 c -0.572 0.018 -1.133 -0.108 -1.659 -0.365 L 12.451 14.4 l 0.018 0.014 c 1.357 1.086 2.067 2.202 2.467 3.336 c 0.383 1.083 0.481 2.204 0.633 3.128 c 0.067 0.409 -0.21 0.795 -0.618 0.862 c -0.409 0.067 -0.794 -0.21 -0.861 -0.618 c -0.178 -1.076 -0.244 -1.955 -0.568 -2.872 c -0.302 -0.853 -0.832 -1.723 -1.94 -2.622 c -1.004 -0.511 -1.757 -1.065 -2.223 -1.715 c -0.504 -0.704 -0.633 -1.468 -0.468 -2.255 c 0.157 -0.744 0.57 -1.485 1.09 -2.222 c 0.259 -0.37 0.555 -0.754 0.88 -1.154 c -0.537 0.105 -1.056 0.262 -1.535 0.475 c -1.168 0.519 -2.05 1.342 -2.436 2.482 c -0.132 0.393 -0.557 0.603 -0.95 0.471 c -0.392 -0.132 -0.604 -0.558 -0.471 -0.95 c 0.55 -1.634 1.8 -2.73 3.248 -3.374 Z m 4.221 0.756 c -0.695 0.812 -1.282 1.52 -1.73 2.157 c -0.482 0.684 -0.755 1.224 -0.849 1.668 c -0.084 0.4 -0.025 0.73 0.22 1.073 c 0.13 0.182 0.322 0.375 0.59 0.581 l 2.983 -4.687 c -0.12 -0.124 -0.235 -0.257 -0.346 -0.398 c -0.202 -0.255 -0.402 -0.362 -0.558 -0.376 c -0.103 -0.009 -0.206 -0.013 -0.31 -0.018 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.376 15.584 c 0.23 -0.345 0.695 -0.438 1.04 -0.208 c 0.344 0.23 0.438 0.695 0.208 1.04 c -0.51 0.765 -1.095 1.524 -1.952 1.992 c -0.885 0.483 -1.952 0.6 -3.32 0.327 c -0.406 -0.081 -0.669 -0.476 -0.588 -0.883 c 0.082 -0.405 0.477 -0.669 0.883 -0.587 c 1.133 0.226 1.816 0.094 2.306 -0.173 c 0.517 -0.282 0.933 -0.773 1.423 -1.508 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.5 2.3 c 1.021 0.0 1.85 0.829 1.85 1.85 C 17.35 5.172 16.52 6.0 15.5 6.0 c -1.022 0.0 -1.85 -0.828 -1.85 -1.85 c 0.0 -1.021 0.828 -1.85 1.85 -1.85 Z")
        )
    }.build()
}

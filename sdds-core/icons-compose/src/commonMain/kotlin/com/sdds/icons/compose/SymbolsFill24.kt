package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SymbolsFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SymbolsFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.987 2.612 c 0.674 -1.161 2.352 -1.161 3.027 0.0 l 2.763 4.759 C 22.454 8.538 21.612 10.0 20.263 10.0 h -5.526 c -1.349 0.0 -2.19 -1.462 -1.513 -2.629 l 2.763 -4.759 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.371 13.25 c -0.395 0.0 -0.736 0.0 -1.017 0.023 c -0.297 0.024 -0.591 0.077 -0.875 0.222 c -0.424 0.216 -0.768 0.56 -0.984 0.983 c -0.144 0.284 -0.198 0.579 -0.222 0.875 c -0.023 0.281 -0.023 0.622 -0.023 1.018 v 2.258 c 0.0 0.395 0.0 0.736 0.023 1.017 c 0.024 0.296 0.078 0.591 0.222 0.875 c 0.216 0.424 0.56 0.768 0.984 0.983 c 0.284 0.145 0.578 0.199 0.875 0.223 c 0.28 0.023 0.622 0.023 1.017 0.023 h 2.258 c 0.395 0.0 0.737 0.0 1.017 -0.023 c 0.297 -0.024 0.592 -0.078 0.876 -0.223 c 0.423 -0.215 0.767 -0.56 0.983 -0.983 c 0.145 -0.284 0.198 -0.579 0.222 -0.875 c 0.023 -0.28 0.023 -0.622 0.023 -1.017 V 16.37 c 0.0 -0.395 0.0 -0.737 -0.023 -1.018 c -0.024 -0.296 -0.077 -0.591 -0.222 -0.875 c -0.216 -0.423 -0.56 -0.767 -0.983 -0.983 c -0.284 -0.145 -0.579 -0.198 -0.875 -0.222 c -0.281 -0.023 -0.622 -0.023 -1.018 -0.023 h -2.258 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.124 15.113 c 0.342 -0.341 0.342 -0.896 0.0 -1.237 c -0.341 -0.342 -0.895 -0.342 -1.237 0.0 L 6.5 16.262 l -2.386 -2.386 c -0.342 -0.342 -0.896 -0.342 -1.238 0.0 c -0.341 0.341 -0.341 0.896 0.0 1.237 L 5.263 17.5 l -2.387 2.386 c -0.341 0.342 -0.341 0.896 0.0 1.238 c 0.342 0.341 0.896 0.341 1.238 0.0 L 6.5 18.737 l 2.387 2.387 c 0.342 0.341 0.896 0.341 1.237 0.0 c 0.342 -0.342 0.342 -0.896 0.0 -1.238 L 7.738 17.5 l 2.386 -2.387 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.5 2.0 C 4.015 2.0 2.0 4.014 2.0 6.5 C 2.0 8.985 4.015 11.0 6.5 11.0 S 11.0 8.985 11.0 6.5 C 11.0 4.014 8.985 2.0 6.5 2.0 Z")
        )
    }.build()
}

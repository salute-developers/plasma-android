package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CapsuleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CapsuleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.095 21.681 l -8.776 -8.777 l 6.086 -6.086 c 2.424 -2.424 6.353 -2.424 8.777 0.0 c 2.424 2.423 2.424 6.353 0.0 8.776 l -6.087 6.087 Z m -10.19 -7.362 l 8.776 8.776 l -6.087 6.087 c -2.423 2.424 -6.353 2.424 -8.776 0.0 c -2.424 -2.424 -2.424 -6.353 0.0 -8.777 l 6.086 -6.086 Z m 6.086 -8.916 L 5.403 18.991 c -3.204 3.205 -3.204 8.4 0.0 11.605 c 3.205 3.205 8.4 3.205 11.605 0.0 l 13.588 -13.588 c 3.205 -3.204 3.205 -8.4 0.0 -11.605 c -3.205 -3.204 -8.4 -3.204 -11.605 0.0 Z m -6.276 14.483 c 0.625 0.0 1.131 -0.507 1.131 -1.132 c 0.0 -0.625 -0.506 -1.132 -1.131 -1.132 s -1.132 0.507 -1.132 1.132 c 0.0 0.625 0.507 1.132 1.132 1.132 Z m -3.397 3.397 c 0.0 0.625 -0.507 1.132 -1.132 1.132 c -0.625 0.0 -1.131 -0.507 -1.131 -1.132 c 0.0 -0.625 0.506 -1.132 1.131 -1.132 s 1.132 0.507 1.132 1.132 Z m 7.927 1.132 c 0.625 0.0 1.132 -0.507 1.132 -1.132 c 0.0 -0.625 -0.507 -1.132 -1.132 -1.132 c -0.625 0.0 -1.132 0.507 -1.132 1.132 c 0.0 0.625 0.507 1.132 1.132 1.132 Z m -3.399 3.397 c 0.0 0.626 -0.506 1.133 -1.131 1.133 s -1.132 -0.507 -1.132 -1.133 c 0.0 -0.625 0.507 -1.132 1.132 -1.132 c 0.625 0.0 1.131 0.507 1.131 1.132 Z m -1.131 -3.397 c 0.625 0.0 1.131 -0.507 1.131 -1.132 c 0.0 -0.625 -0.506 -1.132 -1.131 -1.132 s -1.132 0.507 -1.132 1.132 c 0.0 0.625 0.507 1.132 1.132 1.132 Z")
        )
    }.build()
}

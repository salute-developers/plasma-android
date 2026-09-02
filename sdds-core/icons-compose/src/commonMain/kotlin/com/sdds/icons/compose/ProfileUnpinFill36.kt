package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileUnpinFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileUnpinFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.216 3.204 c 0.391 -0.387 1.033 -0.393 1.435 -0.011 c 0.402 0.38 0.411 1.004 0.02 1.392 L 5.495 31.542 c -0.39 0.388 -1.034 0.394 -1.436 0.013 c -0.401 -0.38 -0.41 -1.005 -0.019 -1.393 l 2.895 -2.873 l -0.67 0.001 c -1.89 0.0 -3.424 -1.534 -3.424 -3.425 c 0.0 -1.034 0.468 -2.08 1.4 -2.702 c 2.525 -1.681 5.55 -2.66 8.796 -2.66 c 0.867 0.0 1.718 0.072 2.548 0.207 l 5.5 -5.455 l -0.079 -0.488 c -0.133 -0.835 0.514 -1.591 1.363 -1.592 h 0.812 l 8.036 -7.97 Z m -1.945 7.972 c 0.848 0.0 1.495 0.756 1.362 1.591 l -0.815 5.076 c -0.083 0.52 0.051 1.052 0.372 1.47 l 2.348 3.071 c 0.969 1.267 0.062 3.091 -1.537 3.091 h -3.784 v 6.05 l -1.397 1.65 l -1.398 -1.65 v -6.05 h -3.784 c -1.599 0.0 -2.507 -1.824 -1.538 -3.091 l 2.35 -3.07 c 0.32 -0.42 0.454 -0.952 0.37 -1.472 l -0.01 -0.065 l 6.654 -6.602 l 0.807 0.001 Z M 16.775 22.771 c -0.397 1.908 0.726 3.9 2.617 4.519 H 12.22 l 4.556 -4.52 Z M 13.037 5.49 c 3.182 0.0 5.736 2.616 5.737 5.81 c 0.0 3.192 -2.555 5.807 -5.736 5.808 c -3.183 0.0 -5.737 -2.616 -5.737 -5.81 c 0.0 -3.193 2.554 -5.808 5.736 -5.808 Z")
        )
    }.build()
}

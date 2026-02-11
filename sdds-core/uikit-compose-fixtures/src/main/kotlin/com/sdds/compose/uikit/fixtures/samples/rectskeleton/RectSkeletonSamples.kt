package com.sdds.compose.uikit.fixtures.samples.rectskeleton

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun RectSkeleton_Simple() {
    composableCodeSnippet {
        RectSkeleton(
            modifier = Modifier
                .width(128.dp)
                .height(32.dp),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun RectSkeleton_Custom() {
    val colors = listOf(Color(0xFFE0E0E0), Color(0xFFF5F5F5))
    composableCodeSnippet {
        RectSkeleton(
            modifier = Modifier.size(64.dp),
            shape = CircleShape, // кастомная форма
            duration = 1200, // кастомная длительность анимации
            brush = placeholder(Brush.sweepGradient(colors = colors), "/** Токен градиента */")
                .asStatefulValue(), // кастомный градиент
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun RectSkeleton_Style() {
    composableCodeSnippet {
        RectSkeletonStyle.builder()
            .gradient(Color.Cyan)
            .shape(CircleShape)
            .duration(700)
            .style()
    }
}

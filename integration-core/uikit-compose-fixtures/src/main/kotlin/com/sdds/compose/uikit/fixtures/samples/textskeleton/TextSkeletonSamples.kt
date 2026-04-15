package com.sdds.compose.uikit.fixtures.samples.textskeleton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.SkeletonLineWidthProvider
import com.sdds.compose.uikit.TextSkeleton
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun TextSkeleton_Simple() {
    composableCodeSnippet {
        TextSkeleton(
            textStyle = placeholder(LocalTextStyle.current, "/** Токен стиля текста */"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextSkeleton_Custom() {
    val colors = listOf(Color(0xFFE0E0E0), Color(0xFFF5F5F5))
    composableCodeSnippet {
        TextSkeleton(
            textStyle = placeholder(LocalTextStyle.current, "/** Токен стиля текста */"),
            lineCount = 5,
            lineWidthProvider = SkeletonLineWidthProvider.RandomDeviation(),
            brush = placeholder(Brush.horizontalGradient(colors = colors), "/** Токен градиента */"),
            duration = 1000,
            shape = placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"),
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TextSkeleton_Style() {
    composableCodeSnippet {
        TextSkeletonStyle.builder()
            .gradient(Color.Cyan)
            .shape(CircleShape)
            .duration(700)
            .style()
    }
}

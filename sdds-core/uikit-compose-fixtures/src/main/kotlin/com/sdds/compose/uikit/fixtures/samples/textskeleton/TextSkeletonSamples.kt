package com.sdds.compose.uikit.fixtures.samples.textskeleton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.SkeletonLineWidthProvider
import com.sdds.compose.uikit.TextSkeleton
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun TextSkeleton_Simple() {
    composableCodeSnippet {
        TextSkeleton(
            textStyle = placeholder(TextStyle.Default, "/** Токен типографики */"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextSkeleton_Custom() {
    composableCodeSnippet {
        TextSkeleton(
            textStyle = placeholder(TextStyle.Default, "/** Токен типографики */"),
            lineCount = 5,
            lineWidthProvider = SkeletonLineWidthProvider.RandomDeviation(),
            brush = placeholder(Brush.horizontalGradient(), "/** Токен градиента */"),
            duration = 1000,
            shape = placeholder(
                RoundedCornerShape(8.dp),
                "/** Токен формы(скругления) */",
            ),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextSkeleton_Style() {
    composableCodeSnippet {
        TextSkeletonStyle.builder()
            .gradient(Color.Cyan)
            .shape(CircleShape)
            .duration(700)
            .style()
    }
}

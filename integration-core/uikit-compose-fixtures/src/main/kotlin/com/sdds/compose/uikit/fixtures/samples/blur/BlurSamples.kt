package com.sdds.compose.uikit.fixtures.samples.blur

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.graphics.BlurStyle
import com.sdds.compose.uikit.graphics.blurEffect
import com.sdds.compose.uikit.graphics.blurSource
import com.sdds.compose.uikit.graphics.rememberBlurState
import com.sdds.docs.DocSample

/**
 * Пример: создание состояния блюра.
 */
@Composable
@DocSample(needScreenshot = false)
fun BlurSample_StateCreation() {
    composableCodeSnippet {
        val blurState = rememberBlurState()
    }
}

/**
 * Пример: создание стиля блюра.
 */
@Composable
@DocSample(needScreenshot = false)
fun BlurSample_StyleCreation() {
    composableCodeSnippet {
        val style = remember {
            BlurStyle.create(
                blurRadius = placeholder(24.dp, "// Радиус размытия в dp"),
                tint = placeholder(Color.White.copy(alpha = 0.6f), "// Токен цвета. Цвет должен быть с альфа-каналом"),
            )
        }
    }
}

/**
 * Пример: передача кастомного стиля напрямую в blurTarget.
 */
@Composable
@DocSample(needScreenshot = false)
fun BlurSample_CustomStyleOnTarget() {
    composableCodeSnippet {
        val blurState = rememberBlurState()

        Box(
            modifier = Modifier.blurEffect(
                state = blurState,
                style = BlurStyle.create(
                    blurRadius = 32.dp,
                    noiseFactor = 0.15f,
                ),
            ),
        )
    }
}

/**
 * Пример: рекомендуемый паттерн использования
 */
@Composable
@DocSample(needScreenshot = false)
fun BlurSample_RecommendedPattern() {
    composableCodeSnippet {
        Box(modifier = Modifier.fillMaxSize()) {
            val blurState = rememberBlurState()

            // Источник размытия. Какой-то фоновый контент.
            Box(Modifier.blurSource(blurState))

            // Контент, у которого будет размыт фон.
            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .blurEffect(blurState),
            )
        }
    }
}

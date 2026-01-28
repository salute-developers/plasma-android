package com.sdds.playground.sandbox.textskeleton.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.SkeletonLineWidthProvider
import com.sdds.compose.uikit.TextSkeleton
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme

/**
 * Экран с компонентом [TextSkeleton]
 */
@Composable
internal fun TextSkeletonScreen(componentKey: ComponentKey = ComponentKey.TextSkeleton) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<TextSkeletonViewModel>(
            factory = TextSkeletonViewModelFactory(
                defaultState = TextSkeletonUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { textSkeletonUiState, style ->
            Box(contentAlignment = Alignment.TopStart) {
                val defaultTextStyle = if (style.textStyle == TextStyle.Default) {
                    LocalTextStyle.current
                } else {
                    style.textStyle
                }
                Text(
                    text = textSkeletonUiState.text,
                    style = defaultTextStyle,
                    maxLines = textSkeletonUiState.lineCount,
                    modifier = Modifier.fillMaxWidth(),
                )
                TextSkeleton(
                    lineCount = textSkeletonUiState.lineCount,
                    textStyle = defaultTextStyle,
                    lineWidthProvider = when (textSkeletonUiState.width) {
                        TextSkeletonWidth.Random -> SkeletonLineWidthProvider.RandomDeviation()
                        TextSkeletonWidth.FullWidth -> SkeletonLineWidthProvider.FillMaxWidth
                    },
                    modifier = Modifier.fillMaxWidth(),
                    style = style,
                )
            }
        },
    )
}

@Composable
internal fun TextSkeletonPreview(style: TextSkeletonStyle) {
    SandboxTheme {
        TextSkeleton(
            style = style,
            lineCount = 3,
            textStyle = SddsServTheme.typography.bodyMNormal,
        )
    }
}

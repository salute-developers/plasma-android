package com.sdds.playground.sandbox.accordion

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Accordion
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Accordion]
 */
@Composable
internal fun AccordionScreen(componentKey: ComponentKey = ComponentKey.Accordion) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<AccordionViewModel>(
            factory = AccordionViewModelFactory(
                defaultState = AccordionUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { accordionUiState, style ->
            Accordion(style = style) {
                repeat(accordionUiState.amount) {
                    var opened by remember { mutableStateOf(false) }
                    AccordionItem(
                        opened = opened,
                        onClick = { opened = !opened },
                        title = accordionUiState.title,
                        iconAnimationSpec = iconAnimationSpec(accordionUiState.animation),
                        openTransition = openTransition(accordionUiState.animation),
                        closeTransition = closeTransition(accordionUiState.animation),
                    ) { Text(text = accordionUiState.contentText) }
                    if (accordionUiState.hasDivider && it != accordionUiState.amount - 1) {
                        Divider()
                    }
                }
            }
        },
    )
}

@Composable
private fun iconAnimationSpec(animationEnabled: Boolean): AnimationSpec<Float>? =
    if (animationEnabled) remember { spring() } else null

@Composable
private fun openTransition(animationEnabled: Boolean): EnterTransition =
    if (animationEnabled) remember { fadeIn() + expandVertically() } else EnterTransition.None

@Composable
private fun closeTransition(animationEnabled: Boolean): ExitTransition =
    if (animationEnabled) remember { fadeOut() + shrinkVertically() } else ExitTransition.None

@Composable
internal fun AccordionPreview(style: AccordionStyle) {
    SandboxTheme {
        Accordion(style = style) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                opened = opened,
                onClick = { opened = !opened },
                title = "Title",
                content = { Text("Content text") },
            )
        }
    }
}

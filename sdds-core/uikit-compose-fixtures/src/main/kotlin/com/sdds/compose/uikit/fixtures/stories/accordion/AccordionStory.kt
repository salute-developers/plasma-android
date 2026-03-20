package com.sdds.compose.uikit.fixtures.stories.accordion

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Accordion
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Text
import com.sdds.sandbox.AccordionUiStatePropertiesProducer
import com.sdds.sandbox.AccordionUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AccordionUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 9,
    val title: String = "Title",
    val contentText: String = "Content text",
    val animation: Boolean = true,
    val hasDivider: Boolean = false,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object AccordionStory : ComposeBaseStory<AccordionUiState, AccordionStyle>(
    ComponentKey.Accordion,
    AccordionUiState(),
    AccordionUiStatePropertiesProducer,
    AccordionUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AccordionStyle,
        state: AccordionUiState,
    ) {
        Accordion(
            style = style,
            modifier = Modifier.verticalScroll(rememberScrollState()),
        ) {
            repeat(state.amount) {
                var opened by remember { mutableStateOf(false) }
                AccordionItem(
                    opened = opened,
                    onClick = { opened = !opened },
                    title = state.title,
                    iconAnimationSpec = iconAnimationSpec(state.animation),
                    openTransition = openTransition(state.animation),
                    closeTransition = closeTransition(state.animation),
                ) { Text(text = state.contentText) }
                if (state.hasDivider && it != state.amount - 1) {
                    Divider()
                }
            }
        }
    }

    @Composable
    override fun Preview(style: AccordionStyle, key: ComponentKey) {
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

@Composable
private fun iconAnimationSpec(animationEnabled: Boolean): AnimationSpec<Float>? =
    if (animationEnabled) remember { spring() } else null

@Composable
private fun openTransition(animationEnabled: Boolean): EnterTransition =
    if (animationEnabled) remember { fadeIn() + expandVertically() } else EnterTransition.None

@Composable
private fun closeTransition(animationEnabled: Boolean): ExitTransition =
    if (animationEnabled) remember { fadeOut() + shrinkVertically() } else ExitTransition.None

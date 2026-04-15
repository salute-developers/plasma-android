package com.sdds.compose.uikit.fixtures.stories.linkbutton

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonIcons
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.fixtures.stories.LinkButtonUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.LinkButtonUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.button.ButtonIcon
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class LinkButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val icon: ButtonIcon = ButtonIcon.Start,
    val spacing: ButtonSpacing = ButtonSpacing.Packed,
    val hasFixedWidth: Boolean = false,
    val enabled: Boolean = true,
    val loading: Boolean = false,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class ButtonIcon {
    Start,
    End,
    No,
}

@Story
object LinkButtonStory : ComposeBaseStory<LinkButtonUiState, ButtonStyle>(
    ComponentKey.LinkButton,
    LinkButtonUiState(),
    LinkButtonUiStatePropertiesProducer,
    LinkButtonUiStateTransformer,
) {

    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: LinkButtonUiState) {
        Button(
            style = style,
            label = state.label,
            enabled = state.enabled,
            loading = state.loading,
            spacing = state.spacing,
            icons = when (state.icon) {
                ButtonIcon.End -> ButtonIcons(endRes = R.drawable.ic_plasma_24)
                ButtonIcon.No -> null
                ButtonIcon.Start -> ButtonIcons(startRes = R.drawable.ic_plasma_24)
            },
            onClick = {},
        )
    }

    @Composable
    override fun Preview(
        style: ButtonStyle,
        key: ComponentKey,
    ) {
        Button(
            style = style,
            icons = ButtonIcons(start = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = ButtonSpacing.Packed,
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

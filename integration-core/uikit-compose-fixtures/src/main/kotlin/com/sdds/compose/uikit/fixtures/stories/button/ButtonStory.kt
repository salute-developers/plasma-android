package com.sdds.compose.uikit.fixtures.stories.button

import android.util.Log
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonIcons
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.fixtures.stories.ButtonUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ButtonUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "label",
    val value: String? = null,
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
object BasicButtonStory : ComposeBaseStory<ButtonUiState, ButtonStyle>(
    ComponentKey.BasicButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {

    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: ButtonUiState) {
        val widthModifier = if (state.hasFixedWidth) {
            Modifier.width(260.dp)
        } else {
            Modifier
        }
        Button(
            modifier = widthModifier,
            label = state.label,
            value = state.value,
            style = style,
            enabled = state.enabled,
            loading = state.loading,
            spacing = state.spacing,
            icons = when (state.icon) {
                ButtonIcon.End -> ButtonIcons(endRes = com.sdds.icons.R.drawable.ic_plasma_24)
                ButtonIcon.No -> null
                ButtonIcon.Start -> ButtonIcons(startRes = com.sdds.icons.R.drawable.ic_plasma_24)
            },
            onClickLabel = "Протестировать текст для Accessibility",
            onClick = {
                Log.d("BasicButton", "onClick")
            },
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

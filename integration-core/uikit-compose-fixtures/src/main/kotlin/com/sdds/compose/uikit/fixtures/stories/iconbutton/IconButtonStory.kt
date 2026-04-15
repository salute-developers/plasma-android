package com.sdds.compose.uikit.fixtures.stories.iconbutton

import android.util.Log
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.fixtures.stories.IconButtonUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.IconButtonUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class IconButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
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
object IconBasicButtonStory : ComposeBaseStory<IconButtonUiState, ButtonStyle>(
    ComponentKey.IconButton,
    IconButtonUiState(),
    IconButtonUiStatePropertiesProducer,
    IconButtonUiStateTransformer,
) {

    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: IconButtonUiState) {
        IconButton(
            iconRes = R.drawable.ic_plasma_24,
            style = style,
            enabled = state.enabled,
            loading = state.loading,
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
        IconButton(
            iconRes = R.drawable.ic_plasma_24,
            style = style,
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

package com.sdds.compose.uikit.fixtures.stories.switcher

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.fixtures.stories.SwitchUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.SwitchUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние switch
 *
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 * @property toggleable может ли switch переключаться по нажатию
 */
@StoryUiState
data class SwitchUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val description: String = "Description",
    val enabled: Boolean = true,
    val toggleable: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object SwitchStory : ComposeBaseStory<SwitchUiState, SwitchStyle>(
    ComponentKey.Switch,
    SwitchUiState(),
    SwitchUiStatePropertiesProducer,
    SwitchUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SwitchStyle,
        state: SwitchUiState,
    ) {
        var activeState by remember { mutableStateOf(false) }
        Switch(
            active = activeState,
            label = state.label,
            style = style,
            description = state.description,
            enabled = state.enabled,
            onActiveChanged = {
                if (state.toggleable) activeState = it
            },
        )
    }

    @Composable
    override fun Preview(
        style: SwitchStyle,
        key: ComponentKey,
    ) {
        Switch(
            style = style,
            active = true,
            label = "Label",
            description = "Description",
            enabled = true,
        )
    }
}

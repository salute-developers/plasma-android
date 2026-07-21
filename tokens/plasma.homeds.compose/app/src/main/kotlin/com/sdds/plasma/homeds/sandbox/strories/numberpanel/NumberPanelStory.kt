package com.sdds.plasma.homeds.sandbox.strories.numberpanel

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.plasma.homeds.components.numberpanel.NumberPanel
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsNumberPanelUiStatePropertiesProducer
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsNumberPanelUiStateTransformer
import com.sdds.plasma.homeds.integration.custom.NumberPanelKey
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонетна NumberPanel в песочнице
 *
 * @param value передаваемое значение
 * @param enabled активен ли компонент
 */
@StoryUiState
data class HomeDsNumberPanelUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val value: String = "20.4",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
internal object NumberPanelStory : ComposeBaseStory<HomeDsNumberPanelUiState, NumberPanelStyle>(
    NumberPanelKey,
    HomeDsNumberPanelUiState(),
    HomeDsNumberPanelUiStatePropertiesProducer,
    HomeDsNumberPanelUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NumberPanelStyle,
        state: HomeDsNumberPanelUiState,
    ) {
        val currentValue = state.value.toFloatOrNull() ?: 23.4f
        NumberPanel(
            value = currentValue,
            style = style,
            enabled = state.enabled,
        )
    }

    @Composable
    override fun Preview(style: NumberPanelStyle, key: ComponentKey) {
        NumberPanel(
            value = 23.4f,
            style = style,
        )
    }
}

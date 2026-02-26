package com.sdds.compose.uikit.fixtures.stories.button

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.sandbox.ButtonGroupUiStatePropertiesProducer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.StateValueTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.sandbox.enumProperty

@StoryUiState
data class ButtonGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    @StoryProperty("orient", producedBy = ButtonGroupOrientationProperty::class)
    val orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    @StoryProperty(transformedBy = ButtonGroupAmountTransformer::class)
    val amount: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ButtonGroupStory: ComposeBaseStory<ButtonGroupUiState, ButtonGroupStyle>(
    ComponentKey.ButtonGroup,
    ButtonGroupUiState(),
    ButtonGroupUiStatePropertiesProducer
) {
    @Composable
    override fun BoxScope.Content(style: ButtonGroupStyle, state: ButtonGroupUiState) {
        val scrollModifier = when (state.orientation) {
            ButtonGroupOrientation.Vertical -> Modifier.verticalScroll(rememberScrollState())
            ButtonGroupOrientation.Horizontal -> Modifier.horizontalScroll(rememberScrollState())
        }
        Box(modifier = scrollModifier) {
            ButtonGroup(
                style = style,
                modifier = Modifier.padding(12.dp),
                orientation = state.orientation,
            ) {
                repeat(state.amount) {
                    buttonContent(state.appearance)
                }
            }
        }
    }

    private fun ButtonGroupScope.buttonContent(appearance: String = "") {
        if (appearance.contains("Icon")) {
            button { IconButton(painterResource(R.drawable.ic_plasma_24), {}) }
        } else {
            button {
                Button(
                    label = "label",
                    value = "value",
                    onClick = {},
                )
            }
        }
    }
}

object ButtonGroupOrientationProperty : PropertyProducer<ButtonGroupUiState> {

    override fun produce(state: ButtonGroupUiState): Property<*> {
        return enumProperty(
            name = "orientation",
            value = state.orientation,
        )
    }
}

object ButtonGroupAmountTransformer : StateValueTransformer<Int, Int> {
    override fun transform(input: Int): Int {
        return input.coerceAtLeast(0)
    }

}

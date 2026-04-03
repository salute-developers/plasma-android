package com.sdds.compose.uikit.fixtures.stories.badge

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.fixtures.stories.BadgeUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.BadgeUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние Badge
 * @property type вариации стилией
 * @see [BadgeType]
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
@StoryUiState
data class BadgeUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object BadgeStory : ComposeBaseStory<BadgeUiState, BadgeStyle>(
    ComponentKey.Badge,
    BadgeUiState(),
    BadgeUiStatePropertiesProducer,
    BadgeUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: BadgeStyle,
        state: BadgeUiState,
    ) {
        Badge(
            style = style,
            label = state.label,
            startContent = badgeContent(state.contentLeft),
            endContent = badgeContent(state.contentRight),
        )
    }

    @Composable
    override fun Preview(
        style: BadgeStyle,
        key: ComponentKey,
    ) {
        Badge(
            style = style,
            label = "Label",
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
        )
    }
}

internal fun badgeContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

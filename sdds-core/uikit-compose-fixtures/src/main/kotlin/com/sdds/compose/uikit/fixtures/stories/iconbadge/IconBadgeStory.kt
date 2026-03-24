package com.sdds.compose.uikit.fixtures.stories.iconbadge

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.compose.uikit.fixtures.stories.IconBadgeUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.IconBadgeUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.badge.badgeContent
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class IconBadgeUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object IconBadgeStory : ComposeBaseStory<IconBadgeUiState, BadgeStyle>(
    ComponentKey.IconBadge,
    IconBadgeUiState(),
    IconBadgeUiStatePropertiesProducer,
    IconBadgeUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: BadgeStyle,
        state: IconBadgeUiState,
    ) {
        IconBadge(
            style = style,
            content = badgeContent(true),
        )
    }

    @Composable
    override fun Preview(
        style: BadgeStyle,
        key: ComponentKey,
    ) {
        IconBadge(
            style = style,
            content = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
        )
    }
}

package com.sdds.sbcom.compose.sandbox.stories.avatar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.fixtures.stories.avatar.ExampleMode
import com.sdds.compose.uikit.graphics.cutout.cutout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.StateValueTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.sbcom.compose.sandbox.stories.SbComAvatarUiStatePropertiesProducer
import com.sdds.sbcom.compose.sandbox.stories.SbComAvatarUiStateTransformer

@StoryUiState
data class SbComAvatarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val status: AvatarStatus = AvatarStatus.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    @StoryProperty(
        producedBy = AvatarPlaceholderPropertyProducer::class,
        transformedBy = AvatarPlaceholderPropertyTransformer::class,
    )
    val placeholder: AvatarPlaceholder? = AvatarPlaceholder.Name("Michael Scott"),
    val hasBadge: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal object AvatarPlaceholderPropertyTransformer : StateValueTransformer<String, AvatarPlaceholder?> {
    override fun transform(input: String): AvatarPlaceholder? =
        if (input.isNotEmpty()) {
            AvatarPlaceholder.Name(input)
        } else {
            null
        }
}

internal object AvatarPlaceholderPropertyProducer : PropertyProducer<SbComAvatarUiState> {

    override fun produce(state: SbComAvatarUiState): Property<*> {
        return Property.StringProperty(
            "placeholder",
            state.placeholder?.name.orEmpty(),
        )
    }

    private val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
}

@Story
internal object AvatarStory : ComposeBaseStory<SbComAvatarUiState, AvatarStyle>(
    ComponentKey.Avatar,
    SbComAvatarUiState(),
    SbComAvatarUiStatePropertiesProducer,
    SbComAvatarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AvatarStyle,
        state: SbComAvatarUiState,
    ) {
        Avatar(
            style = style,
            status = state.status.takeIf { shouldDisplayStatus(state, style) } ?: AvatarStatus.None,
            placeholder = state.placeholder,
            extra = { AvatarExtra(state, style) },
        ) {
            AvatarContent(state)
        }
    }

    @Composable
    override fun Preview(style: AvatarStyle, key: ComponentKey) {
        Avatar(
            style = style,
            status = AvatarStatus.Active,
            actionEnabled = false,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}

private fun shouldDisplayStatus(state: SbComAvatarUiState, style: AvatarStyle): Boolean {
    return !state.hasBadge || style.iconBadgeStyle == null
}

@Composable
private fun BoxScope.AvatarExtra(state: SbComAvatarUiState, style: AvatarStyle) {
    if (state.hasBadge && style.iconBadgeStyle != null) {
        IconBadge(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .cutout(),
            content = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_volume_dash_fill_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
private fun BoxScope.AvatarContent(avatarUiState: SbComAvatarUiState) {
    when (avatarUiState.exampleMode) {
        ExampleMode.Local -> Image(
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = com.sdds.compose.uikit.fixtures.R.drawable.il_avatar_test),
            contentDescription = "Avatar",
        )

        ExampleMode.Remote -> AsyncImage(
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop,
            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
            contentDescription = "AsyncAvatar",
        )
        ExampleMode.Placeholder -> {}
    }
}

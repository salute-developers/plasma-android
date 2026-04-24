package com.sdds.compose.uikit.fixtures.stories.avatar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fixtures.stories.AvatarGroupUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AvatarGroupUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AvatarGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    @StoryProperty(
        producedBy = AvatarGroupPlaceholderPropertyProducer::class,
        transformedBy = AvatarPlaceholderPropertyTransformer::class,
    )
    val placeholder: AvatarPlaceholder? = AvatarPlaceholder.Name("Michael Scott"),
    val threshold: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal object AvatarGroupPlaceholderPropertyProducer : PropertyProducer<AvatarGroupUiState> {

    override fun produce(state: AvatarGroupUiState): Property<*> {
        return Property.StringProperty(
            "placeholder",
            state.placeholder?.name.orEmpty(),
        )
    }

    private val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
}

@Story
object AvatarGroupStory : ComposeBaseStory<AvatarGroupUiState, AvatarGroupStyle>(
    ComponentKey.AvatarGroup,
    AvatarGroupUiState(),
    AvatarGroupUiStatePropertiesProducer,
    AvatarGroupUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AvatarGroupStyle,
        state: AvatarGroupUiState,
    ) {
        AvatarGroup(
            style = style,
            threshold = state.threshold,
        ) {
            avatars(3) { index ->
                if (index % 2 == 0) {
                    Avatar(placeholder = state.placeholder)
                } else {
                    Avatar {
                        AsyncImage(
                            modifier = Modifier.matchParentSize(),
                            contentScale = ContentScale.Crop,
                            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                            contentDescription = "AsyncAvatar",
                        )
                    }
                }
            }

            avatar {
                Avatar {
                    Image(
                        modifier = Modifier.matchParentSize(),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.il_avatar_test),
                        contentDescription = "Avatar",
                    )
                }
            }
            counter {
                AvatarCounter(displayCount = it)
            }
        }
    }

    @Composable
    override fun Preview(
        style: AvatarGroupStyle,
        key: ComponentKey,
    ) {
        AvatarGroup(
            style = style,
            threshold = 1,
        ) {
            avatar {
                Avatar(
                    status = AvatarStatus.Active,
                    actionEnabled = false,
                    placeholder = AvatarPlaceholder.Name("Michael Scott"),
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentScale = ContentScale.Fit,
                )
            }
            avatar {
                Avatar(
                    status = AvatarStatus.Active,
                    actionEnabled = false,
                    placeholder = AvatarPlaceholder.Name("Michael Scott"),
                )
            }
            counter {
                AvatarCounter(3)
            }
        }
    }
}

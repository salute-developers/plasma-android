package com.sdds.compose.uikit.fixtures.stories.avatar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fixtures.stories.badge.badgeContent
import com.sdds.sandbox.AvatarUiStatePropertiesProducer
import com.sdds.sandbox.AvatarUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.StateValueTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние [Avatar]
 *
 * @property status статус [AvatarStatus]
 * @property exampleMode режим отображения аватара
 * @property placeholder текст-заглушка
 * @property threshold максимальное кол-во отображаемых [Avatar]
 * @property extra обвесы (badge, counter)
 * @property extraPlacement расположение обвесов
 * @property badgeText текст badge
 * @property badgeContentStart иконка badge вначале
 * @property badgeContentEnd иконка badge вконце
 * @property counterText текст счетчика
 */
@StoryUiState
data class AvatarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val status: AvatarStatus = AvatarStatus.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    @StoryProperty(
        producedBy = AvatarPlaceholderPropertyProducer::class,
        transformedBy = AvatarPlaceholderPropertyTransformer::class,
    )
    val placeholder: AvatarPlaceholder? = AvatarPlaceholder.Name("Michael Scott"),
    val threshold: Int = DEFAULT_THRESHOLD,
    val extra: AvatarExtra = AvatarExtra.None,
    val extraPlacement: AvatarExtraPlacement = AvatarExtraPlacement.TopStart,
    val badgeText: String = "Label",
    val badgeContentStart: Boolean = false,
    val badgeContentEnd: Boolean = false,
    val counterText: String = "1",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

object AvatarPlaceholderPropertyTransformer : StateValueTransformer<String, AvatarPlaceholder?> {
    override fun transform(input: String): AvatarPlaceholder? =
        if (input.isNotEmpty()) {
            AvatarPlaceholder.Name(input)
        } else {
            null
        }
}

object AvatarPlaceholderPropertyProducer : PropertyProducer<AvatarUiState> {

    override fun produce(state: AvatarUiState): Property<*> {
        return Property.StringProperty(
            "placeholder",
            state.placeholder?.name.orEmpty(),
        )
    }

    private val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
}

/**
 * Режим отображения аватара.
 * Нужен только для песочницы, чтобы показать, что аватар может работать в нескольких режимах.
 */
enum class ExampleMode {
    /**
     * Аватар будет отображать локальное изображение
     */
    Local,

    /**
     * Аватар будет отображать изображение, загруженное из интернета
     */
    Remote,

    /**
     * Аватар будет отображать заглушку
     */
    Placeholder,
}

/**
 * Обвесы аватара
 */
enum class AvatarExtra {
    /**
     * Без обвеса
     */
    None,

    /**
     * Бейдж
     */
    Badge,

    /**
     * Счетчик
     */
    Counter,
}

/**
 * Расположение обвесов [Avatar]
 * @property alignment значение расположения
 */
enum class AvatarExtraPlacement(val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    BottomEnd(Alignment.BottomEnd),
    BottomStart(Alignment.BottomStart),
}

@Story
object AvatarStory : ComposeBaseStory<AvatarUiState, AvatarStyle>(
    ComponentKey.Avatar,
    AvatarUiState(),
    AvatarUiStatePropertiesProducer,
    AvatarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AvatarStyle,
        state: AvatarUiState,
    ) {
        Avatar(
            style = style,
            status = state.status,
            placeholder = state.placeholder,
            extra = { AvatarExtra(state, style) },
        ) {
            AvatarContent(state)
        }
    }
}

@Story
object AvatarGroupStory : ComposeBaseStory<AvatarUiState, AvatarGroupStyle>(
    ComponentKey.AvatarGroup,
    AvatarUiState(),
    AvatarUiStatePropertiesProducer,
    AvatarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AvatarGroupStyle,
        state: AvatarUiState,
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
}

@Composable
private fun BoxScope.AvatarExtra(state: AvatarUiState, style: AvatarStyle) {
    if (state.extra == AvatarExtra.Badge && style.badgeStyle != null) {
        Badge(
            modifier = Modifier.align(state.extraPlacement.alignment),
            label = state.badgeText,
            startContent = badgeContent(state.badgeContentStart),
            endContent = badgeContent(state.badgeContentEnd),
        )
    } else if (state.extra == AvatarExtra.Counter && style.counterStyle != null) {
        Counter(
            modifier = Modifier.align(state.extraPlacement.alignment),
            count = state.counterText,
        )
    }
}

@Composable
private fun BoxScope.AvatarContent(avatarUiState: AvatarUiState) {
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

private const val DEFAULT_THRESHOLD = 3

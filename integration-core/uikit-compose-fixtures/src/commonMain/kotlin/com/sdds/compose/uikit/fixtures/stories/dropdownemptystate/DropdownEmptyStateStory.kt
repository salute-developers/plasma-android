package com.sdds.compose.uikit.fixtures.stories.dropdownemptystate

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.DropdownScope
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.LocalDropdownEmptyStateStyle
import com.sdds.compose.uikit.fixtures.stories.DropdownEmptyStateUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DropdownEmptyStateUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории пустого состояния выпадающего меню. */
@StoryUiState
data class DropdownEmptyStateUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val description: String = "Ничего не найдено",
    val buttonLabel: String = "",
    val icon: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "DropdownEmptyState")
object DropdownEmptyStateStory : ComposeBaseStory<DropdownEmptyStateUiState, DropdownEmptyStateStyle>(
    ComponentKey.DropdownEmptyState,
    DropdownEmptyStateUiState(),
    DropdownEmptyStateUiStatePropertiesProducer,
    DropdownEmptyStateUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DropdownEmptyStateStyle,
        state: DropdownEmptyStateUiState,
    ) {
        // EmptyState объявлен на DropdownScope (маркерный интерфейс): вне меню рисуем его через пустой scope.
        // Перегрузка с `iconSource` не передаёт `style` вложенному EmptyState, и тот берёт стиль из composition local,
        // как внутри DropdownMenu: без него пропадают цвета, кнопка и отступы стиля.
        val scope = remember { object : DropdownScope {} }
        CompositionLocalProvider(LocalDropdownEmptyStateStyle provides style) {
            with(scope) {
                EmptyState(
                    style = style,
                    iconSource = if (state.icon) imageVectorSource(SddsIcons.Plasma24) else null,
                    description = state.description,
                    buttonLabel = state.buttonLabel.takeIf { it.isNotEmpty() },
                    onClick = {},
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: DropdownEmptyStateStyle,
        key: ComponentKey,
    ) {
        val scope = remember { object : DropdownScope {} }
        CompositionLocalProvider(LocalDropdownEmptyStateStyle provides style) {
            with(scope) { EmptyState(style = style, description = "Ничего не найдено") }
        }
    }
}

package com.sdds.sbcom.compose.sandbox.stories.tabbar

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.sbcom.compose.sandbox.stories.TabBarUiStatePropertiesProducer
import com.sdds.sbcom.compose.sandbox.stories.TabBarUiStateTransformer

@StoryUiState
data class TabBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val extraType: TabBarExtraType = TabBarExtraType.Counter,
    val amount: Int = 4,
    @StoryProperty(producedBy = CounterAmountProperty::class)
    val counter: String = "3",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

object CounterAmountProperty : PropertyProducer<TabBarUiState> {
    override fun produce(state: TabBarUiState): Property<*> {
        return Property.StringProperty(
            name = "counter",
            value = state.counter,
            enabled = state.extraType == TabBarExtraType.Counter,
        )
    }
}

enum class TabBarExtraType {
    None,
    Counter,
}

@Story
object TabBarStory : ComposeBaseStory<TabBarUiState, TabBarStyle>(
    ComponentKey.TabBar,
    TabBarUiState(),
    TabBarUiStatePropertiesProducer,
    TabBarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabBarStyle,
        state: TabBarUiState,
    ) {
        var selectedItem by remember { mutableIntStateOf(0) }
        TabBar(style = style) {
            repeat(state.amount) { index ->
                tabItem {
                    val isSelected = index == selectedItem
                    TabBarItem(
                        isSelected = isSelected,
                        icon = { TabIcon(index, isSelected) },
                        labelContent = { Text(getTitle(index)) },
                        extra = if (index == (state.amount - 1)) {
                            getExtra(state.extraType, state.counter)
                        } else {
                            null
                        },
                        onClick = { selectedItem = index },
                    )
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: TabBarStyle,
        key: ComponentKey,
    ) {
        TabBar(style = style) {
            repeat(3) { index ->
                tabItem {
                    val isSelected = index == 0
                    TabBarItem(
                        isSelected = isSelected,
                        icon = { TabIcon(index, isSelected) },
                        labelContent = { Text(getTitle(index)) },
                        extra = if (index == 1) {
                            { Counter(count = "3") }
                        } else {
                            null
                        },
                        onClick = { },
                    )
                }
            }
        }
    }
}

private fun getTitle(index: Int): String {
    return when (index) {
        0 -> "Почта"
        1 -> "Календарь"
        2 -> "Встречи"
        3 -> "Чаты"
        else -> "Label"
    }
}

private fun getIcon(index: Int): Int {
    return when (index) {
        0 -> R.drawable.ic_mail_outline_24
        1 -> R.drawable.ic_calendar_outline_24
        2 -> R.drawable.ic_call_outline_24
        3 -> R.drawable.ic_chat_outline_24
        else -> R.drawable.ic_settings_outline_24
    }
}

private fun getIconSelected(index: Int): Int {
    return when (index) {
        0 -> R.drawable.ic_mail_fill_24
        1 -> R.drawable.ic_calendar_fill_24
        2 -> R.drawable.ic_call_fill_24
        3 -> R.drawable.ic_chat_fill_24
        else -> R.drawable.ic_settings_fill_24
    }
}

@Composable
private fun TabIcon(index: Int, isSelected: Boolean) {
    AnimatedContent(
        targetState = isSelected,
        transitionSpec = {
            fadeIn(tween(200))
                .togetherWith(fadeOut(tween(200)))
        },
    ) {
        val iconSource = resourceImageSource(
            if (it) {
                getIconSelected(index)
            } else {
                getIcon(index)
            },
        )
        Icon(source = iconSource, contentDescription = "")
    }
}

private fun getExtra(extraType: TabBarExtraType, counter: String): (@Composable () -> Unit)? {
    return when (extraType) {
        TabBarExtraType.None -> null
        TabBarExtraType.Counter -> {
            { Counter(count = counter) }
        }
    }
}

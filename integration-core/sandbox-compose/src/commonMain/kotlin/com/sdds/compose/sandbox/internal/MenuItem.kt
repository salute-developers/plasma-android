package com.sdds.compose.sandbox.internal

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.StoryRegistry
import com.sdds.sandbox.UiState

internal class MenuItem(
    val title: String,
    val componentKey: ComponentKey,
    val destination: ComponentScreen,
) {
    val route: String = componentKey.value
}

internal fun ComponentProvider.getMenuItems(): List<MenuItem> {
    return components.mapNotNull { (key, value) ->
        val screen = key.screen().takeIf { it !== EmptyScreen } ?: return@mapNotNull null
        MenuItem(value.name, key, screen)
    }.sortedWith(
        compareBy(
            { it.componentKey.group.ordinal },
            { it.title },
        ),
    )
}

private val EmptyScreen = ComponentScreen({})

internal class ComponentScreen(
    val composeScreen: @Composable (ComponentKey) -> Unit,
    val preview: (@Composable (Style, ComponentKey) -> Unit)? = null,
)

@Suppress("CyclomaticComplexMethod", "LongMethod")
private fun ComponentKey.screen(): ComponentScreen {
    val story = StoryRegistry.get(this) as? ComposeBaseStory<UiState, Style> ?: return EmptyScreen
    return ComponentScreen(
        composeScreen = { story.Story() },
        preview = { style, key -> story.Preview(style, key) },
    )
}

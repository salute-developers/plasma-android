package com.sdds.playground.sandbox.core.compose

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.composeTheme
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.compose.bottomsheet.BottomSheetScaffold
import com.sdds.playground.sandbox.core.compose.bottomsheet.BottomSheetValue
import com.sdds.playground.sandbox.core.compose.bottomsheet.rememberBottomSheetState
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun <State : UiState, S : Style> ComponentScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    componentAlignment: (State) -> Alignment = { Alignment.Center },
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    if (LocalContext.current.isTvDevice()) {
        TvScaffold(
            key = key,
            viewModel = viewModel,
            themeManager = themeManager,
            componentAlignment = componentAlignment,
            component = component,
        )
    } else {
        MobileScaffold(
            key = key,
            viewModel = viewModel,
            themeManager = themeManager,
            componentAlignment = componentAlignment,
            component = component,
        )
    }
}

@Composable
private fun <State : UiState, S : Style> MobileScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    componentAlignment: (State) -> Alignment = { Alignment.Center },
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    val sheetState = rememberBottomSheetState(initialValue = BottomSheetValue.Collapsed)
    BottomSheetScaffold(
        bottomSheetState = sheetState,
        sheetPeekHeight = 74.dp,
        bottomSheetContent = {
            AnimatedMenuProperty(title = "${key.group.displayName},${key.value}", viewModel = viewModel)
        },
    ) { sheetHeight ->
        var top by remember { mutableFloatStateOf(0f) }
        val uiState by viewModel.uiState.collectAsState()
        val density = LocalDensity.current
        val statusBarHeight = WindowInsets.statusBars.getTop(density).toFloat()
        Box(
            modifier = Modifier
                .align(componentAlignment(uiState))
                .onGloballyPositioned { layoutCoordinates ->
                    val pos = layoutCoordinates.positionInRoot()
                    top = pos.y
                }
                .graphicsLayer {
                    val offset =
                        (sheetState.progressFromCollapsedToExpanded * sheetHeight).coerceAtMost(top - statusBarHeight)
                    translationY = -offset
                },
            contentAlignment = Alignment.Center,
        ) {
            val currentTheme by themeManager.currentTheme.collectAsState()
            val themeInfo = composeTheme(currentTheme)
            themeInfo.themeWrapper {
                runCatching {
                    component(
                        uiState,
                        themeInfo.components.get<String, S>(key)
                            .styleProviders[uiState.appearance]!!.style(uiState.variant),
                    )
                }
            }
        }
    }
}

@Composable
private fun <State : UiState, S : Style> TvScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    componentAlignment: (State) -> Alignment = { Alignment.Center },
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(240.dp),
        ) {
            AnimatedMenuProperty(title = "${key.group.displayName},${key.value}", viewModel = viewModel)
        }
        val uiState by viewModel.uiState.collectAsState()
        Box(
            modifier = Modifier
                .weight(1f, fill = true)
                .fillMaxHeight(),
            contentAlignment = componentAlignment(uiState),
        ) {
            val currentTheme by themeManager.currentTheme.collectAsState()
            val themeInfo = composeTheme(currentTheme)
            themeInfo.themeWrapper {
                val styleProvider = themeInfo.components.get<String, S>(key)
                    .styleProviders[uiState.appearance]
                if (styleProvider != null) {
                    component(
                        uiState,
                        styleProvider.style(uiState.variant),
                    )
                }
            }
        }
    }
}

@Composable
private fun <State : UiState, S : Style> AnimatedMenuProperty(
    title: String,
    viewModel: ComponentViewModel<State, S>,
) {
    val contentState = remember { mutableStateOf<MenuPropertyContent>(MenuPropertyContent.PropertiesList) }
    val properties by viewModel.properties.collectAsState()
    BackHandler(enabled = contentState.value is MenuPropertyContent.PropertyEditor) {
        contentState.value = MenuPropertyContent.PropertiesList
    }
    AnimatedContent(
        targetState = contentState.value,
        transitionSpec = {
            if (targetState is MenuPropertyContent.PropertiesList) {
                slideInHorizontally { -it } + fadeIn() togetherWith
                    slideOutHorizontally { it } + fadeOut()
            } else {
                slideInHorizontally { it } + fadeIn() togetherWith
                    slideOutHorizontally { -it } + fadeOut()
            }.using(SizeTransform(clip = false))
        },
    ) { content ->
        when (content) {
            MenuPropertyContent.PropertiesList -> {
                PropertiesList(
                    modifier = Modifier.fillMaxHeight(),
                    headerTitle = title,
                    properties = properties,
                    onSelect = {
                        contentState.value = MenuPropertyContent.PropertyEditor(it)
                    },
                    onReset = { viewModel.resetToDefault() },
                )
            }

            is MenuPropertyContent.PropertyEditor -> {
                PropertyEditor(
                    modifier = Modifier.fillMaxHeight(),
                    headerTitle = title,
                    property = content.property,
                    onConfirm = {},
                )
            }
        }
    }
}

private sealed class MenuPropertyContent {
    object PropertiesList : MenuPropertyContent()
    data class PropertyEditor(val property: Property<*>) : MenuPropertyContent()
}

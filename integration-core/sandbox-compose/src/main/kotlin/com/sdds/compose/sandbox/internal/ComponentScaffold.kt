package com.sdds.compose.sandbox.internal

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.currentComposeThemeAsState
import com.sdds.compose.sandbox.getStyleProvider
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.ThemeManager
import com.sdds.sandbox.UiState

@Composable
internal fun <State : UiState, S : Style> ComponentScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    componentAlignment: (State) -> Alignment = { Alignment.Center },
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    if (isLargeDevice()) {
        LargeScaffold(
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
            AnimatedMenuProperty(
                title = "${key.group.displayName},${key.value}",
                viewModel = viewModel,
                isLargeScreen = false,
            )
        },
    ) { sheetHeight ->
        var top by remember { mutableFloatStateOf(0f) }
        val uiState by viewModel.uiState.collectAsState()
        val density = LocalDensity.current
        val statusBarHeight = WindowInsets.statusBars.getTop(density).toFloat()
        val currentSubTheme by viewModel.subtheme.collectAsState()
        val sandboxStyle = LocalSandboxStyle.current
        val componentBackground by remember {
            derivedStateOf {
                val stateSet = currentSubTheme?.let { setOf(it) } ?: emptySet()
                sandboxStyle.componentBackgroundColor.getValue(stateSet)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(componentBackground, shape = sandboxStyle.componentBackgroundShape)
                .padding(16.dp)
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
            StyledComponent(
                key = key,
                uiState = uiState,
                themeManager = themeManager,
                currentSubTheme = currentSubTheme,
                component = component,
            )
        }
    }
}

@Composable
private fun <State : UiState, S : Style> LargeScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    componentAlignment: (State) -> Alignment = { Alignment.Center },
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    Row(modifier = Modifier.fillMaxSize()) {
        val uiState by viewModel.uiState.collectAsState()
        val currentSubTheme by viewModel.subtheme.collectAsState()
        val sandboxStyle = LocalSandboxStyle.current
        val componentBackground by remember {
            derivedStateOf {
                val stateSet = currentSubTheme?.let { setOf(it) } ?: emptySet()
                sandboxStyle.componentBackgroundColor.getValue(stateSet)
            }
        }

        AnimatedMenuProperty(
            modifier = Modifier
                .fillMaxHeight()
                .width(240.dp),
            title = "${key.group.displayName},${key.value}",
            viewModel = viewModel,
            isLargeScreen = true,
        )

        Box(
            modifier = Modifier
                .weight(1f, fill = true)
                .fillMaxHeight()
                .background(componentBackground),
            contentAlignment = componentAlignment(uiState),
        ) {
            StyledComponent(
                key = key,
                uiState = uiState,
                themeManager = themeManager,
                currentSubTheme = currentSubTheme,
                component = component,
            )
        }
    }
}

@Composable
private fun <State : UiState, S : Style> BoxScope.StyledComponent(
    key: ComponentKey,
    uiState: State,
    themeManager: ThemeManager,
    currentSubTheme: SubTheme?,
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    val currentTheme by themeManager.currentComposeThemeAsState
    currentTheme.themeWrapper {
        val styleProvider = currentTheme.getStyleProvider<S>(key, uiState.appearance)
        val style = styleProvider?.style(uiState.variant)
        if (style != null) {
            SubTheme(currentTheme, currentSubTheme) {
                component(
                    uiState,
                    style,
                )
            }
        }
    }
}

@Composable
private fun SubTheme(
    currentTheme: ComposeTheme,
    subThemeType: SubTheme?,
    content: @Composable () -> Unit,
) {
    val wrapper = currentTheme.subthemes[subThemeType]
    if (wrapper != null) {
        wrapper(content)
    } else {
        content()
    }
}

@Composable
private fun <State : UiState, S : Style> AnimatedMenuProperty(
    title: String,
    viewModel: ComponentViewModel<State, S>,
    isLargeScreen: Boolean,
    modifier: Modifier = Modifier,
) {
    val contentState = remember { mutableStateOf<MenuPropertyContent>(MenuPropertyContent.PropertiesList) }
    val properties by viewModel.properties.collectAsState()
    BackHandler(enabled = contentState.value is MenuPropertyContent.PropertyEditor) {
        contentState.value = MenuPropertyContent.PropertiesList
    }
    AnimatedContent(
        modifier = modifier,
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
        val insetsModifier = if (isLargeScreen) Modifier.systemBarsPadding() else Modifier.navigationBarsPadding()
        when (content) {
            MenuPropertyContent.PropertiesList -> {
                PropertiesList(
                    modifier = Modifier.fillMaxHeight()
                        .then(insetsModifier),
                    headerTitle = title,
                    properties = properties,
                    onSelect = { property ->
                        if (property is Property.BooleanProperty) {
                            val newValue = !property.value
                            viewModel.updateProperty(property.name, newValue)
                        } else {
                            contentState.value = MenuPropertyContent.PropertyEditor(property)
                        }
                    },
                    onReset = { viewModel.resetToDefault() },
                )
            }

            is MenuPropertyContent.PropertyEditor -> {
                PropertyEditor(
                    modifier = Modifier.fillMaxHeight()
                        .then(insetsModifier),
                    headerTitle = title,
                    property = content.property,
                    onConfirm = { name, value ->
                        viewModel.updateProperty(name, value)
                    },
                )
            }
        }
    }
}

private sealed class MenuPropertyContent {
    object PropertiesList : MenuPropertyContent()
    data class PropertyEditor(val property: Property<*>) : MenuPropertyContent()
}

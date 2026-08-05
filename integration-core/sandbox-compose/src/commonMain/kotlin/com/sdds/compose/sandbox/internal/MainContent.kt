package com.sdds.compose.sandbox.internal

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.currentComposeThemeAsState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.WindowSizeClass
import com.sdds.compose.uikit.widthBreakPoint
import com.sdds.icons.compose.DisclosureDownOutline16
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ThemeManager
import kotlinx.coroutines.launch

@Suppress("LongMethod")
@Composable
internal fun MainContent(
    navigationIntegration: @Composable (NavHostController) -> Unit,
    themeManager: ThemeManager = ThemeManager,
) {
    val currentTheme by themeManager.currentComposeThemeAsState
    val layout = resolveSandboxLayout(isLargeDevice())
    val menuItems = remember(currentTheme) { currentTheme.components.getMenuItems() }
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val backDispatcher = remember { SandboxBackDispatcher() }
    navigationIntegration(navController)
    val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsState(initial = null)
    val isStartDestination = currentBackStackEntry?.destination?.route == START_DESTINATION
    val isComponentStory = currentBackStackEntry?.destination?.route
        ?.let { it != START_DESTINATION }
        ?: false
    val navigationContent: @Composable () -> Unit = {
        NavigationGraph(
            navController = navController,
            menuItems = menuItems,
            themeInfo = currentTheme,
            useSlideTransitions = layout.usesSlideTransitions(),
            showFirstStoryAtStart = layout.showsFirstStoryAtStart(),
        )
    }

    CompositionLocalProvider(
        LocalSandboxLayout provides layout,
        LocalSandboxBackDispatcher provides backDispatcher,
    ) {
        when (layout) {
            SandboxLayout.Large -> LargeLayout(
                navigationMode = platformLargeNavigationMode,
                menuItems = {
                    NavigationViewLarge(
                        items = menuItems,
                        title = currentTheme.displayName,
                        selectedRoute = currentBackStackEntry?.destination?.route,
                        onSelect = {
                            scope.launch { navController.navigateTo(it) }
                        },
                    )
                },
                content = {
                    navigationContent()
                },
            )

            SandboxLayout.Mobile -> MobileLayout(
                hasMultipleThemes = false,
                showTopBar = isStartDestination,
                topBar = {
                    TopBar(
                        title = "Theme",
                        onNavigationClick = { },
                    )
                },
                showBackButton = layout.showsMobileBackButton(isComponentStory),
                onBack = {
                    backDispatcher.handleBack(navController::navigateBackToComponentList)
                },
                content = navigationContent,
            )
        }
    }
}

@Composable
internal fun NavigationGraph(
    navController: NavHostController,
    menuItems: List<MenuItem>,
    themeInfo: ComposeTheme,
    useSlideTransitions: Boolean,
    showFirstStoryAtStart: Boolean,
) {
    val transitions = remember(useSlideTransitions) {
        NavigationTransition(
            enter = if (useSlideTransitions) {
                slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(300))
            } else {
                EnterTransition.None
            },
            exit = if (useSlideTransitions) {
                slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(300))
            } else {
                ExitTransition.None
            },
            popEnter = if (useSlideTransitions) {
                slideInHorizontally(initialOffsetX = { -it }, animationSpec = tween(300))
            } else {
                EnterTransition.None
            },
            popExit = if (useSlideTransitions) {
                slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(300))
            } else {
                ExitTransition.None
            },
        )
    }

    NavHost(
        navController = navController,
        startDestination = START_DESTINATION,
        enterTransition = { transitions.enter },
        exitTransition = { transitions.exit },
        popEnterTransition = { transitions.popEnter },
        popExitTransition = { transitions.popExit },
    ) {
        menuItems.forEach { item ->
            composable(item.route) {
                item.destination.composeScreen(item.componentKey)
            }
        }
        composable(START_DESTINATION) {
            if (showFirstStoryAtStart) {
                menuItems.first().let { it.destination.composeScreen(it.componentKey) }
            } else {
                NavigationViewMobile(
                    items = menuItems,
                    themeInfo = themeInfo,
                ) {
                    navController.navigate(it.route)
                }
            }
        }
    }
}

private suspend fun NavHostController.navigateTo(item: MenuItem) {
    navigate(item.route) {
        popUpTo(START_DESTINATION) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

private fun NavHostController.navigateBackToComponentList() {
    if (!popBackStack()) {
        navigate(START_DESTINATION) {
            launchSingleTop = true
        }
    }
}

@Composable
internal fun TopBar(
    title: String,
    onNavigationClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .focusable()
                .indication(interactionSource, null)
                .clickable { onNavigationClick() },
        ) {
            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 8.dp),
            )
            Icon(
                imageVector = SddsIcons.DisclosureDownOutline16,
                contentDescription = null,
            )
        }
    }
}

private data class NavigationTransition(
    val enter: EnterTransition,
    val exit: ExitTransition,
    val popEnter: EnterTransition,
    val popExit: ExitTransition,
)

@Composable
internal fun isLargeDevice(): Boolean {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current
    return with(density) {
        windowInfo.containerSize.width.toDp() >= WindowSizeClass.Expanded.widthBreakPoint()
    }
}

internal fun resolveSandboxLayout(isLargeDevice: Boolean): SandboxLayout =
    if (isLargeDevice) SandboxLayout.Large else SandboxLayout.Mobile

internal enum class SandboxLayout {
    Mobile,
    Large,
}

internal val LocalSandboxLayout = compositionLocalOf { SandboxLayout.Mobile }

internal fun SandboxLayout.usesSlideTransitions(): Boolean = this == SandboxLayout.Mobile

internal fun SandboxLayout.showsFirstStoryAtStart(): Boolean = this == SandboxLayout.Large

internal fun SandboxLayout.showsMobileBackButton(isComponentStory: Boolean): Boolean =
    this == SandboxLayout.Mobile && isComponentStory

private const val START_DESTINATION = "menuItems"

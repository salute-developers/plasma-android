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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
import com.sdds.compose.uikit.collectWindowSizeInfoAsState
import com.sdds.icons.R
import com.sdds.sandbox.ThemeManager
import kotlinx.coroutines.launch

@Suppress("LongMethod")
@Composable
internal fun MainContent(themeManager: ThemeManager = ThemeManager) {
    val currentTheme by themeManager.currentComposeThemeAsState
    val isLarge = isLargeDevice()
    val menuItems = remember(currentTheme) { currentTheme.components.getMenuItems() }
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsState(initial = null)
    val showTopBar = currentBackStackEntry?.destination?.route == START_DESTINATION
    val navigationContent: @Composable () -> Unit = {
        NavigationGraph(
            navController = navController,
            menuItems = menuItems,
            themeInfo = currentTheme,
            isTv = isLarge,
        )
    }

    if (isLarge) {
        TvLayout(
            menuItems = {
                NavigationViewTv(
                    items = menuItems,
                    title = currentTheme.displayName,
                    focusable = true,
                    onSelect = {
                        scope.launch {
                            navController.navigate(it.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                )
            },
        ) {
            navigationContent()
        }
    } else {
        MobileLayout(
            hasMultipleThemes = false,
            showTopBar = showTopBar,
            topBar = {
                TopBar(
                    title = "Theme",
                    onNavigationClick = { },
                )
            },
        ) {
            navigationContent()
        }
    }
}

@Composable
internal fun NavigationGraph(
    navController: NavHostController,
    menuItems: List<MenuItem>,
    themeInfo: ComposeTheme,
    isTv: Boolean,
) {
    val transitions = remember(isTv) {
        NavigationTransition(
            enter = if (isTv) {
                EnterTransition.None
            } else {
                slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(300))
            },
            exit = if (isTv) {
                ExitTransition.None
            } else {
                slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(300))
            },
            popEnter = if (isTv) {
                EnterTransition.None
            } else {
                slideInHorizontally(initialOffsetX = { -it }, animationSpec = tween(300))
            },
            popExit = if (isTv) {
                ExitTransition.None
            } else {
                slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(300))
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
            if (isTv) {
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
                painter = painterResource(R.drawable.ic_disclosure_down_outline_16),
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
    val sizeInfo by collectWindowSizeInfoAsState()
    return sizeInfo.widthClass == WindowSizeClass.Expanded
}

private const val START_DESTINATION = "menuItems"

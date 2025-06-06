package com.sdds.playground.sandbox.core.compose

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.ThemeInfoCompose
import com.sdds.playground.sandbox.composeTheme
import com.sdds.playground.sandbox.core.ThemeManager
import kotlinx.coroutines.launch

@Suppress("LongMethod")
@Composable
internal fun MainContent(themeManager: ThemeManager = ThemeManager) {
    val currentTheme by themeManager.currentTheme.collectAsState()
    val themeInfo = composeTheme(currentTheme)
    val menuItems = remember(currentTheme) { themeInfo.components.getMenuItems() }
    val hasMultipleThemes = remember { Theme.values().size > 1 }
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsState(initial = null)
    val themePickerState = remember { mutableStateOf(false) }
    val selectedRoute = rememberSaveable { mutableStateOf<String?>(null) }
    val savedRoute = rememberSaveable { mutableStateOf(menuItems.first().route) }
    val isTv = LocalContext.current.isTvDevice()
    val showTopBar = currentBackStackEntry?.destination?.route == "menuItems"
    LaunchedEffect(currentTheme) { selectedRoute.value = null }

    if (isTv) {
        TvLayout(
            menuItems = { onFocusChanged ->
                NavigationViewTv(
                    items = menuItems,
                    title = themeInfo.theme.name,
                    focusable = true,
                    onFocusChanged = onFocusChanged,
                    onSelect = {
                        scope.launch {
                            navController.navigate(it.route) {
                                currentBackStackEntry?.destination?.route?.let { prevRoute ->
                                    popUpTo(prevRoute) { inclusive = true }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                            savedRoute.value = it.route
                        }
                    },
                )
            },
        ) {
            NavigationGraph(navController, menuItems, savedRoute.value, null, true)
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .background(Color.Transparent),
        ) {
            if (hasMultipleThemes && showTopBar) {
                TopBarSection(
                    currentTheme = currentTheme,
                    onThemeSelected = { themeManager.updateTheme(it) },
                    onNavigationClick = { themePickerState.value = !themePickerState.value },
                    isThemePickerExpanded = themePickerState.value,
                    onDismissRequest = { themePickerState.value = false },
                )
            }
            NavigationGraph(navController, menuItems, null, themeInfo, false)
        }
    }
}

@Composable
internal fun NavigationGraph(
    navController: NavHostController,
    menuItems: List<MenuItem>,
    startDestination: String? = null,
    themeInfo: ThemeInfoCompose? = null,
    isTv: Boolean,
) {
    val enterTransition = if (isTv) {
        EnterTransition.None
    } else {
        slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(300))
    }
    val exitTransition = if (isTv) {
        ExitTransition.None
    } else {
        slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(300))
    }
    val popEnterTransition = if (isTv) {
        EnterTransition.None
    } else {
        slideInHorizontally(initialOffsetX = { -it }, animationSpec = tween(300))
    }
    val popExitTransition = if (isTv) {
        ExitTransition.None
    } else {
        slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(300))
    }
    NavHost(
        navController = navController,
        startDestination = startDestination ?: "menuItems",
        enterTransition = { enterTransition },
        exitTransition = { exitTransition },
        popEnterTransition = { popEnterTransition },
        popExitTransition = { popExitTransition },
    ) {
        menuItems.forEach { item ->
            composable(item.route) {
                item.destination.composeScreen(item.componentKey)
            }
        }
        themeInfo?.let {
            composable("menuItems") {
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

private fun toMainActivity(context: Context) {
    val intent = Intent(context, MainSandboxActivity::class.java)
        .apply { flags = Intent.FLAG_ACTIVITY_CLEAR_TOP }
    context.startActivity(intent)
}

internal fun Context.isTvDevice(): Boolean {
    return packageManager.hasSystemFeature(PackageManager.FEATURE_LEANBACK)
}

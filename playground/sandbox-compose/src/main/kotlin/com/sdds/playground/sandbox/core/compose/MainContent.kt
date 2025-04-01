package com.sdds.playground.sandbox.core.compose

import android.content.Context
import android.content.Intent
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.icons.R
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.composeTheme
import com.sdds.playground.sandbox.core.ThemeManager
import kotlinx.coroutines.launch

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Suppress("LongMethod")
@Composable
internal fun MainContent(themeManager: ThemeManager = ThemeManager) {
    val sandboxStyle = LocalSandboxStyle.current
    val currentTheme by themeManager.currentTheme.collectAsState()
    val themeInfo = composeTheme(currentTheme)
    val menuItems = remember(currentTheme) { themeInfo.components.getMenuItems() }
    val hasMultipleThemes = remember { Theme.values().size > 1 }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scaffoldState = rememberScaffoldState(drawerState = drawerState)
    val scope = rememberCoroutineScope()
    val themePickerSheetState = rememberModalBottomSheetState(BottomSheetValue.Hidden)
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsState(initial = null)
    val currentTitle =
        menuItems.find { it.route == currentBackStackEntry?.destination?.route }?.title.orEmpty()
    val savedRoute = rememberSaveable { mutableStateOf(menuItems.first().route) }
    LaunchedEffect(menuItems) {
        val existingRoute = savedRoute.value.takeIf { route -> menuItems.any { it.route == route } }
            ?: menuItems.first().route
        savedRoute.value = existingRoute

        if (navController.currentDestination?.route != existingRoute) {
            navController.navigate(existingRoute) {
                popUpTo(navController.graph.startDestinationId) {
                    inclusive = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }
    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = Color.Transparent,
        drawerBackgroundColor = sandboxStyle.drawerBackgroundColor,
        drawerElevation = 0.dp,
        drawerShape = CustomNavShape,
        drawerGesturesEnabled = true,
        drawerContent = {
            NavigationView(
                modifier = Modifier.fillMaxWidth(),
                items = menuItems,
                focusable = drawerState.isOpen,
                onSelect = {
                    scope.launch {
                        drawerState.close()
                        navController.navigate(it.route) {
                            currentBackStackEntry?.destination?.route?.let { prevRoute ->
                                popUpTo(prevRoute) {
                                    inclusive = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        savedRoute.value = it.route
                    }
                },
            )
        },
        topBar = {
            val context = LocalContext.current
            TopBarSection(
                title = currentTitle,
                onNavigationClick = { scope.launch { drawerState.open() } },
                onMainClick = { toMainActivity(context) },
                onThemeClick = { scope.launch { themePickerSheetState.show() } },
                hasMultipleThemes = hasMultipleThemes,
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
        ) {
            NavigationGraph(navController, menuItems)
            if (hasMultipleThemes) {
                ModalBottomSheet(
                    style = LocalModalBottomSheetStyle.current,
                    fitContent = true,
                    body = {
                        ThemePicker(
                            currentTheme,
                            onApply = { themeManager.updateTheme(it) },
                            onConfirm = {
                                scope.launch {
                                    themePickerSheetState.hide()
                                }
                            },
                        )
                    },
                    sheetState = themePickerSheetState,
                )
            }
        }
    }
}

@Composable
internal fun NavigationGraph(navController: NavHostController, menuItems: List<MenuItem>) {
    NavHost(
        navController = navController,
        startDestination = menuItems.first().route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
    ) {
        menuItems.forEach { item ->
            composable(item.route) {
                item.destination.composeScreen(item.componentKey)
            }
        }
    }
}

@Composable
private fun TopBarSection(
    title: String,
    onNavigationClick: () -> Unit,
    onMainClick: () -> Unit,
    onThemeClick: () -> Unit,
    hasMultipleThemes: Boolean,
) {
    TopBar(
        title = title,
        onNavigationClick = onNavigationClick,
        actions = {
            IconButton(
                onClick = onMainClick,
                icon = painterResource(id = R.drawable.ic_backward_fill_24),
                modifier = Modifier.padding(horizontal = 10.dp),
            )
            if (hasMultipleThemes) {
                IconButton(
                    icon = painterResource(id = R.drawable.ic_settings_fill_24),
                    onClick = onThemeClick,
                )
            }
        },
    )
}

private fun toMainActivity(context: Context) {
    val intent = Intent(context, MainSandboxActivity::class.java)
        .apply { flags = Intent.FLAG_ACTIVITY_CLEAR_TOP }
    context.startActivity(intent)
}

private val CustomNavWidth = 200.dp
private val CustomNavShape = NavShape(CustomNavWidth, 0f)

private class NavShape(
    private val widthOffset: Dp,
    private val scale: Float,
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        return Outline.Rectangle(
            Rect(
                Offset.Zero,
                Offset(
                    size.width * scale + with(density) { widthOffset.toPx() },
                    size.height,
                ),
            ),
        )
    }
}

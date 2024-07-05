package com.sdds.playground.sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.Divider
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.playground.sandbox.buttons.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.DefaultButtonSettingsProvider
import com.sdds.playground.sandbox.buttons.IconButtonsScreen
import com.sdds.playground.sandbox.core.components.SandboxText
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme
import kotlinx.coroutines.launch
import com.sdds.icons.R.drawable as Icons

class SandboxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            SandboxTheme {
                SandboxContainer()
            }
        }
    }
}

private sealed class MenuItem(val title: String, val screen: @Composable () -> Unit) {
    object BasicButtons : MenuItem("BasicButton", { BasicButtonScreen() })
    object IconButtons : MenuItem("IconButton", { IconButtonsScreen() })
}

@Composable
private fun SandboxContainer() {
    val menuItems = remember {
        listOf(
            MenuItem.BasicButtons,
            MenuItem.IconButtons,
        )
    }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scaffoldState = rememberScaffoldState(drawerState = drawerState)
    val scope = rememberCoroutineScope()
    var currentItem by remember { mutableStateOf(menuItems.first()) }
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.systemBarsPadding(),
        drawerBackgroundColor = DefaultTheme.colors.surfaceDefaultSolidSecondary,
        drawerContent = {
            menuItems.forEachIndexed { index, menuItem ->
                NavigationItem(menuItem) {
                    scope.launch {
                        currentItem = menuItem
                        drawerState.close()
                    }
                }
                if (index < menuItems.size - 1) {
                    Divider(startIndent = 16.dp)
                }
            }
        },
        topBar = {
            TopBar(
                title = currentItem.title,
                onNavigationClick = {
                    scope.launch { drawerState.open() }
                },
            )
        },
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .background(DefaultTheme.colors.backgroundDefaultPrimary)
                .fillMaxSize(),
        ) {
            currentItem.screen()
        }
    }
}

@Composable
private fun ColumnScope.NavigationItem(
    menuItem: MenuItem,
    onClick: () -> Unit,
) {
    SandboxText(
        text = menuItem.title,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                enabled = true,
                interactionSource = remember { MutableInteractionSource() },
                role = Role.Button,
                indication = rememberRipple(),
                onClick = onClick,
            )
            .padding(16.dp),
        style = DefaultTheme.typography.bodyMBold,
        color = DefaultTheme.colors.textDefaultPrimary,

        )
}

@Composable
private fun TopBar(
    title: String,
    onNavigationClick: () -> Unit,
) {
    TopAppBar(
        title = {
            SandboxText(
                text = title,
                style = DefaultTheme.typography.bodyMBold,
            )
        },
        elevation = 1.dp,
        navigationIcon = {
            IconButton(
                icon = painterResource(id = Icons.ic_menu_24),
                style = Button.Style.Clear,
                shape = Button.IconButtonShape.Circle,
                onClick = onNavigationClick,
                settingsProvider = DefaultButtonSettingsProvider
            )
        },
        backgroundColor = DefaultTheme.colors.surfaceDefaultSolidPrimary,
        contentColor = DefaultTheme.colors.textDefaultPrimary,
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    SandboxTheme {
        SandboxContainer()
    }
}

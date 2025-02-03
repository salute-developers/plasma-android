package com.sdds.playground.sandbox.activities.compose

import android.content.Intent
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
import androidx.compose.foundation.layout.statusBarsPadding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.avatar.compose.AvatarGroupScreen
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.buttons.compose.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.compose.IconButtonScreen
import com.sdds.playground.sandbox.buttons.compose.LinkButtonScreen
import com.sdds.playground.sandbox.checkbox.compose.CheckBoxScreen
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupScreen
import com.sdds.playground.sandbox.chip.compose.ChipScreen
import com.sdds.playground.sandbox.chip.compose.group.ChipGroupScreen
import com.sdds.playground.sandbox.progress.compose.ProgressScreen
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxScreen
import com.sdds.playground.sandbox.radiobox.compose.group.RadioBoxGroupScreen
import com.sdds.playground.sandbox.shadows.compose.ShadowsScreen
import com.sdds.playground.sandbox.switcher.compose.SwitchScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldScreen
import com.sdds.serv.styles.button.icon.Clear
import com.sdds.serv.styles.button.icon.M
import com.sdds.serv.styles.button.icon.Pilled
import com.sdds.serv.styles.button.link.Default
import com.sdds.serv.styles.button.link.M
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.launch
import com.sdds.icons.R.drawable as Icons

/**
 * Активити демо-приложения на compose
 */
class SandboxActivityCompose : ComponentActivity() {
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
    object Shadows : MenuItem("Shadows", { ShadowsScreen() })
    object Avatar : MenuItem("Avatar", { AvatarScreen() })
    object AvatarGroup : MenuItem("AvatarGroup", { AvatarGroupScreen() })
    object Buttons : MenuItem("BasicButton", { BasicButtonScreen() })
    object IconButtons : MenuItem("IconButton", { IconButtonScreen() })
    object LinkButtons : MenuItem("LinkButton", { LinkButtonScreen() })
    object CheckBox : MenuItem("CheckBox", { CheckBoxScreen() })
    object CheckBoxGroup : MenuItem("CheckBoxGroup", { CheckBoxGroupScreen() })
    object RadioBox : MenuItem("RadioBox", { RadioBoxScreen() })
    object RadioBoxGroup : MenuItem("RadioBoxGroup", { RadioBoxGroupScreen() })
    object Switch : MenuItem("Switch", { SwitchScreen() })
    object Progress : MenuItem("Progress", { ProgressScreen() })
    object TextField : MenuItem("TextField", { TextFieldScreen() })
    object Chip : MenuItem("Chip", { ChipScreen() })
    object ChipGroup : MenuItem("ChipGroup", { ChipGroupScreen() })
}

private val menuItems = listOf(
    MenuItem.Shadows,
    MenuItem.Avatar,
    MenuItem.AvatarGroup,
    MenuItem.Buttons,
    MenuItem.IconButtons,
    MenuItem.LinkButtons,
    MenuItem.CheckBox,
    MenuItem.CheckBoxGroup,
    MenuItem.RadioBox,
    MenuItem.RadioBoxGroup,
    MenuItem.Switch,
    MenuItem.Progress,
    MenuItem.TextField,
    MenuItem.Chip,
    MenuItem.ChipGroup,
)

@Composable
private fun SandboxContainer() {
    val menuItems = remember { menuItems }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scaffoldState = rememberScaffoldState(drawerState = drawerState)
    val scope = rememberCoroutineScope()
    var currentItem by remember { mutableStateOf(menuItems.first()) }
    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = Color.Transparent,
        drawerBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
        drawerContent = {
            Column(
                modifier = Modifier.statusBarsPadding(),
            ) {
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
            }
        },
        topBar = {
            val context = LocalContext.current
            TopBar(
                title = currentItem.title,
                onNavigationClick = {
                    scope.launch { drawerState.open() }
                },
                onMainClick = {
                    val intent = Intent(context, MainSandboxActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    }
                    context.startActivity(intent)
                },
            )
        },
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .background(SddsServTheme.colors.backgroundDefaultPrimary)
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
    Text(
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
        style = SddsServTheme.typography.bodyMBold.copy(color = SddsServTheme.colors.textDefaultPrimary),
    )
}

@Composable
private fun TopBar(
    title: String,
    onNavigationClick: () -> Unit,
    onMainClick: () -> Unit,
) {
    TopAppBar(
        modifier = Modifier.statusBarsPadding(),
        title = {
            Text(
                text = title,
                style = SddsServTheme.typography.bodyMBold
                    .copy(color = SddsServTheme.colors.textDefaultPrimary),
            )
        },
        elevation = 1.dp,
        navigationIcon = {
            IconButton(
                style = IconButton.M.Pilled.Clear.style(),
                icon = painterResource(id = Icons.ic_menu_24),
                onClick = onNavigationClick,
            )
        },
        backgroundColor = SddsServTheme.colors.surfaceDefaultSolidPrimary,
        contentColor = SddsServTheme.colors.textDefaultPrimary,
        actions = {
            Button(
                label = "To main screen",
                onClick = onMainClick,
                style = LinkButton.M.Default.style(),
                modifier = Modifier.padding(horizontal = 10.dp),
            )
        },
    )
}

/**
 * Превью [SandboxContainer]
 */
@Preview(showBackground = true)
@Composable
fun SandboxContainerPreview() {
    SandboxTheme {
        SandboxContainer()
    }
}

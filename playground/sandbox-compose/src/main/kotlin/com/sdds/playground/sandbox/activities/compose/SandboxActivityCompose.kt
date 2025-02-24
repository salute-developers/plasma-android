package com.sdds.playground.sandbox.activities.compose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.DrawerValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.avatar.compose.group.AvatarGroupScreen
import com.sdds.playground.sandbox.badge.compose.BadgeScreen
import com.sdds.playground.sandbox.badge.compose.IconBadgeScreen
import com.sdds.playground.sandbox.buttons.compose.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.compose.IconButtonScreen
import com.sdds.playground.sandbox.buttons.compose.LinkButtonScreen
import com.sdds.playground.sandbox.cell.compose.CellScreen
import com.sdds.playground.sandbox.checkbox.compose.CheckBoxScreen
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupScreen
import com.sdds.playground.sandbox.chip.compose.ChipScreen
import com.sdds.playground.sandbox.chip.compose.group.ChipGroupScreen
import com.sdds.playground.sandbox.core.compose.PropertyEditor
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.indicator.compose.IndicatorScreen
import com.sdds.playground.sandbox.progress.compose.ProgressScreen
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxScreen
import com.sdds.playground.sandbox.radiobox.compose.group.RadioBoxGroupScreen
import com.sdds.playground.sandbox.switcher.compose.SwitchScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldType
import com.sdds.serv.styles.button.icon.Clear
import com.sdds.serv.styles.button.icon.M
import com.sdds.serv.styles.button.icon.Pilled
import com.sdds.serv.styles.button.link.Default
import com.sdds.serv.styles.button.link.M
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
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

private sealed class MenuItem(
    val title: String,
    val screen: @Composable (theme: Theme.ThemeInfoCompose) -> Unit,
) {
    object Avatar : MenuItem("Avatar", { AvatarScreen(it) })
    object AvatarGroup : MenuItem("AvatarGroup", { AvatarGroupScreen(it) })
    object Buttons : MenuItem("BasicButton", { BasicButtonScreen(it) })
    object Badge : MenuItem("Badge", { BadgeScreen(it) })
    object IconBadge : MenuItem("IconBadge", { IconBadgeScreen(it) })
    object IconButtons : MenuItem("IconButton", { IconButtonScreen(it) })
    object LinkButtons : MenuItem("LinkButton", { LinkButtonScreen(it) })
    object Cell : MenuItem("Cell", { CellScreen(it) })
    object CheckBox : MenuItem("CheckBox", { CheckBoxScreen(it) })
    object CheckBoxGroup : MenuItem("CheckBoxGroup", { CheckBoxGroupScreen(it) })
    object RadioBox : MenuItem("RadioBox", { RadioBoxScreen(it) })
    object RadioBoxGroup : MenuItem("RadioBoxGroup", { RadioBoxGroupScreen(it) })
    object Switch : MenuItem("Switch", { SwitchScreen(it) })
    object Progress : MenuItem("Progress", { ProgressScreen(it) })
    object TextField : MenuItem("TextField", { TextFieldScreen(it, TextFieldType.TextField) })
    object TextFieldClear :
        MenuItem("TextFieldClear", { TextFieldScreen(it, TextFieldType.TextFieldClear) })

    object TextArea : MenuItem("TextArea", { TextFieldScreen(it, TextFieldType.TextArea) })
    object TextAreaClear :
        MenuItem("TextAreaClear", { TextFieldScreen(it, TextFieldType.TextAreaClear) })

    object Chip : MenuItem("Chip", { ChipScreen(it) })
    object ChipGroup : MenuItem("ChipGroup", { ChipGroupScreen(it) })
    object Indicator : MenuItem("Indicator", { IndicatorScreen(it) })
}

private val menuItems = listOf(
    MenuItem.Avatar,
    MenuItem.AvatarGroup,
    MenuItem.Buttons,
    MenuItem.Badge,
    MenuItem.IconBadge,
    MenuItem.Cell,
    MenuItem.IconButtons,
    MenuItem.LinkButtons,
    MenuItem.CheckBox,
    MenuItem.CheckBoxGroup,
    MenuItem.RadioBox,
    MenuItem.RadioBoxGroup,
    MenuItem.Switch,
    MenuItem.Progress,
    MenuItem.TextField,
    MenuItem.TextFieldClear,
    MenuItem.TextArea,
    MenuItem.TextAreaClear,
    MenuItem.Chip,
    MenuItem.ChipGroup,
    MenuItem.Indicator,
)

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun SandboxContainer() {
    val menuItems = remember { menuItems }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scaffoldState = rememberScaffoldState(drawerState = drawerState)
    val scope = rememberCoroutineScope()
    val themePickerSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    var currentItem by remember { mutableStateOf(menuItems.first()) }
    val currentTheme = remember { mutableStateOf(Theme.values().first()) }
    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = Color.Transparent,
        drawerBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
        drawerContent = {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .statusBarsPadding(),
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
                onNavigationClick = { scope.launch { drawerState.open() } },
                onMainClick = { toMainActivity(context) },
                onSettingsClick = { scope.launch { themePickerSheetState.show() } },
            )
        },
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .background(SddsServTheme.colors.backgroundDefaultPrimary)
                .fillMaxSize(),
        ) {
            ModalBottomSheetLayout(
                sheetContent = { ThemePickerContent(currentTheme, scope, themePickerSheetState) },
                sheetState = themePickerSheetState,
                sheetShape = SddsServTheme.shapes.roundS.copy(CornerSize(0.dp), CornerSize(0.dp)),
                sheetBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidCard,
            ) {
                currentItem.screen(currentTheme.value.compose)
            }
        }
    }
}

private fun toMainActivity(context: Context) {
    val intent = Intent(context, MainSandboxActivity::class.java)
        .apply { flags = Intent.FLAG_ACTIVITY_CLEAR_TOP }
    context.startActivity(intent)
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ColumnScope.ThemePickerContent(
    currentTheme: MutableState<Theme>,
    scope: CoroutineScope,
    themePickerSheetState: ModalBottomSheetState,
) {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        PropertyEditor(
            property = enumProperty(
                name = "Theme",
                value = currentTheme.value,
                onApply = { theme -> currentTheme.value = theme },
            ),
            onConfirm = {
                scope.launch {
                    delay(200)
                    themePickerSheetState.hide()
                }
            },
        )
        Spacer(
            modifier = Modifier
                .imePadding()
                .navigationBarsPadding(),
        )
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
    onSettingsClick: () -> Unit,
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
            IconButton(
                onClick = onMainClick,
                style = LinkButton.M.Default.style(),
                icon = painterResource(id = Icons.ic_backward_fill_24),
                modifier = Modifier.padding(horizontal = 10.dp),
            )
            IconButton(
                style = IconButton.M.Pilled.Clear.style(),
                icon = painterResource(id = Icons.ic_settings_fill_24),
                onClick = onSettingsClick,
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

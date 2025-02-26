package com.sdds.playground.sandbox.core.compose

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.Theme
import kotlinx.coroutines.launch

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@OptIn(ExperimentalMaterialApi::class)
@Suppress("LongMethod")
@Composable
internal fun MainContent() {
    val sandboxStyle = LocalSandboxStyle.current
    val menuItems = remember { MenuItem.all }
    val hasMultipleThemes = remember { Theme.values().size > 1 }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scaffoldState = rememberScaffoldState(drawerState = drawerState)
    val scope = rememberCoroutineScope()
    val themePickerSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    var currentItem by remember { mutableStateOf(menuItems.first()) }
    var currentTheme by remember { mutableStateOf(Theme.values().first()) }
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
                        currentItem = it
                    }
                },
            )
        },
        topBar = {
            val context = LocalContext.current
            TopBar(
                title = currentItem.title,
                onNavigationClick = { scope.launch { drawerState.open() } },
                actions = {
                    IconButton(
                        onClick = { toMainActivity(context) },
                        icon = painterResource(id = R.drawable.ic_backward_fill_24),
                        modifier = Modifier.padding(horizontal = 10.dp),
                    )
                    if (hasMultipleThemes) {
                        IconButton(
                            icon = painterResource(id = R.drawable.ic_settings_fill_24),
                            onClick = { scope.launch { themePickerSheetState.show() } },
                        )
                    }
                },
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
        ) {
            if (hasMultipleThemes) {
                ModalBottomSheetLayout(
                    sheetContent = {
                        ThemePicker(
                            currentTheme,
                            onApply = { currentTheme = it },
                            onConfirm = {
                                scope.launch {
                                    themePickerSheetState.hide()
                                }
                            },
                        )
                    },
                    sheetState = themePickerSheetState,
                    sheetShape = sandboxStyle.sheetShape,
                    sheetBackgroundColor = sandboxStyle.sheetBackgroundColor,
                ) {
                    currentItem.screen(currentTheme.compose)
                }
            } else {
                currentItem.screen(currentTheme.compose)
            }
        }
    }
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

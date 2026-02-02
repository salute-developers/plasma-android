package com.sdds.compose.uikit.fixtures.samples.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.Drawer
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberDrawerState
import com.sdds.docs.DocSample
import com.sdds.icons.R
import kotlinx.coroutines.launch

@Composable
@DocSample(needScreenshot = true)
fun Drawer_Simple() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            drawerContent = { Text("Содержимое Drawer") },
        ) {
            Button(
                label = "Открыть Drawer",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_WithHeaderFooter() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            drawerHeader = { Text("Заголовок", modifier = Modifier.padding(16.dp)) },
            drawerFooter = {
                Button(
                    label = "Закрыть",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    onClick = { scope.launch { drawerState.close() } },
                )
            },
            drawerContent = { Text("Основное содержимое", modifier = Modifier.padding(16.dp)) },
        ) {
            Button(
                label = "Открыть",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_PeekAndOverlay() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            peekOffset = 56.dp,
            overlayEnabled = true,
            drawerContent = { Text("Контент панели", modifier = Modifier.padding(16.dp)) },
        ) {
            Button(
                label = "Открыть",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_Alignments() {
    composableCodeSnippet {
        val start = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Start,
        )
        val end =
            rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.End)
        val top =
            rememberDrawerState(initialValue = DrawerValue.Closed, alignment = DrawerAlignment.Top)
        val bottom = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Bottom,
        )
        val scope = rememberCoroutineScope()

        Column {
            Button(label = "Слева", onClick = { scope.launch { start.open() } })
            Drawer(drawerState = start, drawerContent = { Text("Панель слева") }) { }

            Button(label = "Справа", onClick = { scope.launch { end.open() } })
            Drawer(drawerState = end, drawerContent = { Text("Панель справа") }) { }

            Button(label = "Сверху", onClick = { scope.launch { top.open() } })
            Drawer(drawerState = top, drawerContent = { Text("Панель сверху") }) { }

            Button(label = "Снизу", onClick = { scope.launch { bottom.open() } })
            Drawer(drawerState = bottom, drawerContent = { Text("Панель снизу") }) { }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_CustomCloseIcon() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            closeIconAlignment = CloseIconAlignment.End,
            closeIconPlacement = CloseIconPlacement.Outer,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
            drawerContent = {
                Text(
                    "Панель с кастомной иконкой",
                    modifier = Modifier.padding(16.dp),
                )
            },
        ) {
            Button(
                label = "Открыть",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_NoGestures() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            gesturesEnabled = false,
            drawerContent = { Text("Жесты отключены", modifier = Modifier.padding(16.dp)) },
        ) {
            Row(Modifier.align(Alignment.Center)) {
                Button(label = "Открыть", onClick = { scope.launch { drawerState.open() } })
                Spacer(Modifier.width(12.dp))
                Button(label = "Закрыть", onClick = { scope.launch { drawerState.close() } })
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_MoveContent() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            moveContentEnabled = true,
            drawerContent = { Text("Контент панели", modifier = Modifier.padding(16.dp)) },
        ) {
            Button(
                label = "Открыть",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_NoAutoOpenOnFocus() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        Drawer(
            drawerState = drawerState,
            openOnFocus = false,
            drawerContent = { Text("Панель не открывается по фокусу") },
        ) {
            /* Основной контент */
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_WithConfirm() {
    composableCodeSnippet {
        val canClose = remember { mutableStateOf(false) }
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            confirmStateChange = { target ->
                // Разрешаем закрытие только если canClose == true
                if (target == DrawerValue.Closed) canClose.value else true
            },
        )
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            drawerContent = {
                Column(Modifier.padding(16.dp)) {
                    var active by remember { mutableStateOf(false) }
                    Text("Чтобы закрыть панель, включите переключатель")
                    Switch(active = active, onActiveChanged = { active = it })
                    Spacer(Modifier.height(12.dp))
                    Button(
                        label = "Закрыть программно",
                        onClick = { scope.launch { drawerState.close() } },
                    )
                }
            },
        ) {
            Button(
                label = "Открыть",
                modifier = Modifier.align(Alignment.Center),
                onClick = { scope.launch { drawerState.open() } },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Drawer_ProgrammaticControl() {
    composableCodeSnippet {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            drawerContent = { Text("Контент") },
        ) {
            Row(Modifier.align(Alignment.Center)) {
                Button(label = "open()", onClick = { scope.launch { drawerState.open() } })
                Spacer(Modifier.width(8.dp))
                Button(label = "close()", onClick = { scope.launch { drawerState.close() } })
                Spacer(Modifier.width(8.dp))
                Button(
                    label = "snapTo(Open)",
                    onClick = { scope.launch { drawerState.snapTo(DrawerValue.Opened) } },
                )
            }
        }
    }
}

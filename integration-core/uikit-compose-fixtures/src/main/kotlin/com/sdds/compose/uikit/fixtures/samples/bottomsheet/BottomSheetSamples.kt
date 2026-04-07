package com.sdds.compose.uikit.fixtures.samples.bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.HalfExpandedSettings
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.docs.DocSample
import com.sdds.icons.R
import kotlinx.coroutines.launch

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_Simple() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.HalfExpanded, "BottomSheetValue.Hidden"),
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "показать BottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )
        ModalBottomSheet(
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Inner,
            fitContent = false,
            header = {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            color = placeholder({ Color.DarkGray }, "/** Токен цвета */"),
                            text = "Заголовок",
                        )
                        IconButton(
                            iconRes = R.drawable.ic_close_24,
                        ) {
                            scope.launch { sheetState.hide() }
                        }
                    }
                    Spacer(modifier = Modifier.padding(6.dp))
                    Divider()
                    Spacer(modifier = Modifier.padding(6.dp))
                }
            },
            body = {
                var value by remember { mutableStateOf(TextFieldValue("")) }
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = value,
                    labelText = "Лейбл",
                    placeholderText = "Введите текст",
                    onValueChange = { value = it },
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            },
            footer = {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    label = "Сохранить",
                    spacing = ButtonSpacing.Packed,
                    onClick = {},
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_HalfExpanded_Skip() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
            halfExpandedSettings = HalfExpandedSettings.Skip,
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "показать BottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )
        ModalBottomSheet(
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            fitContent = false,
            header = { Text("Header") },
            footer = { Text("Footer") },
        ) {
            Text("Text")
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_HalfExpanded_Fraction() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
            halfExpandedSettings = HalfExpandedSettings.Fraction(0.3f),
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "показать BottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )
        ModalBottomSheet(
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            fitContent = false,
            header = { Text("Header") },
            footer = { Text("Footer") },
        ) {
            Text("Text")
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_HalfExpanded_Height() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
            halfExpandedSettings = HalfExpandedSettings.Height(500.dp),
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "показать BottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )
        ModalBottomSheet(
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            fitContent = false,
            header = { Text("Header") },
            footer = { Text("Footer") },
        ) {
            Text("Text")
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ModalBottomSheet_Style() {
    composableCodeSnippet {
        ModalBottomSheetStyle.builder()
            .shape(placeholder(RoundedCornerShape(16.dp), "/** Токен формы (скругления) */"))
            .handleShape(CircleShape)
            .dimensions {
                paddingStart(16.0.dp)
                paddingEnd(16.0.dp)
                paddingTop(16.0.dp)
                paddingBottom(16.0.dp)
                handleHeight(4.0.dp)
                handleWidth(48.0.dp)
                handleOffset(6.0.dp)
            }
            .colors {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
                handleColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asInteractive(),
                )
            }
            .handlePlacement(BottomSheetHandlePlacement.Auto)
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ModalBottomSheetHandleInner_Simple() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
        )
        ModalBottomSheet(
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Inner,
            fitContent = false,
            body = { Text("Text") },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ModalBottomSheetFitContent_Simple() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
        )
        ModalBottomSheet(
            sheetState = sheetState,
            fitContent = true,
            body = { Text("Заголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_Insets() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = placeholder(BottomSheetValue.Expanded, "BottomSheetValue.Hidden"),
        )
        val scrollState = rememberScrollState()
        ModalBottomSheet(
            // Обрабатываем отступы statusBar снаружи, чтобы ModalBottomSheet открывался до границ statusBar
            modifier = Modifier.statusBarsPadding(),
            sheetState = sheetState,
            onDismiss = { /* Колбэк закрытия ModalBottomSheet */ },
            fitContent = true,
        ) {
            Column(
                modifier = Modifier
                    // Отступы navigationBar обрабатываем внутри, чтобы ModalBottomSheet рисовался под navigationBar
                    .navigationBarsPadding()
                    // Аналогично поступаем с отступами IME
                    .imePadding()
                    .verticalScroll(scrollState),
            ) {
                Text("Заголовок ModalBottomSheet")

                TextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = "",
                    placeholderText = "Введите значение",
                    onValueChange = {},
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            }
        }
    }
}

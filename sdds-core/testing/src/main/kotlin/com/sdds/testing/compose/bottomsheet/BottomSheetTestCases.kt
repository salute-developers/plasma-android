package com.sdds.testing.compose.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import kotlinx.coroutines.launch

/**
 * Тест кейсы для ModalBottomSheet
 */

/**
 * PLASMA-T1957
 */
@Composable
fun BottomSheetHeaderFooterFixedHandleInner(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.HalfExpanded,
    )
    val scope = rememberCoroutineScope()
    Button(
        style = buttonStyle,
        label = "Show",
        onClick = {
            scope.launch { sheetState.show() }
        },
    )
    ModalBottomSheet(
        style = style,
        sheetState = sheetState,
        handlePlacement = BottomSheetHandlePlacement.Inner,
        sheetGesturesEnabled = true,
        fitContent = false,
        header = { HeaderBottomSheet() },
        footer = { FooterBottomSheet() },
        body = { BodyText() },
        onDismiss = {},
    )
}

/**
 * PLASMA-T1958
 */
@Composable
fun BottomSheetHeaderFixedHandleOuter(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.HalfExpanded,
    )
    val scope = rememberCoroutineScope()
    Button(
        style = buttonStyle,
        label = "Show",
        onClick = {
            scope.launch { sheetState.show() }
        },
    )
    ModalBottomSheet(
        style = style,
        sheetState = sheetState,
        handlePlacement = BottomSheetHandlePlacement.Outer,
        sheetGesturesEnabled = true,
        fitContent = false,
        header = { HeaderBottomSheet() },
        footer = {},
        body = {
            BodyText()
            FooterBottomSheet()
        },
        onDismiss = {},
    )
}

/**
 * PLASMA-T1959
 */
@Composable
fun BottomSheetHeaderFooterFixedHandleNone(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Expanded,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        val scope = rememberCoroutineScope()
        Button(
            style = buttonStyle,
            label = "Show",
            onClick = {
                scope.launch { sheetState.show() }
            },
        )
        ModalBottomSheet(
            style = style,
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.None,
            sheetGesturesEnabled = true,
            fitContent = false,
            header = {},
            footer = { FooterBottomSheet() },
            body = {
                HeaderBottomSheet()
                BodyText()
            },
            onDismiss = {},
        )
    }
}

/**
 * PLASMA-T1960
 */
@Composable
fun BottomSheetFooterAuto(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Expanded,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        val scope = rememberCoroutineScope()
        Button(
            style = buttonStyle,
            label = "Show",
            onClick = {
                scope.launch { sheetState.show() }
            },
        )
        ModalBottomSheet(
            style = style,
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            sheetGesturesEnabled = true,
            fitContent = false,
            header = {},
            footer = {},
            body = {
                BodyText()
                FooterBottomSheet()
            },
            onDismiss = {},
        )
    }
}

/**
 * PLASMA-T1961
 */
@Composable
fun BottomSheetHeaderAuto(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Expanded,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        val scope = rememberCoroutineScope()
        Button(
            style = buttonStyle,
            label = "Show",
            onClick = {
                scope.launch { sheetState.show() }
            },
        )
        ModalBottomSheet(
            style = style,
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            sheetGesturesEnabled = true,
            fitContent = false,
            header = {},
            footer = {},
            body = {
                HeaderBottomSheet()
                BodyText()
            },
            onDismiss = {},
        )
    }
}

/**
 * PLASMA-T1961
 */
@Composable
fun BottomSheetNoHeaderFooterAuto(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Expanded,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        val scope = rememberCoroutineScope()
        Button(
            style = buttonStyle,
            label = "Show",
            onClick = {
                scope.launch { sheetState.show() }
            },
        )
        ModalBottomSheet(
            style = style,
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            sheetGesturesEnabled = true,
            fitContent = false,
            header = {},
            footer = {},
            body = {
                BodyText()
            },
            onDismiss = {},
        )
    }
}

/**
 * Header для BottomSheet
 */
@Composable
private fun HeaderBottomSheet() {
    Column(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp)
            .background(Color.LightGray),
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text("Header")
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) { Divider() }
    }
}

/**
 * Footer для BottomSheet
 */
@Composable
private fun FooterBottomSheet() {
    Row(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp)
            .background(Color.LightGray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text("Footer")
    }
}

/**
 * Body для BottomSheet
 */
@Composable
private fun BodyText() {
    Text(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse " +
            "cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
            "officia deserunt mollit anim id est laborum.",
    )
}

/**
 * Preview для меню песочницы
 */
@Composable
fun BottomSheetForSandbox(style: ModalBottomSheetStyle) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Hidden,
    )
    val scope = rememberCoroutineScope()
    Button(
        label = "show ModalBottomSheet",
        onClick = {
            scope.launch {
                sheetState.show()
            }
        },
    )
    ModalBottomSheet(
        style = style,
        sheetState = sheetState,
        handlePlacement = BottomSheetHandlePlacement.Auto,
        fitContent = false,
        header = {},
        footer = {},
    ) {
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(32.dp))
            Text(
                "Android operating system is the largest" +
                    "installed base among various mobile platforms" +
                    "across the globe. Hundreds of millions of mobile devices" +
                    "are powered by Android in more than 190 countries of the world.",
            )
        }
    }
}

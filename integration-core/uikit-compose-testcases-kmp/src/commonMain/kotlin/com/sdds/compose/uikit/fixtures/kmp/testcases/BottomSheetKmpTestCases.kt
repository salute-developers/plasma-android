package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
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

/**
 * PLASMA-T1958
 */
@Composable
fun BottomSheetHeaderFixedHandleOuterKmp(
    style: ModalBottomSheetStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.HalfExpanded,
    )
    ModalBottomSheet(
        style = style,
        sheetState = sheetState,
        handlePlacement = BottomSheetHandlePlacement.Outer,
        sheetGesturesEnabled = false,
        fitContent = false,
        header = { HeaderBottomSheet() },
        body = {
            Column {
                BodyText()
                FooterBottomSheet()
            }
        },
        footer = {},
        onDismiss = {},
    )
}

/**
 * PLASMA-T2768
 */
@Composable
fun BottomSheetHeaderFooterFixedFitContentEdgeToEdgeKmp(
    style: ModalBottomSheetStyle,
    buttonStyle: ButtonStyle,
) {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Expanded,
        skipHalfExpanded = true,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        ModalBottomSheet(
            style = style,
            sheetState = sheetState,
            handlePlacement = BottomSheetHandlePlacement.Auto,
            sheetGesturesEnabled = false,
            fitContent = true,
            edgeToEdge = true,
            dimBackground = true,
            useNativeBlackout = true,
            header = { HeaderBottomSheet() },
            body = { BodyText() },
            footer = {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    style = buttonStyle,
                    label = "Continue",
                    onClick = {},
                )
            },
            onDismiss = {},
        )
    }
}

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

@Composable
private fun BodyText() {
    Text(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat.",
    )
}

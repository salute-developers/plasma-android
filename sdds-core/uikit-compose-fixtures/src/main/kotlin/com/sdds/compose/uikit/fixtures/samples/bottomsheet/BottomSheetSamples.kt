package com.sdds.compose.uikit.fixtures.samples.bottomsheet

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.docs.DocSample
import kotlinx.coroutines.launch

@Composable
@DocSample(needScreenshot = true)
fun ModalBottomSheet_Simple() {
    composableCodeSnippet {
        val sheetState = rememberModalBottomSheetState(
            initialValue = BottomSheetValue.Hidden,
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
            initialValue = BottomSheetValue.Hidden,
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
            initialValue = BottomSheetValue.Hidden,
        )
        ModalBottomSheet(
            sheetState = sheetState,
            fitContent = true,
            body = { Text("Text") },
        )
    }
}

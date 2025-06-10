package com.sdds.testing.compose.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
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

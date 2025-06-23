package com.sdds.testing.compose.modal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.R

/**
 * Тест кейсы для Modal
 */

/**
 * PLASMA-T2046
 */
@Composable
fun ModalNativeBlackoutHasClose(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showModal = remember { mutableStateOf(false) }
        Button(
            modifier = Modifier.align(Center),
            style = buttonStyle,
            label = "Show",
            onClick = { showModal.value = true },
        )
        Modal(
            show = showModal.value,
            style = style,
            onDismissRequest = { showModal.value = false },
            modifier = Modifier.width(300.dp),
            hasClose = true,
            useNativeBlackout = true,
            closeIcon = painterResource(R.drawable.ic_close_24),
        ) {
            Text("Modal", modifier = Modifier.wrapContentSize())
        }
    }
}

/**
 * PLASMA-T2047
 */
@Composable
fun ModalWithoutNativeBlackout(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showModal = remember { mutableStateOf(false) }
        Button(
            modifier = Modifier.align(Center),
            style = buttonStyle,
            label = "Show",
            onClick = { showModal.value = true },
        )
        Modal(
            show = showModal.value,
            style = style,
            onDismissRequest = { showModal.value = false },
            modifier = Modifier.width(300.dp),
            hasClose = false,
            useNativeBlackout = false,
            closeIcon = painterResource(R.drawable.ic_close_24),
        ) {
            Text("Modal", modifier = Modifier.wrapContentSize())
        }
    }
}

/**
 * Preview для меню песочницы
 */
@Composable
fun ModalForSandboxCompose(style: ModalStyle) {
    val showModal = remember { mutableStateOf(false) }
    Button(
        label = "Show Modal",
        onClick = { showModal.value = true },
    )
    Modal(
        show = showModal.value,
        style = style,
        onDismissRequest = { showModal.value = false },
        modifier = Modifier.width(300.dp),
        hasClose = true,
        useNativeBlackout = true,
        closeIcon = painterResource(R.drawable.ic_close_24),
    ) {
        Text("Modal", modifier = Modifier.wrapContentSize())
    }
}

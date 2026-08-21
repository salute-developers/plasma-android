package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.SddsIcons

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
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        hasClose = true,
        gravity = ModalGravity.Center,
        useNativeBlackout = true,
    )
}

/**
 * PLASMA-T2047
 */
@Composable
fun ModalWithoutNativeBlackout(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.Center,
    )
}

/**
 * PLASMA-T2497
 */
@Composable
fun ModalTopStart(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    initialShow: Boolean = false,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        hasClose = true,
        gravity = ModalGravity.TopStart,
        dimBackground = true,
        edgeToEdge = true,
        initialShow = initialShow,
    )
}

/**
 * PLASMA-T2498
 */
@Composable
fun ModalTopCenter(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.TopCenter,
        dimBackground = true,
    )
}

/**
 * PLASMA-T2499
 */
@Composable
fun ModalTopEnd(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    initialShow: Boolean = false,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.TopEnd,
        edgeToEdge = true,
        initialShow = initialShow,
    )
}

/**
 * PLASMA-T2500
 */
@Composable
fun ModalCenterStart(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.CenterStart,
        dimBackground = true,
    )
}

/**
 * PLASMA-T2501
 */
@Composable
fun ModalCenter(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.Center,
    )
}

/**
 * PLASMA-T2502
 */
@Composable
fun ModalCenterEnd(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    initialShow: Boolean = false,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.CenterEnd,
        initialShow = initialShow,
    )
}

/**
 * PLASMA-T2503
 */
@Composable
fun ModalBottomStart(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    initialShow: Boolean = false,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.BottomStart,
        dimBackground = true,
        edgeToEdge = true,
        initialShow = initialShow,
    )
}

/**
 * PLASMA-T2504
 */
@Composable
fun ModalBottomCenter(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.BottomCenter,
        edgeToEdge = true,
    )
}

/**
 * PLASMA-T2505
 */
@Composable
fun ModalBottomEnd(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
) {
    ModalCommon(
        style = style,
        buttonStyle = buttonStyle,
        gravity = ModalGravity.BottomEnd,
        edgeToEdge = true,

    )
}

/**
 * Common test case
 */
@Composable
fun ModalCommon(
    style: ModalStyle,
    buttonStyle: ButtonStyle,
    dimBackground: Boolean = false,
    useNativeBlackout: Boolean = false,
    hasClose: Boolean = false,
    gravity: ModalGravity,
    edgeToEdge: Boolean = false,
    initialShow: Boolean = false,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showModal = remember { mutableStateOf(initialShow) }
        Button(
            modifier = Modifier.align(Center),
            style = buttonStyle,
            label = "Show",
            onClick = { showModal.value = true },
        )
        Modal(
            show = showModal.value,
            style = style,
            modifier = Modifier.width(300.dp),
            gravity = gravity,
            dimBackground = dimBackground,
            useNativeBlackout = useNativeBlackout,
            onDismissRequest = { showModal.value = false },
            hasClose = hasClose,
            edgeToEdge = edgeToEdge,
            closeIcon = rememberVectorPainter(SddsIcons.Close24),
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
        dimBackground = true,
        useNativeBlackout = true,
        closeIcon = rememberVectorPainter(SddsIcons.Close24),
    ) {
        Text("Modal", modifier = Modifier.wrapContentSize())
    }
}

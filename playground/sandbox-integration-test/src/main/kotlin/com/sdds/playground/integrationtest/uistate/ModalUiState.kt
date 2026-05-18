package com.sdds.playground.integrationtest.uistate

import com.sdds.compose.uikit.ModalGravity

/**
 * UiState для Modal
 */
@Suppress("UndocumentedPublicProperty")
internal data class ModalUiState(
    val useNativeBlackout: Boolean = true,
    val hasClose: Boolean = false,
    val hasDimBackground: Boolean = true,
    val gravity: ModalGravity = ModalGravity.Center,
    val edgeToEdge: Boolean = true,
)

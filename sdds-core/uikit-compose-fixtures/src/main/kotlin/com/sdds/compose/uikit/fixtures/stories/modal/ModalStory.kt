package com.sdds.compose.uikit.fixtures.stories.modal

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.Text
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ModalUiStatePropertiesProducer
import com.sdds.sandbox.ModalUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ModalUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val useNativeBlackout: Boolean = true,
    val hasClose: Boolean = false,
    val hasDimBackground: Boolean = true,
    val gravity: ModalGravity = ModalGravity.Center,
    val edgeToEdge: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ModalStory : ComposeBaseStory<ModalUiState, ModalStyle>(
    ComponentKey.Modal,
    ModalUiState(),
    ModalUiStatePropertiesProducer,
    ModalUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ModalStyle,
        state: ModalUiState,
    ) {
        val showModal = remember { mutableStateOf(false) }
        Button(
            modifier = Modifier.align(Alignment.Center),
            label = "show",
            onClick = { showModal.value = true },
        )
        Modal(
            show = showModal.value,
            style = style,
            onDismissRequest = { showModal.value = false },
            modifier = Modifier.width(300.dp),
            hasClose = state.hasClose,
            edgeToEdge = state.edgeToEdge,
            gravity = state.gravity,
            dimBackground = state.hasDimBackground,
            useNativeBlackout = state.useNativeBlackout,
            closeIcon = painterResource(R.drawable.ic_close_24),
        ) {
            Text("Modal", modifier = Modifier.wrapContentSize())
        }
    }
}

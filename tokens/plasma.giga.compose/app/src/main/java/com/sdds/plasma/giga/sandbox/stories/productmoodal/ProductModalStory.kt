package com.sdds.plasma.giga.sandbox.stories.productmoodal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.Text
import com.sdds.plasma.giga.components.productmodal.ProductModal
import com.sdds.plasma.giga.components.productmodal.ProductModalHeaderMode
import com.sdds.plasma.giga.components.productmodal.ProductModalStyle
import com.sdds.plasma.giga.compose.sandbox.stories.ProductModalUiStatePropertiesProducer
import com.sdds.plasma.giga.compose.sandbox.stories.ProductModalUiStateTransformer
import com.sdds.plasma.giga.integration.custom.ProductModalKey
import com.sdds.plasma.giga.sandbox.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонетна ProductCard в песочнице
 *
 */
@StoryUiState
data class ProductModalUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val useNativeBlackout: Boolean = true,
    val hasClose: Boolean = false,
    val hasDimBackground: Boolean = true,
    val gravity: ModalGravity = ModalGravity.Center,
    val edgeToEdge: Boolean = true,
    val header: String = "Заголовок",
    val headerMode: ProductModalHeaderMode = ProductModalHeaderMode.Default,
    val footerText: String = "Какое то описание",
    val buttonsAmount: Int = 2,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "ProductModal")
object ProductModalStory : ComposeBaseStory<ProductModalUiState, ProductModalStyle>(
    ProductModalKey,
    ProductModalUiState(),
    ProductModalUiStatePropertiesProducer,
    ProductModalUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ProductModalStyle,
        state: ProductModalUiState,
    ) {
        val showProductModal = remember { mutableStateOf(false) }
        Button(
            modifier = Modifier.align(Alignment.Center),
            label = "show",
            onClick = { showProductModal.value = true },
        )
        ProductModal(
            header = { Text(text = state.header) },
            headerMode = state.headerMode,
            show = showProductModal.value,
            style = style,
            onDismissRequest = { showProductModal.value = false },
            modifier = Modifier
                .clip(style.modalStyle.shape)
                .width(300.dp),
            hasClose = state.hasClose,
            edgeToEdge = state.edgeToEdge,
            gravity = state.gravity,
            dimBackground = state.hasDimBackground,
            useNativeBlackout = state.useNativeBlackout,
            closeIcon = painterResource(com.sdds.icons.R.drawable.ic_close_24),
            footerText = { Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = state.footerText) },
            content = {
                Image(
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.drawable.checker),
                    contentDescription = "Android",
                )
            },
            footer = {
                ButtonGroup(
                    modifier = Modifier.fillMaxWidth(),
                    orientation = ButtonGroupOrientation.Vertical,
                ) {
                    repeat(state.buttonsAmount.coerceAtLeast(0)) {
                        buttonContent()
                    }
                }
            },
        )
    }

    @Composable
    override fun Preview(
        style: ProductModalStyle,
        key: ComponentKey,
    ) {
        val showProductModal = remember { mutableStateOf(false) }
        Button(
            label = "Show ProductModal",
            onClick = { showProductModal.value = true },
        )
        ProductModal(
            header = "Заголовок",
            show = showProductModal.value,
            style = style,
            onDismissRequest = { showProductModal.value = false },
            modifier = Modifier.width(300.dp),
            hasClose = true,
            dimBackground = true,
            useNativeBlackout = true,
            closeIcon = painterResource(com.sdds.icons.R.drawable.ic_close_24),
            footer = {
                ButtonGroup(
                    modifier = Modifier.fillMaxWidth(),
                    orientation = ButtonGroupOrientation.Horizontal,
                ) {
                    repeat(2) {
                        buttonContent()
                    }
                }
            },
        )
    }
}

private fun ButtonGroupScope.buttonContent() {
    button {
        Button(
            modifier = Modifier.fillMaxWidth(),
            label = "label",
            onClick = {},
        )
    }
}

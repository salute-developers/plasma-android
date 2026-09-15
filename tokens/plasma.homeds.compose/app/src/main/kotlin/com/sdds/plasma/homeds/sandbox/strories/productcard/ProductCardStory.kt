package com.sdds.plasma.homeds.sandbox.strories.productcard

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.style
import com.sdds.icons.R
import com.sdds.plasma.homeds.components.productcard.ProductCard
import com.sdds.plasma.homeds.components.productcard.ProductCardStyle
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductCardUiStatePropertiesProducer
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductCardUiStateTransformer
import com.sdds.plasma.homeds.integration.custom.ProductCardKey
import com.sdds.plasma.homeds.styles.iconbutton.Default
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонетна ProductCard в песочнице
 *
 * @param value передаваемое значение
 * @param enabled активен ли компонент
 */
@StoryUiState
data class HomeDsProductCardUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val value: String = "20.4",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
internal object ProductCardStory : ComposeBaseStory<HomeDsProductCardUiState, ProductCardStyle>(
    ProductCardKey,
    HomeDsProductCardUiState(),
    HomeDsProductCardUiStatePropertiesProducer,
    HomeDsProductCardUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ProductCardStyle,
        state: HomeDsProductCardUiState,
    ) {
        val currentValue = state.value.toFloatOrNull() ?: 23.4f
        ProductCard(
            numberPanelValue = currentValue,
            style = style,
            orientation = style.cardStyle.orientation,
            extra = {
                IconButton(
                    style = IconButton.S.Default.style(),
                    enabled = state.enabled,
                    iconSource = resourceImageSource(R.drawable.ic_plasma_24),
                    modifier = Modifier.align(Alignment.BottomEnd),
                    onClick = {},
                )
            },
            label = { Text("Title") },
            content = {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(com.sdds.plasma.homeds.sandbox.R.drawable.checker),
                    contentDescription = "Android",
                )
            },
        )
    }

    @Composable
    override fun Preview(style: ProductCardStyle, key: ComponentKey) {
        ProductCard(
            numberPanelValue = 20.4f,
            style = style,
            orientation = style.cardStyle.orientation,
            extra = {
                IconButton(
                    style = IconButton.S.Default.style(),
                    iconSource = resourceImageSource(R.drawable.ic_plasma_24),
                    modifier = Modifier.align(Alignment.BottomEnd),
                    onClick = {},
                )
            },
            label = { Text("Title") },
            content = {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(com.sdds.plasma.homeds.sandbox.R.drawable.checker),
                    contentDescription = "Android",
                )
            },
        )
    }
}

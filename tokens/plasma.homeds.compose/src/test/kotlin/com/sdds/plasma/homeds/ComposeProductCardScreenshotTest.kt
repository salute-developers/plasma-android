package com.sdds.plasma.homeds

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.productcard.ProductCardStyle
import com.sdds.plasma.homeds.styles.customcomponents.productcard.HasInnerPaddings
import com.sdds.plasma.homeds.styles.customcomponents.productcard.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.productcard.L
import com.sdds.plasma.homeds.styles.customcomponents.productcard.M
import com.sdds.plasma.homeds.styles.iconbutton.Default
import com.sdds.plasma.homeds.styles.iconbutton.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import com.sdds.icons.R as IconsR
import com.sdds.plasma.homeds.components.productcard.ProductCard as ProductCardView
import com.sdds.plasma.homeds.styles.customcomponents.productcard.ProductCard as ProductCardStyleProvider
import com.sdds.plasma.homeds.styles.iconbutton.IconButton as IconButtonStyleProvider

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeProductCardScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testProductCardL() {
        composeTestRule.content {
            ProductCardTestView(ProductCardStyleProvider.L.style())
        }
    }

    @Test
    fun testProductCardMHasInnerPaddings() {
        composeTestRule.content {
            ProductCardTestView(ProductCardStyleProvider.M.HasInnerPaddings.style())
        }
    }

    @Test
    fun testProductCardMHumidity() {
        composeTestRule.content {
            ProductCardTestView(ProductCardStyleProvider.M.Humidity.style())
        }
    }

    @Test
    fun testProductCardLHumidityHasInnerPaddings() {
        composeTestRule.content {
            ProductCardTestView(ProductCardStyleProvider.L.Humidity.HasInnerPaddings.style())
        }
    }
}

@Composable
private fun ProductCardTestView(style: ProductCardStyle) {
    ProductCardView(
        numberPanelValue = 20.4f,
        style = style,
        orientation = style.cardStyle.orientation,
        extra = { ProductCardExtra() },
        label = { Text("Title") },
        content = {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.il_avatar_for_test),
                contentDescription = "Product card",
            )
        },
    )
}

@Composable
private fun BoxScope.ProductCardExtra() {
    IconButton(
        style = IconButtonStyleProvider.S.Default.style(),
        iconSource = resourceImageSource(IconsR.drawable.ic_plasma_24),
        modifier = Modifier.align(Alignment.BottomEnd),
        onClick = {},
    )
}

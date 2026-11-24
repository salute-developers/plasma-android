package com.sdds.plasma.giga

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.components.productmodal.ProductModalHeaderMode
import com.sdds.plasma.giga.components.productmodal.ProductModalStyle
import com.sdds.plasma.giga.styles.customcomponents.productmodal.M
import com.sdds.plasma.giga.styles.customcomponents.productmodal.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import com.sdds.icons.R as IconsR
import com.sdds.plasma.giga.components.productmodal.ProductModal as ProductModalView
import com.sdds.plasma.giga.styles.customcomponents.productmodal.ProductModal as ProductModalStyleProvider

/**
 * Скриншот-тесты [ProductModalView] для обоих размеров (M, S) и обоих режимов хедера
 * ([ProductModalHeaderMode.Default], [ProductModalHeaderMode.Absolute]).
 */
@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeProductModalScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testProductModalMDefaultHeader() {
        composeTestRule.content {
            ProductModalTestView(ProductModalStyleProvider.M.style(), ProductModalHeaderMode.Default)
        }
        showModalAndCapture()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testProductModalMAbsoluteHeader() {
        composeTestRule.content {
            ProductModalTestView(ProductModalStyleProvider.M.style(), ProductModalHeaderMode.Absolute)
        }
        showModalAndCapture()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testProductModalSDefaultHeader() {
        composeTestRule.content {
            ProductModalTestView(ProductModalStyleProvider.S.style(), ProductModalHeaderMode.Default)
        }
        showModalAndCapture()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testProductModalSAbsoluteHeader() {
        composeTestRule.content {
            ProductModalTestView(ProductModalStyleProvider.S.style(), ProductModalHeaderMode.Absolute)
        }
        showModalAndCapture()
    }

    /**
     * Пустые `extra` и `footerText` не должны добавлять отступы в футер
     */
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testProductModalMWithoutOptionalSlots() {
        composeTestRule.content {
            ProductModalTestView(
                style = ProductModalStyleProvider.M.style(),
                headerMode = ProductModalHeaderMode.Default,
                hasOptionalSlots = false,
            )
        }
        showModalAndCapture()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    private fun showModalAndCapture() {
        composeTestRule.onNodeWithText(ShowButtonLabel).performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}

@Composable
private fun ProductModalTestView(
    style: ProductModalStyle,
    headerMode: ProductModalHeaderMode,
    hasOptionalSlots: Boolean = true,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showModal = remember { mutableStateOf(false) }
        Button(
            modifier = Modifier.align(Alignment.Center),
            label = ShowButtonLabel,
            onClick = { showModal.value = true },
        )
        ProductModalView(
            show = showModal.value,
            onDismissRequest = { showModal.value = false },
            modifier = Modifier.width(ModalWidth),
            style = style,
            dimBackground = true,
            headerMode = headerMode,
            hasClose = true,
            closeIcon = painterResource(IconsR.drawable.ic_close_24),
            closeContentDescription = CloseContentDescription,
            header = { Text(HeaderText) },
            content = {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(ImageHeight),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(R.drawable.il_avatar_for_test),
                    contentDescription = ImageContentDescription,
                )
            },
            extra = if (hasOptionalSlots) {
                @Composable { Text(ExtraText) }
            } else {
                null
            },
            footerText = if (hasOptionalSlots) {
                @Composable { Text(FooterText) }
            } else {
                null
            },
            footer = {
                ButtonGroup(
                    modifier = Modifier.fillMaxWidth(),
                    orientation = ButtonGroupOrientation.Horizontal,
                ) {
                    repeat(ButtonsAmount) {
                        button {
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                label = ButtonLabel,
                                onClick = {},
                            )
                        }
                    }
                }
            },
        )
    }
}

private const val ShowButtonLabel = "Show"
private const val HeaderText = "Заголовок"
private const val ExtraText = "Дополнительный контент"
private const val FooterText = "Какое то описание"
private const val ButtonLabel = "Label"
private const val CloseContentDescription = "Закрыть"
private const val ImageContentDescription = "Image"
private const val ButtonsAmount = 2
private val ModalWidth = 300.dp
private val ImageHeight = 160.dp

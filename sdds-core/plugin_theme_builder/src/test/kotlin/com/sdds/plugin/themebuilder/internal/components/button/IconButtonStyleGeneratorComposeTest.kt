package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream

class IconButtonStyleGeneratorComposeTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: IconButtonStyleGeneratorCompose
    private lateinit var mockKtFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder

    @Before
    fun before() {
        outputKt = ByteArrayOutputStream()
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.styles.button",
            fileName = "IconButtonStyles",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every {
                create(
                    fileName = "IconButtonStyles",
                    fullPackageName = "com.sdds.playground.themebuilder.styles.button",
                )
            } returns ktFileBuilder
        }
        underTest = IconButtonStyleGeneratorCompose(
            ktFileBuilderFactory = mockKtFileBuilderFactory,
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            componentPackage = "com.sdds.playground.themebuilder.styles.button",
            themeClassName = "SddsServTheme",
            themePackage = "com.sdds.playground.themebuilder.theme",
            dimensionsConfig = DimensionsConfig(),
            dimensAggregator = mockk(),
            namespace = "com.sdds.playground.themebuilder",
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "sdds_serv"),
        )
    }

    @After
    fun after() {
        clearAllMocks()
    }

    @Test
    fun `IconButtonStyleGeneratorCompose должен генерировать kotlin файлы со стилями IconButton`() {
        underTest.generate(data)

        verify {
            mockKtFileBuilderFactory.create(
                fileName = "IconButtonStyles",
                fullPackageName = "com.sdds.playground.themebuilder.styles.button",
            )
        }

        Assert.assertEquals(
            getResourceAsText("component-outputs/IconButtonStylesKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val data = ButtonComponentConfig(
            invariant = ButtonComponentConfig.Invariant(
                loadingAlpha = 0.02f,
            ),
            variations = ButtonComponentConfig.Variations(
                size = mapOf(
                    "l" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape(
                            "round.l",
                            -2f,
                        ),
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                    ),
                    "m" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape(
                            "round.m",
                        ),
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                    ),
                    "s" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape(
                            "round.s",
                            2f,
                        ),
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                    ),
                ),
                color = mapOf(
                    "default" to ButtonComponentConfig.ColorScheme(
                        contentColor = ButtonComponentConfig.Color(
                            default = "textInversePrimaryActive",
                            states = emptyList(),
                        ),
                        backgroundColor = ButtonComponentConfig.Color(
                            default = "surfaceInversePrimaryActive",
                            states = listOf(
                                ButtonComponentConfig.ColorState(
                                    listOf("pressed", "focused"),
                                    "surfaceInversePrimaryPressed",
                                ),
                            ),
                        ),
                    ),
                    "warning" to ButtonComponentConfig.ColorScheme(
                        contentColor = ButtonComponentConfig.Color(
                            default = "textInverseWarningActive",
                            states = emptyList(),
                        ),
                        backgroundColor = ButtonComponentConfig.Color(
                            default = "surfaceInverseWarningActive",
                            states = listOf(
                                ButtonComponentConfig.ColorState(
                                    listOf("pressed", "focused"),
                                    "surfaceInverseWarningPressed",
                                ),
                            ),
                        ),
                    ),
                ),
            ),
        )
    }
}
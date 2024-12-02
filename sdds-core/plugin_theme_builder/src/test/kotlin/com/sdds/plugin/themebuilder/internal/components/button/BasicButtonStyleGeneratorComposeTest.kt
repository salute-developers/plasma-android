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

class BasicButtonStyleGeneratorComposeTest {
    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var underTest: BasicButtonStyleGeneratorCompose
    private lateinit var mockKtFileBuilderFactory: KtFileBuilderFactory
    private lateinit var ktFileBuilder: KtFileBuilder

    @Before
    fun before() {
        outputKt = ByteArrayOutputStream()
        ktFileBuilder = KtFileBuilder(
            packageName = "com.sdds.playground.themebuilder.styles.button",
            fileName = "BasicButtonStyles",
        )
        mockKtFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every {
                create(
                    fileName = "BasicButtonStyles",
                    fullPackageName = "com.sdds.playground.themebuilder.styles.button",
                )
            } returns ktFileBuilder
        }
        underTest = BasicButtonStyleGeneratorCompose(
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
    fun `BasicButtonStyleGeneratorCompose должен генерировать kotlin файлы со стилями BasicButton`() {
        underTest.generate(data)

        verify {
            mockKtFileBuilderFactory.create(
                fileName = "BasicButtonStyles",
                fullPackageName = "com.sdds.playground.themebuilder.styles.button",
            )
        }

        Assert.assertEquals(
            getResourceAsText("component-outputs/BasicButtonStylesKt.txt"),
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
                        labelStyle = "body.l.bold",
                        valueStyle = "body.l.bold",
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                        iconMargin = 8f,
                        valueMargin = 4f,
                    ),
                    "m" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape(
                            "round.m",
                        ),
                        labelStyle = "body.m.bold",
                        valueStyle = "body.m.bold",
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                        iconMargin = 8f,
                        valueMargin = 4f,
                    ),
                    "s" to ButtonComponentConfig.Size(
                        shape = ButtonComponentConfig.Shape(
                            "round.s",
                            2f,
                        ),
                        labelStyle = "body.s.bold",
                        valueStyle = "body.s.bold",
                        height = 56f,
                        paddingStart = 24f,
                        paddingEnd = 24f,
                        minWidth = 98f,
                        iconSize = 24f,
                        spinnerSize = 22f,
                        iconMargin = 8f,
                        valueMargin = 4f,
                    ),
                ),
                color = emptyMap(),
            ),
        )
    }
}

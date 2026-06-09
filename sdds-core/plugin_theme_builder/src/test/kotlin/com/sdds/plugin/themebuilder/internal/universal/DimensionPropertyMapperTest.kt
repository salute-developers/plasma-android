package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Test

class DimensionPropertyMapperTest {

    @Test
    fun `возвращает dp значение без ресурсов`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 2f,
            ),
        )

        val builderCall = underTest.map(
            meta = dimensionParam(
                methodName = "boxPadding",
                id = "boxPadding",
            ),
            tokenValue = Dimension(4f),
            variationId = "",
        )

        assertEquals("boxPadding(8.0.dp)", builderCall)
    }

    @Test
    fun `возвращает dp значение с состояниями без ресурсов`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 1f,
            ),
        )

        val builderCall = underTest.map(
            meta = dimensionParam(
                methodName = "boxPadding",
                id = "boxPadding",
            ),
            tokenValue = Dimension(
                value = 4f,
                states = listOf(
                    FloatState(state = listOf("pressed"), value = 8f),
                    FloatState(state = listOf("pressed", "hovered"), value = 6f),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "boxPadding(4.0.dp.asStatefulValue(setOf(InteractiveState.Pressed) to 8.0.dp, " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) to 6.0.dp))",
            builderCall,
        )
    }

    @Test
    fun `добавляет dimen и возвращает resource reference`() {
        val dimensAggregator = mockk<DimensAggregator>(relaxed = true)
        val resourceReferenceProvider = mockk<ResourceReferenceProvider>()
        every { resourceReferenceProvider.dimenR(any()) } returns "R.dimen.test_box_padding_s"

        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = true,
                multiplier = 1f,
            ),
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )

        val builderCall = underTest.map(
            meta = dimensionParam(
                methodName = "boxPadding",
                id = "boxPadding",
            ),
            tokenValue = Dimension(4f),
            variationId = "s",
        )

        assertEquals("boxPadding(dimensionResource(R.dimen.test_box_padding_s))", builderCall)
        verify {
            dimensAggregator.addDimen(
                DimenData(
                    name = "test_box_padding_s",
                    value = 4f,
                    type = DimenData.Type.DP,
                ),
            )
        }
    }

    @Test
    fun `добавляет dimen для state values и возвращает resource reference`() {
        val dimensAggregator = mockk<DimensAggregator>(relaxed = true)
        val resourceReferenceProvider = mockk<ResourceReferenceProvider>()

        every { resourceReferenceProvider.dimenR(any()) } answers {
            val dimen = firstArg<DimenData>()
            "R.dimen.${dimen.name}"
        }

        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = true,
                multiplier = 1f,
            ),
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )

        val builderCall = underTest.map(
            meta = dimensionParam(
                methodName = "boxPadding",
                id = "boxPadding",
            ),
            tokenValue = Dimension(
                value = 4f,
                states = listOf(
                    FloatState(
                        state = listOf("pressed"),
                        value = 8f,
                    ),
                    FloatState(
                        state = listOf("pressed", "hovered"),
                        value = 6f,
                    ),
                ),
            ),
            variationId = "s",
        )

        assertEquals(
            "boxPadding(dimensionResource(R.dimen.test_box_padding_s)" +
                ".asStatefulValue(" +
                "setOf(InteractiveState.Pressed) to dimensionResource(R.dimen.test_box_padding_s_0), " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to dimensionResource(R.dimen.test_box_padding_s_1)))",
            builderCall,
        )

        verify {
            dimensAggregator.addDimen(
                match {
                    it.name == "test_box_padding_s" &&
                        it.value == 4f &&
                        it.type == DimenData.Type.DP
                },
            )

            dimensAggregator.addDimen(
                match {
                    it.name == "test_box_padding_s_0" &&
                        it.value == 8f &&
                        it.type == DimenData.Type.DP
                },
            )

            dimensAggregator.addDimen(
                match {
                    it.name == "test_box_padding_s_1" &&
                        it.value == 6f &&
                        it.type == DimenData.Type.DP
                },
            )
        }
    }

    @Test
    fun `возвращает dp значение с кастомным stateEnum без ресурсов`() {
        val underTest = DimensionPropertyMapper(
            componentName = "testComponent",
            dimensAggregator = mockk(relaxed = true),
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
            resourceReferenceProvider = mockk(relaxed = true),
            componentXmlPrefix = "test",
            stateEnum = StateEnum(
                qualifiedName = "com.test.SliderState",
                simpleName = "SliderState",
                values = listOf(EnumValueInfo(name = "Dragging", configName = "dragging")),
            ),
        )

        val builderCall = underTest.map(
            meta = dimensionParam(methodName = "trackWidth", id = "trackWidth"),
            tokenValue = Dimension(
                value = 10f,
                states = listOf(FloatState(state = listOf("dragging"), value = 16f)),
            ),
            variationId = "m",
        )

        assertEquals(
            "trackWidth(10.0.dp.asStatefulValue(setOf(SliderState.Dragging) to 16.0.dp))",
            builderCall,
        )
    }

    @Test
    fun `возвращает dp значение без суффикса если variationId совпадает с componentName в CamelCase`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
        )

        // componentName = "testComponent", camelComponentName = "TestComponent"
        val builderCall = underTest.map(
            meta = dimensionParam(methodName = "boxPadding", id = "boxPadding"),
            tokenValue = Dimension(8f),
            variationId = "TestComponent",
        )

        assertEquals("boxPadding(8.0.dp)", builderCall)
    }

    @Test
    fun `ресурс не имеет суффикса когда variationId совпадает с componentName`() {
        val dimensAggregator = mockk<DimensAggregator>(relaxed = true)
        val resourceReferenceProvider = mockk<ResourceReferenceProvider>()
        every { resourceReferenceProvider.dimenR(any()) } answers {
            "R.dimen.${firstArg<DimenData>().name}"
        }

        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(fromResources = true, multiplier = 1f),
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )

        val builderCall = underTest.map(
            meta = dimensionParam(methodName = "boxPadding", id = "boxPadding"),
            tokenValue = Dimension(8f),
            variationId = "TestComponent",
        )

        assertEquals("boxPadding(dimensionResource(R.dimen.test_box_padding))", builderCall)
        verify {
            dimensAggregator.addDimen(
                DimenData(name = "test_box_padding", value = 8f, type = DimenData.Type.DP),
            )
        }
    }

    private fun mapper(
        dimensionsConfig: DimensionsConfig,
        dimensAggregator: DimensAggregator = mockk(relaxed = true),
        resourceReferenceProvider: ResourceReferenceProvider = mockk(relaxed = true),
    ) = DimensionPropertyMapper(
        componentName = "testComponent",
        dimensAggregator = dimensAggregator,
        dimensionsConfig = dimensionsConfig,
        resourceReferenceProvider = resourceReferenceProvider,
        componentXmlPrefix = "test",
        stateEnum = null,
    )

    private fun dimensionParam(
        methodName: String,
        id: String,
    ) = DimensionPropertyMeta(
        id = id,
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}

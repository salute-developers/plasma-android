package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Test

class ShapePropertyMapperTest {

    @Test
    fun `возвращает shape без adjustment`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 1f,
            ),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape("round.m"),
            variationId = "",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM)",
            builderCall,
        )
    }

    @Test
    fun `возвращает CircleShape`() {
        val importCollector = mockk<ImportCollector>(relaxed = true)

        val underTest = mapper(
            importCollector = importCollector,
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 1f,
            ),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape("round.circle"),
            variationId = "",
        )

        assertEquals("shape(CircleShape)", builderCall)

        verify {
            importCollector.addImport(
                pkg = "androidx.compose.foundation.shape",
                name = "CircleShape",
            )
        }
    }

    @Test
    fun `возвращает shape с dp adjustment`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 2f,
            ),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape(
                value = "round.m",
                adjustment = 4f,
            ),
            variationId = "s",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM.adjustBy(all = 8.0.dp))",
            builderCall,
        )
    }

    @Test
    fun `возвращает shape с resource adjustment`() {
        val dimensAggregator = mockk<DimensAggregator>(relaxed = true)
        val resourceReferenceProvider = mockk<ResourceReferenceProvider>()

        every {
            resourceReferenceProvider.dimenR(any())
        } returns "R.dimen.test_shapeAdjustment_s"

        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = true,
                multiplier = 1f,
            ),
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape(
                value = "round.m",
                adjustment = 4f,
            ),
            variationId = "s",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM.adjustBy(all = dimensionResource(R.dimen.test_shapeAdjustment_s)))",
            builderCall,
        )

        verify {
            dimensAggregator.addDimen(
                DimenData(
                    name = "test_shapeAdjustment_s",
                    value = 4f,
                    type = DimenData.Type.DP,
                ),
            )
        }
    }

    @Test
    fun `возвращает shape с состояниями`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(
                fromResources = false,
                multiplier = 1f,
            ),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape(
                value = "round.m",
                states = listOf(
                    StringState(
                        state = listOf("pressed"),
                        value = "round.l",
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TestTheme.shapes.roundL))",
            builderCall,
        )
    }

    @Test
    fun `возвращает shape с кастомным stateEnum`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
            stateEnum = StateEnum(
                qualifiedName = "com.test.SomeState",
                simpleName = "SomeState",
                values = listOf(EnumValueInfo(name = "Active", configName = "active")),
            ),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape(
                value = "round.m",
                states = listOf(
                    StringState(state = listOf("active"), value = "round.l"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM.asStatefulValue(setOf(SomeState.Active) to TestTheme.shapes.roundL))",
            builderCall,
        )
    }

    @Test
    fun `возвращает shape с adjustment и состояниями`() {
        val underTest = mapper(
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
        )

        val builderCall = underTest.map(
            meta = shapeParam("shape"),
            tokenValue = Shape(
                value = "round.m",
                adjustment = 4f,
                states = listOf(
                    StringState(state = listOf("pressed"), value = "round.l"),
                ),
            ),
            variationId = "s",
        )

        assertEquals(
            "shape(TestTheme.shapes.roundM.adjustBy(all = 4.0.dp).asStatefulValue(" +
                "setOf(InteractiveState.Pressed) to TestTheme.shapes.roundL.adjustBy(all = 4.0.dp)))",
            builderCall,
        )
    }

    private fun mapper(
        dimensionsConfig: DimensionsConfig,
        importCollector: ImportCollector = mockk(relaxed = true),
        dimensAggregator: DimensAggregator = mockk(relaxed = true),
        resourceReferenceProvider: ResourceReferenceProvider = mockk(relaxed = true),
        stateEnum: StateEnum? = null,
    ) = ShapePropertyMapper(
        stateEnum = stateEnum,
        importCollector = importCollector,
        themeClassName = "TestTheme",
        dimensAggregator = dimensAggregator,
        dimensionsConfig = dimensionsConfig,
        resourceReferenceProvider = resourceReferenceProvider,
        componentXmlPrefix = "test",
    )

    private fun shapeParam(methodName: String) = ShapePropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}

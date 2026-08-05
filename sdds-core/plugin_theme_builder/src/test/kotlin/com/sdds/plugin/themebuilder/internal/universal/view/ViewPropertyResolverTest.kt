package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.Dimension
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.asVariationTree
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalChildVariation
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalViewVariation
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ViewPropertyResolverTest {

    private val resolver = ViewPropertyResolver()
    private val heightProperty = MetaDimensionProperty(
        PropertyMeta(
            id = "height",
            attrName = "android:minHeight",
            type = PropertyType.DIMENSION,
            resSuffix = "min_height",
        ),
    )

    @Test
    fun `свойство дочерней вариации наследуется от родителя`() {
        val child = variationTree(parentProps = props("height" to 48f))

        val result = resolver.getProperty(heightProperty, child)

        assertTrue(result is SingleValue<Dimension>)
        result as SingleValue<Dimension>
        assertEquals(48f, result.value.value)
        assertTrue(result.inherited)
    }

    @Test
    fun `свойство дочерней вариации переопределяет значение родителя`() {
        val child = variationTree(
            parentProps = props("height" to 48f),
            childProps = props("height" to 56f),
        )

        val result = resolver.getProperty(heightProperty, child)

        assertTrue(result is SingleValue<Dimension>)
        result as SingleValue<Dimension>
        assertEquals(56f, result.value.value)
        assertFalse(result.inherited)
    }

    @Test
    fun `частичный override view сохраняет остальные значения родителя`() {
        val child = variationTree(
            parentViews = mapOf(
                "default" to view("height" to 48f),
                "warning" to view("height" to 52f),
            ),
            childViews = mapOf("default" to view("height" to 56f)),
        )

        val result = resolver.getProperty(heightProperty, child)

        assertTrue(result is ViewStateValue<Dimension>)
        result as ViewStateValue<Dimension>
        assertEquals(
            mapOf(
                "default" to Dimension(56f),
                "warning" to Dimension(52f),
            ),
            result.values,
        )
    }

    private fun variationTree(
        parentProps: UniversalPropertyOwner = props(),
        childProps: UniversalPropertyOwner = props(),
        parentViews: Map<String, UniversalViewVariation> = emptyMap(),
        childViews: Map<String, UniversalViewVariation> = emptyMap(),
    ): VariationNode<UniversalPropertyOwner> {
        val config = UniversalComponentConfig(
            variations = listOf(
                UniversalChildVariation(
                    id = "m",
                    props = parentProps,
                    view = parentViews,
                ),
                UniversalChildVariation(
                    id = "m.brand",
                    parent = "m",
                    props = childProps,
                    view = childViews,
                ),
            ),
        )
        return config.asVariationTree("")
            .children.single()
            .children.single()
    }

    private fun view(vararg dimensions: Pair<String, Float>): UniversalViewVariation =
        UniversalViewVariation(props = props(*dimensions))

    private fun props(vararg dimensions: Pair<String, Float>): UniversalPropertyOwner =
        UniversalPropertyOwner(
            buildJsonObject {
                dimensions.forEach { (name, value) ->
                    putJsonObject(name) {
                        put("value", value)
                    }
                }
            },
        )
}

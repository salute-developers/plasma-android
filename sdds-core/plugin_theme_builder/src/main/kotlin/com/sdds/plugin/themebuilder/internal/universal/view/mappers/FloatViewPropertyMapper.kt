package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.FloatState
import com.sdds.plugin.themebuilder.internal.universal.FloatValue
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.MetaFloatProperty
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.SingleValue
import com.sdds.plugin.themebuilder.internal.universal.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.universal.view.ViewPropertyResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStateResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStateValue
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import com.sdds.plugin.themebuilder.internal.universal.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.universal.view.isStateful
import org.w3c.dom.Element

internal class FloatViewPropertyMapper(
    override val meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
    private val resolver: ViewPropertyResolver,
    private val stateResolver: ViewStateResolver,
) : ViewPropertyMapper {
    private val property = MetaFloatProperty(meta)

    override fun map(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        val value = resolver.getProperty(property, variationNode)
        if (value.isNullOrInherited) return
        when (value) {
            null -> return
            is SingleValue<FloatValue> -> {
                if (value.isStateful) {
                    resources.addFloatToStateList(
                        property,
                        value.value,
                        variation,
                        extraStateAttrsBuilder = ::stateAttrs,
                    )
                } else {
                    resources.appendValue(element, property.attribute, value.value.value.toString())
                    return
                }
            }
            is ViewStateValue<FloatValue> -> value.values.forEach { (colorStateName, floatValue) ->
                resources.addFloatToStateList(
                    property,
                    floatValue,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = ::stateAttrs,
                )
            }
        }
        with(resources) { element.valueListAttribute(property, variation) }
    }

    override fun mapDirect(
        element: Element,
        variation: String,
        props: UniversalPropertyOwner,
    ) {
        property.provide(props)?.let { resources.appendValue(element, property.attribute, it.value.toString()) }
    }

    private fun stateAttrs(state: FloatState): Set<StateListAttribute> =
        stateResolver.resolve(state.state)
}

package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Typography
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.MetaTypographyProperty
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

internal class TypographyViewPropertyMapper(
    override val meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
    private val resolver: ViewPropertyResolver,
    private val stateResolver: ViewStateResolver,
) : ViewPropertyMapper {
    private val property = MetaTypographyProperty(meta)

    override fun map(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        val value = resolver.getProperty(property, variationNode)
        if (value.isNullOrInherited) return
        when (value) {
            null -> return
            is SingleValue<Typography> -> {
                if (value.isStateful) {
                    resources.addTypographyToStateList(
                        property,
                        value.value,
                        variation,
                        extraStateAttrsBuilder = ::stateAttrs,
                    )
                } else {
                    resources.appendTypography(element, property.attribute, value.value.value)
                    return
                }
            }
            is ViewStateValue<Typography> -> value.values.forEach { (colorStateName, typography) ->
                resources.addTypographyToStateList(
                    property,
                    typography,
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
        property.provide(props)?.let { resources.appendTypography(element, property.attribute, it.value) }
    }

    private fun stateAttrs(state: StringState): Set<StateListAttribute> =
        stateResolver.resolve(state.state)
}

package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.FloatValue
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.State
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.ColorValue
import com.sdds.plugin.themebuilder.internal.universal.view.MetaColorProperty
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.universal.view.ViewPropertyResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStateResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import com.sdds.plugin.themebuilder.internal.universal.view.hasGradients
import com.sdds.plugin.themebuilder.internal.universal.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.universal.view.isStateful
import org.w3c.dom.Element

internal class ColorViewPropertyMapper(
    override val meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
    private val resolver: ViewPropertyResolver,
    private val stateResolver: ViewStateResolver,
) : ViewPropertyMapper {
    private val property = MetaColorProperty(meta)
    private val alphaProperties = meta.stateValues
        .filter { it.kind == STATE_VALUE_ALPHA }
        .associate { it.configKey to MetaColorProperty(meta, it.configKey) }

    override fun map(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        val underState = stateColorEntries(variationNode)
        if (underState.isEmpty()) {
            mapBase(element, variation, variationNode)
            return
        }

        val colorValue = resolver.getColorProperty(property, variationNode)
        if (colorValue.isNullOrInherited) return

        underState.forEach { entry ->
            resources.addToStateList(
                property,
                entry.color,
                variation,
                entry.colorStateName,
                extraAttrs = entry.attrs,
                extraStateAttrsBuilder = ::stateAttrs,
            )
        }
        when (colorValue) {
            is ColorValue.SimpleValue ->
                resources.addToStateList(
                    property,
                    colorValue.color,
                    variation,
                    extraStateAttrsBuilder = ::stateAttrs,
                )
            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                resources.addToStateList(
                    property,
                    color,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = ::stateAttrs,
                )
            }
            else -> Unit
        }
        appendStateListReference(element, variation, colorValue)
    }

    override fun mapDirect(
        element: Element,
        variation: String,
        props: UniversalPropertyOwner,
    ) = Unit

    private fun mapBase(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) {
        val colorValue = resolver.getColorProperty(property, variationNode)
        if (colorValue.isNullOrInherited) return

        when (colorValue) {
            is ColorValue.SimpleValue -> {
                if (colorValue.isStateful) {
                    resources.addToStateList(
                        property,
                        colorValue.color,
                        variation,
                        extraStateAttrsBuilder = ::stateAttrs,
                    )
                } else {
                    with(resources) {
                        element.colorRefAttribute(property.attribute, colorValue.color.default)
                    }
                    return
                }
            }
            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                resources.addToStateList(
                    property,
                    color,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = ::stateAttrs,
                )
            }
            else -> Unit
        }
        appendStateListReference(element, variation, colorValue)
    }

    private fun appendStateListReference(
        element: Element,
        variation: String,
        colorValue: ColorValue?,
    ) {
        if (colorValue?.hasGradients == true) {
            resources.appendColorValueList(element, property, variation)
        } else {
            resources.appendColorResource(element, property, variation)
        }
    }

    private fun stateColorEntries(
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): List<StateColorEntry> = meta.stateValues.flatMap { stateValue ->
        val attrs = stateResolver.resolve(listOf(stateValue.state))
        when (stateValue.kind) {
            STATE_VALUE_ALIAS -> aliasColors(stateValue.configKey, variationNode)
            STATE_VALUE_ALPHA -> alphaColors(stateValue.configKey, variationNode)
            else -> emptyList()
        }.map { (colorStateName, color) -> StateColorEntry(color, colorStateName, attrs) }
    }

    private fun aliasColors(
        configKey: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): List<Pair<String?, Color>> =
        resolver.getColorProperty(MetaColorProperty(meta.copy(id = configKey)), variationNode).byColorState()

    private fun alphaColors(
        alphaKey: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): List<Pair<String?, Color>> {
        val perOwner = resolver
            .getColorProperty(alphaProperties.getValue(alphaKey), variationNode)
            .byColorState()
        return perOwner.ifEmpty { variationAlphaColors(alphaKey, variationNode) }
    }

    private fun variationAlphaColors(
        alphaKey: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): List<Pair<String?, Color>> {
        val alpha = resolver.getProperty(variationNode) { owner ->
            owner.getValue(PropertyType.FLOAT, alphaKey) as? FloatValue
        }?.value?.value ?: return emptyList()
        return resolver.getColorProperty(property, variationNode)
            .byColorState()
            .map { (colorStateName, color) -> colorStateName to color.copy(alpha = alpha) }
    }

    private fun stateAttrs(state: State<*>): Set<StateListAttribute> =
        stateResolver.resolve(state.state)

    private data class StateColorEntry(
        val color: Color,
        val colorStateName: String?,
        val attrs: Set<StateListAttribute>,
    )

    private fun ColorValue?.byColorState(): List<Pair<String?, Color>> = when (this) {
        is ColorValue.SimpleValue -> listOf(null to color)
        is ColorValue.ViewValue -> colors.map { (colorStateName, color) -> colorStateName to color }
        else -> emptyList()
    }

    private companion object {
        const val STATE_VALUE_ALIAS = "alias"
        const val STATE_VALUE_ALPHA = "alpha"
    }
}

package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.asVariationTree
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import org.w3c.dom.Element
import java.io.File

/**
 *
 * @author Малышев Александр on 10.12.2024
 */
internal abstract class ViewVariationGenerator<PO : PropertyOwner>(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String,
    styleComponentName: String = coreComponentName,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
) : ViewComponentStyleGenerator<Config<PO>>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onGenerate(
        xmlResourcesBuilder: XmlResourcesDocumentBuilder,
        config: Config<PO>,
    ): Unit = with(xmlResourcesBuilder) {
        val rootVariation = config.asVariationTree("")
        baseStyle(withOverlay = rootVariation.children.isEmpty()) {
            onCreateStyle("", xmlResourcesBuilder, this, rootVariation)
        }
        createVariations(rootVariation.children)
    }

    protected abstract fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<PO>,
    )

    protected open fun onCreateOverlayStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<PO>,
    ) = Unit

    protected open fun createColorStateStyles(
        rootDocument: XmlResourcesDocumentBuilder,
        variationNode: VariationNode<PO>,
    ) {
        variationNode.mergedViews(true).keys.mapNotNull {
            getColorState(it)
        }.forEach { colorStateAttr ->
            rootDocument.variationStyle(
                "${variationNode.camelCaseName()}.${colorStateAttr.name.capitalized()}",
                true,
            ) {
                onCreateColorStateStyle(this, variationNode, colorStateAttr)
            }
        }
    }

    protected open fun onCreateColorStateStyle(
        styleElement: Element,
        variationNode: VariationNode<PO>,
        colorStateAttribute: ColorStateAttribute,
    ) = with(styleElement) {
        colorStateAttribute(colorStateAttribute.enum)
    }

    private fun XmlResourcesDocumentBuilder.createVariations(
        variations: Set<VariationNode<PO>>,
    ) {
        if (variations.isEmpty()) return
        variations.forEach { variationNode ->
            variationStyle(
                variationNode.camelCaseName(),
                withOverlay = true,
                overlayContent = {
                    onCreateOverlayStyle(variationNode.id.techToSnakeCase(), this@createVariations, this, variationNode)
                },
            ) {
                onCreateStyle(variationNode.id.techToSnakeCase(), this@createVariations, this, variationNode)
            }
            createColorStateStyles(this, variationNode)
            createVariations(variationNode.children)
        }
    }

    protected fun <P : Any> getProperty(
        variationNode: VariationNode<PO>,
        propertyProvider: (PO) -> P?,
    ): PropertyValue<P>? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        var propertyInherited = false
        val property = propertyProvider(currentProps)
            ?: propertyProvider(mergedProps).also { propertyInherited = true }
        return property?.let { PropertyValue(it, propertyInherited) }
    }

    protected fun getColorProperty(
        colorProperty: ProvidableColorProperty<PO>,
        variationNode: VariationNode<PO>,
    ): ColorValue? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        val currentViewVariations = variationNode.value.view
        val mergedViewVariations = variationNode.mergedViews()
        val overriddenViews = mutableSetOf<String>()
        val colorStates = mutableMapOf<String, Color>()

        currentViewVariations.forEach { (colorStateName, viewVariation) ->
            val viewProps = viewVariation.props

            colorProperty.provide(viewProps)?.let {
                overriddenViews.add(colorStateName)
                colorStates[colorStateName] = it
            }
        }

        if (overriddenViews.isNotEmpty()) {
            mergedViewVariations.forEach { (colorStateName, viewVariation) ->
                if (overriddenViews.contains(colorStateName)) return@forEach
                val mergedViewProps = viewVariation.props
                colorProperty.provide(mergedViewProps)?.let {
                    colorStates[colorStateName] = it
                }
            }
        }

        var invariantColorInherited = false
        val invariantColor = colorProperty.provide(currentProps)
            ?: colorProperty.provide(mergedProps).also { invariantColorInherited = true }

        return when {
            colorStates.isNotEmpty() -> ColorValue.ViewValue(colorStates)
            invariantColor != null -> ColorValue.SimpleValue(invariantColor, invariantColorInherited)
            else -> null
        }
    }

    /**
     * Добавляет [ProvidableColorProperty].
     * Умеет работать с градиентами и цветами. Поддерживает состояния.
     */
    protected fun Element.addColorProperty(
        colorProperty: ProvidableColorProperty<PO>,
        variation: String,
        variationNode: VariationNode<PO>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        if (colorValue.isNullOrInherited) {
            return
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> {
                if (colorValue.isStateful) {
                    addToStateList(colorProperty, colorValue.color, variation)
                } else {
                    colorRefAttribute(colorProperty.attribute, colorValue.color.default)
                    return
                }
            }

            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName)
            }

            else -> {}
        }
        when (colorValue?.type) {
            ColorStateListGenerator.ColorType.COLOR -> colorAttribute(colorProperty, variation)
            ColorStateListGenerator.ColorType.GRADIENT -> colorValueListAttribute(colorProperty, variation)
            else -> {}
        }
    }
}

internal class PropertyValue<T : Any>(val value: T, val inherited: Boolean)

internal sealed class ColorValue {
    data class ViewValue(val colors: Map<String, Color>) : ColorValue()
    data class SimpleValue(val color: Color, val inherited: Boolean) : ColorValue()
}

internal val ColorValue?.isNullOrInherited: Boolean
    get() = this == null || (this is ColorValue.SimpleValue && this.inherited)

internal val ColorValue.isStateful: Boolean
    get() = when (this) {
        // Если массив состояний пуст, но задана альфа, то для SimpleValue понадобиться сгенерировать StateList
        is ColorValue.SimpleValue -> color.states?.isNotEmpty() == true || color.alpha != null
        is ColorValue.ViewValue -> true
    }

internal val ColorValue.type: ColorStateListGenerator.ColorType
    get() = when {
        this is ColorValue.SimpleValue && this.color is SolidColor -> ColorStateListGenerator.ColorType.COLOR
        this is ColorValue.SimpleValue && this.color is Gradient -> ColorStateListGenerator.ColorType.GRADIENT
        this is ColorValue.ViewValue && this.colors.all { it.value is SolidColor } ->
            ColorStateListGenerator.ColorType.COLOR

        else -> ColorStateListGenerator.ColorType.GRADIENT
    }

internal val PropertyValue<*>?.isNullOrInherited: Boolean
    get() = this == null || this.inherited

internal fun VariationNode<*>.camelCaseName(separator: String = "."): String =
    this.id.split(".").joinToString(separator = separator) { it.techToCamelCase() }

internal fun ComponentStyle<*>.camelCaseValue(separator: String = "."): String =
    this.value.split(".").joinToString(separator = separator) { it.techToCamelCase() }

internal fun VariationNode<*>.snakeCaseName(separator: String = "."): String =
    this.id.split(".").joinToString(separator = separator) { it.techToSnakeCase() }

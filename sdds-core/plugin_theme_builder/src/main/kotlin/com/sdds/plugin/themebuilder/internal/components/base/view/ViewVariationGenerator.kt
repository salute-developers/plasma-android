package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
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

    protected open fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<PO>,
    ) {
        onCreateStyle(
            variation,
            rootDocument,
            styleElement,
            variationNode,
            variationNode.value.props,
        )
    }

    protected open fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<PO>,
        props: PO,
    ) {
    }

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
        variationNode.mergedViews(true).mapKeys {
            getColorState(it.key) ?: registerColorState(it.key)
        }.forEach { (colorStateAttr, viewVariation) ->
            rootDocument.variationStyle(
                "${variationNode.camelCaseName()}.${colorStateAttr.name.capitalized()}",
                true,
            ) {
                onCreateStyle(
                    variationNode.id.techToSnakeCase(),
                    rootDocument,
                    this,
                    variationNode,
                    viewVariation.props,
                )
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

    protected fun <P : Stateful<*, *>> getProperty(
        variationNode: VariationNode<PO>,
        propertyProvider: (PO) -> P?,
    ): SingleValue<P>? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        var propertyInherited = false
        val property = propertyProvider(currentProps)
            ?: propertyProvider(mergedProps).also { propertyInherited = true }
        return property?.let { SingleValue(it, propertyInherited) }
    }

    protected fun <Raw : Any, Value : Stateful<out Raw, out State<Raw>>> getProperty(
        property: ProvidableProperty<PO, Raw, Value>,
        variationNode: VariationNode<PO>,
    ): PropertyValue<Value>? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        val currentViewVariations = variationNode.value.view
        val mergedViewVariations = variationNode.mergedViews()
        val overriddenViews = mutableSetOf<String>()
        val colorStates = mutableMapOf<String, Value>()

        currentViewVariations.forEach { (colorStateName, viewVariation) ->
            val viewProps = viewVariation.props

            property.provide(viewProps)?.let {
                overriddenViews.add(colorStateName)
                colorStates[colorStateName] = it
            }
        }

        if (overriddenViews.isNotEmpty()) {
            mergedViewVariations.forEach { (colorStateName, viewVariation) ->
                if (overriddenViews.contains(colorStateName)) return@forEach
                val mergedViewProps = viewVariation.props
                property.provide(mergedViewProps)?.let {
                    colorStates[colorStateName] = it
                }
            }
        }

        var invariantColorInherited = false
        val invariantColor = property.provide(currentProps)
            ?: property.provide(mergedProps).also { invariantColorInherited = true }

        return when {
            colorStates.isNotEmpty() -> ColorStateValue(colorStates)
            invariantColor != null -> SingleValue(invariantColor, invariantColorInherited)
            else -> null
        }
    }

    protected fun getColorProperty(
        colorProperty: ProvidableColorProperty<PO>,
        variationNode: VariationNode<PO>,
    ): ColorValue? {
        return getProperty(colorProperty, variationNode)?.let {
            when (it) {
                is SingleValue<Color> -> ColorValue.SimpleValue(it.value, it.inherited)
                is ColorStateValue<Color> -> ColorValue.ViewValue(it.values)
            }
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
        stateAttrsBuilder: ((ColorState) -> Set<StateListAttribute>)? = null,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        if (colorValue.isNullOrInherited) {
            return
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> {
                if (colorValue.isStateful) {
                    addToStateList(
                        colorProperty,
                        colorValue.color,
                        variation,
                        extraStateAttrsBuilder = stateAttrsBuilder,
                    )
                } else {
                    colorRefAttribute(colorProperty.attribute, colorValue.color.default)
                    return
                }
            }

            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(
                    colorProperty,
                    color,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = stateAttrsBuilder,
                )
            }

            else -> {}
        }
        if (colorValue?.hasGradients == true) {
            colorValueListAttribute(colorProperty, variation)
        } else {
            colorAttribute(colorProperty, variation)
        }
    }

    /**
     * Добавляет [ProvidableProperty] типа [Dimension].
     * Поддерживает состояния.
     */
    protected fun Element.addDimensionProperty(
        property: ProvidableProperty<PO, Float, Dimension>,
        variation: String,
        variationNode: VariationNode<PO>,
        stateAttrsBuilder: ((FloatState) -> Set<StateListAttribute>)? = null,
    ) {
        val propertyValue = getProperty(property, variationNode)
        if (propertyValue.isNullOrInherited) {
            return
        }

        when (propertyValue) {
            is SingleValue<Dimension> -> {
                if (propertyValue.isStateful) {
                    addDimensionToStateList(
                        property,
                        propertyValue.value,
                        variation,
                        extraStateAttrsBuilder = stateAttrsBuilder,
                    )
                } else {
                    dimenAttribute(variation, property.attribute, property.fileSuffix, propertyValue.value.value)
                    return
                }
            }
            is ColorStateValue<Dimension> -> propertyValue.values.forEach { (colorStateName, value) ->
                addDimensionToStateList(
                    property,
                    value,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = stateAttrsBuilder,
                )
            }

            else -> {}
        }
        valueListAttribute(property, variation)
    }

    /**
     * Добавляет [ProvidableProperty] типа [FloatValue]
     * Поддерживает состояния.
     */
    protected fun Element.adFloatProperty(
        property: ProvidableProperty<PO, Float, FloatValue>,
        variation: String,
        variationNode: VariationNode<PO>,
        stateAttrsBuilder: ((FloatState) -> Set<StateListAttribute>)? = null,
    ) {
        val propertyValue = getProperty(property, variationNode)
        if (propertyValue.isNullOrInherited) {
            return
        }

        when (propertyValue) {
            is SingleValue<FloatValue> -> {
                if (propertyValue.isStateful) {
                    addFloatToStateList(
                        property,
                        propertyValue.value,
                        variation,
                        extraStateAttrsBuilder = stateAttrsBuilder,
                    )
                } else {
                    valueAttribute(property.attribute, propertyValue.value.value.toString())
                    return
                }
            }

            is ColorStateValue<FloatValue> -> propertyValue.values.forEach { (colorStateName, value) ->
                addFloatToStateList(
                    property,
                    value,
                    variation,
                    colorStateName,
                    extraStateAttrsBuilder = stateAttrsBuilder,
                )
            }

            else -> {}
        }
        valueListAttribute(property, variation)
    }
}

internal sealed interface PropertyValue<T : Stateful<*, *>>

internal open class ColorStateValue<T : Stateful<*, *>>(open val values: Map<String, T>) : PropertyValue<T>

internal open class SingleValue<T : Stateful<*, *>>(
    val value: T,
    val inherited: Boolean,
) : PropertyValue<T>

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

internal val PropertyValue<*>.isStateful: Boolean
    get() = when (this) {
        is SingleValue<*> -> value.states?.isNotEmpty() == true
        is ColorStateValue<*> -> true
    }

internal val ColorValue.hasGradients: Boolean
    get() = when {
        this is ColorValue.SimpleValue -> this.color is Gradient
        else -> this is ColorValue.ViewValue && this.colors.any { it.value is Gradient }
    }

internal val PropertyValue<*>?.isNullOrInherited: Boolean
    get() = this == null || (this is SingleValue<*> && this.inherited)

internal fun VariationNode<*>.camelCaseName(separator: String = "."): String =
    this.id.split(".").joinToString(separator = separator) { it.techToCamelCase() }

internal fun ComponentStyle<*>.camelCaseValue(separator: String = "."): String =
    this.value.split(".").joinToString(separator = separator) { it.techToCamelCase() }

internal fun VariationNode<*>.snakeCaseName(separator: String = "."): String =
    this.id.split(".").joinToString(separator = separator) { it.techToSnakeCase() }

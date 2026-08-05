package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.Stateful
import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner

/**
 * Разрешает значение View-свойства с учётом наследования вариаций и `view`-веток.
 *
 * Обход и создание стилей выполняет [ViewVariationTreeProcessor], а этот класс
 * предоставляет единые правила чтения значений для property mapper'ов.
 */
internal class ViewPropertyResolver {

    internal fun <P : Stateful<*, *>> getProperty(
        variationNode: VariationNode<UniversalPropertyOwner>,
        propertyProvider: (UniversalPropertyOwner) -> P?,
    ): SingleValue<P>? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        var propertyInherited = false
        val property = propertyProvider(currentProps)
            ?: propertyProvider(mergedProps).also { propertyInherited = true }
        return property?.let { SingleValue(it, propertyInherited) }
    }

    internal fun <Value : Stateful<*, *>> getProperty(
        property: ViewProperty<Value>,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): PropertyValue<Value>? {
        val currentProps = variationNode.value.props
        val mergedProps = variationNode.mergedProps
        val currentViewVariations = variationNode.value.view
        val mergedViewVariations = variationNode.mergedViews()
        val overriddenViews = mutableSetOf<String>()
        val colorStates = mutableMapOf<String, Value>()

        currentViewVariations.forEach { (colorStateName, viewVariation) ->
            property.provide(viewVariation.props)?.let {
                overriddenViews.add(colorStateName)
                colorStates[colorStateName] = it
            }
        }

        if (overriddenViews.isNotEmpty()) {
            mergedViewVariations.forEach { (colorStateName, viewVariation) ->
                if (overriddenViews.contains(colorStateName)) return@forEach
                property.provide(viewVariation.props)?.let {
                    colorStates[colorStateName] = it
                }
            }
        }

        var invariantValueInherited = false
        val invariantValue = property.provide(currentProps)
            ?: property.provide(mergedProps).also { invariantValueInherited = true }

        return when {
            colorStates.isNotEmpty() -> ViewStateValue(colorStates)
            invariantValue != null -> SingleValue(invariantValue, invariantValueInherited)
            else -> null
        }
    }

    internal fun getColorProperty(
        property: ViewColorProperty,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ): ColorValue? {
        return getProperty(property, variationNode)?.let {
            when (it) {
                is SingleValue<Color> -> ColorValue.SimpleValue(it.value, it.inherited)
                is ViewStateValue<Color> -> ColorValue.ViewValue(it.values)
            }
        }
    }
}

internal sealed interface PropertyValue<T : Stateful<*, *>>

internal data class ViewStateValue<T : Stateful<*, *>>(
    val values: Map<String, T>,
) : PropertyValue<T>

internal data class SingleValue<T : Stateful<*, *>>(
    val value: T,
    val inherited: Boolean,
) : PropertyValue<T>

internal sealed interface ColorValue {
    data class ViewValue(val colors: Map<String, Color>) : ColorValue
    data class SimpleValue(val color: Color, val inherited: Boolean) : ColorValue
}

internal val ColorValue?.isNullOrInherited: Boolean
    get() = this == null || (this is ColorValue.SimpleValue && this.inherited)

internal val ColorValue.isStateful: Boolean
    get() = when (this) {
        // Если массив состояний пуст, но задана альфа, для SimpleValue нужен StateList.
        is ColorValue.SimpleValue -> color.states?.isNotEmpty() == true || color.alpha != null
        is ColorValue.ViewValue -> true
    }

internal val PropertyValue<*>.isStateful: Boolean
    get() = when (this) {
        is SingleValue<*> -> value.states?.isNotEmpty() == true
        is ViewStateValue<*> -> true
    }

/**
 * Есть ли среди значений цвета градиент — в том числе под состоянием.
 *
 * Градиент нельзя положить в `ComplexColor`-селектор (`res/color`): атрибут темы
 * указывает на drawable, и парсер ресурсов падает. Такие значения собираются в
 * `res/xml` как `color-selector` uikit'а.
 */
internal val ColorValue.hasGradients: Boolean
    get() = when (this) {
        is ColorValue.SimpleValue -> color.hasGradients
        is ColorValue.ViewValue -> colors.any { it.value.hasGradients }
    }

internal val PropertyValue<*>?.isNullOrInherited: Boolean
    get() = this == null || (this is SingleValue<*> && this.inherited)

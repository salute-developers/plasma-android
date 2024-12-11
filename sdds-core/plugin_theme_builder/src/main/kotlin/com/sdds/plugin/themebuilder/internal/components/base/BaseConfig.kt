package com.sdds.plugin.themebuilder.internal.components.base

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 09.12.2024
 */

internal interface PropertyOwner

internal interface ViewVariation<PO : PropertyOwner> {
    val props: PO
}

internal interface BaseVariation<PO : PropertyOwner> : ViewVariation<PO>  {
    val view: Map<String, ViewVariation<PO>>
}

internal interface Variation<PO : PropertyOwner> : BaseVariation<PO>{

    val id: String

    val parent: String?

    val childVariations: Map<String, Variation<PO>>
}

internal interface Config<PO: PropertyOwner> : BaseVariation<PO>, ComponentConfig {

    val variations: List<Variation<PO>>
}

internal fun <PO : PropertyOwner> Config<PO>.asVariationTree(): Variation<PO> {
    this.variations.groupBy {

    }
}

@Serializable
internal data class Shape(
    val value: String,
    val adjustment: Float? = null,
)

@Serializable
internal data class Typography(
    val value: String,
)

@Serializable
internal data class ComponentStyle(
    val value: String,
)

@Serializable
internal data class Dimension(
    val value: Float,
)

@Serializable
internal data class Value(
    val value: String,
)

@Serializable
internal data class Color(
    val default: String,
    val states: List<ColorState>? = null,
)

@Serializable
internal data class ColorState(
    val state: List<String>,
    val value: String,
)
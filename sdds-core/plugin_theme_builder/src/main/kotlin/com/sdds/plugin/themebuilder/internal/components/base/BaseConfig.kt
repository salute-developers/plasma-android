package com.sdds.plugin.themebuilder.internal.components.base

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import kotlinx.serialization.Serializable

/**
 * Интерфейс сущности со свойствами компонента
 * @author Малышев Александр on 09.12.2024
 */
internal interface PropertyOwner {

    /**
     * Совмещает свойства текущего объекта со свойствами [parent] и возвращает
     * новый [PropertyOwner]
     */
    fun merge(parent: PropertyOwner): PropertyOwner
}

/**
 * Вариации представлений компонента
 */
internal interface ViewVariation<PO : PropertyOwner> {

    /**
     * Свойства вариации
     */
    val props: PO

    /**
     * Совмещает свойства текущего объекта со свойствами [parent] и возвращает
     * новый [ViewVariation]
     */
    fun merge(parent: ViewVariation<PO>): ViewVariation<PO> = this
}

/**
 * Интерфейс базовой вариации компонента
 * @see ViewVariation
 */
internal interface BaseVariation<PO : PropertyOwner> : ViewVariation<PO> {

    /**
     * Вариации представления компонента
     */
    val view: Map<String, ViewVariation<PO>>
}

/**
 * Интерфейс дочерней вариации. Может иметь родителя.
 */
internal interface ChildVariation<PO : PropertyOwner> : BaseVariation<PO> {
    val id: String
    val parent: String?
}

/**
 * Конфигурация компонента
 */
internal interface Config<PO : PropertyOwner> : BaseVariation<PO>, ComponentConfig {

    val variations: List<ChildVariation<PO>>
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
    val alpha: Float? = null,
    val states: List<ColorState>? = null,
)

@Serializable
internal data class ColorState(
    val state: List<String>,
    val value: String,
    val alpha: Float? = null,
)

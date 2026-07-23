package com.sdds.compose.uikit.graphics

import androidx.compose.foundation.Indication
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape

/**
 * CompositionLocal для переопределения [Indication] в кликабельных компонентах UIKit.
 */
val LocalIndication: ProvidableCompositionLocal<Indication?> = staticCompositionLocalOf { null }

/**
 * [Indication], который может быть адаптирован под форму компонента.
 */
interface ShapeableIndication {

    /**
     * Возвращает [Indication], ограниченный переданной [shape].
     */
    fun withShape(shape: Shape): Indication
}

/**
 * Адаптирует [Indication] под [shape], если он поддерживает [ShapeableIndication].
 */
@Composable
fun Indication?.maybeShapeable(shape: Shape): Indication? =
    if (this is ShapeableIndication) {
        remember(this, shape) { withShape(shape) }
    } else {
        this
    }

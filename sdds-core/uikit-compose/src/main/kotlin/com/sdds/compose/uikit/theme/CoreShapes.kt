@file:Suppress("LongMethod", "LongParameterList", "UndocumentedPublicProperty", "UnnecessaryAbstractClass")

package com.sdds.compose.uikit.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

/**
 * Контракт форм (скруглений) SDDS
 * @author Малышев Александр on 04.04.2024
 */
@Immutable
abstract class CoreShapes {
    abstract val roundXxs: CornerBasedShape
    abstract val roundXs: CornerBasedShape
    abstract val roundS: CornerBasedShape
    abstract val roundM: CornerBasedShape
    abstract val roundL: CornerBasedShape
    abstract val roundXl: CornerBasedShape
    abstract val roundXxl: CornerBasedShape
    abstract val circle: CornerBasedShape
}

/**
 * CompositionLocal с формами (скруглениями)
 */
val LocalShapes = staticCompositionLocalOf { debugShapes() }

private fun debugShapes(): CoreShapes =
    CoreShapesImpl(
        roundXxs = RoundedCornerShape(10.dp),
        roundXs = RoundedCornerShape(10.dp),
        roundS = RoundedCornerShape(10.dp),
        roundM = RoundedCornerShape(10.dp),
        roundL = RoundedCornerShape(10.dp),
        roundXl = RoundedCornerShape(10.dp),
        roundXxl = RoundedCornerShape(10.dp),
        circle = RoundedCornerShape(10.dp),
    )

private class CoreShapesImpl(
    override val roundXxs: CornerBasedShape,
    override val roundXs: CornerBasedShape,
    override val roundS: CornerBasedShape,
    override val roundM: CornerBasedShape,
    override val roundL: CornerBasedShape,
    override val roundXl: CornerBasedShape,
    override val roundXxl: CornerBasedShape,
    override val circle: CornerBasedShape,
) : CoreShapes()

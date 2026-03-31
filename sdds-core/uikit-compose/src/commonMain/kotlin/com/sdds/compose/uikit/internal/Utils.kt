package com.sdds.compose.uikit.internal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.unit.LayoutDirection
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

/**
 * Рассчитывает линейную интерполяцию между значениями [a] в [b]
 */
internal fun lerp(a: Float, b: Float, fraction: Float): Float {
    return a * (1f - fraction) + (b * fraction)
}

/**
 * Модификатор для отрисовки [block] на нативном канвасе
 */
internal fun Modifier.drawWithLayer(block: ContentDrawScope.() -> Unit) = this.then(
    Modifier.drawWithContent {
        drawWithLayer {
            block()
        }
    },
)

/**
 * Рисует [block] на нативном канвасе
 */
internal fun ContentDrawScope.drawWithLayer(block: ContentDrawScope.() -> Unit) {
    with(drawContext.canvas.nativeCanvas) {
        val checkPoint = saveLayer(null, null)
        block()
        restoreToCount(checkPoint)
    }
}

internal fun Placeable?.widthOrZero(): Int = this?.width ?: 0
internal fun Placeable?.heightOrZero(): Int = this?.height ?: 0

internal operator fun PaddingValues.plus(other: PaddingValues): PaddingValues = PaddingValues(
    start = this.calculateStartPadding(LayoutDirection.Ltr) +
        other.calculateStartPadding(LayoutDirection.Ltr),
    top = this.calculateTopPadding() + other.calculateTopPadding(),
    end = this.calculateEndPadding(LayoutDirection.Ltr) +
        other.calculateEndPadding(LayoutDirection.Ltr),
    bottom = this.calculateBottomPadding() + other.calculateBottomPadding(),
)

/**
 * Используется для перегрузки clickable, когда нужно занулить indication и
 * нет необходимости в источнике взаимодействий
 */
private val DummyInteractionSource = object : MutableInteractionSource {
    override val interactions: Flow<Interaction> = emptyFlow()
    override suspend fun emit(interaction: Interaction) = Unit
    override fun tryEmit(interaction: Interaction) = false
}

internal fun Modifier.clickableWithoutIndication(onClick: () -> Unit): Modifier =
    this.clickable(indication = null, interactionSource = DummyInteractionSource) { onClick.invoke() }

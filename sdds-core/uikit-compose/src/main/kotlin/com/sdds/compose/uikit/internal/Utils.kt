package com.sdds.compose.uikit.internal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

/**
 * Переводит Int пиксели в dp
 */
@Composable
internal fun Int.toDp(): Dp {
    return with(LocalDensity.current) {
        this@toDp.toDp()
    }
}

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

internal object DefaultVerticalArrangement : Arrangement.Vertical {
    override fun Density.arrange(
        totalSize: Int,
        sizes: IntArray,
        outPositions: IntArray,
    ) = Unit
}

/**
 * Используется для передачи в функции как дефолтное значение параметра
 * типа Shape. Необходимо для понимания, было ли передано какое то значение пользователем.
 */
internal object UnspecifiedShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline = Outline.Rectangle(Rect.Zero)
}

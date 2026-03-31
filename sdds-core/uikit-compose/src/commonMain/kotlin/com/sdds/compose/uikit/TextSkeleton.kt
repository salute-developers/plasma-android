package com.sdds.compose.uikit

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import kotlin.random.Random

/**
 * Компонент TextSkeleton
 *
 * Представляет собой несколько прямоугольных областей с формой [shape],
 * внутри которых бесконечно перемещается градиент [brush].
 * Чтобы синхронизировать несколько [TextSkeleton], нужно передать одинаковый [transition]
 *
 * @param modifier модификатор компонента
 * @param style стиль компонента
 * @param duration время в мс, за которое градиент перемещается через всю ширину компонента
 * @param brush градиент шиммера
 * @param shape форма компонента
 * @param textStyle стиль текста, который определяет высоту строк и межстрочное расстояние
 * @param lineWidthProvider провайдер ширины строк [SkeletonLineWidthProvider]
 * @param transition менеджер анимации
 * @see SkeletonLineWidthProvider.RandomDeviation
 * @see SkeletonLineWidthProvider.FillMaxWidth
 */
@Composable
fun TextSkeleton(
    modifier: Modifier = Modifier,
    style: TextSkeletonStyle = LocalTextSkeletonStyle.current,
    lineCount: Int = 3,
    textStyle: TextStyle = style.textStyle,
    lineWidthProvider: SkeletonLineWidthProvider = SkeletonLineWidthProvider.RandomDeviation(),
    duration: Int = style.duration,
    brush: Brush = style.gradient.getDefaultValue(),
    shape: Shape = style.shape,
    transition: InfiniteTransition = rememberInfiniteTransition(),
) {
    if (lineCount < 1) throw IllegalStateException("RectSkeleton: line count must be greater than 0")
    val textSize = with(LocalDensity.current) { textStyle.fontSize.toDp() }
    val alignment = remember(textStyle) { textStyle.lineHeightStyle?.alignment.toContentAlignment() }
    val lineHeight = with(LocalDensity.current) { textStyle.lineHeight.toDp() }
    Column(modifier = modifier) {
        for (lineIndex in 0 until lineCount) {
            Box(
                modifier = Modifier.height(lineHeight),
                contentAlignment = alignment,
            ) {
                RectSkeleton(
                    modifier = Modifier
                        .height(textSize)
                        .fillMaxWidth(fraction = lineWidthProvider.widthFactor(lineIndex, lineCount)),
                    duration = duration,
                    brush = brush,
                    shape = shape,
                    transition = transition,
                )
            }
        }
    }
}

/**
 * Предоставлет ширину строки в [TextSkeleton]
 */
interface SkeletonLineWidthProvider {

    /**
     * Предоставлет ширину строки под индексом [lineIndex], как процент от ширины компонента
     *
     * @param lineIndex номер строки
     * @param lineCount количество строк
     */
    fun widthFactor(lineIndex: Int, lineCount: Int): Float

    /**
     * Всегда возвращает ширину строки равную ширине компонента
     */
    object FillMaxWidth : SkeletonLineWidthProvider {
        override fun widthFactor(lineIndex: Int, lineCount: Int): Float = 1f
    }

    /**
     * Возвращает ширину строки [lineWidth] от ширины компонента + псевдослучайное отклонение [lineWidthDeviation].
     * Для последней строки вернет [lastLineWidth] от ширины компонента + псевдослучайное отклонение [lastLineWidthDeviation]
     */
    class RandomDeviation(
        private val lineWidth: Float = 0.9f,
        private val lineWidthDeviation: Float = 0.05f,
        private val lastLineWidth: Float = 0.5f,
        private val lastLineWidthDeviation: Float = 0.15f,
        private val random: Random = Random(seed = 123456789),
    ) : SkeletonLineWidthProvider {

        override fun widthFactor(lineIndex: Int, lineCount: Int): Float {
            val result = if (lineIndex != lineCount - 1) {
                lineWidth + randomFloatInRange(-lineWidthDeviation, lineWidthDeviation)
            } else {
                lastLineWidth + randomFloatInRange(-lastLineWidthDeviation, lastLineWidthDeviation)
            }
            return result
        }

        private fun randomFloatInRange(min: Float, max: Float): Float {
            val randomF = random.nextFloat()
            return min + randomF * (max - min)
        }
    }
}

private fun LineHeightStyle.Alignment?.toContentAlignment(): Alignment {
    return when (this) {
        LineHeightStyle.Alignment.Top -> Alignment.TopCenter
        LineHeightStyle.Alignment.Bottom -> Alignment.BottomCenter
        else -> Alignment.Center
    }
}

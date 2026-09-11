package com.sdds.plasma.homeds.components.bubble

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

/**
 * Силуэт «пухлой» 4-конечной звезды-бейджа триггера апсейл-бабла и его декоративной обводки —
 * точные абсолютные координаты пути из Figma-макета, масштабируемые под фактический размер.
 * Путь описан в системе координат 32×32.
 */
internal object BubbleStarFourShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        val scale = size.width / VIEWPORT_SIZE
        val path = Path().apply {
            moveTo(10.3273f * scale, 3.66236f * scale)
            cubicTo(
                12.5328f * scale,
                -1.22079f * scale,
                19.4672f * scale,
                -1.22079f * scale,
                21.6727f * scale,
                3.66236f * scale,
            )
            lineTo(22.7785f * scale, 6.11086f * scale)
            cubicTo(
                23.4022f * scale,
                7.49179f * scale,
                24.5082f * scale,
                8.59779f * scale,
                25.8891f * scale,
                9.22148f * scale,
            )
            lineTo(28.3376f * scale, 10.3273f * scale)
            cubicTo(
                33.2208f * scale,
                12.5328f * scale,
                33.2208f * scale,
                19.4672f * scale,
                28.3376f * scale,
                21.6727f * scale,
            )
            lineTo(25.8891f * scale, 22.7785f * scale)
            cubicTo(
                24.5082f * scale,
                23.4022f * scale,
                23.4022f * scale,
                24.5082f * scale,
                22.7785f * scale,
                25.8891f * scale,
            )
            lineTo(21.6727f * scale, 28.3376f * scale)
            cubicTo(
                19.4672f * scale,
                33.2208f * scale,
                12.5328f * scale,
                33.2208f * scale,
                10.3273f * scale,
                28.3376f * scale,
            )
            lineTo(9.22148f * scale, 25.8891f * scale)
            cubicTo(
                8.59779f * scale,
                24.5082f * scale,
                7.49179f * scale,
                23.4022f * scale,
                6.11086f * scale,
                22.7785f * scale,
            )
            lineTo(3.66236f * scale, 21.6727f * scale)
            cubicTo(
                -1.22079f * scale,
                19.4672f * scale,
                -1.22079f * scale,
                12.5328f * scale,
                3.66236f * scale,
                10.3273f * scale,
            )
            lineTo(6.11086f * scale, 9.22148f * scale)
            cubicTo(
                7.49179f * scale,
                8.59779f * scale,
                8.59779f * scale,
                7.49179f * scale,
                9.22148f * scale,
                6.11086f * scale,
            )
            close()
        }
        return Outline.Generic(path)
    }
}

private const val VIEWPORT_SIZE = 32f

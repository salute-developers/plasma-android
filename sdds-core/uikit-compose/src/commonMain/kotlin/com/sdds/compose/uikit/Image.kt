package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image as FoundationImage

/**
 * Размещает и рисует предоставленный [painter]
 *
 * @param painter экземпляр [Painter]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param alignment режим размещения контента
 * @param contentScale режим вписывания контента
 * @param alpha прозрачность, которая будет применена к [painter]
 * @param colorFilter фильтр цвета
 */
@Composable
@NonRestartableComposable
fun Image(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null,
) {
    FoundationImage(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
    )
}

/**
 * Размещает и рисует предоставленный [imageVector]
 *
 * @param imageVector объект [ImageVector], который будет нарисован
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param alignment режим размещения контента
 * @param contentScale режим вписывания контента
 * @param alpha прозрачность, которая будет применена к [imageVector]
 * @param colorFilter фильтр цвета
 */
@Composable
@NonRestartableComposable
fun Image(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null,
) {
    FoundationImage(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
    )
}

/**
 * Размещает и рисует предоставленный [bitmap]
 *
 * @param bitmap объект [ImageBitmap], который будет нарисован
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param alignment режим размещения контента
 * @param contentScale режим вписывания контента
 * @param alpha прозрачность, которая будет применена к [bitmap]
 * @param colorFilter фильтр цвета
 * @param filterQuality алгоритм семплирования [bitmap] при ее масштабировании
 */
@Composable
@NonRestartableComposable
fun Image(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null,
    filterQuality: FilterQuality = DrawScope.DefaultFilterQuality,
) {
    FoundationImage(
        bitmap = bitmap,
        contentDescription = contentDescription,
        modifier = modifier,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
        filterQuality = filterQuality,
    )
}

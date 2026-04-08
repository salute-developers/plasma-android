package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.internal.icon.BaseIcon

/**
 * Иконка. Рисует предоставленный [painter]
 *
 * @param painter экземпляр [Painter]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 * @param contentScale правило скейлинга
 * @param brush поставщик кисти для отрисовки иконки. Имеет приоритет над [tint]
 */
@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
    contentScale: ContentScale = ContentScale.Fit,
    brush: BrushProducer? = LocalTintBrushProducer.current,
) {
    BaseIcon(
        source = { painter },
        contentDescription = contentDescription,
        modifier = modifier,
        brushProducer = brush ?: BrushProducer { tint.asBrush() },
        contentScale = contentScale,
    )
}

/**
 * Иконка. Рисует предоставленный [imageVector]
 *
 * @param imageVector экземпляр [ImageVector]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 * @param contentScale правило скейлинга
 * @param brush поставщик кисти для отрисовки иконки. Имеет приоритет над [tint]
 */
@Composable
@NonRestartableComposable
fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
    contentScale: ContentScale = ContentScale.Fit,
    brush: BrushProducer? = LocalTintBrushProducer.current,
) {
    Icon(
        painter = rememberVectorPainter(imageVector),
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
        contentScale = contentScale,
        brush = brush,
    )
}

/**
 * Иконка. Рисует предоставленный [bitmap]
 *
 * @param bitmap экземпляр [ImageBitmap]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 * @param contentScale правило скейлинга
 * @param brush поставщик кисти для отрисовки иконки. Имеет приоритет над [tint]
 */
@Composable
@NonRestartableComposable
fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
    contentScale: ContentScale = ContentScale.Fit,
    brush: BrushProducer? = LocalTintBrushProducer.current,
) {
    val painter = remember(bitmap) { BitmapPainter(bitmap) }
    Icon(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
        contentScale = contentScale,
        brush = brush,
    )
}

/**
 * Иконка. Рисует предоставленный [source] с использованием [fillStyleProducer].
 *
 * @param source источник изображения
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param brush поставщик кисти для отрисовки иконки
 * @param contentScale правило скейлинга
 */
@Composable
@NonRestartableComposable
fun Icon(
    source: ImageSource,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    brush: BrushProducer? = LocalTintBrushProducer.current,
    contentScale: ContentScale = ContentScale.Fit,
) {
    BaseIcon(
        source = source,
        contentDescription = contentDescription,
        modifier = modifier,
        brushProducer = brush,
        contentScale = contentScale,
    )
}

/**
 * CompositionLocal, содержащий предпочтительный [Color],
 * который будет использоваться компонентами [Icon] по умолчанию.
 */
@Deprecated(
    "Use LocalTintBrushProducer",
    replaceWith = ReplaceWith(
        "LocalTintBrushProducer",
        imports = arrayOf("com.sdds.compose.uikit.LocalTintBrushProducer"),
    ),
)
val LocalTint = compositionLocalOf { Color.Gray }

/**
 * CompositionLocal, содержащий заливку [BrushProducer],
 * который будет использоваться компонентами [Icon] по умолчанию.
 */
val LocalTintBrushProducer = compositionLocalOf<BrushProducer?> { null }

/**
 * CompositionLocal, содержащий предпочтительный размер [DpSize],
 * который будет использоваться компонентами [Icon] по умолчанию.
 */
val LocalIconDefaultSize = compositionLocalOf { DpSize.Unspecified }

/**
 * Источник изображения для компонента [Icon].
 *
 * Позволяет отложенно получить [Painter] из различных типов источников.
 */
@Stable
fun interface ImageSource {

    /**
     * Возвращает [Painter] для отрисовки изображения.
     */
    @Composable
    fun painter(): Painter
}

/**
 * Создает [ImageSource] на основе drawable-ресурса.
 *
 * @param id идентификатор drawable-ресурса
 */
@Composable
fun resourceImageSource(@DrawableRes id: Int): ImageSource {
    return ImageSource { painterResource(id) }
}

/**
 * Создает [ImageSource] на основе [ImageVector].
 *
 * @param imageVector векторное изображение
 */
@Composable
fun imageVectorSource(imageVector: ImageVector): ImageSource {
    return ImageSource { rememberVectorPainter(imageVector) }
}

/**
 * Создает [ImageSource] на основе [ImageBitmap].
 *
 * @param bitmap растровое изображение
 */
@Composable
fun bitmapSource(bitmap: ImageBitmap): ImageSource {
    return ImageSource { remember(bitmap) { BitmapPainter(bitmap) } }
}

package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.DpSize

/**
 * Иконка. Рисует предоставленный [painter]
 *
 * @param painter экземпляр [Painter]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 */
@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
) {
    val colorFilter = if (tint == Color.Unspecified) null else ColorFilter.tint(tint)
    val semantics = if (contentDescription != null) {
        Modifier.semantics {
            this.contentDescription = contentDescription
            this.role = Role.Image
        }
    } else {
        Modifier
    }
    Box(
        modifier
            .toolingGraphicsLayer()
            .defaultSizeFor(painter, LocalIconDefaultSize.current)
            .paint(
                painter = painter,
                colorFilter = colorFilter,
                contentScale = ContentScale.Fit,
            )
            .then(semantics),
    )
}

/**
 * Иконка. Рисует предоставленный [imageVector]
 *
 * @param imageVector экземпляр [ImageVector]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 */
@Composable
@NonRestartableComposable
fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
) {
    Icon(
        painter = rememberVectorPainter(imageVector),
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
    )
}

/**
 * Иконка. Рисует предоставленный [bitmap]
 *
 * @param bitmap экземпляр [ImageBitmap]
 * @param contentDescription описание содержимого контента
 * @param modifier модификатор
 * @param tint цвет иконки
 */
@Composable
@NonRestartableComposable
fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalTint.current,
) {
    val painter = remember(bitmap) { BitmapPainter(bitmap) }
    Icon(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
    )
}

/**
 * CompositionLocal, содержащий предпочтительный [Color],
 * который будет использоваться компонентами [Icon] по умолчанию.
 */
val LocalTint = compositionLocalOf { Color.Gray }

/**
 * CompositionLocal, содержащий предпочтительный размер [DpSize],
 * который будет использоваться компонентами [Icon] по умолчанию.
 */
val LocalIconDefaultSize = compositionLocalOf { DpSize.Unspecified }

private fun Modifier.defaultSizeFor(
    painter: Painter,
    defaultSize: DpSize,
) =
    this.then(
        if (painter.intrinsicSize == Size.Unspecified || painter.intrinsicSize.isInfinite()) {
            Modifier.size(defaultSize)
        } else {
            if (defaultSize == DpSize.Unspecified) {
                Modifier
            } else {
                Modifier.size(defaultSize)
            }
        },
    )

private fun Size.isInfinite() = width.isInfinite() && height.isInfinite()

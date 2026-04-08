package com.sdds.compose.uikit.internal.icon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.graphics.brush.BrushProducer

@Composable
internal fun BaseIcon(
    source: ImageSource,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    brushProducer: BrushProducer? = LocalTintBrushProducer.current,
    contentScale: ContentScale = ContentScale.Fit,
) {
    val semantics = if (contentDescription != null) {
        Modifier.semantics {
            this.contentDescription = contentDescription
            this.role = Role.Image
        }
    } else {
        Modifier
    }
    val sourcePainter = source.painter()
    val wrappedPainter = remember(sourcePainter, brushProducer) {
        ColorFilterPainter(
            delegate = sourcePainter,
            colorFilterProvider = {
                when (val brush = brushProducer?.invoke()) {
                    is SolidColor -> ColorFilter.tint(brush.value)
                    else -> ColorFilter.tint(Color.Black)
                }
            },
        )
    }

    Box(
        modifier
            .toolingGraphicsLayer()
            .defaultSizeFor(sourcePainter, LocalIconDefaultSize.current)
            .graphicsLayer {
                if (brushProducer != null && brushProducer.invoke() !is SolidColor) {
                    compositingStrategy = CompositingStrategy.Offscreen
                }
            }
            .paint(
                painter = wrappedPainter,
                contentScale = contentScale,
            )
            .drawWithCache {
                onDrawWithContent {
                    drawContent()
                    val brush = brushProducer?.invoke()
                    if (brush == null || brush is SolidColor) return@onDrawWithContent
                    drawRect(brush, blendMode = BlendMode.SrcIn)
                }
            }
            .then(semantics),
    )
}

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

private class ColorFilterPainter(
    private val delegate: Painter,
    private val colorFilterProvider: () -> ColorFilter?,
) : Painter() {

    override val intrinsicSize: Size
        get() = delegate.intrinsicSize

    override fun DrawScope.onDraw() {
        with(delegate) {
            draw(
                size = size,
                alpha = 1f,
                colorFilter = colorFilterProvider(),
            )
        }
    }
}

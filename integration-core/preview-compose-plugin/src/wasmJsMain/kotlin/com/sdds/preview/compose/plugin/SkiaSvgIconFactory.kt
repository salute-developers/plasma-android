package com.sdds.preview.compose.plugin

import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.ImageSource
import com.sdds.preview.compose.SvgIconFactory
import org.jetbrains.skia.Data
import org.jetbrains.skia.Rect
import org.jetbrains.skia.svg.SVGDOM
import org.jetbrains.skia.svg.SVGLength
import org.jetbrains.skia.svg.SVGLengthUnit
import org.jetbrains.skia.svg.SVGPreserveAspectRatio
import org.jetbrains.skia.svg.SVGPreserveAspectRatioAlign
import kotlin.math.ceil

/**
 * Рисует SVG-иконки штатным SVG-модулем Skia, который уже входит в `skiko.wasm`: ни новых библиотек, ни собственного
 * разбора SVG. Подход заимствован у `SvgPainter` Compose Resources.
 */
internal object SkiaSvgIconFactory : SvgIconFactory {
    override fun create(bytes: ByteArray): ImageSource {
        val dom = SVGDOM(Data.makeFromBytes(bytes))
        val root = requireNotNull(dom.root) { "SVG не содержит корневого элемента" }
        val width = root.width.withUnit(SVGLengthUnit.PX).value
        val height = root.height.withUnit(SVGLengthUnit.PX).value
        require(width > 0f && height > 0f) { "SVG без размера" }
        if (root.viewBox == null) root.viewBox = Rect.makeXYWH(0f, 0f, width, height)
        return ImageSource {
            val density = LocalDensity.current.density
            remember(dom, density) { SkiaSvgPainter(dom, Size(width, height) * density) }
        }
    }
}

private class SkiaSvgPainter(private val dom: SVGDOM, override val intrinsicSize: Size) : Painter() {
    private var alpha = 1f
    private var colorFilter: ColorFilter? = null
    private var cache: ImageBitmap? = null

    override fun applyAlpha(alpha: Float): Boolean {
        this.alpha = alpha
        return true
    }

    override fun applyColorFilter(colorFilter: ColorFilter?): Boolean {
        this.colorFilter = colorFilter
        return true
    }

    override fun DrawScope.onDraw() {
        val target = IntSize(ceil(size.width).toInt(), ceil(size.height).toInt())
        if (target.width <= 0 || target.height <= 0) return
        val bitmap = cache?.takeIf { it.width == target.width && it.height == target.height }
            ?: rasterize(target).also { cache = it }
        drawImage(bitmap, dstSize = target, alpha = alpha, colorFilter = colorFilter)
    }

    private fun rasterize(target: IntSize): ImageBitmap {
        val bitmap = ImageBitmap(target.width, target.height, ImageBitmapConfig.Argb8888)
        val root = requireNotNull(dom.root)
        root.width = SVGLength(target.width.toFloat(), SVGLengthUnit.PX)
        root.height = SVGLength(target.height.toFloat(), SVGLengthUnit.PX)
        root.preserveAspectRatio = SVGPreserveAspectRatio(SVGPreserveAspectRatioAlign.NONE)
        dom.render(Canvas(bitmap).nativeCanvas)
        return bitmap
    }
}

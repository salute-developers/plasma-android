package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ImageStyle] для компонента [Image]
 */
val LocalImageStyle = compositionLocalOf { ImageStyle.builder().style() }

/**
 * Стиль компонента [Image]
 */
@Immutable
interface ImageStyle : Style {

    /**
     * Соотношение сторон изображения
     */
    val ratio: Float?

    companion object {

        /**
         * Возвращает экземпляр [ImageStyleBuilder]
         */
        fun builder(receiver: Any? = null): ImageStyleBuilder = DefaultImageStyle.Builder()
    }
}

/**
 * Builder для [ImageStyle]
 */
@ApiInfo
interface ImageStyleBuilder : StyleBuilder<ImageStyle> {

    /**
     * Устанавливает ширину изображения [width]
     */
    fun width(width: Float?): ImageStyleBuilder

    /**
     * Устанавливает высоту изображения [height]
     */
    fun height(height: Float?): ImageStyleBuilder

    /**
     * Устанавливает соотношение сторон изображения [ratio]
     */
    fun ratio(ratio: Float?): ImageStyleBuilder = width(ratio).height(if (ratio != null) 1f else null)
}

@Immutable
private data class DefaultImageStyle(
    override val ratio: Float?,
) : ImageStyle {

    class Builder : ImageStyleBuilder {

        private var width: Float? = null
        private var height: Float? = null

        override fun width(width: Float?) = apply {
            this.width = width
        }

        override fun height(height: Float?) = apply {
            this.height = height
        }

        override fun style(): ImageStyle {
            val w = width
            val h = height
            return DefaultImageStyle(
                ratio = if (w != null && h != null) w / h else null,
            )
        }
    }
}

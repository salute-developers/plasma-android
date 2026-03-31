package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
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
interface ImageStyleBuilder : StyleBuilder<ImageStyle> {

    /**
     * Устанавливает соотношение сторон изображения [ratio]
     */
    fun ratio(ratio: Float?): ImageStyleBuilder
}

@Immutable
private data class DefaultImageStyle(
    override val ratio: Float?,
) : ImageStyle {

    class Builder : ImageStyleBuilder {

        private var ratio: Float? = null

        override fun ratio(ratio: Float?) = apply {
            this.ratio = ratio
        }

        override fun style(): ImageStyle {
            return DefaultImageStyle(
                ratio = ratio,
            )
        }
    }
}

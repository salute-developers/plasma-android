package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [LoaderStyle] для компонента [Loader]
 */
val LocalLoaderStyle =
    compositionLocalOf(structuralEqualityPolicy()) { LoaderStyle.builder().style() }

/**
 * Стиль компонента [Loader]
 */
@Immutable
interface LoaderStyle : Style {

    /**
     * Стиль [Spinner]
     */
    val spinnerStyle: SpinnerStyle

    /**
     * Стиль [CircularProgressBar]
     */
    val circularProgressStyle: CircularProgressBarStyle

    companion object {
        /**
         * Возвращает экземпляр [LoaderStyleBuilder]
         */
        fun builder(receiver: Any? = null): LoaderStyleBuilder = DefaultLoaderStyle.Builder()
    }
}

/**
 * Билдер стиля [LoaderStyle]
 */
interface LoaderStyleBuilder : StyleBuilder<LoaderStyle> {

    /**
     * Устанавливает стиль элементов списка [spinnerStyle]
     */
    fun spinnerStyle(spinnerStyle: SpinnerStyle): LoaderStyleBuilder

    /**
     * Устанавливает стиль разделителей [circularProgressStyle]
     */
    fun circularProgressStyle(circularProgressStyle: CircularProgressBarStyle): LoaderStyleBuilder
}

@Immutable
private class DefaultLoaderStyle(
    override val spinnerStyle: SpinnerStyle,
    override val circularProgressStyle: CircularProgressBarStyle,
) : LoaderStyle {

    class Builder : LoaderStyleBuilder {
        private var spinnerStyle: SpinnerStyle? = null
        private var circularProgressStyle: CircularProgressBarStyle? = null

        override fun spinnerStyle(spinnerStyle: SpinnerStyle) = apply {
            this.spinnerStyle = spinnerStyle
        }

        override fun circularProgressStyle(circularProgressStyle: CircularProgressBarStyle) = apply {
            this.circularProgressStyle = circularProgressStyle
        }

        override fun style(): LoaderStyle {
            return DefaultLoaderStyle(
                spinnerStyle = spinnerStyle ?: SpinnerStyle.builder().style(),
                circularProgressStyle = circularProgressStyle ?: CircularProgressBarStyle.builder().style(),
            )
        }
    }
}

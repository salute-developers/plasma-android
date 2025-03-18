package com.sdds.uikit.fs

import android.content.res.TypedArray
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import com.sdds.uikit.R

/**
 * Определяет параметры границы селектора фокуса.
 *
 * @property borderMode Режим отображения границы.
 * @property shapeAppearanceResId Ресурс стиля, определяющий форму границы.
 * @property shapeAdjustment Коэффициент корректировки формы границы.
 * @property strokeWidth Ширина линии границы.
 * @property strokeInsets Внутренний отступ границы.
 * @property mainColor Основной цвет границы.
 * @property additionalColor Дополнительный цвет границы (используется для градиента).
 */
data class FocusSelectorBorder(
    val borderMode: Mode,
    @StyleRes val shapeAppearanceResId: Int,
    val shapeAdjustment: Float,
    val strokeWidth: Float,
    val strokeInsets: Int,
    @ColorInt val mainColor: Int,
    @ColorInt val additionalColor: Int = 0,
) {

    /**
     * Режимы отображения границы селектора фокуса.
     */
    enum class Mode {

        /**
         * Нет границы селектора фокуса
         */
        NONE,

        /**
         * Сплошная линия
         */
        SOLID,

        /**
         * Градиентная линия
         */
        GRADIENT,

        /**
         * Анимированная градиентная линия
         */
        GRADIENT_ANIMATED,
        ;

        companion object {

            internal fun fromAttr(attrs: TypedArray, default: Mode = NONE): Mode {
                val ordinal = attrs.getInt(R.styleable.SdFocusSelector_sd_fsBorderMode, -1)
                return Mode.values()
                    .getOrNull(ordinal) ?: default
            }

            /**
             * Возвращает true, если граница селектора фокуса включена
             */
            fun Mode.isBorderEnabled(): Boolean = this != NONE
        }
    }
}

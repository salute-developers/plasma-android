package com.sdds.uikit.internal.focusselector

import android.content.res.TypedArray
import com.sdds.uikit.R

/**
 * Режим работы селектора фокуса
 */
@Deprecated(
    "Use FocusSelectorBorderMode",
    ReplaceWith("FocusSelectorBorderMode", "com.sdds.uikit.fs.FocusSelectorBorderMode"),
)
enum class FocusSelectorMode {

    /**
     * Селектор фокуса выключен
     */
    NONE,

    /**
     * Селектор со сплошной линией, описывающей границу элемента
     */
    BORDER,

    /**
     * Селектор с градиентной линией
     */
    GRADIENT_BORDER,

    /**
     * Селектор с анимированной градиентной линией
     */
    ANIMATED_BORDER,

    /**
     * Масштабирование
     */
    @Deprecated("Use sd_fsScaleEnabled")
    SCALE,

    ;

    companion object {

        internal fun fromAttr(attrs: TypedArray): FocusSelectorMode {
            val ordinal = attrs.getInt(R.styleable.SdFocusSelector_sd_fsMode, 0)
            return values().getOrNull(ordinal) ?: NONE
        }

        /**
         * Возвращает true, если селектор фокуса включен
         */
        @Deprecated(
            "Use FocusSelectorBorderMode.isBorderEnabled()",
            ReplaceWith(
                "FocusSelectorBorderMode.isBorderEnabled()",
                "com.sdds.uikit.fs.FocusSelectorBorderMode",
            ),
        )
        fun FocusSelectorMode.isEnabled(): Boolean = this != NONE
    }
}

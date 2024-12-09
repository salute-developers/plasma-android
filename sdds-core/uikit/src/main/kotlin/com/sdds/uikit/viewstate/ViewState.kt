package com.sdds.uikit.viewstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.R

/**
 * Состояние компонента из дизайн-системы
 * @property attr атрибут состояния
 */
@Deprecated("Использовать ColorState")
enum class ViewState(val attr: IntArray) {
    UNDEFINED(intArrayOf()),
    PRIMARY(intArrayOf(R.attr.sd_state_primary)),
    SECONDARY(intArrayOf(R.attr.sd_state_secondary)),
    TERTIARY(intArrayOf(R.attr.sd_state_tertiary)),
    ACCENT(intArrayOf(R.attr.sd_state_accent)),
    POSITIVE(intArrayOf(R.attr.sd_state_positive)),
    WARNING(intArrayOf(R.attr.sd_state_warning)),
    NEGATIVE(intArrayOf(R.attr.sd_state_negative)),
    DARK(intArrayOf(R.attr.sd_state_dark)),
    BLACK(intArrayOf(R.attr.sd_state_black)),
    WHITE(intArrayOf(R.attr.sd_state_white)),
    CLEAR(intArrayOf(R.attr.sd_state_clear)),
    ;

    companion object {

        /**
         * Достает [ViewState] из атрибутов [attrs].
         * Если атрибут app:sdds_state не задан, то по-умолчанию вернет [ViewState.PRIMARY]
         * @param context контекст
         * @param attrs атрибуты [View]
         * @param defStyleAttr атрибут стиля по умолчанию
         * @param defStyleRes стиль по умолчанию
         * @return [ViewState]
         */
        @Deprecated("Использовать ColorState.obtain()")
        fun obtain(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int = 0,
            defStyleRes: Int = 0,
        ): ViewState {
            val typedArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.SdViewStateHolder,
                defStyleAttr,
                defStyleRes,
            )
            val stateOrdinal: Int = typedArray.getInt(R.styleable.SdViewStateHolder_sd_viewState, 0)
            typedArray.recycle()
            return ViewState.values().getOrNull(stateOrdinal) ?: PRIMARY
        }

        /**
         * Индикатор определенного состояния
         */
        fun ViewState?.isDefined(): Boolean =
            this != null && this != UNDEFINED
    }
}

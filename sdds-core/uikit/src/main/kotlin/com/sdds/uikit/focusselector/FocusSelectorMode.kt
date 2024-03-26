package com.sdds.uikit.focusselector

import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.Shapeable
import com.sdds.uikit.R

/**
 * Режим работы селектора фокуса
 */
internal enum class FocusSelectorMode {

    /**
     * Селектор со статичным градиентом
     */
    GRADIENT,

    /**
     * Анимированный селектор
     */
    ANIMATED,

    ;

    companion object {

        internal fun fromAttr(attrs: TypedArray): FocusSelectorMode {
            val ordinal = attrs.getInt(R.styleable.SddsFocusSelector_sdds_fs_mode, -1)
            return values().getOrNull(ordinal) ?: ANIMATED
        }
    }
}

/**
 * Применяет для [View] настройки фокус селектора из набора аттрибутов [attrs]
 * @receiver [View]
 * @param attrs набор аттрибутов
 * @param defStyleAttr атрибут стиля по умолчанию
 * @param defStyleRes стиль по-умолчанию
 */
internal fun View.tryApplyFocusSelector(
    attrs: AttributeSet?,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) {
    val attr = context.obtainStyledAttributes(
        attrs,
        R.styleable.SddsFocusSelector,
        defStyleAttr,
        defStyleRes,
    )
    try {
        val isFsEnabledByDefault = this !is ViewGroup && isFocusable
        val isFsEnabled =
            attr.getBoolean(R.styleable.SddsFocusSelector_sdds_fs_enabled, isFsEnabledByDefault)
        if (!isFsEnabled) return
        val strokeWidth = attr.getDimension(
            R.styleable.SddsFocusSelector_sdds_fs_strokeWidth,
            resources.getDimension(R.dimen.sdds_spacer_0_5x),
        )
        val mode = FocusSelectorMode.fromAttr(attr)
        val appearance =
            attr.getResourceId(R.styleable.SddsFocusSelector_sdds_fs_shapeAppearance, -1)
        tryApplyFocusSelector(mode, appearance, strokeWidth)
    } finally {
        attr.recycle()
    }
}

/**
 * Применяет для [View] настройки фокус селектора
 * @receiver [View]
 * @param mode режим селектора
 * @param appearanceResId идентификатор стиля формы селектора
 * @param strokeWidth толщина линии
 */
private fun View.tryApplyFocusSelector(
    mode: FocusSelectorMode = FocusSelectorMode.ANIMATED,
    @StyleRes appearanceResId: Int = -1,
    strokeWidth: Float? = null,
) {
    val defAppearanceModel = if (appearanceResId != -1) {
        ShapeAppearanceModel
            .builder(context, appearanceResId, 0)
            .build()
    } else {
        ShapeAppearanceModel
            .builder(context, R.style.Sdds_Shape_Round_L, 0)
            .build()
    }
    val appearanceModel = if (this is Shapeable && appearanceResId == -1) {
        try {
            this.shapeAppearanceModel
        } catch (e: IllegalStateException) {
            defAppearanceModel
        }
    } else {
        defAppearanceModel
    }
    val useStrokeWidth = strokeWidth ?: resources.getDimension(R.dimen.sdds_spacer_0_5x)
    foreground = when (mode) {
        FocusSelectorMode.GRADIENT -> SelectorDrawable(context, useStrokeWidth, appearanceModel)
        FocusSelectorMode.ANIMATED -> AnimatedSelectorDrawable(
            context,
            useStrokeWidth,
            appearanceModel,
        )
    }
}

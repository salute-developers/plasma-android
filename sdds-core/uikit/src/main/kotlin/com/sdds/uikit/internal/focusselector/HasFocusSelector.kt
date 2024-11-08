package com.sdds.uikit.internal.focusselector

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StyleRes
import com.sdds.uikit.R
import com.sdds.uikit.internal.focusselector.FocusSelectorMode.Companion.isEnabled
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModel.Companion.adjust
import com.sdds.uikit.shape.Shapeable

/**
 * Интерфейс описывающий сущность, которая поддерживает селектор фокуса
 * @see FocusSelectorMode
 * @author Малышев Александр on 01.10.2024
 */
interface HasFocusSelector {

    /**
     * Устанавливает селектор фокуса для [view]
     * @param view [View], в который устанавливает селектор
     * @param context контекст
     * @param attributeSet набор атрибутов для кастомизации селектора
     * @param defStyleAttr атрибут стиля по-умолчанию для [view]
     */
    fun applySelector(
        view: View,
        context: Context,
        attributeSet: AttributeSet? = null,
        defStyleAttr: Int = 0,
    )

    /**
     * Обновляет селектор фокуса при изменении состояния [focus] у [view]
     */
    fun updateFocusSelector(view: View, focus: Boolean)

    /**
     * Обрабатывает изменение состояния [View.isPressed]
     */
    fun handlePressedChange(view: View, isPressed: Boolean)
}

/**
 * Делегат для управления состоянием селектора фокуса.
 */
internal class FocusSelectorDelegate : HasFocusSelector {

    private var scaleAnimationHelper: FocusScaleAnimationHelper? = null
    private var strokeInsets: Int = 0
    private var mode: FocusSelectorMode = FocusSelectorMode.GRADIENT_BORDER

    override fun applySelector(view: View, context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) {
        val attr = context.obtainStyledAttributes(
            attributeSet,
            R.styleable.SdFocusSelector,
            defStyleAttr,
            0,
        )
        try {
            mode = FocusSelectorMode.fromAttr(attr)
            if (!mode.isEnabled() || !view.isFocusable) return
            if (mode == FocusSelectorMode.SCALE) {
                val factor = attr.getFloat(
                    R.styleable.SdFocusSelector_sd_fsScaleFactor,
                    FocusScaleAnimationHelper.DEFAULT_FACTOR,
                )
                scaleAnimationHelper = FocusScaleAnimationHelper(factor)
            } else {
                val strokeWidth = attr.getDimension(
                    R.styleable.SdFocusSelector_sd_fsStrokeWidth,
                    view.resources.getDimension(R.dimen.sdds_spacer_1x),
                )
                val appearance = attr.getResourceId(R.styleable.SdFocusSelector_sd_fsShapeAppearance, 0)
                strokeInsets = attr.getDimensionPixelSize(R.styleable.SdFocusSelector_sd_fsStrokeInset, 0)
                val mainColor = attr.getColor(R.styleable.SdFocusSelector_sd_fsMainColor, 0)
                val additionalColor = attr.getColor(R.styleable.SdFocusSelector_sd_fsAdditionalColor, 0)
                val adjustment = attr.getDimension(R.styleable.SdFocusSelector_sd_fsShapeAdjustment, 0f)
                view.tryApplyStrokeSelector(
                    mode = mode,
                    appearanceResId = appearance,
                    shapeAdjustment = adjustment,
                    strokeWidth = strokeWidth,
                    mainColor = mainColor,
                    additionalColor = additionalColor,
                )
            }
        } finally {
            attr.recycle()
        }
    }

    override fun updateFocusSelector(view: View, focus: Boolean) {
        if (!mode.isEnabled()) return
        if (mode == FocusSelectorMode.SCALE) {
            scaleAnimationHelper?.animateFocusChange(view, focus)
        } else {
            view.foreground?.invalidateSelf()
        }
    }

    override fun handlePressedChange(view: View, isPressed: Boolean) {
        if (mode == FocusSelectorMode.SCALE) {
            scaleAnimationHelper?.animatePressedState(view, isPressed)
        }
    }

    private fun View.tryApplyStrokeSelector(
        mode: FocusSelectorMode,
        @StyleRes appearanceResId: Int,
        shapeAdjustment: Float,
        strokeWidth: Float,
        mainColor: Int,
        additionalColor: Int = 0,
    ) {
        if (mode == FocusSelectorMode.SCALE) return
        val defaultShape = ShapeModel.create(
            context,
            appearanceResId.takeIf { it != 0 } ?: R.style.Sdds_Shape_Round,
        )
        val appearanceModel = (this as? Shapeable)?.shape ?: defaultShape
        val adjustedShapeModel = appearanceModel.adjust(shapeAdjustment)
        foreground = when (mode) {
            FocusSelectorMode.BORDER -> SelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = mainColor,
            )

            FocusSelectorMode.GRADIENT_BORDER -> SelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = mainColor,
                additionalColor = additionalColor,
            )

            FocusSelectorMode.ANIMATED_BORDER -> AnimatedSelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = mainColor,
                additionalColor = additionalColor,
            )

            else -> return
        }
    }
}

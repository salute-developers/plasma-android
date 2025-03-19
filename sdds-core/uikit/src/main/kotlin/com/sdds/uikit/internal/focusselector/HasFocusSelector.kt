package com.sdds.uikit.internal.focusselector

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.sdds.uikit.R
import com.sdds.uikit.fs.FocusSelectorBorder
import com.sdds.uikit.fs.FocusSelectorBorder.Mode.Companion.isBorderEnabled
import com.sdds.uikit.fs.FocusSelectorSettings
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
    @Deprecated("Use applySelector(View)", ReplaceWith("applySelector(view)"))
    fun applySelector(
        view: View,
        context: Context,
        attributeSet: AttributeSet? = null,
        defStyleAttr: Int = 0,
    )

    /**
     * Устанавливает селектор фокуса для [view]
     * @param view [View], в который устанавливает селектор
     */
    @Suppress("DEPRECATION")
    fun applySelector(view: View): Unit = applySelector(view, view.context)

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
internal class FocusSelectorDelegate
@Deprecated("Use constructor(FocusSelectorSettings) or constructor(Context, AttributeSet, Int)")
constructor() : HasFocusSelector {

    private var scaleAnimationHelper: FocusScaleAnimationHelper? = null
    var settings: FocusSelectorSettings? = null
        private set

    internal val isEnabled: Boolean
        get() = settings?.let {
            it.isEnabled && (it.border.borderMode.isBorderEnabled() || it.scaleEnabled)
        } == true

    constructor(settings: FocusSelectorSettings) : this() {
        this.settings = settings
    }

    constructor(
        context: Context,
        attributeSet: AttributeSet?,
        defStyleAttr: Int,
    ) : this(FocusSelectorSettings.fromAttrs(context, attributeSet, defStyleAttr))

    override fun applySelector(view: View) {
        val settings = this.settings ?: return
        if (!isEnabled || !view.canBeFocusable(settings.duplicateParentStateEnabled)) return
        if (settings.scaleEnabled) {
            scaleAnimationHelper = FocusScaleAnimationHelper(settings.scaleFactor)
        }
        view.tryApplySelectorBorder(settings)
    }

    @Deprecated("Use applySelector(View)", replaceWith = ReplaceWith("applySelector(view)"))
    override fun applySelector(view: View, context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) {
        this.settings = FocusSelectorSettings.fromAttrs(context, attributeSet, defStyleAttr)
        applySelector(view)
    }

    override fun updateFocusSelector(view: View, focus: Boolean) {
        if (!isEnabled) return
        if (settings?.scaleEnabled == true) {
            scaleAnimationHelper?.animateFocusChange(view, focus)
        }
        if (settings?.border?.borderMode?.isBorderEnabled() == true) {
            view.foreground?.invalidateSelf()
        }
    }

    override fun handlePressedChange(view: View, isPressed: Boolean) {
        if (settings?.scaleEnabled == true) {
            scaleAnimationHelper?.animatePressedState(view, isPressed)
        }
    }

    private fun View.canBeFocusable(duplicateStateEnabled: Boolean): Boolean {
        return isFocusable || (duplicateStateEnabled && isDuplicateParentStateEnabled)
    }

    private fun View.tryApplySelectorBorder(settings: FocusSelectorSettings) {
        val border = settings.border
        val defaultShape = ShapeModel.create(
            context,
            border.shapeAppearanceResId.takeIf { it != 0 } ?: R.style.Sdds_Shape_Round,
        )
        val appearanceModel = (this as? Shapeable)?.shape ?: defaultShape
        val adjustedShapeModel = appearanceModel.adjust(border.shapeAdjustment)
        val strokeWidth: Float
        val strokeInsets: Int
        if (settings.scaleEnabled && settings.scaleFactor != 0f) {
            val scale = 1 + settings.scaleFactor
            strokeWidth = border.strokeWidth / scale
            strokeInsets = (border.strokeInsets / scale).toInt()
        } else {
            strokeWidth = border.strokeWidth
            strokeInsets = border.strokeInsets
        }
        foreground = when (border.borderMode) {
            FocusSelectorBorder.Mode.SOLID -> SelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = border.mainColor,
            )

            FocusSelectorBorder.Mode.GRADIENT -> SelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = border.mainColor,
                additionalColor = border.additionalColor,
            )

            FocusSelectorBorder.Mode.GRADIENT_ANIMATED -> AnimatedSelectorDrawable(
                context = context,
                strokeWidth = strokeWidth,
                insets = strokeInsets,
                shapeModel = adjustedShapeModel,
                mainColor = border.mainColor,
                additionalColor = border.additionalColor,
            )
            else -> return
        }
    }
}

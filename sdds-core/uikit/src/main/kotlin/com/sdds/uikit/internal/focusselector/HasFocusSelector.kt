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

    /**
     * Добавляет слушатель анимации изменения масштаба при фокусе.
     */
    fun addScaleAnimationListener(listener: ScaleAnimationListener)

    /**
     * Добавляет слушатель анимации изменения масштаба при фокусе.
     */
    fun removeScaleAnimationListener(listener: ScaleAnimationListener)
}

/**
 * Слушатель анимации масштабирования, связанной с фокусом.
 *
 * Позволяет отслеживать ключевые события анимации изменения масштаба при получении или потере фокуса.
 */
interface ScaleAnimationListener {

    /**
     * Вызывается в начале анимации масштабирования.
     */
    fun onStart()

    /**
     * Вызывается при обновлении анимации.
     *
     * @param startX начальное значение анимации масштабирования по оси X
     * @param startY начальное значение анимации масштабирования по оси Y
     * @param endX конечное значение анимации масштабирования по оси X
     * @param endY конечное значение анимации масштабирования по оси Y
     * @param fraction прогресс анимации от 0.0 до 1.0
     */
    fun onUpdate(startX: Float, startY: Float, endX: Float, endY: Float, fraction: Float)

    /**
     * Вызывается в конце анимации масштабирования.
     */
    fun onEnd()
}

/**
 * Добавляет [ScaleAnimationListener] к текущему [HasFocusSelector] с удобной реализацией через лямбды.
 *
 * Позволяет легко обработать события начала, прогресса и завершения анимации масштабирования.
 *
 * @param onStart вызывается в начале анимации (опционально)
 * @param onEnd вызывается в конце анимации (опционально)
 * @param onUpdate вызывается при каждом обновлении прогресса анимации.
 * @return созданный [ScaleAnimationListener]
 */
fun HasFocusSelector.doOnScaleAnimation(
    onStart: (() -> Unit)? = null,
    onEnd: (() -> Unit)? = null,
    onUpdate: (Float, Float, Float, Float, Float) -> Unit,
): ScaleAnimationListener {
    val listener = object : ScaleAnimationListener {
        override fun onStart() {
            onStart?.invoke()
        }

        override fun onUpdate(startX: Float, startY: Float, endX: Float, endY: Float, fraction: Float) {
            onUpdate(startX, startY, endX, endY, fraction)
        }

        override fun onEnd() {
            onEnd?.invoke()
        }
    }
    addScaleAnimationListener(listener)
    return listener
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
        defStyleRes: Int = 0,
    ) : this(FocusSelectorSettings.fromAttrs(context, attributeSet, defStyleAttr, defStyleRes))

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

    override fun addScaleAnimationListener(listener: ScaleAnimationListener) {
        scaleAnimationHelper?.addScaleAnimationListener(listener)
    }

    override fun removeScaleAnimationListener(listener: ScaleAnimationListener) {
        scaleAnimationHelper?.removeScaleAnimationListener(listener)
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

package com.sdds.uikit.fs

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.res.use
import com.sdds.uikit.R
import com.sdds.uikit.internal.focusselector.FocusScaleAnimationHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.uikit.internal.focusselector.FocusSelectorMode.Companion.isEnabled

/**
 * Настройки для селектора фокуса.
 *
 * Определяет параметры, такие как включение/отключение селектора фокуса, параметры границы,
 * масштабирование и дублирование состояния родителя.
 *
 * @property isEnabled Флаг, указывающий, включен ли селектор фокуса.
 * @property border Настройки границы селектора фокуса.
 * @property scaleEnabled Флаг, указывающий, включено ли масштабирование при фокусе.
 * @property scaleFactor Коэффициент масштабирования при фокусе.
 * @property duplicateParentStateEnabled Флаг, указывающий, нужно ли дублировать состояние родителя.
 * @property windowFocusResponsive Флаг, указывающий, должен ли компонент переставать сообщать
 * [android.R.attr.state_focused], пока его окно не имеет фокуса ([android.view.View.hasWindowFocus]).
 * При `true` все фокусные подсветки, завязанные на [android.R.attr.state_focused] (фон/текст по
 * ColorStateList-селекторам, рамка-селектор, [android.animation.StateListAnimator]), гаснут, когда другое
 * окно (активность/диалог) забирает фокус ввода, и возвращаются при возврате фокуса окна.
 * Масштабирование при фокусе ([scaleEnabled]) синхронизируется с этим же условием.
 * Значение по умолчанию — `false` (фокусные подсветки остаются видимыми независимо от фокуса окна).
 * Не применяется к компонентам с редактируемым вводом (EditText/TextField) из-за их собственной
 * семантики взаимодействия с фокусом окна.
 */
data class FocusSelectorSettings(
    val isEnabled: Boolean,
    val border: FocusSelectorBorder,
    val scaleEnabled: Boolean,
    val scaleFactor: Float,
    val duplicateParentStateEnabled: Boolean,
    val windowFocusResponsive: Boolean = false,
) {

    companion object {

        /**
         * Создаёт экземпляр [FocusSelectorSettings] из XML-атрибутов.
         *
         * @param context Контекст, используемый для получения атрибутов.
         * @param attributeSet Набор XML-атрибутов, определяющих параметры селектора фокуса.
         * @param defStyleAttr Атрибут стиля по умолчанию.
         * @return Экземпляр [FocusSelectorSettings], содержащий настройки из атрибутов.
         */
        fun fromAttrs(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int): FocusSelectorSettings {
            return fromAttrs(context, attributeSet, defStyleAttr, 0)
        }

        /**
         * Создаёт экземпляр [FocusSelectorSettings] из XML-атрибутов.
         *
         * @param context Контекст, используемый для получения атрибутов.
         * @param attributeSet Набор XML-атрибутов, определяющих параметры селектора фокуса.
         * @param defStyleAttr Атрибут стиля по умолчанию.
         * @return Экземпляр [FocusSelectorSettings], содержащий настройки из атрибутов.
         */
        fun fromAttrs(
            context: Context,
            attributeSet: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): FocusSelectorSettings {
            return context.obtainStyledAttributes(
                attributeSet,
                R.styleable.SdFocusSelector,
                defStyleAttr,
                defStyleRes,
            ).use { attr ->
                val fallbackFsMode = FocusSelectorMode.fromAttr(attr)
                val isFsEnabled = attr.getBoolean(R.styleable.SdFocusSelector_sd_fsEnabled, fallbackFsMode.isEnabled())
                val borderMode = FocusSelectorBorder.Mode.fromAttr(attr, fallbackFsMode.toBorderMode())
                val scaleEnabled = attr.getBoolean(
                    R.styleable.SdFocusSelector_sd_fsScaleEnabled,
                    fallbackFsMode == FocusSelectorMode.SCALE,
                )
                val duplicateParentStateEnabled = attr.getBoolean(
                    R.styleable.SdFocusSelector_sd_fsDuplicateParentState,
                    false,
                )
                val windowFocusResponsive = attr.getBoolean(
                    R.styleable.SdFocusSelector_sd_fsWindowFocusResponsive,
                    false,
                )
                val factor = attr.getFloat(
                    R.styleable.SdFocusSelector_sd_fsScaleFactor,
                    FocusScaleAnimationHelper.DEFAULT_FACTOR,
                )
                val strokeWidth = attr.getDimension(
                    R.styleable.SdFocusSelector_sd_fsStrokeWidth,
                    context.resources.getDimension(R.dimen.sdds_spacer_1x),
                )
                val appearance = attr.getResourceId(R.styleable.SdFocusSelector_sd_fsShapeAppearance, 0)
                val strokeInsets = attr.getDimensionPixelSize(R.styleable.SdFocusSelector_sd_fsStrokeInset, 0)
                val mainColor = attr.getColor(R.styleable.SdFocusSelector_sd_fsMainColor, 0)
                val additionalColor = attr.getColor(R.styleable.SdFocusSelector_sd_fsAdditionalColor, 0)
                val adjustment = attr.getDimension(R.styleable.SdFocusSelector_sd_fsShapeAdjustment, 0f)
                FocusSelectorSettings(
                    isEnabled = isFsEnabled,
                    border = FocusSelectorBorder(
                        borderMode = borderMode,
                        shapeAppearanceResId = appearance,
                        shapeAdjustment = adjustment,
                        strokeWidth = strokeWidth,
                        strokeInsets = strokeInsets,
                        mainColor = mainColor,
                        additionalColor = additionalColor,
                    ),
                    scaleEnabled = scaleEnabled,
                    scaleFactor = factor,
                    duplicateParentStateEnabled = duplicateParentStateEnabled,
                    windowFocusResponsive = windowFocusResponsive,
                )
            }
        }

        @Suppress("DEPRECATION")
        private fun FocusSelectorMode.toBorderMode(): FocusSelectorBorder.Mode =
            when (this) {
                FocusSelectorMode.BORDER -> FocusSelectorBorder.Mode.SOLID
                FocusSelectorMode.GRADIENT_BORDER -> FocusSelectorBorder.Mode.GRADIENT
                FocusSelectorMode.ANIMATED_BORDER -> FocusSelectorBorder.Mode.GRADIENT_ANIMATED
                else -> FocusSelectorBorder.Mode.NONE
            }
    }
}

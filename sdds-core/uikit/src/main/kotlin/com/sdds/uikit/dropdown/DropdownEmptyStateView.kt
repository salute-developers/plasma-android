package com.sdds.uikit.dropdown

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import com.sdds.uikit.Button
import com.sdds.uikit.ImageView
import com.sdds.uikit.LinearLayout
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.StyleStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getStyleStateList

/**
 * Компонент - часть DropdownMenu, для отображения состояния пустоты с иконкой, текстом и кнопкой действия.
 */
open class DropdownEmptyStateView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_dropdownEmptyStateStyle,
    defStyleRes: Int = R.style.Sdds_Components_DropdownEmptyState,
) : LinearLayout(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr, defStyleRes) {

    private val iconView: ImageView = ImageView(this.context)
    private val descriptionView: TextView = TextView(this.context)
    private val actionButton: Button = Button(this.context)
    private var descriptionPadding: Int = 0

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        orientation = VERTICAL
        gravity = Gravity.CENTER_HORIZONTAL
        addView(iconView)
        addView(
            descriptionView,
            LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
                topMargin = descriptionPadding
            },
        )
        addView(actionButton)
    }

    /**
     * Устанавливает drawable иконки.
     */
    fun setIcon(drawable: Drawable?) {
        iconView.setImageDrawable(drawable)
    }

    /**
     * Устанавливает текст описания.
     */
    fun setDescription(description: CharSequence?) {
        descriptionView.text = description
    }

    /**
     * Устанавливает текст кнопки действия.
     */
    fun setActionText(actionText: CharSequence?) {
        actionButton.text = actionText
    }

    /**
     * Устанавливает иконку по идентификатору ресурса.
     */
    fun setIcon(@DrawableRes resId: Int) {
        iconView.setImageResource(resId)
    }

    /**
     * Устанавливает цвет иконки по значению цвета.
     */
    fun setIconTint(@ColorInt color: Int) {
        iconView.imageTintList = ColorStateList.valueOf(color)
    }

    /**
     * Устанавливает цвет иконки по `ColorStateList`.
     */
    fun setIconTint(colorStateList: ColorStateList?) {
        iconView.imageTintList = colorStateList
    }

    /**
     * Устанавливает цвет иконки по `ColorValueStateList`.
     */
    fun setIconTint(colorStateList: ColorValueStateList?) {
        iconView.setImageTintValueList(colorStateList)
    }

    /**
     * Устанавливает цвет текста описания по значению цвета.
     */
    fun setDescriptionTextColor(@ColorInt color: Int) {
        descriptionView.setTextColor(color)
    }

    /**
     * Устанавливает цвет текста описания по `ColorStateList`.
     */
    fun setDescriptionTextColor(colorStateList: ColorStateList?) {
        descriptionView.setTextColor(colorStateList)
    }

    /**
     * Устанавливает цвет текста описания по `ColorValueStateList`.
     */
    fun setDescriptionTextColor(colorStateList: ColorValueStateList?) {
        descriptionView.setTextColor(colorStateList)
    }

    /**
     * Устанавливает стиль текста описания.
     */
    fun setDescriptionTextAppearance(@StyleRes textAppearance: Int) {
        descriptionView.setTextAppearance(textAppearance)
    }

    /**
     * Устанавливает стили текста описания.
     */
    fun setDescriptionTextAppearanceList(textAppearances: StyleStateList?) {
        descriptionView.setTextAppearancesList(textAppearances)
    }

    /**
     * Устанавливает текст описания по идентификатору строкового ресурса.
     */
    fun setDescription(@StringRes resId: Int) {
        descriptionView.setText(resId)
    }

    /**
     * Устанавливает текст кнопки действия по идентификатору строкового ресурса.
     */
    fun setActionText(@StringRes resId: Int) {
        actionButton.setText(resId)
        updateActionButton()
    }

    /**
     * Устанавливает слушатель нажатия на кнопку действия
     */
    fun setActionButtonClickListener(onClickListener: OnClickListener?) {
        actionButton.setOnClickListener(onClickListener)
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.DropdownEmptyStateView, defStyleAttr, defStyleRes) {
            iconView.setImageDrawable(getDrawable(R.styleable.DropdownEmptyStateView_sd_icon))
            iconView.setImageTintValueList(
                getColorValueStateList(context, R.styleable.DropdownEmptyStateView_sd_iconTint),
            )

            descriptionView.text = getString(R.styleable.DropdownEmptyStateView_sd_description)
            descriptionPadding = getDimensionPixelSize(R.styleable.DropdownEmptyStateView_sd_descriptionPadding, 0)
            descriptionView.setTextColor(
                getColorValueStateList(
                    context,
                    R.styleable.DropdownEmptyStateView_sd_descriptionTextColor,
                ),
            )
            descriptionView.setTextAppearancesList(
                getStyleStateList(
                    context,
                    R.styleable.DropdownEmptyStateView_sd_descriptionTextAppearance,
                ),
            )
            actionButton.text = getString(R.styleable.DropdownEmptyStateView_sd_actionButtonText)
            updateActionButton()
        }
    }

    private fun updateActionButton() {
        actionButton.isVisible = !actionButton.text.isNullOrEmpty()
    }

    private companion object {
        fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.DropdownEmptyStateView, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.DropdownEmptyStateView_sd_actionButtonStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}

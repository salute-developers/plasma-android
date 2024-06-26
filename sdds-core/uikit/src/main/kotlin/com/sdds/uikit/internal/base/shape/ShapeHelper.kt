package com.sdds.uikit.internal.base.shape

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StyleRes
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.updatePadding
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.wrapWithInset

/**
 * Делегат для установки [MaterialShapeDrawable] в качестве фона [View]
 * @param view получатель фона
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 * @author Александр Малышев on 21.07.2023
 */
internal class ShapeHelper(
    private val view: View,
    private val attrs: AttributeSet? = null,
    private val defStyleAttr: Int = 0,
    private val defStyleRes: Int = 0,
) {

    private var shapeModel: ShapeAppearanceModel? = null
    private var strokeColor: ColorStateList? = null
    private var strokeWidth: Float = 0f
    private var backgroundOverwritten: Boolean = false
    private var needShapeBackground: Boolean = false
    private var insetLeft: Int = 0
    private var insetTop: Int = 0
    private var insetRight: Int = 0
    private var insetBottom: Int = 0

    init {
        obtainAttrs(attrs, defStyleAttr, defStyleRes)
    }

    fun setShape(@StyleRes shapeResId: Int) {
        if (!canCreateShapeBackground()) return
        val model = ShapeAppearanceModel
            .builder(view.context, shapeResId, 0)
            .build()
        if (this.shapeModel != model) {
            this.shapeModel = model
            setInternalBackground()
        }
    }

    fun setStrokeColor(colorStateList: ColorStateList?) {
        if (strokeColor != colorStateList) {
            strokeColor = colorStateList
            updateBackground()
        }
    }

    fun setStrokeWidth(strokeWidth: Float) {
        if (this.strokeWidth != strokeWidth) {
            this.strokeWidth = strokeWidth
            updateBackground()
        }
    }

    private fun getShapeAppearanceModel(): ShapeAppearanceModel =
        this.shapeModel ?: throw IllegalStateException("background was overwritten")

    private fun setInternalBackground() = with(view) {
        if (!canCreateShapeBackground()) return@with
        val pLeft = paddingLeft + insetLeft
        val pTop = paddingTop + insetTop
        val pRight = paddingRight + insetRight
        val pBottom = paddingBottom + insetBottom
        updateBackground()
        updatePadding(pLeft, pTop, pRight, pBottom)
    }

    private fun updateBackground() {
        view.background = createBackground()
    }

    private fun createBackground(): Drawable {
        val backgroundDrawable = MaterialShapeDrawable(getShapeAppearanceModel()).apply {
            initializeElevationOverlay(view.context)
            DrawableCompat.setTintList(this, view.backgroundTintList)
            view.backgroundTintMode?.let { tintMode ->
                DrawableCompat.setTintMode(this, tintMode)
            }
            setStroke(this@ShapeHelper.strokeWidth, this@ShapeHelper.strokeColor)
        }
        backgroundDrawable.elevation = view.elevation
        return backgroundDrawable.wrapWithInset(insetLeft, insetTop, insetRight, insetBottom)
    }

    private fun obtainAttrs(attributeSet: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = view.context.obtainStyledAttributes(
            attributeSet,
            R.styleable.SdShape,
            defStyleAttr,
            defStyleRes,
        )
        insetLeft = typedArray.getDimensionPixelOffset(R.styleable.SdShape_android_insetLeft, 0)
        insetTop = typedArray.getDimensionPixelOffset(R.styleable.SdShape_android_insetTop, 0)
        insetRight = typedArray.getDimensionPixelOffset(R.styleable.SdShape_android_insetRight, 0)
        insetBottom = typedArray.getDimensionPixelOffset(R.styleable.SdShape_android_insetBottom, 0)
        backgroundOverwritten = typedArray.hasValue(R.styleable.SdShape_android_background)
        needShapeBackground = typedArray.hasValue(R.styleable.SdShape_sd_shapeAppearance)
        strokeColor = typedArray.getColorStateList(R.styleable.SdShape_sd_strokeColor)
        strokeWidth = typedArray.getDimension(R.styleable.SdShape_sd_strokeWidth, 0f)
        val shapeResId = typedArray.getResourceId(R.styleable.SdShape_sd_shapeAppearance, -1)
        if (shapeResId != -1) { setShape(shapeResId) }
        typedArray.recycle()
    }

    private fun canCreateShapeBackground() = !backgroundOverwritten && needShapeBackground
}

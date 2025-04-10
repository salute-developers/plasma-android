package com.sdds.uikit.internal.base.shape

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.updatePadding
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.wrapWithInset
import com.sdds.uikit.shape.ShadowModel
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable

/**
 * Делегат для установки [ShapeDrawable] в качестве фона [View]
 * @param view получатель фона
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 * @author Александр Малышев on 21.07.2023
 */
internal class ShapeHelper(
    private val view: View,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : Shapeable {

    private var shapeModel: ShapeModel? = null
    private var strokeColor: ColorStateList? = null
    private var strokeWidth: Float = 0f
    private var colorAnimationEnabled: Boolean = false
    private var backgroundOverwritten: Boolean = false
    private var insetLeft: Int = 0
    private var insetTop: Int = 0
    private var insetRight: Int = 0
    private var insetBottom: Int = 0

    private var shadowModel: ShadowModel? = null

    init {
        obtainAttrs(attrs, defStyleAttr, defStyleRes)
    }

    /**
     * @see Shapeable
     */
    override val shape: ShapeModel?
        get() = shapeModel

    fun setShape(shapeModel: ShapeModel) {
        if (!canCreateShapeBackground()) return
        if (this.shapeModel != shapeModel) {
            this.shapeModel = shapeModel
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

    private fun getShapeAppearanceModel(): ShapeModel =
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
        return when (val bg = view.background) {
            is ShapeDrawable -> bg.setupBackground()

            is LayerDrawable -> {
                bg.apply {
                    for (i in 0 until bg.numberOfLayers) {
                        (bg.getDrawable(i) as? ShapeDrawable)?.setupBackground(shadowEnabled = i == 0)
                    }
                }
            }

            else -> ShapeDrawable().setupBackground()
        }
            .apply {
                DrawableCompat.setTintList(this, view.backgroundTintList)
                view.backgroundTintMode?.let { tintMode ->
                    DrawableCompat.setTintMode(this, tintMode)
                }
            }
            .wrapWithInset(insetLeft, insetTop, insetRight, insetBottom)
    }

    private fun ShapeDrawable.setupBackground(shadowEnabled: Boolean = true): ShapeDrawable {
        val shapeModel = getShapeAppearanceModel()
        return this.apply {
            setShapeModel(shapeModel)
            setStrokeTint(strokeColor)
            setStrokeWidth(strokeWidth)
            setColorAnimationEnabled(colorAnimationEnabled)
            if (shadowEnabled) setupShadow()
        }
    }

    private fun ShapeDrawable.setupShadow() {
        val shadowModel = this@ShapeHelper.shadowModel ?: return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            setShadowModel(shadowModel)
            return
        }

        val fallbackElevation = shadowModel.fallbackElevation
        if (fallbackElevation != null) {
            view.elevation = fallbackElevation
        }
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
        val currentBackground = typedArray.getDrawable(R.styleable.SdShape_android_background)
        backgroundOverwritten = typedArray.hasValue(R.styleable.SdShape_android_background) &&
            currentBackground?.isShapeable() != true
        strokeColor = typedArray.getColorStateList(R.styleable.SdShape_sd_strokeColor)
        strokeWidth = typedArray.getDimension(R.styleable.SdShape_sd_strokeWidth, 0f)
        colorAnimationEnabled = typedArray.getBoolean(R.styleable.SdShape_sd_shapeColorAnimationEnabled, false)

        val shadowAppearance = typedArray.getResourceId(R.styleable.SdShape_sd_shadowAppearance, 0)
        if (shadowAppearance != 0) {
            shadowModel = ShadowModel.obtain(view.context, shadowAppearance)
        }
        val hasShape = typedArray.hasValue(R.styleable.SdShape_sd_shapeAppearance)
        if (hasShape) {
            setShape(ShapeModel.create(view.context, attributeSet, defStyleAttr, defStyleRes))
        }
        typedArray.recycle()
    }

    private fun canCreateShapeBackground() = !backgroundOverwritten

    private companion object {

        private fun Drawable.isShapeable(): Boolean =
            this is ShapeDrawable || (this as? LayerDrawable).isAnyLayerShapeable()

        private fun LayerDrawable?.isAnyLayerShapeable(): Boolean {
            if (this == null) return false
            for (layer in 0 until numberOfLayers) {
                if (getDrawable(layer) is ShapeDrawable) {
                    return true
                }
            }
            return false
        }
    }
}

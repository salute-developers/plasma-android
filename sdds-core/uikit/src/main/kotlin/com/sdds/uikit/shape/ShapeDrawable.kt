package com.sdds.uikit.shape

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Outline
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.Shape
import android.os.Build
import android.util.AttributeSet
import android.util.TypedValue
import androidx.annotation.RequiresApi
import androidx.core.graphics.withTranslation
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.blendColors
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shader.GradientShader
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.shape.ShapeModel.Companion.adjust
import org.xmlpull.v1.XmlPullParser

/**
 * Drawable рисующий форму согласно [ShapeModel].
 * @author Малышев Александр on 29.07.2024
 */
open class ShapeDrawable() : Drawable(), Shapeable {

    private val _drawingBounds: RectF = RectF()
    private var _shapeModel: ShapeModel = ShapeModel()

    private val _strokePaint = Paint()
    private var _boundedOffset: Float = 0f
    private var _strokeWidth: Float = 0f
    private var _strokeTint: ColorStateList? = null

    private val _shapePaint = Paint().configure(color = 0)
    private var _shapeTint: ColorStateList? = null
    private var _shape: Shape? = null

    private var _shaderFactory: ShaderFactory? = null
    private var sdShaderAppearanceRes: TypedValue? = null
    private var sdShaderAppearanceResFallback: Int = 0

    private val _shadowRenderer = ShadowRenderer()

    private val drawStroke: Boolean
        get() = _strokeWidth > 0 && _strokePaint.color != Color.TRANSPARENT

    private var _overriddenAlpha: Int? = null

    private var _animationEnabled: Boolean = false

    private val animator by unsafeLazy {
        ValueAnimator.ofFloat().apply {
            duration = AnimationUtils.DEFAULT_DURATION
            interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
        }
    }

    init {
        initPaint()
    }

    /**
     * Конструктор, создающий [ShapeDrawable] согласно [ShapeModel]
     * @param shapeModel модель, которая описывает форму для [ShapeDrawable]
     * @param strokeTint цвета линии границы
     * @param strokeWidth ширина линии границы
     */
    constructor(
        shapeModel: ShapeModel,
        strokeTint: ColorStateList? = null,
        strokeWidth: Float = 0f,
    ) : this() {
        _shapeModel = shapeModel
        _strokeTint = strokeTint
        _strokeWidth = strokeWidth
    }

    /**
     * Конструктор, создающий [ShapeDrawable] согласно атрибутам [attributeSet] и дефолтным стилям
     * @param context контекст
     * @param attributeSet набор атрибутов
     * @param defStyleAttr атрибут стиля по-умолчанию
     * @param defStyleRes стиль по-умолчанию
     */
    constructor(
        context: Context,
        attributeSet: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0,
    ) : this() {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.SdShape, defStyleAttr, defStyleRes)
        val adjustment = typedArray.getDimension(R.styleable.SdShape_sd_shapeAppearanceAdjustment, 0f)
        _shapeModel = ShapeModel.create(context, typedArray.getResourceId(R.styleable.SdShape_sd_shapeAppearance, 0))
            .adjust(adjustment)
        _strokeTint = typedArray.getColorStateList(R.styleable.SdShape_sd_strokeColor)
        _strokeWidth = typedArray.getDimension(R.styleable.SdShape_sd_strokeWidth, 0f)
        _animationEnabled = typedArray.getBoolean(R.styleable.SdShape_sd_shapeColorAnimationEnabled, false)
        val hasShadowAppearance = typedArray.hasValue(R.styleable.SdShape_sd_shadowAppearance)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P && hasShadowAppearance) {
            _shadowRenderer.setShadowModel(
                ShadowModel.obtain(context, typedArray.getResourceId(R.styleable.SdShape_sd_shadowAppearance, 0)),
            )
        }
        typedArray.recycle()
    }

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeModel

    /**
     * Фабрика для [Shader].
     * Может быть использована для отрисовки градиента.
     * @see GradientShader
     */
    open var shaderFactory: ShaderFactory?
        get() = _shaderFactory
        set(value) {
            if (_shaderFactory != value) {
                _shaderFactory = value
                invalidateSelf()
            }
        }

    /**
     * Устанавливает [ShapeModel] для отрисовки новой формы
     * @param model [ShapeModel]
     */
    open fun setShapeModel(model: ShapeModel) {
        if (_shapeModel != model) {
            _shapeModel = model
            invalidateSelf()
        }
    }

    /**
     * Устанавливает модель теней [ShadowModel]
     */
    @RequiresApi(Build.VERSION_CODES.P)
    open fun setShadowModel(model: ShadowModel?) {
        if (model == null) return
        _shadowRenderer.setShadowModel(model)
    }

    /**
     * Устанавливает ширину линии границы
     * @param width ширина линии
     */
    open fun setStrokeWidth(width: Float) {
        if (_strokeWidth != width) {
            _strokeWidth = width
            _strokePaint.configure(strokeWidth = width)
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвета линии границы
     * @param tint цвета линии
     */
    open fun setStrokeTint(tint: ColorStateList?) {
        if (_strokeTint != tint) {
            _strokeTint = tint
            _strokePaint.color = tint.colorForState(state)
            invalidateSelf()
        }
    }

    /**
     * Включает/выключает анимацию цвета заливки и границы формы
     */
    open fun setColorAnimationEnabled(enabled: Boolean) {
        if (_animationEnabled != enabled) {
            _animationEnabled = enabled
            invalidateSelf()
        }
    }

    internal fun resizeShape(width: Float, height: Float) {
        _shape?.resize(width, height)
        invalidateSelf()
    }

    override fun draw(canvas: Canvas) {
        val shape = _shape ?: return
        canvas.withTranslation(_drawingBounds.left, _drawingBounds.top) {
            _shadowRenderer.render(canvas, shape)
            shape.draw(canvas, _shapePaint)
            if (drawStroke) {
                shape.draw(this, _strokePaint)
            }
        }
    }

    override fun setAlpha(alpha: Int) {
        _overriddenAlpha = alpha
        reapplyAlpha()
    }

    private fun reapplyAlpha() {
        val alpha = _overriddenAlpha ?: return
        _shapePaint.alpha = alpha
        _strokePaint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        _shapePaint.colorFilter = colorFilter
        _strokePaint.colorFilter = colorFilter
    }

    override fun onBoundsChange(bounds: Rect) {
        _drawingBounds.set(bounds)
        if (drawStroke) {
            _boundedOffset = (_strokeWidth).coerceAtMost(bounds.height() / 2f)
            _drawingBounds.left += _boundedOffset
            _drawingBounds.top += _boundedOffset
            _drawingBounds.right -= _boundedOffset
            _drawingBounds.bottom -= _boundedOffset
        }
        _shape = _shapeModel.getShape(_drawingBounds).apply {
            resize(_drawingBounds.width(), _drawingBounds.height())
        }

        if (_shaderFactory != null) {
            _shapePaint.color = -1
            _shapePaint.shader = _shaderFactory?.resize(_drawingBounds.width(), _drawingBounds.height())
            reapplyAlpha()
        }
    }

    override fun setTintList(tint: ColorStateList?) {
        super.setTintList(tint)
        if (_shapeTint != tint) {
            _shapeTint = tint
            if (_shaderFactory == null) {
                _shapePaint.color = tint.colorForState(state)
                reapplyAlpha()
                invalidateSelf()
            }
        }
    }

    override fun isStateful(): Boolean {
        return _shaderFactory == null && (_shapeTint != null || _strokeTint != null)
    }

    @Deprecated("Deprecated in Java")
    override fun getOpacity(): Int =
        when (_overriddenAlpha) {
            255 -> PixelFormat.OPAQUE
            in 1..254 -> PixelFormat.TRANSLUCENT
            else -> PixelFormat.TRANSPARENT
        }

    override fun getOutline(outline: Outline) {
        if (_shapeModel.cornerFamily == ShapeModel.CornerFamily.ROUNDED) {
            val topLeftResolved = _shapeModel.cornerSizeTopLeft.getSize(_drawingBounds)
            outline.setRoundRect(bounds, topLeftResolved)
            return
        } else {
            super.getOutline(outline)
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        animator.cancel()
        val borderColor = _strokeTint.colorForState(state)
        var stateChanged = false
        if (borderColor != _strokePaint.color) {
            stateChanged = true
        }

        var fillColor: Int? = null
        if (_shaderFactory == null) {
            fillColor = _shapeTint.colorForState(state)
            if (fillColor != _shapePaint.color) {
                stateChanged = true
            }
        }
        if (stateChanged) {
            reapplyAlpha()
            updateColors(borderColor, fillColor)
            invalidateSelf()
        }
        return super.onStateChange(state) || stateChanged
    }

    override fun inflate(
        r: Resources,
        parser: XmlPullParser,
        attrs: AttributeSet,
        theme: Resources.Theme?,
    ) {
        super.inflate(r, parser, attrs, theme)

        val themeTypedArray = theme?.obtainStyledAttributes(
            attrs,
            R.styleable.SdShader,
            0,
            0,
        ) ?: r.obtainAttributes(
            attrs,
            R.styleable.SdShader,
        )
        val typedValue = TypedValue()
        val getValueResult = themeTypedArray.getValue(R.styleable.SdShader_sd_shaderAppearance, typedValue)
        sdShaderAppearanceResFallback = themeTypedArray.getResourceId(R.styleable.SdShader_sd_shaderAppearance, 0)

        if (getValueResult) sdShaderAppearanceRes = typedValue

        themeTypedArray.recycle()
        if (theme != null) applyTheme(theme) // принудительный вызов applyTheme() для preview
    }

    override fun canApplyTheme(): Boolean = true

    override fun applyTheme(t: Resources.Theme) {
        super.applyTheme(t)

        var shaderAppearance = sdShaderAppearanceRes
        if (shaderAppearance != null && shaderAppearance.type == TypedValue.TYPE_ATTRIBUTE) {
            val outTypedValue = TypedValue()
            t.resolveAttribute(shaderAppearance.data, outTypedValue, true)
            shaderAppearance = outTypedValue
        }
        val resId = shaderAppearance?.data ?: sdShaderAppearanceResFallback
        shaderFactory = GradientShader.obtain(t, resId)
    }

    private fun initPaint() {
        _strokePaint.configure(
            style = Paint.Style.STROKE,
            color = _strokeTint.colorForState(state),
            strokeWidth = _strokeWidth,
            isAntiAlias = true,
        )
        _shapePaint.configure(
            style = Paint.Style.FILL,
            color = _shapeTint.colorForState(state),
            isAntiAlias = true,
        )
    }

    private fun updateColors(borderColor: Int, fillColor: Int?) {
        if (!_animationEnabled) {
            if (fillColor != null) {
                _shapePaint.color = fillColor
            }
            _strokePaint.color = borderColor
            return
        }
        animator.apply {
            setFloatValues(0f, 1f)
            val currentFillColor = _shapePaint.color
            val currentStrokeColor = _strokePaint.color
            removeAllUpdateListeners()
            addUpdateListener {
                if (fillColor != null) {
                    _shapePaint.color = blendColors(currentFillColor, fillColor, it.animatedFraction)
                }
                _strokePaint.color = blendColors(currentStrokeColor, borderColor, it.animatedFraction)
                invalidateSelf()
            }
            start()
        }
    }

    internal enum class GradientType {
        NONE,
        LINEAR,
        RADIAL,
        SWEEP,
        SOLID,
    }
}

package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Shader
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import androidx.annotation.ColorInt
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.internal.base.lerp
import com.sdds.uikit.shader.GradientShader
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.statelist.ColorValueHolder
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import kotlin.math.roundToInt

/**
 * Контейнер для отрисовки эффекта мерцания.
 * Если установить цвет, то эффект мерцания будет достигаться за счет изменения альфы установленного цвета.
 * Если установить градиент (шейдер), то эффект мерцания будет достигаться за счет перемещения прямоугольника с примененным шейдером.
 *
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 30.05.2025
 */
open class ShimmerLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val shimmerPaint = Paint()

    @ColorInt
    private var shimmerColor: Int? = null
    private var shimmerShaderFactory: ShaderFactory? = null
    private var shimmerShader: Shader? = null
    private val shaderMatrix: Matrix = Matrix()
    private var _autoStart: Boolean = false
    private var _shimmerList: ColorValueStateList? = null

    private var shimmerDuration: Long = DEFAULT_DURATION.toLong()

    private var shimmerFraction = 0f
    private val shimmerAnimationWidth = Resources.getSystem().displayMetrics.widthPixels.toFloat()

    private val isBlinkingShimmer: Boolean
        get() = shimmerColor != null

    private val baseAnimator: ValueAnimator = ValueAnimator.ofFloat(1f).apply {
        duration = shimmerDuration
        repeatCount = ValueAnimator.INFINITE
        interpolator = LinearInterpolator()
        addUpdateListener {
            shimmerFraction = it.animatedValue as Float
            invalidate()
        }
    }

    private val animator: ValueAnimator
        get() = baseAnimator.apply {
            repeatMode = if (isBlinkingShimmer) ValueAnimator.REVERSE else ValueAnimator.RESTART
        }

    /**
     * Включает/выключает автоматический запуск анимации эффекта мерцания
     */
    open var autoStart: Boolean
        get() = _autoStart
        set(value) {
            if (_autoStart != value) {
                _autoStart = value
            }
        }

    /**
     * Возвращает `true`, если анимация эффекта мерцания запущена
     */
    val isShimmerStarted: Boolean
        get() = animator.isRunning

    init {
        setWillNotDraw(false)
        @Suppress("UseCompatLoadingForDrawables")
        context.withStyledAttributes(attrs, R.styleable.ShimmerLayout, defStyleAttr, defStyleRes) {
            _autoStart = getBoolean(R.styleable.ShimmerLayout_sd_autoStart, false)
            setShimmerDuration(getInt(R.styleable.ShimmerLayout_sd_shimmerDuration, DEFAULT_DURATION).toLong())
            _shimmerList = getColorValueStateList(context, R.styleable.ShimmerLayout_sd_shimmer)
        }
    }

    /**
     * Устанавливает список [ColorValueStateList] для эффекта мерцания.
     * В указанном [list] может быть либо ссылка на [ShapeDrawable] с установленным [ShaderFactory], либо ссылка
     * на стиль шейдера, либо на цвет.
     */
    fun setShimmerShaderList(list: ColorValueStateList?) {
        if (_shimmerList != list) {
            _shimmerList = list
            updateShaderFactory()
            updateColor()
            invalidate()
        }
    }

    /**
     * Устанавливает [ShaderFactory] для эффекта мерцания.
     * [ShaderFactory] должен вернуть градиент, который будет использован для отрисовки эффекта мерцания.
     * @see ShaderFactory
     */
    fun setShimmerShader(shaderFactory: ShaderFactory) {
        shimmerShaderFactory = shaderFactory
        shimmerColor = null
        createShader()
        invalidate()
    }

    /**
     * Устанавливает цвет [color] для эффекта мерцания.
     */
    fun setShimmerColor(@ColorInt color: Int) {
        shimmerColor = color
        shimmerShaderFactory = null
        invalidate()
    }

    /**
     * Устанавливает [durationMillis] - длительность анимации эффекта мерцания в миллисекундах.
     * Длительность должна быть ус
     */
    fun setShimmerDuration(durationMillis: Long) {
        if (shimmerDuration != durationMillis) {
            shimmerDuration = durationMillis
            animator.duration = durationMillis
            if (isShimmerStarted) {
                stopShimmer()
                startShimmer()
            }
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (_autoStart) {
            post { startShimmer() }
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        createShader()
    }

    private fun createShader() {
        (shimmerShaderFactory as? GradientShader)?.setTileMode(Shader.TileMode.MIRROR)
        shimmerShader = shimmerShaderFactory?.resize(
            (Resources.getSystem().displayMetrics.widthPixels).toFloat(),
            measuredHeight.toFloat(),
        )
        shimmerPaint.shader = shimmerShader
        shimmerPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_OVER)
    }

    /**
     * Запускает анимацию эффекта мерцания
     */
    open fun startShimmer() {
        animator.cancel()
        animator.start()
    }

    /**
     * Останавливает анимацию эффекта мерцания
     */
    open fun stopShimmer() {
        animator.cancel()
    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
        shimmerShader?.let {
            shaderMatrix.setTranslate(
                lerp(-shimmerAnimationWidth, shimmerAnimationWidth, shimmerFraction),
                0f,
            )
            it.setLocalMatrix(shaderMatrix)
            shimmerPaint.shader = it
            canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), shimmerPaint)
        }
        shimmerColor?.let {
            shimmerPaint.color = it
            shimmerPaint.alpha = lerp(
                a = shimmerPaint.alpha,
                b = shimmerPaint.alpha + alphaFloatToInt(DEFAULT_BLINK_ALPHA_DELTA),
                fraction = shimmerFraction,
            )
            canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), shimmerPaint)
        }
    }

    private fun alphaFloatToInt(alpha: Float): Int {
        return (alpha.coerceIn(0f, 1f) * 255).roundToInt()
    }

    override fun onDetachedFromWindow() {
        stopShimmer()
        super.onDetachedFromWindow()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        updateShaderFactory()
        updateColor()
    }

    private fun updateShaderFactory() {
        val shimmer = _shimmerList?.getValueForState(drawableState)
        shimmerShaderFactory = when (shimmer) {
            is ColorValueHolder.DrawableValue -> (shimmer.value as? ShapeDrawable)?.shaderFactory
            is ColorValueHolder.ShaderValue -> shimmer.value
            else -> null
        }
    }

    private fun updateColor() {
        val shimmer = _shimmerList?.getValueForState(drawableState)
        shimmerColor = when (shimmer) {
            is ColorValueHolder.ColorValue -> shimmer.value
            is ColorValueHolder.ColorListValue -> shimmer.value.defaultColor
            else -> null
        }
    }

    private companion object {
        const val DEFAULT_DURATION = 1000
        const val DEFAULT_BLINK_ALPHA_DELTA = 0.08f
    }
}

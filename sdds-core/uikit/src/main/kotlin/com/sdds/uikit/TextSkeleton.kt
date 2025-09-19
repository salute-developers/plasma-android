package com.sdds.uikit

import android.content.Context
import android.text.TextPaint
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.TextAppearance
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.sp
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.shape.shapeHelper
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import kotlin.math.roundToInt
import kotlin.random.Random

/**
 * Компонент - заглушка, может отображать заданное количество
 * RectSkeleton, с эффектом мерцания.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class TextSkeleton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_textSkeletonStyle,
    defStyleRes: Int = R.style.Sdds_Components_TextSkeleton,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    private val _shapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)
    private var _lineCount: Int = 0
    private var _textAppearanceRes: Int = 0
    private var _lineWidthProvider: SkeletonLineWidthProvider = SkeletonLineWidthProvider.RandomDeviation()
    private var _resolvedLineHeight: Int = 0
    private var _resolvedTextSize: Int = 0
    private var _fontCallback: CancelableFontCallback? = null
    private var _autoStart: Boolean = false
    private var _shimmerList: ColorValueStateList? = null
    private var _shimmerDuration: Long = DEFAULT_DURATION.toLong()

    /**
     * Состояние внешнего вида компонента [TextSkeleton]
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    /**
     * Включает/выключает автоматический запуск анимации эффекта мерцания
     */
    open var autoStart: Boolean
        get() = _autoStart
        set(value) {
            if (_autoStart != value) {
                _autoStart = value
                modifyChildren { it.autoStart = value }
            }
        }

    /**
     * Возвращает `true`, если анимация эффекта мерцания запущена
     */
    val isShimmerStarted: Boolean
        get() = children.any { (it as? RectSkeleton)?.isShimmerStarted == true }

    /**
     * Количество, отображаемых строк.
     */
    open var lineCount: Int
        get() = _lineCount
        set(value) {
            if (_lineCount != value) {
                _lineCount = value
                placeSkeletons()
            }
        }

    /**
     * Провайдер ширины строк [SkeletonLineWidthProvider].
     */
    open var lineWidthProvider: SkeletonLineWidthProvider
        get() = _lineWidthProvider
        set(value) {
            if (_lineWidthProvider != value) {
                _lineWidthProvider = value
                placeSkeletons()
            }
        }

    /**
     * Устанавливает стиль текста по id ресурса.
     * На основе стиля рассчитывается высота и оступы между строками.
     */
    fun setTextAppearance(@StyleRes resId: Int) {
        if (_textAppearanceRes != resId) {
            _textAppearanceRes = resId
            resolveTextMeasurements { placeSkeletons() }
        }
    }

    /**
     * Запускает анимацию эффекта мерцания
     */
    open fun startShimmer() {
        modifyChildren { it.startShimmer() }
    }

    /**
     * Останавливает анимацию эффекта мерцания
     */
    open fun stopShimmer() {
        modifyChildren { it.stopShimmer() }
    }

    /**
     * Устанавливает [ShaderFactory] для эффекта мерцания.
     * [ShaderFactory] должен вернуть градиент, который будет использован для отрисовки эффекта мерцания.
     * @see ShaderFactory
     */
    fun setShimmerShader(shaderFactory: ShaderFactory) {
        modifyChildren { it.setShimmerShader(shaderFactory) }
    }

    /**
     * Устанавливает [durationMillis] - длительность анимации эффекта мерцания в миллисекундах.
     * Длительность должна быть ус
     */
    fun setShimmerDuration(durationMillis: Long) {
        modifyChildren { it.setShimmerDuration(durationMillis) }
    }

    init {
        orientation = VERTICAL
        context.withStyledAttributes(attrs, R.styleable.TextSkeleton, defStyleAttr, defStyleRes) {
            _lineCount = getInt(R.styleable.TextSkeleton_sd_lineCount, 0)
            _autoStart = getBoolean(R.styleable.TextSkeleton_sd_autoStart, false)
            _shimmerDuration = (getInt(R.styleable.TextSkeleton_sd_shimmerDuration, DEFAULT_DURATION).toLong())
            _shimmerList = getColorValueStateList(context, R.styleable.TextSkeleton_sd_shimmer)
            setTextAppearance(getResourceId(R.styleable.TextSkeleton_android_textAppearance, 0))
        }
    }

    private fun modifyChildren(block: (ShimmerLayout) -> Unit) {
        children.filterIsInstance<ShimmerLayout>().forEach(block)
    }

    private fun placeSkeletons() {
        removeAllViews()
        if (lineCount < 1) return
        repeat(lineCount) { lineIndex ->
            val widthFactor = lineWidthProvider.widthFactor(lineIndex, lineCount)
            val skeletonView = createSkeletonItem(widthFactor)
            addView(skeletonView)
        }
    }

    private fun resolveTextMeasurements(onResolve: () -> Unit) {
        val textPaint = TextPaint()
        var textAppearance: TextAppearance? = null
        _fontCallback?.cancel()

        val apply = {
            applyTextMeasurement(textPaint, textAppearance)
            onResolve()
        }
        _fontCallback = textPaint.applyTextAppearance(
            context = context,
            styleId = _textAppearanceRes,
            tCallback = { textAppearance = it },
            applyFont = { apply() },
        )
        apply()
    }

    private fun applyTextMeasurement(textPaint: TextPaint, textAppearance: TextAppearance?) {
        val fontMetrics = textPaint.fontMetrics
        val natural = (fontMetrics.descent - fontMetrics.ascent + fontMetrics.leading).roundToInt()
        val lineHeight = textAppearance?.lineHeight?.roundToInt() ?: 16.sp
        _resolvedTextSize = textAppearance?.textSize?.roundToInt() ?: 20.sp
        _resolvedLineHeight = maxOf(natural, lineHeight)
    }

    private fun createSkeletonItem(widthFactor: Float): ShimmerLayout {
        val lineSpacing = _resolvedLineHeight - _resolvedTextSize
        return object : RectSkeleton(context) {
            override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec)
                setMeasuredDimension((measuredWidth * widthFactor).roundToInt(), measuredHeight)
            }
        }.apply {
            setShape(_shapeHelper.shape)
            setShimmerShaderList(_shimmerList)
            setShimmerDuration(_shimmerDuration)
            autoStart = this@TextSkeleton.autoStart
            colorState = this@TextSkeleton.colorState
            layoutParams = LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                _resolvedTextSize,
            ).apply {
                val halfSpacing = (lineSpacing / 2f).roundToInt()
                topMargin = halfSpacing
                bottomMargin = halfSpacing
            }
        }
    }

    private companion object {
        const val DEFAULT_DURATION = 1000
    }
}

/**
 * Предоставлет ширину строки в [TextSkeleton]
 */
interface SkeletonLineWidthProvider {

    /**
     * Предоставлет ширину строки под индексом [lineIndex], как процент от ширины компонента
     *
     * @param lineIndex номер строки
     * @param lineCount количество строк
     */
    fun widthFactor(lineIndex: Int, lineCount: Int): Float

    /**
     * Всегда возвращает ширину строки равную ширине компонента
     */
    object FillMaxWidth : SkeletonLineWidthProvider {
        override fun widthFactor(lineIndex: Int, lineCount: Int): Float = 1f
    }

    /**
     * Возвращает ширину строки [lineWidth] от ширины компонента + псевдослучайное отклонение [lineWidthDeviation].
     * Для последней строки вернет [lastLineWidth] от ширины компонента + псевдослучайное отклонение [lastLineWidthDeviation]
     */
    class RandomDeviation(
        private val lineWidth: Float = 0.9f,
        private val lineWidthDeviation: Float = 0.05f,
        private val lastLineWidth: Float = 0.5f,
        private val lastLineWidthDeviation: Float = 0.15f,
        private val random: Random = Random(seed = 123456789),
    ) : SkeletonLineWidthProvider {

        override fun widthFactor(lineIndex: Int, lineCount: Int): Float {
            val result = if (lineIndex != lineCount - 1) {
                lineWidth + randomFloatInRange(-lineWidthDeviation, lineWidthDeviation)
            } else {
                lastLineWidth + randomFloatInRange(-lastLineWidthDeviation, lastLineWidthDeviation)
            }
            return result
        }

        private fun randomFloatInRange(min: Float, max: Float): Float {
            val randomF = random.nextFloat()
            return min + randomF * (max - min)
        }
    }
}

package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.TextAppearance
import com.sdds.uikit.internal.base.sp
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
    private val attrs: AttributeSet? = null,
    private val defStyleAttr: Int = R.attr.sd_textSkeletonStyle,
    private val defStyleRes: Int = R.style.Sdds_Components_TextSkeleton,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    private var _lineCount: Int = 0
    private var _textAppearance: TextAppearance? = null
    private var _textAppearanceRes: Int = 0
    private var _lineWidthProvider: SkeletonLineWidthProvider = SkeletonLineWidthProvider.RandomDeviation()

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
            _textAppearance = TextAppearance(context, resId)
            placeSkeletons()
        }
    }

    init {
        orientation = VERTICAL
        context.withStyledAttributes(attrs, R.styleable.TextSkeleton, defStyleAttr, defStyleRes) {
            _lineCount = getInt(R.styleable.TextSkeleton_sd_lineCount, 0)
            _textAppearanceRes = getResourceId(R.styleable.TextSkeleton_android_textAppearance, 0)
            if (_textAppearanceRes != 0) {
                _textAppearance = TextAppearance(context, _textAppearanceRes)
            }
        }
    }

    private fun placeSkeletons() {
        removeAllViews()
        if (lineCount < 1) return
        val textSize = (_textAppearance?.textSize)?.toInt() ?: 16.sp
        val lineHeight = (_textAppearance?.lineHeight)?.toInt() ?: 24.sp
        val lineSpacing = lineHeight - textSize
        repeat(lineCount) { lineIndex ->
            val widthFactor = lineWidthProvider.widthFactor(lineIndex, lineCount)
            val skeletonView = object : ShimmerLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {
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

                override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec)
                    setMeasuredDimension((measuredWidth * widthFactor).roundToInt(), measuredHeight)
                }
            }.apply {
                layoutParams = LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    textSize,
                ).apply {
                    if (lineIndex > 0) topMargin = lineSpacing
                }
            }
            addView(skeletonView)
        }
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

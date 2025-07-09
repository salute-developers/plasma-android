package com.sdds.uikit

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.util.TypedValue
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.internal.base.TextAppearance
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
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var _lineCount: Int = 0
    private var _textAppearance: TextAppearance? = null
    private var _textAppearanceRes: Int = 0
    private var _lineWidthProvider: SkeletonLineWidthProvider = SkeletonLineWidthProvider.RandomDeviation()

    private val Int.sp: Int
        get() = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            this.toFloat(),
            Resources.getSystem().displayMetrics,
        ).toInt()

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
            val skeletonView = ShimmerLayout(context, attrs, defStyleAttr, defStyleRes).apply {
                layoutParams = LayoutParams(
                    (resources.displayMetrics.widthPixels * widthFactor).toInt(),
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

package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.Dimension
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageView
import com.sdds.uikit.internal.base.shape.ShapeableImageDelegate
import com.sdds.uikit.internal.focusselector.tryApplyFocusSelector
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент для отображения изображений.
 * Поддерживает установку внутренних отступов только для контента (app:sd_contentPadding и т.д.).
 * Внутренние отступы для контента не применяются на фон (android:background).
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 03.06.2024
 */
open class ImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AppCompatImageView(context, attrs, defStyleAttr), ViewStateHolder {

    private var hasAdjustedPaddingAfterLayoutDirectionResolved = false

    private var _shapeableImageDelegate: ShapeableImageDelegate? = null
    private var _contentPaddingStart: Int = 0
    private var _contentPaddingEnd: Int = 0
    private var _contentPaddingLeft: Int = 0
    private var _contentPaddingTop: Int = 0
    private var _contentPaddingRight: Int = 0
    private var _contentPaddingBottom: Int = 0

    init {
        @Suppress("LeakingThis")
        setLayerType(LAYER_TYPE_HARDWARE, null)
        tryApplyFocusSelector(attrs, defStyleAttr)
        obtainAttributes(attrs, defStyleAttr)
    }

    /**
     * Внутренний отступ контента в начале.
     */
    open val contentPaddingStart: Int
        get() = when {
            _contentPaddingStart != UNDEFINED_PADDING -> _contentPaddingStart
            isRtl() -> _contentPaddingRight
            else -> _contentPaddingLeft
        }

    /**
     * Внутренний отступ контента в конце.
     */
    open val contentPaddingEnd: Int
        get() = when {
            _contentPaddingEnd != UNDEFINED_PADDING -> _contentPaddingEnd
            isRtl() -> _contentPaddingLeft
            else -> _contentPaddingRight
        }

    /**
     * Внутренний отступ контента слева.
     */
    open val contentPaddingLeft: Int
        get() {
            if (isContentPaddingRelative()) {
                if (isRtl() && _contentPaddingEnd != UNDEFINED_PADDING) {
                    return _contentPaddingEnd
                } else if (!isRtl() && _contentPaddingStart != UNDEFINED_PADDING) {
                    return _contentPaddingStart
                }
            }

            return _contentPaddingLeft
        }

    /**
     * Внутренний отступ контента вверху.
     */
    open val contentPaddingTop: Int
        get() = _contentPaddingTop

    /**
     * Внутренний отступ контента справа.
     */
    open val contentPaddingRight: Int
        get() {
            if (isContentPaddingRelative()) {
                if (isRtl() && _contentPaddingStart != UNDEFINED_PADDING) {
                    return _contentPaddingStart
                } else if (!isRtl() && _contentPaddingEnd != UNDEFINED_PADDING) {
                    return _contentPaddingEnd
                }
            }
            return _contentPaddingRight
        }

    /**
     * Внутренний отступ контента внизу.
     */
    open val contentPaddingBottom: Int
        get() = _contentPaddingBottom

    /**
     * Состояние внешнего вида изображения
     * @see ViewState
     */
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Устанавливает ширину границы [ImageView].
     * @param strokeWidth ширина границы кнопки
     */
    open fun setStrokeWidth(strokeWidth: Float) {
        this._shapeableImageDelegate?.setStrokeWidth(strokeWidth, true)
    }

    /**
     * Устанавливает цвет границы [ImageView].
     * @param color цвет границы
     */
    open fun setStrokeColor(@ColorInt color: Int) {
        setStrokeColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет линии границы [ImageView] из ресурсов
     * @param colorRes цвета линии границы
     */
    open fun setStrokeColorResources(@ColorRes colorRes: Int) {
        setStrokeColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета границы [ImageView] согласно состоянию [getDrawableState].
     * @param colorStateList цвета границы
     */
    open fun setStrokeColorList(colorStateList: ColorStateList) {
        this._shapeableImageDelegate?.setStrokeColor(colorStateList, true)
    }

    /**
     * Устанавливает внутренние отступы для контента. Эти отступы не применяют к фону.
     * @param left отступ слева в px
     * @param top отступ сверху в px
     * @param right отступ справа в px
     * @param bottom отступ снизу в px
     */
    open fun setContentPadding(
        @Dimension left: Int,
        @Dimension top: Int,
        @Dimension right: Int,
        @Dimension bottom: Int,
    ) {
        _contentPaddingStart = UNDEFINED_PADDING
        _contentPaddingEnd = UNDEFINED_PADDING

        super.setPadding(
            super.getPaddingLeft() - _contentPaddingLeft + left,
            super.getPaddingTop() - _contentPaddingTop + top,
            super.getPaddingRight() - _contentPaddingRight + right,
            super.getPaddingBottom() - _contentPaddingBottom + bottom,
        )

        _contentPaddingLeft = left
        _contentPaddingTop = top
        _contentPaddingRight = right
        _contentPaddingBottom = bottom
    }

    /**
     * Устанавливает внутренние отступы для контента относительно [getLayoutDirection].
     * Эти отступы не применяют к фону.
     * @param start отступ в начале в px
     * @param top отступ сверху в px
     * @param end отступ в конце в px
     * @param bottom отступ снизу в px
     */
    open fun setContentPaddingRelative(
        @Dimension start: Int,
        @Dimension top: Int,
        @Dimension end: Int,
        @Dimension bottom: Int,
    ) {
        super.setPaddingRelative(
            super.getPaddingStart() - contentPaddingStart + start,
            super.getPaddingTop() - _contentPaddingTop + top,
            super.getPaddingEnd() - contentPaddingEnd + end,
            super.getPaddingBottom() - _contentPaddingBottom + bottom,
        )
        _contentPaddingLeft = if (isRtl()) end else start
        _contentPaddingTop = top
        _contentPaddingRight = if (isRtl()) start else end
        _contentPaddingBottom = bottom
    }

    /**
     * Устанавливает отступы, которые применяются к фону и контенту.
     * @param left отступ слева в px
     * @param top отступ сверху в px
     * @param right отступ справа в px
     * @param bottom отступ снизу в px
     */
    override fun setPadding(
        @Dimension left: Int,
        @Dimension top: Int,
        @Dimension right: Int,
        @Dimension bottom: Int,
    ) {
        super.setPadding(
            left + contentPaddingLeft,
            top + contentPaddingTop,
            right + contentPaddingRight,
            bottom + contentPaddingBottom,
        )
    }

    /**
     * Устанавливает отступы согласно [getLayoutDirection], которые применяются к фону и контенту.
     * @param start отступ слева в px
     * @param top отступ сверху в px
     * @param end отступ справа в px
     * @param bottom отступ снизу в px
     */
    override fun setPaddingRelative(
        @Dimension start: Int,
        @Dimension top: Int,
        @Dimension end: Int,
        @Dimension bottom: Int,
    ) {
        super.setPaddingRelative(
            start + contentPaddingStart,
            top + contentPaddingTop,
            end + contentPaddingEnd,
            bottom + contentPaddingBottom,
        )
    }

    /**
     * Возвращает отступ снизу, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingBottom(): Int {
        return super.getPaddingBottom() - contentPaddingBottom
    }

    /**
     * Возвращает отступ в конце, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingEnd(): Int {
        return super.getPaddingEnd() - contentPaddingEnd
    }

    /**
     * Возвращает отступ слева, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingLeft(): Int {
        return super.getPaddingLeft() - contentPaddingLeft
    }

    /**
     * Возвращает отступ справа, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingRight(): Int {
        return super.getPaddingRight() - contentPaddingRight
    }

    /**
     * Возвращает отступ в начале, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingStart(): Int {
        return super.getPaddingStart() - contentPaddingStart
    }

    /**
     * Возвращает отступ сверху, который применяется к контенту и фону
     */
    @Dimension
    override fun getPaddingTop(): Int {
        return super.getPaddingTop() - contentPaddingTop
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        return drawableState
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _shapeableImageDelegate?.draw(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (hasAdjustedPaddingAfterLayoutDirectionResolved || !isLayoutDirectionResolved) {
            return
        }

        hasAdjustedPaddingAfterLayoutDirectionResolved = true

        if (isPaddingRelative || isContentPaddingRelative()) {
            setPaddingRelative(
                super.getPaddingStart(),
                super.getPaddingTop(),
                super.getPaddingEnd(),
                super.getPaddingBottom(),
            )
            return
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _shapeableImageDelegate?.updateShapeMask(w, h)
    }

    override fun onDetachedFromWindow() {
        setLayerType(LAYER_TYPE_NONE, null)
        super.onDetachedFromWindow()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        setLayerType(LAYER_TYPE_HARDWARE, null)
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ImageView, defStyleAttr, -1)

        val contentPadding = typedArray.getDimensionPixelOffset(R.styleable.ImageView_sd_contentPadding, 0)
        _contentPaddingLeft = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingLeft,
            contentPadding,
        )
        _contentPaddingTop = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingTop,
            contentPadding,
        )
        _contentPaddingRight = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingRight,
            contentPadding,
        )
        _contentPaddingBottom = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingBottom,
            contentPadding,
        )
        _contentPaddingStart = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingStart,
            contentPadding,
        )
        _contentPaddingEnd = typedArray.getDimensionPixelSize(
            R.styleable.ImageView_sd_contentPaddingEnd,
            contentPadding,
        )

        val shapeResId = typedArray.getResourceId(R.styleable.ImageView_sd_shapeAppearance, 0)
        if (shapeResId != 0) {
            _shapeableImageDelegate = ShapeableImageDelegate(this)
                .apply { setShape(shapeResId) }
        }
        _shapeableImageDelegate?.apply {
            val strokeWidth = typedArray.getDimension(R.styleable.ImageView_sd_strokeWidth, 0f)
            setStrokeWidth(strokeWidth)
            val strokeColor = typedArray.getColorStateList(R.styleable.ImageView_sd_strokeColor)
            setStrokeColor(strokeColor)
        }
        typedArray.recycle()
    }

    private fun isContentPaddingRelative(): Boolean {
        return _contentPaddingStart != UNDEFINED_PADDING || _contentPaddingEnd != UNDEFINED_PADDING
    }

    private fun isRtl(): Boolean {
        return layoutDirection == LAYOUT_DIRECTION_RTL
    }

    companion object {
        private const val UNDEFINED_PADDING = Int.MIN_VALUE
    }
}

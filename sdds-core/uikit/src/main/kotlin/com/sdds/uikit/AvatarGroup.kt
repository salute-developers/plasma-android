package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Path
import android.graphics.Region
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import androidx.core.view.ViewCompat
import androidx.core.view.isGone
import com.sdds.uikit.internal.base.shape.ShapeHelper

/**
 * Компонент [AvatarGroup] предназначен для компоновки нескольких компонентов [Avatar] вместе.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 16.07.2024
 */
open class AvatarGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_avatarGroupStyle,
) : ViewGroup(context, attrs, defStyleAttr) {

    private val clipPath: Path = Path()
    private val transformPath: Path = Path()
    private val clipMatrix: Matrix = Matrix()

    private var _spacing = 0
    private var _itemOffset = 0
    private var _threshold = DEFAULT_THRESHOLD

    private var _counterBackground: Drawable? = null

    @StyleRes
    private var _counterTextAppearanceId: Int = 0
    private var _counter: Avatar? = null
    private var _counterTextColor: ColorStateList? = null

    @ColorInt
    private var _counterTextColorStart: Int = 0

    @ColorInt
    private var _counterTextColorEnd: Int = 0

    private var _adapter: Adapter? = null
    private var _avatarPool: Array<Avatar?>? = null
    private var _avatarStyleOverlay: Int = 0

    init {
        obtainAttributes(context, attrs, defStyleAttr)
        @Suppress("LeakingThis")
        ShapeHelper(this, attrs, defStyleAttr)
    }

    /**
     * Адаптер для связывания пользовательских данных и компонентов [Avatar]
     */
    var adapter: Adapter?
        get() = _adapter
        set(value) {
            if (_adapter != value) {
                if (value != null) {
                    _adapter = value
                    _adapter?.attachAvatarGroup(this)
                } else {
                    _adapter?.detachAvatarGroup()
                    _adapter = null
                }
                repopulate()
            }
        }

    /**
     * Максимальное кол-во отображаемых [Avatar] в [AvatarGroup]
     */
    var threshold: Int
        get() = _threshold
        set(value) {
            if (_threshold != value) {
                _threshold = value
                repopulate()
            }
        }

    internal fun repopulate() {
        this.removeAllViews()
        val adapter = this.adapter ?: return
        val itemsCount = adapter.getCount()
        val useCount = itemsCount.coerceAtMost(_threshold)
        if (!adapter.isAttached || itemsCount == 0) {
            _avatarPool = null
            return
        }
        val pool = getPool(useCount)
        val themeOverlay = if (_avatarStyleOverlay != 0) ContextThemeWrapper(context, _avatarStyleOverlay) else context
        for (index in 0 until useCount) {
            val avatarView = pool.getOrNull(index)
                ?: adapter.onCreateAvatarView(index, themeOverlay)
                    .also { pool[index] = it }
            addView(avatarView)
            adapter.onBindAvatar(avatarView, index)
        }
        val count = itemsCount - _threshold
        if (count > 0) {
            updateCounter(count)
            addView(_counter)
        }
    }

    override fun addView(child: View?, index: Int, params: LayoutParams?) {
        if (child !is Avatar) return
        child.status = Avatar.Status.NONE
        child.actionEnabled = false
        super.addView(child, index, params)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        var totalWidth = paddingStart + paddingEnd
        var totalHeight = 0

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            measureChild(child, widthMeasureSpec, heightMeasureSpec)

            totalHeight = maxOf(totalHeight, child.measuredHeight)

            totalWidth += if (index < childCount - 1) {
                _itemOffset + _spacing
            } else {
                child.measuredWidth
            }
        }

        totalHeight += paddingTop + paddingBottom

        val desiredWidth = when (widthMode) {
            MeasureSpec.EXACTLY -> specWidth
            MeasureSpec.AT_MOST -> minOf(totalWidth, specWidth)
            else -> totalWidth
        }

        val desiredHeight = when (heightMode) {
            MeasureSpec.EXACTLY -> specHeight
            MeasureSpec.AT_MOST -> minOf(totalHeight, specHeight)
            else -> totalHeight
        }

        setMeasuredDimension(desiredWidth, desiredHeight)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var childTop: Int
        var childLeft = paddingStart
        val isLayoutRtl = layoutDirection == ViewCompat.LAYOUT_DIRECTION_RTL
        val startIndex = if (isLayoutRtl) childCount - 1 else 0
        val direction = if (isLayoutRtl) -1 else 1
        for (index in 0 until childCount) {
            val child = getChildAt(startIndex + direction * index)
            if (child.isGone) continue
            childTop = paddingTop
            child.layout(childLeft, childTop, childLeft + child.measuredWidth, childTop + child.measuredHeight)
            childLeft += (_itemOffset + _spacing)
        }
    }

    @Suppress("DEPRECATION")
    override fun drawChild(canvas: Canvas, child: View?, drawingTime: Long): Boolean {
        val avatar = child as? Avatar ?: return false
        val isLastChild = indexOfChild(child) == (childCount - 1)
        if (isLastChild) {
            return super.drawChild(canvas, child, drawingTime)
        }
        resetClip(avatar)
        val saveCount = canvas.save()
        canvas.clipPath(clipPath, Region.Op.DIFFERENCE)
        val invalidate = super.drawChild(canvas, child, drawingTime)
        canvas.restoreToCount(saveCount)
        return invalidate
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.AvatarGroup, defStyleAttr, -1)
        _spacing = typedArray.getDimensionPixelSize(R.styleable.AvatarGroup_sd_itemSpacing, 0)
        _itemOffset = typedArray.getDimensionPixelSize(R.styleable.AvatarGroup_sd_itemOffset, 0)
        _threshold = typedArray.getInt(R.styleable.AvatarGroup_sd_threshold, DEFAULT_THRESHOLD)
        _counterBackground = typedArray.getDrawable(R.styleable.AvatarGroup_sd_counterBackground)
        _counterTextAppearanceId = typedArray.getResourceId(R.styleable.AvatarGroup_sd_counterTextAppearance, 0)
        _counterTextColorStart = typedArray.getColor(R.styleable.AvatarGroup_sd_counterTextColorStart, 0)
        _counterTextColorEnd = typedArray.getColor(R.styleable.AvatarGroup_sd_counterTextColorEnd, 0)
        _counterTextColor = typedArray.getColorStateList(R.styleable.AvatarGroup_sd_counterTextColor)
        _avatarStyleOverlay = typedArray.getResourceId(R.styleable.AvatarGroup_sd_avatarStyleOverlay, 0)
        typedArray.recycle()
    }

    private fun resetClip(avatar: Avatar) {
        clipPath.rewind()
        transformPath.reset()
        val clipWidth = avatar.width + 2 * _spacing.toFloat()
        val clipHeight = avatar.height + 2 * _spacing.toFloat()
        avatar
            .getShapePath()
            .transform(
                clipMatrix.apply {
                    reset()
                    postScale(
                        clipWidth / avatar.width,
                        clipHeight / avatar.height,
                        avatar.width / 2f,
                        avatar.height / 2f,
                    )
                    postTranslate(avatar.x + _spacing + _itemOffset.toFloat(), avatar.y)
                },
                transformPath,
            )
        clipPath.addPath(transformPath)
        clipPath.close()
    }

    private fun updateCounter(count: Int) {
        val themeOverlay = if (_avatarStyleOverlay != 0) ContextThemeWrapper(context, _avatarStyleOverlay) else context
        val counter = _counter
            ?: Avatar(themeOverlay).also { _counter = it }
        counter.setText("+$count")
    }

    private fun getPool(useCount: Int): Array<Avatar?> {
        var pool = _avatarPool ?: Array<Avatar?>(useCount) { null }

        if (pool.size - useCount > pool.size / 2) {
            pool = pool.sliceArray(0 until useCount)
        } else if (pool.size < useCount) {
            pool = Array(useCount) { pool.getOrNull(it) }
        }

        _avatarPool = pool
        return pool
    }

    /**
     * Адаптер для связывания пользовательских данных и компонентов [Avatar]
     */
    abstract class Adapter {

        private var avatarGroup: AvatarGroup? = null

        /**
         * Возвращает true, если [Adapter] прикреплен к [AvatarGroup]
         */
        val isAttached: Boolean get() = avatarGroup != null

        /**
         * Возвращает кол-во элементов в [AvatarGroup]
         */
        abstract fun getCount(): Int

        /**
         * Создает [Avatar] для текущей позиции [position] в [AvatarGroup].
         * Можно переопределить, чтобы создать свой экземпляр [Avatar].
         * @param position порядковый номер элемента [Avatar] в [AvatarGroup]
         * @param context контекст
         */
        internal fun onCreateAvatarView(position: Int, context: Context): Avatar {
            return Avatar(context)
        }

        /**
         * Связывает пользовательские данные с [Avatar], имеющий порядковый номер [position].
         * @param avatarView экземпляр компонента [Avatar]
         * @param position порядковый номер элемента [Avatar] в [AvatarGroup]
         */
        abstract fun onBindAvatar(avatarView: Avatar, position: Int)

        /**
         * Колбэк связывания [Adapter] с [AvatarGroup]
         */
        open fun onAttachAvatarGroup(avatarGroup: AvatarGroup) = Unit

        /**
         * Колбэк отвязывания [Adapter] от [AvatarGroup]
         */
        open fun onDetachAvatarGroup(avatarGroup: AvatarGroup) = Unit

        /**
         * Уведомляет [AvatarGroup] об изменении данных
         */
        fun notifyAvatarGroupChanged() {
            avatarGroup?.repopulate()
        }

        internal fun attachAvatarGroup(avatarGroup: AvatarGroup) {
            if (this.avatarGroup != avatarGroup) {
                this.avatarGroup = avatarGroup
                onAttachAvatarGroup(avatarGroup)
            }
        }

        internal fun detachAvatarGroup() {
            this.avatarGroup?.let(::onDetachAvatarGroup)
            this.avatarGroup = null
        }
    }

    private companion object {
        const val DEFAULT_THRESHOLD = 3
    }
}

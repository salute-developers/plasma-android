package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMarginsRelative
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.NO_POSITION
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import androidx.viewpager2.widget.ViewPager2.PageTransformer
import kotlin.math.absoluteValue
import kotlin.math.roundToInt

/**
 * Компонент карусели на базе [ViewPager2] с кнопками навигации и индикатором страниц.
 *
 * Карусель предоставляет:
 * - горизонтальную прокрутку элементов;
 * - кнопки «Предыдущий» и «Следующий» (можно отключать и настраивать их расположение);
 * - индикатор страниц в виде точек [PaginationDots];
 * - возможность задания отступов между элементами и смещения страниц за пределами экрана.
 *
 * @param context контекст, в рамках которого создаётся карусель
 * @param attrs атрибуты, заданные в XML-разметке
 * @param defStyleAttr стиль по умолчанию для применения к этому виджету
 * @param defStyleRes резервный стиль по умолчанию, используемый при отсутствии стиля в теме
 */
open class Carousel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_carouselStyle,
    defStyleRes: Int = R.style.Sdds_Components_Carousel,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val indicator: PaginationDots = PaginationDots(indicatorWrapper(context, attrs, defStyleAttr, defStyleRes))
    private val pageTransformers: CompositePageTransformer = CompositePageTransformer()
    private val onPageChangeCallback: OnPageChangeCallback = object : OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            indicator.currentIndex = position
            updateButtonsVisibility()
        }
    }
    private val viewPager: ViewPager2 = ViewPager2(context).apply {
        orientation = ViewPager2.ORIENTATION_HORIZONTAL
        registerOnPageChangeCallback(onPageChangeCallback)
        setPageTransformer(pageTransformers)
        offscreenPageLimit = 3
    }
    private val nextButton: Button = IconButton(nextButtonWrapper(context, attrs, defStyleAttr, defStyleRes)).apply {
        setOnClickListener {
            currentItem++
        }
    }
    private val prevButton: Button = IconButton(prevButtonWrapper(context, attrs, defStyleAttr, defStyleRes)).apply {
        setOnClickListener {
            currentItem--
        }
    }
    private val dataObserver: AdapterDataObserver = AdapterDataObserver()
    private var dataObserverRegistered: Boolean = false
    private var _controlsPlacement: Int = CONTROLS_PLACEMENT_INNER
    private var _indicatorPadding: Int = 0
    private var _nextButtonPadding: Int = 0
    private var _prevButtonPadding: Int = 0
    private var _gap: Int = 0
    private var spacingDecorator: ItemDecoration? = null
    private var offscreenOffsetDecorator: ItemDecoration? = null
    private var offscreenOffsetTransformer: PageTransformer? = null
    private var _indicatorEnabled: Boolean = true
    private var _controlsEnabled: Boolean = true
    private var _contentAlignment: Int = CONTENT_ALIGNMENT_START

    /**
     * Текущая страница ViewPager2.
     */
    var currentItem: Int
        get() = viewPager.currentItem
        set(value) {
            viewPager.setCurrentItem(value, true)
        }

    /**
     * Адаптер ViewPager2.
     */
    var adapter: RecyclerView.Adapter<*>?
        get() = viewPager.adapter
        set(value) {
            unregisterDataObserver()
            viewPager.adapter = value
            indicator.itemCount = value?.itemCount ?: 0
            registerDataObserver()
        }

    /**
     * Ориентация ViewPager2.
     */
    var orientation: Int
        get() = viewPager.orientation
        set(value) {
            viewPager.orientation = value
        }

    /**
     * Разрешён ли пользовательский ввод (скролл).
     */
    var isUserInputEnabled: Boolean
        get() = viewPager.isUserInputEnabled
        set(value) {
            viewPager.isUserInputEnabled = value
        }

    /**
     * Расположение кнопок
     * @see CONTROLS_PLACEMENT_INNER
     * @see CONTROLS_PLACEMENT_OUTER
     */
    var controlsPlacement: Int
        get() = _controlsPlacement
        set(value) {
            if (_controlsPlacement != value) {
                _controlsPlacement = value
                updateButtonsPaddings()
            }
        }

    /**
     * Отступ от индикатора до контента [ViewPager2]
     */
    var indicatorPadding: Int
        get() = _indicatorPadding
        set(value) {
            if (_indicatorPadding != value) {
                _indicatorPadding = value
                updateIndicatorPadding()
            }
        }

    /**
     * Отступ от кнопки "Следующий" до контента [ViewPager2]
     */
    var nextButtonPadding: Int
        get() = _nextButtonPadding
        set(value) {
            if (_nextButtonPadding != value) {
                _nextButtonPadding = value
                updateButtonsPaddings()
            }
        }

    /**
     * Отступ от кнопки "Предыдущий" до контента [ViewPager2]
     */
    var prevButtonPadding: Int
        get() = _prevButtonPadding
        set(value) {
            if (_prevButtonPadding != value) {
                _prevButtonPadding = value
                updateButtonsPaddings()
            }
        }

    /**
     * Отступ между элементами [ViewPager2]
     */
    var gap: Int
        get() = _gap
        set(value) {
            if (_gap != value) {
                _gap = value
                updateItemsSpacing()
            }
        }

    /**
     * Включает/выключает кнопки переключения текущего элемента в [Carousel]
     */
    var controlsEnabled: Boolean
        get() = _controlsEnabled
        set(value) {
            if (_controlsEnabled != value) {
                _controlsEnabled = value
                updateButtonsVisibility()
            }
        }

    /**
     * Включает/выключает индикатор текущего элемента
     */
    var indicatorEnabled: Boolean
        get() = _indicatorEnabled
        set(value) {
            if (_indicatorEnabled != value) {
                _indicatorEnabled = value
                updateIndicatorVisibility()
            }
        }

    /**
     * Изменяет кол-во видимых точек в индикаторе [PaginationDots]
     * @see PaginationDots.visibleItemCount
     */
    var indicatorVisibleItemCount: Int
        get() = indicator.visibleItemCount
        set(value) {
            indicator.visibleItemCount = value
        }

    /**
     * Кол-во страниц за пределами "экрана"
     * @see ViewPager2.setOffscreenPageLimit
     */
    var offscreenPageLimit: Int
        get() = viewPager.offscreenPageLimit
        set(value) {
            viewPager.offscreenPageLimit = value
        }

    /**
     * Выравнивание контента внутри [Carousel]
     */
    var contentAlignment: Int
        get() = _contentAlignment
        set(value) {
            if (_contentAlignment != value) {
                _contentAlignment = value
                viewPager.invalidateItemDecorations()
                viewPager.requestTransform()
            }
        }

    init {
        populate()
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        updateButtonsPaddings()
        updateItemsSpacing()
    }

    /**
     * Регистрирует callback для отслеживания изменений страниц.
     */
    fun addOnPageChangeCallback(callback: OnPageChangeCallback) {
        viewPager.registerOnPageChangeCallback(callback)
    }

    /**
     * Удаляет ранее зарегистрированный callback.
     */
    fun removeOnPageChangeCallback(callback: OnPageChangeCallback) {
        viewPager.unregisterOnPageChangeCallback(callback)
    }

    /**
     * Устанавливает трансформер элементов
     */
    fun addPageTransformer(transformer: PageTransformer) {
        pageTransformers.addTransformer(transformer)
    }

    /**
     * Устанавливает трансформер элементов
     */
    fun removePageTransformer(transformer: PageTransformer) {
        pageTransformers.removeTransformer(transformer)
    }

    /**
     * Устанавливает декоратор элементов [Carousel]
     */
    fun addItemDecoration(decoration: ItemDecoration) {
        viewPager.addItemDecoration(decoration)
    }

    /**
     * Удаляет декоратор элементов [Carousel]
     */
    fun removeItemDecoration(decoration: ItemDecoration) {
        viewPager.removeItemDecoration(decoration)
    }

    /**
     * Устанавливает иконку [icon] для кнопки "Следующий"
     */
    fun setNextButtonIcon(icon: Drawable?) {
        nextButton.icon = icon
    }

    /**
     * Устанавливает иконку для кнопки "Следующий" из ресурса [iconRes]
     */
    fun setNextButtonIconRes(@DrawableRes iconRes: Int) {
        nextButton.setIconResource(iconRes)
    }

    /**
     * Устанавливает иконку [icon] для кнопки "Предыдущий"
     */
    fun setPrevButtonIcon(icon: Drawable?) {
        prevButton.icon = icon
    }

    /**
     * Устанавливает иконку для кнопки "Предыдущий" из ресурса [iconRes]
     */
    fun setPrevButtonIconRes(@DrawableRes icon: Int) {
        prevButton.setIconResource(icon)
    }

    /**
     * Устанавливает смещение страниц за границами экрана.
     * Увеличивая смещение уменьшается ширина страницы. За счет этого можно достичь эффекта одновременного отображения
     * соседних элементов.
     * @param offsetProvider провайдер смещения
     */
    fun setOffscreenOffset(offsetProvider: (view: View) -> Float) {
        offscreenOffsetTransformer?.let { removePageTransformer(it) }
        offscreenOffsetDecorator?.let { removeItemDecoration(it) }
        offscreenOffsetTransformer = OffsetTransformer(offsetProvider)
            .also { addPageTransformer(it) }
        offscreenOffsetDecorator = OffsetDecorator(
            alignmentProvider = { contentAlignment },
            offsetProvider = { offsetProvider(it).roundToInt() },
        ).also { addItemDecoration(it) }
    }

    /**
     * Устанавливает смещение страниц за границами экрана.
     * @see setOffscreenOffset
     * @param offset смешение
     */
    fun setOffscreenOffset(offset: Float) {
        setOffscreenOffset { offset }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        registerDataObserver()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        unregisterDataObserver()
    }

    override fun measureChildWithMargins(
        child: View?,
        parentWidthMeasureSpec: Int,
        widthUsed: Int,
        parentHeightMeasureSpec: Int,
        heightUsed: Int,
    ) {
        if (child != viewPager) {
            super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed)
            return
        }

        val wUsed = when {
            controlsPlacement == CONTROLS_PLACEMENT_OUTER && controlsEnabled -> {
                nextButton.measuredWidth + prevButton.measuredWidth + nextButtonPadding + prevButtonPadding
            }

            else -> 0
        }
        val hUsed = if (indicatorEnabled) indicator.measuredHeight + indicatorPadding else 0
        super.measureChildWithMargins(
            child,
            parentWidthMeasureSpec,
            widthUsed + wUsed,
            parentHeightMeasureSpec,
            heightUsed + hUsed,
        )
    }

    override fun isChildrenDrawingOrderEnabled(): Boolean {
        return true
    }

    override fun getChildDrawingOrder(childCount: Int, i: Int): Int {
        val vpIndex = indexOfChild(viewPager)
        return when {
            i == 0 -> vpIndex
            i <= vpIndex -> i - 1
            else -> i
        }
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.Carousel, defStyleAttr, defStyleRes) {
            _indicatorPadding = getDimensionPixelSize(R.styleable.Carousel_sd_indicatorPadding, 0)
            _nextButtonPadding = getDimensionPixelSize(R.styleable.Carousel_sd_nextButtonPadding, 0)
            _prevButtonPadding = getDimensionPixelSize(R.styleable.Carousel_sd_prevButtonPadding, 0)

            gap = getDimensionPixelSize(R.styleable.Carousel_sd_gap, 0)

            setNextButtonIcon(getDrawable(R.styleable.Carousel_sd_nextButtonIcon))
            setPrevButtonIcon(getDrawable(R.styleable.Carousel_sd_prevButtonIcon))
            controlsPlacement = getInt(R.styleable.Carousel_sd_controlsPlacement, CONTROLS_PLACEMENT_INNER)
            controlsEnabled = getBoolean(R.styleable.Carousel_sd_controlsEnabled, true)

            indicatorVisibleItemCount = getInt(R.styleable.Carousel_sd_indicatorVisibleItemCount, 0)
            contentAlignment = getInt(R.styleable.Carousel_sd_contentAlignment, CONTENT_ALIGNMENT_START)

            setOffscreenOffset(getDimension(R.styleable.Carousel_sd_offscreenOffset, 0f))
        }
    }

    private fun populate() {
        addView(
            indicator,
            LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ).apply {
                gravity = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
            },
        )
        addView(
            prevButton,
            LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ).apply {
                gravity = Gravity.START or Gravity.CENTER_VERTICAL
            },
        )
        addView(
            nextButton,
            LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ).apply {
                gravity = Gravity.END or Gravity.CENTER_VERTICAL
            },
        )
        addView(
            viewPager,
            LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            ).apply {
                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            },
        )
    }

    private fun updateButtonsPaddings() {
        nextButton.updateLayoutParams<MarginLayoutParams> {
            when (controlsPlacement) {
                CONTROLS_PLACEMENT_OUTER -> updateMarginsRelative(start = nextButtonPadding, end = 0)
                else -> updateMarginsRelative(start = 0, end = nextButtonPadding)
            }
        }
        prevButton.updateLayoutParams<MarginLayoutParams> {
            when (controlsPlacement) {
                CONTROLS_PLACEMENT_OUTER -> updateMarginsRelative(start = 0, end = prevButtonPadding)
                else -> updateMarginsRelative(start = prevButtonPadding, end = 0)
            }
        }
    }

    private fun updateButtonsVisibility() {
        if (!controlsEnabled) {
            nextButton.isGone = true
            prevButton.isGone = true
            return
        }

        val itemCount = adapter?.itemCount ?: 0
        nextButton.visibility = if (currentItem == itemCount - 1) INVISIBLE else VISIBLE
        prevButton.visibility = if (currentItem == 0) INVISIBLE else VISIBLE
    }

    private fun updateIndicatorVisibility() {
        indicator.isVisible = indicatorEnabled
    }

    private fun updateIndicatorPadding() {
        indicator.updateLayoutParams<MarginLayoutParams> {
            updateMarginsRelative(top = indicatorPadding)
        }
    }

    private fun updateItemsSpacing() {
        spacingDecorator?.let { viewPager.removeItemDecoration(it) }
        spacingDecorator = SpacingDecorator(
            alignmentProvider = { contentAlignment },
            spacingProvider = { _gap },
        )
            .also { viewPager.addItemDecoration(it) }
    }

    private fun registerDataObserver() {
        if (dataObserverRegistered) return
        dataObserverRegistered = true
        viewPager.adapter?.registerAdapterDataObserver(dataObserver)
    }

    private fun unregisterDataObserver() {
        if (dataObserverRegistered) {
            dataObserverRegistered = false
            viewPager.adapter?.unregisterAdapterDataObserver(dataObserver)
        }
    }

    private class SpacingDecorator(
        private val alignmentProvider: () -> Int,
        private val spacingProvider: (view: View) -> Int,
    ) : ItemDecoration() {

        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            val position = parent.getChildLayoutPosition(view)
            val itemCount = state.itemCount
            if (itemCount <= 1) return
            val spacing = spacingProvider(view)
            val alignment = alignmentProvider()
            when (alignment) {
                CONTENT_ALIGNMENT_START -> outRect.applyContentStartSpacing(spacing, position, itemCount)
                CONTENT_ALIGNMENT_CENTER -> outRect.applyContentCenterSpacing(spacing, position, itemCount)
                CONTENT_ALIGNMENT_END -> outRect.applyContentEndSpacing(spacing, position, itemCount)
            }
        }

        private fun Rect.applyContentStartSpacing(spacing: Int, position: Int, itemCount: Int) {
            if (position in 0 until itemCount) {
                right = spacing
            }
        }

        private fun Rect.applyContentCenterSpacing(spacing: Int, position: Int, itemCount: Int) {
            left = spacing / 2
            right = spacing / 2
        }

        private fun Rect.applyContentEndSpacing(spacing: Int, position: Int, itemCount: Int) {
            if (position in 0 until itemCount) {
                left = spacing
            }
        }
    }

    private class OffsetDecorator(
        private val alignmentProvider: () -> Int,
        private val offsetProvider: (view: View) -> Int,
    ) : ItemDecoration() {

        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            val position = parent.getChildLayoutPosition(view)
            val itemCount = state.itemCount
            val spacing = offsetProvider(view)
            if (itemCount <= 1 || spacing == 0) {
                outRect.left = spacing / 2
                outRect.right = spacing / 2
                return
            }
            when (alignmentProvider()) {
                CONTENT_ALIGNMENT_START -> outRect.applyContentStartSpacing(spacing, position, itemCount)
                CONTENT_ALIGNMENT_CENTER -> outRect.applyContentCenterSpacing(spacing, position, itemCount)
                CONTENT_ALIGNMENT_END -> outRect.applyContentEndSpacing(spacing, position)
            }
        }

        private fun Rect.applyContentStartSpacing(spacing: Int, position: Int, itemCount: Int) {
            when (position) {
                itemCount - 1 -> left = spacing
                else -> right = spacing
            }
        }

        private fun Rect.applyContentCenterSpacing(spacing: Int, position: Int, itemCount: Int) {
            when (position) {
                0 -> right = spacing
                itemCount - 1 -> left = spacing
                else -> {
                    left = spacing / 2
                    right = spacing / 2
                }
            }
        }

        private fun Rect.applyContentEndSpacing(spacing: Int, position: Int) {
            when (position) {
                0 -> right = spacing
                else -> left = spacing
            }
        }
    }

    private inner class OffsetTransformer(
        private val offsetProvider: (view: View) -> Float,
    ) : PageTransformer {

        private fun View.getIndex(): Int {
            return (viewPager.getChildAt(0) as? RecyclerView)?.getChildAdapterPosition(this) ?: NO_POSITION
        }

        override fun transformPage(page: View, position: Float) {
            val index = page.getIndex().takeIf { it != NO_POSITION } ?: return
            val itemCount = adapter?.itemCount ?: return
            val offset = offsetProvider(page)

            if (offset == 0f) {
                page.translationX = 0f
                return
            }

            when (contentAlignment) {
                CONTENT_ALIGNMENT_START -> page.transformContentStart(index, itemCount, position, offset)
                CONTENT_ALIGNMENT_END -> page.transformContentEnd(index, position, offset)
                CONTENT_ALIGNMENT_CENTER -> page.transformContentCenter(index, itemCount, position, offset)
                else -> {}
            }
        }

        private fun View.transformContentStart(index: Int, itemCount: Int, progress: Float, offset: Float) {
            val isLast = (index == itemCount - 1)
            val isBeforeLast = (index == itemCount - 2)
            val addOffset = when {
                isLast && (progress >= 1f) -> -offset
                isLast -> -offset * progress.coerceIn(0f, 1f)
                isBeforeLast && (progress <= 0 && progress >= -1f) -> offset * progress.absoluteValue.coerceIn(0f, 1f)
                else -> 0f
            }
            translationX = -offset * progress + addOffset
        }

        private fun View.transformContentEnd(index: Int, progress: Float, offset: Float) {
            val isFirst = (index == 0)
            val isAfterFirst = (index == 1)
            val addOffset = when {
                isFirst && (progress <= 0f) -> offset * progress.absoluteValue.coerceIn(0f, 1f)
                isAfterFirst && (progress >= 0f) -> -offset * progress.coerceIn(0f, 1f)
                else -> 0f
            }
            translationX = -offset * progress + addOffset
        }

        private fun View.transformContentCenter(index: Int, itemCount: Int, progress: Float, offset: Float) {
            val isFirst = (index == 0)
            val isAfterFirst = (index == 1)
            val isLast = (index == itemCount - 1)
            val isBeforeLast = (index == itemCount - 2)
            val baseOffset = if (itemCount > 2) offset / 2 else offset
            val addOffset = when {
                isFirst && (progress <= 0f) -> baseOffset * progress.absoluteValue.coerceIn(0f, 1f)
                isAfterFirst && (progress >= 0f) -> -baseOffset * progress.coerceIn(0f, 1f)

                isLast && (progress >= 1f) -> -baseOffset
                isLast -> -baseOffset * progress.coerceIn(0f, 1f)
                isBeforeLast && (progress <= 0 && progress >= -1f) ->
                    baseOffset * progress.absoluteValue.coerceIn(0f, 1f)
                else -> 0f
            }
            translationX = -offset * progress + addOffset
        }
    }

    private inner class AdapterDataObserver : RecyclerView.AdapterDataObserver() {

        override fun onChanged() {
            super.onChanged()
            notifyChanged()
        }

        override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
            super.onItemRangeInserted(positionStart, itemCount)
            notifyChanged()
        }

        override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
            super.onItemRangeRemoved(positionStart, itemCount)
            notifyChanged()
        }

        private fun notifyChanged() {
            val currentItemCount = adapter?.itemCount ?: return
            indicator.itemCount = currentItemCount
        }
    }

    companion object {
        /**
         * Расположение кнопок управления внутри карусели
         */
        const val CONTROLS_PLACEMENT_INNER = 0

        /**
         * Расположение кнопок управления снаружи карусели
         */
        const val CONTROLS_PLACEMENT_OUTER = 1

        /**
         * Выравнивание контента карусели в начале
         */
        const val CONTENT_ALIGNMENT_START = 0

        /**
         * Выравнивание контента карусели в центре
         */
        const val CONTENT_ALIGNMENT_CENTER = 1

        /**
         * Выравнивание контента карусели в конце
         */
        const val CONTENT_ALIGNMENT_END = 2

        private fun indicatorWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Carousel, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.Carousel_sd_paginationDotsStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(themeOverlay, styleOverlay)
                }
            }
            return themeOverlay
        }

        private fun nextButtonWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            return buttonWrapper(
                R.styleable.Carousel_sd_nextButtonStyleOverlay,
                context,
                attrs,
                defStyleAttr,
                defStyleRes,
            )
        }

        private fun prevButtonWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            return buttonWrapper(
                R.styleable.Carousel_sd_prevButtonStyleOverlay,
                context,
                attrs,
                defStyleAttr,
                defStyleRes,
            )
        }

        private fun buttonWrapper(
            styleableAttr: Int,
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Carousel, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(styleableAttr, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(themeOverlay, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}

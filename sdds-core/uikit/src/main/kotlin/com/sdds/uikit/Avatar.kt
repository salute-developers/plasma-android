package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Shader
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.Gravity
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.core.content.ContextCompat
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.drawable.BadgeDrawable
import com.sdds.uikit.drawable.CounterDrawable
import com.sdds.uikit.drawable.IndicatorDrawable
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shader.ShaderFactory
import java.util.Locale
import kotlin.math.roundToInt

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, инициалы имени пользователя, а также иконку действия.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 16.07.2024
 */
open class Avatar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_avatarStyle,
    defStyleRes: Int = R.style.Sdds_Components_Avatar,
) : ImageView(context, attrs, defStyleAttr), TextDrawable.Delegate {

    /**
     * Статус аватара
     */
    enum class Status {
        /**
         * Статус отсутствует (не будет отображаться)
         */
        NONE,

        /**
         * Активный статус
         */
        ACTIVE,

        /**
         * Неактивный статус
         */
        INACTIVE,
    }

    private val _bounds: Rect = Rect()
    private var _backgroundAlpha: Float = 1f

    private var _statusOffsetX: Float = 0f
    private var _statusOffsetY: Float = 0f
    private var _status: Status = Status.NONE
    private var _statusColor: ColorStateList? = null
    private var _statusDrawable: IndicatorDrawable? = null
    private var _statusState: ColorState? = null
    private var _statusStyle: Int = 0
    private val _statusBounds: Rect = Rect()

    private var _actionDrawable: Drawable? = null
    private var _actionScrimDrawable = ColorDrawable(ScrimColor)
    private var _actionOverlay: Drawable? = null
    private var _actionSize: Int = 0
    private var _actionEnabled: Boolean = false
    private var _actionTint: ColorStateList? = null

    private var _text: CharSequence? = null
    private var _textAppearanceId: Int = 0
    private val _textBounds: Rect = Rect()
    private val _textPaint = TextPaint().configure(isAntiAlias = true)
    private var _textColor: ColorStateList? = null
    private var _fontCallback: CancelableFontCallback? = null

    @ColorInt
    private var _textColorStart: Int = 0

    @ColorInt
    private var _textColorEnd: Int = 0
    private val _shouldUseGradientText: Boolean
        get() = _textColorShaderFactory != null || (_textColorStart != _textColorEnd && _textColor == null)
    private var _textColorGradient: Shader? = null
    private var _textColorShaderFactory: ShaderFactory? = null

    private val _initialsEnabled: Boolean
        get() = drawable == null && _text != null

    private var _badgeDrawable: BadgeDrawable? = null
    private val _badgeBounds: Rect = Rect()
    private var _badgeEnabled: Boolean = false
    private var _badgePlacement: Int = EXTRA_PLACEMENT_TOP_START
    private var _badgeState: ColorState? = null

    @StyleRes
    private var _badgeStyle: Int = 0

    private var _counterDrawable: CounterDrawable? = null
    private val _counterBounds: Rect = Rect()
    private var _counterEnabled: Boolean = false
    private var _counterPlacement: Int = EXTRA_PLACEMENT_TOP_START
    private var _counterState: ColorState? = null

    @StyleRes
    private var _counterStyle: Int = 0

    /**
     * @see Status
     */
    var status: Status
        get() = _status
        set(value) {
            if (_status != value) {
                _status = value
                refreshDrawableState()
                invalidate()
            }
        }

    /**
     * Флаг доступности иконки действия.
     */
    var actionEnabled: Boolean
        get() = _actionEnabled
        set(value) {
            if (_actionEnabled != value) {
                _actionEnabled = value
                invalidate()
            }
        }

    /**
     * Бейдж компонента [Avatar]
     * @see [BadgeDrawable]
     */
    var badge: BadgeDrawable?
        get() = _badgeDrawable
        set(value) {
            _badgeDrawable = value?.apply {
                callback = this@Avatar
                setDelegate(this@Avatar)
            }
            invalidate()
        }

    /**
     * Включает/выключает [badge]
     */
    var badgeEnabled: Boolean
        get() = _badgeEnabled
        set(value) {
            if (_badgeEnabled != value) {
                _badgeEnabled = value
                invalidate()
            }
        }

    /**
     * Расположение [badge] в [Avatar].
     * Может быть [EXTRA_PLACEMENT_TOP_START], [EXTRA_PLACEMENT_TOP_END],
     * [EXTRA_PLACEMENT_BOTTOM_END] или [EXTRA_PLACEMENT_BOTTOM_START]
     */
    var badgePlacement: Int
        get() = _badgePlacement
        set(value) {
            if (_badgePlacement != value) {
                _badgePlacement = value
                invalidate()
            }
        }

    /**
     * Счетчик компонента [Avatar]
     * @see [CounterDrawable]
     */
    var counter: CounterDrawable?
        get() = _counterDrawable
        set(value) {
            _counterDrawable = value?.apply {
                callback = this@Avatar
                setDelegate(this@Avatar)
            }
        }

    /**
     * Включает/выключает [counter]
     */
    var counterEnabled: Boolean
        get() = _counterEnabled
        set(value) {
            if (_counterEnabled != value) {
                _counterEnabled = value
                invalidate()
            }
        }

    /**
     * Расположение [counter] в [Avatar].
     * Может быть [EXTRA_PLACEMENT_TOP_START], [EXTRA_PLACEMENT_TOP_END],
     * [EXTRA_PLACEMENT_BOTTOM_END] или [EXTRA_PLACEMENT_BOTTOM_START]
     */
    var counterPlacement: Int
        get() = _counterPlacement
        set(value) {
            if (_counterPlacement != value) {
                _counterPlacement = value
                invalidate()
            }
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        updateBackgroundAlpha()
    }

    /**
     * Устанавливает цвета статуса.
     * @param color цвета статуса
     */
    open fun setStatusColor(color: ColorStateList?) {
        if (_statusColor != color) {
            _statusColor = color
            _statusDrawable?.setTintList(color)
            invalidate()
        }
    }

    /**
     * Устанавливает цвет статуса.
     * @param color цвет статуса
     */
    open fun setStatusColor(@ColorInt color: Int) {
        setStatusColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает инициалы имени пользователя.
     * Могут выступать в роли заглушки при отсутствии изображения.
     * @param fullName полное имя пользователя из которого возьмутся инициалы
     */
    open fun setInitials(fullName: String?) {
        val newInitials = fullName?.initials
        if (_text != newInitials) {
            _text = newInitials
            invalidate()
        }
    }

    /**
     * Устанавливает инициалы имени пользователя.
     * Могут выступать в роли заглушки при отсутствии изображения.
     * @param firstName имя пользователя из которого возьмется первый инициалы
     * @param lastName фамилия пользователя из которого возьмется второй инициал
     */
    open fun setInitials(firstName: String, lastName: String) {
        val newInitials = "${firstName[0]}${lastName[0]}".uppercase(Locale.getDefault())

        if (_text != newInitials) {
            _text = newInitials
            invalidate()
        }
    }

    /**
     * Устанавливает текст [text] в качестве заглушки.
     * @param text текст-заглушка
     */
    fun setText(text: String?) {
        if (_text != text) {
            _text = text
            invalidate()
        }
    }

    /**
     * Устанавливает стиль текста по идентификатору [styleId].
     * @param styleId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes styleId: Int) {
        if (_textAppearanceId != styleId) {
            _textAppearanceId = styleId
            _fontCallback?.cancel()
            _fontCallback = _textPaint.applyTextAppearance(context, styleId) {
                invalidate()
            }
        }
    }

    /**
     * Устанавливает цвета текста.
     * @param color цвета текста
     */
    open fun setTextColor(color: ColorStateList?) {
        if (_textColor != color) {
            _textColor = color
            updateTextColor()
            invalidate()
        }
    }

    /**
     * Устанавливает начальный цвет градиента текста.
     * @param color начальный цвет градиента текста
     */
    open fun setTextColorStart(@ColorInt color: Int) {
        if (_textColorStart != color) {
            _textColorStart = color
            updateTextColor()
            invalidate()
        }
    }

    /**
     * Устанавливает конечный цвет градиента текста.
     * @param color начальный цвет градиента текста
     */
    open fun setTextColorEnd(@ColorInt color: Int) {
        if (_textColorEnd != color) {
            _textColorEnd = color
            updateTextColor()
            invalidate()
        }
    }

    /**
     * Устанавливает цвет текста.
     * @param color цвета текста
     */
    open fun setTextColor(@ColorInt color: Int) {
        setTextColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает иконку действия [drawable]
     * @param drawable иконка действия
     */
    open fun setAction(drawable: Drawable?) {
        if (_actionDrawable != drawable) {
            _actionDrawable = drawable?.mutate()

            if (_actionDrawable == null) {
                _actionOverlay = null
                return
            }
            _actionDrawable?.setTintList(_actionTint)
            _actionOverlay = LayerDrawable(
                arrayOf(
                    _actionScrimDrawable,
                    _actionDrawable,
                ),
            ).apply {
                val iconLayerIndex = this.numberOfLayers - 1
                setLayerGravity(iconLayerIndex, Gravity.CENTER)
                val iconWidth = if (_actionSize > 0) _actionSize else (_actionDrawable?.intrinsicWidth ?: 0)
                val iconHeight = if (_actionSize > 0) _actionSize else (_actionDrawable?.intrinsicHeight ?: 0)
                setLayerWidth(iconLayerIndex, iconWidth)
                setLayerHeight(iconLayerIndex, iconHeight)
                bounds = _bounds
            }
        }
    }

    /**
     * Устанавливает иконку действия по идентификатору ресурса [actionRes]
     * @param actionRes идентификатор ресурса иконки действия
     */
    fun setActionResource(@DrawableRes actionRes: Int) {
        setAction(ContextCompat.getDrawable(context, actionRes))
    }

    /**
     * Устанавливает цвета иконки действия.
     * @param color цвета иконки действия
     */
    open fun setActionColor(color: ColorStateList?) {
        if (_actionTint != color) {
            _actionTint = color
            _actionDrawable?.setTintList(color)
        }
    }

    /**
     * Устанавливает цвет иконки действия.
     * @param color цвет иконки действия
     */
    fun setActionColor(@ColorInt color: Int) {
        setActionColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета фона иконки действия.
     * @param color цвета фона иконки действия
     */
    open fun setActionScrimColor(color: ColorStateList?) {
        _actionScrimDrawable.setTintList(color)
    }

    /**
     * Устанавливает цвета фон иконки действия.
     * @param color цвета фон иконки действия
     */
    fun setActionScrimColor(@ColorInt color: Int) {
        setActionScrimColor(ColorStateList.valueOf(color))
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        _text?.let { text ->
            _textPaint.getTextBounds(text.toString(), 0, text.length, _textBounds)
            _textBounds.offsetTo(
                (measuredWidth - _textBounds.width()) / 2,
                (measuredHeight - _textBounds.height()) / 2,
            )
        }
        _bounds.set(0, 0, measuredWidth, measuredHeight)

        badge.takeIf { badgeEnabled }?.let { badge ->
            _badgeBounds.set(0, 0, badge.intrinsicWidth, badge.intrinsicHeight)
        }
        counter.takeIf { counterEnabled }?.let { counter ->
            _counterBounds.set(0, 0, counter.intrinsicWidth, counter.intrinsicHeight)
        }
        _statusDrawable.takeIf { status != Status.NONE }?.let { status ->
            _statusBounds.set(0, 0, status.intrinsicWidth, status.intrinsicHeight)
            _statusBounds.offset(
                _bounds.width() - _statusBounds.width() - _statusOffsetX.toInt(),
                _bounds.height() - _statusBounds.height() - _statusOffsetY.toInt(),
            )
        }
        _actionOverlay?.bounds = _bounds
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _textColorGradient = if (_shouldUseGradientText) {
            _textColorShaderFactory?.resize(_textBounds.width().toFloat(), _textBounds.height().toFloat())
                ?: LinearGradient(
                    0f,
                    _textBounds.height().toFloat(),
                    _textBounds.width().toFloat(),
                    0f,
                    intArrayOf(_textColorStart, _textColorEnd),
                    floatArrayOf(0f, 1f),
                    Shader.TileMode.CLAMP,
                )
        } else {
            null
        }
        updateTextColor()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (_status != Status.NONE) {
            drawStatus(canvas)
        }
        drawExtra(canvas)
    }

    override fun onDrawBeforeClip(canvas: Canvas) {
        super.onDrawBeforeClip(canvas)
        if (_initialsEnabled) {
            drawInitials(canvas, _text)
        }

        if (actionEnabled) {
            drawAction(canvas)
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        // ImageView может вызвать onCreateDrawableState до инициализации status
        if (status == null) return super.onCreateDrawableState(extraSpace)
        val drawableState = super.onCreateDrawableState(extraSpace + 3)
        val statusState = when (status) {
            Status.NONE -> null
            Status.ACTIVE -> R.attr.sd_status_active
            Status.INACTIVE -> R.attr.sd_status_inactive
        }
        if (statusState != null) {
            mergeDrawableStates(drawableState, intArrayOf(statusState))
        }
        if (_counterState?.isDefined() == true) {
            mergeDrawableStates(drawableState, _counterState!!.attrs)
        }
        if (_badgeState?.isDefined() == true) {
            mergeDrawableStates(drawableState, _badgeState!!.attrs)
        }
        return drawableState
    }

    override fun verifyDrawable(dr: Drawable): Boolean {
        return super.verifyDrawable(dr) ||
            _actionDrawable == dr ||
            _actionScrimDrawable == dr ||
            _actionOverlay == dr ||
            badge == dr ||
            counter == dr ||
            _statusDrawable == dr
    }

    override fun setBackground(background: Drawable?) {
        super.setBackground(background)
        updateBackgroundAlpha()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        if (_badgeState?.isDefined() == true) {
            badge?.state = drawableState
        }
        if (_counterState?.isDefined() == true) {
            counter?.state = drawableState
        }
        _statusDrawable?.state = drawableState
    }

    override fun onDrawableSizeChange() {
        requestLayout()
        invalidate()
    }

    private fun updateBackgroundAlpha() {
        background?.apply {
            alpha = (_backgroundAlpha * MAX_ALPHA_INT).roundToInt()
            invalidateSelf()
        }
    }

    private fun drawInitials(canvas: Canvas, initials: CharSequence?) {
        if (initials == null) return
        val count = canvas.save()
        canvas.translate(_textBounds.left.toFloat(), _textBounds.bottom.toFloat())
        canvas.drawText(initials, 0, initials.length, 0f, 0f, _textPaint)
        canvas.restoreToCount(count)
    }

    private fun drawStatus(canvas: Canvas) {
        _statusDrawable?.run {
            bounds = _statusBounds
            draw(canvas)
            canvas.drawRect(_statusBounds, DebugPaint)
        }
    }

    private fun drawAction(canvas: Canvas) {
        _actionOverlay?.draw(canvas)
    }

    private fun drawExtra(canvas: Canvas) {
        badge.takeIf { badgeEnabled }?.let { badge ->
            Gravity.apply(
                badgePlacement.gravity,
                badge.intrinsicWidth,
                badge.intrinsicHeight,
                _bounds,
                _badgeBounds,
                layoutDirection,
            )
            badge.bounds = _badgeBounds
            badge.draw(canvas)
            canvas.drawRect(_badgeBounds, DebugPaint)
        }
        counter.takeIf { counterEnabled }?.let { counter ->
            Gravity.apply(
                counterPlacement.gravity,
                counter.intrinsicWidth,
                counter.intrinsicHeight,
                _bounds,
                _counterBounds,
                layoutDirection,
            )
            counter.bounds = _counterBounds
            counter.draw(canvas)
            canvas.drawRect(_counterBounds, DebugPaint)
        }
    }

    private fun updateTextColor() {
        if (_shouldUseGradientText) {
            _textPaint.color = Color.BLACK
            _textPaint.shader = _textColorGradient
        } else {
            _textPaint.shader = null
            _textPaint.color = _textColor.colorForState(drawableState)
        }
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Avatar, defStyleAttr, defStyleRes)
        _status = Status.values()
            .getOrElse(typedArray.getInt(R.styleable.Avatar_sd_status, 0)) { Status.NONE }
        _statusOffsetX = typedArray.getDimension(R.styleable.Avatar_sd_statusOffsetX, 0f)
        _statusOffsetY = typedArray.getDimension(R.styleable.Avatar_sd_statusOffsetY, 0f)
        _statusStyle = typedArray.getResourceId(R.styleable.Avatar_sd_statusStyle, R.style.Sdds_Components_Indicator)
        obtainStatusIndicator(_statusStyle)
        setStatusColor(typedArray.getColorStateList(R.styleable.Avatar_sd_statusColor))

        _actionSize = typedArray.getDimensionPixelSize(R.styleable.Avatar_sd_actionSize, 0)
        _actionEnabled = typedArray.getBoolean(R.styleable.Avatar_sd_actionEnabled, false)
        setAction(typedArray.getDrawable(R.styleable.Avatar_sd_action))
        setActionColor(typedArray.getColorStateList(R.styleable.Avatar_sd_actionTint))
        setActionScrimColor(typedArray.getColorStateList(R.styleable.Avatar_sd_actionScrimColor))

        setText(typedArray.getString(R.styleable.Avatar_sd_text))
        setInitials(typedArray.getString(R.styleable.Avatar_sd_name))
        setTextAppearance(typedArray.getResourceId(R.styleable.Avatar_android_textAppearance, 0))
        _textColorStart = typedArray.getColor(R.styleable.Avatar_sd_textColorStart, 0)
        _textColorEnd = typedArray.getColor(R.styleable.Avatar_sd_textColorEnd, 0)
        _textColorShaderFactory = typedArray.getResourceId(R.styleable.Avatar_sd_textShaderStyle, 0).let {
            context.shaderFactory(it)
        }
        setTextColor(typedArray.getColorStateList(R.styleable.Avatar_android_textColor))

        _backgroundAlpha = typedArray.getFloat(R.styleable.Avatar_sd_backgroundAlpha, 1f)

        _badgeStyle = typedArray.getResourceId(R.styleable.Avatar_sd_extraBadgeStyle, R.style.Sdds_Components_Badge)
        badgeEnabled = typedArray.getBoolean(R.styleable.Avatar_sd_extraBadgeEnabled, false)
        badgePlacement = typedArray.getInt(R.styleable.Avatar_sd_extraBadgePlacement, EXTRA_PLACEMENT_TOP_START)
        badgeObtainAttributes(_badgeStyle)
        badge?.apply {
            text = typedArray.getString(R.styleable.Avatar_sd_extraBadgeText).orEmpty()
            drawableStart = typedArray.getDrawable(R.styleable.Avatar_sd_extraBadgeIconStart)
            drawableEnd = typedArray.getDrawable(R.styleable.Avatar_sd_extraBadgeIconEnd)
        }

        _counterStyle =
            typedArray.getResourceId(R.styleable.Avatar_sd_extraCounterStyle, R.style.Sdds_Components_Counter)
        counterEnabled = typedArray.getBoolean(R.styleable.Avatar_sd_extraCounterEnabled, false)
        counterPlacement = typedArray.getInt(R.styleable.Avatar_sd_extraCounterPlacement, EXTRA_PLACEMENT_TOP_START)
        counterObtainAttributes(_counterStyle)
        counter?.apply {
            text = typedArray.getString(R.styleable.Avatar_sd_extraCounterText).orEmpty()
        }

        typedArray.recycle()
    }

    @Suppress("CustomViewStyleable")
    private fun counterObtainAttributes(counterStyle: Int) {
        val typedArray = context.obtainStyledAttributes(counterStyle, R.styleable.Counter)
        _counterState = ColorState.obtain(context, null, 0, counterStyle)
        typedArray.recycle()
        counter = CounterDrawable(
            context = context,
            attrs = null,
            0,
            counterStyle,
        )
    }

    @Suppress("CustomViewStyleable")
    private fun badgeObtainAttributes(badgeStyle: Int) {
        _badgeState = ColorState.obtain(context, null, 0, badgeStyle)
        badge = BadgeDrawable(
            context = context,
            attrs = null,
            defStyleAttr = 0,
            defStyleRes = badgeStyle,
        )
    }

    @Suppress("CustomViewStyleable")
    private fun obtainStatusIndicator(statusStyle: Int) {
        _statusState = ColorState.obtain(context, null, 0, statusStyle)
        _statusDrawable = IndicatorDrawable(
            context = context,
            attrs = null,
            defStyleAttr = 0,
            defStyleRes = statusStyle,
        ).apply {
            callback = this@Avatar
        }
    }

    companion object {
        /**
         * Расположение в верхнем левом (LayoutDirection.LTR)
         * или верхнем правом углу (LayoutDirection.RTL)
         */
        const val EXTRA_PLACEMENT_TOP_START = 0
        /**
         * Расположение в верхнем правом (LayoutDirection.LTR)
         * или верхнем левом углу (LayoutDirection.RTL)
         */
        const val EXTRA_PLACEMENT_TOP_END = 1
        /**
         * Расположение в нижнем левом (LayoutDirection.LTR)
         * или нижнем правом углу (LayoutDirection.RTL)
         */
        const val EXTRA_PLACEMENT_BOTTOM_START = 2

        /**
         * Расположение в нижнем правом (LayoutDirection.LTR)
         * или нижнем левом углу (LayoutDirection.RTL)
         */
        const val EXTRA_PLACEMENT_BOTTOM_END = 3

        private const val MAX_ALPHA_INT = 255
        private val ScrimColor = Color.argb((255 * 0.56f).roundToInt(), 8, 8, 8)
        private val DebugPaint = Paint().configure(style = Paint.Style.STROKE, color = Color.MAGENTA)

        private val CharSequence.initials
            get() = this
                .split(' ')
                .mapNotNull { it.firstOrNull()?.toString() }
                .take(2)
                .reduce { acc, s -> acc + s }

        private val Int.gravity: Int
            get() = when (this) {
                EXTRA_PLACEMENT_TOP_END -> Gravity.TOP or Gravity.END
                EXTRA_PLACEMENT_BOTTOM_END -> Gravity.BOTTOM or Gravity.START
                EXTRA_PLACEMENT_BOTTOM_START -> Gravity.BOTTOM or Gravity.END
                else -> Gravity.TOP or Gravity.START
            }
    }
}

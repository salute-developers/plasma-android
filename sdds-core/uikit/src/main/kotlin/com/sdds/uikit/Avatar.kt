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
import androidx.annotation.StyleRes
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState
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
) : ImageView(context, attrs, defStyleAttr) {

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
    private val _statusPaint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.FILL
    }

    private var _statusSize: Float = 0f
    private var _statusOffsetX: Float = 0f
    private var _statusOffsetY: Float = 0f
    private var _status: Status = Status.NONE
    private var _statusColor: ColorStateList? = null

    private var _actionDrawable: Drawable? = null
    private var _actionScrimDrawable = ColorDrawable(ScrimColor)
    private var _actionOverlay: Drawable? = null
    private var _actionSize: Int = 0
    private var _actionEnabled: Boolean = false
    private var _actionTint: ColorStateList? = null

    private var _text: CharSequence? = null
    private var _textAppearanceId: Int = 0
    private val _textBounds: Rect = Rect()
    private val _textPaint = TextPaint()
    private var _textColor: ColorStateList? = null

    @ColorInt
    private var _textColorStart: Int = 0

    @ColorInt
    private var _textColorEnd: Int = 0
    private val _shouldUseGradientText: Boolean get() = _textColorStart != _textColorEnd && _textColor == null
    private var _textColorGradient: Shader? = null

    private val _initialsEnabled: Boolean
        get() = drawable == null && _text != null

    /**
     * @see Status
     */
    var status: Status
        get() = _status
        set(value) {
            if (_status != value) {
                _status = value
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

    init {
        obtainAttributes(context, attrs, defStyleAttr)
    }

    /**
     * Устанавливает цвета статуса.
     * @param color цвета статуса
     */
    open fun setStatusColor(color: ColorStateList?) {
        if (_statusColor != color) {
            _statusColor = color
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
            _textPaint.applyTextAppearance(context, styleId)
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
            }
        }
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
        _actionOverlay?.bounds = _bounds
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _textColorGradient = if (_shouldUseGradientText) {
            LinearGradient(
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
    }

    override fun onDrawBeforeClip(canvas: Canvas) {
        super.onDrawBeforeClip(canvas)
        if (_initialsEnabled) {
            drawInitials(canvas, _text)
        }

        if (_actionEnabled) {
            drawAction(canvas)
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        // ImageView может вызвать onCreateDrawableState до инициализации status
        if (status == null) return super.onCreateDrawableState(extraSpace)
        val statusSpace = if (status != Status.INACTIVE) 1 else 0
        val statusState = when (status) {
            Status.NONE -> null
            Status.ACTIVE -> R.attr.sd_status_active
            Status.INACTIVE -> R.attr.sd_status_inactive
        }
        val drawableState = super.onCreateDrawableState(extraSpace + statusSpace)
        if (statusState != null) {
            mergeDrawableStates(drawableState, intArrayOf(statusState))
        }
        return drawableState
    }

    override fun verifyDrawable(dr: Drawable): Boolean {
        return super.verifyDrawable(dr) || _actionDrawable == dr || _actionScrimDrawable == dr || _actionOverlay == dr
    }

    private fun drawInitials(canvas: Canvas, initials: CharSequence?) {
        if (initials == null) return
        val count = canvas.save()
        canvas.translate(_textBounds.left.toFloat(), _textBounds.bottom.toFloat())
        canvas.drawText(initials, 0, initials.length, 0f, 0f, _textPaint)
        canvas.restoreToCount(count)
    }

    private fun drawStatus(canvas: Canvas) {
        _statusPaint.color = _statusColor.colorForState(drawableState)
        val centerX = _bounds.width() - _statusSize / 2 - _statusOffsetX
        val centerY = _bounds.height() - _statusSize / 2 - _statusOffsetY
        canvas.drawCircle(
            centerX,
            centerY,
            _statusSize / 2f,
            _statusPaint,
        )
    }

    private fun drawAction(canvas: Canvas) {
        _actionOverlay?.draw(canvas)
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

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Avatar, defStyleAttr, -1)
        _status = Status.values()
            .getOrElse(typedArray.getInt(R.styleable.Avatar_sd_status, 0)) { Status.NONE }
        _statusSize = typedArray.getDimension(R.styleable.Avatar_sd_statusSize, 0f)
        _statusOffsetX = typedArray.getDimension(R.styleable.Avatar_sd_statusOffsetX, 0f)
        _statusOffsetY = typedArray.getDimension(R.styleable.Avatar_sd_statusOffsetY, 0f)
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
        setTextColor(typedArray.getColorStateList(R.styleable.Avatar_android_textColor))
        typedArray.recycle()
    }

    private companion object {
        val ScrimColor = Color.argb((255 * 0.56f).roundToInt(), 8, 8, 8)

        val CharSequence.initials
            get() = this
                .split(' ')
                .mapNotNull { it.firstOrNull()?.toString() }
                .take(2)
                .reduce { acc, s -> acc + s }
    }
}

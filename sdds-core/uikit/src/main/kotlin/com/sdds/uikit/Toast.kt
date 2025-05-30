package com.sdds.uikit

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import com.sdds.uikit.Toast.Companion.makeToast
import com.sdds.uikit.Toast.Companion.simpleToast
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.overlays.getOverlayManager
import com.sdds.uikit.overlays.OverlayEntry
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.OverlayPosition
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList
import java.lang.ref.WeakReference

/**
 * Класс для отображения временных сообщений (тостов) с помощью системы оверлеев SDDS UI Kit.
 * Используйте [makeToast] или [simpleToast] для создания и показа.
 */
class Toast private constructor(
    private val context: Context,
    overlayManager: OverlayManager,
    private val viewFactory: (Context, OverlayEntry) -> View,
    override val durationMillis: Long?,
) : OverlayEntry {

    /** Уникальный идентификатор данного тоста. */
    override val id: Long = System.currentTimeMillis()

    override fun createView(): View {
        return viewFactory(context, this)
    }

    private var overlayManagerRef: WeakReference<OverlayManager> = WeakReference(overlayManager)
    internal var isValid: Boolean = true

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Toast) return false

        if (id != other.id) return false
        if (durationMillis != other.durationMillis) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (durationMillis?.hashCode() ?: 0)
        return result
    }

    override fun show() {
        if (!isValid) return
        overlayManagerRef.get()?.show(this)
    }

    override fun hide() {
        if (!isValid) return
        overlayManagerRef.get()?.remove(id)
    }

    companion object {

        /** Положение тоста по умолчанию — снизу по центру. */
        internal val DefaultToastPosition = OverlayPosition.BottomCenter

        private const val TOAST_MANAGER_TAG = "com.sdds.uikit.ToastManager"

        /**
         * Создаёт настраиваемый экземпляр [Toast] с заданными параметрами.
         *
         * @param context Контекст.
         * @param position Положение на экране, где появится тост.
         * @param duration Продолжительность отображения тоста в миллисекундах.
         * @param factory Фабрика для создания содержимого тоста.
         * @return Настроенный экземпляр [Toast], готовый к показу.
         */
        fun makeToast(
            context: Context,
            position: OverlayPosition = DefaultToastPosition,
            duration: Long? = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS,
            factory: (Context, OverlayEntry) -> View,
        ): Toast {
            val overlayManager = context.getOverlayManager(position, TOAST_MANAGER_TAG)
            return Toast(
                context = context,
                overlayManager = overlayManager,
                viewFactory = factory,
                durationMillis = duration,
            )
        }

        /**
         * Создаёт простой [Toast] с текстом и дополнительными иконками.
         *
         * @param context Контекст.
         * @param message Текст сообщения.
         * @param contentStart Необязательная иконка в начале.
         * @param contentEnd Необязательная иконка в конце (например, кнопка закрытия).
         * @param toastOverlayStyle Необязательный стиль для тоста.
         * @param duration Продолжительность отображения в миллисекундах.
         * @param position Положение тоста на экране.
         * @return Настроенный экземпляр [Toast], готовый к показу.
         */
        fun simpleToast(
            context: Context,
            message: String,
            contentStart: Drawable? = null,
            contentEnd: Drawable? = null,
            @StyleRes toastOverlayStyle: Int? = null,
            duration: Long? = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS,
            position: OverlayPosition = DefaultToastPosition,
        ): Toast {
            return makeToast(
                context = context,
                position = position,
                duration = duration,
            ) { ctx, entry ->
                val contextWrapper = toastOverlayStyle?.let { ContextThemeWrapper(ctx, it) } ?: ctx
                ToastView(contextWrapper).apply {
                    this.message = message
                    this.contentStart = contentStart
                    this.contentEnd = contentEnd
                    if (contentEnd != null) {
                        setContentEndClickListener { entry.hide() }
                    }
                }
            }.apply {
                isValid = message.isNotEmpty() || contentStart != null || contentEnd != null
            }
        }
    }
}

/**
 * Представление для отображения тоста.
 * Поддерживает иконки слева/справа, стилизованный текст и состояния цвета.
 * @param context Контекст
 * @param attrs Аттрибуты view
 * @param defStyleAttr Аттрибут стиля по умолчанию
 * @param defStyleRes Ресурс стиля по умолчанию
 */
class ToastView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_toastStyle,
    defStyleRes: Int = R.style.Sdds_Components_Toast,
) : CellLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {
    private val contentStartView: ImageView = ImageView(context)
    private val messageView: TextView = TextView(context)
    private val contentEndView: ImageView = ImageView(context)
    private var backgroundList: ColorValueStateList? = null
    private var _contentStartSize: Int = 0
    private var _contentEndSize: Int = 0

    /**
     * Иконка, отображаемая в начале тоста (например, статус или символ).
     */
    var contentStart: Drawable?
        get() = contentStartView.drawable
        set(value) {
            contentStartView.setImageDrawable(value)
            contentStartView.isVisible = value != null
        }

    /**
     * Иконка в конце тоста (например, кнопка закрытия).
     */
    var contentEnd: Drawable?
        get() = contentEndView.drawable
        set(value) {
            contentEndView.setImageDrawable(value)
            contentEndView.isVisible = value != null
        }

    /**
     * Текстовое сообщение, отображаемое в тосте.
     */
    var message: CharSequence?
        get() = messageView.text
        set(value) {
            messageView.text = value
        }

    /**
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            resetChildrenColorState()
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.Toast, defStyleAttr, defStyleRes) {
            backgroundList = getColorValueStateList(context, R.styleable.Toast_sd_background)

            contentStartView.imageTintList = getColorStateList(R.styleable.Toast_sd_contentStartTint)
            contentEndView.imageTintList = getColorStateList(R.styleable.Toast_sd_contentEndTint)
            _contentStartSize = getDimensionPixelSize(R.styleable.Toast_sd_contentStartSize, DEFAULT_CONTENT_SIZE)
            _contentEndSize = getDimensionPixelSize(R.styleable.Toast_sd_contentEndSize, DEFAULT_CONTENT_SIZE)
            contentStart = getDrawable(R.styleable.Toast_sd_contentStart)
            contentEnd = getDrawable(R.styleable.Toast_sd_contentEnd)

            val textColor = getColorValueStateList(context, R.styleable.Toast_sd_textColor)
                ?: ColorValueStateList.valueOf(getColorStateList(R.styleable.Toast_android_textColor))
            messageView.setTextColor(textColor)
            messageView.setTextAppearance(getResourceId(R.styleable.Toast_android_textAppearance, 0))
            message = getString(R.styleable.Toast_android_text)
            messageView.maxLines = getInt(R.styleable.Toast_android_maxLines, 0)
        }
        setBackgroundValueList(backgroundList)
        initContent()
        resetChildrenColorState()
    }

    /**
     * Устанавливает обработчик нажатия на иконку в конце тоста.
     *
     * @param listener Обработчик события нажатия.
     */
    fun setContentEndClickListener(listener: OnClickListener) {
        contentEndView.setOnClickListener(listener)
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(backgroundList)
    }

    private fun initContent() {
        addView(contentStartView, LayoutParams(_contentStartSize, _contentStartSize))
        addView(
            messageView,
            LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                cellContent = CellContent.CENTER
            },
        )
        addView(
            contentEndView,
            LayoutParams(_contentEndSize, _contentEndSize).apply {
                cellContent = CellContent.END
            },
        )
    }

    private fun resetChildrenColorState() {
        contentStartView.colorState = colorState
        contentEndView.colorState = colorState
        messageView.colorState = colorState
    }

    private companion object {
        const val DEFAULT_CONTENT_SIZE = ViewGroup.LayoutParams.WRAP_CONTENT
    }
}

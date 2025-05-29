package com.sdds.uikit.overlays

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.Window
import android.view.WindowManager
import androidx.annotation.StyleRes
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.DialogFragment
import com.sdds.uikit.R
import com.sdds.uikit.internal.overlays.ModalView

/**
 * Опции отображения модального окна.
 * Используются для конфигурации внешнего вида и поведения [ModalFragment].
 */
class ModalOptions private constructor(

    /**
     * Идентификатор стиля, применяемый к модальному окну.
     */
    @StyleRes
    val style: Int?,

    /**
     * Ширина модального окна в пикселях или значение из [LayoutParams].
     */
    val width: Int,

    /**
     * Высота модального окна в пикселях или значение из [LayoutParams].
     */
    val height: Int,

    /**
     * Отображать ли иконку закрытия в модальном окне.
     */
    val hasClose: Boolean?,

    /**
     * Нужно ли затемнять фон при отображении модального окна.
     */
    val dimBackground: Boolean,

    /**
     * Гравитация модального окна на экране (например, [Gravity.CENTER]).
     */
    val gravity: Int,
) {

    /**
     * Билдер для создания экземпляра [ModalOptions].
     * Позволяет поэтапно настраивать параметры модального окна.
     */
    class Builder {
        @StyleRes
        private var style: Int? = null
        private var width: Int = LayoutParams.WRAP_CONTENT
        private var height: Int = LayoutParams.WRAP_CONTENT
        private var hasClose: Boolean? = null
        private var dimBackground: Boolean = true
        private var gravity: Int = Gravity.CENTER

        /**
         * Устанавливает тему оформления модального окна.
         *
         * @param style идентификатор стиля
         */
        fun style(style: Int?) = apply {
            this.style = style
        }

        /**
         * Устанавливает ширину модального окна.
         *
         * @param width ширина в пикселях или LayoutParams.*
         */
        fun width(width: Int) = apply {
            this.width = width
        }

        /**
         * Устанавливает высоту модального окна.
         *
         * @param height высота в пикселях или LayoutParams.*
         */
        fun height(height: Int) = apply {
            this.height = height
        }

        /**
         * Устанавливает наличие иконки закрытия модального окна.
         *
         * @param hasClose true, если кнопка закрытия должна отображаться
         */
        fun hasClose(hasClose: Boolean?) = apply {
            this.hasClose = hasClose
        }

        /**
         * Устанавливает затемнение фона при отображении модального окна.
         *
         * @param dimBackground true для затемнения
         */
        fun dimBackground(dimBackground: Boolean) = apply {
            this.dimBackground = dimBackground
        }

        /**
         * Устанавливает гравитацию модального окна.
         *
         * @param gravity значение из [Gravity]
         */
        fun gravity(gravity: Int) = apply {
            this.gravity = gravity
        }

        /**
         * Создаёт экземпляр [ModalOptions] с заданными параметрами.
         */
        fun build(): ModalOptions {
            return ModalOptions(style, width, height, hasClose, dimBackground, gravity)
        }
    }
}

/**
 * Базовый класс для отображения модального окна через [DialogFragment].
 * Использует [ModalOptions] для настройки вида и поведения.
 */
abstract class ModalFragment : DialogFragment() {
    private var _modalView: ModalView? = null
    private lateinit var options: ModalOptions

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        options = onCreateModalOptions()
        return super.onCreateDialog(savedInstanceState).apply {
            setCancelable(true)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.apply {
            if (!options.dimBackground) {
                setDimAmount(0f)
                clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        }
    }

    /**
     * Метод для переопределения опций модального окна в подклассах.
     */
    open fun onCreateModalOptions(): ModalOptions = ModalOptions.Builder().build()

    /**
     * Метод обратного вызова при клике на кнопку закрытия.
     * Может быть переопределён.
     */
    open fun onCloseClicked() = Unit

    /**
     * Предоставляет пользовательский контент для отображения внутри модального окна.
     *
     * @return представление для отображения внутри модального окна
     */
    abstract fun getContentView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val context = options.style?.let { ContextThemeWrapper(requireContext(), it) } ?: requireContext()
        return LayoutInflater.from(context)
            .inflate(R.layout.sd_layout_modal_view, container, false)
            .apply {
                val content = getContentView(inflater, container, savedInstanceState)
                initView(this, content)
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _modalView = null
    }

    private fun close() {
        onCloseClicked()
        dismiss()
    }

    @Suppress("ClickableViewAccessibility")
    private fun initView(root: View, content: View?) = root.apply {
        val modalView = findViewById<ModalView>(R.id.modal_view)
        modalView.setContentView(content)
        modalView.setCloseIconClickListener {
            onCloseClicked()
            dismiss()
        }
        modalView.applyOptions(options)
        _modalView = modalView
        setOnTouchListener { _, event ->
            val isEventOutsize = (event.x < modalView.left) ||
                (event.x > modalView.right) ||
                (event.y < modalView.top) ||
                (event.y > modalView.bottom)
            if ((event.action == MotionEvent.ACTION_DOWN) && isEventOutsize) {
                close()
                true
            } else if (event.action == MotionEvent.ACTION_OUTSIDE) {
                close()
                true
            } else {
                false
            }
        }
    }

    private fun ModalView.applyOptions(options: ModalOptions?) {
        options ?: return
        options.hasClose?.let { setHasClose(it) }
        updateLayoutParams<android.widget.FrameLayout.LayoutParams> {
            width = options.width
            height = options.height
            gravity = options.gravity
        }
    }
}

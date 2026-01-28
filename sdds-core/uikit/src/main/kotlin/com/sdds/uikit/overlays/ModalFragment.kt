package com.sdds.uikit.overlays

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewPropertyAnimator
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.WindowCompat
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.DialogFragment
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.AnimationUtils
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
     * Должно ли затемнение быть нативным или качестве затемнения должен быть оверлей.
     * Работает только при [dimBackground] == true
     */
    val useNativeBlackout: Boolean,

    /**
     * Режим отображения оверлея модального окна. Если true, оверлей отображается от края до края экрана.
     */
    val edgeToEdge: Boolean,
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
        private var useNativeBlackout: Boolean = false

        private var edgeToEdge: Boolean = true
        private var gravity: Int = Gravity.CENTER

        /**
         * Устанавливает тему оформления модального окна.
         *
         * @param style идентификатор стиля
         */
        fun style(@StyleRes style: Int?) = apply {
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
         * Устанавливает нативное затемнение фона при отображении модального окна.
         *
         * @param useNativeBlackout true для нативного затемнения
         */
        fun useNativeBlackout(useNativeBlackout: Boolean) = apply {
            this.useNativeBlackout = useNativeBlackout
        }

        /**
         * Устанавливает режим отображения щверлея на весь экран от края до края
         *
         * @param edgeToEdge true для отображения оверлея на весь экран
         */
        fun edgeToEdge(edgeToEdge: Boolean) = apply {
            this.edgeToEdge = edgeToEdge
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
            return ModalOptions(
                style = style,
                width = width,
                height = height,
                hasClose = hasClose,
                dimBackground = dimBackground,
                useNativeBlackout = useNativeBlackout,
                edgeToEdge = edgeToEdge,
                gravity = gravity,
            )
        }
    }
}

/**
 * Базовый класс для отображения модального окна через [DialogFragment].
 * Использует [ModalOptions] для настройки вида и поведения.
 */
abstract class ModalFragment : DialogFragment() {
    private var animationManager: ModalAnimationManager? = null
    private var _modalViewContainer: View? = null
    private lateinit var options: ModalOptions

    private val useOverlay: Boolean
        get() = !options.useNativeBlackout && options.dimBackground

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
            if (options.edgeToEdge) {
                WindowCompat.setDecorFitsSystemWindows(this, false)
                addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    attributes.fitInsetsTypes = 0
                    attributes.fitInsetsSides = 0
                }
            }
            setWindowAnimations(-1)
            if (!options.useNativeBlackout || !options.dimBackground) {
                setDimAmount(0f)
                clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animationManager?.startEnterAnimation()
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
    abstract fun getContentView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View?

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val context = options
            .style
            ?.let { ContextThemeWrapper(requireContext(), it) }
            ?: requireContext()
        var themeOverlay = context
        animationManager = ModalAnimationManager()
        val modalStyle = themeOverlay.resolveStyle(R.attr.sd_modalStyle)
        themeOverlay.withStyledAttributes(modalStyle, R.styleable.ModalView) {
            val overlayStyleOverlay = getResourceId(R.styleable.ModalView_sd_overlayStyleOverlay, 0)
            val enterAnimationRes = getResourceId(R.styleable.ModalView_sd_enterAnimation, 0)
            val exitAnimationRes = getResourceId(R.styleable.ModalView_sd_exitAnimation, 0)
            animationManager?.modalViewEnterAnimation =
                AnimationUtils.loadAnimation(themeOverlay, enterAnimationRes)
            animationManager?.modalViewExitAnimation =
                AnimationUtils.loadAnimation(themeOverlay, exitAnimationRes)
            animationManager?.overlayEnterAnimationDuration =
                getInt(R.styleable.ModalView_sd_overlayEnterAnimationDuration, 0)
            animationManager?.overlayExitAnimationDuration =
                getInt(R.styleable.ModalView_sd_overlayExitAnimationDuration, 0)

            if (overlayStyleOverlay != 0) {
                themeOverlay = ContextThemeWrapper(themeOverlay, overlayStyleOverlay)
            }
        }

        val layout = if (useOverlay) {
            R.layout.sd_layout_overlay_modal_view
        } else {
            R.layout.sd_layout_modal_view
        }

        val rootView = LayoutInflater.from(themeOverlay)
            .inflate(layout, container, false)
            .apply {
                val content = getContentView(inflater, container, savedInstanceState)
                initView(this, content)
            }

        animationManager?.apply {
            this.useOverlay = this@ModalFragment.useOverlay
            this.rootView = rootView
            this.modalView = _modalViewContainer
        }
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _modalViewContainer = null
        animationManager = null
    }

    private fun closeWithAnimation() {
        onCloseClicked()
        animationManager?.startExitAnimation {
            dismiss()
        }
    }

    private fun close() {
        onCloseClicked()
        dismiss()
    }

    @Suppress("ClickableViewAccessibility")
    private fun initView(root: View, content: View?) = root.apply {
        val modalView = findViewById<ModalView>(R.id.modal_view)
        val modalViewContainer = findViewById<FrameLayout>(R.id.modal_view_container)
        modalView.setContentView(content)
        modalView.setCloseIconClickListener {
            onCloseClicked()
            dismiss()
        }
        val shadowPaddings = modalView.getShadowPaddings()
        val shadowOffset = getShadowOffset(shadowPaddings, options.gravity)
        modalView.applyOptions(options, shadowOffset)
        modalViewContainer.updateLayoutParams<android.widget.FrameLayout.LayoutParams> {
            gravity = options.gravity
        }
        modalViewContainer.setPadding(
            shadowPaddings.left,
            shadowPaddings.top,
            shadowPaddings.right,
            shadowPaddings.bottom,
        )
        _modalViewContainer = modalViewContainer

        setOnTouchListener { _, event ->
            val isEventOutsize = (event.x < modalView.left) ||
                (event.x > modalView.right) ||
                (event.y < modalView.top) ||
                (event.y > modalView.bottom)
            if ((event.action == MotionEvent.ACTION_DOWN) && isEventOutsize) {
                closeWithAnimation()
                true
            } else if (event.action == MotionEvent.ACTION_OUTSIDE) {
                closeWithAnimation()
                true
            } else {
                false
            }
        }
    }

    private fun ModalView.applyOptions(options: ModalOptions?, shadowOffset: Rect) {
        options ?: return
        options.hasClose?.let { setHasClose(it) }
        updateLayoutParams<android.widget.FrameLayout.LayoutParams> {
            width = options.width
            height = options.height
            gravity = options.gravity
            setMargins(
                shadowOffset.left,
                shadowOffset.top,
                shadowOffset.right,
                shadowOffset.bottom,
            )
        }
    }

    private fun View.getShadowOffset(
        shadowPaddings: Rect,
        gravity: Int,
    ): Rect {
        val topPadding = shadowPaddings.top
        val bottomPadding = shadowPaddings.bottom
        val startPadding = shadowPaddings.left
        val endPadding = shadowPaddings.right

        val absoluteGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection)
        val horizontalGravity = absoluteGravity and Gravity.HORIZONTAL_GRAVITY_MASK
        val verticalGravity = absoluteGravity and Gravity.VERTICAL_GRAVITY_MASK
        val resultRect = Rect()

        when (horizontalGravity) {
            Gravity.LEFT -> resultRect.left = -startPadding
            Gravity.RIGHT -> resultRect.right = -endPadding
            Gravity.CENTER_HORIZONTAL -> {
                val offset = (endPadding - startPadding) / 2
                resultRect.left = offset
            }
        }
        when (verticalGravity) {
            Gravity.TOP -> resultRect.top = -topPadding
            Gravity.BOTTOM -> resultRect.bottom = -bottomPadding
            Gravity.CENTER_VERTICAL -> {
                val offset = (bottomPadding - topPadding) / 2
                resultRect.top = offset
            }
        }
        return resultRect
    }

    private companion object {
        fun Context.resolveStyle(attr: Int): Int {
            return TypedValue().run {
                theme.resolveAttribute(attr, this, true)
                data
            }
        }
    }
}

/**
 * Управляет анимацией контента модального окна и оверлея
 */
private class ModalAnimationManager {
    private var overlayEnterPropertyAnimator: ViewPropertyAnimator? = null
    private var overlayExitPropertyAnimator: ViewPropertyAnimator? = null

    var useOverlay: Boolean = false
    var modalView: View? = null
    var rootView: View? = null
    var overlayEnterAnimationDuration: Int = 0
    var overlayExitAnimationDuration: Int = 0
    var modalViewEnterAnimation: Animation? = null
    var modalViewExitAnimation: Animation? = null

    fun startEnterAnimation() {
        modalViewEnterAnimation?.cancel()
        overlayEnterPropertyAnimator?.cancel()
        modalViewEnterAnimation?.let { modalView?.startAnimation(it) }
        if (useOverlay) {
            overlayEnterPropertyAnimator =
                rootView?.overlayFadeIn(duration = overlayEnterAnimationDuration)
        }
    }

    fun startExitAnimation(onEnd: () -> Unit) {
        modalViewExitAnimation?.cancel()
        overlayExitPropertyAnimator?.cancel()

        modalViewExitAnimation?.setAnimationListener(
            object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) = Unit
                override fun onAnimationEnd(animation: Animation?) {
                    if (!useOverlay) onEnd.invoke()
                }

                override fun onAnimationRepeat(animation: Animation?) = Unit
            },
        )
        modalViewExitAnimation?.let { modalView?.startAnimation(it) }
        if (useOverlay) {
            overlayExitPropertyAnimator =
                rootView?.overlayFadeOut(duration = overlayExitAnimationDuration) {
                    modalViewExitAnimation?.cancel()
                    onEnd.invoke()
                }
        } else if (modalViewExitAnimation == null) {
            onEnd.invoke()
        }
    }

    private companion object {
        fun View.overlayFadeIn(duration: Int): ViewPropertyAnimator {
            this.alpha = 0f
            return animate()
                .alpha(1f)
                .setDuration(duration.toLong())
                .setListener(null)
        }

        fun View.overlayFadeOut(duration: Int, onEnd: () -> Unit): ViewPropertyAnimator {
            return animate()
                .alpha(0f)
                .setDuration(duration.toLong())
                .setListener(
                    object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            onEnd.invoke()
                        }
                    },
                )
        }
    }
}

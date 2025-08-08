package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.widget.FrameLayout
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.CircularProgressBar.ProgressListener

/**
 * Компонент, который используется для уведомления пользователей о том, что загрузка началась.
 * Может отображать бесконечный прогресс [Spinner] или конечный [CircularProgressBar].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class Loader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_loaderStyle,
    defStyleRes: Int = R.style.Sdds_Components_Loader,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val spinner: Spinner = Spinner(
        spinnerWrapper(context, attrs, defStyleAttr, defStyleRes),
    ).apply {
        layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
            Gravity.CENTER,
        )
        visibility = INVISIBLE
    }

    private val circularProgress: CircularProgressBar = CircularProgressBar(
        progressWrapper(context, attrs, defStyleAttr, defStyleRes),
    ).apply {
        layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
            Gravity.CENTER,
        )
        visibility = INVISIBLE
    }

    private var _loaderType: Int = PROGRESS
    private var _currentProgress: Float = 0f
    private var _minProgress: Float = 0f
    private var _maxProgress: Float = 0f
    private var _trackEnabled: Boolean = true
    private var _valueEnabled: Boolean = true

    /**
     * Тип отображаемого прогресса - бесконечный [SPINNER]
     * конечный [PROGRESS]
     */
    open var loaderType: Int
        get() = _loaderType
        set(value) {
            if (_loaderType != value) {
                _loaderType = value
                updateVisibility()
            }
        }

    /**
     * Текущий прогресс
     */
    open var progress: Float
        get() = _currentProgress
        set(value) {
            if (_currentProgress != value) {
                _currentProgress = value
                circularProgress.progress = value
            }
        }

    /**
     * Минимальный прогресс
     */
    open var minProgress: Float
        get() = _minProgress
        set(value) {
            if (_minProgress != value) {
                _minProgress = value
                circularProgress.minProgress = value
            }
        }

    /**
     * Максимальный прогресс
     */
    open var maxProgress: Float
        get() = _maxProgress
        set(value) {
            if (_maxProgress != value) {
                _maxProgress = value
                circularProgress.maxProgress = value
            }
        }

    /**
     * Включает/выключает отображение линии фона прогресса
     */
    open var trackEnabled: Boolean
        get() = _trackEnabled
        set(value) {
            if (_trackEnabled != value) {
                _trackEnabled = value
                circularProgress.trackEnabled = value
            }
        }

    /**
     * Включает/выключает отображение значение прогресса
     */
    open var valueEnabled: Boolean
        get() = _valueEnabled
        set(value) {
            if (_valueEnabled != value) {
                _valueEnabled = value
                circularProgress.valueEnabled = value
            }
        }

    /**
     * Устанавливает текущий прогресс с анимацией, если [animate] == true
     * @param progress текущий прогресс
     * @param animate включена ли анимация
     */
    open fun setProgress(progress: Float, animate: Boolean) {
        circularProgress.setProgress(progress, animate)
    }

    /**
     * Устанавливает суффикс для value
     * @param suffix суффикс (единца измерения прогреса)
     */
    open fun setValueSuffix(suffix: String?) {
        circularProgress.setValueSuffix(suffix)
    }

    /**
     * Устанавливает слушателя изменения прогресса
     */
    fun setProgressListener(progressListener: ProgressListener?) {
        circularProgress.setProgressListener(progressListener)
    }

    /**
     * Устанавливает угол дуги индикатора [Spinner]
     * @param angle угол дуги
     */
    open fun setSweepAngle(angle: Float) {
        spinner.setSweepAngle(angle)
    }

    /**
     * Устанавливает скорость вращения дуги [Spinner]
     * @param duration длительность вращения в мс
     */
    open fun setDuration(duration: Long) {
        spinner.setDuration(duration)
    }

    init {
        context.withStyledAttributes(attrs, R.styleable.Loader, defStyleAttr, defStyleRes) {
            _loaderType = getInt(R.styleable.Loader_sd_loaderType, 0)
            progress = getFloat(R.styleable.Loader_sd_progress, 0.5f)
            minProgress = getFloat(R.styleable.Loader_sd_minProgress, 0f)
            maxProgress = getFloat(R.styleable.Loader_sd_maxProgress, 1f)
            trackEnabled = getBoolean(R.styleable.Loader_sd_trackEnabled, true)
            valueEnabled = getBoolean(R.styleable.Loader_sd_progressValueEnabled, true)
            setValueSuffix(getString(R.styleable.Loader_sd_progressValueSuffix))

            val angle = getFloat(R.styleable.Loader_sd_sweepAngle, 0f)
            if (angle > 0f) setSweepAngle(angle)
        }
        populateLoader()
        updateVisibility()
    }

    private fun updateVisibility() {
        when (_loaderType) {
            SPINNER -> {
                spinner.visibility = VISIBLE
                circularProgress.visibility = INVISIBLE
            }

            PROGRESS -> {
                spinner.visibility = INVISIBLE
                circularProgress.visibility = VISIBLE
            }
        }
    }

    private fun populateLoader() {
        addView(spinner)
        addView(circularProgress)
    }

    companion object {

        /**
         * Константа LaderType для отображения [Spinner].
         */
        const val SPINNER = 0

        /**
         * Константа LaderType для отображения [CircularProgressBar].
         */
        const val PROGRESS = 1

        internal fun spinnerWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Loader, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.Loader_sd_spinnerStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }

        internal fun progressWrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Loader, defStyleAttr, defStyleRes) {
                val styleOverlay = getResourceId(R.styleable.Loader_sd_circularProgressBarStyleOverlay, 0)
                if (styleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, styleOverlay)
                }
            }
            return themeOverlay
        }
    }
}

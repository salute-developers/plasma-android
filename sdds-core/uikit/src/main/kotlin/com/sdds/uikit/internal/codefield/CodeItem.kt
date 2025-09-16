package com.sdds.uikit.internal.codefield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StyleRes
import com.sdds.uikit.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.statelist.NumberStateList

/**
 * Компонент CodeItem
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see View
 */
internal class CodeItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context), ColorStateHolder {

    private var _codeItemState: CodeItemState = CodeItemState.ORDINARY
    private val codeItemDrawable: CodeItemDrawable = CodeItemDrawable(
        context,
        attrs,
        defStyleAttr,
    ).apply { callback = this@CodeItem }

    /**
     * Состояние компонента [CodeItem]
     */
    enum class CodeItemState {

        /**
         * Обычное состояние [CodeItem]
         */
        ORDINARY,

        /**
         * В [CodeItem] введен не верный символ
         */
        ERROR,

        /**
         * [CodeItem] готов к вводу символа
         */
        ACTIVATED,

        /**
         * Состояние для подсвечивания [CodeItem], на котором
         * остановился ввод
         */
        FOCUSED,
    }

    /**
     * Состояние [CodeItem].
     * @see CodeItemState
     */
    var codeItemState: CodeItemState
        get() = _codeItemState
        set(value) {
            if (_codeItemState != value) {
                _codeItemState = value
                refreshDrawableState()
            }
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        isFocusable = false
        isClickable = false
        isLongClickable = false
        isFocusableInTouchMode = false
    }

    /**
     * Устанавливает [ShapeModel] для отрисовки новой формы
     * @param sModel [ShapeModel]
     */
    fun setShapeModel(sModel: ShapeModel) {
        codeItemDrawable.setShapeModel(sModel)
    }

    /**
     * Устанавливает контент
     * @param content контент для отображения в ячейке ввода
     * @see CodeContent
     */
    fun setContent(content: CodeContent) {
        codeItemDrawable.setContent(content)
    }

    /**
     * Включает отображение мигающего курсора на ячейке ввода
     * @param enabled true - включено
     */
    fun setCursorEnabled(enabled: Boolean) {
        codeItemDrawable.hasCursor = enabled
    }

    /**
     * Устанавливает толщину бордера точки, скрывающей вводимый символ
     * @param strokeWidth толщина бордера
     */
    fun setStrokeWidth(strokeWidth: Float) {
        codeItemDrawable.setDotStrokeWidth(strokeWidth)
    }

    /**
     * Устанавливает цвета окраса бордера точки, скрывающей символы
     * @param colors цвета бордера
     * @see ColorStateList
     */
    fun setDotStrokeTintList(colors: ColorStateList?) {
        codeItemDrawable.setDotStrokeTintList(colors)
    }

    /**
     * Устанавливает цвета фона
     * @param itemTintList цвета фона
     * @see ColorStateList
     */
    fun setTintList(itemTintList: ColorStateList?) {
        codeItemDrawable.setItemTintList(itemTintList)
    }

    /**
     * Устанавливает стиль текста
     * @param context контекст
     * @param appearanceId ссылка на ресурс стиля
     */
    fun setTextAppearance(context: Context, @StyleRes appearanceId: Int) {
        codeItemDrawable.setItemTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     * @see ColorStateList
     */
    fun setTextColorList(colors: ColorStateList?) {
        codeItemDrawable.setTextColorList(colors)
    }

    /**
     * Устанавливает цвета окраса точки, скрывающей символы
     * @param colors цвета точки
     * @see ColorStateList
     */
    fun setDotFillColorList(colors: ColorStateList?) {
        codeItemDrawable.setDotFillColorList(colors)
    }

    /**
     * Устанавливает цвета мигающего курсора
     * @param tint цвета курсора
     */
    fun setCursorTint(tint: ColorStateList?) {
        codeItemDrawable.setCursorTint(tint)
    }

    /**
     * Устанавливает размеры точки, скрывающей вводимый символ
     * @param sizeList размеры точки
     */
    fun setDotSizeNumberList(sizeList: NumberStateList?) {
        codeItemDrawable.setDotSizeNumberList(sizeList)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == codeItemDrawable
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        // Проверяем на null, так как onCreateDrawableState может выполняться до инициализации _codeItemState
        codeItemState.let { state ->
            when (state) {
                CodeItemState.ERROR -> mergeDrawableStates(drawableState, ErrorState)
                CodeItemState.ACTIVATED -> mergeDrawableStates(drawableState, ActivatedState)
                CodeItemState.FOCUSED -> mergeDrawableStates(drawableState, FocusState)
                else -> {}
            }
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        codeItemDrawable.state = drawableState
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        codeItemDrawable.setBounds(0, 0, w, h)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        codeItemDrawable.draw(canvas)
    }

    private companion object {
        val ActivatedState = intArrayOf(android.R.attr.state_activated)
        val ErrorState = intArrayOf(R.attr.sd_state_error)
        val FocusState = intArrayOf(android.R.attr.state_focused)
    }
}

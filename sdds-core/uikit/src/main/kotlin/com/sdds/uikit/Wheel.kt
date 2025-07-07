package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.updateLayoutParams
import com.sdds.uikit.internal.wheel.WheelItemView
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList

/**
 * Компонент выбора значения в виде набора вертикальных колес (списков), напоминающих колесо прокрутки.
 *
 * Позволяет отображать один или несколько списков значений с возможностью выбора,
 * управления стилями, добавления иконок управления, описаний и разделителей.
 *
 * Используется для ввода чисел, дат, времени или других параметров, где требуется выбор из списка.
 *
 * Поддерживает:
 * - Несколько колес с независимыми данными.
 * - Кастомизацию внешнего вида (цвета, отступы, стили).
 * - Иконки управления прокруткой.
 * - Бесконечную прокрутку и разделители между колесами.
 *
 * @param context Контекст, в котором используется компонент.
 * @param attrs Атрибуты XML, применённые к компоненту.
 * @param defStyleAttr Стиль по умолчанию для атрибута.
 * @param defStyleRes Ресурс стиля по умолчанию.
 */
open class Wheel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_wheelStyle,
    defStyleRes: Int = R.style.Sdds_Components_Wheel,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val _wheelPool = mutableMapOf<Int, WheelItemView>()
    private val _entrySelectedListeners = mutableSetOf<EntrySelectedListener>()
    private val _entrySelectedListener = EntrySelectedListener { wheelId, entry ->
        _entrySelectedListeners.forEach { it.onEntrySelected(wheelId, entry) }
    }
    private var _visibleEntriesCount: Int = 5
    private var _controlsEnabled: Boolean = false
    private var _controlIconUp: Drawable? = null
    private var _controlIconUpTintList: ColorStateList? = null
    private var _controlIconDown: Drawable? = null
    private var _controlIconDownTintList: ColorStateList? = null

    private var _itemTextAppearance: Int = 0
    private var _itemTextColor: ColorValueStateList? = null
    private var _itemTextAfterAppearance: Int = 0
    private var _itemTextAfterColor: ColorValueStateList? = null

    private var _itemAlignment: Int = ITEM_ALIGNMENT_CENTER
    private var _itemTextAfterPadding: Int = 0
    private var _entryMinSpacing: Int = 0

    private var _descriptionTextAppearance: Int = 0
    private var _descriptionTextColor: ColorValueStateList? = null
    private var _descriptionPadding: Int = 0

    private var _wheelItemCount: Int = 0
    private var _separatorType: Int = SEPARATOR_TYPE_NONE
    private var _separatorColor: ColorValueStateList? = null
    private var _separatorSpacing: Int = 0

    private var _infiniteScrollEnabled: Boolean = false

    /**
     * Количество видимых элементов в каждом колесе.
     */
    open var visibleEntriesCount: Int
        get() = _visibleEntriesCount
        set(value) {
            if (_visibleEntriesCount != value) {
                _visibleEntriesCount = value
                configureWheelItems {
                    it.visibleEntriesCount = value
                }
            }
        }

    /**
     * Количество колес на экране.
     */
    open var wheelCount: Int
        get() = _wheelItemCount
        set(value) {
            if (_wheelItemCount != value) {
                _wheelItemCount = value
                _wheelPool.clear()
                populate()
                requestLayout()
                invalidate()
            }
        }

    /**
     * Отображать ли кнопки управления (вверх/вниз) у элементов.
     */
    open var controlsEnabled: Boolean
        get() = _controlsEnabled
        set(value) {
            if (_controlsEnabled != value) {
                _controlsEnabled = value
                configureWheelItems {
                    it.controlsEnabled = value
                }
            }
        }

    /**
     * Иконка кнопки прокрутки вверх.
     */
    open var controlIconUp: Drawable?
        get() = _controlIconUp
        set(value) {
            if (_controlIconUp != value) {
                _controlIconUp = value
                configureWheelItems {
                    it.controlIconUp = value?.newMutated()
                }
            }
        }

    /**
     * Иконка кнопки прокрутки вниз.
     */
    open var controlIconDown: Drawable?
        get() = _controlIconDown
        set(value) {
            if (_controlIconDown != value) {
                _controlIconDown = value
                configureWheelItems {
                    it.controlIconDown = value?.newMutated()
                }
            }
        }

    /**
     * Выравнивание текста внутри элементов.
     */
    open var itemAlignment: Int
        get() = _itemAlignment
        set(value) {
            if (_itemAlignment != value) {
                _itemAlignment = value
                configureWheelItems {
                    it.itemAlignment = value.ensureCorrectItemAlignment(it.id)
                }
            }
        }

    /**
     * Минимальное расстояние между элементами.
     */
    open var entryMinSpacing: Int
        get() = _entryMinSpacing
        set(value) {
            if (_entryMinSpacing != value) {
                _entryMinSpacing = value
                configureWheelItems {
                    it.entryMinSpacing = value
                }
            }
        }

    /**
     * Отступ между основным текстом и дополнительным текстом элемента.
     */
    open var itemTextAfterPadding: Int
        get() = _itemTextAfterPadding
        set(value) {
            if (_itemTextAfterPadding != value) {
                _itemTextAfterPadding = value
                configureWheelItems {
                    it.itemTextAfterPadding = value
                }
            }
        }

    /**
     * Тип разделителя между колесами.
     */
    open var separatorType: Int
        get() = _separatorType
        set(value) {
            if (_separatorType != value) {
                _separatorType = value
                populate()
            }
        }

    /**
     * Отступ между разделителем и соседними колесами.
     */
    open var separatorSpacing: Int
        get() = _separatorSpacing
        set(value) {
            if (_separatorSpacing != value) {
                _separatorSpacing = value
                configureDividers { it.setSeparatorSpacing() }
            }
        }

    /**
     * Отступ описания от основного текста.
     */
    open var descriptionPadding: Int
        get() = _descriptionPadding
        set(value) {
            if (_descriptionPadding != value) {
                _descriptionPadding = value
                configureWheelItems { it.descriptionPadding = value }
            }
        }

    /**
     * Включена ли бесконечная прокрутка.
     */
    open var infiniteScrollEnabled: Boolean
        get() = _infiniteScrollEnabled
        set(value) {
            if (_infiniteScrollEnabled != value) {
                _infiniteScrollEnabled = value
                configureWheelItems { it.infiniteScrollEnabled = value }
            }
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.Wheel, defStyleAttr, defStyleRes) {
            controlsEnabled = getBoolean(R.styleable.Wheel_sd_controlsEnabled, false)
            setItemTextAppearance(getResourceId(R.styleable.Wheel_sd_itemTextAppearance, 0))
            setItemTextColor(getColorValueStateList(context, R.styleable.Wheel_sd_itemTextColor))
            setItemTextAfterAppearance(getResourceId(R.styleable.Wheel_sd_itemTextAfterAppearance, 0))
            setItemTextAfterColor(getColorValueStateList(context, R.styleable.Wheel_sd_itemTextAfterColor))
            itemAlignment = getInt(R.styleable.Wheel_sd_itemAlignment, ITEM_ALIGNMENT_CENTER)
            entryMinSpacing = getDimensionPixelSize(R.styleable.Wheel_sd_itemMinSpacing, DEFAULT_MIN_SPACING)
            itemTextAfterPadding = getDimensionPixelSize(R.styleable.Wheel_sd_itemTextAfterPadding, 0)
            setDescriptionTextAppearance(getResourceId(R.styleable.Wheel_sd_descriptionTextAppearance, 0))
            setDescriptionTextColor(getColorValueStateList(context, R.styleable.Wheel_sd_descriptionTextColor))
            controlIconUp = getDrawable(R.styleable.Wheel_sd_controlIconUp)
            _controlIconUpTintList = getColorStateList(R.styleable.Wheel_sd_controlIconUpTint)
            controlIconDown = getDrawable(R.styleable.Wheel_sd_controlIconDown)
            _controlIconDownTintList = getColorStateList(R.styleable.Wheel_sd_controlIconDownTint)
            wheelCount = getInt(R.styleable.Wheel_sd_wheelCount, 1)
            separatorType = getInt(R.styleable.Wheel_sd_separatorType, SEPARATOR_TYPE_NONE)
            _separatorColor = getColorValueStateList(context, R.styleable.Wheel_sd_separatorColor)
            separatorSpacing = getDimensionPixelSize(R.styleable.Wheel_sd_separatorSpacing, 0)
            descriptionPadding = getDimensionPixelSize(R.styleable.Wheel_sd_descriptionPadding, 0)
        }
        orientation = HORIZONTAL
        gravity = Gravity.CENTER
        clipChildren = false
        clipToPadding = false
    }

    /**
     * Добавляет слушатель выбора элемента.
     *
     * @param entrySelectedListener Обработчик выбора элемента.
     */
    open fun addEntrySelectionListener(entrySelectedListener: EntrySelectedListener) {
        _entrySelectedListeners.add(entrySelectedListener)
    }

    /**
     * Удаляет слушатель выбора элемента.
     *
     * @param entrySelectedListener Обработчик для удаления.
     */
    open fun removeEntrySelectionListener(entrySelectedListener: EntrySelectedListener) {
        _entrySelectedListeners.remove(entrySelectedListener)
    }

    /**
     * Устанавливает данные для колеса по идентификатору.
     *
     * @param wheelId Идентификатор колеса.
     * @param entries Список элементов.
     */
    open fun setData(wheelId: Int, entries: List<WheelItemEntry>) {
        val wheelItem = findViewById<WheelItemView>(wheelId) ?: return
        wheelItem.setData(entries)
    }

    /**
     * Устанавливает описание для конкретного колеса.
     *
     * @param wheelId Идентификатор колеса.
     * @param description Описание.
     */
    open fun setDescription(wheelId: Int, description: CharSequence?) {
        val wheelItem = findViewById<WheelItemView>(wheelId) ?: return
        wheelItem.description = description
    }

    /**
     * Устанавливает описание для всех колес.
     *
     * @param description Описание.
     */
    open fun setDescription(description: CharSequence?) {
        configureWheelItems {
            it.description = description
        }
    }

    /**
     * Возвращает описание указанного колеса.
     *
     * @param wheelId Идентификатор колеса.
     * @return Описание или null.
     */
    open fun getDescription(wheelId: Int): CharSequence? {
        return _wheelPool[wheelId]?.description
    }

    /**
     * Устанавливает выбранный элемент по идентификатору.
     *
     * @param wheelId Идентификатор колеса.
     * @param entryId Идентификатор элемента.
     * @param animate Использовать анимацию или нет.
     * @return true, если элемент найден и выбран.
     */
    open fun setSelectedEntry(wheelId: Int, entryId: Long, animate: Boolean = true): Boolean {
        val wheelItem = findViewById<WheelItemView>(wheelId) ?: return false
        return wheelItem.setSelectedEntry(entryId, animate)
    }

    /**
     * Возвращает выбранный элемент колеса.
     *
     * @param wheelId Идентификатор колеса.
     * @return Выбранный элемент или null.
     */
    open fun getSelectedEntry(wheelId: Int): WheelItemEntry? {
        val wheelItem = findViewById<WheelItemView>(wheelId) ?: return null
        return wheelItem.getSelectedEntry()
    }

    /**
     * Устанавливает стиль текста описания.
     *
     * @param appearanceId Идентификатор стиля.
     */
    open fun setDescriptionTextAppearance(@StyleRes appearanceId: Int) {
        if (_descriptionTextAppearance != appearanceId) {
            _descriptionTextAppearance = appearanceId
            configureWheelItems { it.setDescriptionTextAppearance(appearanceId) }
        }
    }

    /**
     * Устанавливает цвет текста описания.
     *
     * @param colorValueStateList Цвет или состояние цвета.
     */
    open fun setDescriptionTextColor(colorValueStateList: ColorValueStateList?) {
        if (_descriptionTextColor != colorValueStateList) {
            _descriptionTextColor = colorValueStateList
            configureWheelItems { it.setDescriptionTextColor(colorValueStateList) }
        }
    }

    /**
     * Устанавливает цвет текста описания.
     *
     * @param colorStateList Цвет или состояние цвета.
     */
    fun setDescriptionTextColor(colorStateList: ColorStateList?) {
        setDescriptionTextColor(ColorValueStateList.valueOf(colorStateList))
    }

    /**
     * Устанавливает цвет текста описания.
     *
     * @param color Цвет.
     */
    fun setDescriptionTextColor(@ColorInt color: Int) {
        setDescriptionTextColor(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает стиль текста элемента.
     *
     * @param appearanceId Идентификатор стиля.
     */
    open fun setItemTextAppearance(@StyleRes appearanceId: Int) {
        if (_itemTextAppearance != appearanceId) {
            _itemTextAppearance = appearanceId
            configureWheelItems { it.setItemTextAppearance(appearanceId) }
        }
    }

    /**
     * Устанавливает цвет текста элемента.
     *
     * @param colorValueStateList Цвет или состояние цвета.
     */
    open fun setItemTextColor(colorValueStateList: ColorValueStateList?) {
        if (_itemTextColor != colorValueStateList) {
            _itemTextColor = colorValueStateList
            configureWheelItems { it.setItemTextColor(colorValueStateList) }
        }
    }

    /**
     * Устанавливает цвет текста элемента.
     *
     * @param colorStateList Цвет или состояние цвета.
     */
    fun setItemTextColor(colorStateList: ColorStateList?) {
        setItemTextColor(ColorValueStateList.valueOf(colorStateList))
    }

    /**
     * Устанавливает цвет текста элемента.
     *
     * @param color Цвет.
     */
    fun setItemTextColor(@ColorInt color: Int) {
        setItemTextColor(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает стиль дополнительного текста элемента.
     *
     * @param appearanceId Идентификатор стиля.
     */
    open fun setItemTextAfterAppearance(@StyleRes appearanceId: Int) {
        if (_itemTextAfterAppearance != appearanceId) {
            _itemTextAfterAppearance = appearanceId
            configureWheelItems { it.setItemTextAfterAppearance(appearanceId) }
        }
    }

    /**
     * Устанавливает цвет дополнительного текста элемента.
     *
     * @param colorValueStateList Цвет или состояние цвета.
     */
    open fun setItemTextAfterColor(colorValueStateList: ColorValueStateList?) {
        if (_itemTextAfterColor != colorValueStateList) {
            _itemTextAfterColor = colorValueStateList
            configureWheelItems { it.setItemTextAfterColor(colorValueStateList) }
        }
    }

    /**
     * Устанавливает цвет дополнительного текста элемента.
     *
     * @param colorStateList Цвет или состояние цвета.
     */
    fun setItemTextAfterColor(colorStateList: ColorStateList?) {
        setItemTextAfterColor(ColorValueStateList.valueOf(colorStateList))
    }

    /**
     * Устанавливает цвет дополнительного текста элемента.
     *
     * @param color Цвет.
     */
    fun setItemTextAfterColor(@ColorInt color: Int) {
        setItemTextAfterColor(ColorValueStateList.valueOf(color))
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        populate()
    }

    final override fun setOrientation(orientation: Int) {
        super.setOrientation(HORIZONTAL)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
        if (separatorType == SEPARATOR_TYPE_DOTS && childCount > 0) {
            val anyWheelItem = getChildAt(0) as WheelItemView
            configureDotDividers {
                it.translationY = (it.measuredHeight - anyWheelItem.itemHeight + entryMinSpacing) / 2f
            }
        }
    }

    private fun populate() {
        removeAllViews()
        repeat(wheelCount) { id ->
            addView(getOrCreateWheelItem(id, _itemAlignment.ensureCorrectItemAlignment(id)))
            if (id < wheelCount - 1) {
                addView(createDivider())
            }
        }
    }

    private fun Int.ensureCorrectItemAlignment(wheelId: Int): Int {
        return when {
            this == ITEM_ALIGNMENT_MIXED && wheelId == 0 -> ITEM_ALIGNMENT_END
            this == ITEM_ALIGNMENT_MIXED && wheelId == wheelCount - 1 -> ITEM_ALIGNMENT_START
            this == ITEM_ALIGNMENT_MIXED -> ITEM_ALIGNMENT_CENTER
            else -> this
        }
    }

    private fun configureWheelItems(action: (WheelItemView) -> Unit) {
        children
            .filterIsInstance<WheelItemView>()
            .forEach { it.apply(action) }
    }

    private fun configureDividers(action: (View) -> Unit) {
        children
            .filter { it !is WheelItemView }
            .forEach { (it as? ViewGroup)?.getChildAt(0)?.apply(action) }
    }

    private fun configureDotDividers(action: (View) -> Unit) {
        configureDividers {
            if (it is TextView) action(it)
        }
    }

    private fun getOrCreateWheelItem(id: Int, alignment: Int = _itemAlignment): WheelItemView {
        val wheelItem = _wheelPool[id] ?: WheelItemView(context).also { _wheelPool[id] = it }
        return wheelItem.apply {
            this.id = id
            visibleEntriesCount = this@Wheel.visibleEntriesCount
            infiniteScrollEnabled = this@Wheel.infiniteScrollEnabled
            setItemTextAppearance(_itemTextAppearance)
            setItemTextColor(_itemTextColor)
            setItemTextAfterAppearance(_itemTextAfterAppearance)
            setItemTextAfterColor(_itemTextAfterColor)
            itemAlignment = alignment
            entryMinSpacing = this@Wheel.entryMinSpacing
            itemTextAfterPadding = this@Wheel.itemTextAfterPadding
            setDescriptionTextAppearance(_descriptionTextAppearance)
            setDescriptionTextColor(_descriptionTextColor)
            descriptionPadding = this@Wheel.descriptionPadding
            controlIconUp = this@Wheel.controlIconUp?.newMutated()
            controlIconDown = this@Wheel.controlIconDown?.newMutated()
            controlsEnabled = this@Wheel.controlsEnabled
            setControlIconUpColor(_controlIconUpTintList)
            setControlIconDownColor(_controlIconDownTintList)
            setEntrySelectedListener(_entrySelectedListener)
            layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT)
            isFocusable = false
        }
    }

    private fun createDivider(): View {
        val separator = when (separatorType) {
            SEPARATOR_TYPE_DIVIDER -> Divider(context).apply {
                isFocusable = false
                orientation = Divider.ORIENTATION_VERTICAL
                layoutParams = FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT)
            }
            SEPARATOR_TYPE_DOTS -> TextView(context).apply {
                isFocusable = false
                setTextColor(_separatorColor ?: _itemTextColor)
                text = SEPARATOR_DOTS_TEXT
                gravity = Gravity.CENTER
                setTextAppearance(_itemTextAppearance)
                layoutParams = FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
            }
            else -> null
        }
        return FrameLayout(context).apply {
            isFocusable = false
            separator?.let {
                it.updateLayoutParams<FrameLayout.LayoutParams> { this.gravity = Gravity.CENTER }
                addView(it)
            }
            setSeparatorSpacing()
        }
    }

    private fun View.setSeparatorSpacing() {
        val spacing = separatorSpacing.takeIf { it > 0 } ?: LayoutParams.WRAP_CONTENT
        layoutParams = MarginLayoutParams(spacing, LayoutParams.MATCH_PARENT)
    }

    /**
     * Интерфейс слушателя, уведомляющего о выборе элемента в одном из колес.
     *
     * Используется для отслеживания действий пользователя при выборе значения.
     */
    fun interface EntrySelectedListener {
        /**
         * Вызывается при выборе элемента пользователем.
         *
         * @param wheelId Идентификатор колеса, где был выбран элемент.
         * @param entry Выбранный элемент.
         */
        fun onEntrySelected(wheelId: Int, entry: WheelItemEntry)
    }

    /**
     * Элемент, отображаемый в колесе. Содержит основной текст и дополнительную строку после значения.
     *
     * Используется для представления данных внутри компонента [Wheel].
     *
     * @param id Уникальный идентификатор элемента.
     * @param title Основной текст элемента.
     * @param textAfter Дополнительный текст, отображаемый после значения (необязательный).
     */
    open class WheelItemEntry(
        override val id: Long,
        override val title: String,
        open val textAfter: String? = null,
    ) : ListItem {

        final override val hasDisclosure: Boolean = false

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is WheelItemEntry) return false

            if (id != other.id) return false
            if (title != other.title) return false
            if (textAfter != other.textAfter) return false
            if (hasDisclosure != other.hasDisclosure) return false

            return true
        }

        override fun hashCode(): Int {
            var result = id.hashCode()
            result = 31 * result + title.hashCode()
            result = 31 * result + (textAfter?.hashCode() ?: 0)
            result = 31 * result + hasDisclosure.hashCode()
            return result
        }
    }

    /**
     * Константы и вспомогательные методы для компонента [Wheel].
     */
    companion object {
        /** Текст, используемый в виде разделителя с точками. */
        private const val SEPARATOR_DOTS_TEXT = ":"

        /** Выравнивание элемента по началу. */
        const val ITEM_ALIGNMENT_START = 0

        /** Выравнивание элемента по центру. */
        const val ITEM_ALIGNMENT_CENTER = 1

        /** Выравнивание элемента по концу. */
        const val ITEM_ALIGNMENT_END = 2

        /**
         * Смешанное выравнивание: первый элемент — по концу, последний — по началу, остальные — по центру.
         */
        const val ITEM_ALIGNMENT_MIXED = 3

        /** Без разделителя между колесами. */
        const val SEPARATOR_TYPE_NONE = 0

        /** Вертикальная линия между колесами. */
        const val SEPARATOR_TYPE_DIVIDER = 1

        /** Текстовый разделитель с точками между колесами. */
        const val SEPARATOR_TYPE_DOTS = 2

        /** Значение минимального отступа по умолчанию между элементами. */
        private val DEFAULT_MIN_SPACING = 8.dp

        private fun Drawable.newMutated(): Drawable {
            return constantState?.newDrawable()?.mutate() ?: mutate()
        }
    }
}

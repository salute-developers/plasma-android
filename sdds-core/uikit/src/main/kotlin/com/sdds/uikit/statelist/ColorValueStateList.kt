package com.sdds.uikit.statelist

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.util.Xml
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.IdRes
import androidx.annotation.XmlRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.ColorUtils
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.shader.CachedShaderFactory
import com.sdds.uikit.shader.GradientShader
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.shape.ShapeDrawable
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException

/**
 * Реализация [ValueStateList] для хранения значений цвета в различных формах (цвет, список цветов, drawable, shader).
 *
 * Поддерживает сопоставление состояния View с соответствующим цветовым значением.
 * Может быть создан из XML, ресурса, Drawable, ColorInt или ColorStateList.
 *
 * Используется для задания динамического оформления в зависимости от состояния View.
 */
class ColorValueStateList(
    states: Array<IntArray>,
    private val values: Array<ColorValueHolder>,
) : ValueStateList<ColorValueHolder>(states, values) {

    override fun isStateful(): Boolean {
        return super.isStateful() || values.any { it.isStateful() }
    }

    companion object {

        private const val MAX_ALPHA_INT = 255
        private const val MAX_ALPHA_FLOAT = 1f
        private const val XML_ROOT = "color-selector"
        private const val ELEMENT_TAG = "item"

        /**
         * Оборачивает Drawable в [ColorValueStateList].
         *
         * @param value Drawable-объект.
         * @return Новый [ColorValueStateList] с одним элементом, либо null.
         */
        fun valueOf(value: Drawable?): ColorValueStateList? {
            if (value == null) return null
            return ColorValueStateList(arrayOf(IntArray(0)), arrayOf(ColorValueHolder.DrawableValue(value)))
        }

        /**
         * Оборачивает цветовое значение в [ColorValueStateList].
         *
         * @param value Цвет в виде Int.
         * @return Новый [ColorValueStateList] с одним элементом.
         */
        fun valueOf(@ColorInt value: Int): ColorValueStateList {
            return ColorValueStateList(arrayOf(IntArray(0)), arrayOf(ColorValueHolder.ColorValue(value)))
        }

        /**
         * Оборачивает [ColorStateList] в [ColorValueStateList].
         *
         * @param value Список цветов.
         * @return Новый [ColorValueStateList] с одним элементом, либо null.
         */
        fun valueOf(value: ColorStateList?): ColorValueStateList? {
            if (value == null) return null
            return ColorValueStateList(arrayOf(IntArray(0)), arrayOf(ColorValueHolder.ColorListValue(value)))
        }

        /**
         * Создаёт [ColorValueStateList] из массива состояний и соответствующих значений.
         *
         * @param states Массив массивов состояний.
         * @param values Список значений цвета.
         * @return Новый экземпляр [ColorValueStateList].
         */
        fun fromStates(states: Array<IntArray>, values: List<ColorValueHolder>): ColorValueStateList {
            require(states.size == values.size) { "States and values must have the same length" }
            return ColorValueStateList(states, values.toTypedArray())
        }

        /**
         * Создаёт экземпляр [ColorValueStateList] из XML-ресурса.
         *
         * @param context Контекст для доступа к ресурсам.
         * @param resId Идентификатор XML-ресурса.
         * @return Новый экземпляр [ColorValueStateList], либо null в случае ошибки.
         */
        fun inflate(context: Context, @XmlRes resId: Int): ColorValueStateList? {
            val parser = context.resources.getXml(resId)
            val stateSpecs = mutableListOf<IntArray>()
            val values = mutableListOf<ColorValueHolder>()

            var eventType = parser.eventType
            while (eventType != XmlPullParser.START_TAG && eventType != XmlPullParser.END_DOCUMENT) {
                eventType = parser.next()
            }

            if (parser.name != XML_ROOT) {
                throw XmlPullParserException("Expected <$XML_ROOT> as root")
            }

            while (parser.next() != XmlPullParser.END_DOCUMENT) {
                if (parser.eventType == XmlPullParser.START_TAG && parser.name == ELEMENT_TAG) {
                    val itemAttrs = Xml.asAttributeSet(parser)

                    val a = context.obtainStyledAttributes(itemAttrs, R.styleable.ColorValueStateListItem)
                    val valueResId = a.getResourceId(R.styleable.ColorValueStateListItem_sd_color, 0)
                    val alpha = a.getFloat(R.styleable.ColorValueStateListItem_android_alpha, 1f)
                    a.recycle()

                    if (valueResId == 0) continue

                    val resolvedValue = resolveValue(context, valueResId, alpha)
                    val stateSet = extractStateSet(itemAttrs)

                    stateSpecs += stateSet
                    values += resolvedValue
                }
            }

            return fromStates(stateSpecs.toTypedArray(), values)
        }

        /**
         * Получает [ColorValueStateList] по ID ресурса, применяя прозрачность 1f.
         *
         * @param context Контекст.
         * @param resId Идентификатор ресурса.
         * @return Новый [ColorValueStateList].
         */
        internal fun valueOf(context: Context, @IdRes resId: Int): ColorValueStateList {
            return ColorValueStateList(arrayOf(IntArray(0)), arrayOf(resolveValue(context, resId, 1f)))
        }

        /**
         * Разрешает ресурс по идентификатору и возвращает соответствующий [ColorValueHolder].
         *
         * Поддерживаются типы: color, drawable, attr, reference, style.
         *
         * @param context Контекст приложения.
         * @param resId Идентификатор ресурса.
         * @param alpha Прозрачность, применяемая к значению.
         * @return Обёртка [ColorValueHolder], соответствующая ресурсу.
         */
        @Suppress("CyclomaticComplexMethod", "ThrowsCount")
        private fun resolveValue(context: Context, resId: Int, alpha: Float): ColorValueHolder {
            return when (val typeName = context.resources.getResourceTypeName(resId)) {
                "color" -> {
                    var color = context.getColorStateList(resId)
                    if (alpha != MAX_ALPHA_FLOAT) {
                        color = color.withAlpha((alpha * MAX_ALPHA_INT).toInt())
                    }
                    if (color.isStateful) {
                        ColorValueHolder.ColorListValue(color)
                    } else {
                        ColorValueHolder.ColorValue(color.defaultColor)
                    }
                }

                "drawable" -> {
                    val drawable = AppCompatResources.getDrawable(context, resId)?.apply {
                        if (alpha != MAX_ALPHA_FLOAT) setAlpha((alpha * MAX_ALPHA_INT).toInt())
                    } ?: throw IllegalArgumentException("Drawable not found: $resId")
                    ColorValueHolder.DrawableValue(drawable)
                }

                "attr" -> {
                    val outValue = TypedValue()
                    val resolved = context.theme.resolveAttribute(resId, outValue, true)
                    if (!resolved) throw IllegalArgumentException("Failed to resolve attribute: $resId")

                    when (outValue.type) {
                        TypedValue.TYPE_REFERENCE -> resolveValue(context, outValue.resourceId, alpha)
                        TypedValue.TYPE_INT_COLOR_ARGB8,
                        TypedValue.TYPE_INT_COLOR_RGB8,
                        -> {
                            var color = outValue.data
                            if (alpha != MAX_ALPHA_FLOAT) {
                                color = ColorUtils.setAlphaComponent(color, (alpha * MAX_ALPHA_INT).toInt())
                            }
                            ColorValueHolder.ColorValue(color)
                        }

                        else -> throw IllegalArgumentException("Unsupported resolved attribute type: ${outValue.type}")
                    }
                }

                "reference" -> {
                    val outValue = TypedValue()
                    context.resources.getValue(resId, outValue, true)
                    if (outValue.resourceId != 0) {
                        resolveValue(context, outValue.resourceId, alpha)
                    } else {
                        throw IllegalArgumentException("Invalid reference: $resId")
                    }
                }

                "style" -> {
                    val shaderFactory = GradientShader.obtain(context, resId)
                        ?: throw IllegalArgumentException("Invalid shader reference $resId")
                    ColorValueHolder.ShaderValue(shaderFactory)
                }

                else -> throw IllegalArgumentException("Unsupported resource type: $typeName")
            }
        }
    }
}

private object ColorValueStateListCache : ValueStateListCache<ColorValueHolder, ColorValueStateList>()

/**
 * Извлекает [ColorValueStateList] из атрибута с заданным индексом.
 *
 * Поддерживает ресурсы типа xml (через кэш) и color/drawable.
 *
 * @param context Контекст приложения.
 * @param index Индекс атрибута в [TypedArray].
 * @return Объект [ColorValueStateList], если ресурс найден, иначе null.
 */
fun TypedArray.getColorValueStateList(
    context: Context,
    index: Int,
): ColorValueStateList? {
    val value = peekValue(index)
    if (value != null && value.type in TypedValue.TYPE_FIRST_COLOR_INT..TypedValue.TYPE_LAST_COLOR_INT) {
        return ColorValueStateList.valueOf(getColor(index, 0))
    }
    val stateListResId = getResourceId(index, 0)
    if (stateListResId == 0) return null
    val typeName = context.resources.getResourceTypeName(stateListResId)
    return when (typeName) {
        "xml" -> ColorValueStateListCache.get(context, stateListResId) { ctx, resId ->
            ColorValueStateList.inflate(ctx, resId)
        }
        else -> ColorValueStateList.valueOf(context, stateListResId)
    }
}

/**
 * Устанавливает фон [View] в соответствии с [ColorValueStateList].
 *
 * Применяет значение в зависимости от состояния View: цвет, drawable, tint или shader.
 *
 * @param colorValueStateList Список значений цвета для различных состояний.
 */
fun View.setBackgroundValueList(colorValueStateList: ColorValueStateList?) {
    if (colorValueStateList == null) return
    val backgroundValue = if (colorValueStateList.isStateful()) {
        colorValueStateList.getValueForState(drawableState)
    } else {
        colorValueStateList.getDefaultValue()
    }
    when (backgroundValue) {
        is ColorValueHolder.ColorValue -> setBackgroundColor(backgroundValue.value)
        is ColorValueHolder.DrawableValue -> background = backgroundValue.value
        is ColorValueHolder.ColorListValue -> backgroundTintList = backgroundValue.value
        is ColorValueHolder.ShaderValue -> {}
    }
}

/**
 * Устанавливает фон [View] в соответствии с [ColorValueStateList].
 *
 * Применяет значение в зависимости от состояния View: цвет, drawable, tint или shader.
 *
 * @param colorValueStateList Список значений цвета для различных состояний.
 * @param cachedShaderFactory делегат для кэширования [ShaderFactory]
 * @param textBounds границы текста
 */
fun TextView.setTextColorValue(
    colorValueStateList: ColorValueStateList?,
    cachedShaderFactory: CachedShaderFactory,
    textBounds: RectF = EmptyRectF,
) {
    if (colorValueStateList == null) return
    val textColorValue = if (colorValueStateList.isStateful()) {
        colorValueStateList.getValueForState(drawableState)
    } else {
        colorValueStateList.getDefaultValue()
    }
    when (textColorValue) {
        is ColorValueHolder.ColorValue -> setTextColor(textColorValue.value)
        is ColorValueHolder.DrawableValue -> {}
        is ColorValueHolder.ColorListValue -> setTextColor(textColorValue.value)
        is ColorValueHolder.ShaderValue -> {
            paint.color = -1
            paint.shader = cachedShaderFactory.getShader(textColorValue.value, textBounds)
        }
    }
}

/**
 * Устанавливает цвет или shader в [Paint] на основе [ColorValueStateList] и текущего состояния.
 *
 * @param colorValueStateList Список значений цвета/шейдера по состояниям.
 * @param state Текущее состояние (набор флагов состояния).
 * @param cachedShaderFactory Фабрика для создания [Shader], если используется [ShaderValue].
 * @param bounds границы отрисовки
 * @return `true`, если цвет или shader были изменены.
 */
fun Paint.setColorValue(
    colorValueStateList: ColorValueStateList?,
    state: IntArray,
    cachedShaderFactory: CachedShaderFactory,
    bounds: RectF = EmptyRectF,
): Boolean {
    val oldColor = color
    val oldShader = shader
    color = -1
    shader = null
    if (colorValueStateList == null) {
        return oldColor != color || oldShader != shader
    }

    when (val colorValue = colorValueStateList.getValueForState(state)) {
        is ColorValueHolder.ColorListValue -> {
            color = colorValue.value.colorForState(state)
        }

        is ColorValueHolder.ColorValue -> {
            color = colorValue.value
            shader = null
        }

        is ColorValueHolder.DrawableValue -> {
            // TODO: https://github.com/salute-developers/plasma-android/issues/357
            val shapeShaderFactory = when (colorValue.value) {
                is ShapeDrawable -> colorValue.value.shaderFactory
                else -> throw IllegalArgumentException("Can't set drawable value to Paint object")
            }
            shader = shapeShaderFactory?.let { cachedShaderFactory.getShader(it, bounds) }
        }
        is ColorValueHolder.ShaderValue -> {
            shader = cachedShaderFactory.getShader(colorValue.value, bounds)
        }
    }
    return oldColor != color || oldShader != shader
}

/**
 * Абстрактный тип, представляющий значение цвета, связанное с состоянием.
 *
 * Используется в [ColorValueStateList] для представления различных типов значений:
 * - [ColorValue] — обычный цвет.
 * - [ColorListValue] — список цветов с поддержкой состояний.
 * - [DrawableValue] — Drawable-объект.
 * - [ShaderValue] — объект, создающий [Shader].
 */
sealed class ColorValueHolder {

    /**
     * Проверяет, содержит ли [ColorValueHolder] значение, зависящее от состояния.
     */
    open fun isStateful(): Boolean = false

    /**
     * Представляет обычный цвет как целое число ARGB.
     *
     * @param value Цвет в формате Int (например, 0xFF0000 для красного).
     */
    data class ColorValue(@ColorInt val value: Int) : ColorValueHolder()

    /**
     * Представляет [ColorStateList], который может изменяться в зависимости от состояния.
     *
     * @param value Объект [ColorStateList].
     */
    data class ColorListValue(val value: ColorStateList) : ColorValueHolder() {
        override fun isStateful(): Boolean {
            return value.isStateful
        }
    }

    /**
     * Представляет [Drawable], используемый как фоновое значение.
     *
     * @param value Drawable-объект.
     */
    data class DrawableValue(val value: Drawable) : ColorValueHolder()

    /**
     * Представляет [ShaderFactory], который создаёт [Shader] для отрисовки.
     *
     * @param value Фабрика для генерации шейдера.
     */
    data class ShaderValue(val value: ShaderFactory) : ColorValueHolder()
}

private val EmptyRectF = RectF()

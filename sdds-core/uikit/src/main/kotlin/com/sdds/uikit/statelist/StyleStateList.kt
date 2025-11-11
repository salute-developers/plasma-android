package com.sdds.uikit.statelist

import android.content.Context
import android.content.res.TypedArray
import android.util.TypedValue
import android.util.Xml
import androidx.annotation.IdRes
import androidx.annotation.StyleRes
import androidx.annotation.XmlRes
import com.sdds.uikit.R
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException

/**
 * Реализация [ValueStateList] для хранения ссылок на стили.
 */
class StyleStateList(
    states: Array<IntArray>,
    values: Array<Int>,
) : ValueStateList<Int>(states, values) {

    companion object {
        private const val XML_ROOT = "style-selector"
        private const val ELEMENT_TAG = "item"

        /**
         * Оборачивает [Number] в [StyleStateList].
         *
         * @param value [Number] значение.
         * @return Новый [StyleStateList] с одним элементом, либо null.
         */
        fun valueOf(@StyleRes value: Int?): StyleStateList? {
            if (value == null) return null
            return StyleStateList(arrayOf(IntArray(0)), arrayOf(value))
        }

        /**
         * Создаёт [StyleStateList] из массива состояний и соответствующих значений.
         *
         * @param states Массив массивов состояний.
         * @param values Список значений [Int].
         * @return Новый экземпляр [StyleStateList].
         */
        fun fromStates(states: Array<IntArray>, values: List<Int>): StyleStateList {
            require(states.size == values.size) { "States and values must have the same length" }
            return StyleStateList(states, values.toTypedArray())
        }

        /**
         * Создаёт экземпляр [StyleStateList] из XML-ресурса.
         *
         * @param context Контекст для доступа к ресурсам.
         * @param resId Идентификатор XML-ресурса.
         * @return Новый экземпляр [StyleStateList]
         */
        fun inflate(context: Context, @XmlRes resId: Int): StyleStateList {
            val parser = context.resources.getXml(resId)
            val stateSpecs = mutableListOf<IntArray>()
            val values = mutableListOf<Int>()

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

                    val a = context.obtainStyledAttributes(itemAttrs, R.styleable.StyleStateListItem)
                    val valueResId = a.getResourceId(R.styleable.StyleStateListItem_sd_style, 0)
                    val rawValue = a.peekValue(R.styleable.StyleStateListItem_sd_style)
                    a.recycle()

                    val resolvedValue = resolveValueFromTypedArray(context, valueResId, rawValue) ?: continue
                    val stateSet = extractStateSet(itemAttrs)

                    stateSpecs += stateSet
                    values += resolvedValue
                }
            }

            return fromStates(stateSpecs.toTypedArray(), values)
        }

        /**
         * Получает [StyleStateList] по ID ресурса
         *
         * @param context Контекст.
         * @param resId Идентификатор ресурса.
         * @return Новый [ColorValueStateList].
         */
        internal fun valueOf(context: Context, @IdRes resId: Int): StyleStateList {
            return StyleStateList(arrayOf(IntArray(0)), arrayOf(resolveValue(context, resId)))
        }

        /**
         * Разрешает ресурс по идентификатору и возвращает соответствующее [Int].
         *
         * Поддерживается тип: reference (ID стиля)
         *
         * @param context Контекст.
         * @param resId идентификатор ресурса.
         * @return [Int].
         */
        private fun resolveValue(context: Context, resId: Int): Int {
            // Для ссылок на стили нам нужен сам идентификатор ресурса стиля
            // без попыток разыменования в конкретные примитивы.
            return resId
        }

        private fun resolveValueFromTypedArray(
            context: Context,
            valueResId: Int,
            rawValue: TypedValue?,
        ): Int? {
            return when {
                valueResId != 0 -> resolveValue(context, valueResId)
                rawValue != null -> resolveFromTypedValue(rawValue)
                else -> null
            }
        }

        internal fun resolveFromTypedValue(typedValue: TypedValue): Int? {
            return when (typedValue.type) {
                // Для ссылок типа @style/... возвращаем ID ресурса стиля
                TypedValue.TYPE_REFERENCE -> typedValue.resourceId.takeIf { it != 0 } ?: typedValue.data
                else -> null
            }
        }
    }
}

private object TextAppearanceStateListCache : ValueStateListCache<Int, StyleStateList>()

/**
 * Извлекает [StyleStateList] из атрибута с заданным индексом.
 *
 * Поддерживает ресурсы типа xml (через кэш)
 *
 * @param context Контекст приложения.
 * @param index Индекс атрибута в [TypedArray].
 * @return Объект [StyleStateList], если ресурс найден, иначе null.
 */
fun TypedArray.getStyleStateList(
    context: Context,
    index: Int,
): StyleStateList? {
    if (!hasValue(index)) return null

    val valueResId = getResourceId(index, 0)
    if (valueResId != 0) {
        val typeName = context.resources.getResourceTypeName(valueResId)
        return when (typeName) {
            "xml" -> TextAppearanceStateListCache.get(context, valueResId) { ctx, resId ->
                StyleStateList.inflate(ctx, resId)
            }
            else -> StyleStateList.valueOf(context, valueResId)
        }
    }

    return peekValue(index)
        ?.let { StyleStateList.resolveFromTypedValue(it) }
        ?.let { StyleStateList.valueOf(it) }
}

/**
 * Возвращает [Int] соответствующий состоянию [state]
 */
fun StyleStateList.getStyleForState(state: IntArray): Int {
    return getValueForState(state)
}

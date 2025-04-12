package com.sdds.uikit.statelist

import android.content.Context
import android.content.res.TypedArray
import android.util.TypedValue
import android.util.Xml
import androidx.annotation.IdRes
import androidx.annotation.XmlRes
import com.sdds.uikit.R
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException

/**
 * Реализация [ValueStateList] для хранения числовых значений.
 */
class NumberStateList(
    states: Array<IntArray>,
    values: Array<Number>,
) : ValueStateList<Number>(states, values) {

    companion object {
        private const val XML_ROOT = "number-selector"
        private const val ELEMENT_TAG = "item"

        /**
         * Оборачивает [Number] в [NumberStateList].
         *
         * @param value [Number] значение.
         * @return Новый [NumberStateList] с одним элементом, либо null.
         */
        fun valueOf(value: Number?): NumberStateList? {
            if (value == null) return null
            return NumberStateList(arrayOf(IntArray(0)), arrayOf(value))
        }

        /**
         * Создаёт [NumberStateList] из массива состояний и соответствующих значений.
         *
         * @param states Массив массивов состояний.
         * @param values Список значений [Number].
         * @return Новый экземпляр [NumberStateList].
         */
        fun fromStates(states: Array<IntArray>, values: List<Number>): NumberStateList {
            require(states.size == values.size) { "States and values must have the same length" }
            return NumberStateList(states, values.toTypedArray())
        }

        /**
         * Создаёт экземпляр [NumberStateList] из XML-ресурса.
         *
         * @param context Контекст для доступа к ресурсам.
         * @param resId Идентификатор XML-ресурса.
         * @return Новый экземпляр [NumberStateList]
         */
        fun inflate(context: Context, @XmlRes resId: Int): NumberStateList {
            val parser = context.resources.getXml(resId)
            val stateSpecs = mutableListOf<IntArray>()
            val values = mutableListOf<Number>()

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

                    val a = context.obtainStyledAttributes(itemAttrs, R.styleable.NumberStateListItem)
                    val valueResId = a.getResourceId(R.styleable.NumberStateListItem_sd_number, 0)
                    val rawValue = a.peekValue(R.styleable.NumberStateListItem_sd_number)
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
         * Получает [NumberStateList] по ID ресурса
         *
         * @param context Контекст.
         * @param resId Идентификатор ресурса.
         * @return Новый [ColorValueStateList].
         */
        internal fun valueOf(context: Context, @IdRes resId: Int): NumberStateList {
            return NumberStateList(arrayOf(IntArray(0)), arrayOf(resolveValue(context, resId)))
        }

        /**
         * Разрешает ресурс по идентификатору и возвращает соответствующее [Number].
         *
         * Поддерживаются типы: dimension, int, float, reference
         *
         * @param context контекст.
         * @param resId идентификатор ресурса.
         * @return [Number].
         */
        private fun resolveValue(context: Context, resId: Int): Number {
            val typedValue = TypedValue()
            context.resources.getValue(resId, typedValue, true)

            return resolveFromTypedValue(typedValue, context)
                ?: throw IllegalArgumentException("Unsupported resource type or value for NumberStateList")
        }

        private fun resolveValueFromTypedArray(
            context: Context,
            valueResId: Int,
            rawValue: TypedValue?,
        ): Number? {
            return when {
                valueResId != 0 -> resolveValue(context, valueResId)
                rawValue != null -> resolveFromTypedValue(rawValue, context)
                else -> null
            }
        }

        internal fun resolveFromTypedValue(typedValue: TypedValue, context: Context): Number? {
            return when (typedValue.type) {
                TypedValue.TYPE_DIMENSION -> TypedValue.complexToDimension(
                    typedValue.data,
                    context.resources.displayMetrics,
                )
                TypedValue.TYPE_INT_DEC, TypedValue.TYPE_INT_HEX -> typedValue.data
                TypedValue.TYPE_FLOAT -> typedValue.float
                else -> null
            }
        }
    }
}

private object NumberStateListCache : ValueStateListCache<Number, NumberStateList>()

/**
 * Извлекает [NumberStateList] из атрибута с заданным индексом.
 *
 * Поддерживает ресурсы типа xml (через кэш)
 *
 * @param context Контекст приложения.
 * @param index Индекс атрибута в [TypedArray].
 * @return Объект [NumberStateList], если ресурс найден, иначе null.
 */
fun TypedArray.getNumberStateList(
    context: Context,
    index: Int,
): NumberStateList? {
    if (!hasValue(index)) return null

    val valueResId = getResourceId(index, 0)
    if (valueResId != 0) {
        val typeName = context.resources.getResourceTypeName(valueResId)
        return when (typeName) {
            "xml" -> NumberStateListCache.get(context, valueResId) { ctx, resId ->
                NumberStateList.inflate(ctx, resId)
            }
            else -> NumberStateList.valueOf(context, valueResId)
        }
    }

    return peekValue(index)
        ?.let { NumberStateList.resolveFromTypedValue(it, context) }
        ?.let { NumberStateList.valueOf(it) }
}

/**
 * Возвращает [Float] соответствующий состоянию [state]
 */
fun NumberStateList.getFloatForState(state: IntArray): Float {
    return getValueForState(state).toFloat()
}

/**
 * Возвращает [Int] соответствующий состоянию [state]
 */
fun NumberStateList.getIntForState(state: IntArray): Int {
    return getValueForState(state).toInt()
}

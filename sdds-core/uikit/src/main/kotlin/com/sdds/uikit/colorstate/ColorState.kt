package com.sdds.uikit.colorstate

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.collection.SimpleArrayMap
import com.sdds.uikit.R
import java.lang.reflect.Constructor

/**
 * Состояние цвета компонента
 * @author Малышев Александр on 04.12.2024
 */
interface ColorState {

    /**
     * Аттрибуты состояния
     */
    val attrs: IntArray

    companion object {

        /**
         * Неопределенный [ColorState]
         */
        val Undefined = object : ColorState {
            override val attrs: IntArray = intArrayOf()
        }
        private val sConstructorMap = SimpleArrayMap<String, Constructor<out ColorStateProvider?>>()

        /**
         * Индикатор определенного состояния
         */
        fun ColorState.isDefined(): Boolean = this != Undefined

        /**
         * Достает [ColorStateProvider] из атрибутов [attrs], который затем используется для получения [ColorState].
         * Если атрибут app:sd_colorStateProvider не задан, то по-умолчанию вернет [ColorState.Undefined]
         * @param context контекст
         * @param attrs атрибуты [View]
         * @param defStyleAttr атрибут стиля по умолчанию
         * @param defStyleRes стиль по умолчанию
         * @return [ColorState]
         */
        fun obtain(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int = 0,
            defStyleRes: Int = 0,
        ): ColorState {
            val typedArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.SdColorStateHolder,
                defStyleAttr,
                defStyleRes,
            )
            val viewStyleClass = typedArray.getString(R.styleable.SdColorStateHolder_sd_colorStateProvider)
            if (viewStyleClass == null) {
                typedArray.recycle()
                return Undefined
            }
            var constructor = sConstructorMap[viewStyleClass]
            if (constructor == null) {
                val clazz = Class.forName(
                    viewStyleClass,
                    false,
                    context.classLoader,
                ).asSubclass(ColorStateProvider::class.java)
                constructor = clazz.getConstructor()
                sConstructorMap.put(viewStyleClass, constructor)
            }
            val viewStyleProvider = constructor?.newInstance()
            typedArray.recycle()
            return viewStyleProvider?.obtain(context, attrs, defStyleAttr, defStyleRes) ?: Undefined
        }
    }
}

/**
 * Интерфейс поставщика [ColorState]
 */
interface ColorStateProvider {

    /**
     * Достает [ColorState] из атрибутов [attrs].
     * @param context контекст
     * @param attrs атрибуты [View]
     * @param defStyleAttr атрибут стиля по умолчанию
     * @param defStyleRes стиль по умолчанию
     * @return [ColorState]
     */
    fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0,
    ): ColorState?
}

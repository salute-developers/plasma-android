package com.sdkit.star.designsystem.inflater

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.Keep
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.collection.SimpleArrayMap
import com.google.android.material.theme.MaterialComponentsViewInflater
import com.sdds.uikit.Button
import com.sdds.uikit.CheckBox
import com.sdds.uikit.ImageView
import com.sdds.uikit.RadioBox
import com.sdds.uikit.TextView
import java.lang.reflect.Constructor

/**
 * Инфлейтер для подмены андроид компонентов на компоненты из дизайн-системы, а также для
 * применения глобальных аттрибутов.
 * Устанавливается как значение атрибута viewInflaterClass темы приложения.
 * @author Александр Малышев on 31.05.2023
 */
@Keep
class StarLayoutInflater : MaterialComponentsViewInflater() {

    private val mConstructorArgs = arrayOfNulls<Any>(2)
    private val starViewFactory = StarViewFactory()

    override fun createImageView(context: Context, attrs: AttributeSet?): AppCompatImageView {
        return ImageView(context, attrs)
    }

    override fun createButton(context: Context, attrs: AttributeSet): AppCompatButton {
        return Button(context, attrs)
    }

    override fun createCheckBox(context: Context, attrs: AttributeSet?): AppCompatCheckBox {
        return CheckBox(context, attrs)
    }

    override fun createRadioButton(context: Context, attrs: AttributeSet?): AppCompatRadioButton {
        return RadioBox(context, attrs)
    }

    override fun createTextView(context: Context, attrs: AttributeSet?): AppCompatTextView {
        return TextView(context, attrs)
    }

    override fun createView(context: Context, name: String, attrs: AttributeSet): View? {
        return starViewFactory.createStarView(context, name, attrs)
            ?: createViewFromTag(context, name, attrs)
    }

    private fun createViewFromTag(context: Context, tag: String, attrs: AttributeSet): View? {
        val name = tag.takeIf { it != "view" } ?: attrs.getAttributeValue(null, "class")
        val view = runCatching {
            mConstructorArgs[0] = context
            mConstructorArgs[1] = attrs
            if (-1 == name.indexOf('.')) {
                sClassPrefixList.forEach { prefix ->
                    val viewByPrefix = createViewByPrefix(context, name, prefix)
                    if (viewByPrefix != null) {
                        return@runCatching viewByPrefix
                    }
                }
                null
            } else {
                createViewByPrefix(context, name, null)
            }
        }.getOrNull()
        mConstructorArgs[0] = null
        mConstructorArgs[1] = null
        return view
    }

    private fun createViewByPrefix(context: Context, name: String, prefix: String?): View? =
        runCatching {
            var constructor = sConstructorMap[name]
            if (constructor == null) {
                // Class not found in the cache, see if it's real, and try to add it
                val clazz = Class.forName(
                    if (prefix != null) prefix + name else name,
                    false,
                    context.classLoader,
                ).asSubclass(View::class.java)
                constructor = clazz.getConstructor(sConstructorSignature[0], sConstructorSignature[1])
                sConstructorMap.put(name, constructor)
            }
            constructor!!.isAccessible = true
            constructor.newInstance(mConstructorArgs[0], mConstructorArgs[1])
        }.getOrNull()

    private companion object {
        val sClassPrefixList = arrayOf(
            "android.widget.",
            "android.view.",
            "android.webkit.",
        )
        val sConstructorMap = SimpleArrayMap<String, Constructor<out View?>>()
        val sConstructorSignature = arrayOf(Context::class.java, AttributeSet::class.java)
    }
}

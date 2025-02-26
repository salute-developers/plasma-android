package com.sdkit.star.designsystem.inflater

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Switch
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.switchmaterial.SwitchMaterial
import com.sdds.uikit.RadioBoxGroup
import com.sdkit.star.designsystem.StarConstraintLayout
import com.sdkit.star.designsystem.StarLinearLayout
import com.sdkit.star.designsystem.StarView

/**
 * Фабрика [View] из дизайн-системы
 * @author Александр Малышев on 26.07.2023
 */
internal class StarViewFactory {

    /**
     * Создает подкласс [View] из дизайн-системы по его названию-тэгу.
     * Может вернуть null, если название-тэг не известно.
     * @param context контекст
     * @param name название-тэг подкласса [View]
     * @param attrs атрибуты [View]
     * @return [View]
     */
    fun createStarView(context: Context, name: String, attrs: AttributeSet?): View? =
        when (name) {
            ConstraintLayout::class.qualifiedName -> StarConstraintLayout(context, attrs)
            FrameLayout::class.simpleName -> com.sdds.uikit.FrameLayout(context, attrs)
            LinearLayoutCompat::class.qualifiedName,
            LinearLayout::class.simpleName,
            -> StarLinearLayout(context, attrs)
            RadioGroup::class.simpleName -> RadioBoxGroup(context, attrs)
            View::class.simpleName -> StarView(context, attrs)
            SwitchCompat::class.qualifiedName,
            Switch::class.simpleName,
            SwitchMaterial::class.qualifiedName,
            -> com.sdds.uikit.Switch(context, attrs)
            else -> null
        }
}

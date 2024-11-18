package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.Checkable
import android.widget.CompoundButton
import androidx.core.view.children
import androidx.core.view.marginTop
import androidx.core.view.updateMarginsRelative

/**
 * Группа компонентов [CheckBox].
 * Группа может выделять главный [CheckBox], который способен контролировать
 * состояние остальных [CheckBox]. При этом главный [CheckBox] - это всегда первый [CheckBox] в группе.
 * Данное поведение включено по-умолчанию. Чтобы отключить выделение главного [CheckBox] в группе,
 * нужно указать атрибут app:sd_hasMain="false".
 *
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по-умолчанию
 * @param defStyleRes стиль по-умолчанию
 * @author Малышев Александр on 27.08.2024
 */
open class CheckBoxGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_checkBoxGroupStyle,
    defStyleRes: Int = R.style.Sdds_Components_CheckBoxGroup,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val _passThroughListener: PassThroughHierarchyChangeListener = PassThroughHierarchyChangeListener()
    private var _hasMainCheckBox: Boolean
    private var _itemOffset: Int
    private var _itemSpacing: Int
    private var _mainCheckBox: CheckBox? = null
    private var _protectFromCheckedChange: Boolean = false
    private val _childOnCheckedChangeListener: CompoundButton.OnCheckedChangeListener = CheckedStateTracker()

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CheckBoxGroup, defStyleAttr, defStyleRes)
        _hasMainCheckBox = typedArray.getBoolean(R.styleable.CheckBoxGroup_sd_hasMain, false)
        _itemOffset = typedArray.getDimensionPixelSize(R.styleable.CheckBoxGroup_sd_itemOffset, 0)
        _itemSpacing = typedArray.getDimensionPixelSize(R.styleable.CheckBoxGroup_sd_itemSpacing, 0)
        typedArray.recycle()
        super.setOnHierarchyChangeListener(_passThroughListener)
        orientation = VERTICAL
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        // Первый CheckBox всегда будет главным если аттрибут app:sd_hasMain = true
        val isMainCandidate = _hasMainCheckBox && (index == 0 || childCount == 0)
        if (child is CheckBox && isMainCandidate) {
            if (child.id == View.NO_ID) {
                child.id = View.generateViewId()
            }
            _mainCheckBox = child
        }
        params?.apply {
            if (hasMainCheckBox() && child?.id != _mainCheckBox?.id) {
                applyOffset()
            }
            applySpacing(childCount)
        }
        super.addView(child, index, params)
    }

    override fun getAccessibilityClassName(): CharSequence {
        return CheckBoxGroup::class.java.name
    }

    override fun setOnHierarchyChangeListener(listener: OnHierarchyChangeListener?) {
        _passThroughListener.onHierarchyChangeListener = listener
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    private fun ViewGroup.LayoutParams.applyOffset() {
        (this as? MarginLayoutParams)?.run {
            updateMarginsRelative(start = marginStart + _itemOffset)
        }
    }

    private fun ViewGroup.LayoutParams.applySpacing(index: Int) {
        (this as? MarginLayoutParams)?.run {
            if (orientation == VERTICAL) {
                val top = if (index == 0) marginTop else marginTop + _itemSpacing
                updateMarginsRelative(top = top)
            } else {
                val start = if (index == 0) marginStart else marginStart + _itemSpacing
                updateMarginsRelative(start = start)
            }
        }
    }

    private fun hasMainCheckBox() = _hasMainCheckBox && _mainCheckBox != null

    private inner class CheckedStateTracker : CompoundButton.OnCheckedChangeListener {

        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            if (_protectFromCheckedChange) return

            _protectFromCheckedChange = true
            if (buttonView == _mainCheckBox) {
                children.forEach { child ->
                    (child as? Checkable)?.isChecked = isChecked
                }
                _protectFromCheckedChange = false
                return
            }
            val checkables = children.filterNot { it.id == _mainCheckBox?.id }.filterIsInstance<Checkable>()
            _mainCheckBox?.toggleState = when {
                checkables.all { it.isChecked } -> CheckBox.ToggleableState.ON
                checkables.any { it.isChecked } -> CheckBox.ToggleableState.INDETERMINATE
                else -> CheckBox.ToggleableState.OFF
            }
            _protectFromCheckedChange = false
        }
    }

    private inner class PassThroughHierarchyChangeListener : OnHierarchyChangeListener {

        var onHierarchyChangeListener: OnHierarchyChangeListener? = null

        override fun onChildViewAdded(parent: View?, child: View?) {
            if (parent == this@CheckBoxGroup && child is CheckBox) {
                if (child.id == View.NO_ID) {
                    child.id = View.generateViewId()
                }
                child.setOnCheckedChangeListener(_childOnCheckedChangeListener)
            }
            onHierarchyChangeListener?.onChildViewAdded(parent, child)
        }

        override fun onChildViewRemoved(parent: View?, child: View?) {
            if (parent == this@CheckBoxGroup && child is CheckBox) {
                child.setOnCheckedChangeListener(null)
            }
            onHierarchyChangeListener?.onChildViewRemoved(parent, child)
        }
    }
}

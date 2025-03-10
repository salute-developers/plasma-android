package com.sdds.playground.sandbox.core.vs

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.fragment.app.DialogFragment

/**
 * Базовый фрагмент редактора параметров компонентов
 * @author Малышев Александр on 05.08.2024
 */
internal open class EditorFragment<T : Any> : DialogFragment() {

    /**
     * Название свойства
     */
    protected val propertyName: String by lazy {
        arguments?.getString(ARG_PROPERTY_NAME).orEmpty()
    }

    /**
     * Значение свойства
     */
    protected val currentValue: String by lazy {
        arguments?.getString(ARG_PROPERTY_CURRENT_VALUE).orEmpty()
    }

    /**
     * Сохраняет введенное в редактор значение [any] и закрывает редактор
     */
    protected fun confirm(any: T?) {
        val confirmKey = arguments?.getString(ARG_CONFIRM_RESULT_KEY) ?: CONFIRM_RESULT_KEY
        requireActivity().supportFragmentManager.setFragmentResult(
            confirmKey,
            bundleOf(CONFIRM_VALUE to any),
        )
        dismiss()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)

        dialog.window?.apply {
            attributes = attributes?.apply {
                gravity = Gravity.END or Gravity.CENTER_VERTICAL
            }
            requestFeature(Window.FEATURE_NO_TITLE)
        }
        return dialog
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)?.apply {
            ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
                v.updatePadding(
                    bottom = v.paddingBottom + insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom,
                )
                insets
            }
        }
    }

    companion object {
        const val CONFIRM_RESULT_KEY = "EditorFragment_confirmResult"
        const val CONFIRM_VALUE = "EditorFragment_confirmResult"
        const val ARG_PROPERTY_NAME = "EditorFragment_propertyName"
        const val ARG_PROPERTY_CURRENT_VALUE = "EditorFragment_propertyCurrentValue"
        const val ARG_CONFIRM_RESULT_KEY = "EditorFragment_argConfirmResult"
    }
}

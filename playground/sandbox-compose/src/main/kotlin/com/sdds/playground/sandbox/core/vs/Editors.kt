package com.sdds.playground.sandbox.core.vs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isGone
import androidx.core.view.updatePadding
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.databinding.FragmentEditorChoiceBinding
import com.sdds.playground.sandbox.databinding.FragmentEditorTextBinding
import com.sdds.uikit.TextView

/**
 * Базовый фрагмент редактора параметров компонентов
 * @author Малышев Александр on 05.08.2024
 */
internal open class EditorFragment<T : Any> : Fragment() {

    protected val componentViewModel: ComponentViewModel<*> by viewModels({ requireParentFragment() })

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
        componentViewModel.updateProperty(propertyName, any)
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

/**
 * Редактор текстовых свойств компонентов
 */
internal class TextEditorFragment : EditorFragment<String>() {

    private var _binding: FragmentEditorTextBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentEditorTextBinding.inflate(inflater, container, false).apply {
            header.headerTitle.text = componentViewModel.componentKey.value
            header.headerLabel.text = componentViewModel.componentKey.core.name
            header.propertyValueReset.isGone = true
            textEditorField.label = propertyName
            textEditorField.value = currentValue
            textEditorField.editText.doAfterTextChanged {
                confirm(textEditorField.value?.toString())
            }
        }
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.textEditorField?.editText?.requestFocus()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    internal companion object {

        fun newInstance(
            propertyName: String,
            currentValue: String,
        ): TextEditorFragment {
            return TextEditorFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PROPERTY_NAME, propertyName)
                    putString(ARG_PROPERTY_CURRENT_VALUE, currentValue)
                }
            }
        }
    }
}

/**
 * Редактор с выбором значения из некоторого множества значений одного свойства компонента
 */
internal class ChoiceEditorFragment : EditorFragment<String>() {

    private var _binding: FragmentEditorChoiceBinding? = null
    private val adapter = ChoiceAdapter()
    private val choices: List<String> by lazy {
        arguments?.getStringArrayList(ARG_CHOICES).orEmpty()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentEditorChoiceBinding.inflate(inflater, container, false).apply {
            header.headerTitle.text = componentViewModel.componentKey.value
            header.headerLabel.text = componentViewModel.componentKey.core.name
            header.propertyValueReset.isGone = true
            choiceEditorTitle.text = propertyName
            choiceRecyclerView.adapter = adapter
            choiceRecyclerView.itemAnimator = null
            choiceRecyclerView.addItemDecoration(
                VerticalSpaceBetweenDecorator(
                    resources.getDimensionPixelSize(R.dimen.sandbox_properties_choice_spacing),
                ),
            )
            adapter.setChoices(choices, currentValue)
            adapter.setSelectionListener { confirm(it) }
        }
        return _binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding?.choiceRecyclerView?.adapter = null
        adapter.setSelectionListener(null)
        _binding = null
    }

    internal companion object {

        const val ARG_CHOICES = "ChoiceEditorFragment_choices"

        fun newInstance(
            propertyName: String,
            currentValue: String,
            choices: List<String>,
            confirmKey: String? = null,
        ): ChoiceEditorFragment {
            return ChoiceEditorFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PROPERTY_NAME, propertyName)
                    putString(ARG_PROPERTY_CURRENT_VALUE, currentValue)
                    putStringArrayList(ARG_CHOICES, ArrayList(choices))
                    confirmKey?.let { putString(ARG_CONFIRM_RESULT_KEY, it) }
                }
            }
        }
    }
}

internal class ChoiceAdapter : RecyclerView.Adapter<ChoiceAdapter.ChoiceHolder>() {

    private val choices = mutableListOf<String>()
    private var selectedPosition: Int = -1

    private var selectionListener: SelectionListener? = null

    fun interface SelectionListener {
        fun onChanged(choice: String)
    }

    @Suppress("NotifyDataSetChanged")
    fun setChoices(choices: List<String>, current: String) {
        this.choices.clear()
        this.choices.addAll(choices)
        selectedPosition = this.choices.indexOf(current)
        notifyDataSetChanged()
    }

    fun setSelectionListener(selectionListener: SelectionListener?) {
        this.selectionListener = selectionListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChoiceHolder {
        return ChoiceHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_choice_editor_item, parent, false),
        )
    }

    override fun getItemCount(): Int = choices.size

    override fun onBindViewHolder(holder: ChoiceHolder, position: Int) {
        holder.bind(choices[position])
    }

    inner class ChoiceHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(choice: String) {
            (itemView as TextView).apply {
                text = choice
                isSelected = selectedPosition == adapterPosition
                setOnClickListener {
                    val oldSelected = selectedPosition
                    selectedPosition = adapterPosition
                    notifyItemChanged(oldSelected)
                    notifyItemChanged(selectedPosition)
                    selectionListener?.onChanged(choice)
                }
            }
        }
    }
}

/**
 * Возвращает редактор текста
 * @param propertyName название свойства
 * @param currentValue значение свойства
 */
internal fun EditorFragment.Companion.textEditor(
    propertyName: String,
    currentValue: String,
): EditorFragment<String> = TextEditorFragment.newInstance(propertyName, currentValue)

/**
 * Возвращает редактор с выбором значения из некоторого множества значений одного свойства
 * @param propertyName название свойства
 * @param currentValue значение свойства
 * @param choices множество значений свойства
 * @param confirmKey опциональный ключ, по которому будет записан результат выбора.
 * Если [confirmKey] == null, то результат будет записан по ключу [CONFIRM_RESULT_KEY]
 */
internal fun EditorFragment.Companion.choiceEditor(
    propertyName: String,
    currentValue: String,
    choices: List<String>,
    confirmKey: String? = null,
): EditorFragment<String> = ChoiceEditorFragment.newInstance(propertyName, currentValue, choices, confirmKey)

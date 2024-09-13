package com.sdds.playground.sandbox.textfield

/**
 * Фрагмент с компонентом TextField в Режиме TextArea
 * @author Малышев Александр on 19.08.2024
 */
internal class TextAreaFragment : TextFieldFragment() {

    override val mode: TextFieldViewModel.Mode
        get() = TextFieldViewModel.Mode.TextArea
}

package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.S

/**
 * Состояние radiobox
 *
 * @property checked состояние radiobox
 * @property size размер radiobox [Size]
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли radiobox
 */
internal data class RadioBoxUiState(
    val checked: Boolean = false,
    val size: Size = Size.M,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

internal enum class Size {
    M, S
}

@Composable
internal fun RadioBoxUiState.radioBoxStyle(): RadioBoxStyle =
    when (size) {
        Size.M -> RadioBox.M.style()
        Size.S -> RadioBox.S.style()
    }

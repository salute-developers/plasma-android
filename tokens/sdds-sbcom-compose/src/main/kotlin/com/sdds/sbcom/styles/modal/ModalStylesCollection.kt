// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.modal

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.ModalStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Modal
 */
public enum class ModalStyles(
    public val key: String,
) {
    ModalDefault("Modal.Default"),
}

/**
 * Возвращает [ModalStyle] для [ModalStyles]
 */
@Composable
public fun ModalStyles.style(modifyAction: @Composable ModalStyleBuilder.() -> Unit = {}): ModalStyle {
    val builder = when (this) {
        ModalStyles.ModalDefault -> Modal.Default
    }
    return builder.modify(modifyAction).style()
}

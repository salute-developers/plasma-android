// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.editable

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.EditableStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Editable
 */
public enum class EditableStyles(
    public val key: String,
) {
    EditableH1("Editable.H1"),
    EditableH2("Editable.H2"),
    EditableH3("Editable.H3"),
    EditableH4("Editable.H4"),
    EditableH5("Editable.H5"),
    EditableH6("Editable.H6"),
    EditableBodyL("Editable.BodyL"),
    EditableBodyM("Editable.BodyM"),
    EditableBodyS("Editable.BodyS"),
    EditableBodyXs("Editable.BodyXs"),
    EditableBodyXxs("Editable.BodyXxs"),
}

/**
 * Возвращает [EditableStyle] для [EditableStyles]
 */
@Composable
public fun EditableStyles.style(modifyAction: @Composable EditableStyleBuilder.() -> Unit = {}): EditableStyle {
    val builder = when (this) {
        EditableStyles.EditableH1 -> Editable.H1
        EditableStyles.EditableH2 -> Editable.H2
        EditableStyles.EditableH3 -> Editable.H3
        EditableStyles.EditableH4 -> Editable.H4
        EditableStyles.EditableH5 -> Editable.H5
        EditableStyles.EditableH6 -> Editable.H6
        EditableStyles.EditableBodyL -> Editable.BodyL
        EditableStyles.EditableBodyM -> Editable.BodyM
        EditableStyles.EditableBodyS -> Editable.BodyS
        EditableStyles.EditableBodyXs -> Editable.BodyXs
        EditableStyles.EditableBodyXxs -> Editable.BodyXxs
    }
    return builder.modify(modifyAction).style()
}

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.editable

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
    EditableBodyL("Editable.BodyL"),
    EditableBodyM("Editable.BodyM"),
    EditableBodyS("Editable.BodyS"),
    EditableBodyXs("Editable.BodyXs"),
    EditableBodyXxs("Editable.BodyXxs"),
    AiUserMessageEditableXl("AiUserMessageEditable.Xl"),
    AiUserMessageEditableL("AiUserMessageEditable.L"),
    AiUserMessageEditableM("AiUserMessageEditable.M"),
    AiUserMessageEditableS("AiUserMessageEditable.S"),
    AiUserMessageEditableXs("AiUserMessageEditable.Xs"),
    ;

    /**
     * Typed API для подбора стиля editable
     */
    public object Default

    /**
     * Typed API для подбора стиля ai-user-message-editable
     */
    public object AiUserMessageEditable
}

/**
 * Возможные значения свойства size для editable
 */
public enum class EditableDefaultSize {
    H1,
    H2,
    H3,
    H4,
    H5,
    BodyL,
    BodyM,
    BodyS,
    BodyXs,
    BodyXxs,
}

/**
 * Возможные значения свойства size для ai-user-message-editable
 */
public enum class AiUserMessageEditableSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [EditableStyle] для [EditableStyles]
 */
@Composable
public fun EditableStyles.style(modify: @Composable EditableStyleBuilder.() -> Unit = {}): EditableStyle {
    val builder = when (this) {
        EditableStyles.EditableH1 -> Editable.H1
        EditableStyles.EditableH2 -> Editable.H2
        EditableStyles.EditableH3 -> Editable.H3
        EditableStyles.EditableH4 -> Editable.H4
        EditableStyles.EditableH5 -> Editable.H5
        EditableStyles.EditableBodyL -> Editable.BodyL
        EditableStyles.EditableBodyM -> Editable.BodyM
        EditableStyles.EditableBodyS -> Editable.BodyS
        EditableStyles.EditableBodyXs -> Editable.BodyXs
        EditableStyles.EditableBodyXxs -> Editable.BodyXxs
        EditableStyles.AiUserMessageEditableXl -> AiUserMessageEditable.Xl
        EditableStyles.AiUserMessageEditableL -> AiUserMessageEditable.L
        EditableStyles.AiUserMessageEditableM -> AiUserMessageEditable.M
        EditableStyles.AiUserMessageEditableS -> AiUserMessageEditable.S
        EditableStyles.AiUserMessageEditableXs -> AiUserMessageEditable.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [EditableStyles] для editable
 */
public fun EditableStyles.Default.resolve(size: EditableDefaultSize = EditableDefaultSize.H1): EditableStyles = when {
    size == EditableDefaultSize.H1 -> EditableStyles.EditableH1
    size == EditableDefaultSize.H2 -> EditableStyles.EditableH2
    size == EditableDefaultSize.H3 -> EditableStyles.EditableH3
    size == EditableDefaultSize.H4 -> EditableStyles.EditableH4
    size == EditableDefaultSize.H5 -> EditableStyles.EditableH5
    size == EditableDefaultSize.BodyL -> EditableStyles.EditableBodyL
    size == EditableDefaultSize.BodyM -> EditableStyles.EditableBodyM
    size == EditableDefaultSize.BodyS -> EditableStyles.EditableBodyS
    size == EditableDefaultSize.BodyXs -> EditableStyles.EditableBodyXs
    size == EditableDefaultSize.BodyXxs -> EditableStyles.EditableBodyXxs
    else -> error("Unsupported editable style combination")
}

/**
 * Возвращает [EditableStyle] для editable
 */
@Composable
public fun EditableStyles.Default.style(
    size: EditableDefaultSize = EditableDefaultSize.H1,
    modify: @Composable EditableStyleBuilder.() -> Unit = {},
): EditableStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [EditableStyles] для ai-user-message-editable
 */
public fun EditableStyles.AiUserMessageEditable.resolve(
    size: AiUserMessageEditableSize =
        AiUserMessageEditableSize.M,
): EditableStyles = when {
    size == AiUserMessageEditableSize.Xl -> EditableStyles.AiUserMessageEditableXl
    size == AiUserMessageEditableSize.L -> EditableStyles.AiUserMessageEditableL
    size == AiUserMessageEditableSize.M -> EditableStyles.AiUserMessageEditableM
    size == AiUserMessageEditableSize.S -> EditableStyles.AiUserMessageEditableS
    size == AiUserMessageEditableSize.Xs -> EditableStyles.AiUserMessageEditableXs
    else -> error("Unsupported ai-user-message-editable style combination")
}

/**
 * Возвращает [EditableStyle] для ai-user-message-editable
 */
@Composable
public fun EditableStyles.AiUserMessageEditable.style(
    size: AiUserMessageEditableSize =
        AiUserMessageEditableSize.M,
    modify: @Composable EditableStyleBuilder.() -> Unit = {},
): EditableStyle = resolve(size).style(modify)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.basicbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента BasicButton
 */
public enum class BasicButtonStyles(
    public val key: String,
) {
    BasicButtonLDefault("BasicButton.L.Default"),
    BasicButtonLClear("BasicButton.L.Clear"),
    BasicButtonMDefault("BasicButton.M.Default"),
    BasicButtonMClear("BasicButton.M.Clear"),
    BasicButtonSDefault("BasicButton.S.Default"),
    BasicButtonSClear("BasicButton.S.Clear"),
    BasicButtonXsDefault("BasicButton.Xs.Default"),
    BasicButtonXsClear("BasicButton.Xs.Clear"),
    ;

    /**
     * Typed API для подбора стиля basic-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для basic-button
 */
public enum class BasicButtonSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для basic-button
 */
public enum class BasicButtonView {
    Default,
    Clear,
}

/**
 * Возвращает [ButtonStyle] для [BasicButtonStyles]
 */
@Composable
public fun BasicButtonStyles.style(modify: @Composable BasicButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        BasicButtonStyles.BasicButtonLDefault -> BasicButton.L.Default
        BasicButtonStyles.BasicButtonLClear -> BasicButton.L.Clear
        BasicButtonStyles.BasicButtonMDefault -> BasicButton.M.Default
        BasicButtonStyles.BasicButtonMClear -> BasicButton.M.Clear
        BasicButtonStyles.BasicButtonSDefault -> BasicButton.S.Default
        BasicButtonStyles.BasicButtonSClear -> BasicButton.S.Clear
        BasicButtonStyles.BasicButtonXsDefault -> BasicButton.Xs.Default
        BasicButtonStyles.BasicButtonXsClear -> BasicButton.Xs.Clear
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BasicButtonStyles] для basic-button
 */
public fun BasicButtonStyles.Companion.resolve(
    size: BasicButtonSize = BasicButtonSize.L,
    view: BasicButtonView = BasicButtonView.Default,
): BasicButtonStyles = when {
    size == BasicButtonSize.L && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonLDefault
    size == BasicButtonSize.L && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonLClear
    size == BasicButtonSize.M && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonMDefault
    size == BasicButtonSize.M && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonMClear
    size == BasicButtonSize.S && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonSDefault
    size == BasicButtonSize.S && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonSClear
    size == BasicButtonSize.Xs && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonXsDefault
    size == BasicButtonSize.Xs && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonXsClear
    else -> error("Unsupported basic-button style combination")
}

/**
 * Возвращает [ButtonStyle] для basic-button
 */
@Composable
public fun BasicButtonStyles.Companion.style(
    size: BasicButtonSize = BasicButtonSize.L,
    view: BasicButtonView = BasicButtonView.Default,
    modify: @Composable BasicButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)

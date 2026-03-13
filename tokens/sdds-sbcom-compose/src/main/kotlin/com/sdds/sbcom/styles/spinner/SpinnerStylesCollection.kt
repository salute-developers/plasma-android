// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.spinner

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SpinnerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Spinner
 */
public enum class SpinnerStyles(
    public val key: String,
) {
    SpinnerMPrimary("Spinner.M.Primary"),
    SpinnerMSecondary("Spinner.M.Secondary"),
    SpinnerMGlobalWhite("Spinner.M.GlobalWhite"),
    SpinnerMAccent("Spinner.M.Accent"),
    SpinnerMDanger("Spinner.M.Danger"),
    SpinnerSPrimary("Spinner.S.Primary"),
    SpinnerSSecondary("Spinner.S.Secondary"),
    SpinnerSGlobalWhite("Spinner.S.GlobalWhite"),
    SpinnerSAccent("Spinner.S.Accent"),
    SpinnerSDanger("Spinner.S.Danger"),
    SpinnerXsPrimary("Spinner.Xs.Primary"),
    SpinnerXsSecondary("Spinner.Xs.Secondary"),
    SpinnerXsGlobalWhite("Spinner.Xs.GlobalWhite"),
    SpinnerXsAccent("Spinner.Xs.Accent"),
    SpinnerXsDanger("Spinner.Xs.Danger"),
    SpinnerXxsPrimary("Spinner.Xxs.Primary"),
    SpinnerXxsSecondary("Spinner.Xxs.Secondary"),
    SpinnerXxsGlobalWhite("Spinner.Xxs.GlobalWhite"),
    SpinnerXxsAccent("Spinner.Xxs.Accent"),
    SpinnerXxsDanger("Spinner.Xxs.Danger"),
}

/**
 * Возвращает [SpinnerStyle] для [SpinnerStyles]
 */
@Composable
public fun SpinnerStyles.style(modifyAction: @Composable SpinnerStyleBuilder.() -> Unit = {}): SpinnerStyle {
    val builder = when (this) {
        SpinnerStyles.SpinnerMPrimary -> Spinner.M.Primary
        SpinnerStyles.SpinnerMSecondary -> Spinner.M.Secondary
        SpinnerStyles.SpinnerMGlobalWhite -> Spinner.M.GlobalWhite
        SpinnerStyles.SpinnerMAccent -> Spinner.M.Accent
        SpinnerStyles.SpinnerMDanger -> Spinner.M.Danger
        SpinnerStyles.SpinnerSPrimary -> Spinner.S.Primary
        SpinnerStyles.SpinnerSSecondary -> Spinner.S.Secondary
        SpinnerStyles.SpinnerSGlobalWhite -> Spinner.S.GlobalWhite
        SpinnerStyles.SpinnerSAccent -> Spinner.S.Accent
        SpinnerStyles.SpinnerSDanger -> Spinner.S.Danger
        SpinnerStyles.SpinnerXsPrimary -> Spinner.Xs.Primary
        SpinnerStyles.SpinnerXsSecondary -> Spinner.Xs.Secondary
        SpinnerStyles.SpinnerXsGlobalWhite -> Spinner.Xs.GlobalWhite
        SpinnerStyles.SpinnerXsAccent -> Spinner.Xs.Accent
        SpinnerStyles.SpinnerXsDanger -> Spinner.Xs.Danger
        SpinnerStyles.SpinnerXxsPrimary -> Spinner.Xxs.Primary
        SpinnerStyles.SpinnerXxsSecondary -> Spinner.Xxs.Secondary
        SpinnerStyles.SpinnerXxsGlobalWhite -> Spinner.Xxs.GlobalWhite
        SpinnerStyles.SpinnerXxsAccent -> Spinner.Xxs.Accent
        SpinnerStyles.SpinnerXxsDanger -> Spinner.Xxs.Danger
    }
    return builder.modify(modifyAction).style()
}

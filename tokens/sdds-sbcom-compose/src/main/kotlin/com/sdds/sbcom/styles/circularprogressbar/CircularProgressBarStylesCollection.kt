// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.circularprogressbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CircularProgressBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CircularProgressBar
 */
public enum class CircularProgressBarStyles(
    public val key: String,
) {
    CircularProgressBarXxlPrimary("CircularProgressBar.Xxl.Primary"),
    CircularProgressBarXxlSecondary("CircularProgressBar.Xxl.Secondary"),
    CircularProgressBarXxlGlobalWhite("CircularProgressBar.Xxl.GlobalWhite"),
    CircularProgressBarXxlAccent("CircularProgressBar.Xxl.Accent"),
    CircularProgressBarXxlDanger("CircularProgressBar.Xxl.Danger"),
    CircularProgressBarMPrimary("CircularProgressBar.M.Primary"),
    CircularProgressBarMSecondary("CircularProgressBar.M.Secondary"),
    CircularProgressBarMGlobalWhite("CircularProgressBar.M.GlobalWhite"),
    CircularProgressBarMAccent("CircularProgressBar.M.Accent"),
    CircularProgressBarMDanger("CircularProgressBar.M.Danger"),
    CircularProgressBarSPrimary("CircularProgressBar.S.Primary"),
    CircularProgressBarSSecondary("CircularProgressBar.S.Secondary"),
    CircularProgressBarSGlobalWhite("CircularProgressBar.S.GlobalWhite"),
    CircularProgressBarSAccent("CircularProgressBar.S.Accent"),
    CircularProgressBarSDanger("CircularProgressBar.S.Danger"),
    CircularProgressBarXsPrimary("CircularProgressBar.Xs.Primary"),
    CircularProgressBarXsSecondary("CircularProgressBar.Xs.Secondary"),
    CircularProgressBarXsGlobalWhite("CircularProgressBar.Xs.GlobalWhite"),
    CircularProgressBarXsAccent("CircularProgressBar.Xs.Accent"),
    CircularProgressBarXsDanger("CircularProgressBar.Xs.Danger"),
    CircularProgressBarXxsPrimary("CircularProgressBar.Xxs.Primary"),
    CircularProgressBarXxsSecondary("CircularProgressBar.Xxs.Secondary"),
    CircularProgressBarXxsGlobalWhite("CircularProgressBar.Xxs.GlobalWhite"),
    CircularProgressBarXxsAccent("CircularProgressBar.Xxs.Accent"),
    CircularProgressBarXxsDanger("CircularProgressBar.Xxs.Danger"),
}

/**
 * Возвращает [CircularProgressBarStyle] для [CircularProgressBarStyles]
 */
@Composable
public fun CircularProgressBarStyles.style(
    modifyAction: @Composable
    CircularProgressBarStyleBuilder.() -> Unit = {},
): CircularProgressBarStyle {
    val builder = when (this) {
        CircularProgressBarStyles.CircularProgressBarXxlPrimary -> CircularProgressBar.Xxl.Primary
        CircularProgressBarStyles.CircularProgressBarXxlSecondary ->
            CircularProgressBar.Xxl.Secondary
        CircularProgressBarStyles.CircularProgressBarXxlGlobalWhite ->
            CircularProgressBar.Xxl.GlobalWhite
        CircularProgressBarStyles.CircularProgressBarXxlAccent -> CircularProgressBar.Xxl.Accent
        CircularProgressBarStyles.CircularProgressBarXxlDanger -> CircularProgressBar.Xxl.Danger
        CircularProgressBarStyles.CircularProgressBarMPrimary -> CircularProgressBar.M.Primary
        CircularProgressBarStyles.CircularProgressBarMSecondary -> CircularProgressBar.M.Secondary
        CircularProgressBarStyles.CircularProgressBarMGlobalWhite ->
            CircularProgressBar.M.GlobalWhite
        CircularProgressBarStyles.CircularProgressBarMAccent -> CircularProgressBar.M.Accent
        CircularProgressBarStyles.CircularProgressBarMDanger -> CircularProgressBar.M.Danger
        CircularProgressBarStyles.CircularProgressBarSPrimary -> CircularProgressBar.S.Primary
        CircularProgressBarStyles.CircularProgressBarSSecondary -> CircularProgressBar.S.Secondary
        CircularProgressBarStyles.CircularProgressBarSGlobalWhite ->
            CircularProgressBar.S.GlobalWhite
        CircularProgressBarStyles.CircularProgressBarSAccent -> CircularProgressBar.S.Accent
        CircularProgressBarStyles.CircularProgressBarSDanger -> CircularProgressBar.S.Danger
        CircularProgressBarStyles.CircularProgressBarXsPrimary -> CircularProgressBar.Xs.Primary
        CircularProgressBarStyles.CircularProgressBarXsSecondary -> CircularProgressBar.Xs.Secondary
        CircularProgressBarStyles.CircularProgressBarXsGlobalWhite ->
            CircularProgressBar.Xs.GlobalWhite
        CircularProgressBarStyles.CircularProgressBarXsAccent -> CircularProgressBar.Xs.Accent
        CircularProgressBarStyles.CircularProgressBarXsDanger -> CircularProgressBar.Xs.Danger
        CircularProgressBarStyles.CircularProgressBarXxsPrimary -> CircularProgressBar.Xxs.Primary
        CircularProgressBarStyles.CircularProgressBarXxsSecondary ->
            CircularProgressBar.Xxs.Secondary
        CircularProgressBarStyles.CircularProgressBarXxsGlobalWhite ->
            CircularProgressBar.Xxs.GlobalWhite
        CircularProgressBarStyles.CircularProgressBarXxsAccent -> CircularProgressBar.Xxs.Accent
        CircularProgressBarStyles.CircularProgressBarXxsDanger -> CircularProgressBar.Xxs.Danger
    }
    return builder.modify(modifyAction).style()
}

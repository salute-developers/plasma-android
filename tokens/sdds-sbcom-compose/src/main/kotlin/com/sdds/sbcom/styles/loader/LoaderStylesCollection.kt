// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Loader
 */
public enum class LoaderStyles(
    public val key: String,
) {
    LoaderSize40ModeColorPrimary("Loader.Size40.ModeColorPrimary"),
    LoaderSize40ModeColorSecondary("Loader.Size40.ModeColorSecondary"),
    LoaderSize40ModeColorGlobalWhite("Loader.Size40.ModeColorGlobalWhite"),
    LoaderSize40ModeColorAccent("Loader.Size40.ModeColorAccent"),
    LoaderSize40ModeColorDanger("Loader.Size40.ModeColorDanger"),
    LoaderSize32ModeColorPrimary("Loader.Size32.ModeColorPrimary"),
    LoaderSize32ModeColorSecondary("Loader.Size32.ModeColorSecondary"),
    LoaderSize32ModeColorGlobalWhite("Loader.Size32.ModeColorGlobalWhite"),
    LoaderSize32ModeColorAccent("Loader.Size32.ModeColorAccent"),
    LoaderSize32ModeColorDanger("Loader.Size32.ModeColorDanger"),
    LoaderSize24ModeColorPrimary("Loader.Size24.ModeColorPrimary"),
    LoaderSize24ModeColorSecondary("Loader.Size24.ModeColorSecondary"),
    LoaderSize24ModeColorGlobalWhite("Loader.Size24.ModeColorGlobalWhite"),
    LoaderSize24ModeColorAccent("Loader.Size24.ModeColorAccent"),
    LoaderSize24ModeColorDanger("Loader.Size24.ModeColorDanger"),
    LoaderSize16ModeColorPrimary("Loader.Size16.ModeColorPrimary"),
    LoaderSize16ModeColorSecondary("Loader.Size16.ModeColorSecondary"),
    LoaderSize16ModeColorGlobalWhite("Loader.Size16.ModeColorGlobalWhite"),
    LoaderSize16ModeColorAccent("Loader.Size16.ModeColorAccent"),
    LoaderSize16ModeColorDanger("Loader.Size16.ModeColorDanger"),
}

/**
 * Возвращает [LoaderStyle] для [LoaderStyles]
 */
@Composable
public fun LoaderStyles.style(modifyAction: @Composable LoaderStyleBuilder.() -> Unit = {}): LoaderStyle {
    val builder = when (this) {
        LoaderStyles.LoaderSize40ModeColorPrimary -> Loader.Size40.ModeColorPrimary
        LoaderStyles.LoaderSize40ModeColorSecondary -> Loader.Size40.ModeColorSecondary
        LoaderStyles.LoaderSize40ModeColorGlobalWhite -> Loader.Size40.ModeColorGlobalWhite
        LoaderStyles.LoaderSize40ModeColorAccent -> Loader.Size40.ModeColorAccent
        LoaderStyles.LoaderSize40ModeColorDanger -> Loader.Size40.ModeColorDanger
        LoaderStyles.LoaderSize32ModeColorPrimary -> Loader.Size32.ModeColorPrimary
        LoaderStyles.LoaderSize32ModeColorSecondary -> Loader.Size32.ModeColorSecondary
        LoaderStyles.LoaderSize32ModeColorGlobalWhite -> Loader.Size32.ModeColorGlobalWhite
        LoaderStyles.LoaderSize32ModeColorAccent -> Loader.Size32.ModeColorAccent
        LoaderStyles.LoaderSize32ModeColorDanger -> Loader.Size32.ModeColorDanger
        LoaderStyles.LoaderSize24ModeColorPrimary -> Loader.Size24.ModeColorPrimary
        LoaderStyles.LoaderSize24ModeColorSecondary -> Loader.Size24.ModeColorSecondary
        LoaderStyles.LoaderSize24ModeColorGlobalWhite -> Loader.Size24.ModeColorGlobalWhite
        LoaderStyles.LoaderSize24ModeColorAccent -> Loader.Size24.ModeColorAccent
        LoaderStyles.LoaderSize24ModeColorDanger -> Loader.Size24.ModeColorDanger
        LoaderStyles.LoaderSize16ModeColorPrimary -> Loader.Size16.ModeColorPrimary
        LoaderStyles.LoaderSize16ModeColorSecondary -> Loader.Size16.ModeColorSecondary
        LoaderStyles.LoaderSize16ModeColorGlobalWhite -> Loader.Size16.ModeColorGlobalWhite
        LoaderStyles.LoaderSize16ModeColorAccent -> Loader.Size16.ModeColorAccent
        LoaderStyles.LoaderSize16ModeColorDanger -> Loader.Size16.ModeColorDanger
    }
    return builder.modify(modifyAction).style()
}

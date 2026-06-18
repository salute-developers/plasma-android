// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Drawer
 */
public enum class DrawerStyles(
    public val key: String,
) {
    DrawerHasBackground("Drawer.HasBackground"),
    DrawerNoBackground("Drawer.NoBackground"),
    ;

    /**
     * Typed API для подбора стиля drawer
     */
    public companion object
}

/**
 * Возвращает [DrawerStyle] для [DrawerStyles]
 */
@Composable
public fun DrawerStyles.style(modify: @Composable DrawerStyleBuilder.() -> Unit = {}): DrawerStyle {
    val builder = when (this) {
        DrawerStyles.DrawerHasBackground -> Drawer.HasBackground
        DrawerStyles.DrawerNoBackground -> Drawer.NoBackground
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DrawerStyles] для drawer
 */
public fun DrawerStyles.Companion.resolve(hasBackground: Boolean = false): DrawerStyles = when {
    hasBackground == true -> DrawerStyles.DrawerHasBackground
    hasBackground == false -> DrawerStyles.DrawerNoBackground
    else -> error("Unsupported drawer style combination")
}

/**
 * Возвращает [DrawerStyle] для drawer
 */
@Composable
public fun DrawerStyles.Companion.style(
    hasBackground: Boolean = false,
    modify: @Composable
    DrawerStyleBuilder.() -> Unit = {},
): DrawerStyle = resolve(hasBackground).style(modify)

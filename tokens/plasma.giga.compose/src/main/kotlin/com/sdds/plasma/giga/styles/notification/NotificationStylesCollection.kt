// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.notification

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.NotificationStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Notification
 */
public enum class NotificationStyles(
    public val key: String,
) {
    NotificationCompactL("NotificationCompact.L"),
    NotificationCompactM("NotificationCompact.M"),
    NotificationCompactS("NotificationCompact.S"),
    NotificationLooseL("NotificationLoose.L"),
    NotificationLooseM("NotificationLoose.M"),
    NotificationLooseS("NotificationLoose.S"),
    ;

    /**
     * Typed API для подбора стиля notification-compact
     */
    public object Compact

    /**
     * Typed API для подбора стиля notification-loose
     */
    public object Loose
}

/**
 * Возможные значения свойства size для notification-compact
 */
public enum class NotificationCompactSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства size для notification-loose
 */
public enum class NotificationLooseSize {
    L,
    M,
    S,
}

/**
 * Возвращает [NotificationStyle] для [NotificationStyles]
 */
@Composable
public fun NotificationStyles.style(modify: @Composable NotificationStyleBuilder.() -> Unit = {}): NotificationStyle {
    val builder = when (this) {
        NotificationStyles.NotificationCompactL -> NotificationCompact.L
        NotificationStyles.NotificationCompactM -> NotificationCompact.M
        NotificationStyles.NotificationCompactS -> NotificationCompact.S
        NotificationStyles.NotificationLooseL -> NotificationLoose.L
        NotificationStyles.NotificationLooseM -> NotificationLoose.M
        NotificationStyles.NotificationLooseS -> NotificationLoose.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NotificationStyles] для notification-compact
 */
public fun NotificationStyles.Compact.resolve(
    size: NotificationCompactSize =
        NotificationCompactSize.L,
): NotificationStyles = when {
    size == NotificationCompactSize.L -> NotificationStyles.NotificationCompactL
    size == NotificationCompactSize.M -> NotificationStyles.NotificationCompactM
    size == NotificationCompactSize.S -> NotificationStyles.NotificationCompactS
    else -> error("Unsupported notification-compact style combination")
}

/**
 * Возвращает [NotificationStyle] для notification-compact
 */
@Composable
public fun NotificationStyles.Compact.style(
    size: NotificationCompactSize =
        NotificationCompactSize.L,
    modify: @Composable NotificationStyleBuilder.() -> Unit = {},
): NotificationStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [NotificationStyles] для notification-loose
 */
public fun NotificationStyles.Loose.resolve(size: NotificationLooseSize = NotificationLooseSize.L):
    NotificationStyles = when {
    size == NotificationLooseSize.L -> NotificationStyles.NotificationLooseL
    size == NotificationLooseSize.M -> NotificationStyles.NotificationLooseM
    size == NotificationLooseSize.S -> NotificationStyles.NotificationLooseS
    else -> error("Unsupported notification-loose style combination")
}

/**
 * Возвращает [NotificationStyle] для notification-loose
 */
@Composable
public fun NotificationStyles.Loose.style(
    size: NotificationLooseSize = NotificationLooseSize.L,
    modify: @Composable NotificationStyleBuilder.() -> Unit = {},
): NotificationStyle =
    resolve(size).style(modify)

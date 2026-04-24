// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.counter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Counter
 */
public enum class CounterStyles(
    public val key: String,
) {
    CounterMuteNo("Counter.MuteNo"),
    CounterMuteYes("Counter.MuteYes"),
    TabBarCounterDefault("TabBarCounter.Default"),
    TabItemFolderCounterDefault("TabItemFolderCounter.Default"),
    ;

    /**
     * Typed API для подбора стиля counter
     */
    public object Default

    /**
     * Typed API для подбора стиля tab-bar-counter
     */
    public object TabBarCounter

    /**
     * Typed API для подбора стиля tab-item-folder-counter
     */
    public object TabItemFolderCounter
}

/**
 * Возможные значения свойства mute для counter
 */
public enum class CounterDefaultMute {
    No,
    Yes,
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modify: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
    val builder = when (this) {
        CounterStyles.CounterMuteNo -> Counter.MuteNo
        CounterStyles.CounterMuteYes -> Counter.MuteYes
        CounterStyles.TabBarCounterDefault -> TabBarCounter.Default
        CounterStyles.TabItemFolderCounterDefault -> TabItemFolderCounter.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CounterStyles] для counter
 */
public fun CounterStyles.Default.resolve(mute: CounterDefaultMute = CounterDefaultMute.No): CounterStyles = when {
    mute == CounterDefaultMute.No -> CounterStyles.CounterMuteNo
    mute == CounterDefaultMute.Yes -> CounterStyles.CounterMuteYes
    else -> error("Unsupported counter style combination")
}

/**
 * Возвращает [CounterStyle] для counter
 */
@Composable
public fun CounterStyles.Default.style(
    mute: CounterDefaultMute = CounterDefaultMute.No,
    modify: @Composable CounterStyleBuilder.() -> Unit = {},
): CounterStyle =
    resolve(mute).style(modify)

/**
 * Возвращает экземпляр [CounterStyles] для tab-bar-counter
 */
public fun CounterStyles.TabBarCounter.resolve(): CounterStyles = CounterStyles.TabBarCounterDefault

/**
 * Возвращает [CounterStyle] для tab-bar-counter
 */
@Composable
public fun CounterStyles.TabBarCounter.style(
    modify: @Composable CounterStyleBuilder.() -> Unit =
        {},
): CounterStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [CounterStyles] для tab-item-folder-counter
 */
public fun CounterStyles.TabItemFolderCounter.resolve(): CounterStyles =
    CounterStyles.TabItemFolderCounterDefault

/**
 * Возвращает [CounterStyle] для tab-item-folder-counter
 */
@Composable
public fun CounterStyles.TabItemFolderCounter.style(
    modify: @Composable
    CounterStyleBuilder.() -> Unit = {},
): CounterStyle = resolve().style(modify)

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
    CounterMuteMuteNo("Counter.Mute.MuteNo"),
    CounterMuteMuteYes("Counter.Mute.MuteYes"),
    CounterDangerMuteNo("Counter.Danger.MuteNo"),
    CounterDangerMuteYes("Counter.Danger.MuteYes"),
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
 * Возможные значения свойства type для counter
 */
public enum class CounterDefaultType {
    Mute,
    Danger,
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modify: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
    val builder = when (this) {
        CounterStyles.CounterMuteMuteNo -> Counter.Mute.MuteNo
        CounterStyles.CounterMuteMuteYes -> Counter.Mute.MuteYes
        CounterStyles.CounterDangerMuteNo -> Counter.Danger.MuteNo
        CounterStyles.CounterDangerMuteYes -> Counter.Danger.MuteYes
        CounterStyles.TabBarCounterDefault -> TabBarCounter.Default
        CounterStyles.TabItemFolderCounterDefault -> TabItemFolderCounter.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CounterStyles] для counter
 */
public fun CounterStyles.Default.resolve(
    mute: CounterDefaultMute = CounterDefaultMute.No,
    type: CounterDefaultType = CounterDefaultType.Mute,
): CounterStyles = when {
    mute == CounterDefaultMute.No && type == CounterDefaultType.Mute ->
        CounterStyles.CounterMuteMuteNo
    mute == CounterDefaultMute.Yes && type == CounterDefaultType.Mute ->
        CounterStyles.CounterMuteMuteYes
    mute == CounterDefaultMute.No && type == CounterDefaultType.Danger ->
        CounterStyles.CounterDangerMuteNo
    mute == CounterDefaultMute.Yes && type == CounterDefaultType.Danger ->
        CounterStyles.CounterDangerMuteYes
    else -> error("Unsupported counter style combination")
}

/**
 * Возвращает [CounterStyle] для counter
 */
@Composable
public fun CounterStyles.Default.style(
    mute: CounterDefaultMute = CounterDefaultMute.No,
    type: CounterDefaultType = CounterDefaultType.Mute,
    modify: @Composable CounterStyleBuilder.() -> Unit = {},
): CounterStyle = resolve(mute, type).style(modify)

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

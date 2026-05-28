// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.aiheader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AiHeaderStyle
import com.sdds.compose.uikit.AiHeaderStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AiHeader
 */
public enum class AiHeaderStyles(
    public val key: String,
) {
    AiHeaderXsDefault("AiHeader.Xs.Default"),
    AiHeaderXsSecondary("AiHeader.Xs.Secondary"),
    AiHeaderXsClear("AiHeader.Xs.Clear"),
    AiHeaderSDefault("AiHeader.S.Default"),
    AiHeaderSSecondary("AiHeader.S.Secondary"),
    AiHeaderSClear("AiHeader.S.Clear"),
    AiHeaderMDefault("AiHeader.M.Default"),
    AiHeaderMSecondary("AiHeader.M.Secondary"),
    AiHeaderMClear("AiHeader.M.Clear"),
    AiHeaderLDefault("AiHeader.L.Default"),
    AiHeaderLSecondary("AiHeader.L.Secondary"),
    AiHeaderLClear("AiHeader.L.Clear"),
    AiHeaderXlDefault("AiHeader.Xl.Default"),
    AiHeaderXlSecondary("AiHeader.Xl.Secondary"),
    AiHeaderXlClear("AiHeader.Xl.Clear"),
    AiHeaderH5Default("AiHeader.H5.Default"),
    AiHeaderH5Secondary("AiHeader.H5.Secondary"),
    AiHeaderH5Clear("AiHeader.H5.Clear"),
    AiHeaderH4Default("AiHeader.H4.Default"),
    AiHeaderH4Secondary("AiHeader.H4.Secondary"),
    AiHeaderH4Clear("AiHeader.H4.Clear"),
    AiHeaderH3Default("AiHeader.H3.Default"),
    AiHeaderH3Secondary("AiHeader.H3.Secondary"),
    AiHeaderH3Clear("AiHeader.H3.Clear"),
    AiHeaderH2Default("AiHeader.H2.Default"),
    AiHeaderH2Secondary("AiHeader.H2.Secondary"),
    AiHeaderH2Clear("AiHeader.H2.Clear"),
    ;

    /**
     * Typed API для подбора стиля ai-header
     */
    public companion object
}

/**
 * Возможные значения свойства size для ai-header
 */
public enum class AiHeaderSize {
    Xs,
    S,
    M,
    L,
    Xl,
    H5,
    H4,
    H3,
    H2,
}

/**
 * Возможные значения свойства view для ai-header
 */
public enum class AiHeaderView {
    Default,
    Secondary,
    Clear,
}

/**
 * Возвращает [AiHeaderStyle] для [AiHeaderStyles]
 */
@Composable
public fun AiHeaderStyles.style(modify: @Composable AiHeaderStyleBuilder.() -> Unit = {}): AiHeaderStyle {
    val builder = when (this) {
        AiHeaderStyles.AiHeaderXsDefault -> AiHeader.Xs.Default
        AiHeaderStyles.AiHeaderXsSecondary -> AiHeader.Xs.Secondary
        AiHeaderStyles.AiHeaderXsClear -> AiHeader.Xs.Clear
        AiHeaderStyles.AiHeaderSDefault -> AiHeader.S.Default
        AiHeaderStyles.AiHeaderSSecondary -> AiHeader.S.Secondary
        AiHeaderStyles.AiHeaderSClear -> AiHeader.S.Clear
        AiHeaderStyles.AiHeaderMDefault -> AiHeader.M.Default
        AiHeaderStyles.AiHeaderMSecondary -> AiHeader.M.Secondary
        AiHeaderStyles.AiHeaderMClear -> AiHeader.M.Clear
        AiHeaderStyles.AiHeaderLDefault -> AiHeader.L.Default
        AiHeaderStyles.AiHeaderLSecondary -> AiHeader.L.Secondary
        AiHeaderStyles.AiHeaderLClear -> AiHeader.L.Clear
        AiHeaderStyles.AiHeaderXlDefault -> AiHeader.Xl.Default
        AiHeaderStyles.AiHeaderXlSecondary -> AiHeader.Xl.Secondary
        AiHeaderStyles.AiHeaderXlClear -> AiHeader.Xl.Clear
        AiHeaderStyles.AiHeaderH5Default -> AiHeader.H5.Default
        AiHeaderStyles.AiHeaderH5Secondary -> AiHeader.H5.Secondary
        AiHeaderStyles.AiHeaderH5Clear -> AiHeader.H5.Clear
        AiHeaderStyles.AiHeaderH4Default -> AiHeader.H4.Default
        AiHeaderStyles.AiHeaderH4Secondary -> AiHeader.H4.Secondary
        AiHeaderStyles.AiHeaderH4Clear -> AiHeader.H4.Clear
        AiHeaderStyles.AiHeaderH3Default -> AiHeader.H3.Default
        AiHeaderStyles.AiHeaderH3Secondary -> AiHeader.H3.Secondary
        AiHeaderStyles.AiHeaderH3Clear -> AiHeader.H3.Clear
        AiHeaderStyles.AiHeaderH2Default -> AiHeader.H2.Default
        AiHeaderStyles.AiHeaderH2Secondary -> AiHeader.H2.Secondary
        AiHeaderStyles.AiHeaderH2Clear -> AiHeader.H2.Clear
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AiHeaderStyles] для ai-header
 */
public fun AiHeaderStyles.Companion.resolve(
    size: AiHeaderSize = AiHeaderSize.Xs,
    view: AiHeaderView =
        AiHeaderView.Default,
): AiHeaderStyles = when {
    size == AiHeaderSize.Xs && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderXsDefault
    size == AiHeaderSize.Xs && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderXsSecondary
    size == AiHeaderSize.Xs && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderXsClear
    size == AiHeaderSize.S && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderSDefault
    size == AiHeaderSize.S && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderSSecondary
    size == AiHeaderSize.S && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderSClear
    size == AiHeaderSize.M && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderMDefault
    size == AiHeaderSize.M && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderMSecondary
    size == AiHeaderSize.M && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderMClear
    size == AiHeaderSize.L && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderLDefault
    size == AiHeaderSize.L && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderLSecondary
    size == AiHeaderSize.L && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderLClear
    size == AiHeaderSize.Xl && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderXlDefault
    size == AiHeaderSize.Xl && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderXlSecondary
    size == AiHeaderSize.Xl && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderXlClear
    size == AiHeaderSize.H5 && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderH5Default
    size == AiHeaderSize.H5 && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderH5Secondary
    size == AiHeaderSize.H5 && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderH5Clear
    size == AiHeaderSize.H4 && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderH4Default
    size == AiHeaderSize.H4 && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderH4Secondary
    size == AiHeaderSize.H4 && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderH4Clear
    size == AiHeaderSize.H3 && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderH3Default
    size == AiHeaderSize.H3 && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderH3Secondary
    size == AiHeaderSize.H3 && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderH3Clear
    size == AiHeaderSize.H2 && view == AiHeaderView.Default -> AiHeaderStyles.AiHeaderH2Default
    size == AiHeaderSize.H2 && view == AiHeaderView.Secondary -> AiHeaderStyles.AiHeaderH2Secondary
    size == AiHeaderSize.H2 && view == AiHeaderView.Clear -> AiHeaderStyles.AiHeaderH2Clear
    else -> error("Unsupported ai-header style combination")
}

/**
 * Возвращает [AiHeaderStyle] для ai-header
 */
@Composable
public fun AiHeaderStyles.Companion.style(
    size: AiHeaderSize = AiHeaderSize.Xs,
    view: AiHeaderView = AiHeaderView.Default,
    modify: @Composable AiHeaderStyleBuilder.() -> Unit = {},
): AiHeaderStyle = resolve(size, view).style(modify)

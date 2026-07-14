// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.aiusermessage

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.compose.uikit.ai.AiUserMessageStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AiUserMessage
 */
public enum class AiUserMessageStyles(
    public val key: String,
) {
    AiUserMessageXlDefault("AiUserMessage.Xl.Default"),
    AiUserMessageXlSecondary("AiUserMessage.Xl.Secondary"),
    AiUserMessageXlAccent("AiUserMessage.Xl.Accent"),
    AiUserMessageXlPositive("AiUserMessage.Xl.Positive"),
    AiUserMessageXlNegative("AiUserMessage.Xl.Negative"),
    AiUserMessageXlWarning("AiUserMessage.Xl.Warning"),
    AiUserMessageXlContentViewSecondaryDefault("AiUserMessage.Xl.ContentViewSecondary.Default"),
    AiUserMessageXlContentViewSecondarySecondary("AiUserMessage.Xl.ContentViewSecondary.Secondary"),
    AiUserMessageXlContentViewSecondaryAccent("AiUserMessage.Xl.ContentViewSecondary.Accent"),
    AiUserMessageXlContentViewSecondaryPositive("AiUserMessage.Xl.ContentViewSecondary.Positive"),
    AiUserMessageXlContentViewSecondaryNegative("AiUserMessage.Xl.ContentViewSecondary.Negative"),
    AiUserMessageXlContentViewSecondaryWarning("AiUserMessage.Xl.ContentViewSecondary.Warning"),
    AiUserMessageXlContentTypeFileDefault("AiUserMessage.Xl.ContentTypeFile.Default"),
    AiUserMessageXlContentTypeFileSecondary("AiUserMessage.Xl.ContentTypeFile.Secondary"),
    AiUserMessageXlContentTypeFileAccent("AiUserMessage.Xl.ContentTypeFile.Accent"),
    AiUserMessageXlContentTypeFilePositive("AiUserMessage.Xl.ContentTypeFile.Positive"),
    AiUserMessageXlContentTypeFileNegative("AiUserMessage.Xl.ContentTypeFile.Negative"),
    AiUserMessageXlContentTypeFileWarning("AiUserMessage.Xl.ContentTypeFile.Warning"),
    AiUserMessageXlContentTypeFileContentViewSecondaryDefault(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Default",
    ),
    AiUserMessageXlContentTypeFileContentViewSecondarySecondary(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Secondary",
    ),
    AiUserMessageXlContentTypeFileContentViewSecondaryAccent(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Accent",
    ),
    AiUserMessageXlContentTypeFileContentViewSecondaryPositive(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Positive",
    ),
    AiUserMessageXlContentTypeFileContentViewSecondaryNegative(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Negative",
    ),
    AiUserMessageXlContentTypeFileContentViewSecondaryWarning(
        "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Warning",
    ),
    AiUserMessageLDefault("AiUserMessage.L.Default"),
    AiUserMessageLSecondary("AiUserMessage.L.Secondary"),
    AiUserMessageLAccent("AiUserMessage.L.Accent"),
    AiUserMessageLPositive("AiUserMessage.L.Positive"),
    AiUserMessageLNegative("AiUserMessage.L.Negative"),
    AiUserMessageLWarning("AiUserMessage.L.Warning"),
    AiUserMessageLContentViewSecondaryDefault("AiUserMessage.L.ContentViewSecondary.Default"),
    AiUserMessageLContentViewSecondarySecondary("AiUserMessage.L.ContentViewSecondary.Secondary"),
    AiUserMessageLContentViewSecondaryAccent("AiUserMessage.L.ContentViewSecondary.Accent"),
    AiUserMessageLContentViewSecondaryPositive("AiUserMessage.L.ContentViewSecondary.Positive"),
    AiUserMessageLContentViewSecondaryNegative("AiUserMessage.L.ContentViewSecondary.Negative"),
    AiUserMessageLContentViewSecondaryWarning("AiUserMessage.L.ContentViewSecondary.Warning"),
    AiUserMessageLContentTypeFileDefault("AiUserMessage.L.ContentTypeFile.Default"),
    AiUserMessageLContentTypeFileSecondary("AiUserMessage.L.ContentTypeFile.Secondary"),
    AiUserMessageLContentTypeFileAccent("AiUserMessage.L.ContentTypeFile.Accent"),
    AiUserMessageLContentTypeFilePositive("AiUserMessage.L.ContentTypeFile.Positive"),
    AiUserMessageLContentTypeFileNegative("AiUserMessage.L.ContentTypeFile.Negative"),
    AiUserMessageLContentTypeFileWarning("AiUserMessage.L.ContentTypeFile.Warning"),
    AiUserMessageLContentTypeFileContentViewSecondaryDefault(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Default",
    ),
    AiUserMessageLContentTypeFileContentViewSecondarySecondary(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Secondary",
    ),
    AiUserMessageLContentTypeFileContentViewSecondaryAccent(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Accent",
    ),
    AiUserMessageLContentTypeFileContentViewSecondaryPositive(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Positive",
    ),
    AiUserMessageLContentTypeFileContentViewSecondaryNegative(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Negative",
    ),
    AiUserMessageLContentTypeFileContentViewSecondaryWarning(
        "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Warning",
    ),
    AiUserMessageMDefault("AiUserMessage.M.Default"),
    AiUserMessageMSecondary("AiUserMessage.M.Secondary"),
    AiUserMessageMAccent("AiUserMessage.M.Accent"),
    AiUserMessageMPositive("AiUserMessage.M.Positive"),
    AiUserMessageMNegative("AiUserMessage.M.Negative"),
    AiUserMessageMWarning("AiUserMessage.M.Warning"),
    AiUserMessageMContentViewSecondaryDefault("AiUserMessage.M.ContentViewSecondary.Default"),
    AiUserMessageMContentViewSecondarySecondary("AiUserMessage.M.ContentViewSecondary.Secondary"),
    AiUserMessageMContentViewSecondaryAccent("AiUserMessage.M.ContentViewSecondary.Accent"),
    AiUserMessageMContentViewSecondaryPositive("AiUserMessage.M.ContentViewSecondary.Positive"),
    AiUserMessageMContentViewSecondaryNegative("AiUserMessage.M.ContentViewSecondary.Negative"),
    AiUserMessageMContentViewSecondaryWarning("AiUserMessage.M.ContentViewSecondary.Warning"),
    AiUserMessageMContentTypeFileDefault("AiUserMessage.M.ContentTypeFile.Default"),
    AiUserMessageMContentTypeFileSecondary("AiUserMessage.M.ContentTypeFile.Secondary"),
    AiUserMessageMContentTypeFileAccent("AiUserMessage.M.ContentTypeFile.Accent"),
    AiUserMessageMContentTypeFilePositive("AiUserMessage.M.ContentTypeFile.Positive"),
    AiUserMessageMContentTypeFileNegative("AiUserMessage.M.ContentTypeFile.Negative"),
    AiUserMessageMContentTypeFileWarning("AiUserMessage.M.ContentTypeFile.Warning"),
    AiUserMessageMContentTypeFileContentViewSecondaryDefault(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Default",
    ),
    AiUserMessageMContentTypeFileContentViewSecondarySecondary(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Secondary",
    ),
    AiUserMessageMContentTypeFileContentViewSecondaryAccent(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Accent",
    ),
    AiUserMessageMContentTypeFileContentViewSecondaryPositive(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Positive",
    ),
    AiUserMessageMContentTypeFileContentViewSecondaryNegative(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Negative",
    ),
    AiUserMessageMContentTypeFileContentViewSecondaryWarning(
        "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Warning",
    ),
    AiUserMessageSDefault("AiUserMessage.S.Default"),
    AiUserMessageSSecondary("AiUserMessage.S.Secondary"),
    AiUserMessageSAccent("AiUserMessage.S.Accent"),
    AiUserMessageSPositive("AiUserMessage.S.Positive"),
    AiUserMessageSNegative("AiUserMessage.S.Negative"),
    AiUserMessageSWarning("AiUserMessage.S.Warning"),
    AiUserMessageSContentViewSecondaryDefault("AiUserMessage.S.ContentViewSecondary.Default"),
    AiUserMessageSContentViewSecondarySecondary("AiUserMessage.S.ContentViewSecondary.Secondary"),
    AiUserMessageSContentViewSecondaryAccent("AiUserMessage.S.ContentViewSecondary.Accent"),
    AiUserMessageSContentViewSecondaryPositive("AiUserMessage.S.ContentViewSecondary.Positive"),
    AiUserMessageSContentViewSecondaryNegative("AiUserMessage.S.ContentViewSecondary.Negative"),
    AiUserMessageSContentViewSecondaryWarning("AiUserMessage.S.ContentViewSecondary.Warning"),
    AiUserMessageSContentTypeFileDefault("AiUserMessage.S.ContentTypeFile.Default"),
    AiUserMessageSContentTypeFileSecondary("AiUserMessage.S.ContentTypeFile.Secondary"),
    AiUserMessageSContentTypeFileAccent("AiUserMessage.S.ContentTypeFile.Accent"),
    AiUserMessageSContentTypeFilePositive("AiUserMessage.S.ContentTypeFile.Positive"),
    AiUserMessageSContentTypeFileNegative("AiUserMessage.S.ContentTypeFile.Negative"),
    AiUserMessageSContentTypeFileWarning("AiUserMessage.S.ContentTypeFile.Warning"),
    AiUserMessageSContentTypeFileContentViewSecondaryDefault(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Default",
    ),
    AiUserMessageSContentTypeFileContentViewSecondarySecondary(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Secondary",
    ),
    AiUserMessageSContentTypeFileContentViewSecondaryAccent(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Accent",
    ),
    AiUserMessageSContentTypeFileContentViewSecondaryPositive(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Positive",
    ),
    AiUserMessageSContentTypeFileContentViewSecondaryNegative(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Negative",
    ),
    AiUserMessageSContentTypeFileContentViewSecondaryWarning(
        "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Warning",
    ),
    AiUserMessageXsDefault("AiUserMessage.Xs.Default"),
    AiUserMessageXsSecondary("AiUserMessage.Xs.Secondary"),
    AiUserMessageXsAccent("AiUserMessage.Xs.Accent"),
    AiUserMessageXsPositive("AiUserMessage.Xs.Positive"),
    AiUserMessageXsNegative("AiUserMessage.Xs.Negative"),
    AiUserMessageXsWarning("AiUserMessage.Xs.Warning"),
    AiUserMessageXsContentViewSecondaryDefault("AiUserMessage.Xs.ContentViewSecondary.Default"),
    AiUserMessageXsContentViewSecondarySecondary("AiUserMessage.Xs.ContentViewSecondary.Secondary"),
    AiUserMessageXsContentViewSecondaryAccent("AiUserMessage.Xs.ContentViewSecondary.Accent"),
    AiUserMessageXsContentViewSecondaryPositive("AiUserMessage.Xs.ContentViewSecondary.Positive"),
    AiUserMessageXsContentViewSecondaryNegative("AiUserMessage.Xs.ContentViewSecondary.Negative"),
    AiUserMessageXsContentViewSecondaryWarning("AiUserMessage.Xs.ContentViewSecondary.Warning"),
    AiUserMessageXsContentTypeFileDefault("AiUserMessage.Xs.ContentTypeFile.Default"),
    AiUserMessageXsContentTypeFileSecondary("AiUserMessage.Xs.ContentTypeFile.Secondary"),
    AiUserMessageXsContentTypeFileAccent("AiUserMessage.Xs.ContentTypeFile.Accent"),
    AiUserMessageXsContentTypeFilePositive("AiUserMessage.Xs.ContentTypeFile.Positive"),
    AiUserMessageXsContentTypeFileNegative("AiUserMessage.Xs.ContentTypeFile.Negative"),
    AiUserMessageXsContentTypeFileWarning("AiUserMessage.Xs.ContentTypeFile.Warning"),
    AiUserMessageXsContentTypeFileContentViewSecondaryDefault(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Default",
    ),
    AiUserMessageXsContentTypeFileContentViewSecondarySecondary(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Secondary",
    ),
    AiUserMessageXsContentTypeFileContentViewSecondaryAccent(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Accent",
    ),
    AiUserMessageXsContentTypeFileContentViewSecondaryPositive(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Positive",
    ),
    AiUserMessageXsContentTypeFileContentViewSecondaryNegative(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Negative",
    ),
    AiUserMessageXsContentTypeFileContentViewSecondaryWarning(
        "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Warning",
    ),
    ;

    /**
     * Typed API для подбора стиля ai-user-message
     */
    public companion object
}

/**
 * Возможные значения свойства size для ai-user-message
 */
public enum class AiUserMessageSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства content-type для ai-user-message
 */
public enum class AiUserMessageContentType {
    Image,
    File,
}

/**
 * Возможные значения свойства content-view для ai-user-message
 */
public enum class AiUserMessageContentView {
    Default,
    Secondary,
}

/**
 * Возможные значения свойства view для ai-user-message
 */
public enum class AiUserMessageView {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
}

/**
 * Возвращает [AiUserMessageStyle] для [AiUserMessageStyles]
 */
@Composable
public fun AiUserMessageStyles.style(modify: @Composable AiUserMessageStyleBuilder.() -> Unit = {}):
    AiUserMessageStyle {
    val builder = when (this) {
        AiUserMessageStyles.AiUserMessageXlDefault -> AiUserMessage.Xl.Default
        AiUserMessageStyles.AiUserMessageXlSecondary -> AiUserMessage.Xl.Secondary
        AiUserMessageStyles.AiUserMessageXlAccent -> AiUserMessage.Xl.Accent
        AiUserMessageStyles.AiUserMessageXlPositive -> AiUserMessage.Xl.Positive
        AiUserMessageStyles.AiUserMessageXlNegative -> AiUserMessage.Xl.Negative
        AiUserMessageStyles.AiUserMessageXlWarning -> AiUserMessage.Xl.Warning
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryDefault ->
            AiUserMessage.Xl.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageXlContentViewSecondarySecondary ->
            AiUserMessage.Xl.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryAccent ->
            AiUserMessage.Xl.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryPositive ->
            AiUserMessage.Xl.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryNegative ->
            AiUserMessage.Xl.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryWarning ->
            AiUserMessage.Xl.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageXlContentTypeFileDefault ->
            AiUserMessage.Xl.ContentTypeFile.Default
        AiUserMessageStyles.AiUserMessageXlContentTypeFileSecondary ->
            AiUserMessage.Xl.ContentTypeFile.Secondary
        AiUserMessageStyles.AiUserMessageXlContentTypeFileAccent ->
            AiUserMessage.Xl.ContentTypeFile.Accent
        AiUserMessageStyles.AiUserMessageXlContentTypeFilePositive ->
            AiUserMessage.Xl.ContentTypeFile.Positive
        AiUserMessageStyles.AiUserMessageXlContentTypeFileNegative ->
            AiUserMessage.Xl.ContentTypeFile.Negative
        AiUserMessageStyles.AiUserMessageXlContentTypeFileWarning ->
            AiUserMessage.Xl.ContentTypeFile.Warning
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryDefault ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondarySecondary ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryAccent ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryPositive ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryNegative ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryWarning ->
            AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageLDefault -> AiUserMessage.L.Default
        AiUserMessageStyles.AiUserMessageLSecondary -> AiUserMessage.L.Secondary
        AiUserMessageStyles.AiUserMessageLAccent -> AiUserMessage.L.Accent
        AiUserMessageStyles.AiUserMessageLPositive -> AiUserMessage.L.Positive
        AiUserMessageStyles.AiUserMessageLNegative -> AiUserMessage.L.Negative
        AiUserMessageStyles.AiUserMessageLWarning -> AiUserMessage.L.Warning
        AiUserMessageStyles.AiUserMessageLContentViewSecondaryDefault ->
            AiUserMessage.L.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageLContentViewSecondarySecondary ->
            AiUserMessage.L.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageLContentViewSecondaryAccent ->
            AiUserMessage.L.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageLContentViewSecondaryPositive ->
            AiUserMessage.L.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageLContentViewSecondaryNegative ->
            AiUserMessage.L.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageLContentViewSecondaryWarning ->
            AiUserMessage.L.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageLContentTypeFileDefault ->
            AiUserMessage.L.ContentTypeFile.Default
        AiUserMessageStyles.AiUserMessageLContentTypeFileSecondary ->
            AiUserMessage.L.ContentTypeFile.Secondary
        AiUserMessageStyles.AiUserMessageLContentTypeFileAccent ->
            AiUserMessage.L.ContentTypeFile.Accent
        AiUserMessageStyles.AiUserMessageLContentTypeFilePositive ->
            AiUserMessage.L.ContentTypeFile.Positive
        AiUserMessageStyles.AiUserMessageLContentTypeFileNegative ->
            AiUserMessage.L.ContentTypeFile.Negative
        AiUserMessageStyles.AiUserMessageLContentTypeFileWarning ->
            AiUserMessage.L.ContentTypeFile.Warning
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryDefault ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondarySecondary ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryAccent ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryPositive ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryNegative ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryWarning ->
            AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageMDefault -> AiUserMessage.M.Default
        AiUserMessageStyles.AiUserMessageMSecondary -> AiUserMessage.M.Secondary
        AiUserMessageStyles.AiUserMessageMAccent -> AiUserMessage.M.Accent
        AiUserMessageStyles.AiUserMessageMPositive -> AiUserMessage.M.Positive
        AiUserMessageStyles.AiUserMessageMNegative -> AiUserMessage.M.Negative
        AiUserMessageStyles.AiUserMessageMWarning -> AiUserMessage.M.Warning
        AiUserMessageStyles.AiUserMessageMContentViewSecondaryDefault ->
            AiUserMessage.M.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageMContentViewSecondarySecondary ->
            AiUserMessage.M.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageMContentViewSecondaryAccent ->
            AiUserMessage.M.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageMContentViewSecondaryPositive ->
            AiUserMessage.M.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageMContentViewSecondaryNegative ->
            AiUserMessage.M.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageMContentViewSecondaryWarning ->
            AiUserMessage.M.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageMContentTypeFileDefault ->
            AiUserMessage.M.ContentTypeFile.Default
        AiUserMessageStyles.AiUserMessageMContentTypeFileSecondary ->
            AiUserMessage.M.ContentTypeFile.Secondary
        AiUserMessageStyles.AiUserMessageMContentTypeFileAccent ->
            AiUserMessage.M.ContentTypeFile.Accent
        AiUserMessageStyles.AiUserMessageMContentTypeFilePositive ->
            AiUserMessage.M.ContentTypeFile.Positive
        AiUserMessageStyles.AiUserMessageMContentTypeFileNegative ->
            AiUserMessage.M.ContentTypeFile.Negative
        AiUserMessageStyles.AiUserMessageMContentTypeFileWarning ->
            AiUserMessage.M.ContentTypeFile.Warning
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryDefault ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondarySecondary ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryAccent ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryPositive ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryNegative ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryWarning ->
            AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageSDefault -> AiUserMessage.S.Default
        AiUserMessageStyles.AiUserMessageSSecondary -> AiUserMessage.S.Secondary
        AiUserMessageStyles.AiUserMessageSAccent -> AiUserMessage.S.Accent
        AiUserMessageStyles.AiUserMessageSPositive -> AiUserMessage.S.Positive
        AiUserMessageStyles.AiUserMessageSNegative -> AiUserMessage.S.Negative
        AiUserMessageStyles.AiUserMessageSWarning -> AiUserMessage.S.Warning
        AiUserMessageStyles.AiUserMessageSContentViewSecondaryDefault ->
            AiUserMessage.S.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageSContentViewSecondarySecondary ->
            AiUserMessage.S.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageSContentViewSecondaryAccent ->
            AiUserMessage.S.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageSContentViewSecondaryPositive ->
            AiUserMessage.S.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageSContentViewSecondaryNegative ->
            AiUserMessage.S.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageSContentViewSecondaryWarning ->
            AiUserMessage.S.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageSContentTypeFileDefault ->
            AiUserMessage.S.ContentTypeFile.Default
        AiUserMessageStyles.AiUserMessageSContentTypeFileSecondary ->
            AiUserMessage.S.ContentTypeFile.Secondary
        AiUserMessageStyles.AiUserMessageSContentTypeFileAccent ->
            AiUserMessage.S.ContentTypeFile.Accent
        AiUserMessageStyles.AiUserMessageSContentTypeFilePositive ->
            AiUserMessage.S.ContentTypeFile.Positive
        AiUserMessageStyles.AiUserMessageSContentTypeFileNegative ->
            AiUserMessage.S.ContentTypeFile.Negative
        AiUserMessageStyles.AiUserMessageSContentTypeFileWarning ->
            AiUserMessage.S.ContentTypeFile.Warning
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryDefault ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondarySecondary ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryAccent ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryPositive ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryNegative ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryWarning ->
            AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageXsDefault -> AiUserMessage.Xs.Default
        AiUserMessageStyles.AiUserMessageXsSecondary -> AiUserMessage.Xs.Secondary
        AiUserMessageStyles.AiUserMessageXsAccent -> AiUserMessage.Xs.Accent
        AiUserMessageStyles.AiUserMessageXsPositive -> AiUserMessage.Xs.Positive
        AiUserMessageStyles.AiUserMessageXsNegative -> AiUserMessage.Xs.Negative
        AiUserMessageStyles.AiUserMessageXsWarning -> AiUserMessage.Xs.Warning
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryDefault ->
            AiUserMessage.Xs.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageXsContentViewSecondarySecondary ->
            AiUserMessage.Xs.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryAccent ->
            AiUserMessage.Xs.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryPositive ->
            AiUserMessage.Xs.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryNegative ->
            AiUserMessage.Xs.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryWarning ->
            AiUserMessage.Xs.ContentViewSecondary.Warning
        AiUserMessageStyles.AiUserMessageXsContentTypeFileDefault ->
            AiUserMessage.Xs.ContentTypeFile.Default
        AiUserMessageStyles.AiUserMessageXsContentTypeFileSecondary ->
            AiUserMessage.Xs.ContentTypeFile.Secondary
        AiUserMessageStyles.AiUserMessageXsContentTypeFileAccent ->
            AiUserMessage.Xs.ContentTypeFile.Accent
        AiUserMessageStyles.AiUserMessageXsContentTypeFilePositive ->
            AiUserMessage.Xs.ContentTypeFile.Positive
        AiUserMessageStyles.AiUserMessageXsContentTypeFileNegative ->
            AiUserMessage.Xs.ContentTypeFile.Negative
        AiUserMessageStyles.AiUserMessageXsContentTypeFileWarning ->
            AiUserMessage.Xs.ContentTypeFile.Warning
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryDefault ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Default
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondarySecondary ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Secondary
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryAccent ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Accent
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryPositive ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Positive
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryNegative ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Negative
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryWarning ->
            AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AiUserMessageStyles] для ai-user-message
 */
public fun AiUserMessageStyles.Companion.resolve(
    size: AiUserMessageSize = AiUserMessageSize.M,
    contentType: AiUserMessageContentType = AiUserMessageContentType.Image,
    contentView: AiUserMessageContentView = AiUserMessageContentView.Default,
    view: AiUserMessageView = AiUserMessageView.Default,
): AiUserMessageStyles = when {
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryDefault
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondarySecondary
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryAccent
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryPositive
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryNegative
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageXlContentTypeFileContentViewSecondaryWarning
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryDefault
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondarySecondary
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryAccent
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryPositive
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryNegative
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageLContentTypeFileContentViewSecondaryWarning
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryDefault
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondarySecondary
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryAccent
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryPositive
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryNegative
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageMContentTypeFileContentViewSecondaryWarning
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryDefault
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondarySecondary
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryAccent
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryPositive
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryNegative
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageSContentTypeFileContentViewSecondaryWarning
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryDefault
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondarySecondary
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryAccent
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryPositive
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryNegative
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && contentView ==
        AiUserMessageContentView.Secondary && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageXsContentTypeFileContentViewSecondaryWarning
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageXlContentViewSecondaryDefault
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXlContentViewSecondarySecondary
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageXlContentViewSecondaryAccent
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryPositive
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXlContentViewSecondaryNegative
    size == AiUserMessageSize.Xl && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageXlContentViewSecondaryWarning
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageXlContentTypeFileDefault
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Secondary -> AiUserMessageStyles.AiUserMessageXlContentTypeFileSecondary
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageXlContentTypeFileAccent
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageXlContentTypeFilePositive
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageXlContentTypeFileNegative
    size == AiUserMessageSize.Xl && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageXlContentTypeFileWarning
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageLContentViewSecondaryDefault
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageLContentViewSecondarySecondary
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageLContentViewSecondaryAccent
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageLContentViewSecondaryPositive
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageLContentViewSecondaryNegative
    size == AiUserMessageSize.L && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageLContentViewSecondaryWarning
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageLContentTypeFileDefault
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Secondary -> AiUserMessageStyles.AiUserMessageLContentTypeFileSecondary
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageLContentTypeFileAccent
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageLContentTypeFilePositive
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageLContentTypeFileNegative
    size == AiUserMessageSize.L && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageLContentTypeFileWarning
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageMContentViewSecondaryDefault
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageMContentViewSecondarySecondary
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageMContentViewSecondaryAccent
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageMContentViewSecondaryPositive
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageMContentViewSecondaryNegative
    size == AiUserMessageSize.M && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageMContentViewSecondaryWarning
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageMContentTypeFileDefault
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Secondary -> AiUserMessageStyles.AiUserMessageMContentTypeFileSecondary
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageMContentTypeFileAccent
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageMContentTypeFilePositive
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageMContentTypeFileNegative
    size == AiUserMessageSize.M && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageMContentTypeFileWarning
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageSContentViewSecondaryDefault
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageSContentViewSecondarySecondary
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageSContentViewSecondaryAccent
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageSContentViewSecondaryPositive
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageSContentViewSecondaryNegative
    size == AiUserMessageSize.S && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageSContentViewSecondaryWarning
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageSContentTypeFileDefault
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Secondary -> AiUserMessageStyles.AiUserMessageSContentTypeFileSecondary
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageSContentTypeFileAccent
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageSContentTypeFilePositive
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageSContentTypeFileNegative
    size == AiUserMessageSize.S && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageSContentTypeFileWarning
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageXsContentViewSecondaryDefault
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXsContentViewSecondarySecondary
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageXsContentViewSecondaryAccent
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryPositive
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXsContentViewSecondaryNegative
    size == AiUserMessageSize.Xs && contentView == AiUserMessageContentView.Secondary && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageXsContentViewSecondaryWarning
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Default -> AiUserMessageStyles.AiUserMessageXsContentTypeFileDefault
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Secondary -> AiUserMessageStyles.AiUserMessageXsContentTypeFileSecondary
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Accent -> AiUserMessageStyles.AiUserMessageXsContentTypeFileAccent
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Positive -> AiUserMessageStyles.AiUserMessageXsContentTypeFilePositive
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Negative -> AiUserMessageStyles.AiUserMessageXsContentTypeFileNegative
    size == AiUserMessageSize.Xs && contentType == AiUserMessageContentType.File && view ==
        AiUserMessageView.Warning -> AiUserMessageStyles.AiUserMessageXsContentTypeFileWarning
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageXlDefault
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXlSecondary
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageXlAccent
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXlPositive
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXlNegative
    size == AiUserMessageSize.Xl && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageXlWarning
    size == AiUserMessageSize.L && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageLDefault
    size == AiUserMessageSize.L && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageLSecondary
    size == AiUserMessageSize.L && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageLAccent
    size == AiUserMessageSize.L && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageLPositive
    size == AiUserMessageSize.L && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageLNegative
    size == AiUserMessageSize.L && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageLWarning
    size == AiUserMessageSize.M && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageMDefault
    size == AiUserMessageSize.M && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageMSecondary
    size == AiUserMessageSize.M && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageMAccent
    size == AiUserMessageSize.M && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageMPositive
    size == AiUserMessageSize.M && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageMNegative
    size == AiUserMessageSize.M && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageMWarning
    size == AiUserMessageSize.S && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageSDefault
    size == AiUserMessageSize.S && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageSSecondary
    size == AiUserMessageSize.S && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageSAccent
    size == AiUserMessageSize.S && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageSPositive
    size == AiUserMessageSize.S && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageSNegative
    size == AiUserMessageSize.S && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageSWarning
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Default ->
        AiUserMessageStyles.AiUserMessageXsDefault
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Secondary ->
        AiUserMessageStyles.AiUserMessageXsSecondary
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Accent ->
        AiUserMessageStyles.AiUserMessageXsAccent
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Positive ->
        AiUserMessageStyles.AiUserMessageXsPositive
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Negative ->
        AiUserMessageStyles.AiUserMessageXsNegative
    size == AiUserMessageSize.Xs && view == AiUserMessageView.Warning ->
        AiUserMessageStyles.AiUserMessageXsWarning
    else -> error("Unsupported ai-user-message style combination")
}

/**
 * Возвращает [AiUserMessageStyle] для ai-user-message
 */
@Composable
public fun AiUserMessageStyles.Companion.style(
    size: AiUserMessageSize = AiUserMessageSize.M,
    contentType: AiUserMessageContentType = AiUserMessageContentType.Image,
    contentView: AiUserMessageContentView = AiUserMessageContentView.Default,
    view: AiUserMessageView = AiUserMessageView.Default,
    modify: @Composable AiUserMessageStyleBuilder.() -> Unit = {},
): AiUserMessageStyle = resolve(size, contentType, contentView, view).style(modify)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.aiusermessage.Accent
import com.sdds.serv.styles.aiusermessage.AiUserMessage
import com.sdds.serv.styles.aiusermessage.AiUserMessageContentType
import com.sdds.serv.styles.aiusermessage.AiUserMessageContentView
import com.sdds.serv.styles.aiusermessage.AiUserMessageSize
import com.sdds.serv.styles.aiusermessage.AiUserMessageStyles
import com.sdds.serv.styles.aiusermessage.AiUserMessageView
import com.sdds.serv.styles.aiusermessage.ContentTypeFile
import com.sdds.serv.styles.aiusermessage.ContentViewSecondary
import com.sdds.serv.styles.aiusermessage.Default
import com.sdds.serv.styles.aiusermessage.L
import com.sdds.serv.styles.aiusermessage.M
import com.sdds.serv.styles.aiusermessage.Negative
import com.sdds.serv.styles.aiusermessage.Positive
import com.sdds.serv.styles.aiusermessage.S
import com.sdds.serv.styles.aiusermessage.Secondary
import com.sdds.serv.styles.aiusermessage.Warning
import com.sdds.serv.styles.aiusermessage.Xl
import com.sdds.serv.styles.aiusermessage.Xs
import com.sdds.serv.styles.aiusermessage.resolve

internal object SddsServAiUserMessageVariationsCompose : ComposeStyleProvider<AiUserMessageStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "contentType", value = "Image", variants = listOf("Image", "File")),
            Property.SingleChoiceProperty(
                name = "contentView",
                value = "Default",
                variants = listOf("Default", "Secondary"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AiUserMessageStyle>> =
        mapOf(
            "AiUserMessage.Xl.Default" to ComposeStyleReference { AiUserMessage.Xl.Default.style() },
            "AiUserMessage.Xl.Secondary" to ComposeStyleReference { AiUserMessage.Xl.Secondary.style() },
            "AiUserMessage.Xl.Accent" to ComposeStyleReference { AiUserMessage.Xl.Accent.style() },
            "AiUserMessage.Xl.Positive" to ComposeStyleReference { AiUserMessage.Xl.Positive.style() },
            "AiUserMessage.Xl.Negative" to ComposeStyleReference { AiUserMessage.Xl.Negative.style() },
            "AiUserMessage.Xl.Warning" to ComposeStyleReference { AiUserMessage.Xl.Warning.style() },
            "AiUserMessage.Xl.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.Xl.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.Xl.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.Xl.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.Xl.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.Xl.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.Xl.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.Default" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.Default.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.Secondary" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.Secondary.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.Accent" to ComposeStyleReference { AiUserMessage.Xl.ContentTypeFile.Accent.style() },
            "AiUserMessage.Xl.ContentTypeFile.Positive" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.Positive.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.Negative" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.Negative.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.Warning" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.Warning.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.Xl.ContentTypeFile.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.L.Default" to ComposeStyleReference { AiUserMessage.L.Default.style() },
            "AiUserMessage.L.Secondary" to ComposeStyleReference { AiUserMessage.L.Secondary.style() },
            "AiUserMessage.L.Accent" to ComposeStyleReference { AiUserMessage.L.Accent.style() },
            "AiUserMessage.L.Positive" to ComposeStyleReference { AiUserMessage.L.Positive.style() },
            "AiUserMessage.L.Negative" to ComposeStyleReference { AiUserMessage.L.Negative.style() },
            "AiUserMessage.L.Warning" to ComposeStyleReference { AiUserMessage.L.Warning.style() },
            "AiUserMessage.L.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.L.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.L.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.L.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.L.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.L.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.L.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.L.ContentTypeFile.Default" to ComposeStyleReference { AiUserMessage.L.ContentTypeFile.Default.style() },
            "AiUserMessage.L.ContentTypeFile.Secondary" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.Secondary.style()
            },
            "AiUserMessage.L.ContentTypeFile.Accent" to ComposeStyleReference { AiUserMessage.L.ContentTypeFile.Accent.style() },
            "AiUserMessage.L.ContentTypeFile.Positive" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.Positive.style()
            },
            "AiUserMessage.L.ContentTypeFile.Negative" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.Negative.style()
            },
            "AiUserMessage.L.ContentTypeFile.Warning" to ComposeStyleReference { AiUserMessage.L.ContentTypeFile.Warning.style() },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.M.Default" to ComposeStyleReference { AiUserMessage.M.Default.style() },
            "AiUserMessage.M.Secondary" to ComposeStyleReference { AiUserMessage.M.Secondary.style() },
            "AiUserMessage.M.Accent" to ComposeStyleReference { AiUserMessage.M.Accent.style() },
            "AiUserMessage.M.Positive" to ComposeStyleReference { AiUserMessage.M.Positive.style() },
            "AiUserMessage.M.Negative" to ComposeStyleReference { AiUserMessage.M.Negative.style() },
            "AiUserMessage.M.Warning" to ComposeStyleReference { AiUserMessage.M.Warning.style() },
            "AiUserMessage.M.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.M.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.M.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.M.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.M.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.M.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.M.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.M.ContentTypeFile.Default" to ComposeStyleReference { AiUserMessage.M.ContentTypeFile.Default.style() },
            "AiUserMessage.M.ContentTypeFile.Secondary" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.Secondary.style()
            },
            "AiUserMessage.M.ContentTypeFile.Accent" to ComposeStyleReference { AiUserMessage.M.ContentTypeFile.Accent.style() },
            "AiUserMessage.M.ContentTypeFile.Positive" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.Positive.style()
            },
            "AiUserMessage.M.ContentTypeFile.Negative" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.Negative.style()
            },
            "AiUserMessage.M.ContentTypeFile.Warning" to ComposeStyleReference { AiUserMessage.M.ContentTypeFile.Warning.style() },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.M.ContentTypeFile.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.S.Default" to ComposeStyleReference { AiUserMessage.S.Default.style() },
            "AiUserMessage.S.Secondary" to ComposeStyleReference { AiUserMessage.S.Secondary.style() },
            "AiUserMessage.S.Accent" to ComposeStyleReference { AiUserMessage.S.Accent.style() },
            "AiUserMessage.S.Positive" to ComposeStyleReference { AiUserMessage.S.Positive.style() },
            "AiUserMessage.S.Negative" to ComposeStyleReference { AiUserMessage.S.Negative.style() },
            "AiUserMessage.S.Warning" to ComposeStyleReference { AiUserMessage.S.Warning.style() },
            "AiUserMessage.S.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.S.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.S.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.S.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.S.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.S.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.S.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.S.ContentTypeFile.Default" to ComposeStyleReference { AiUserMessage.S.ContentTypeFile.Default.style() },
            "AiUserMessage.S.ContentTypeFile.Secondary" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.Secondary.style()
            },
            "AiUserMessage.S.ContentTypeFile.Accent" to ComposeStyleReference { AiUserMessage.S.ContentTypeFile.Accent.style() },
            "AiUserMessage.S.ContentTypeFile.Positive" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.Positive.style()
            },
            "AiUserMessage.S.ContentTypeFile.Negative" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.Negative.style()
            },
            "AiUserMessage.S.ContentTypeFile.Warning" to ComposeStyleReference { AiUserMessage.S.ContentTypeFile.Warning.style() },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.S.ContentTypeFile.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.Xs.Default" to ComposeStyleReference { AiUserMessage.Xs.Default.style() },
            "AiUserMessage.Xs.Secondary" to ComposeStyleReference { AiUserMessage.Xs.Secondary.style() },
            "AiUserMessage.Xs.Accent" to ComposeStyleReference { AiUserMessage.Xs.Accent.style() },
            "AiUserMessage.Xs.Positive" to ComposeStyleReference { AiUserMessage.Xs.Positive.style() },
            "AiUserMessage.Xs.Negative" to ComposeStyleReference { AiUserMessage.Xs.Negative.style() },
            "AiUserMessage.Xs.Warning" to ComposeStyleReference { AiUserMessage.Xs.Warning.style() },
            "AiUserMessage.Xs.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.Xs.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.Xs.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.Xs.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.Xs.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.Xs.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.Xs.ContentViewSecondary.Warning.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.Default" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.Default.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.Secondary" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.Secondary.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.Accent" to ComposeStyleReference { AiUserMessage.Xs.ContentTypeFile.Accent.style() },
            "AiUserMessage.Xs.ContentTypeFile.Positive" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.Positive.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.Negative" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.Negative.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.Warning" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.Warning.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Default" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Default.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Secondary" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Secondary.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Accent" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Accent.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Positive" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Positive.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Negative" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Negative.style()
            },
            "AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Warning" to ComposeStyleReference {
                AiUserMessage.Xs.ContentTypeFile.ContentViewSecondary.Warning.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AiUserMessageStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AiUserMessageSize.Xl
                "L" -> AiUserMessageSize.L
                "M" -> AiUserMessageSize.M
                "S" -> AiUserMessageSize.S
                "Xs" -> AiUserMessageSize.Xs
                else -> AiUserMessageSize.M
            },
            contentType = when (bindings["contentType"]?.toString()) {
                "Image" -> AiUserMessageContentType.Image
                "File" -> AiUserMessageContentType.File
                else -> AiUserMessageContentType.Image
            },
            contentView = when (bindings["contentView"]?.toString()) {
                "Default" -> AiUserMessageContentView.Default
                "Secondary" -> AiUserMessageContentView.Secondary
                else -> AiUserMessageContentView.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> AiUserMessageView.Default
                "Secondary" -> AiUserMessageView.Secondary
                "Accent" -> AiUserMessageView.Accent
                "Positive" -> AiUserMessageView.Positive
                "Negative" -> AiUserMessageView.Negative
                "Warning" -> AiUserMessageView.Warning
                else -> AiUserMessageView.Default
            },
        ).key
    }
}

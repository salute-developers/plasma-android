// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.editable

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.EditableStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiUserMessageEditable : BuilderWrapper<EditableStyle, EditableStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiUserMessageEditableXl(
    public override val builder: EditableStyleBuilder,
) : WrapperAiUserMessageEditable

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiUserMessageEditableL(
    public override val builder: EditableStyleBuilder,
) : WrapperAiUserMessageEditable

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiUserMessageEditableM(
    public override val builder: EditableStyleBuilder,
) : WrapperAiUserMessageEditable

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiUserMessageEditableS(
    public override val builder: EditableStyleBuilder,
) : WrapperAiUserMessageEditable

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiUserMessageEditableXs(
    public override val builder: EditableStyleBuilder,
) : WrapperAiUserMessageEditable

private val EditableStyleBuilder.invariantProps: EditableStyleBuilder
    @Composable
    get() = this
        .colors {
            textColor(SddsServTheme.colors.textDefaultPrimary.asStatefulValue())
            cursorColor(SddsServTheme.colors.textDefaultAccent.asStatefulValue())
        }

public val AiUserMessageEditable.Xl: WrapperAiUserMessageEditableXl
    @Composable
    @JvmName("WrapperAiUserMessageEditableXl")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyLNormal)
        .wrap(::WrapperAiUserMessageEditableXl)

public val AiUserMessageEditable.L: WrapperAiUserMessageEditableL
    @Composable
    @JvmName("WrapperAiUserMessageEditableL")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyLNormal)
        .wrap(::WrapperAiUserMessageEditableL)

public val AiUserMessageEditable.M: WrapperAiUserMessageEditableM
    @Composable
    @JvmName("WrapperAiUserMessageEditableM")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyMNormal)
        .wrap(::WrapperAiUserMessageEditableM)

public val AiUserMessageEditable.S: WrapperAiUserMessageEditableS
    @Composable
    @JvmName("WrapperAiUserMessageEditableS")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodySNormal)
        .wrap(::WrapperAiUserMessageEditableS)

public val AiUserMessageEditable.Xs: WrapperAiUserMessageEditableXs
    @Composable
    @JvmName("WrapperAiUserMessageEditableXs")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyXsNormal)
        .wrap(::WrapperAiUserMessageEditableXs)

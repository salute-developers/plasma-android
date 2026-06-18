// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.iconbadge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperMention : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperMentionTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperMention

public val Mention.MuteNo: WrapperMentionTerminate
    @Composable
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            startContentColor(SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperMentionTerminate)

public val Mention.MuteYes: WrapperMentionTerminate
    @Composable
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultParagraph).asStatefulValue())
            startContentColor(SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperMentionTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .dimensions {
            height(18.0.dp)
            startPadding(1.0.dp)
            endPadding(1.0.dp)
        }

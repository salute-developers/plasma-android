// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBadgeClear : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperBadgeClearDefault(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClear

public val BadgeClear.Default: WrapperBadgeClearDefault
    @Composable
    @JvmName("WrapperBadgeClearDefault")
    get() = BadgeStyle.badgeBuilder(this)
        .wrap(::WrapperBadgeClearDefault)

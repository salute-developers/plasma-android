// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconBadgeClear : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperIconBadgeClearDefault(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

public val IconBadgeClear.Default: WrapperIconBadgeClearDefault
    @Composable
    @JvmName("WrapperIconBadgeClearDefault")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .wrap(::WrapperIconBadgeClearDefault)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.button.link

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperLinkButton : BuilderWrapper<ButtonStyle, LinkButtonStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperLinkButtonDefault(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

public val LinkButton.Default: WrapperLinkButtonDefault
    @Composable
    @JvmName("WrapperLinkButtonDefault")
    get() = ButtonStyle.linkButtonBuilder(this)
        .wrap(::WrapperLinkButtonDefault)

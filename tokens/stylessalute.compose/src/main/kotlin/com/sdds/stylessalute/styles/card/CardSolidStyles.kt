// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.card

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCardSolid : BuilderWrapper<CardStyle, CardStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperCardSolidDefault(
    public override val builder: CardStyleBuilder,
) : WrapperCardSolid

public val CardSolid.Default: WrapperCardSolidDefault
    @Composable
    @JvmName("WrapperCardSolidDefault")
    get() = CardStyle.builder(this)
        .wrap(::WrapperCardSolidDefault)

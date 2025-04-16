// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.radioboxgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.radiobox.M
import com.sdds.plasma.giga.styles.radiobox.RadioBox
import com.sdds.plasma.giga.styles.radiobox.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperRadioBoxGroup :
    BuilderWrapper<RadioBoxGroupStyle, RadioBoxGroupStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperRadioBoxGroupM(
    public override val builder: RadioBoxGroupStyleBuilder,
) : WrapperRadioBoxGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperRadioBoxGroupS(
    public override val builder: RadioBoxGroupStyleBuilder,
) : WrapperRadioBoxGroup

private val RadioBoxGroupStyleBuilder.invariantProps: RadioBoxGroupStyleBuilder
    @Composable
    get() = this

public val RadioBoxGroup.M: WrapperRadioBoxGroupM
    @Composable
    @JvmName("WrapperRadioBoxGroupM")
    get() = RadioBoxGroupStyle.builder(this)
        .invariantProps
        .radioBoxStyle(RadioBox.M.style())
        .dimensions {
            itemSpacing(12.0.dp)
        }
        .wrap(::WrapperRadioBoxGroupM)

public val RadioBoxGroup.S: WrapperRadioBoxGroupS
    @Composable
    @JvmName("WrapperRadioBoxGroupS")
    get() = RadioBoxGroupStyle.builder(this)
        .invariantProps
        .radioBoxStyle(RadioBox.S.style())
        .dimensions {
            itemSpacing(10.0.dp)
        }
        .wrap(::WrapperRadioBoxGroupS)

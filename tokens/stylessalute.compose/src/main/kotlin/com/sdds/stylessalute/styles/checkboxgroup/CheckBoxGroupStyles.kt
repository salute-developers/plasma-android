// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.checkboxgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.checkbox.CheckBox
import com.sdds.stylessalute.styles.checkbox.Default
import com.sdds.stylessalute.styles.checkbox.M
import com.sdds.stylessalute.styles.checkbox.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCheckBoxGroup :
    BuilderWrapper<CheckBoxGroupStyle, CheckBoxGroupStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCheckBoxGroupM(
    public override val builder: CheckBoxGroupStyleBuilder,
) : WrapperCheckBoxGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCheckBoxGroupS(
    public override val builder: CheckBoxGroupStyleBuilder,
) : WrapperCheckBoxGroup

private val CheckBoxGroupStyleBuilder.invariantProps: CheckBoxGroupStyleBuilder
    @Composable
    get() = this

public val CheckBoxGroup.M: WrapperCheckBoxGroupM
    @Composable
    @JvmName("WrapperCheckBoxGroupM")
    get() = CheckBoxGroupStyle.builder(this)
        .invariantProps
        .checkBoxStyle(CheckBox.M.Default.style())
        .dimensions {
            itemSpacing(12.0.dp)
            itemOffset(36.0.dp)
        }
        .wrap(::WrapperCheckBoxGroupM)

public val CheckBoxGroup.S: WrapperCheckBoxGroupS
    @Composable
    @JvmName("WrapperCheckBoxGroupS")
    get() = CheckBoxGroupStyle.builder(this)
        .invariantProps
        .checkBoxStyle(CheckBox.S.Default.style())
        .dimensions {
            itemSpacing(10.0.dp)
            itemOffset(24.0.dp)
        }
        .wrap(::WrapperCheckBoxGroupS)

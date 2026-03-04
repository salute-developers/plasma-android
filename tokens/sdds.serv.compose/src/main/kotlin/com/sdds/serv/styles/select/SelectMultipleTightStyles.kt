// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.select

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xl
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.dropdownmenu.DropdownMenuTight
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemMultipleTight
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.TextField
import com.sdds.serv.styles.textfield.Xl
import com.sdds.serv.styles.textfield.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectMultipleTight : BuilderWrapper<SelectStyle, SelectStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectMultipleTightXl(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectMultipleTightL(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectMultipleTightM(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectMultipleTightS(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectMultipleTightXs(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleTight

private val SelectStyleBuilder.invariantProps: SelectStyleBuilder
    @Composable
    get() = this

public val SelectMultipleTight.Xl: WrapperSelectMultipleTightXl
    @Composable
    @JvmName("WrapperSelectMultipleTightXl")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .buttonStyle(BasicButton.Xl.Secondary.style())
        .selectItemStyle(SelectItemMultipleTight.Xl.style())
        .dropdownStyle(DropdownMenuTight.Xl.style())
        .wrap(::WrapperSelectMultipleTightXl)

public val SelectMultipleTight.L: WrapperSelectMultipleTightL
    @Composable
    @JvmName("WrapperSelectMultipleTightL")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .buttonStyle(BasicButton.L.Secondary.style())
        .selectItemStyle(SelectItemMultipleTight.L.style())
        .dropdownStyle(DropdownMenuTight.L.style())
        .wrap(::WrapperSelectMultipleTightL)

public val SelectMultipleTight.M: WrapperSelectMultipleTightM
    @Composable
    @JvmName("WrapperSelectMultipleTightM")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .buttonStyle(BasicButton.M.Secondary.style())
        .selectItemStyle(SelectItemMultipleTight.M.style())
        .dropdownStyle(DropdownMenuTight.M.style())
        .wrap(::WrapperSelectMultipleTightM)

public val SelectMultipleTight.S: WrapperSelectMultipleTightS
    @Composable
    @JvmName("WrapperSelectMultipleTightS")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .buttonStyle(BasicButton.S.Secondary.style())
        .selectItemStyle(SelectItemMultipleTight.S.style())
        .dropdownStyle(DropdownMenuTight.S.style())
        .wrap(::WrapperSelectMultipleTightS)

public val SelectMultipleTight.Xs: WrapperSelectMultipleTightXs
    @Composable
    @JvmName("WrapperSelectMultipleTightXs")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .buttonStyle(BasicButton.Xs.Secondary.style())
        .selectItemStyle(SelectItemMultipleTight.Xs.style())
        .dropdownStyle(DropdownMenuTight.Xs.style())
        .wrap(::WrapperSelectMultipleTightXs)

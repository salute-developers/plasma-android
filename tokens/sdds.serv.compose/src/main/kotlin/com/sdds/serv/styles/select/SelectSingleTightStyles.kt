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
import com.sdds.serv.styles.selectitem.SelectItemSingleTight
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
public interface WrapperSelectSingleTight : BuilderWrapper<SelectStyle, SelectStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectSingleTightXl(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectSingleTightL(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectSingleTightM(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectSingleTightS(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectSingleTightXs(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleTight

private val SelectStyleBuilder.invariantProps: SelectStyleBuilder
    @Composable
    get() = this

public val SelectSingleTight.Xl: WrapperSelectSingleTightXl
    @Composable
    @JvmName("WrapperSelectSingleTightXl")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .buttonStyle(BasicButton.Xl.Secondary.style())
        .selectItemStyle(SelectItemSingleTight.Xl.style())
        .dropdownStyle(DropdownMenuTight.Xl.style())
        .wrap(::WrapperSelectSingleTightXl)

public val SelectSingleTight.L: WrapperSelectSingleTightL
    @Composable
    @JvmName("WrapperSelectSingleTightL")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .buttonStyle(BasicButton.L.Secondary.style())
        .selectItemStyle(SelectItemSingleTight.L.style())
        .dropdownStyle(DropdownMenuTight.L.style())
        .wrap(::WrapperSelectSingleTightL)

public val SelectSingleTight.M: WrapperSelectSingleTightM
    @Composable
    @JvmName("WrapperSelectSingleTightM")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .buttonStyle(BasicButton.M.Secondary.style())
        .selectItemStyle(SelectItemSingleTight.M.style())
        .dropdownStyle(DropdownMenuTight.M.style())
        .wrap(::WrapperSelectSingleTightM)

public val SelectSingleTight.S: WrapperSelectSingleTightS
    @Composable
    @JvmName("WrapperSelectSingleTightS")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .buttonStyle(BasicButton.S.Secondary.style())
        .selectItemStyle(SelectItemSingleTight.S.style())
        .dropdownStyle(DropdownMenuTight.S.style())
        .wrap(::WrapperSelectSingleTightS)

public val SelectSingleTight.Xs: WrapperSelectSingleTightXs
    @Composable
    @JvmName("WrapperSelectSingleTightXs")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .buttonStyle(BasicButton.Xs.Secondary.style())
        .selectItemStyle(SelectItemSingleTight.Xs.style())
        .dropdownStyle(DropdownMenuTight.Xs.style())
        .wrap(::WrapperSelectSingleTightXs)

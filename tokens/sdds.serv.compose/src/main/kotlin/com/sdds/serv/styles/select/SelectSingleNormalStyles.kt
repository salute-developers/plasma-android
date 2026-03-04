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
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingleNormal
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
public interface WrapperSelectSingleNormal : BuilderWrapper<SelectStyle, SelectStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectSingleNormalXl(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectSingleNormalL(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectSingleNormalM(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectSingleNormalS(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectSingleNormalXs(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectSingleNormal

private val SelectStyleBuilder.invariantProps: SelectStyleBuilder
    @Composable
    get() = this

public val SelectSingleNormal.Xl: WrapperSelectSingleNormalXl
    @Composable
    @JvmName("WrapperSelectSingleNormalXl")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .buttonStyle(BasicButton.Xl.Secondary.style())
        .selectItemStyle(SelectItemSingleNormal.Xl.style())
        .dropdownStyle(DropdownMenuNormal.Xl.style())
        .wrap(::WrapperSelectSingleNormalXl)

public val SelectSingleNormal.L: WrapperSelectSingleNormalL
    @Composable
    @JvmName("WrapperSelectSingleNormalL")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .buttonStyle(BasicButton.L.Secondary.style())
        .selectItemStyle(SelectItemSingleNormal.L.style())
        .dropdownStyle(DropdownMenuNormal.L.style())
        .wrap(::WrapperSelectSingleNormalL)

public val SelectSingleNormal.M: WrapperSelectSingleNormalM
    @Composable
    @JvmName("WrapperSelectSingleNormalM")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .buttonStyle(BasicButton.M.Secondary.style())
        .selectItemStyle(SelectItemSingleNormal.M.style())
        .dropdownStyle(DropdownMenuNormal.M.style())
        .wrap(::WrapperSelectSingleNormalM)

public val SelectSingleNormal.S: WrapperSelectSingleNormalS
    @Composable
    @JvmName("WrapperSelectSingleNormalS")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .buttonStyle(BasicButton.S.Secondary.style())
        .selectItemStyle(SelectItemSingleNormal.S.style())
        .dropdownStyle(DropdownMenuNormal.S.style())
        .wrap(::WrapperSelectSingleNormalS)

public val SelectSingleNormal.Xs: WrapperSelectSingleNormalXs
    @Composable
    @JvmName("WrapperSelectSingleNormalXs")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .buttonStyle(BasicButton.Xs.Secondary.style())
        .selectItemStyle(SelectItemSingleNormal.Xs.style())
        .dropdownStyle(DropdownMenuNormal.Xs.style())
        .wrap(::WrapperSelectSingleNormalXs)

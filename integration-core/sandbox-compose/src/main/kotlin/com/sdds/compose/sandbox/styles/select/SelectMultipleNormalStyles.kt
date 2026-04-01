// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.select

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.styles.basicbutton.BasicButton
import com.sdds.compose.sandbox.styles.basicbutton.L
import com.sdds.compose.sandbox.styles.basicbutton.M
import com.sdds.compose.sandbox.styles.basicbutton.S
import com.sdds.compose.sandbox.styles.basicbutton.Secondary
import com.sdds.compose.sandbox.styles.basicbutton.Xl
import com.sdds.compose.sandbox.styles.basicbutton.Xs
import com.sdds.compose.sandbox.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.compose.sandbox.styles.dropdownmenu.L
import com.sdds.compose.sandbox.styles.dropdownmenu.M
import com.sdds.compose.sandbox.styles.dropdownmenu.S
import com.sdds.compose.sandbox.styles.dropdownmenu.Xl
import com.sdds.compose.sandbox.styles.dropdownmenu.Xs
import com.sdds.compose.sandbox.styles.selectitem.L
import com.sdds.compose.sandbox.styles.selectitem.M
import com.sdds.compose.sandbox.styles.selectitem.S
import com.sdds.compose.sandbox.styles.selectitem.SelectItemMultipleNormal
import com.sdds.compose.sandbox.styles.selectitem.Xl
import com.sdds.compose.sandbox.styles.selectitem.Xs
import com.sdds.compose.sandbox.styles.textfield.Default
import com.sdds.compose.sandbox.styles.textfield.L
import com.sdds.compose.sandbox.styles.textfield.M
import com.sdds.compose.sandbox.styles.textfield.S
import com.sdds.compose.sandbox.styles.textfield.TextField
import com.sdds.compose.sandbox.styles.textfield.Xl
import com.sdds.compose.sandbox.styles.textfield.Xs
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectMultipleNormal : BuilderWrapper<SelectStyle, SelectStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectMultipleNormalXl(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectMultipleNormalL(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectMultipleNormalM(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectMultipleNormalS(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectMultipleNormalXs(
    public override val builder: SelectStyleBuilder,
) : WrapperSelectMultipleNormal

private val SelectStyleBuilder.invariantProps: SelectStyleBuilder
    @Composable
    get() = this

public val SelectMultipleNormal.Xl: WrapperSelectMultipleNormalXl
    @Composable
    @JvmName("WrapperSelectMultipleNormalXl")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .buttonStyle(BasicButton.Xl.Secondary.style())
        .selectItemStyle(SelectItemMultipleNormal.Xl.style())
        .dropdownStyle(DropdownMenuNormal.Xl.style())
        .wrap(::WrapperSelectMultipleNormalXl)

public val SelectMultipleNormal.L: WrapperSelectMultipleNormalL
    @Composable
    @JvmName("WrapperSelectMultipleNormalL")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .buttonStyle(BasicButton.L.Secondary.style())
        .selectItemStyle(SelectItemMultipleNormal.L.style())
        .dropdownStyle(DropdownMenuNormal.L.style())
        .wrap(::WrapperSelectMultipleNormalL)

public val SelectMultipleNormal.M: WrapperSelectMultipleNormalM
    @Composable
    @JvmName("WrapperSelectMultipleNormalM")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .buttonStyle(BasicButton.M.Secondary.style())
        .selectItemStyle(SelectItemMultipleNormal.M.style())
        .dropdownStyle(DropdownMenuNormal.M.style())
        .wrap(::WrapperSelectMultipleNormalM)

public val SelectMultipleNormal.S: WrapperSelectMultipleNormalS
    @Composable
    @JvmName("WrapperSelectMultipleNormalS")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .buttonStyle(BasicButton.S.Secondary.style())
        .selectItemStyle(SelectItemMultipleNormal.S.style())
        .dropdownStyle(DropdownMenuNormal.S.style())
        .wrap(::WrapperSelectMultipleNormalS)

public val SelectMultipleNormal.Xs: WrapperSelectMultipleNormalXs
    @Composable
    @JvmName("WrapperSelectMultipleNormalXs")
    get() = SelectStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .buttonStyle(BasicButton.Xs.Secondary.style())
        .selectItemStyle(SelectItemMultipleNormal.Xs.style())
        .dropdownStyle(DropdownMenuNormal.Xs.style())
        .wrap(::WrapperSelectMultipleNormalXs)

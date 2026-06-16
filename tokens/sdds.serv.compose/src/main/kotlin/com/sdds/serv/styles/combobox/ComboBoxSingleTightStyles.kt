// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.combobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
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
public interface WrapperComboBoxSingleTight : BuilderWrapper<ComboBoxStyle, ComboBoxStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperComboBoxSingleTightXl(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperComboBoxSingleTightL(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperComboBoxSingleTightM(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperComboBoxSingleTightS(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperComboBoxSingleTightXs(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleTight

private val ComboBoxStyleBuilder.invariantProps: ComboBoxStyleBuilder
    @Composable
    get() = this

public val ComboBoxSingleTight.Xl: WrapperComboBoxSingleTightXl
    @Composable
    @JvmName("WrapperComboBoxSingleTightXl")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .dropdownStyle(DropdownMenuTight.Xl.style())
        .selectItemStyle(SelectItemSingleTight.Xl.style())
        .wrap(::WrapperComboBoxSingleTightXl)

public val ComboBoxSingleTight.L: WrapperComboBoxSingleTightL
    @Composable
    @JvmName("WrapperComboBoxSingleTightL")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .dropdownStyle(DropdownMenuTight.L.style())
        .selectItemStyle(SelectItemSingleTight.L.style())
        .wrap(::WrapperComboBoxSingleTightL)

public val ComboBoxSingleTight.M: WrapperComboBoxSingleTightM
    @Composable
    @JvmName("WrapperComboBoxSingleTightM")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .dropdownStyle(DropdownMenuTight.M.style())
        .selectItemStyle(SelectItemSingleTight.M.style())
        .wrap(::WrapperComboBoxSingleTightM)

public val ComboBoxSingleTight.S: WrapperComboBoxSingleTightS
    @Composable
    @JvmName("WrapperComboBoxSingleTightS")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .dropdownStyle(DropdownMenuTight.S.style())
        .selectItemStyle(SelectItemSingleTight.S.style())
        .wrap(::WrapperComboBoxSingleTightS)

public val ComboBoxSingleTight.Xs: WrapperComboBoxSingleTightXs
    @Composable
    @JvmName("WrapperComboBoxSingleTightXs")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .dropdownStyle(DropdownMenuTight.Xs.style())
        .selectItemStyle(SelectItemSingleTight.Xs.style())
        .wrap(::WrapperComboBoxSingleTightXs)

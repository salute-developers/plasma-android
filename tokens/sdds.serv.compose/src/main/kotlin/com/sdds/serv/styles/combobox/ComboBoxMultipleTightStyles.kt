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
public interface WrapperComboBoxMultipleTight : BuilderWrapper<ComboBoxStyle, ComboBoxStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperComboBoxMultipleTightXl(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperComboBoxMultipleTightL(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperComboBoxMultipleTightM(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperComboBoxMultipleTightS(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperComboBoxMultipleTightXs(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleTight

private val ComboBoxStyleBuilder.invariantProps: ComboBoxStyleBuilder
    @Composable
    get() = this

public val ComboBoxMultipleTight.Xl: WrapperComboBoxMultipleTightXl
    @Composable
    @JvmName("WrapperComboBoxMultipleTightXl")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .selectItemStyle(SelectItemMultipleTight.Xl.style())
        .dropdownStyle(DropdownMenuTight.Xl.style())
        .wrap(::WrapperComboBoxMultipleTightXl)

public val ComboBoxMultipleTight.L: WrapperComboBoxMultipleTightL
    @Composable
    @JvmName("WrapperComboBoxMultipleTightL")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .selectItemStyle(SelectItemMultipleTight.L.style())
        .dropdownStyle(DropdownMenuTight.L.style())
        .wrap(::WrapperComboBoxMultipleTightL)

public val ComboBoxMultipleTight.M: WrapperComboBoxMultipleTightM
    @Composable
    @JvmName("WrapperComboBoxMultipleTightM")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .selectItemStyle(SelectItemMultipleTight.M.style())
        .dropdownStyle(DropdownMenuTight.M.style())
        .wrap(::WrapperComboBoxMultipleTightM)

public val ComboBoxMultipleTight.S: WrapperComboBoxMultipleTightS
    @Composable
    @JvmName("WrapperComboBoxMultipleTightS")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .selectItemStyle(SelectItemMultipleTight.S.style())
        .dropdownStyle(DropdownMenuTight.S.style())
        .wrap(::WrapperComboBoxMultipleTightS)

public val ComboBoxMultipleTight.Xs: WrapperComboBoxMultipleTightXs
    @Composable
    @JvmName("WrapperComboBoxMultipleTightXs")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .selectItemStyle(SelectItemMultipleTight.Xs.style())
        .dropdownStyle(DropdownMenuTight.Xs.style())
        .wrap(::WrapperComboBoxMultipleTightXs)

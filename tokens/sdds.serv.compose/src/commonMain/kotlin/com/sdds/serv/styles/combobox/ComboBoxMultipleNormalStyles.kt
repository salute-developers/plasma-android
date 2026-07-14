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
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemMultipleNormal
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
public interface WrapperComboBoxMultipleNormal : BuilderWrapper<ComboBoxStyle, ComboBoxStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperComboBoxMultipleNormalXl(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperComboBoxMultipleNormalL(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperComboBoxMultipleNormalM(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperComboBoxMultipleNormalS(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperComboBoxMultipleNormalXs(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxMultipleNormal

private val ComboBoxStyleBuilder.invariantProps: ComboBoxStyleBuilder
    @Composable
    get() = this

public val ComboBoxMultipleNormal.Xl: WrapperComboBoxMultipleNormalXl
    @Composable
    @JvmName("WrapperComboBoxMultipleNormalXl")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xl.style())
        .selectItemStyle(SelectItemMultipleNormal.Xl.style())
        .wrap(::WrapperComboBoxMultipleNormalXl)

public val ComboBoxMultipleNormal.L: WrapperComboBoxMultipleNormalL
    @Composable
    @JvmName("WrapperComboBoxMultipleNormalL")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .dropdownStyle(DropdownMenuNormal.L.style())
        .selectItemStyle(SelectItemMultipleNormal.L.style())
        .wrap(::WrapperComboBoxMultipleNormalL)

public val ComboBoxMultipleNormal.M: WrapperComboBoxMultipleNormalM
    @Composable
    @JvmName("WrapperComboBoxMultipleNormalM")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .dropdownStyle(DropdownMenuNormal.M.style())
        .selectItemStyle(SelectItemMultipleNormal.M.style())
        .wrap(::WrapperComboBoxMultipleNormalM)

public val ComboBoxMultipleNormal.S: WrapperComboBoxMultipleNormalS
    @Composable
    @JvmName("WrapperComboBoxMultipleNormalS")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .dropdownStyle(DropdownMenuNormal.S.style())
        .selectItemStyle(SelectItemMultipleNormal.S.style())
        .wrap(::WrapperComboBoxMultipleNormalS)

public val ComboBoxMultipleNormal.Xs: WrapperComboBoxMultipleNormalXs
    @Composable
    @JvmName("WrapperComboBoxMultipleNormalXs")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xs.style())
        .selectItemStyle(SelectItemMultipleNormal.Xs.style())
        .wrap(::WrapperComboBoxMultipleNormalXs)

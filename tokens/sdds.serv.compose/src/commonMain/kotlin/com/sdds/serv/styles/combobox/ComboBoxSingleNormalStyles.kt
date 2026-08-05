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
public interface WrapperComboBoxSingleNormal : BuilderWrapper<ComboBoxStyle, ComboBoxStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperComboBoxSingleNormalXl(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperComboBoxSingleNormalL(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperComboBoxSingleNormalM(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperComboBoxSingleNormalS(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperComboBoxSingleNormalXs(
    public override val builder: ComboBoxStyleBuilder,
) : WrapperComboBoxSingleNormal

private val ComboBoxStyleBuilder.invariantProps: ComboBoxStyleBuilder
    @Composable
    get() = this

public val ComboBoxSingleNormal.Xl: WrapperComboBoxSingleNormalXl
    @Composable
    @JvmName("WrapperComboBoxSingleNormalXl")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xl.style())
        .selectItemStyle(SelectItemSingleNormal.Xl.style())
        .wrap(::WrapperComboBoxSingleNormalXl)

public val ComboBoxSingleNormal.L: WrapperComboBoxSingleNormalL
    @Composable
    @JvmName("WrapperComboBoxSingleNormalL")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .dropdownStyle(DropdownMenuNormal.L.style())
        .selectItemStyle(SelectItemSingleNormal.L.style())
        .wrap(::WrapperComboBoxSingleNormalL)

public val ComboBoxSingleNormal.M: WrapperComboBoxSingleNormalM
    @Composable
    @JvmName("WrapperComboBoxSingleNormalM")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .dropdownStyle(DropdownMenuNormal.M.style())
        .selectItemStyle(SelectItemSingleNormal.M.style())
        .wrap(::WrapperComboBoxSingleNormalM)

public val ComboBoxSingleNormal.S: WrapperComboBoxSingleNormalS
    @Composable
    @JvmName("WrapperComboBoxSingleNormalS")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .dropdownStyle(DropdownMenuNormal.S.style())
        .selectItemStyle(SelectItemSingleNormal.S.style())
        .wrap(::WrapperComboBoxSingleNormalS)

public val ComboBoxSingleNormal.Xs: WrapperComboBoxSingleNormalXs
    @Composable
    @JvmName("WrapperComboBoxSingleNormalXs")
    get() = ComboBoxStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xs.style())
        .selectItemStyle(SelectItemSingleNormal.Xs.style())
        .wrap(::WrapperComboBoxSingleNormalXs)

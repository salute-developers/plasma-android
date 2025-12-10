// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.autocomplete

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.AutocompleteStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.sd.service.styles.dropdownmenu.L
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.S
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xl
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xs
import com.sdds.plasma.sd.service.styles.textfield.Default
import com.sdds.plasma.sd.service.styles.textfield.L
import com.sdds.plasma.sd.service.styles.textfield.M
import com.sdds.plasma.sd.service.styles.textfield.S
import com.sdds.plasma.sd.service.styles.textfield.TextField
import com.sdds.plasma.sd.service.styles.textfield.Xl
import com.sdds.plasma.sd.service.styles.textfield.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAutocompleteNormal :
    BuilderWrapper<AutocompleteStyle, AutocompleteStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAutocompleteNormalXl(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAutocompleteNormalL(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAutocompleteNormalM(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAutocompleteNormalS(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAutocompleteNormalXs(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteNormal

private val AutocompleteStyleBuilder.invariantProps: AutocompleteStyleBuilder
    @Composable
    get() = this

public val AutocompleteNormal.Xl: WrapperAutocompleteNormalXl
    @Composable
    @JvmName("WrapperAutocompleteNormalXl")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xl.style())
        .wrap(::WrapperAutocompleteNormalXl)

public val AutocompleteNormal.L: WrapperAutocompleteNormalL
    @Composable
    @JvmName("WrapperAutocompleteNormalL")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .dropdownStyle(DropdownMenuNormal.L.style())
        .wrap(::WrapperAutocompleteNormalL)

public val AutocompleteNormal.M: WrapperAutocompleteNormalM
    @Composable
    @JvmName("WrapperAutocompleteNormalM")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .dropdownStyle(DropdownMenuNormal.M.style())
        .wrap(::WrapperAutocompleteNormalM)

public val AutocompleteNormal.S: WrapperAutocompleteNormalS
    @Composable
    @JvmName("WrapperAutocompleteNormalS")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .dropdownStyle(DropdownMenuNormal.S.style())
        .wrap(::WrapperAutocompleteNormalS)

public val AutocompleteNormal.Xs: WrapperAutocompleteNormalXs
    @Composable
    @JvmName("WrapperAutocompleteNormalXs")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .dropdownStyle(DropdownMenuNormal.Xs.style())
        .wrap(::WrapperAutocompleteNormalXs)

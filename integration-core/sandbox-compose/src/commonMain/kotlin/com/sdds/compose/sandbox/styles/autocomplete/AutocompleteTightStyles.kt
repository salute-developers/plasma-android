// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.autocomplete

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.styles.dropdownmenu.DropdownMenuTight
import com.sdds.compose.sandbox.styles.dropdownmenu.L
import com.sdds.compose.sandbox.styles.dropdownmenu.M
import com.sdds.compose.sandbox.styles.dropdownmenu.S
import com.sdds.compose.sandbox.styles.dropdownmenu.Xl
import com.sdds.compose.sandbox.styles.dropdownmenu.Xs
import com.sdds.compose.sandbox.styles.textfield.Default
import com.sdds.compose.sandbox.styles.textfield.L
import com.sdds.compose.sandbox.styles.textfield.M
import com.sdds.compose.sandbox.styles.textfield.S
import com.sdds.compose.sandbox.styles.textfield.TextField
import com.sdds.compose.sandbox.styles.textfield.Xl
import com.sdds.compose.sandbox.styles.textfield.Xs
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.AutocompleteStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAutocompleteTight :
    BuilderWrapper<AutocompleteStyle, AutocompleteStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAutocompleteTightXl(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAutocompleteTightL(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAutocompleteTightM(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAutocompleteTightS(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAutocompleteTightXs(
    public override val builder: AutocompleteStyleBuilder,
) : WrapperAutocompleteTight

private val AutocompleteStyleBuilder.invariantProps: AutocompleteStyleBuilder
    @Composable
    get() = this

public val AutocompleteTight.Xl: WrapperAutocompleteTightXl
    @Composable
    @JvmName("WrapperAutocompleteTightXl")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xl.Default.style())
        .dropdownStyle(DropdownMenuTight.Xl.style())
        .wrap(::WrapperAutocompleteTightXl)

public val AutocompleteTight.L: WrapperAutocompleteTightL
    @Composable
    @JvmName("WrapperAutocompleteTightL")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.L.Default.style())
        .dropdownStyle(DropdownMenuTight.L.style())
        .wrap(::WrapperAutocompleteTightL)

public val AutocompleteTight.M: WrapperAutocompleteTightM
    @Composable
    @JvmName("WrapperAutocompleteTightM")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.M.Default.style())
        .dropdownStyle(DropdownMenuTight.M.style())
        .wrap(::WrapperAutocompleteTightM)

public val AutocompleteTight.S: WrapperAutocompleteTightS
    @Composable
    @JvmName("WrapperAutocompleteTightS")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.S.Default.style())
        .dropdownStyle(DropdownMenuTight.S.style())
        .wrap(::WrapperAutocompleteTightS)

public val AutocompleteTight.Xs: WrapperAutocompleteTightXs
    @Composable
    @JvmName("WrapperAutocompleteTightXs")
    get() = AutocompleteStyle.builder(this)
        .invariantProps
        .textFieldStyle(TextField.Xs.Default.style())
        .dropdownStyle(DropdownMenuTight.Xs.style())
        .wrap(::WrapperAutocompleteTightXs)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.select

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.basicbutton.Xs
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.L
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.dropdownmenu.S
import com.sdkit.star.designsystem.styles.dropdownmenu.Xs
import com.sdkit.star.designsystem.styles.selectitem.L
import com.sdkit.star.designsystem.styles.selectitem.M
import com.sdkit.star.designsystem.styles.selectitem.S
import com.sdkit.star.designsystem.styles.selectitem.SelectItem
import com.sdkit.star.designsystem.styles.selectitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelect : BuilderWrapper<SelectStyle, SelectStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectL(
    public override val builder: SelectStyleBuilder,
) : WrapperSelect

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectM(
    public override val builder: SelectStyleBuilder,
) : WrapperSelect

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectS(
    public override val builder: SelectStyleBuilder,
) : WrapperSelect

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectXs(
    public override val builder: SelectStyleBuilder,
) : WrapperSelect

private val SelectStyleBuilder.invariantProps: SelectStyleBuilder
    @Composable
    get() = this

public val Select.L: WrapperSelectL
    @Composable
    @JvmName("WrapperSelectL")
    get() = SelectStyle.builder(this)
        .invariantProps
        .buttonStyle(BasicButton.L.Default.style())
        .selectItemStyle(SelectItem.L.style())
        .dropdownStyle(DropdownMenu.L.style())
        .wrap(::WrapperSelectL)

public val Select.M: WrapperSelectM
    @Composable
    @JvmName("WrapperSelectM")
    get() = SelectStyle.builder(this)
        .invariantProps
        .buttonStyle(BasicButton.M.Default.style())
        .selectItemStyle(SelectItem.M.style())
        .dropdownStyle(DropdownMenu.M.style())
        .wrap(::WrapperSelectM)

public val Select.S: WrapperSelectS
    @Composable
    @JvmName("WrapperSelectS")
    get() = SelectStyle.builder(this)
        .invariantProps
        .buttonStyle(BasicButton.S.Default.style())
        .selectItemStyle(SelectItem.S.style())
        .dropdownStyle(DropdownMenu.S.style())
        .wrap(::WrapperSelectS)

public val Select.Xs: WrapperSelectXs
    @Composable
    @JvmName("WrapperSelectXs")
    get() = SelectStyle.builder(this)
        .invariantProps
        .buttonStyle(BasicButton.Xs.Default.style())
        .selectItemStyle(SelectItem.Xs.style())
        .dropdownStyle(DropdownMenu.Xs.style())
        .wrap(::WrapperSelectXs)

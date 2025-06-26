// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.divider.Default
import com.sdds.plasma.giga.styles.divider.Divider
import com.sdds.plasma.giga.styles.list.DropdownMenuListTight
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuTight :
    BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuTightXl(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuTightL(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuTightM(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuTightS(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuTightXs(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

private val DropdownMenuStyleBuilder.invariantProps: DropdownMenuStyleBuilder
    @Composable
    get() = this
        .shadow(PlasmaGigaTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .dimensions {
            offset(8.0.dp)
        }
        .dividerStyle(Divider.Default.style())

public val DropdownMenuTight.Xl: WrapperDropdownMenuTightXl
    @Composable
    @JvmName("WrapperDropdownMenuTightXl")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL)
        .dimensions {
            width(200.0.dp)
        }
        .listStyle(DropdownMenuListTight.Xl.style())
        .wrap(::WrapperDropdownMenuTightXl)

public val DropdownMenuTight.L: WrapperDropdownMenuTightL
    @Composable
    @JvmName("WrapperDropdownMenuTightL")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            width(200.0.dp)
        }
        .listStyle(DropdownMenuListTight.L.style())
        .wrap(::WrapperDropdownMenuTightL)

public val DropdownMenuTight.M: WrapperDropdownMenuTightM
    @Composable
    @JvmName("WrapperDropdownMenuTightM")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM)
        .dimensions {
            width(200.0.dp)
        }
        .listStyle(DropdownMenuListTight.M.style())
        .wrap(::WrapperDropdownMenuTightM)

public val DropdownMenuTight.S: WrapperDropdownMenuTightS
    @Composable
    @JvmName("WrapperDropdownMenuTightS")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            width(160.0.dp)
        }
        .listStyle(DropdownMenuListTight.S.style())
        .wrap(::WrapperDropdownMenuTightS)

public val DropdownMenuTight.Xs: WrapperDropdownMenuTightXs
    @Composable
    @JvmName("WrapperDropdownMenuTightXs")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundS)
        .dimensions {
            width(160.0.dp)
        }
        .listStyle(DropdownMenuListTight.Xs.style())
        .wrap(::WrapperDropdownMenuTightXs)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.tabs

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.divider.Default
import com.sdds.serv.styles.divider.Divider
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.Xs
import com.sdds.serv.styles.tabitem.Horizontal
import com.sdds.serv.styles.tabitem.L
import com.sdds.serv.styles.tabitem.M
import com.sdds.serv.styles.tabitem.S
import com.sdds.serv.styles.tabitem.TabItemDefault
import com.sdds.serv.styles.tabitem.Vertical
import com.sdds.serv.styles.tabitem.Xs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabsDefault : BuilderWrapper<TabsStyle, TabsStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabsDefaultL(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации LVertical
 */
@JvmInline
public value class WrapperTabsDefaultLVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации LHorizontal
 */
@JvmInline
public value class WrapperTabsDefaultLHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabsDefaultM(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации MVertical
 */
@JvmInline
public value class WrapperTabsDefaultMVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации MHorizontal
 */
@JvmInline
public value class WrapperTabsDefaultMHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTabsDefaultS(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации SVertical
 */
@JvmInline
public value class WrapperTabsDefaultSVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации SHorizontal
 */
@JvmInline
public value class WrapperTabsDefaultSHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTabsDefaultXs(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации XsVertical
 */
@JvmInline
public value class WrapperTabsDefaultXsVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

/**
 * Обертка для вариации XsHorizontal
 */
@JvmInline
public value class WrapperTabsDefaultXsHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsDefault

private val TabsStyleBuilder.invariantProps: TabsStyleBuilder
    @Composable
    get() = this
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            overflowNextIconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            overflowPrevIconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            indicatorThickness(2.0.dp)
        }
        .dividerStyle(Divider.Default.style())
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
        .dividerEnabled(true)
        .indicatorEnabled(true)

public val TabsDefault.L: WrapperTabsDefaultL
    @Composable
    @JvmName("WrapperTabsDefaultL")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemDefault.L.style())
        .dropdownMenuStyle(DropdownMenuNormal.L.style())
        .disclosureTextStyle(SddsServTheme.typography.bodyLBold)
        .wrap(::WrapperTabsDefaultL)

public val WrapperTabsDefaultL.Vertical: WrapperTabsDefaultLVertical
    @Composable
    @JvmName("WrapperTabsDefaultLVertical")
    get() = builder
        .dimensions {
            minSpacing(0.0.dp)
        }
        .tabItemStyle(TabItemDefault.L.Vertical.style())
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperTabsDefaultLVertical)

public val WrapperTabsDefaultL.Horizontal: WrapperTabsDefaultLHorizontal
    @Composable
    @JvmName("WrapperTabsDefaultLHorizontal")
    get() = builder
        .dimensions {
            minSpacing(28.0.dp)
        }
        .tabItemStyle(TabItemDefault.L.Horizontal.style())
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperTabsDefaultLHorizontal)

public val TabsDefault.M: WrapperTabsDefaultM
    @Composable
    @JvmName("WrapperTabsDefaultM")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemDefault.M.style())
        .dropdownMenuStyle(DropdownMenuNormal.M.style())
        .disclosureTextStyle(SddsServTheme.typography.bodyMBold)
        .wrap(::WrapperTabsDefaultM)

public val WrapperTabsDefaultM.Vertical: WrapperTabsDefaultMVertical
    @Composable
    @JvmName("WrapperTabsDefaultMVertical")
    get() = builder
        .dimensions {
            minSpacing(0.0.dp)
        }
        .tabItemStyle(TabItemDefault.M.Vertical.style())
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperTabsDefaultMVertical)

public val WrapperTabsDefaultM.Horizontal: WrapperTabsDefaultMHorizontal
    @Composable
    @JvmName("WrapperTabsDefaultMHorizontal")
    get() = builder
        .dimensions {
            minSpacing(28.0.dp)
        }
        .tabItemStyle(TabItemDefault.M.Horizontal.style())
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperTabsDefaultMHorizontal)

public val TabsDefault.S: WrapperTabsDefaultS
    @Composable
    @JvmName("WrapperTabsDefaultS")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemDefault.M.style())
        .dropdownMenuStyle(DropdownMenuNormal.M.style())
        .disclosureTextStyle(SddsServTheme.typography.bodyMBold)
        .wrap(::WrapperTabsDefaultS)

public val WrapperTabsDefaultS.Vertical: WrapperTabsDefaultSVertical
    @Composable
    @JvmName("WrapperTabsDefaultSVertical")
    get() = builder
        .dimensions {
            minSpacing(0.0.dp)
        }
        .tabItemStyle(TabItemDefault.S.Vertical.style())
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperTabsDefaultSVertical)

public val WrapperTabsDefaultS.Horizontal: WrapperTabsDefaultSHorizontal
    @Composable
    @JvmName("WrapperTabsDefaultSHorizontal")
    get() = builder
        .dimensions {
            minSpacing(28.0.dp)
        }
        .tabItemStyle(TabItemDefault.S.Horizontal.style())
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperTabsDefaultSHorizontal)

public val TabsDefault.Xs: WrapperTabsDefaultXs
    @Composable
    @JvmName("WrapperTabsDefaultXs")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemDefault.Xs.style())
        .dropdownMenuStyle(DropdownMenuNormal.Xs.style())
        .disclosureTextStyle(SddsServTheme.typography.bodyXsBold)
        .wrap(::WrapperTabsDefaultXs)

public val WrapperTabsDefaultXs.Vertical: WrapperTabsDefaultXsVertical
    @Composable
    @JvmName("WrapperTabsDefaultXsVertical")
    get() = builder
        .dimensions {
            minSpacing(0.0.dp)
        }
        .tabItemStyle(TabItemDefault.Xs.Vertical.style())
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperTabsDefaultXsVertical)

public val WrapperTabsDefaultXs.Horizontal: WrapperTabsDefaultXsHorizontal
    @Composable
    @JvmName("WrapperTabsDefaultXsHorizontal")
    get() = builder
        .dimensions {
            minSpacing(28.0.dp)
        }
        .tabItemStyle(TabItemDefault.Xs.Horizontal.style())
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperTabsDefaultXsHorizontal)

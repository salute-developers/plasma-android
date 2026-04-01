// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.tabs

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.divider.Default
import com.sdds.compose.sandbox.styles.divider.Divider
import com.sdds.compose.sandbox.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.compose.sandbox.styles.dropdownmenu.L
import com.sdds.compose.sandbox.styles.dropdownmenu.M
import com.sdds.compose.sandbox.styles.dropdownmenu.Xs
import com.sdds.compose.sandbox.styles.icontabitem.IconTabItem
import com.sdds.compose.sandbox.styles.icontabitem.L
import com.sdds.compose.sandbox.styles.icontabitem.M
import com.sdds.compose.sandbox.styles.icontabitem.Xs
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconTabs : BuilderWrapper<TabsStyle, TabsStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconTabsL(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации LVertical
 */
@JvmInline
public value class WrapperIconTabsLVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации LHorizontal
 */
@JvmInline
public value class WrapperIconTabsLHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconTabsM(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации MVertical
 */
@JvmInline
public value class WrapperIconTabsMVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации MHorizontal
 */
@JvmInline
public value class WrapperIconTabsMHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconTabsS(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации SVertical
 */
@JvmInline
public value class WrapperIconTabsSVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации SHorizontal
 */
@JvmInline
public value class WrapperIconTabsSHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconTabsXs(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации XsVertical
 */
@JvmInline
public value class WrapperIconTabsXsVertical(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

/**
 * Обертка для вариации XsHorizontal
 */
@JvmInline
public value class WrapperIconTabsXsHorizontal(
    public override val builder: TabsStyleBuilder,
) : WrapperIconTabs

private val TabsStyleBuilder.invariantProps: TabsStyleBuilder
    @Composable
    get() = this
        .colors {
            indicatorColor(
                SddsSandboxTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            overflowNextIconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            overflowPrevIconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            indicatorThickness(2.0.dp)
            minSpacing(0.0.dp)
        }
        .dividerStyle(Divider.Default.style())
        .disclosureIcon(com.sdds.icons.R.drawable.ic_dots_horizontal_outline_24)
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
        .dividerEnabled(true)
        .indicatorEnabled(true)

public val IconTabs.L: WrapperIconTabsL
    @Composable
    @JvmName("WrapperIconTabsL")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(IconTabItem.L.style())
        .dropdownMenuStyle(DropdownMenuNormal.L.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyLBold)
        .wrap(::WrapperIconTabsL)

public val WrapperIconTabsL.Vertical: WrapperIconTabsLVertical
    @Composable
    @JvmName("WrapperIconTabsLVertical")
    get() = builder
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperIconTabsLVertical)

public val WrapperIconTabsL.Horizontal: WrapperIconTabsLHorizontal
    @Composable
    @JvmName("WrapperIconTabsLHorizontal")
    get() = builder
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperIconTabsLHorizontal)

public val IconTabs.M: WrapperIconTabsM
    @Composable
    @JvmName("WrapperIconTabsM")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(IconTabItem.M.style())
        .dropdownMenuStyle(DropdownMenuNormal.M.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyMBold)
        .wrap(::WrapperIconTabsM)

public val WrapperIconTabsM.Vertical: WrapperIconTabsMVertical
    @Composable
    @JvmName("WrapperIconTabsMVertical")
    get() = builder
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperIconTabsMVertical)

public val WrapperIconTabsM.Horizontal: WrapperIconTabsMHorizontal
    @Composable
    @JvmName("WrapperIconTabsMHorizontal")
    get() = builder
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperIconTabsMHorizontal)

public val IconTabs.S: WrapperIconTabsS
    @Composable
    @JvmName("WrapperIconTabsS")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(IconTabItem.M.style())
        .dropdownMenuStyle(DropdownMenuNormal.M.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyMBold)
        .wrap(::WrapperIconTabsS)

public val WrapperIconTabsS.Vertical: WrapperIconTabsSVertical
    @Composable
    @JvmName("WrapperIconTabsSVertical")
    get() = builder
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperIconTabsSVertical)

public val WrapperIconTabsS.Horizontal: WrapperIconTabsSHorizontal
    @Composable
    @JvmName("WrapperIconTabsSHorizontal")
    get() = builder
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperIconTabsSHorizontal)

public val IconTabs.Xs: WrapperIconTabsXs
    @Composable
    @JvmName("WrapperIconTabsXs")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(IconTabItem.Xs.style())
        .dropdownMenuStyle(DropdownMenuNormal.Xs.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyXsBold)
        .wrap(::WrapperIconTabsXs)

public val WrapperIconTabsXs.Vertical: WrapperIconTabsXsVertical
    @Composable
    @JvmName("WrapperIconTabsXsVertical")
    get() = builder
        .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
        .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
        .orientation(TabsOrientation.Vertical)
        .wrap(::WrapperIconTabsXsVertical)

public val WrapperIconTabsXs.Horizontal: WrapperIconTabsXsHorizontal
    @Composable
    @JvmName("WrapperIconTabsXsHorizontal")
    get() = builder
        .orientation(TabsOrientation.Horizontal)
        .wrap(::WrapperIconTabsXsHorizontal)

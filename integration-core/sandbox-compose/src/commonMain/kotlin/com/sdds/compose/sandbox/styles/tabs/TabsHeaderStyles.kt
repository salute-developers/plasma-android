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
import com.sdds.compose.sandbox.styles.dropdownmenu.S
import com.sdds.compose.sandbox.styles.dropdownmenu.Xs
import com.sdds.compose.sandbox.styles.tabitem.H1
import com.sdds.compose.sandbox.styles.tabitem.H2
import com.sdds.compose.sandbox.styles.tabitem.H3
import com.sdds.compose.sandbox.styles.tabitem.H4
import com.sdds.compose.sandbox.styles.tabitem.H5
import com.sdds.compose.sandbox.styles.tabitem.TabItemHeader
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.icons.compose.DisclosureLeftOutline24
import com.sdds.icons.compose.DisclosureRightOutline24
import com.sdds.icons.compose.SddsIcons
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabsHeader : BuilderWrapper<TabsStyle, TabsStyleBuilder>

/**
 * Обертка для вариации H1
 */
@JvmInline
public value class WrapperTabsHeaderH1(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsHeader

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperTabsHeaderH2(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsHeader

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperTabsHeaderH3(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsHeader

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperTabsHeaderH4(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsHeader

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperTabsHeaderH5(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsHeader

private val TabsStyleBuilder.invariantProps: TabsStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())
        .dividerEnabled(false)
        .indicatorEnabled(false)
        .orientation(TabsOrientation.Horizontal)
        .overflowNextIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .overflowPrevIcon(imageVectorSource(SddsIcons.DisclosureLeftOutline24))
        .colors {
            indicatorColor(SddsSandboxTheme.colors.surfaceDefaultSolidDefault.asInteractive())
            overflowNextIconColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            overflowPrevIconColor(SddsSandboxTheme.colors.textDefaultSecondary.asInteractive())
            disclosureColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsSandboxTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            indicatorThickness(2.0.dp)
        }

public val TabsHeader.H1: WrapperTabsHeaderH1
    @Composable
    @JvmName("WrapperTabsHeaderH1")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemHeader.H1.style())
        .dropdownMenuStyle(DropdownMenuNormal.L.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.headerH1Bold)
        .dimensions {
            minSpacing(56.0.dp)
        }
        .wrap(::WrapperTabsHeaderH1)

public val TabsHeader.H2: WrapperTabsHeaderH2
    @Composable
    @JvmName("WrapperTabsHeaderH2")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemHeader.H2.style())
        .dropdownMenuStyle(DropdownMenuNormal.M.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.headerH2Bold)
        .dimensions {
            minSpacing(40.0.dp)
        }
        .wrap(::WrapperTabsHeaderH2)

public val TabsHeader.H3: WrapperTabsHeaderH3
    @Composable
    @JvmName("WrapperTabsHeaderH3")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemHeader.H3.style())
        .dropdownMenuStyle(DropdownMenuNormal.S.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.headerH3Bold)
        .dimensions {
            minSpacing(36.0.dp)
        }
        .wrap(::WrapperTabsHeaderH3)

public val TabsHeader.H4: WrapperTabsHeaderH4
    @Composable
    @JvmName("WrapperTabsHeaderH4")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemHeader.H4.style())
        .dropdownMenuStyle(DropdownMenuNormal.Xs.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.headerH4Bold)
        .dimensions {
            minSpacing(32.0.dp)
        }
        .wrap(::WrapperTabsHeaderH4)

public val TabsHeader.H5: WrapperTabsHeaderH5
    @Composable
    @JvmName("WrapperTabsHeaderH5")
    get() = TabsStyle.builder(this)
        .invariantProps
        .tabItemStyle(TabItemHeader.H5.style())
        .dropdownMenuStyle(DropdownMenuNormal.Xs.style())
        .disclosureTextStyle(SddsSandboxTheme.typography.headerH5Bold)
        .dimensions {
            minSpacing(28.0.dp)
        }
        .wrap(::WrapperTabsHeaderH5)

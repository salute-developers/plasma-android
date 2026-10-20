@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.customcomponents.numberpanel

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelMode
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyleBuilder
import com.sdds.plasma.homeds.compose.R
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.tokens.SBLCDTypography

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNumberPanel : BuilderWrapper<NumberPanelStyle, NumberPanelStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperNumberPanelXs(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperNumberPanelS(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperNumberPanelM(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации XsHumidity
 */
@JvmInline
public value class WrapperNumberPanelXsHumidity(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации SHumidity
 */
@JvmInline
public value class WrapperNumberPanelSHumidity(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации MHumidity
 */
@JvmInline
public value class WrapperNumberPanelMHumidity(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации Xs для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelXsGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации S для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelSGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации M для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelMGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации MHumidity для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelMHumidityGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации XsHumidity для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelXsHumidityGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

/**
 * Обертка для вариации SHumidity для группы климатических устройств
 */
@JvmInline
public value class WrapperNumberPanelSHumidityGroup(
    public override val builder: NumberPanelStyleBuilder,
) : WrapperNumberPanel

private val NumberPanelStyleBuilder.invariantProps: NumberPanelStyleBuilder
    @Composable
    get() = this
        .colors {
            valueColor(PlasmaHomeDsTheme.colors.textOnLightParagraph)
            fractionColor(PlasmaHomeDsTheme.colors.textOnLightParagraph)
            iconColor(PlasmaHomeDsTheme.colors.textOnLightParagraph)
            groupIconColor(PlasmaHomeDsTheme.colors.textOnLightParagraph)
        }

public val NumberPanel.Xs: WrapperNumberPanelXs
    @Composable
    @JvmName("WrapperNumberPanelXs")
    get() = NumberPanelStyle.builder(this)
        .invariantProps
        .valueStyle(SBLCDTypography.sblcdXs)
        .separatorStyle(SBLCDTypography.sblcdSeparatorXs)
        .fractionStyle(SBLCDTypography.sblcdFractionXs)
        .icon(R.drawable.ic_degree_xs)
        .dimensions {
            valueStartPadding(1.dp)
            valueEndPadding(1.dp)
            fractionStartPadding(1.dp)
            fractionEndPadding(1.dp)
        }
        .wrap(::WrapperNumberPanelXs)

public val NumberPanel.S: WrapperNumberPanelS
    @Composable
    @JvmName("WrapperNumberPanelS")
    get() = NumberPanelStyle.builder(this)
        .invariantProps
        .valueStyle(SBLCDTypography.sblcdS)
        .separatorStyle(SBLCDTypography.sblcdSeparatorS)
        .fractionStyle(SBLCDTypography.sblcdFractionS)
        .icon(R.drawable.ic_degree_s)
        .dimensions {
            valueStartPadding(4.dp)
            valueEndPadding(2.dp)
            fractionStartPadding(1.dp)
            fractionEndPadding(2.dp)
        }
        .wrap(::WrapperNumberPanelS)

public val NumberPanel.M: WrapperNumberPanelM
    @Composable
    @JvmName("WrapperNumberPanelM")
    get() = NumberPanelStyle.builder(this)
        .invariantProps
        .valueStyle(SBLCDTypography.sblcdM)
        .separatorStyle(SBLCDTypography.sblcdSeparatorM)
        .fractionStyle(SBLCDTypography.sblcdFractionM)
        .icon(R.drawable.ic_degree_m)
        .dimensions {
            valueStartPadding(4.dp)
            valueEndPadding(2.dp)
            fractionStartPadding(1.dp)
            fractionEndPadding(4.dp)
        }
        .wrap(::WrapperNumberPanelM)

public val WrapperNumberPanelXs.Humidity: WrapperNumberPanelXsHumidity
    @Composable
    @JvmName("WrapperNumberPanelXsHumidity")
    get() = builder
        .mode(NumberPanelMode.Humidity)
        .icon(R.drawable.ic_percent_xs)
        .wrap(::WrapperNumberPanelXsHumidity)

public val WrapperNumberPanelS.Humidity: WrapperNumberPanelSHumidity
    @Composable
    @JvmName("WrapperNumberPanelSHumidity")
    get() = builder
        .mode(NumberPanelMode.Humidity)
        .icon(R.drawable.ic_percent_s)
        .wrap(::WrapperNumberPanelSHumidity)

public val WrapperNumberPanelM.Humidity: WrapperNumberPanelMHumidity
    @Composable
    @JvmName("WrapperNumberPanelMHumidity")
    get() = builder
        .mode(NumberPanelMode.Humidity)
        .icon(R.drawable.ic_percent_m)
        .wrap(::WrapperNumberPanelMHumidity)

public val WrapperNumberPanelXs.Group: WrapperNumberPanelXsGroup
    @Composable
    @JvmName("WrapperNumberPanelXsGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_xs)
        .dimensions {
            startContentEndPadding(1.dp)
        }
        .wrap(::WrapperNumberPanelXsGroup)

public val WrapperNumberPanelS.Group: WrapperNumberPanelSGroup
    @Composable
    @JvmName("WrapperNumberPanelSGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_s)
        .dimensions {
            startContentEndPadding(2.dp)
        }
        .wrap(::WrapperNumberPanelSGroup)

public val WrapperNumberPanelM.Group: WrapperNumberPanelMGroup
    @Composable
    @JvmName("WrapperNumberPanelMGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_m)
        .dimensions {
            startContentEndPadding(4.dp)
        }
        .wrap(::WrapperNumberPanelMGroup)

public val WrapperNumberPanelXsHumidity.Group: WrapperNumberPanelXsHumidityGroup
    @Composable
    @JvmName("WrapperNumberPanelXsHumidityGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_xs)
        .dimensions {
            startContentEndPadding(1.dp)
        }
        .wrap(::WrapperNumberPanelXsHumidityGroup)

public val WrapperNumberPanelSHumidity.Group: WrapperNumberPanelSHumidityGroup
    @Composable
    @JvmName("WrapperNumberPanelSHumidityGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_s)
        .dimensions {
            startContentEndPadding(2.dp)
        }
        .wrap(::WrapperNumberPanelSHumidityGroup)

public val WrapperNumberPanelMHumidity.Group: WrapperNumberPanelMHumidityGroup
    @Composable
    @JvmName("WrapperNumberPanelMHumidityGroup")
    get() = builder
        .groupIcon(R.drawable.ic_tilde_m)
        .dimensions {
            startContentEndPadding(4.dp)
        }
        .wrap(::WrapperNumberPanelMHumidityGroup)

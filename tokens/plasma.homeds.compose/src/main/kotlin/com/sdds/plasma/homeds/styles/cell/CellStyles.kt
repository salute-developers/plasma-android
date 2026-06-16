// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.L
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatar.S
import com.sdds.plasma.homeds.styles.checkbox.CheckBox
import com.sdds.plasma.homeds.styles.checkbox.Default
import com.sdds.plasma.homeds.styles.checkbox.M
import com.sdds.plasma.homeds.styles.checkbox.S
import com.sdds.plasma.homeds.styles.iconbutton.Clear
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.L
import com.sdds.plasma.homeds.styles.iconbutton.M
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.plasma.homeds.styles.radiobox.M
import com.sdds.plasma.homeds.styles.radiobox.RadioBox
import com.sdds.plasma.homeds.styles.radiobox.S
import com.sdds.plasma.homeds.styles.switcher.L
import com.sdds.plasma.homeds.styles.switcher.M
import com.sdds.plasma.homeds.styles.switcher.S
import com.sdds.plasma.homeds.styles.switcher.Switch
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCell : BuilderWrapper<CellStyle, CellStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCellL(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCellM(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCellS(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperCellXs(
    public override val builder: CellStyleBuilder,
) : WrapperCell

private val CellStyleBuilder.invariantProps: CellStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            labelColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            subtitleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureTextColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureIconColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            contentStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            contentEndColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .titleStyle(PlasmaHomeDsTheme.typography.bodyLNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .titleStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .wrap(::WrapperCellXs)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.avatar.Avatar
import com.sdds.plasma.giga.styles.avatar.L
import com.sdds.plasma.giga.styles.avatar.M
import com.sdds.plasma.giga.styles.avatar.S
import com.sdds.plasma.giga.styles.button.icon.Clear
import com.sdds.plasma.giga.styles.button.icon.IconButton
import com.sdds.plasma.giga.styles.button.icon.L
import com.sdds.plasma.giga.styles.button.icon.M
import com.sdds.plasma.giga.styles.button.icon.S
import com.sdds.plasma.giga.styles.button.icon.Xs
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkbox.S
import com.sdds.plasma.giga.styles.radiobox.M
import com.sdds.plasma.giga.styles.radiobox.RadioBox
import com.sdds.plasma.giga.styles.radiobox.S
import com.sdds.plasma.giga.styles.switcher.L
import com.sdds.plasma.giga.styles.switcher.M
import com.sdds.plasma.giga.styles.switcher.S
import com.sdds.plasma.giga.styles.switcher.Switch
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .titleStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .subtitleStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .disclosureTextStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.Clear.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .titleStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .subtitleStyle(PlasmaGigaTheme.typography.bodySNormal)
        .disclosureTextStyle(PlasmaGigaTheme.typography.bodySNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.Clear.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaGigaTheme.typography.bodySNormal)
        .subtitleStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .subtitleStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.Xs.Clear.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellXs)

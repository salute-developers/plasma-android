// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.styles.avatar.Avatar
import com.sdds.plasma.giga.app.styles.avatar.L
import com.sdds.plasma.giga.app.styles.avatar.M
import com.sdds.plasma.giga.app.styles.avatar.S
import com.sdds.plasma.giga.app.styles.checkbox.CheckBox
import com.sdds.plasma.giga.app.styles.checkbox.M
import com.sdds.plasma.giga.app.styles.checkbox.S
import com.sdds.plasma.giga.app.styles.iconbutton.Clear
import com.sdds.plasma.giga.app.styles.iconbutton.IconButton
import com.sdds.plasma.giga.app.styles.iconbutton.L
import com.sdds.plasma.giga.app.styles.iconbutton.M
import com.sdds.plasma.giga.app.styles.iconbutton.S
import com.sdds.plasma.giga.app.styles.iconbutton.Xs
import com.sdds.plasma.giga.app.styles.radiobox.M
import com.sdds.plasma.giga.app.styles.radiobox.RadioBox
import com.sdds.plasma.giga.app.styles.radiobox.S
import com.sdds.plasma.giga.app.styles.switcher.L
import com.sdds.plasma.giga.app.styles.switcher.M
import com.sdds.plasma.giga.app.styles.switcher.S
import com.sdds.plasma.giga.app.styles.switcher.Switch
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
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
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .titleStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .subtitleStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .disclosureTextStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .titleStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .subtitleStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .disclosureTextStyle(PlasmaGigaAppTheme.typography.bodySNormal)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .subtitleStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .titleStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .subtitleStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .disclosureTextStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
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

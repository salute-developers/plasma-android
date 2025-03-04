// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.serv.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.cellBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.avatar.L
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.button.icon.Clear
import com.sdds.serv.styles.button.icon.L
import com.sdds.serv.styles.button.icon.M
import com.sdds.serv.styles.button.icon.S
import com.sdds.serv.styles.button.icon.Xs
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.S
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех врапперов этого стиля
 */
public interface WrapperCell : BuilderWrapper<CellStyle, CellStyleBuilder>

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperCellL(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperCellM(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperCellS(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Враппер для вариации Xs
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
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyMNormal)
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
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .subtitleStyle(SddsServTheme.typography.bodySNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodySNormal)
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
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyXsNormal)
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
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyXsNormal)
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

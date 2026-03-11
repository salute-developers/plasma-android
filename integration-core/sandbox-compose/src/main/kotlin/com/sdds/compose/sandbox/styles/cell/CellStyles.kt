// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.avatar.Avatar
import com.sdds.compose.sandbox.styles.avatar.L
import com.sdds.compose.sandbox.styles.avatar.M
import com.sdds.compose.sandbox.styles.avatar.S
import com.sdds.compose.sandbox.styles.checkbox.CheckBox
import com.sdds.compose.sandbox.styles.checkbox.Default
import com.sdds.compose.sandbox.styles.checkbox.M
import com.sdds.compose.sandbox.styles.checkbox.S
import com.sdds.compose.sandbox.styles.iconbutton.Clear
import com.sdds.compose.sandbox.styles.iconbutton.IconButton
import com.sdds.compose.sandbox.styles.iconbutton.L
import com.sdds.compose.sandbox.styles.iconbutton.M
import com.sdds.compose.sandbox.styles.iconbutton.S
import com.sdds.compose.sandbox.styles.iconbutton.Xs
import com.sdds.compose.sandbox.styles.radiobox.M
import com.sdds.compose.sandbox.styles.radiobox.RadioBox
import com.sdds.compose.sandbox.styles.radiobox.S
import com.sdds.compose.sandbox.styles.switcher.L
import com.sdds.compose.sandbox.styles.switcher.M
import com.sdds.compose.sandbox.styles.switcher.S
import com.sdds.compose.sandbox.styles.switcher.Switch
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
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
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsSandboxTheme.typography.bodyMNormal)
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsSandboxTheme.typography.bodySNormal)
        .titleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodySNormal)
        .disclosureTextStyle(SddsSandboxTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .titleStyle(SddsSandboxTheme.typography.bodySNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .titleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.Xs.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellXs)

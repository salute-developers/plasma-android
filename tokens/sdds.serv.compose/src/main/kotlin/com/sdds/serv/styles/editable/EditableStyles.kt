// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.editable

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.EditableStates
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.EditableStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEditable : BuilderWrapper<EditableStyle, EditableStyleBuilder>

/**
 * Обертка для вариации H1
 */
@JvmInline
public value class WrapperEditableH1(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperEditableH2(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperEditableH3(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperEditableH4(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperEditableH5(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации BodyL
 */
@JvmInline
public value class WrapperEditableBodyL(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации BodyM
 */
@JvmInline
public value class WrapperEditableBodyM(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации BodyS
 */
@JvmInline
public value class WrapperEditableBodyS(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации BodyXs
 */
@JvmInline
public value class WrapperEditableBodyXs(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

/**
 * Обертка для вариации BodyXxs
 */
@JvmInline
public value class WrapperEditableBodyXxs(
    public override val builder: EditableStyleBuilder,
) : WrapperEditable

private val EditableStyleBuilder.invariantProps: EditableStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .colors {
            iconColor(
                SddsServTheme.colors.textDefaultTertiary.asStatefulValue(
                    setOf(EditableStates.ReadOnly)
                        to SddsServTheme.colors.textDefaultTertiary.multiplyAlpha(0.4f),
                ),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(EditableStates.ReadOnly)
                        to SddsServTheme.colors.textDefaultPrimary.multiplyAlpha(0.4f),
                ),
            )
            cursorColor(
                SddsServTheme.colors.textDefaultAccent.asStatefulValue(),
            )
        }

public val Editable.H1: WrapperEditableH1
    @Composable
    @JvmName("WrapperEditableH1")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.headerH1Bold)
        .dimensions {
            iconSize(52.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperEditableH1)

public val Editable.H2: WrapperEditableH2
    @Composable
    @JvmName("WrapperEditableH2")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.headerH2Bold)
        .dimensions {
            iconSize(36.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperEditableH2)

public val Editable.H3: WrapperEditableH3
    @Composable
    @JvmName("WrapperEditableH3")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.headerH3Bold)
        .dimensions {
            iconSize(30.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperEditableH3)

public val Editable.H4: WrapperEditableH4
    @Composable
    @JvmName("WrapperEditableH4")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.headerH4Bold)
        .dimensions {
            iconSize(26.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperEditableH4)

public val Editable.H5: WrapperEditableH5
    @Composable
    @JvmName("WrapperEditableH5")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.headerH5Bold)
        .dimensions {
            iconSize(24.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperEditableH5)

public val Editable.BodyL: WrapperEditableBodyL
    @Composable
    @JvmName("WrapperEditableBodyL")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyLBold)
        .dimensions {
            iconSize(22.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperEditableBodyL)

public val Editable.BodyM: WrapperEditableBodyM
    @Composable
    @JvmName("WrapperEditableBodyM")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyMBold)
        .dimensions {
            iconSize(20.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperEditableBodyM)

public val Editable.BodyS: WrapperEditableBodyS
    @Composable
    @JvmName("WrapperEditableBodyS")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodySBold)
        .dimensions {
            iconSize(18.0.dp)
            iconMargin(2.0.dp)
        }
        .wrap(::WrapperEditableBodyS)

public val Editable.BodyXs: WrapperEditableBodyXs
    @Composable
    @JvmName("WrapperEditableBodyXs")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyXsBold)
        .dimensions {
            iconSize(14.0.dp)
            iconMargin(2.0.dp)
        }
        .wrap(::WrapperEditableBodyXs)

public val Editable.BodyXxs: WrapperEditableBodyXxs
    @Composable
    @JvmName("WrapperEditableBodyXxs")
    get() = EditableStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyXxsBold)
        .dimensions {
            iconSize(12.0.dp)
            iconMargin(2.0.dp)
        }
        .wrap(::WrapperEditableBodyXxs)

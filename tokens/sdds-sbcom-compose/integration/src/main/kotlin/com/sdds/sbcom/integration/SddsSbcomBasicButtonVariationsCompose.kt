// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.BasicButtonBg
import com.sdds.sbcom.styles.basicbutton.BasicButtonMode
import com.sdds.sbcom.styles.basicbutton.BasicButtonSize
import com.sdds.sbcom.styles.basicbutton.BasicButtonStyles
import com.sdds.sbcom.styles.basicbutton.BgNo
import com.sdds.sbcom.styles.basicbutton.ModeAccentFilled
import com.sdds.sbcom.styles.basicbutton.ModeAccentGrey
import com.sdds.sbcom.styles.basicbutton.ModeAccentWhite
import com.sdds.sbcom.styles.basicbutton.ModeDangerTint
import com.sdds.sbcom.styles.basicbutton.ModePrimary
import com.sdds.sbcom.styles.basicbutton.Size24
import com.sdds.sbcom.styles.basicbutton.Size32
import com.sdds.sbcom.styles.basicbutton.Size40
import com.sdds.sbcom.styles.basicbutton.Size48
import com.sdds.sbcom.styles.basicbutton.resolve

internal object SddsSbcomBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size48",
                variants = listOf("Size48", "Size40", "Size32", "Size24"),
            ),
            Property.SingleChoiceProperty(name = "bg", value = "Yes", variants = listOf("Yes", "No")),
            Property.SingleChoiceProperty(
                name = "mode",
                value = "Primary",
                variants = listOf("Primary", "AccentFilled", "AccentWhite", "AccentGrey", "DangerTint"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "BasicButton.Size48.ModePrimary" to ComposeStyleReference { BasicButton.Size48.ModePrimary.style() },
            "BasicButton.Size48.ModeAccentFilled" to ComposeStyleReference { BasicButton.Size48.ModeAccentFilled.style() },
            "BasicButton.Size48.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size48.ModeAccentWhite.style() },
            "BasicButton.Size48.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size48.ModeAccentGrey.style() },
            "BasicButton.Size48.ModeDangerTint" to ComposeStyleReference { BasicButton.Size48.ModeDangerTint.style() },
            "BasicButton.Size48.BgNo.ModePrimary" to ComposeStyleReference { BasicButton.Size48.BgNo.ModePrimary.style() },
            "BasicButton.Size48.BgNo.ModeAccentFilled" to ComposeStyleReference {
                BasicButton.Size48.BgNo.ModeAccentFilled.style()
            },
            "BasicButton.Size48.BgNo.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size48.BgNo.ModeAccentWhite.style() },
            "BasicButton.Size48.BgNo.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size48.BgNo.ModeAccentGrey.style() },
            "BasicButton.Size48.BgNo.ModeDangerTint" to ComposeStyleReference { BasicButton.Size48.BgNo.ModeDangerTint.style() },
            "BasicButton.Size40.ModePrimary" to ComposeStyleReference { BasicButton.Size40.ModePrimary.style() },
            "BasicButton.Size40.ModeAccentFilled" to ComposeStyleReference { BasicButton.Size40.ModeAccentFilled.style() },
            "BasicButton.Size40.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size40.ModeAccentWhite.style() },
            "BasicButton.Size40.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size40.ModeAccentGrey.style() },
            "BasicButton.Size40.ModeDangerTint" to ComposeStyleReference { BasicButton.Size40.ModeDangerTint.style() },
            "BasicButton.Size40.BgNo.ModePrimary" to ComposeStyleReference { BasicButton.Size40.BgNo.ModePrimary.style() },
            "BasicButton.Size40.BgNo.ModeAccentFilled" to ComposeStyleReference {
                BasicButton.Size40.BgNo.ModeAccentFilled.style()
            },
            "BasicButton.Size40.BgNo.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size40.BgNo.ModeAccentWhite.style() },
            "BasicButton.Size40.BgNo.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size40.BgNo.ModeAccentGrey.style() },
            "BasicButton.Size40.BgNo.ModeDangerTint" to ComposeStyleReference { BasicButton.Size40.BgNo.ModeDangerTint.style() },
            "BasicButton.Size32.ModePrimary" to ComposeStyleReference { BasicButton.Size32.ModePrimary.style() },
            "BasicButton.Size32.ModeAccentFilled" to ComposeStyleReference { BasicButton.Size32.ModeAccentFilled.style() },
            "BasicButton.Size32.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size32.ModeAccentWhite.style() },
            "BasicButton.Size32.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size32.ModeAccentGrey.style() },
            "BasicButton.Size32.ModeDangerTint" to ComposeStyleReference { BasicButton.Size32.ModeDangerTint.style() },
            "BasicButton.Size32.BgNo.ModePrimary" to ComposeStyleReference { BasicButton.Size32.BgNo.ModePrimary.style() },
            "BasicButton.Size32.BgNo.ModeAccentFilled" to ComposeStyleReference {
                BasicButton.Size32.BgNo.ModeAccentFilled.style()
            },
            "BasicButton.Size32.BgNo.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size32.BgNo.ModeAccentWhite.style() },
            "BasicButton.Size32.BgNo.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size32.BgNo.ModeAccentGrey.style() },
            "BasicButton.Size32.BgNo.ModeDangerTint" to ComposeStyleReference { BasicButton.Size32.BgNo.ModeDangerTint.style() },
            "BasicButton.Size24.ModePrimary" to ComposeStyleReference { BasicButton.Size24.ModePrimary.style() },
            "BasicButton.Size24.ModeAccentFilled" to ComposeStyleReference { BasicButton.Size24.ModeAccentFilled.style() },
            "BasicButton.Size24.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size24.ModeAccentWhite.style() },
            "BasicButton.Size24.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size24.ModeAccentGrey.style() },
            "BasicButton.Size24.ModeDangerTint" to ComposeStyleReference { BasicButton.Size24.ModeDangerTint.style() },
            "BasicButton.Size24.BgNo.ModePrimary" to ComposeStyleReference { BasicButton.Size24.BgNo.ModePrimary.style() },
            "BasicButton.Size24.BgNo.ModeAccentFilled" to ComposeStyleReference {
                BasicButton.Size24.BgNo.ModeAccentFilled.style()
            },
            "BasicButton.Size24.BgNo.ModeAccentWhite" to ComposeStyleReference { BasicButton.Size24.BgNo.ModeAccentWhite.style() },
            "BasicButton.Size24.BgNo.ModeAccentGrey" to ComposeStyleReference { BasicButton.Size24.BgNo.ModeAccentGrey.style() },
            "BasicButton.Size24.BgNo.ModeDangerTint" to ComposeStyleReference { BasicButton.Size24.BgNo.ModeDangerTint.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BasicButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size48" -> BasicButtonSize.Size48
                "Size40" -> BasicButtonSize.Size40
                "Size32" -> BasicButtonSize.Size32
                "Size24" -> BasicButtonSize.Size24
                else -> BasicButtonSize.Size48
            },
            bg = when (bindings["bg"]?.toString()) {
                "Yes" -> BasicButtonBg.Yes
                "No" -> BasicButtonBg.No
                else -> BasicButtonBg.Yes
            },
            mode = when (bindings["mode"]?.toString()) {
                "Primary" -> BasicButtonMode.Primary
                "AccentFilled" -> BasicButtonMode.AccentFilled
                "AccentWhite" -> BasicButtonMode.AccentWhite
                "AccentGrey" -> BasicButtonMode.AccentGrey
                "DangerTint" -> BasicButtonMode.DangerTint
                else -> BasicButtonMode.Primary
            },
        ).key
    }
}

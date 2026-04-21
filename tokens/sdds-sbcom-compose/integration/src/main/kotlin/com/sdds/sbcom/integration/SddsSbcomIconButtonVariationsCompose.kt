// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.iconbutton.BgNo
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.IconButtonBg
import com.sdds.sbcom.styles.iconbutton.IconButtonMode
import com.sdds.sbcom.styles.iconbutton.IconButtonSize
import com.sdds.sbcom.styles.iconbutton.IconButtonStyles
import com.sdds.sbcom.styles.iconbutton.ModeAccentFilled
import com.sdds.sbcom.styles.iconbutton.ModeAccentGrey
import com.sdds.sbcom.styles.iconbutton.ModeDangerTint
import com.sdds.sbcom.styles.iconbutton.Size24
import com.sdds.sbcom.styles.iconbutton.Size32
import com.sdds.sbcom.styles.iconbutton.Size40
import com.sdds.sbcom.styles.iconbutton.Size48
import com.sdds.sbcom.styles.iconbutton.resolve

internal object SddsSbcomIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Size48", variants = listOf("Size48", "Size40", "Size32", "Size24")),
            Property.SingleChoiceProperty(name = "bg", value = "Yes", variants = listOf("Yes", "No")),
            Property.SingleChoiceProperty(name = "mode", value = "AccentFilled", variants = listOf("AccentFilled", "AccentGrey", "DangerTint")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "IconButton.Size48.ModeAccentFilled" to ComposeStyleReference { IconButton.Size48.ModeAccentFilled.style() },
            "IconButton.Size48.ModeAccentGrey" to ComposeStyleReference { IconButton.Size48.ModeAccentGrey.style() },
            "IconButton.Size48.ModeDangerTint" to ComposeStyleReference { IconButton.Size48.ModeDangerTint.style() },
            "IconButton.Size48.BgNo.ModeAccentFilled" to ComposeStyleReference { IconButton.Size48.BgNo.ModeAccentFilled.style() },
            "IconButton.Size48.BgNo.ModeAccentGrey" to ComposeStyleReference { IconButton.Size48.BgNo.ModeAccentGrey.style() },
            "IconButton.Size48.BgNo.ModeDangerTint" to ComposeStyleReference { IconButton.Size48.BgNo.ModeDangerTint.style() },
            "IconButton.Size40.ModeAccentFilled" to ComposeStyleReference { IconButton.Size40.ModeAccentFilled.style() },
            "IconButton.Size40.ModeAccentGrey" to ComposeStyleReference { IconButton.Size40.ModeAccentGrey.style() },
            "IconButton.Size40.ModeDangerTint" to ComposeStyleReference { IconButton.Size40.ModeDangerTint.style() },
            "IconButton.Size40.BgNo.ModeAccentFilled" to ComposeStyleReference { IconButton.Size40.BgNo.ModeAccentFilled.style() },
            "IconButton.Size40.BgNo.ModeAccentGrey" to ComposeStyleReference { IconButton.Size40.BgNo.ModeAccentGrey.style() },
            "IconButton.Size40.BgNo.ModeDangerTint" to ComposeStyleReference { IconButton.Size40.BgNo.ModeDangerTint.style() },
            "IconButton.Size32.ModeAccentFilled" to ComposeStyleReference { IconButton.Size32.ModeAccentFilled.style() },
            "IconButton.Size32.ModeAccentGrey" to ComposeStyleReference { IconButton.Size32.ModeAccentGrey.style() },
            "IconButton.Size32.ModeDangerTint" to ComposeStyleReference { IconButton.Size32.ModeDangerTint.style() },
            "IconButton.Size32.BgNo.ModeAccentFilled" to ComposeStyleReference { IconButton.Size32.BgNo.ModeAccentFilled.style() },
            "IconButton.Size32.BgNo.ModeAccentGrey" to ComposeStyleReference { IconButton.Size32.BgNo.ModeAccentGrey.style() },
            "IconButton.Size32.BgNo.ModeDangerTint" to ComposeStyleReference { IconButton.Size32.BgNo.ModeDangerTint.style() },
            "IconButton.Size24.ModeAccentFilled" to ComposeStyleReference { IconButton.Size24.ModeAccentFilled.style() },
            "IconButton.Size24.ModeAccentGrey" to ComposeStyleReference { IconButton.Size24.ModeAccentGrey.style() },
            "IconButton.Size24.ModeDangerTint" to ComposeStyleReference { IconButton.Size24.ModeDangerTint.style() },
            "IconButton.Size24.BgNo.ModeAccentFilled" to ComposeStyleReference { IconButton.Size24.BgNo.ModeAccentFilled.style() },
            "IconButton.Size24.BgNo.ModeAccentGrey" to ComposeStyleReference { IconButton.Size24.BgNo.ModeAccentGrey.style() },
            "IconButton.Size24.BgNo.ModeDangerTint" to ComposeStyleReference { IconButton.Size24.BgNo.ModeDangerTint.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size48" -> IconButtonSize.Size48
                "Size40" -> IconButtonSize.Size40
                "Size32" -> IconButtonSize.Size32
                "Size24" -> IconButtonSize.Size24
                else -> IconButtonSize.Size48
            },
            bg = when (bindings["bg"]?.toString()) {
                "Yes" -> IconButtonBg.Yes
                "No" -> IconButtonBg.No
                else -> IconButtonBg.Yes
            },
            mode = when (bindings["mode"]?.toString()) {
                "AccentFilled" -> IconButtonMode.AccentFilled
                "AccentGrey" -> IconButtonMode.AccentGrey
                "DangerTint" -> IconButtonMode.DangerTint
                else -> IconButtonMode.AccentFilled
            },
        ).key
    }
}

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.spinner.ModeColorAccent
import com.sdds.sbcom.styles.spinner.ModeColorDanger
import com.sdds.sbcom.styles.spinner.ModeColorGlobalWhite
import com.sdds.sbcom.styles.spinner.ModeColorPrimary
import com.sdds.sbcom.styles.spinner.ModeColorSecondary
import com.sdds.sbcom.styles.spinner.Size16
import com.sdds.sbcom.styles.spinner.Size24
import com.sdds.sbcom.styles.spinner.Size32
import com.sdds.sbcom.styles.spinner.Size40
import com.sdds.sbcom.styles.spinner.Spinner

internal object SddsSbcomSpinnerVariationsCompose : ComposeStyleProvider<SpinnerStyle>() {
    override val variations: Map<String, ComposeStyleReference<SpinnerStyle>> =
        mapOf(
            "Size40.ModeColorPrimary" to ComposeStyleReference { Spinner.Size40.ModeColorPrimary.style() },
            "Size40.ModeColorSecondary" to ComposeStyleReference { Spinner.Size40.ModeColorSecondary.style() },
            "Size40.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size40.ModeColorGlobalWhite.style() },
            "Size40.ModeColorAccent" to ComposeStyleReference { Spinner.Size40.ModeColorAccent.style() },
            "Size40.ModeColorDanger" to ComposeStyleReference { Spinner.Size40.ModeColorDanger.style() },
            "Size32.ModeColorPrimary" to ComposeStyleReference { Spinner.Size32.ModeColorPrimary.style() },
            "Size32.ModeColorSecondary" to ComposeStyleReference { Spinner.Size32.ModeColorSecondary.style() },
            "Size32.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size32.ModeColorGlobalWhite.style() },
            "Size32.ModeColorAccent" to ComposeStyleReference { Spinner.Size32.ModeColorAccent.style() },
            "Size32.ModeColorDanger" to ComposeStyleReference { Spinner.Size32.ModeColorDanger.style() },
            "Size24.ModeColorPrimary" to ComposeStyleReference { Spinner.Size24.ModeColorPrimary.style() },
            "Size24.ModeColorSecondary" to ComposeStyleReference { Spinner.Size24.ModeColorSecondary.style() },
            "Size24.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size24.ModeColorGlobalWhite.style() },
            "Size24.ModeColorAccent" to ComposeStyleReference { Spinner.Size24.ModeColorAccent.style() },
            "Size24.ModeColorDanger" to ComposeStyleReference { Spinner.Size24.ModeColorDanger.style() },
            "Size16.ModeColorPrimary" to ComposeStyleReference { Spinner.Size16.ModeColorPrimary.style() },
            "Size16.ModeColorSecondary" to ComposeStyleReference { Spinner.Size16.ModeColorSecondary.style() },
            "Size16.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size16.ModeColorGlobalWhite.style() },
            "Size16.ModeColorAccent" to ComposeStyleReference { Spinner.Size16.ModeColorAccent.style() },
            "Size16.ModeColorDanger" to ComposeStyleReference { Spinner.Size16.ModeColorDanger.style() },
        )
}

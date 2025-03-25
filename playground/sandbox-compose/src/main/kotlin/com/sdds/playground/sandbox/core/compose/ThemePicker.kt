package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.ThemeContainer.allComposeThemes

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Composable
internal fun ThemePicker(
    currentTheme: Theme,
    onApply: (Theme) -> Unit,
    onConfirm: () -> Unit = {},
) {
    Column(Modifier.padding(dimensionResource(R.dimen.sandbox_editor_paddings))) {
        PropertyEditor(
            property = Property.SingleChoiceProperty(
                name = "Theme",
                value = currentTheme.name,
                variants = allComposeThemes.map { it.toString() },
                onApply = { themeName ->
                    val theme = allComposeThemes.find { it.name == themeName }
                    theme?.let(onApply)
                },
            ),
            onConfirm = onConfirm,
        )
        Spacer(
            modifier = Modifier
                .imePadding()
                .navigationBarsPadding(),
        )
    }
}

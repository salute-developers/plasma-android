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
            property = enumProperty(
                name = "Theme",
                value = currentTheme,
                onApply = onApply,
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

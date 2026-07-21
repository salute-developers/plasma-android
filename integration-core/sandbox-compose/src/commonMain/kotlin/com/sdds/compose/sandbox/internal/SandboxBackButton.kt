package com.sdds.compose.sandbox.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.ArrowLeft24
import com.sdds.icons.compose.SddsIcons

@Composable
internal fun SandboxBackButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    IconButton(
        modifier = modifier,
        style = LocalPropertiesListStyle.current.resetButtonStyle,
        iconSource = imageVectorSource(SddsIcons.ArrowLeft24),
        iconContentDescription = "Назад",
        onClick = onClick,
    )
}

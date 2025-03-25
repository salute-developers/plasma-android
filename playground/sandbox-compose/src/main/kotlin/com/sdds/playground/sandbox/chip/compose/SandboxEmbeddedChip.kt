package com.sdds.playground.sandbox.chip.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.EmbeddedChip
import com.sdds.serv.styles.chip.M

@Preview(showBackground = true)
@Composable
internal fun SandboxEmbeddedChipPreview() {
    SandboxTheme {
        Chip(
            label = "label",
            style = EmbeddedChip.M.Default.style(),
            startContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_accessibility_24),
                    contentDescription = "",
                )
            },
        )
    }
}

package com.sdds.plasma.sd.service.sandbox.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.M

@Preview(showBackground = true)
@Composable
internal fun SandboxEmbeddedChipPreview() {
    SandboxTheme {
        Chip(
            label = "label",
            style = EmbeddedChip.M.Default.style(),
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_accessibility_24),
                    contentDescription = "",
                )
            },
        )
    }
}

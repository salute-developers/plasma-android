package com.sdds.playground.sandbox.cell.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.Text
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.theme.SddsServTheme

@Composable
@Preview(showBackground = true, showSystemUi = true)
internal fun CellPreview() {
    val cellStyle = CellStyle.builder()
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .avatarStyle(Avatar.S.style())
        .colors {
            titleColor(SddsServTheme.colors.textDefaultSecondary)
            labelColor(SddsServTheme.colors.textDefaultPrimary)
            subtitleColor(SddsServTheme.colors.textDefaultSecondary)
        }
        .style()
    SandboxTheme {
        Cell(
            style = cellStyle,
            gravity = Cell.Gravity.Center,
            title = AnnotatedString("Title"),
            subtitle = AnnotatedString("Subtitle"),
            label = AnnotatedString("Label"),
            disclosureIcon = painterResource(id = R.drawable.ic_arrow_right_16),
            disclosureText = AnnotatedString("Disclosure"),
            startContent = {
                Text(text = "Start", style = SddsServTheme.typography.bodyXsNormal)
                Avatar(
                    painter = painterResource(id = R.drawable.ic_accessibility_16),
                    placeholder = Avatar.Placeholder.Text("AV"),
                )
            },
            endContent = {
                Switch(active = true)
            },
        )
    }
}

package com.sdds.plasma.homeds.docs.samples

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.plasma.homeds.components.numberpanel.NumberPanel
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelMode
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle
import com.sdds.plasma.homeds.compose.R
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.M
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.tokens.SBLCDTypography
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel as NumberPanelStyles

@Composable
@DocSample(needScreenshot = true)
fun NumberPanel_Temperature() {
    composableCodeSnippet {
        NumberPanel(
            value = 23.5f,
            style = NumberPanelStyles.M.style(),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun NumberPanel_Humidity() {
    composableCodeSnippet {
        NumberPanel(
            value = 46.0f,
            style = NumberPanelStyles.M.Humidity.style(),
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun NumberPanel_NumberPanelStyle() {
    composableCodeSnippet {
        NumberPanelStyle.builder()
            .valueStyle(SBLCDTypography.sblcdM)
            .separatorStyle(SBLCDTypography.sblcdSeparatorM)
            .fractionStyle(SBLCDTypography.sblcdFractionM)
            .mode(NumberPanelMode.Temperature)
            .disableAlpha(0.4f)
            .colors {
                valueColor(PlasmaHomeDsTheme.colors.textDefaultPrimary)
                fractionColor(PlasmaHomeDsTheme.colors.textDefaultSecondary)
                iconColor(PlasmaHomeDsTheme.colors.textDefaultPrimary)
            }
            .dimensions {
                valueStartPadding(4.dp)
                valueEndPadding(2.dp)
                fractionStartPadding(1.dp)
                fractionEndPadding(4.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun NumberPanel_CustomIcon() {
    composableCodeSnippet {
        NumberPanel(
            value = 46.0f,
            style = NumberPanelStyles.M.Humidity.style(),
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_percent_m),
                    contentDescription = null,
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun NumberPanel_Disabled() {
    composableCodeSnippet {
        NumberPanel(
            value = 23.5f,
            style = NumberPanelStyles.M.style(),
            enabled = false,
        )
    }
}

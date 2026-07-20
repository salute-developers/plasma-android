package com.sdds.serv.sandbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.ExperimentalBrowserHistoryApi
import androidx.navigation.NavHostController
import androidx.navigation.bindToNavigation
import com.sdds.serv.compose.generated.resources.Res
import com.sdds.serv.compose.generated.resources.s_b_sans_display_bold
import com.sdds.serv.compose.generated.resources.s_b_sans_display_light
import com.sdds.serv.compose.generated.resources.s_b_sans_display_medium
import com.sdds.serv.compose.generated.resources.s_b_sans_display_regular
import com.sdds.serv.compose.generated.resources.s_b_sans_display_semibold
import com.sdds.serv.compose.generated.resources.s_b_sans_display_thin
import com.sdds.serv.compose.generated.resources.s_b_sans_text_bold
import com.sdds.serv.compose.generated.resources.s_b_sans_text_bold_italic
import com.sdds.serv.compose.generated.resources.s_b_sans_text_italic
import com.sdds.serv.compose.generated.resources.s_b_sans_text_light
import com.sdds.serv.compose.generated.resources.s_b_sans_text_light_italic
import com.sdds.serv.compose.generated.resources.s_b_sans_text_medium
import com.sdds.serv.compose.generated.resources.s_b_sans_text_regular
import com.sdds.serv.compose.generated.resources.s_b_sans_text_semibold
import com.sdds.serv.compose.generated.resources.s_b_sans_text_semibold_italic
import com.sdds.serv.compose.generated.resources.s_b_sans_text_thin
import kotlinx.browser.window
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.preloadFont

/** Kotlin/JS browser entrypoint for the SddsServ sandbox. */
@OptIn(ExperimentalComposeUiApi::class, ExperimentalResourceApi::class)
fun main() {
    initializeSddsServSandbox()
    ComposeViewport(viewportContainerId = "root") {
        PreloadedSddsServSandbox()
    }
}

/**
 * Web resources are fetched asynchronously. Rendering the sandbox only after
 * all font faces are ready prevents Cyrillic characters from being drawn as tofu.
 */
@Composable
@OptIn(ExperimentalResourceApi::class)
private fun PreloadedSddsServSandbox() {
    val fontsLoaded = listOf(
        preloadFont(Res.font.s_b_sans_display_light, FontWeight(300), FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_display_thin, FontWeight(100), FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_display_bold, FontWeight.Bold, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_display_regular, FontWeight.Normal, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_display_semibold, FontWeight.SemiBold, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_display_medium, FontWeight.Medium, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_light, FontWeight(300), FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_italic, FontWeight.Normal, FontStyle.Italic),
        preloadFont(Res.font.s_b_sans_text_semibold_italic, FontWeight.SemiBold, FontStyle.Italic),
        preloadFont(Res.font.s_b_sans_text_thin, FontWeight(100), FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_regular, FontWeight.Normal, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_semibold, FontWeight.SemiBold, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_light_italic, FontWeight(300), FontStyle.Italic),
        preloadFont(Res.font.s_b_sans_text_bold, FontWeight.Bold, FontStyle.Normal),
        preloadFont(Res.font.s_b_sans_text_bold_italic, FontWeight.Bold, FontStyle.Italic),
        preloadFont(Res.font.s_b_sans_text_medium, FontWeight.Medium, FontStyle.Normal),
    ).all { it.value != null }

    if (fontsLoaded) {
        SddsServSandboxApp(
            navigationIntegration = { navController -> BrowserNavigationIntegration(navController) },
        )
    }
}

@Composable
@OptIn(ExperimentalBrowserHistoryApi::class)
private fun BrowserNavigationIntegration(navController: NavHostController) {
    LaunchedEffect(navController) {
        window.bindToNavigation(navController)
    }
}

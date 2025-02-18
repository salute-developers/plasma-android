package com.sdds.serv.tokens

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import java.io.File

/**
 * Токены шрифтов
 */
public actual object FontTokens {
    /**
     * fontFamily display
     */
    public actual val display: FontFamily = FontFamily(
        Font("font/s_b_sans_display_light.otf", FontWeight(300), FontStyle.Normal),
        Font("font/s_b_sans_display_thin.otf", FontWeight(100), FontStyle.Normal),
        Font("font/s_b_sans_display_bold.otf", FontWeight(700), FontStyle.Normal),
        Font("font/s_b_sans_display_regular.otf", FontWeight(400), FontStyle.Normal),
        Font("font/s_b_sans_display_semibold.otf", FontWeight(600), FontStyle.Normal),
        Font("font/s_b_sans_display_medium.otf", FontWeight(500), FontStyle.Normal),
    )

    /**
     * fontFamily header
     */
    public actual val `header`: FontFamily = FontFamily(
        Font("font/s_b_sans_display_light.otf", FontWeight(300), FontStyle.Normal),
        Font("font/s_b_sans_display_thin.otf", FontWeight(100), FontStyle.Normal),
        Font("font/s_b_sans_display_bold.otf", FontWeight(700), FontStyle.Normal),
        Font("font/s_b_sans_display_regular.otf", FontWeight(400), FontStyle.Normal),
        Font("font/s_b_sans_display_semibold.otf", FontWeight(600), FontStyle.Normal),
        Font("font/s_b_sans_display_medium.otf", FontWeight(500), FontStyle.Normal),
    )

    /**
     * fontFamily text
     */
    public actual val text: FontFamily = FontFamily(
        Font("font/s_b_sans_text_light.otf", FontWeight(300), FontStyle.Normal),
        Font("font/s_b_sans_text_italic.otf", FontWeight(400), FontStyle.Italic),
        Font("font/s_b_sans_text_semibold_italic.otf", FontWeight(600), FontStyle.Italic),
        Font("font/s_b_sans_text_thin.otf", FontWeight(100), FontStyle.Normal),
        Font("font/s_b_sans_text_regular.otf", FontWeight(400), FontStyle.Normal),
        Font("font/s_b_sans_text_semibold.otf", FontWeight(600), FontStyle.Normal),
        Font("font/s_b_sans_text_light_italic.otf", FontWeight(300), FontStyle.Italic),
        Font("font/s_b_sans_text_bold.otf", FontWeight(700), FontStyle.Normal),
        Font("font/s_b_sans_text_bold_italic.otf", FontWeight(700), FontStyle.Italic),
        Font("font/s_b_sans_text_medium.otf", FontWeight(500), FontStyle.Normal),
    )

    /**
     * fontFamily body
     */
    public actual val body: FontFamily = FontFamily(
        Font("font/s_b_sans_text_light.otf", FontWeight(300), FontStyle.Normal),
        Font("font/s_b_sans_text_italic.otf", FontWeight(400), FontStyle.Italic),
        Font("font/s_b_sans_text_semibold_italic.otf", FontWeight(600), FontStyle.Italic),
        Font("font/s_b_sans_text_thin.otf", FontWeight(100), FontStyle.Normal),
        Font("font/s_b_sans_text_regular.otf", FontWeight(400), FontStyle.Normal),
        Font("font/s_b_sans_text_semibold.otf", FontWeight(600), FontStyle.Normal),
        Font("font/s_b_sans_text_light_italic.otf", FontWeight(300), FontStyle.Italic),
        Font("font/s_b_sans_text_bold.otf", FontWeight(700), FontStyle.Normal),
        Font("font/s_b_sans_text_bold_italic.otf", FontWeight(700), FontStyle.Italic),
        Font("font/s_b_sans_text_medium.otf", FontWeight(500), FontStyle.Normal),
    )
}
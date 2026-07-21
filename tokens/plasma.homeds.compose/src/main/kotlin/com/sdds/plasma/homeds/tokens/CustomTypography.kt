package com.sdds.plasma.homeds.tokens

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sdds.plasma.homeds.compose.R

/**
 * FontFamily
 */
val SBLCDFontFamily = FontFamily(
    Font(
        R.font.sblcd,
        FontWeight(400),
    ),
)

/**
 * typography
 */
object SBLCDTypography {

    val sblcdXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,
    )

    val sblcdS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 28.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,
    )

    val sblcdM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 40.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,

    )

    val sblcdFractionXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 9.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    val sblcdFractionS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    val sblcdFractionM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 26.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    val sblcdSeparatorXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 10.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    val sblcdSeparatorS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    val sblcdSeparatorM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 29.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )
}

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

    /** Стиль основного значения размера XS. */
    val sblcdXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,
    )

    /** Стиль основного значения размера S. */
    val sblcdS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 28.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,
    )

    /** Стиль основного значения размера M. */
    val sblcdM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 40.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.2.em,

    )

    /** Стиль дробной части значения размера XS. */
    val sblcdFractionXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 9.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    /** Стиль дробной части значения размера S. */
    val sblcdFractionS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    /** Стиль дробной части значения размера M. */
    val sblcdFractionM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 26.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    /** Стиль разделителя значения размера XS. */
    val sblcdSeparatorXs: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 10.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    /** Стиль разделителя значения размера S. */
    val sblcdSeparatorS: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )

    /** Стиль разделителя значения размера M. */
    val sblcdSeparatorM: TextStyle = TextStyle(
        fontFamily = SBLCDFontFamily,
        fontSize = 29.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.05.em,
    )
}

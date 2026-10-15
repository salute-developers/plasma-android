package com.sdds.preview.compose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.graphics.Gradients
import com.sdds.preview.contract.GradientLayer
import com.sdds.preview.contract.PreviewFontStyle
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.TokenValue

/** Подготовленные Compose-значения темы с типизированным доступом по token ID. */
public class PreparedComposeTheme internal constructor(
    private val colors: Map<String, Color>,
    private val dimensions: Map<String, Dp>,
    private val shapes: Map<String, RoundedCornerShape>,
    private val shadows: Map<String, List<PreparedShadowLayer>>,
    private val gradients: Map<String, Brush> = emptyMap(),
    private val fontFamilies: Map<String, FontFamily>,
    private val typography: Map<String, TextStyle>,
    private val icons: PreviewIconRegistry = PreviewIconRegistry(),
) {
    /** Возвращает цвет по token ID. */
    public fun color(id: String): Color? = colors[id]

    /** Возвращает размер по token ID. */
    public fun dimension(id: String): Dp? = dimensions[id]

    /** Возвращает форму по token ID. */
    public fun shape(id: String): RoundedCornerShape? = shapes[id]

    /** Возвращает слои тени по token ID. */
    public fun shadow(id: String): List<PreparedShadowLayer>? = shadows[id]

    /** Возвращает линейный градиент по token ID. */
    public fun gradient(id: String): Brush? = gradients[id]

    /** Возвращает подготовленное семейство шрифтов по token ID. */
    public fun fontFamily(id: String): FontFamily? = fontFamilies[id]

    /** Возвращает подготовленный стиль текста по token ID. */
    public fun typography(id: String): TextStyle? = typography[id]

    /** Та же тема с реестром иконок [icons]: имена иконок из payload ищутся в нём. */
    public fun withIcons(icons: PreviewIconRegistry): PreparedComposeTheme = PreparedComposeTheme(
        colors = colors,
        dimensions = dimensions,
        shapes = shapes,
        shadows = shadows,
        gradients = gradients,
        fontFamilies = fontFamilies,
        typography = typography,
        icons = icons,
    )

    /** Возвращает источник иконки по имени из конфигурации (`disclosure.down.fill.16`). */
    public fun icon(name: String): ImageSource? = icons.find(name)

    /** Известна ли иконка с таким именем. */
    public fun hasIcon(name: String): Boolean = icons.contains(name)
}

/** Слой тени в значениях Compose; Compose [androidx.compose.ui.graphics.Shadow] не хранит spread. */
public data class PreparedShadowLayer(
    /** Цвет. */ val color: Color,
    /** Смещение по X. */ val offsetX: Dp,
    /** Смещение по Y. */ val offsetY: Dp,
    /** Радиус размытия. */ val blurRadius: Dp,
    /** Растяжение. */ val spreadRadius: Dp,
)

/** Накладывает прозрачность [alpha] на альфа-канал цвета. */
public fun Color.withAlphaFactor(alpha: Float): Color = copy(alpha = this.alpha * alpha)

/** Преобразует поддержанные theme tokens, игнорируя неизвестные и неподготовленные значения. */
public fun PreviewPayload.prepareComposeTheme(
    preparedFontFamilies: Map<String, FontFamily> = emptyMap(),
    icons: PreviewIconRegistry = PreviewIconRegistry(),
): PreparedComposeTheme {
    val colors = theme.mapNotNullValues { (it as? TokenValue.Color)?.value?.toComposeColorOrNull() }
    val dimensions = theme.mapNotNullValues { (it as? TokenValue.Dimension)?.value?.dp }
    val shapes = theme.mapNotNull { (id, value) ->
        val shape = when {
            id == "round.circle" -> CircleShape
            else -> (value as? TokenValue.Shape)?.cornerRadii?.takeIf { it.size == 4 }?.let {
                RoundedCornerShape(it[0].dp, it[1].dp, it[2].dp, it[3].dp)
            }
        }
        shape?.let { id to it }
    }.toMap()
    val shadows = theme.mapNotNullValues { value ->
        (value as? TokenValue.Shadow)?.layers?.mapNotNull { layer ->
            layer.color.toComposeColorOrNull()?.let {
                PreparedShadowLayer(it, layer.x.dp, layer.y.dp, layer.blur.dp, layer.spread.dp)
            }
        }
    }
    // Brush не умеет накладывать слои, поэтому для токена используется первый слой градиента.
    val gradients = theme.mapNotNullValues { value ->
        (value as? TokenValue.Gradient)?.layers?.firstOrNull()?.toBrushOrNull()
    }
    val typography = theme.mapNotNullValues { value ->
        (value as? TokenValue.Typography)?.let { token ->
            val family = preparedFontFamilies[token.fontFamilyTokenId] ?: return@mapNotNullValues null
            TextStyle(
                fontFamily = family,
                fontSize = token.fontSize.sp,
                lineHeight = token.lineHeight.sp,
                letterSpacing = token.letterSpacing.sp,
                fontWeight = FontWeight(token.weight),
            )
        }
    }
    return PreparedComposeTheme(
        colors = colors,
        dimensions = dimensions,
        shapes = shapes,
        shadows = shadows,
        gradients = gradients,
        fontFamilies = preparedFontFamilies,
        typography = typography,
        icons = icons,
    )
}

/**
 * Загружает обязательные assets, собирает font families и только затем typography.
 * Для family с `allowFallback=true` ошибка face заменяется на [FontFamily.Default].
 */
public suspend fun PreviewPayload.prepareComposeTheme(
    assetResolver: PreviewAssetResolver,
    fontFamilyFactory: LoadedFontFamilyFactory,
): PreparedComposeTheme {
    val assetsById = assets.associateBy { it.id }
    val families = theme.mapNotNullValues { value ->
        val family = value as? TokenValue.FontFamily ?: return@mapNotNullValues null
        runCatching {
            val faces = family.faces.map { face ->
                val asset = requireNotNull(assetsById[face.assetId]) { "Font asset ${face.assetId} не найден" }
                LoadedFontFace(
                    identity = asset.digest ?: asset.id,
                    bytes = assetResolver.resolve(asset),
                    weight = face.weight,
                    italic = face.style == PreviewFontStyle.ITALIC,
                )
            }
            fontFamilyFactory.create(faces)
        }.getOrElse { error ->
            if (family.allowFallback) FontFamily.Default else throw error
        }
    }
    return prepareComposeTheme(families)
}

/** Преобразует `#RRGGBB` или `#RRGGBBAA` в Compose ARGB [Color]. */
public fun String.toComposeColorOrNull(): Color? {
    val rgbaText = when {
        firstOrNull() != '#' -> null
        length == 7 -> "${drop(1)}FF"
        length == 9 -> drop(1)
        else -> null
    }
    val rgba = rgbaText?.toULongOrNull(16) ?: return null
    val argb = ((rgba and 0xFFu) shl 24) or (rgba shr 8)
    return Color(argb.toLong())
}

private fun GradientLayer.toBrushOrNull(): Brush? {
    val colors = stops.map { it.color.toComposeColorOrNull() ?: return null }
    // Угол по соглашению CSS и UIKit: 0° — снизу вверх, 90° — слева направо, 180° — сверху вниз.
    return if (colors.size < 2) null else Gradients.Linear(colors, stops.map { it.position.toFloat() }, angle.toFloat())
}

private inline fun <K, V, R : Any> Map<K, V>.mapNotNullValues(transform: (V) -> R?): Map<K, R> =
    mapNotNull { (key, value) -> transform(value)?.let { key to it } }.toMap()

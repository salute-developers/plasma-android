package com.sdds.preview.contract

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

/** Текущая версия Preview Protocol. */
public const val PREVIEW_PROTOCOL_VERSION: Int = 1

/** Платформа preview renderer. */
@Serializable
public enum class PreviewPlatform {
    /** Android View renderer. */
    ANDROID,

    /** Compose renderer. */
    COMPOSE,

    /** Web renderer. */
    WEB,

    /** iOS renderer. */
    IOS,
}

/** Тип runtime-ресурса preview. */
@Serializable
public enum class PreviewAssetType {
    /** Шрифт TrueType. */
    TTF,

    /** Шрифт OpenType. */
    OTF,

    /** Векторное изображение SVG. */
    SVG,

    /** Растровое изображение PNG. */
    PNG,
}

/** Описание ресурса, доступного renderer во время выполнения. */
@Serializable
public data class PreviewAsset(
    /** Стабильный идентификатор ресурса. */ val id: String,
    /** Тип ресурса. */ val type: PreviewAssetType,
    /** URL для загрузки ресурса. */ val url: String,
    /** Необязательный digest содержимого для проверки и кеширования. */ val digest: String? = null,
)

/** Начертание шрифта. */
@Serializable
public enum class PreviewFontStyle {
    /** Обычное начертание. */
    NORMAL,

    /** Курсивное начертание. */
    ITALIC,
}

/** Начертание font-family, связанное с runtime-ресурсом. */
@Serializable
public data class PreviewFontFace(
    /** Идентификатор font asset. */ val assetId: String,
    /** Числовой вес шрифта. */ val weight: Int,
    /** Стиль шрифта. */ val style: PreviewFontStyle = PreviewFontStyle.NORMAL,
)

/** Нормализованное значение токена, готовое к использованию renderer. */
@Serializable
public sealed interface TokenValue {
    /** Цвет. */
    @Serializable
    @SerialName("color")
    public data class Color(/** Значение цвета. */ val value: String) : TokenValue

    /** Размер в dp. */
    @Serializable
    @SerialName("dimension")
    public data class Dimension(/** Значение в dp. */ val value: Double) : TokenValue

    /** Форма с радиусами углов в dp. */
    @Serializable
    @SerialName("shape")
    public data class Shape(/** Радиусы углов. */ val cornerRadii: List<Double>) : TokenValue

    /** Тень. */
    @Serializable
    @SerialName("shadow")
    public data class Shadow(/** Слои тени. */ val layers: List<ShadowLayer>) : TokenValue

    /** Градиент из линейных слоёв. */
    @Serializable
    @SerialName("gradient")
    public data class Gradient(/** Слои градиента. */ val layers: List<GradientLayer>) : TokenValue

    /** Семейство runtime-шрифтов. */
    @Serializable
    @SerialName("fontFamily")
    public data class FontFamily(
        /** Доступные начертания семейства. */ val faces: List<PreviewFontFace>,
        /** Разрешить системный fallback при недоступности font asset. */ val allowFallback: Boolean = false,
    ) : TokenValue

    /** Параметры текста. */
    @Serializable
    @SerialName("typography")
    public data class Typography(
        /** Идентификатор font-family token. */ val fontFamilyTokenId: String,
        /** Размер шрифта в sp. */ val fontSize: Double,
        /** Высота строки в sp. */ val lineHeight: Double,
        /** Межбуквенный интервал в sp. */ val letterSpacing: Double,
        /** Вес шрифта. */ val weight: Int,
    ) : TokenValue
}

/** Источник effective-значения component property. */
@Serializable
public sealed interface PreviewPropertySource {
    /** Нормализованное literal-значение. */
    @Serializable
    @SerialName("literal")
    public data class Literal(
        /** Значение без platform UI типов. */ val value: JsonElement,
        /** Прозрачность от 0 до 1, применяемая к цвету. */ val alpha: Double? = null,
    ) : PreviewPropertySource

    /** Ссылка на token из [PreviewPayload.theme]. */
    @Serializable
    @SerialName("tokenRef")
    public data class TokenReference(
        /** Идентификатор token. */ val tokenId: String,
        /** Прозрачность от 0 до 1, применяемая к цвету. */ val alpha: Double? = null,
    ) : PreviewPropertySource

    /** Ссылка на вложенный стиль из [PreviewPayload.styles]. */
    @Serializable
    @SerialName("styleRef")
    public data class StyleReference(/** Идентификатор стиля. */ val styleId: String) : PreviewPropertySource

    /** Ссылка на ресурс из [PreviewPayload.assets]. */
    @Serializable
    @SerialName("assetRef")
    public data class AssetReference(/** Идентификатор ресурса. */ val assetId: String) : PreviewPropertySource
}

/** Значение property для набора одновременно активных состояний. */
@Serializable
public data class PreviewStateEntry(
    /** Имена состояний; запись действует, когда активны все. */
    @SerialName("when") val states: List<String>,
    /** Значение для этого набора состояний. */ val source: PreviewPropertySource,
)

/** Effective-значение property с необязательными значениями для наборов состояний. */
@Serializable
public data class PreviewPropertyValue(
    /** Базовое значение. */ val base: PreviewPropertySource,
    /** Упорядоченные значения для наборов состояний. */
    val states: List<PreviewStateEntry> = emptyList(),
)

/** Вложенный стиль компонента, на который ссылается [PreviewPropertySource.StyleReference]. */
@Serializable
public data class PreviewStyle(
    /** Идентификатор компонента, которому принадлежит стиль. */ val component: String,
    /** Вычисленные properties стиля. */ val properties: Map<String, PreviewPropertyValue> = emptyMap(),
)

/** Точка градиента. */
@Serializable
public data class GradientStop(
    /** Цвет в формате `#RRGGBBAA`. */ val color: String,
    /** Позиция от 0 до 1. */ val position: Double,
)

/** Линейный слой градиента. */
@Serializable
public data class GradientLayer(
    /** Угол в градусах по соглашению CSS: 0° снизу вверх, 90° слева направо. */ val angle: Double,
    /** Точки градиента, не менее двух. */ val stops: List<GradientStop>,
    /** Вид слоя. */ val kind: String = "linear",
)

/** Один слой тени. */
@Serializable
public data class ShadowLayer(
    /** X-смещение в dp. */ val x: Double,
    /** Y-смещение в dp. */ val y: Double,
    /** Радиус размытия в dp. */ val blur: Double,
    /** Растяжение в dp. */ val spread: Double,
    /** Цвет. */ val color: String,
)

/** Effective-конфигурация компонента, готовая к rendering. */
@Serializable
public data class PreviewComponent(
    /** Идентификатор компонента. */ val id: String,
    /** Выбранные styles по variation axes. */ val variations: Map<String, String> = emptyMap(),
    /** Вычисленные component properties. */ val properties: Map<String, PreviewPropertyValue> = emptyMap(),
)

/** Runtime-данные демонстрационного экземпляра. */
@Serializable
public data class PreviewExample(
    /** Идентификатор story. */ val id: String,
    /** Runtime properties и content. */ val props: Map<String, JsonElement> = emptyMap(),
)

/** Необязательные параметры области rendering. */
@Serializable
public data class PreviewSurface(
    /** Ширина в pixels. */ val width: Int,
    /** Высота в pixels. */ val height: Int,
    /** Цвет фона. */ val background: String? = null,
)

/** Полная инструкция для одного preview render. */
@Serializable
public data class PreviewPayload(
    /** Версия протокола. */ val protocolVersion: Int = PREVIEW_PROTOCOL_VERSION,
    /** Идентификатор render request. */ val requestId: String,
    /** Платформа renderer. */ val platform: PreviewPlatform,
    /** Runtime-ресурсы, необходимые renderer. */ val assets: List<PreviewAsset> = emptyList(),
    /** Вычисленные значения темы по token ID. */ val theme: Map<String, TokenValue>,
    /** Effective-конфигурация компонента. */ val component: PreviewComponent,
    /** Вложенные стили по идентификаторам. */ val styles: Map<String, PreviewStyle> = emptyMap(),
    /** Runtime-данные примера. */ val example: PreviewExample,
    /** Параметры области rendering. */ val surface: PreviewSurface? = null,
)

/** Результат обработки preview request. */
@Serializable
public sealed interface PreviewResult {
    /** Идентификатор исходного request. */
    public val requestId: String

    /** Rendering успешно завершён. */
    @Serializable
    @SerialName("success")
    public data class Success(
        override val requestId: String,
        /** Предупреждения, не меняющие статус результата. */ val warnings: List<PreviewWarning> = emptyList(),
    ) : PreviewResult

    /** Rendering завершён ошибкой. */
    @Serializable
    @SerialName("failure")
    public data class Failure(
        override val requestId: String,
        /** Стабильный код ошибки. */ val code: String,
        /** Сообщение для человека. */ val message: String,
        /** Путь к проблемному полю. */ val path: String? = null,
    ) : PreviewResult
}

/** Предупреждение успешного результата. */
@Serializable
public data class PreviewWarning(
    /** Стабильный код предупреждения. */ val code: String,
    /** Сообщение для человека. */ val message: String,
    /** Путь к проблемному полю. */ val path: String? = null,
)

/** JSON-конфигурация Preview Protocol. */
public val PreviewContractJson: Json = Json {
    classDiscriminator = "type"
    ignoreUnknownKeys = true
    explicitNulls = false
    encodeDefaults = true
}

/** Проверяет поддерживаемую версию payload. */
public fun PreviewPayload.validateVersion(): PreviewResult.Failure? =
    if (protocolVersion == PREVIEW_PROTOCOL_VERSION) {
        null
    } else {
        PreviewResult.Failure(
            requestId = requestId,
            code = "unsupported_protocol_version",
            message = "Preview Protocol $protocolVersion не поддерживается",
            path = "$.protocolVersion",
        )
    }

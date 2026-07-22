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

    /** Параметры текста. */
    @Serializable
    @SerialName("typography")
    public data class Typography(
        /** Семейство шрифта. */ val fontFamily: String,
        /** Размер шрифта в dp. */ val fontSize: Double,
        /** Высота строки в dp. */ val lineHeight: Double,
        /** Вес шрифта. */ val weight: Int,
    ) : TokenValue
}

/** Один слой тени. */
@Serializable
public data class ShadowLayer(
    /** X-смещение в dp. */ val x: Double,
    /** Y-смещение в dp. */ val y: Double,
    /** Радиус размытия в dp. */ val blur: Double,
    /** Цвет. */ val color: String,
)

/** Effective-конфигурация компонента, готовая к rendering. */
@Serializable
public data class PreviewComponent(
    /** Идентификатор компонента. */ val id: String,
    /** Выбранные styles по variation axes. */ val variations: Map<String, String> = emptyMap(),
    /** Вычисленные component properties. */ val properties: Map<String, JsonElement> = emptyMap(),
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
    /** Вычисленные значения темы по token ID. */ val theme: Map<String, TokenValue>,
    /** Effective-конфигурация компонента. */ val component: PreviewComponent,
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
    public data class Success(override val requestId: String) : PreviewResult

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

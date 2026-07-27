package com.sdds.preview.contract

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Runtime-neutral описание зарегистрированной component story. */
@Serializable
public data class PreviewComponentDescription(
    /** Версия Preview Protocol, в которой опубликовано описание. */
    val protocolVersion: Int = PREVIEW_PROTOCOL_VERSION,
    /** Идентификатор компонента, принимаемый renderer. */
    val componentId: String,
    /** Идентификатор story, используемой renderer. */
    val storyId: String,
    /** Поддерживаемые example properties в порядке story producer. */
    val properties: List<PreviewExamplePropertyDescription>,
)

/** Runtime-neutral описание example property и его типизированного default value. */
@Serializable
public sealed interface PreviewExamplePropertyDescription {
    /** Wire key, принимаемый state transformer. */
    public val name: String

    /** Строковое property. */
    @Serializable
    @SerialName("string")
    public data class StringProperty(
        override val name: String,
        /** Значение story по умолчанию. */
        val defaultValue: String,
    ) : PreviewExamplePropertyDescription

    /** Логическое property. */
    @Serializable
    @SerialName("boolean")
    public data class BooleanProperty(
        override val name: String,
        /** Значение story по умолчанию. */
        val defaultValue: Boolean,
    ) : PreviewExamplePropertyDescription

    /** Целочисленное property. */
    @Serializable
    @SerialName("int")
    public data class IntProperty(
        override val name: String,
        /** Значение story по умолчанию. */
        val defaultValue: Int,
    ) : PreviewExamplePropertyDescription

    /** Property с плавающей точкой. */
    @Serializable
    @SerialName("float")
    public data class FloatProperty(
        override val name: String,
        /** Значение story по умолчанию. */
        val defaultValue: Float,
    ) : PreviewExamplePropertyDescription

    /** Property с выбором одного значения из фиксированного списка. */
    @Serializable
    @SerialName("singleChoice")
    public data class SingleChoiceProperty(
        override val name: String,
        /** Значение story по умолчанию. */
        val defaultValue: String,
        /** Допустимые значения property. */
        val variants: List<String>,
    ) : PreviewExamplePropertyDescription
}

/** Коррелированный результат запроса component description. */
@Serializable
public sealed interface PreviewComponentDescriptionResult {
    /** Идентификатор исходного describe request. */
    public val requestId: String

    /** Description успешно получено. */
    @Serializable
    @SerialName("success")
    public data class Success(
        override val requestId: String,
        /** Описание зарегистрированной story. */
        val description: PreviewComponentDescription,
    ) : PreviewComponentDescriptionResult

    /** Description не удалось получить. */
    @Serializable
    @SerialName("failure")
    public data class Failure(
        override val requestId: String,
        /** Стабильный код ошибки. */
        val code: String,
        /** Сообщение для человека. */
        val message: String,
    ) : PreviewComponentDescriptionResult
}

/** Проверяет semantic constraints component description. */
public fun PreviewComponentDescription.validate(): List<String> {
    val errors = mutableListOf<String>()
    if (protocolVersion != PREVIEW_PROTOCOL_VERSION) errors += "protocolVersion не поддерживается"
    if (componentId.isBlank()) errors += "componentId не должен быть пустым"
    if (storyId.isBlank()) errors += "storyId не должен быть пустым"
    val duplicateNames = properties.groupingBy { it.name }.eachCount().filterValues { it > 1 }.keys
    if (duplicateNames.isNotEmpty()) errors += "Имена properties должны быть уникальны: $duplicateNames"
    properties.forEach { property ->
        if (property.name.isBlank()) errors += "Имя property не должно быть пустым"
        if (property is PreviewExamplePropertyDescription.SingleChoiceProperty) {
            if (property.variants.isEmpty()) errors += "${property.name}: variants не должны быть пустыми"
            if (property.defaultValue !in property.variants) {
                errors += "${property.name}: defaultValue должен входить в variants"
            }
        }
    }
    return errors
}

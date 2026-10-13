package com.sdds.preview.generator

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import java.io.File
import java.util.zip.ZipFile

/** Запись api-меты `uikit-compose-api-meta.json` об одном компоненте и его билдере стиля. */
@Serializable
internal data class ComponentMeta(
    val componentName: String,
    val qualifiedName: String,
    val styleQualifiedName: String,
    val builderFunName: String = "",
    val stateEnum: StateEnumMeta? = null,
    val params: List<ParamMeta>,
)

/** Enum кастомных состояний компонента. */
@Serializable
internal data class StateEnumMeta(
    val qualifiedName: String,
    val simpleName: String,
    val values: List<EnumValueMeta>,
)

/** Значение enum: имя константы и имя в конфигурации DS Builder. */
@Serializable
internal data class EnumValueMeta(
    val name: String,
    val configName: String = name,
)

/** Одна перегрузка метода билдера (в мете каждая перегрузка отдельной записью). */
@Serializable
internal data class ParamMeta(
    val type: String,
    val id: String,
    val methodName: String,
    val paramQualifiedType: String,
    val paramSimpleType: String,
    val group: String,
    val valueQualifiedType: String = "",
    val values: List<EnumValueMeta> = emptyList(),
    /** Пометка `@ApiDeprecated`: такие свойства не генерируются, как и в Theme Builder. */
    val deprecated: JsonElement? = null,
)

private val metaJson = Json { ignoreUnknownKeys = true }

private const val META_RESOURCE = "sdds/api/uikit-compose-api-meta.json"

/** Читает мету из JSON-файла либо из JAR с ресурсом [META_RESOURCE]. */
internal fun readApiMeta(source: File): List<ComponentMeta> {
    val text = if (source.extension == "jar") {
        ZipFile(source).use { zip ->
            val entry = requireNotNull(zip.getEntry(META_RESOURCE)) { "В ${source.path} нет ресурса $META_RESOURCE" }
            zip.getInputStream(entry).bufferedReader().readText()
        }
    } else {
        source.readText()
    }
    return metaJson.decodeFromString(text)
}

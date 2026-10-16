package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.sandbox.StoryEntry
import com.sdds.sandbox.StoryRegistry
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import java.io.File

/** Группа компонентов песочницы: имя и компоненты по алфавиту. */
internal data class PreviewComponentGroup(
    val name: String,
    val components: List<String>,
)

/**
 * Группы компонентов по реестру историй: порядок групп как в песочнице (`ComponentGroup.ordinal`), внутри группы
 * компоненты по алфавиту. Группа компонента — группа ключа его истории.
 */
internal fun previewComponentGroups(entries: List<StoryEntry>): List<PreviewComponentGroup> =
    entries.groupBy { it.story.component.group }
        .toSortedMap(compareBy({ it.ordinal }, { it.displayName }))
        .map { (group, members) ->
            PreviewComponentGroup(group.displayName, members.map { it.componentId }.sorted())
        }

/** JSON `{"groups": [{"name": ..., "components": [...]}]}`, который `generatePreviewManifest` кладёт в манифест. */
internal fun List<PreviewComponentGroup>.toManifestJson(): String =
    Json { prettyPrint = true }.encodeToString(
        JsonObject.serializer(),
        JsonObject(
            mapOf(
                "groups" to JsonArray(
                    map { group ->
                        JsonObject(
                            mapOf(
                                "name" to JsonPrimitive(group.name),
                                "components" to JsonArray(group.components.map(::JsonPrimitive)),
                            ),
                        )
                    },
                ),
            ),
        ),
    )

/** Запускается Gradle-задачей `generatePreviewGroups`: первый аргумент — путь выходного файла. */
public fun main(args: Array<String>) {
    require(args.size == 1) { "Ожидается путь выходного файла групп" }
    StoryRegistry.clear()
    registerStories()
    File(args.single()).apply { parentFile.mkdirs() }
        .writeText(previewComponentGroups(StoryRegistry.previewEntries()).toManifestJson() + "\n")
}

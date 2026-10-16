package com.sdds.sandbox.ksp.internal

/**
 * Проверяет идентификаторы компонентов preview. Пустой `componentId` допустим: история не участвует в preview.
 *
 * @return сообщения об ошибках (пустой список, если всё корректно)
 */
internal fun validateComponentIds(stories: List<StoryDeclaration>): List<String> {
    val errors = mutableListOf<String>()
    stories.filter { it.componentId.isNotEmpty() && it.componentId != it.componentId.trim() }.forEach {
        errors += "@Story(componentId = \"${it.componentId}\") у ${it.className}: пробелы по краям не допускаются"
    }
    stories.filter { it.componentId.isNotBlank() }
        .groupBy { it.componentId.trim() }
        .filterValues { it.size > 1 }
        .toSortedMap()
        .forEach { (id, declarations) ->
            errors += "componentId \"$id\" объявлен у нескольких историй: " +
                declarations.map { it.className }.sorted().joinToString()
        }
    return errors
}

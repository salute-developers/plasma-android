package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSType

internal data class StoriesRegistryData(
    val stories: List<StoryData>,
)

internal data class StoryData(
    val storyClass: KSType,
    val sourceFile: KSFile?,
    /** Значение `@Story(componentId)`; пустая строка, если история не участвует в Compose preview. */
    val componentId: String = "",
    /** Полное имя класса стиля из `ComposeBaseStory<State, Style>`; пустая строка для историй без Compose-стиля. */
    val styleQualifiedName: String = "",
)

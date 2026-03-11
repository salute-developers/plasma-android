package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.symbol.KSType

internal data class StoriesRegistryData(
    val stories: List<StoryData>,
)

internal data class StoryData(
    val storyClass: KSType,
)

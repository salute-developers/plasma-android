package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSType

internal data class StoryStateData(
    val name: String,
    val file: KSFile,
    val uiStateClass: KSType,
    val parameters: List<ParameterData>,
)

internal class ParameterData(
    val name: String,
    val type: KSType,
    val displayName: String?,
    val producerClassType: KSType?,
    val transformerClassType: KSType?,
)
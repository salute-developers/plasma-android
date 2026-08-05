package com.sdds.plugin.themebuilder.documentation

import kotlinx.serialization.Serializable

@Serializable
internal data class SampleMeta(
    val id: String,
    val kind: String,
    val fqName: String,
    val file: String,
    val snippetPath: String,
    val snippetStartOffset: Int,
    val snippetEndOffset: Int,
)

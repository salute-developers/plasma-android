package com.sdds.compose.uikit.internal.codeinput

import androidx.compose.runtime.Immutable

@Immutable
internal data class CodeGroupInfo(val groups: List<Int>) {
    val codeLength = groups.sum()
    val groupCount = groups.size
}

internal fun codeGroups(codeGroupBuilder: CodeGroupBuilder.() -> Unit): CodeGroupInfo {
    val builder = CodeGroupBuilder().apply(codeGroupBuilder)
    return CodeGroupInfo(builder.groups)
}

internal class CodeGroupBuilder {
    internal val groups = mutableListOf<Int>()

    fun group(itemCount: Int): CodeGroupBuilder {
        groups.add(itemCount)
        return this
    }
}

package com.sdds.uikit.internal.codefield

internal data class CodeGroup(val groups: List<Int>) {
    val codeLength = groups.sum()
    val groupCount = groups.size
}

internal fun codeGroups(
    codeLength: Int,
    codeGroupBuilder: CodeGroupBuilder.() -> Unit,
): CodeGroup {
    val builder = CodeGroupBuilder(codeLength).apply(codeGroupBuilder)
    val total = builder.groups.sum()
    require(total == codeLength) {
        "Groups length ($total) must be equal codeLength ($codeLength)"
    }
    return CodeGroup(builder.groups)
}

internal class CodeGroupBuilder(private val expectedLength: Int) {
    internal val groups = mutableListOf<Int>()

    fun group(itemCount: Int): CodeGroupBuilder {
        require(itemCount > 0) { "Group size must be greater then 0" }
        groups.add(itemCount)
        return this
    }
    fun equalGroups(groupSize: Int) {
        require(expectedLength % groupSize == 0) {
            "Code length ($expectedLength) must be divisible by ($groupSize)"
        }
        repeat(expectedLength / groupSize) { group(groupSize) }
    }

    fun splitBy(sizes: List<Int>) {
        require(sizes.all { it > 0 }) { "Sizes must be greater then 0" }
        val total = sizes.sum()
        require(total == expectedLength) {
            "Split sizes length ($total) must be equal codeLength ($expectedLength)"
        }
        groups.addAll(sizes)
    }
}

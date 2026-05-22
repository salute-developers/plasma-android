package com.sdds.plugin.themebuilder.internal.universal

internal class ImportCollector {
    private val _importSet = mutableSetOf<Import>()

    val importList: List<Import>
        get() = _importSet.toList()

    fun addImport(pkg: String, name: String) {
        _importSet.add(Import(pkg, name))
    }

    data class Import(
        val pck: String,
        val name: String,
    )
}

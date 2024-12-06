package com.sdds.plugin.themebuilder.internal

internal class PackageResolver(private val commonPackage: String) {

    fun getPackage(targetPackage: TargetPackage): String {
        return getPackage(targetPackage.packageName)
    }

    fun getPackage(targetPackage: String? = null): String {
        return targetPackage?.let { "$commonPackage.$it" } ?: commonPackage
    }
}

internal enum class TargetPackage(val packageName: String) {
    TOKENS("tokens"),
    THEME("theme"),
    STYLES("styles"),
}

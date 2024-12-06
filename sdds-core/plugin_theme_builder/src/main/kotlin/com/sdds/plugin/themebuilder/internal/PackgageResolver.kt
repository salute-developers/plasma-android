package com.sdds.plugin.themebuilder.internal

internal class PackageResolver(private val commonPackage: String) {

    fun getPackage(targetPackage: TargetPackage? = null): String {
        return targetPackage?.let { "$commonPackage.${it.packageName}" } ?: commonPackage
    }
}

internal enum class TargetPackage(val packageName: String) {
    TOKENS("tokens"),
    THEME("theme"),
    STYLES("styles"),
}

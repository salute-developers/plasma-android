package com.sdds.plugin.themebuilder.internal.tenant

internal data class Tenant(val name: String) {

    internal companion object {
        val Default: Tenant = Tenant("")
    }
}

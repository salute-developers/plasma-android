@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.root-project")
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.gradlePluginPublish) apply false
}

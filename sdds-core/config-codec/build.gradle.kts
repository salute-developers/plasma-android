plugins {
    id("convention.kotlin-java-version-sync")
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    implementation(libs.base.kotlin.serialization.json)
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}

tasks.register<JavaExec>("runConfigCodec") {
    group = "application"
    description = "Run Config Codec with parameters"
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("com.sdds.utils.config.codec.AppKt")

    args = listOf(
        "/Users/21934234/data/plasma-android/sdds-core/config-codec/src/test/resources/text_field_common.json",
        "/Users/21934234/data/plasma-android/sdds-core/config-codec/src/test/resources/text_field_native.json",
        "encode"
    )
}

plugins {
    id("org.gradle.kotlin.kotlin-dsl")
}

dependencies {
    implementation(libs.base.kotlin.stdlib)
    implementation(libs.base.kotlin.reflect)

    implementation(libs.base.gradle.android) {
        exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk7")
        exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk8")
    }
    implementation(libs.base.gradle.cacheFix)
    implementation(libs.base.gradle.kotlin)
    implementation(libs.base.gradle.paparazzi)
    implementation(libs.base.gradle.detekt)
    implementation(libs.base.gradle.spotless)
    implementation(libs.base.gradle.nexusPublish)
    implementation(libs.base.dokka.graddle)
    implementation(libs.base.gradle.compose)
    implementation(libs.base.dokka)

    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.unit.mockk)
}


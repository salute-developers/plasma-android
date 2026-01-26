import utils.withVersionCatalogs

plugins {
    kotlin("jvm")
    id("convention.detekt")
    id("convention.spotless")
    id("convention.kotlin-java-version-sync")
}

dependencies {
    withVersionCatalogs {
        implementation(base.kotlin.stdlib)
        testImplementation(base.test.unit.jUnit)
        testImplementation(base.test.unit.mockk)
        testImplementation(base.test.unit.robolectric)
    }
}

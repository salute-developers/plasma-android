import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
}

group = "sdds-core"

android {
    namespace = "com.sdds.docs"
}

kotlin {
    addDefaultTargets()
    androidTarget {
        publishLibraryVariants("release")
    }
    sourceSets{
        jvmMain{
            dependencies {
                implementation(libs.base.kotlin.ksp)
            }
        }
        commonMain {
            dependencies {
                implementation(compose.runtime)
            }
        }
    }
}


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
    jvm()
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

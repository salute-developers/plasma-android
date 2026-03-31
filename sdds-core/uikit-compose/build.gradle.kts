import utils.addDefaultTargets

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.dokka")
    alias(libs.plugins.binary.compatibility.validator)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit"
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.preview)
                implementation(compose.uiTooling)
                implementation(compose.animation)
                implementation("sdds-haze:haze")

            }
        }

        androidMain {
            dependencies {
                implementation(libs.base.androidX.lifecycle.compose.viewmodel)
            }
        }

        val skikoMain by creating {
            dependsOn(commonMain.get())
        }

//        iosMain {
//            dependsOn(skikoMain)
//        }

        jvmMain {
            dependsOn(skikoMain)
        }

//        named("wasmJsMain") {
//            dependsOn(skikoMain)
//        }
//
//        jsMain {
//            dependsOn(skikoMain)
//        }

        commonTest {

        }

        jvmTest {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

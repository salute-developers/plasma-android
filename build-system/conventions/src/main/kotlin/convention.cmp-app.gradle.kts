import com.android.build.gradle.internal.api.BaseVariantOutputImpl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import utils.versionInfo
import utils.withVersionCatalogs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("convention.detekt")
    id("convention.spotless")
}

kotlin {
    androidTarget {
        withVersionCatalogs {
            compilations.all {
                this@androidTarget.compilerOptions {
                    jvmTarget.set(JvmTarget.fromTarget(versions.global.jvmTarget.get()))
                }
            }
        }
    }
    jvm()
}


android {
    val vInfo = versionInfo()
    withVersionCatalogs {
        compileSdk = versions.global.compileSdk.get().toInt()

        defaultConfig {
            applicationVariants.all {
                outputs.all {
                    val output = this as BaseVariantOutputImpl
                    output.outputFileName = output.outputFileName
                        .replace(".apk", "-${vInfo.fullArtifactName}.apk")
                }
            }
            minSdk = versions.global.minSdk.get().toInt()
            targetSdk = versions.global.targetSdk.get().toInt()
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            versionCode = vInfo.code
            versionName = vInfo.name
            versionNameSuffix = vInfo.nameSuffix

        }
    }

    signingConfigs {
        create("release") {
            if (System.getenv("KEY_STORE_FILE") != null) {
                storeFile = file(System.getenv("KEY_STORE_FILE"))
                storePassword = System.getenv("RELEASE_STORE_PASSWORD")
                keyAlias = System.getenv("RELEASE_KEY_ALIAS")
                keyPassword = System.getenv("RELEASE_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            if (System.getenv("KEY_STORE_FILE") != null) {
                signingConfig = signingConfigs.getByName("release")
            }
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}

withVersionCatalogs {
    configurations.configureEach {
        if (name.startsWith("kotlinCompilerPluginClasspath")) {
            resolutionStrategy.dependencySubstitution {
                val compilerVersion = versions.androidX.compose.compiler.get()
                substitute(module("org.jetbrains.compose.compiler:compiler"))
                    .using(module("androidx.compose.compiler:compiler:$compilerVersion"))
            }
        }
    }
}

import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.kotlin
import org.jetbrains.kotlin.gradle.tasks.KaptGenerateStubs
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import utils.withVersionCatalogs

description = "Синхронизация версий Java для Kotlin и Java задач"

withVersionCatalogs {
    tasks.withType<KaptGenerateStubs>().configureEach {
        kotlinOptions {
            jvmTarget = versions.global.jvmTarget.get()
        }
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = versions.global.jvmTarget.get()
            freeCompilerArgs = freeCompilerArgs +
                "-opt-in=kotlin.RequiresOptIn"
        }
    }
    tasks.withType<JavaCompile>().configureEach {
        // по другому подставляет Java17
        sourceCompatibility = versions.global.jvmTarget.get()
        targetCompatibility = versions.global.jvmTarget.get()
    }

    kotlin {
        jvmToolchain(8)
    }
}

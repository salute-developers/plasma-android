import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KaptGenerateStubs
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import utils.withVersionCatalogs

description = "Синхронизация версий Java для Kotlin и Java задач"

withVersionCatalogs {
    tasks.withType<KaptGenerateStubs>().configureEach {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(versions.global.jvmTarget.get()))
        }
    }

    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(versions.global.jvmTarget.get()))
            freeCompilerArgs.add("-opt-in=kotlin.RequiresOptIn")
        }
    }
    tasks.withType<JavaCompile>().configureEach {
        sourceCompatibility = versions.global.jvmTarget.get()
        targetCompatibility = versions.global.jvmTarget.get()
    }
}

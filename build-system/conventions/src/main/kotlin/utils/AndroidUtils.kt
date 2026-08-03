package utils

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/**
 * Применяет общие настройки android library (compileSdk, minSdk, версия Java)
 * для мультиплатформенных модулей, чтобы не дублировать их в каждом build-скрипте.
 *
 * @param namespace если задан — проставляется в android.namespace.
 */
fun Project.configureAndroidLibraryDefaults(namespace: String? = null) {
    configure<LibraryExtension> {
        if (namespace != null) {
            this.namespace = namespace
        }

        withVersionCatalogs {
            compileSdk = versions.global.compileSdk.get().toInt()

            defaultConfig {
                minSdk = versions.global.minSdk.get().toInt()
            }

            compileOptions {
                sourceCompatibility = JavaVersion.toVersion(versions.global.jvmTarget.get())
                targetCompatibility = JavaVersion.toVersion(versions.global.jvmTarget.get())
            }
        }
    }
}

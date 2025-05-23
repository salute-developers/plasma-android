import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import utils.withVersionCatalogs

val extension = app() ?: lib() ?: throwApplyException()
extension.configureCompose()

fun app(): CommonExtension<*, *, *, *, *>? =
    extensions.findByType<ApplicationExtension>()

fun lib(): CommonExtension<*, *, *, *, *>? =
    extensions.findByType<LibraryExtension>()

fun throwApplyException(): Nothing =
    throw UnknownDomainObjectException(
        "Unable to locate ApplicationExtension or LibraryExtension. " +
            "The plugin can be applied for android application or android library."
    )

fun CommonExtension<*, *, *, *, *>.configureCompose() = withVersionCatalogs {
    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = versions.androidX.compose.compiler.get()

    dependencies {
        // Эта зависимость в обязательном порядке нужна компилятору Compose по этому есть смысл
        // подключать ее всегда.
        add("implementation", platform(base.androidX.compose.bom))
        add("implementation", base.androidX.compose.runtime)
    }
}

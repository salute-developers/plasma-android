package tasks.integration

import org.gradle.configurationcache.extensions.capitalized
import java.io.File

internal data class Config(
    val name: String,
    val packageName: String,
    val components: List<Component>
)

internal data class Component(
    val key: String,
    val coreName: String,
    val styleName: String,
    val variations: List<VariationInfo>
)

internal data class VariationInfo(
    val name: String,
    val composeReference: String = "",
    val viewOverlayReference: String = "",
)

abstract class ComponentGenerator {

    abstract fun generate()

    protected fun expand(template: String, values: Map<String, String>): String {
        var result = template
        values.forEach { (k, v) ->
            result = result.replace("\${{ $k }}", v)
        }
        return result
    }

    protected fun Any.loadTemplate(path: String): String {
        return this::class.java.classLoader.getResource(path)?.readText().orEmpty()
    }

}

internal class ComposeComponentsGenerator(
    private val config: Config,
    private val packageName: String,
    private val packageDir: File,
) : ComponentGenerator() {

    private val themeName = config.name.toPascalCase()

    override fun generate() {
        config.components.forEach {
            createStyleProvider(
                themeName = themeName,
                component = it,
                packageName = packageName,
                themePackageName = config.packageName,
                packageDir = packageDir
            )
        }
        createComponentProvider()
    }

    private fun createStyleProvider(
        themeName: String,
        component: Component,
        packageName: String,
        themePackageName: String,
        packageDir: File,
    ) {
        val styleProviderTemplate = loadTemplate("ComposeStyleProviderKt.txt").trim()
        val styleInstanceTemplate = loadTemplate("ComposeStyleInstanceKt.txt")
        val importTemplate = loadTemplate("ComposeImportInstanceKt.txt")

        val styleContent = component.variations
            .joinToString("\n") {
                expand(
                    styleInstanceTemplate,
                    mapOf(
                        "variationName" to it.name.toPascalCase("."),
                        "variationReference" to it.composeReference
                    )
                )
            }

        val variationImports = component.variations
            .flatMap {
                it.composeReference
                    .removePrefix(component.styleName)
                    .split(".")
                    .drop(1)
            }
            .distinct()
            .joinToString("\n") {
                expand(
                    importTemplate,
                    mapOf(
                        "themePackageName" to themePackageName,
                        "componentPackage" to getComponentStylePackageName(component),
                        "variation" to it.toPascalCase(),
                    )
                )
            }

        val providerContent = expand(
            styleProviderTemplate,
            mapOf(
                "packageName" to packageName,
                "themeName" to themeName,
                "coreName" to component.coreName,
                "componentPackage" to getComponentStylePackageName(component),
                "styleName" to component.styleName,
                "themePackageName" to themePackageName,
                "variations" to styleContent,
                "variationImports" to variationImports,
                "coreStyleClass" to getCoreStyleClass(component)
            )
        )

        val outFile = File(packageDir, "${themeName}${component.styleName}VariationsCompose.kt")
        outFile.parentFile?.mkdirs()
        outFile.writeText(providerContent)
    }

    private fun getComponentStylePackageName(component: Component): String {
        return when (component.coreName) {
            "Switch" -> "switcher"
            else -> component.coreName.lowercase()
        }
    }

    private fun getCoreStyleClass(component: Component): String {
        return when (component.coreName) {
            "BasicButton",
            "IconButton",
            "LinkButton" -> "ButtonStyle"
            "TextArea" -> "TextFieldStyle"
            "IconBadge" -> "BadgeStyle"
            "BottomSheet" -> "ModalBottomSheetStyle"
            "TabItem",
            "IconTabItem" -> "TabItemStyle"
            else -> "${component.coreName}Style"
        }
    }

    private fun createComponentProvider() {
        val componentTemplate = loadTemplate("ComposeComponentInstanceKt.txt").trim()
        val appearanceTemplate = loadTemplate("ComposeAppearanceInstanceKt.txt").trim()
        val providerTemplate = loadTemplate("ComposeComponentProviderKt.txt").trim()

        // Group components by coreName
        val grouped: Map<String, List<Component>> = config.components.groupBy { it.key }

        // Build appearances per group and a ViewComponent per coreName (unique key)
        val componentEntries = grouped.map { (key, comps) ->
            val appearancesBlock = comps.joinToString(
                separator = ",\n            "
            ) { comp ->
                expand(
                    appearanceTemplate,
                    mapOf(
                        "styleName" to comp.styleName,
                        "themeName" to themeName
                    )
                )
            }

            expand(
                componentTemplate,
                mapOf(
                    "key" to key.techToCamelCase(),
                    "appearances" to appearancesBlock
                )
            )
        }.joinToString(separator = ",\n            ")

        val providerContent = expand(
            providerTemplate,
            mapOf(
                "packageName" to packageName,
                "themeName" to themeName,
                "components" to componentEntries
            )
        )

        val outFile = File(packageDir, "${themeName}ComposeComponents.kt")
        outFile.parentFile?.mkdirs()
        outFile.writeText(providerContent)
    }
}

internal class XmlComponentsGenerator(
    private val config: Config,
    private val packageName: String,
    private val packageDir: File,
) : ComponentGenerator() {

    private val themeName = config.name.toPascalCase()

    override fun generate() {
        config.components.forEach {
            createViewStyleProvider(
                themeName = themeName,
                component = it,
                packageName = packageName,
                themePackageName = config.packageName,
                packageDir = packageDir
            )
        }
        createViewComponentProvider(themeName, config.components, packageName, packageDir)
    }

    private fun createViewStyleProvider(
        themeName: String,
        component: Component,
        packageName: String,
        themePackageName: String,
        packageDir: File,
    ) {
        val styleProviderTemplate = loadTemplate("ViewStyleProviderKt.txt").trim()
        val styleInstanceTemplate = loadTemplate("ViewStyleInstanceKt.txt")

        val styleContent = component.variations
            .joinToString("\n") {
                expand(
                    styleInstanceTemplate, mapOf(
                        "variationName" to it.name.toPascalCase("."),
                        "variationReference" to it.viewOverlayReference.replace(".", "_")
                    )
                )
            }

        val providerContent = expand(
            styleProviderTemplate, mapOf(
                "packageName" to packageName,
                "themeName" to themeName,
                "styleName" to component.styleName,
                "themePackageName" to themePackageName,
                "variations" to styleContent
            )
        )

        val outFile = File(packageDir, "${themeName}${component.styleName}VariationsView.kt")
        outFile.parentFile?.mkdirs()
        outFile.writeText(providerContent)
    }

    private fun createViewComponentProvider(
        themeName: String,
        components: List<Component>,
        packageName: String,
        packageDir: File,
    ) {
        val componentTemplate = loadTemplate("ViewComponentInstanceKt.txt").trim()
        val appearanceTemplate = loadTemplate("ViewAppearanceInstanceKt.txt").trim()
        val providerTemplate = loadTemplate("ViewComponentProviderKt.txt").trim()

        // Group components by coreName
        val grouped: Map<String, List<Component>> = components.groupBy { it.key }

        // Build appearances per group and a ViewComponent per coreName (unique key)
        val componentEntries = grouped.map { (key, comps) ->
            val appearancesJoined = comps.joinToString(
                separator = ",\n            "
            ) { comp ->
                expand(
                    appearanceTemplate,
                    mapOf(
                        "styleName" to comp.styleName,
                        "themeName" to themeName
                    )
                )
            }

            val appearancesBlock = appearancesJoined

            expand(
                componentTemplate,
                mapOf(
                    "key" to key.techToCamelCase(),
                    "appearances" to appearancesBlock
                )
            )
        }.joinToString(separator = ",\n            ")

        val providerContent = expand(
            providerTemplate,
            mapOf(
                "packageName" to packageName,
                "themeName" to themeName,
                "components" to componentEntries
            )
        )

        val outFile = File(packageDir, "${themeName}ViewComponents.kt")
        outFile.parentFile?.mkdirs()
        outFile.writeText(providerContent)
    }
}

private fun String.toPascalCase(joinSeparator: String = ""): String =
    this
        .split(".")
        .joinToString(joinSeparator) { part ->
            part.split(Regex("[^A-Za-z0-9]+"))
            .filter { it.isNotBlank() }
            .joinToString("") { it.replaceFirstChar { c -> c.uppercaseChar() } }
        }


internal fun String.techToCamelCase(): String {
    val segments = split(".", "-")
    return segments.joinToString("") { it.capitalized() }
}
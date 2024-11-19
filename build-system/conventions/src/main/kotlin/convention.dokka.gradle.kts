import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import utils.withVersionCatalogs

withVersionCatalogs {
    apply(plugin = plugins.dokka.get().pluginId)
}

tasks.withType<DokkaTask>().configureEach {
    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        val images =
             file("$projectDir/docs_assets/")
                .takeIf { it.exists() && it.isDirectory }
                ?.walk()
                ?.filter { it.isFile }
                ?.toList()
        if ( images != null) {
            customAssets = images
        }
    }
    dokkaSourceSets {
        configureEach {
            documentedVisibilities.set(setOf(DokkaConfiguration.Visibility.PUBLIC))
            suppressInheritedMembers.set(true)
        }
    }
    outputDirectory.set(buildDir.resolve("dokka"))
}

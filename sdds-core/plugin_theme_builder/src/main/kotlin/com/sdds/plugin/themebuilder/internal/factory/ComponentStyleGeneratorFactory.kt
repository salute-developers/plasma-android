package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.button.BasicButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.components.button.ButtonStyleGeneratorComposeFactory
import com.sdds.plugin.themebuilder.internal.components.button.IconButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.components.button.LinkButtonStyleGeneratorCompose
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.file.DirectoryProperty
import java.io.File

internal class ComponentStyleGeneratorFactory(
    private val outputDirPath: String,
    private val projectDir: DirectoryProperty,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val themeName: String,
    private val packageResolver: PackageResolver,
) {
    private val outputDir: File by unsafeLazy {
        projectDir.get().dir(outputDirPath).asFile
    }

    private val buttonStyleGeneratorComposeFactory by unsafeLazy {
        ButtonStyleGeneratorComposeFactory(
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            ktFileBuilderFactory = ktFileBuilderFactory,
            themeName = themeName,
            packageResolver = packageResolver,
        )
    }

    fun createBasicButtonStyleGeneratorCompose(): BasicButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createBasicButtonGenerator()

    fun createIconButtonStyleGeneratorCompose(): IconButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createIconButtonGenerator()

    fun createLinkButtonStyleGeneratorCompose(): LinkButtonStyleGeneratorCompose =
        buttonStyleGeneratorComposeFactory.createLinkButtonGenerator()
}

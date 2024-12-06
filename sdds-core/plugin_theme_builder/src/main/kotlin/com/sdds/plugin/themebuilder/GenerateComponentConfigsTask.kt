package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.components.ButtonComponentConfig
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

internal abstract class GenerateComponentConfigsTask : DefaultTask() {

    @get:InputFile
    abstract val basicButtonConfigFile: RegularFileProperty

    @get:InputFile
    abstract val iconButtonConfigFile: RegularFileProperty

    @get:InputFile
    abstract val linkButtonConfigFile: RegularFileProperty

    @TaskAction
    fun generate() {
        basicButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
            .also { println("BasicButton: $it") }

        iconButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
            .also { println("IconButton: $it") }

        linkButtonConfigFile.get()
            .asFile
            .decode<ButtonComponentConfig>(Serializer.componentConfig)
            .also { println("LinkButton: $it") }
    }
}

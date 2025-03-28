package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.components.base.Components
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.provideDelegate

internal abstract class GenerateComponentsTask : DefaultTask() {

    /**
     * Meta-файл с информацией о компонентах
     */
    @get:InputFile
    abstract val componentsMetaFile: RegularFileProperty

    private val componentsMetaInfo: Components by unsafeLazy {
        componentsMetaFile.get()
            .asFile
            .decode(Serializer.componentConfig)
    }

    @TaskAction
    fun generate() {
        println(componentsMetaInfo)
    }
}

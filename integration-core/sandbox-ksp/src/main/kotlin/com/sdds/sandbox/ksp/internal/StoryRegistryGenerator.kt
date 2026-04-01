package com.sdds.sandbox.ksp.internal

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.buildCodeBlock
import com.squareup.kotlinpoet.ksp.toClassName

internal class StoryRegistryGenerator(
    private val packageName: String,
) : StoryClassBuilder<StoriesRegistryData> {

    private val fileNameWithSuffix = "Stories"

    private val fileSpecBuilder by lazy(LazyThreadSafetyMode.NONE) { FileSpec.builder(packageName, fileNameWithSuffix) }

    override fun build(data: StoriesRegistryData): FileSpec {
        fileSpecBuilder.addRegistry(data)
        return fileSpecBuilder.build()
    }

    private fun FileSpec.Builder.addRegistry(data: StoriesRegistryData) {
        addImport(
            "com.sdds.sandbox",
            "register",
        )
        val builder = FunSpec.builder("registerStories")
            .addModifiers(KModifier.INTERNAL)
            .addCode(
                buildCodeBlock { addRegistryStatements(data.stories) },
            )
        addFunction(builder.build())
    }

    private fun CodeBlock.Builder.addRegistryStatements(
        data: List<StoryData>,
    ) {
        data.forEach { story ->
            val storyClass = story.storyClass.toClassName()
            add("%T.register()\n", storyClass)
        }
    }
}

package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.validate

internal class SandboxStoryProcessor(
    private val codeGenerator: CodeGenerator,
    private val packageName: String,
    private val logger: KSPLogger,
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val annotatedSymbols = resolver.getSymbolsWithAnnotation(
            "com.sdds.sandbox.Story",
        ).groupBy { it.validate() }

        val validSymbols = annotatedSymbols[true].orEmpty()

        validSymbols
            .filterIsInstance<KSClassDeclaration>()
            .map { classDeclaration ->
                require(classDeclaration.classKind == ClassKind.OBJECT) {
                    "Expected object, got ${classDeclaration.classKind}"
                }
                StoryData(
                    storyClass = classDeclaration.asStarProjectedType(),
                    sourceFile = classDeclaration.containingFile,
                )
            }
            .let { StoriesRegistryData(it) }
            .generateRegistry()

        return annotatedSymbols[false].orEmpty()
    }

    private fun StoriesRegistryData.generateRegistry() {
        if (stories.isEmpty()) return
        val registryGenerator = StoryRegistryGenerator(packageName)
        val fileSpec = registryGenerator.build(this)
        val outputStream = codeGenerator.createNewFile(
            dependencies = Dependencies(
                aggregating = true,
                sources = stories.mapNotNull { it.sourceFile }.toTypedArray(),
            ),
            packageName = fileSpec.packageName,
            fileName = fileSpec.name,
        )
        outputStream.writer().use(fileSpec::writeTo)
    }
}

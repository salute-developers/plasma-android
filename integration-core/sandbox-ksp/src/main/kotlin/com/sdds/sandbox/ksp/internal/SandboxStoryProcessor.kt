package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.validate

private const val STORY_ANNOTATION = "com.sdds.sandbox.Story"
private const val COMPOSE_BASE_STORY = "com.sdds.compose.sandbox.ComposeBaseStory"
private const val STYLE_ARGUMENT_INDEX = 1

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
                    componentId = classDeclaration.componentId(),
                    styleQualifiedName = classDeclaration.composeStyleQualifiedName(),
                )
            }
            .also { stories -> reportInvalidComponentIds(stories) }
            .let { StoriesRegistryData(it) }
            .generateRegistry()

        return annotatedSymbols[false].orEmpty()
    }

    private fun reportInvalidComponentIds(stories: List<StoryData>) {
        val declarations = stories.map {
            StoryDeclaration(it.storyClass.declaration.qualifiedName?.asString().orEmpty(), it.componentId)
        }
        validateComponentIds(declarations).forEach(logger::error)
    }

    private fun KSClassDeclaration.componentId(): String =
        annotations.firstOrNull {
            it.annotationType.resolve().declaration.qualifiedName?.asString() == STORY_ANNOTATION
        }
            ?.arguments
            ?.firstOrNull { it.name?.asString() == "componentId" }
            ?.value as? String
            ?: ""

    /** Класс стиля из `ComposeBaseStory<State, Style>` (2-й аргумент типа); пустая строка, если история не Compose. */
    private fun KSClassDeclaration.composeStyleQualifiedName(): String =
        getAllSuperTypes()
            .firstOrNull { it.declaration.qualifiedName?.asString() == COMPOSE_BASE_STORY }
            ?.arguments
            ?.getOrNull(STYLE_ARGUMENT_INDEX)
            ?.type
            ?.resolve()
            ?.qualifiedName()
            .orEmpty()

    private fun KSType.qualifiedName(): String? = declaration.qualifiedName?.asString()

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

package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.isPublic
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.validate

internal class SandboxStoryStateProcessor(
    private val codeGenerator: CodeGenerator,
    private val packageName: String,
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val annotatedSymbols = resolver.getSymbolsWithAnnotation(
            "com.sdds.sandbox.StoryUiState"
        ).groupBy { it.validate() }

        val validSymbols = annotatedSymbols[true].orEmpty()

        validSymbols
            .filterIsInstance<KSClassDeclaration>()
            .mapNotNull { classDeclaration ->
                require(classDeclaration.classKind == ClassKind.CLASS) {
                    "Expected class, got ${classDeclaration.classKind}"
                }
                StoryStateData(
                    name = classDeclaration.simpleName.asString(),
                    file = classDeclaration.containingFile ?: return@mapNotNull null,
                    parameters = classDeclaration.toParameterDataList(),
                    uiStateClass = classDeclaration.asStarProjectedType(),
                )
            }.forEach { data ->
                data.generateProducer()
                data.generateTransformer()
            }

        return annotatedSymbols[false].orEmpty()
    }

    private fun StoryStateData.generateProducer() {
        val producerGenerator = StoryPropertiesProducerGenerator(packageName, name)
        producerGenerator.generate(this)
    }

    private fun StoryStateData.generateTransformer() {
        val transformerGenerator = StoryStateTransformerGenerator(packageName, name)
        transformerGenerator.generate(this)
    }

    private fun StoryClassBuilder<StoryStateData>.generate(data: StoryStateData) {
        val fileSpec = this.build(data)
        val outputStream = codeGenerator.createNewFile(
            dependencies = Dependencies(aggregating = false, data.file),
            packageName = fileSpec.packageName,
            fileName = fileSpec.name,
        )
        outputStream.writer().use(fileSpec::writeTo)
    }

    private fun KSClassDeclaration.toParameterDataList(): List<ParameterData> {
        val props = getAllProperties()
            .filter { it.isPublic() }
            .filterNot { it.isCompanionObjectProperty() }
            .filterNot { it.isIgnoredProperty() }
            .toList()

        return props.map { prop ->
            val name = prop.simpleName.asString()
            val type = prop.type.resolve()

            val storyProp = prop.annotations.firstOrNull { ann ->
                ann.annotationType.resolve().declaration.qualifiedName?.asString() == "com.sdds.sandbox.StoryProperty"
            }

            val displayName = storyProp
                ?.arguments
                ?.firstOrNull { it.name?.asString() == "name" }
                ?.value as? String

            val producedBy = storyProp
                ?.arguments
                ?.firstOrNull { it.name?.asString() == "producedBy" }
                ?.value as? KSType

            val transformedBy = storyProp
                ?.arguments
                ?.firstOrNull { it.name?.asString() == "transformedBy" }
                ?.value as? KSType

            ParameterData(
                name = name,
                type = type,
                displayName = displayName?.takeIf { it.isNotBlank() } ,
                producerClassType = producedBy?.takeIf { !it.isUnit() },
                transformerClassType = transformedBy?.takeIf { !it.isUnit() },
            )
        }
    }
}
package com.sdds.sandbox.ksp.internal

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.buildCodeBlock
import com.squareup.kotlinpoet.ksp.toTypeName

internal class StoryStateTransformerGenerator(
    private val packageName: String,
    fileName: String,
): StoryClassBuilder<StoryStateData> {

    private val fileNameWithSuffix = "${fileName}Transformer"

    private val fileSpecBuilder by lazy(LazyThreadSafetyMode.NONE) { FileSpec.builder(packageName, fileNameWithSuffix) }
    private val stateTransformerType = ClassName("com.sdds.sandbox", "StateTransformer")
    private val keepAnnotation = ClassName("androidx.annotation", "Keep")

    override fun build(data: StoryStateData): FileSpec {
        fileSpecBuilder.addTransformer(data)
//        fileSpecBuilder.addTransformerEntryPoint(data)
        return fileSpecBuilder.build()
    }

    private fun FileSpec.Builder.addTransformer(data: StoryStateData) {
        val uiStateType = data.uiStateClass.toTypeName()
        val builder = TypeSpec.objectBuilder("${data.name}Transformer")
            .addModifiers(KModifier.PUBLIC)
            .addSuperinterface(stateTransformerType.parameterizedBy(uiStateType))
            .addFunction(
                FunSpec.builder("transform")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter(ParameterSpec.builder(STATE_PARAM_NAME, uiStateType).build())
                    .addParameter(ParameterSpec.builder(PROP_NAME_PARAM_NAME, String::class).build())
                    .addParameter(ParameterSpec.builder(PROP_VALUE_PARAM_NAME, Any::class).build())
                    .addCode(
                        buildCodeBlock {
                            addTransformerStatements(data.parameters)
                        }
                    )
                    .returns(uiStateType)
                    .build()
            )
        addType(builder.build())
    }

    private fun FileSpec.Builder.addTransformerEntryPoint(data: StoryStateData) {
        val uiStateType = data.uiStateClass.toTypeName()
        val builder = FunSpec.builder("transformer")
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(keepAnnotation)
            .receiver(uiStateType)
            .addCode(buildCodeBlock {
                add("return ${data.name}Transformer")
            })
            .returns(stateTransformerType.parameterizedBy(uiStateType))

        addFunction(builder.build())
    }

    private fun CodeBlock.Builder.addTransformerStatements(
        parameters: List<ParameterData>,
        stateVar: String = STATE_PARAM_NAME
    ) {
        // We always parse from string to keep `value: Any` compatible with UI/serialization layers.
        add("val valueString = %L.toString()\n", PROP_VALUE_PARAM_NAME)
        add("return when (%L) {\n", PROP_NAME_PARAM_NAME)

        parameters.forEach { param ->
            val propName = param.name
            val displayName = param.displayName ?: param.name

            // Base parsed expression from string -> target type
            val parsedExpr: CodeBlock = when {
                // Enum
                param.type.declaration is com.google.devtools.ksp.symbol.KSClassDeclaration &&
                    (param.type.declaration as com.google.devtools.ksp.symbol.KSClassDeclaration).classKind ==
                    com.google.devtools.ksp.symbol.ClassKind.ENUM_CLASS -> {
                    // For enums we can safely use valueOf(String)
                    val enumType = param.type.toTypeName()
                    CodeBlock.of("%T.valueOf(valueString)", enumType)
                }

                // Primitives / common types
                param.type.declaration.qualifiedName?.asString() == "kotlin.Int" ->
                    CodeBlock.of("valueString.toInt()")

                param.type.declaration.qualifiedName?.asString() == "kotlin.Long" ->
                    CodeBlock.of("valueString.toLong()")

                param.type.declaration.qualifiedName?.asString() == "kotlin.Float" ->
                    CodeBlock.of("valueString.toFloat()")

                param.type.declaration.qualifiedName?.asString() == "kotlin.Double" ->
                    CodeBlock.of("valueString.toDouble()")

                param.type.declaration.qualifiedName?.asString() == "kotlin.Boolean" ->
                    // non-strict keeps backward compatibility with many existing inputs
                    CodeBlock.of("valueString.toBoolean()")

                param.type.declaration.qualifiedName?.asString() == "kotlin.String" ->
                    CodeBlock.of("valueString")

                else -> {
                    // Fallback: keep string (works for most custom serialization use-cases)
                    CodeBlock.of("valueString")
                }
            }

            // If a value transformer is provided, apply it to the parsed value.
            // NOTE: `transformedBy = Xxx::class` is expected to reference an `object` with `transform(...)`.
            val finalValueExpr: CodeBlock = if (param.transformerClassType != null) {
                val transformerType = param.transformerClassType.toTypeName()
                CodeBlock.of("%T.transform(%L)", transformerType, parsedExpr)
            } else {
                parsedExpr
            }

            add(
                "%S -> %L.copy(%L = %L)\n",
                displayName,
                stateVar,
                propName,
                finalValueExpr,
            )
        }

        add("else -> %L\n", stateVar)
        add("}\n")
    }

    private companion object {
        const val STATE_PARAM_NAME = "state"
        const val PROP_NAME_PARAM_NAME = "name"
        const val PROP_VALUE_PARAM_NAME = "value"
    }
}
package com.sdds.sandbox.ksp.internal

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.buildCodeBlock
import com.squareup.kotlinpoet.ksp.toTypeName

internal class StoryPropertiesProducerGenerator(
    private val packageName: String,
    fileName: String,
): StoryClassBuilder<StoryStateData> {

    private val fileNameWithSuffix = "${fileName}PropertiesProducer"

    private val fileSpecBuilder by lazy(LazyThreadSafetyMode.NONE) { FileSpec.builder(packageName, fileNameWithSuffix) }
    private val propertiesProducerType = ClassName("com.sdds.sandbox", "PropertiesProducer")
    private val propertyType = ClassName("com.sdds.sandbox", "Property")
    private val keepAnnotation = ClassName("androidx.annotation", "Keep")

    override fun build(data: StoryStateData): FileSpec {
        fileSpecBuilder.addProducer(data)
//        fileSpecBuilder.addProducerEntryPoint(data)
        return fileSpecBuilder.build()
    }

    private fun FileSpec.Builder.addProducer(data: StoryStateData) {
        val uiStateType = data.uiStateClass.toTypeName()
        val builder = TypeSpec.objectBuilder("${data.name}PropertiesProducer")
            .addModifiers(KModifier.PUBLIC)
            .addSuperinterface(propertiesProducerType.parameterizedBy(uiStateType))
            .addFunction(
                FunSpec.builder("getProperties")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter(ParameterSpec.builder(STATE_PARAM_NAME, uiStateType)
                        .build())
                    .addCode(
                        buildCodeBlock {
                            addProducerPropertiesList(data.parameters)
                        }
                    )
                    .returns(LIST.parameterizedBy(propertyType.parameterizedBy(STAR)))
                    .build()
            )
        addType(builder.build())
    }

    private fun FileSpec.Builder.addProducerEntryPoint(data: StoryStateData) {
        val uiStateType = data.uiStateClass.toTypeName()
        val builder = FunSpec.builder("producer")
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(keepAnnotation)
            .receiver(uiStateType)
            .addCode(buildCodeBlock {
                add("return ${data.name}PropertiesProducer")
            })
            .returns(propertiesProducerType.parameterizedBy(uiStateType))

        addFunction(builder.build())
    }

    private fun CodeBlock.Builder.addProducerPropertiesList(
        parameters: List<ParameterData>,
        stateVar: String = STATE_PARAM_NAME
    ) {
        add("return listOf(\n")

        parameters.forEach { param ->
            val name = param.name
            val displayName = param.displayName ?: name

            // если есть кастомный producer → используем его
            val producerType = param.producerClassType
            if (producerType != null) {
                val producer = producerType.toTypeName()
                val instanceInvocation = if (producerType.isObject()) "T" else "T()"
                add("%$instanceInvocation.produce($stateVar),\n", producer)
                return@forEach
            }

            // enum → enumProperty(...)
            if (param.type.isEnum()) {
                add(
                    "enumProperty(name = %S, value = $stateVar.%L),\n",
                    displayName,
                    name
                )
                return@forEach
            }

            // базовые типы
            when (param.type.declaration.qualifiedName?.asString()) {
                "kotlin.Int" -> add(
                    "%T.IntProperty(name = %S, value = $stateVar.%L),\n",
                    ClassName("com.sdds.sandbox", "Property"),
                    displayName,
                    name
                )

                "kotlin.Boolean" -> add(
                    "%T.BooleanProperty(name = %S, value = $stateVar.%L),\n",
                    ClassName("com.sdds.sandbox", "Property"),
                    displayName,
                    name
                )

                "kotlin.Float" -> add(
                    "%T.FloatProperty(name = %S, value = $stateVar.%L),\n",
                    ClassName("com.sdds.sandbox", "Property"),
                    displayName,
                    name
                )

                else -> {
                    // fallback → StringProperty
                    add(
                        "%T.StringProperty(name = %S, value = $stateVar.%L),\n",
                        ClassName("com.sdds.sandbox", "Property"),
                        displayName,
                        name
                    )
                }
            }
        }

        add(")\n")
    }

    private companion object {
        const val STATE_PARAM_NAME = "state"
    }
}
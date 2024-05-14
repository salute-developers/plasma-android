package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.attributes.data.AttributeData
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор kt-атрибутов
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для kt-файлов
 */
internal class KtAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
) {

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(CORE_COLORS_NAME)
    }

    /**
     * Генерирует kt-атрибуты
     *
     * @param attributeData данные об атрибутах
     */
    fun generate(attributeData: AttributeData) {
        with(attributeData) {
            generateColors()
        }
    }

    private fun AttributeData.generateColors() {
        if (colors.isEmpty()) return

        addCoreColorsImports()
        addCoreColorsClass()
        addLocalColorsVal()
        addDebugColorsFun()
        addCoreColorsImplClass()

        colorKtFileBuilder.build(outputLocation)
    }

    private fun AttributeData.addCoreColorsImplClass() {
        with(colorKtFileBuilder) {
            val rootCoreColorsImplClass = rootClass(
                name = CORE_COLORS_IMPL_NAME,
                modifiers = listOf(Modifier.PRIVATE),
                constructorParams = this@addCoreColorsImplClass.colors.map {
                    KtFileBuilder.FunParameter(
                        name = it,
                        type = KtFileBuilder.TypeColor,
                    )
                },
                superType = typeCoreColors,
            )

            this@addCoreColorsImplClass.colors.forEach { color ->
                rootCoreColorsImplClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeColor,
                    modifiers = listOf(Modifier.OVERRIDE),
                    isMutable = true,
                    delegate = "mutableStateOf($color, structuralEqualityPolicy())",
                )
            }

            rootCoreColorsImplClass.appendFun(
                name = "updateColorsFrom",
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "other",
                        type = typeCoreColors,
                    ),
                ),
                modifiers = listOf(Modifier.OVERRIDE),
                body = this@addCoreColorsImplClass.colors.map {
                    "$it = other.$it\n"
                },
            )

            rootCoreColorsImplClass.appendFun(
                name = "copy",
                modifiers = listOf(Modifier.OVERRIDE),
                returnType = typeCoreColors,
                params = this@addCoreColorsImplClass.colors.map {
                    KtFileBuilder.FunParameter(
                        name = it,
                        type = KtFileBuilder.TypeColor,
                    )
                },
                body = listOf(
                    "return $CORE_COLORS_IMPL_NAME(${
                        this@addCoreColorsImplClass.colors.joinToString(separator = ",·")
                    })",
                ),
            )
        }
    }

    private fun AttributeData.addDebugColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "debugColors",
            returnType = colorKtFileBuilder.typeCoreColors,
            modifiers = listOf(Modifier.PRIVATE),
            body = listOf(
                "return $CORE_COLORS_IMPL_NAME(${
                    this@addDebugColorsFun.colors.joinToString(
                        separator = ",·",
                    ) { "Color.Black" }
                })",
            ),
        )
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "LocalColors",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorKtFileBuilder.typeCoreColors,
            initializer = "staticCompositionLocalOf { debugColors() }",
        )
    }

    private fun addCoreColorsImports() {
        with(colorKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "structuralEqualityPolicy",
                    "mutableStateOf",
                    "getValue",
                    "setValue",
                    "Stable",
                ),
            )
            addImport(
                packageName = "androidx.compose.ui.graphics",
                names = listOf("Color"),
            )
        }
    }

    private fun AttributeData.addCoreColorsClass() {
        with(colorKtFileBuilder) {
            val rootCoreColorsClass = rootClass(
                name = CORE_COLORS_NAME,
                modifiers = listOf(element = Modifier.ABSTRACT),
                annotation = KtFileBuilder.TypeAnnotationStable,
            )
            this@addCoreColorsClass.colors.forEach { color ->
                rootCoreColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeColor,
                    modifiers = listOf(Modifier.ABSTRACT),
                    isMutable = true,
                    setter = KtFileBuilder.Setter.Empty(modifiers = listOf(Modifier.INTERNAL)),
                )
            }

            rootCoreColorsClass.appendFun(
                name = "copy",
                params = this@addCoreColorsClass.colors.map {
                    KtFileBuilder.FunParameter(
                        name = it,
                        type = KtFileBuilder.TypeColor,
                        defValue = "this.$it",
                    )
                },
                returnType = typeCoreColors,
                modifiers = listOf(Modifier.ABSTRACT),
            )

            rootCoreColorsClass.appendFun(
                name = "updateColorsFrom",
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "other",
                        type = typeCoreColors,
                    ),
                ),
                modifiers = listOf(Modifier.ABSTRACT),
            )

            rootCoreColorsClass.appendFun(
                name = "toString",
                modifiers = listOf(Modifier.OVERRIDE),
                body = listOf(
                    "return \"\${this::class.simpleName}(${
                        this@addCoreColorsClass.colors.joinToString(
                            separator = ",·",
                        ) { "$it=$$it" }
                    })\"",
                ),
            )
        }
    }

    private companion object {
        const val CORE_COLORS_NAME = "CoreColors"
        const val CORE_COLORS_IMPL_NAME = "CoreColorsImpl"
    }
}

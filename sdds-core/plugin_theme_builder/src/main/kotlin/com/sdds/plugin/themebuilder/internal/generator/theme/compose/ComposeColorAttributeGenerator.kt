package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INFIX
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.PRIVATE
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор Compose-атрибутов цвета.
 * Генерирует kt-файл, содержащий в себе все цвета темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeColorAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {

    private var tokenData: ColorTokenResult.TokenData? = null
    private val colorAttributes = mutableSetOf<String>()

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val colorClassName = "${camelThemeName}Colors"
    private val colorClassType by unsafeLazy {
        colorKtFileBuilder.getInternalClassType(colorClassName)
    }

    override fun generate() {
        tokenData ?: return

        addImports()
        addColorsClass()
        addUpdateColorsFromFun()
        addLocalColorsVal()
        addLightColorsFun()
        addDarkColorsFun()
        addColorOverrideScopeClass()

        colorKtFileBuilder.build(outputLocation)
    }

    fun setColorTokenData(data: ColorTokenResult.TokenData) {
        tokenData = data
        colorAttributes.clear()
        colorAttributes.addAll(data.mergedLightAndDark())
    }

    private fun addColorsClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = colorClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = listOf(
                        KtFileBuilder.FunParameter(
                            name = "colors",
                            type = KtFileBuilder.TypeMapOfColors,
                            asProperty = true,
                            modifiers = listOf(PRIVATE),
                        ),
                    ),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Цвета $camelThemeName",
            )

            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeColor,
                    isMutable = true,
                    delegate = "mutableStateOf(colors[\"$color\"]!!, structuralEqualityPolicy())",
                )
            }

            rootColorsClass.appendFun(
                name = "copy",
                returnType = getInternalClassType(colorClassName),
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "overrideColors",
                        type = KtFileBuilder.getLambdaType(
                            receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                        ),
                        defValue = "{}",
                    ),
                ),
                body = listOf(
                    "val colorOverrideScope = ColorOverrideScope()\n",
                    "overrideColors.invoke(colorOverrideScope)\n",
                    "val overrideMap = colorOverrideScope.overrideMap\n",
                    "return $colorClassName(colors.mapValues { overrideMap[it.key] ?: it.value })",
                ),
                description = "Возвращает копию [$colorClassName]. " +
                    "Предоставляет возможность переопределять цвета.",
            )

            rootColorsClass.appendFun(
                name = "toString",
                modifiers = listOf(Modifier.OVERRIDE),
                body = listOf(
                    "return \"\${this::class.simpleName}(${
                        colorAttributes.joinToString(
                            separator = ",·",
                        ) { "$it=$$it" }
                    })\"",
                ),
            )
        }
    }

    private fun addUpdateColorsFromFun() {
        colorKtFileBuilder.appendRootFun(
            name = "updateColorsFrom",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "other",
                    type = colorClassType,
                ),
            ),
            receiver = colorClassType,
            body = colorAttributes.map { "$it = other.$it\n" },
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addLightColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "light${camelThemeName}Colors",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "overrideColors",
                    type = KtFileBuilder.getLambdaType(
                        receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = colorClassType,
            body = listOf(
                "val colorOverrideScope = ColorOverrideScope()\n",
                "overrideColors.invoke(colorOverrideScope)\n",
                "val overrideMap = colorOverrideScope.overrideMap\n",
                "val initialMap = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (tokenData?.light?.get(it) != null) {
                        "LightColorTokens.${tokenData?.light?.get(it)}"
                    } else {
                        "DarkColorTokens.${
                            tokenData?.dark?.get(it) ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initialMap[\"$it\"] = overrideMap[\"$it\"] ?: $defaultValue"
                },
                "\nreturn $colorClassName(initialMap)",
            ),
            description = "Цвета [$colorClassName] для светлой темы",
        )
    }

    private fun addDarkColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "dark${camelThemeName}Colors",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "overrideColors",
                    type = KtFileBuilder.getLambdaType(
                        receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = colorClassType,
            body = listOf(
                "val colorOverrideScope = ColorOverrideScope()\n",
                "overrideColors.invoke(colorOverrideScope)\n",
                "val overrideMap = colorOverrideScope.overrideMap\n",
                "val initialMap = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (tokenData?.dark?.get(it) != null) {
                        "DarkColorTokens.${tokenData?.dark?.get(it)}"
                    } else {
                        "LightColorTokens.${
                            tokenData?.light?.get(it) ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initialMap[\"$it\"] = overrideMap[\"$it\"] ?: $defaultValue"
                },
                "\nreturn $colorClassName(initialMap)",
            ),
            description = "Цвета [$colorClassName] для темной темы",
        )
    }

    private fun addColorOverrideScopeClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = "ColorOverrideScope",
                description = "Скоуп переопределения цветов",
            )

            rootColorsClass.appendProperty(
                name = "_overrideMap",
                typeName = KtFileBuilder.TypeMutableMapOfColors,
                initializer = "mutableMapOf<String, Color>()",
                modifiers = listOf(PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = KtFileBuilder.TypeMapOfColors,
                modifiers = listOf(INTERNAL),
                propGetter = KtFileBuilder.Getter.Annotated(
                    body = "return _overrideMap.toMap()",
                ),
            )

            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$color\"",
                )
            }

            rootColorsClass.appendFun(
                name = "overrideBy",
                params = listOf(
                    KtFileBuilder.FunParameter("color", type = KtFileBuilder.TypeColor),
                ),
                modifiers = listOf(INFIX),
                receiver = KtFileBuilder.TypeString,
                body = listOf("_overrideMap[this] = color"),
            )
        }
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "Local$colorClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorClassType,
            initializer = "staticCompositionLocalOf { light${camelThemeName}Colors() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addImports() {
        with(colorKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "structuralEqualityPolicy",
                    "mutableStateOf",
                    "getValue",
                    "setValue",
                    "Immutable",
                ),
            )
            addImport(
                packageName = "androidx.compose.ui.graphics",
                names = listOf("Color"),
            )
        }
    }
}

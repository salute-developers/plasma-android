package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INFIX
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.PRIVATE
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator.Companion.DARK_COLOR_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator.Companion.LIGHT_COLOR_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.asTypeName

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
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {

    private var tokenData: ColorTokenResult.TokenData? = null
    private val colorAttributes = mutableSetOf<String>()

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName, TargetPackage.THEME)
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
        addMutableMapExtension()
        addLightColorsFun()
        addDarkColorsFun()
        addColorOverrideScopeClass()
        addObtainStateFun()

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
                    delegate = "colors.obtain(\"$color\")",
                    description = tokenData?.description(color),
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
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun addMutableMapExtension() {
        colorKtFileBuilder.appendRootFun(
            name = "add",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "attribute",
                    type = KtFileBuilder.TypeString,
                ),
                KtFileBuilder.FunParameter(
                    name = "defaultTokenValue",
                    type = KtFileBuilder.TypeColor,
                ),
                KtFileBuilder.FunParameter(
                    name = "overwriteMap",
                    type = KtFileBuilder.TypeMapOfColors,
                ),
            ),
            modifiers = listOf(PRIVATE),
            receiver = KtFileBuilder.TypeMutableMapOfColors,
            body = listOf("this[attribute] = overwriteMap[attribute] ?: defaultTokenValue"),
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
                "val overwrite = colorOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (tokenData?.light?.get(it)?.colorRef != null) {
                        "LightColorTokens.${tokenData?.light?.get(it)?.colorRef}"
                    } else {
                        "DarkColorTokens.${
                            tokenData?.dark?.get(it)?.colorRef ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $colorClassName(initial)",
            ),
            description = "Цвета [$colorClassName] для светлой темы",
            suppressAnnotations = listOf("LongMethod"),
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
                "val overwrite = colorOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (tokenData?.dark?.get(it)?.colorRef != null) {
                        "DarkColorTokens.${tokenData?.dark?.get(it)?.colorRef}"
                    } else {
                        "LightColorTokens.${
                            tokenData?.light?.get(it)?.colorRef ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $colorClassName(initial)",
            ),
            description = "Цвета [$colorClassName] для темной темы",
            suppressAnnotations = listOf("LongMethod"),
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
                initializer = "mutableMapOf()",
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
                    description = tokenData?.description(color),
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
                description = "Переопределяет аттрибут цвета.",
            )
        }
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "Local$colorClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorClassType,
            initializer = """
                staticCompositionLocalOf·{
                    light${camelThemeName}Colors()
                }
            """.trimIndent(),
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
            val tokenData = tokenData ?: return
            if (tokenData.dark.isNotEmpty()) {
                addImport(
                    getInternalClassType(
                        className = DARK_COLOR_TOKENS_NAME,
                        classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                    ),
                )
            }
            if (tokenData.light.isNotEmpty()) {
                addImport(
                    getInternalClassType(
                        className = LIGHT_COLOR_TOKENS_NAME,
                        classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                    ),
                )
            }
        }
    }

    private fun addObtainStateFun() {
        colorKtFileBuilder.appendRootFun(
            name = "obtain",
            receiver = KtFileBuilder.TypeMapOfColors,
            returnType = KtFileBuilder.TypeMutableStateOfColor,
            modifiers = listOf(PRIVATE),
            params = listOf(
                KtFileBuilder.FunParameter("name", String::class.asTypeName()),
            ),
            body = listOf("return mutableStateOf(get(name)!!, structuralEqualityPolicy())"),
        )
    }
}

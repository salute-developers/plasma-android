package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized

/**
 * Генератор Compose-атрибутов типографики.
 * Генерирует kt-файл, содержащий в себе всю типографику темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeTypographyAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {

    private val typography = mutableListOf<TypographyTokenResult.ComposeTokenData>()
    private val typographyKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(typographyClassName)
    }
    private val ktFileFromResBuilder by unsafeLazy {
        ktFileFromResourcesBuilderFactory.create()
    }
    private val typographyClassName = "${themeName.capitalized()}Typography"
    private val typographyClassType by unsafeLazy {
        typographyKtFileBuilder.getInternalClassType(typographyClassName)
    }

    fun setTypographyTokenData(typography: List<TypographyTokenResult.ComposeTokenData>) {
        this.typography.clear()
        this.typography.addAll(typography)
    }

    override fun generate() {
        if (typography.isEmpty()) return

        createWindowSizeFile()
        addImports()
        addTypographyClass()
        addSmallTypographyFun()
        addMediumTypographyFun()
        addLargeTypographyFun()
        addLocalTypographyVal()
        addDynamicTypographyFun()
        addLocalTextStyleVal()
        addProvideTextStyleComposable()

        typographyKtFileBuilder.build(outputLocation)
    }

    private fun createWindowSizeFile() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$WINDOW_SIZE_KT_FILE_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = WINDOW_SIZE_KT_FILE_NAME,
        )
    }

    private fun addImports() {
        with(typographyKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                    "CompositionLocalProvider",
                    "structuralEqualityPolicy",
                    "compositionLocalOf",
                ),
            )
        }
    }

    private fun addLocalTypographyVal() {
        typographyKtFileBuilder.appendRootVal(
            name = "Local$typographyClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = typographyClassType,
            initializer = "staticCompositionLocalOf { medium$typographyClassName() }",
            modifiers = listOf(Modifier.INTERNAL),
        )
    }

    private fun addDynamicTypographyFun() {
        typographyKtFileBuilder.appendRootFun(
            name = "dynamic$typographyClassName",
            annotation = KtFileBuilder.TypeAnnotationComposable,
            returnType = typographyClassType,
            body = listOf(
                "return when (collectWindowSizeInfoAsState().value.widthClass) {\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Expanded -> small$typographyClassName()\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Medium -> medium$typographyClassName()\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Compact -> small$typographyClassName()\n",
                "}",
            ),
            description = "Возвращает разные [$typographyClassName] в зависимости от ширины окна. " +
                "Значение динамически изменяется при изменении ширины окна.",
        )
    }

    private fun addTypographyClass() {
        with(typographyKtFileBuilder) {
            rootClass(
                name = typographyClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = typography
                        .filter { it.screen == TypographyTokenResult.ComposeTokenData.Screen.MEDIUM }
                        .map {
                            KtFileBuilder.FunParameter(
                                name = it.attrName,
                                type = KtFileBuilder.TypeTextStyle,
                                asProperty = true,
                            )
                        },
                    modifiers = listOf(Modifier.INTERNAL),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Типографика $themeName",
                modifiers = listOf(Modifier.DATA),
            )
        }
    }

    private fun addSmallTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "small$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.SMALL,
            description = "Возвращает [$typographyClassName] для ширины окна до 600dp",
        )
    }

    private fun addMediumTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "medium$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.MEDIUM,
            description = "Возвращает [$typographyClassName] для ширины окна от 600dp до 840dp",
        )
    }

    private fun addLargeTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "large$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.LARGE,
            description = "Возвращает [$typographyClassName] для ширины окна от 840dp",
        )
    }

    private fun addScreenSpecificTypographyFun(
        funName: String,
        screen: TypographyTokenResult.ComposeTokenData.Screen,
        description: String,
    ) {
        with(typographyKtFileBuilder) {
            appendRootFun(
                name = funName,
                returnType = typographyClassType,
                body = listOf(
                    "return $typographyClassName(${
                        typography
                            .filter { it.screen == screen }
                            .joinToString(separator = ",·") {
                                "${it.attrName} = ${it.tokenRefName}"
                            }
                    })",
                ),
                description = description,
            )
        }
    }

    private fun addLocalTextStyleVal() {
        typographyKtFileBuilder.appendRootVal(
            name = "Local${themeName.capitalized()}TextStyle",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = KtFileBuilder.TypeTextStyle,
            initializer = "compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }",
            modifiers = listOf(Modifier.PRIVATE),
        )
    }

    private fun addProvideTextStyleComposable() {
        typographyKtFileBuilder.appendRootFun(
            name = "ProvideTextStyle",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "value",
                    type = KtFileBuilder.TypeTextStyle,
                ),
                KtFileBuilder.FunParameter(
                    name = "content",
                    type = KtFileBuilder.getLambdaType(
                        annotation = KtFileBuilder.TypeAnnotationComposable,
                    ),
                ),
            ),
            modifiers = listOf(Modifier.INTERNAL),
            annotation = KtFileBuilder.TypeAnnotationComposable,
            body = listOf(
                "val mergedStyle = Local${themeName.capitalized()}TextStyle.current.merge(value)\n",
                "CompositionLocalProvider(" +
                    "Local${themeName.capitalized()}TextStyle provides mergedStyle, " +
                    "content = content)",
            ),
        )
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files"
        private const val WINDOW_SIZE_KT_FILE_NAME = "WindowSize"
    }
}

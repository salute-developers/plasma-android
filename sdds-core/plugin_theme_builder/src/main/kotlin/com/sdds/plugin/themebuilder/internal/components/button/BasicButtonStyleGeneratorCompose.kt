package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.util.Locale

internal class BasicButtonStyleGeneratorCompose(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val themeClassName: String,
    private val themePackage: String,
) : ComponentStyleGenerator<ButtonComponentConfig> {

    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(
            fileName = "BasicButtonStyles",
            fullPackageName = componentPackage,
        )
    }

    override fun generate(config: ButtonComponentConfig) {
        addImports()
        addSizes(config)
        ktFileBuilder.build(outputLocation)
    }

    private fun addSizes(config: ButtonComponentConfig) {
        val sizeVariations = config.variations.size
        sizeVariations.forEach { (size, sizeData) ->
            with(ktFileBuilder) {
                appendRootVal(
                    name = size.toUpperCase(Locale.getDefault()),
                    typeName = getInternalClassType(
                        "BasicButtonStyleBuilder",
                        "com.sdds.compose.uikit",
                    ),
                    receiver = getInternalClassType("BasicButton", "com.sdds.compose.uikit"),
                    getter = KtFileBuilder.Getter.Annotated(
                        annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                        body = "return BasicButtonStyleBuilder.builder(this)\n" +
                            "    .shape($themeClassName.shapes.${sizeData.shape?.name?.toKtTokenName()}${
                                shapeAdjustmentIfNeed(sizeData.shape?.adjustment)
                            })\n" +
                            "    .dimensions(\n" +
                            "        Button.Dimensions(\n" +
                            "            height = ${sizeData.height}.dp,\n" +
                            "            paddings = Button.Dimensions.PaddingValues(" +
                            "start = ${sizeData.paddingStart}.dp, " +
                            "end = ${sizeData.paddingEnd}.dp),\n" +
                            "            minWidth = ${sizeData.minWidth}.dp,\n" +
                            "            iconSize = ${sizeData.iconSize}.dp,\n" +
                            "            spinnerSize = ${sizeData.spinnerSize}.dp,\n" +
                            "            iconMargin = ${sizeData.iconMargin}.dp,\n" +
                            "            valueMargin = ${sizeData.valueMargin}.dp,\n" +
                            "        ),\n" +
                            "    )\n" +
                            "    .labelStyle($themeClassName.typography" +
                            ".${sizeData.labelStyle?.toKtTokenName()})\n" +
                            "    .valueStyle($themeClassName.typography" +
                            ".${sizeData.valueStyle?.toKtTokenName()})\n",
                    ),
                )
            }
        }
    }

    private fun shapeAdjustmentIfNeed(adjustment: Float?): String {
        return adjustment?.let { ".adjustBy(all = ($it).dp)" }.orEmpty()
    }

    private fun String.toKtTokenName(): String = techToCamelCase().decapitalize(Locale.getDefault())

    private fun addImports() {
        with(ktFileBuilder) {
            addImport(
                packageName = themePackage,
                names = listOf(themeClassName),
            )
            addImport(
                packageName = "com.sdds.compose.uikit",
                names = listOf(
                    "Button",
                    "adjustBy",
                ),
            )
            addImport(
                packageName = "androidx.compose.foundation.shape",
                names = listOf("CircleShape"),
            )
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf("Composable"),
            )
            addImport(
                packageName = "androidx.compose.ui.unit",
                names = listOf("dp"),
            )
        }
    }
}

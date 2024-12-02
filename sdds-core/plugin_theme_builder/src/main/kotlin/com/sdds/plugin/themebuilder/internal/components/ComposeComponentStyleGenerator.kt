package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName

/**
 * Базовый класс для генераторов стилей компонентов на Compose
 */
internal abstract class ComposeComponentStyleGenerator<T : ComponentConfig>(
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val namespace: String,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
) : ComponentStyleGenerator<T> {

    protected abstract val componentXmlPrefix: String
    protected abstract val ktFileName: String

    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(
            fileName = ktFileName,
            fullPackageName = componentPackage,
        )
    }

    private val rFileImport by unsafeLazy { ClassName(namespace, "R") }

    abstract fun KtFileBuilder.addCode(config: T)

    override fun generate(config: T) {
        ktFileBuilder.addImportsForDimensionsFromResources()
        ktFileBuilder.addCode(config)
        ktFileBuilder.build(outputLocation)
    }

    protected fun getDimension(
        dimenName: String,
        dimenValue: Float,
        size: String,
    ): String {
        return if (dimensionsConfig.fromResources) {
            val dimenData = DimenData(
                name = "${componentXmlPrefix}_${dimenName}_size_$size",
                value = dimenValue,
                type = DimenData.Type.DP,
            )
            dimensAggregator.addDimen(dimenData)
            "dimensionResource(${resourceReferenceProvider.dimenR(dimenData)})"
        } else {
            "${dimenValue * dimensionsConfig.multiplier}.dp"
        }
    }

    private fun KtFileBuilder.addImportsForDimensionsFromResources() {
        if (dimensionsConfig.fromResources) {
            addImport(KtFileBuilder.TypeLocalDensity)
            addImport(KtFileBuilder.TypeDimensionResource)
            addImport(rFileImport)
        }
    }
}

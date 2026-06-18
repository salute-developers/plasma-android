package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.camelToSnakeCase

internal class DimensionPropertyMapper(
    componentName: String,
    private val dimensAggregator: DimensAggregator,
    private val dimensionsConfig: DimensionsConfig,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val componentXmlPrefix: String,
    stateEnum: StateEnum?,
) : PropertyMapper<Float, DimensionPropertyMeta, FloatState, Dimension>(stateEnum) {

    private val camelComponentName: String = componentName
        .split(".", "-", "_")
        .joinToString("") { seg -> seg.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() } }

    override fun map(
        meta: DimensionPropertyMeta,
        tokenValue: Dimension,
        variationId: String,
    ): String {
        val variationSuffix = getVariationSuffix(variationId)
        val stateSuffix = tokenValue.asStatefulFragment(
            meta = meta,
            variationId = variationSuffix,
        )
        val tokeRef = getTokenRef(
            meta = meta,
            token = tokenValue,
            value = tokenValue.value,
            resSuffix = variationSuffix,
        )
        return "${meta.methodName}($tokeRef$stateSuffix)"
    }

    override fun getTokenRef(
        value: Float,
        token: Dimension,
        meta: DimensionPropertyMeta,
        resSuffix: String,
    ): String {
        return if (dimensionsConfig.fromResources) {
            val snakeCaseName = meta.id.camelToSnakeCase()
            val suffix = if (resSuffix.isEmpty()) "" else "_$resSuffix"
            val dimenData = DimenData(
                name = "${componentXmlPrefix}_${snakeCaseName}$suffix",
                value = value,
                type = DimenData.Type.DP,
            )
            dimensAggregator.addDimen(dimenData)
            "dimensionResource(${resourceReferenceProvider.dimenR(dimenData)})"
        } else {
            "${value * dimensionsConfig.multiplier}.dp"
        }
    }

    override fun buildResSuffix(variationId: String, states: List<String>, stateIndex: Int): String {
        val prefix = if (variationId.isNotBlank()) "${variationId}_" else ""
        return "$prefix$stateIndex"
    }

    private fun getVariationSuffix(variationId: String): String {
        return if (variationId == camelComponentName) "" else variationId
    }
}

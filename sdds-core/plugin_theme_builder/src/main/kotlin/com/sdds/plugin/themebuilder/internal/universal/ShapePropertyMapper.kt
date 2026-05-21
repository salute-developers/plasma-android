package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class ShapePropertyMapper(
    stateEnum: StateEnum?,
    private val importCollector: ImportCollector,
    private val themeClassName: String,
    private val dimensAggregator: DimensAggregator,
    private val dimensionsConfig: DimensionsConfig,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val componentXmlPrefix: String,
) : PropertyMapper<String, ShapePropertyMeta, StringState, Shape>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Shape,
        meta: ShapePropertyMeta,
        resSuffix: String,
    ): String {
        return if (ShapeToken.isCircle(value)) {
            importCollector.addImport(
                pkg = "androidx.compose.foundation.shape",
                name = "CircleShape",
            )
            "CircleShape"
        } else {
            "$themeClassName.shapes.${value.toCamelCase().decapitalized()}${
                token?.shapeAdjustment(suffix = resSuffix)
            }"
        }
    }

    private fun Shape.shapeAdjustment(suffix: String): String {
        return this.adjustment?.let {
            ".adjustBy(all = ${getShapeAdjustment(suffix)})"
        }.orEmpty()
    }

    private fun Shape.getShapeAdjustment(suffix: String): String {
        val adjValue = adjustment ?: 0f
        return if (dimensionsConfig.fromResources) {
            val dimenData = DimenData(
                name = "${componentXmlPrefix}_shapeAdjustment_$suffix",
                value = adjValue,
                type = DimenData.Type.DP,
            )
            dimensAggregator.addDimen(dimenData)
            "dimensionResource(${resourceReferenceProvider.dimenR(dimenData)})"
        } else {
            "${adjValue * dimensionsConfig.multiplier}.dp"
        }
    }
}

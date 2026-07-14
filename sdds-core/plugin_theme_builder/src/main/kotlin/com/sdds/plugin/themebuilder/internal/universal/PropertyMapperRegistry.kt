package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class PropertyMapperRegistry(
    private val componentMeta: ComponentMeta,
    private val themeClassName: String,
    private val componentName: String,
    private val componentXmlPrefix: String,
    private val dimensAggregator: DimensAggregator,
    private val dimensionsConfig: DimensionsConfig,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val themeStylesPackage: String,
    private val packageLookup: Map<String, String> = emptyMap(),
    private val multiplatform: Boolean = false,
) {
    data class Mappers(
        val colorMapper: ColorPropertyMapper,
        val dimensionMapper: DimensionPropertyMapper,
        val typographyMapper: TypographyPropertyMapper,
        val shapeMapper: ShapePropertyMapper,
        val shadowMapper: ShadowPropertyMapper,
        val booleanMapper: BooleanPropertyMapper,
        val integerMapper: IntegerPropertyMapper,
        val floatMapper: FloatPropertyMapper,
        val iconMapper: IconPropertyMapper,
        val componentStyleMapper: ComponentStyleMapper,
        val valueMapper: ValuePropertyMapper,
    )

    fun createMappers(importCollector: ImportCollector): Mappers {
        val stateEnum = componentMeta.stateEnum
        return Mappers(
            colorMapper = ColorPropertyMapper(stateEnum, themeClassName),
            dimensionMapper = DimensionPropertyMapper(
                componentName = componentName,
                dimensAggregator = dimensAggregator,
                dimensionsConfig = dimensionsConfig,
                resourceReferenceProvider = resourceReferenceProvider,
                componentXmlPrefix = componentXmlPrefix,
                stateEnum = stateEnum,
            ),
            typographyMapper = TypographyPropertyMapper(stateEnum, themeClassName),
            shapeMapper = ShapePropertyMapper(
                stateEnum = stateEnum,
                importCollector = importCollector,
                themeClassName = themeClassName,
                dimensAggregator = dimensAggregator,
                dimensionsConfig = dimensionsConfig,
                resourceReferenceProvider = resourceReferenceProvider,
                componentXmlPrefix = componentXmlPrefix,
            ),
            shadowMapper = ShadowPropertyMapper(stateEnum, themeClassName),
            booleanMapper = BooleanPropertyMapper(stateEnum),
            integerMapper = IntegerPropertyMapper(stateEnum),
            floatMapper = FloatPropertyMapper(stateEnum),
            iconMapper = IconPropertyMapper(stateEnum, importCollector, multiplatform),
            componentStyleMapper = ComponentStyleMapper(stateEnum, importCollector, themeStylesPackage, packageLookup),
            valueMapper = ValuePropertyMapper(stateEnum, importCollector),
        )
    }
}

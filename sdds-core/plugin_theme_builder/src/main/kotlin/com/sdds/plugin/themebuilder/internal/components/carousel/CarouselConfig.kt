package com.sdds.plugin.themebuilder.internal.components.carousel

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class CarouselProperties(
    val indicatorStyle: ComponentStyle<IndicatorProperties>? = null,
    val nextButtonStyle: ComponentStyle<ButtonProperties>? = null,
    val prevButtonStyle: ComponentStyle<ButtonProperties>? = null,
    val nextButtonIcon: Icon? = null,
    val prevButtonIcon: Icon? = null,
    val nextButtonPadding: Dimension? = null,
    val prevButtonPadding: Dimension? = null,
    val indicatorPadding: Dimension? = null,
    val gap: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CarouselProperties ?: return this
        return copy(
            indicatorStyle = indicatorStyle ?: otherProps.indicatorStyle,
            nextButtonStyle = nextButtonStyle ?: otherProps.nextButtonStyle,
            prevButtonStyle = prevButtonStyle ?: otherProps.prevButtonStyle,
            nextButtonIcon = nextButtonIcon ?: otherProps.nextButtonIcon,
            prevButtonIcon = prevButtonIcon ?: otherProps.prevButtonIcon,
            nextButtonPadding = nextButtonPadding ?: otherProps.nextButtonPadding,
            prevButtonPadding = prevButtonPadding ?: otherProps.prevButtonPadding,
            indicatorPadding = indicatorPadding ?: otherProps.indicatorPadding,
            gap = gap ?: otherProps.gap,
        )
    }
}

@Serializable
internal data class CarouselView(
    override val props: CarouselProperties,
) : ViewVariation<CarouselProperties> {
    override fun merge(parent: ViewVariation<CarouselProperties>): ViewVariation<CarouselProperties> =
        copy(props = props.merge(parent.props) as CarouselProperties)
}

@Serializable
internal data class CarouselVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CarouselView> = emptyMap(),
    override val props: CarouselProperties,
) : ChildVariation<CarouselProperties>

@Serializable
internal data class CarouselConfig(
    override val view: Map<String, CarouselView> = emptyMap(),
    override val props: CarouselProperties,
    override val variations: List<CarouselVariation> = emptyList(),
) : Config<CarouselProperties>, ComponentConfig

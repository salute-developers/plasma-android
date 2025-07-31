package com.sdds.plugin.themebuilder.internal.components.loader

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressProperties
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class LoaderProperties(
    val spinnerStyle: ComponentStyle<SpinnerProperties>? = null,
    val circularProgressStyle: ComponentStyle<CircularProgressProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? LoaderProperties ?: return this
        return copy(
            spinnerStyle = spinnerStyle ?: otherProps.spinnerStyle,
            circularProgressStyle = circularProgressStyle ?: otherProps.circularProgressStyle,
        )
    }
}

@Serializable
internal data class LoaderView(override val props: LoaderProperties) : ViewVariation<LoaderProperties> {
    override fun merge(parent: ViewVariation<LoaderProperties>): ViewVariation<LoaderProperties> =
        copy(props = props.merge(parent.props) as LoaderProperties)
}

@Serializable
internal data class LoaderVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, LoaderView> = emptyMap(),
    override val props: LoaderProperties,
) : ChildVariation<LoaderProperties>

@Serializable
internal data class LoaderConfig(
    override val view: Map<String, LoaderView> = emptyMap(),
    override val props: LoaderProperties,
    override val variations: List<LoaderVariation> = emptyList(),
) : Config<LoaderProperties>, ComponentConfig

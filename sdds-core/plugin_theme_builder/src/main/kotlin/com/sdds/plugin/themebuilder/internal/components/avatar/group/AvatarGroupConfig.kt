package com.sdds.plugin.themebuilder.internal.components.avatar.group

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarProperties
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class AvatarGroupProperties(
    val itemOffset: Dimension? = null,
    val itemSpacing: Dimension? = null,
    val avatarStyle: ComponentStyle<AvatarProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AvatarGroupProperties ?: return this
        return copy(
            itemOffset = itemOffset ?: otherProps.itemOffset,
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            avatarStyle = avatarStyle ?: otherProps.avatarStyle,
        )
    }
}

@Serializable
internal data class AvatarGroupView(
    override val props: AvatarGroupProperties,
) : ViewVariation<AvatarGroupProperties> {
    override fun merge(parent: ViewVariation<AvatarGroupProperties>): ViewVariation<AvatarGroupProperties> =
        copy(props = props.merge(parent.props) as AvatarGroupProperties)
}

@Serializable
internal data class AvatarGroupVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, AvatarGroupView> = emptyMap(),
    override val props: AvatarGroupProperties,
) : ChildVariation<AvatarGroupProperties>

@Serializable
internal data class AvatarGroupConfig(
    override val view: Map<String, AvatarGroupView> = emptyMap(),
    override val props: AvatarGroupProperties,
    override val variations: List<AvatarGroupVariation> = emptyList(),
) : Config<AvatarGroupProperties>, ComponentConfig

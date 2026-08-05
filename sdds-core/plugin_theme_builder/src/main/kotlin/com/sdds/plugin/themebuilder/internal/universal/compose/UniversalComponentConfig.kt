package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.universal.Binding
import com.sdds.plugin.themebuilder.internal.universal.Bindings
import com.sdds.plugin.themebuilder.internal.universal.ChildVariation
import com.sdds.plugin.themebuilder.internal.universal.ComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.Config
import com.sdds.plugin.themebuilder.internal.universal.ViewVariation
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
internal class UniversalComponentConfig(
    @SerialName("props")
    override val props: UniversalPropertyOwner = UniversalPropertyOwner(JsonObject(emptyMap())),
    @SerialName("view")
    override val view: Map<String, UniversalViewVariation> = emptyMap(),
    @SerialName("variations")
    override val variations: List<UniversalChildVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<UniversalPropertyOwner>, ComponentConfig

@Serializable
internal class UniversalViewVariation(
    @SerialName("props")
    override val props: UniversalPropertyOwner = UniversalPropertyOwner(JsonObject(emptyMap())),
    override val binding: List<Binding>? = null,
) : ViewVariation<UniversalPropertyOwner> {
    override fun merge(parent: ViewVariation<UniversalPropertyOwner>): ViewVariation<UniversalPropertyOwner> {
        val merged = props.merge(parent.props) as UniversalPropertyOwner
        return UniversalViewVariation(
            props = merged,
            binding = binding ?: parent.binding,
        )
    }
}

@Serializable
internal class UniversalChildVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    @SerialName("view")
    override val view: Map<String, UniversalViewVariation> = emptyMap(),
    @SerialName("props")
    override val props: UniversalPropertyOwner = UniversalPropertyOwner(JsonObject(emptyMap())),
) : ChildVariation<UniversalPropertyOwner>

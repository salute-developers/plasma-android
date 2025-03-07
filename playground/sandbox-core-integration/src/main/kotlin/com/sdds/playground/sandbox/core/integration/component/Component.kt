package com.sdds.playground.sandbox.core.integration.component

import android.os.Parcelable
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import kotlinx.parcelize.Parcelize

interface ComponentsProviderView {

    val all: Map<ComponentKey, ViewComponent<*>>

    @Suppress("UNCHECKED_CAST")
    operator fun <K: Any> get(key: ComponentKey): ViewComponent<K> {
        return all[key] as? ViewComponent<K> ?: throw IllegalArgumentException("No $key exists")
    }
}

interface ComponentsProviderCompose {

    val all: Map<ComponentKey, ComposeComponent<*, *>>

    @Suppress("UNCHECKED_CAST")
    operator fun <K: Any, S : Style> get(key: ComponentKey): ComposeComponent<K, S> {
        return all[key] as? ComposeComponent<K, S> ?: throw IllegalArgumentException("No $key exists")
    }
}

/**
 *
 * @author Малышев Александр on 03.03.2025
 */
open class ViewComponent<ViewStyle : Any>(
    override val key: ComponentKey,
    val styleProvider: ViewStyleProvider<ViewStyle>,
    override val name: String = key.value,
): Component

open class ComposeComponent<Key : Any, S : Style>(
    override val key: ComponentKey,
    val styleProvider: ComposeStyleProvider<Key, S>,
    override val name: String = key.value,
): Component

interface Component {
    val key: ComponentKey
    val name: String
}

@Parcelize
data class ComponentKey(
    val value: String,
    val core: CoreComponent
): Parcelable {

    companion object {
        val Avatar = ComponentKey("Avatar", CoreComponent.AVATAR)
        val AvatarGroup = ComponentKey("AvatarGroup", CoreComponent.AVATAR_GROUP)

        val Badge = ComponentKey("Badge", CoreComponent.BADGE)
        val IconBadge = ComponentKey("IconBadge", CoreComponent.BADGE)

        val BasicButton = ComponentKey("BasicButton", CoreComponent.BASIC_BUTTON)
        val IconButton = ComponentKey("IconButton", CoreComponent.ICON_BUTTON)
        val LinkButton = ComponentKey("LinkButton", CoreComponent.LINK_BUTTON)

        val Cell = ComponentKey("Cell", CoreComponent.CELL)

        val CheckBox = ComponentKey("CheckBox", CoreComponent.CHECKBOX)
        val CheckBoxGroup = ComponentKey("CheckBoxGroup", CoreComponent.CHECKBOX_GROUP)

        val Chip = ComponentKey("Chip", CoreComponent.CHIP)
        val ChipGroup = ComponentKey("ChipGroup", CoreComponent.CHIP_GROUP)

        val Counter = ComponentKey("Counter", CoreComponent.COUNTER)
        val Indicator = ComponentKey("Indicator", CoreComponent.INDICATOR)
        val ProgressBar = ComponentKey("ProgressBar", CoreComponent.PROGRESS)

        val RadioBox = ComponentKey("RadioBox", CoreComponent.RADIOBOX)
        val RadioBoxGroup = ComponentKey("RadioBoxGroup", CoreComponent.RADIOBOX_GROUP)

        val Segment = ComponentKey("Segment", CoreComponent.RADIOBOX)
        val SegmentItem = ComponentKey("SegmentItem", CoreComponent.SEGMENT_ITEM)

        val Switch = ComponentKey("Switch", CoreComponent.SWITCH)

        val TextField = ComponentKey("TextField", CoreComponent.TEXT_FIELD)
        val TextArea = ComponentKey("TextArea", CoreComponent.TEXT_AREA)
    }
}

enum class CoreComponent {
    AVATAR,
    AVATAR_GROUP,

    BADGE,
    ICON_BADGE,

    BASIC_BUTTON,
    ICON_BUTTON,
    LINK_BUTTON,

    CELL,

    CHECKBOX,
    CHECKBOX_GROUP,

    CHIP,
    CHIP_GROUP,

    COUNTER,

    INDICATOR,

    PROGRESS,

    RADIOBOX,
    RADIOBOX_GROUP,

    SEGMENT,
    SEGMENT_ITEM,

    SWITCH,

    TEXT_FIELD,
    TEXT_AREA,
}



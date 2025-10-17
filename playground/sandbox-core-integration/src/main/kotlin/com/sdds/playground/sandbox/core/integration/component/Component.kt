package com.sdds.playground.sandbox.core.integration.component

import android.os.Parcelable
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

/**
 * Провайдер компонентов для представлений (View).
 */
interface ComponentsProviderView {

    /**
     * Все компоненты
     */
    val all: Map<ComponentKey, ViewComponent<*>>

    /**
     * Получает компонент представления по ключу.
     *
     * @param key Ключ компонента.
     * @return Компонент представления.
     * @throws IllegalArgumentException если компонент не найден.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <K : Any> get(key: ComponentKey): ViewComponent<K> {
        return all[key] as? ViewComponent<K> ?: throw IllegalArgumentException("No $key exists")
    }
}

/**
 * Провайдер компонентов для Compose.
 */
interface ComponentsProviderCompose {

    /**
     * Все компоненты
     */
    val all: Map<ComponentKey, ComposeComponent<*, *>>

    /**
     * Получает Compose-компонент по ключу.
     *
     * @param key Ключ компонента.
     * @return Compose-компонент.
     * @throws IllegalArgumentException если компонент не найден.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <K : Any, S : Style> get(key: ComponentKey): ComposeComponent<K, S> {
        return all[key] as? ComposeComponent<K, S> ?: throw IllegalArgumentException("No $key exists")
    }
}

/**
 * Представляет компонент представления (View).
 *
 * @param ViewStyle Тип стиля компонента.
 * @param key Ключ компонента.
 * @param styleProvider Провайдер стиля для компонента.
 * @param name Имя компонента (по умолчанию совпадает с ключом).
 */
open class ViewComponent<ViewStyle : Any>(
    override val key: ComponentKey,
    val styleProvider: ViewStyleProvider<ViewStyle>,
    override val name: String = key.value,
) : Component

/**
 * Представляет компонент Compose.
 *
 * @param Key Тип ключа компонента.
 * @param S Тип стиля компонента.
 * @param key Ключ компонента.
 * @param styleProvider Провайдер стиля для компонента.
 * @param name Имя компонента (по умолчанию совпадает с ключом).
 */
open class ComposeComponent<Key : Any, S : Style>(
    override val key: ComponentKey,
    val styleProvider: ComposeStyleProvider<Key, S>,
    override val name: String = key.value,
) : Component

/**
 * Базовый интерфейс для всех компонентов.
 */
interface Component {
    /**
     * Уникальный ключ компонента
     */
    val key: ComponentKey

    /**
     * Название компонента
     */
    val name: String
}

/**
 * Ключ для идентификации компонентов.
 *
 * @param value Уникальное значение ключа.
 * @param core Базовый тип компонента.
 */
@Suppress("UnsafeOptInUsageError")
@Parcelize
@Serializable
data class ComponentKey(
    val value: String,
    val core: CoreComponent,
) : Parcelable {

    /**
     * Набор предопределенных ключей для компонентов.
     */
    @Suppress("UndocumentedPublicProperty")
    companion object {

        val Avatar = ComponentKey("Avatar", CoreComponent.AVATAR)
        val AvatarGroup = ComponentKey("AvatarGroup", CoreComponent.AVATAR_GROUP)

        val Badge = ComponentKey("Badge", CoreComponent.BADGE)
        val IconBadge = ComponentKey("IconBadge", CoreComponent.BADGE)

        val BottomSheet = ComponentKey("BottomSheet", CoreComponent.BOTTOMSHEET)

        val BasicButton = ComponentKey("BasicButton", CoreComponent.BASIC_BUTTON)
        val IconButton = ComponentKey("IconButton", CoreComponent.ICON_BUTTON)
        val LinkButton = ComponentKey("LinkButton", CoreComponent.LINK_BUTTON)

        val Card = ComponentKey("Card", CoreComponent.CARD)

        val Cell = ComponentKey("Cell", CoreComponent.CELL)

        val CheckBox = ComponentKey("CheckBox", CoreComponent.CHECKBOX)
        val CheckBoxGroup = ComponentKey("CheckBoxGroup", CoreComponent.CHECKBOX_GROUP)

        val Chip = ComponentKey("Chip", CoreComponent.CHIP)
        val ChipGroup = ComponentKey("ChipGroup", CoreComponent.CHIP_GROUP)

        val Counter = ComponentKey("Counter", CoreComponent.COUNTER)
        val Divider = ComponentKey("Divider", CoreComponent.DIVIDER)
        val Indicator = ComponentKey("Indicator", CoreComponent.INDICATOR)
        val Flow = ComponentKey("Flow", CoreComponent.FLOW)
        val NavigationDrawer = ComponentKey("NavigationDrawer", CoreComponent.NAVIGATION_DRAWER)
        val ProgressBar = ComponentKey("ProgressBar", CoreComponent.PROGRESS)
        val CircularProgressBar = ComponentKey("CircularProgressBar", CoreComponent.CIRCULAR_PROGRESS)

        val RadioBox = ComponentKey("RadioBox", CoreComponent.RADIOBOX)
        val RadioBoxGroup = ComponentKey("RadioBoxGroup", CoreComponent.RADIOBOX_GROUP)

        val Segment = ComponentKey("Segment", CoreComponent.SEGMENT)
        val SegmentItem = ComponentKey("SegmentItem", CoreComponent.SEGMENT_ITEM)

        val Switch = ComponentKey("Switch", CoreComponent.SWITCH)

        val TextField = ComponentKey("TextField", CoreComponent.TEXT_FIELD)
        val TextArea = ComponentKey("TextArea", CoreComponent.TEXT_AREA)
        val Popover = ComponentKey("Popover", CoreComponent.POPOVER)
        val Tooltip = ComponentKey("Tooltip", CoreComponent.TOOLTIP)
        val Overlay = ComponentKey("Overlay", CoreComponent.OVERLAY)
        val Toast = ComponentKey("Toast", CoreComponent.TOAST)
        val Modal = ComponentKey("Modal", CoreComponent.MODAL)
        val Note = ComponentKey("Note", CoreComponent.NOTE)
        val NoteCompact = ComponentKey("NoteCompact", CoreComponent.NOTE_COMPACT)
        val Notification = ComponentKey("Notification", CoreComponent.NOTIFICATION)
        val NotificationContent = ComponentKey("NotificationContent", CoreComponent.NOTIFICATION_CONTENT)
        val RectSkeleton = ComponentKey("RectSkeleton", CoreComponent.RECT_SKELETON)
        val Spinner = ComponentKey("Spinner", CoreComponent.SPINNER)
        val List = ComponentKey("List", CoreComponent.LIST)
        val DropdownMenu = ComponentKey("DropdownMenu", CoreComponent.DROPDOWN_MENU)
        val TextSkeleton = ComponentKey("TextSkeleton", CoreComponent.TEXT_SKELETON)
        val Accordion = ComponentKey("Accordion", CoreComponent.ACCORDION)
        val Wheel = ComponentKey("Wheel", CoreComponent.WHEEL)
        val ScrollBar = ComponentKey("ScrollBar", CoreComponent.SCROLL_BAR)
        val Image = ComponentKey("Image", CoreComponent.IMAGE)
        val ButtonGroup = ComponentKey("ButtonGroup", CoreComponent.BUTTON_GROUP)
        val TabBar = ComponentKey("TabBar", CoreComponent.TAB_BAR)
        val Loader = ComponentKey("Loader", CoreComponent.LOADER)
        val CodeInput = ComponentKey("CodeInput", CoreComponent.CODE_INPUT)
        val CodeField = ComponentKey("CodeField", CoreComponent.CODE_FIELD)
        val Drawer = ComponentKey("Drawer", CoreComponent.DRAWER)
        val Tabs = ComponentKey("Tabs", CoreComponent.TABS)
        val IconTabs = ComponentKey("IconTabs", CoreComponent.ICON_TABS)
    }
}

/**
 * Перечисление базовых типов компонентов.
 */
enum class CoreComponent {
    AVATAR,
    AVATAR_GROUP,

    BADGE,
    ICON_BADGE,

    BOTTOMSHEET,

    BASIC_BUTTON,
    ICON_BUTTON,
    LINK_BUTTON,
    BUTTON_GROUP,

    CARD,

    CELL,

    CHECKBOX,
    CHECKBOX_GROUP,

    CHIP,
    CHIP_GROUP,

    COUNTER,

    DIVIDER,

    FLOW,

    INDICATOR,

    NAVIGATION_DRAWER,

    PROGRESS,
    CIRCULAR_PROGRESS,

    RADIOBOX,
    RADIOBOX_GROUP,

    SEGMENT,
    SEGMENT_ITEM,

    SWITCH,

    TEXT_FIELD,
    TEXT_AREA,
    POPOVER,
    TOOLTIP,
    OVERLAY,
    TOAST,
    MODAL,
    NOTE,
    NOTE_COMPACT,
    NOTIFICATION,
    NOTIFICATION_CONTENT,
    RECT_SKELETON,
    SPINNER,
    LIST,
    DROPDOWN_MENU,
    TEXT_SKELETON,
    ACCORDION,
    WHEEL,
    SCROLL_BAR,
    IMAGE,
    TAB_BAR,
    LOADER,
    CODE_INPUT,
    CODE_FIELD,
    DRAWER,
    TABS,
    ICON_TABS,
}

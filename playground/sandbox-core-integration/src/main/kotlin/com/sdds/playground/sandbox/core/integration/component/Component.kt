package com.sdds.playground.sandbox.core.integration.component

import android.os.Parcelable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

/**
 * Провайдер компонентов для представлений (View).
 */
abstract class ComponentsProviderView {

    /**
     * Все сгенерированные компоненты
     */
    abstract val generated: Map<ComponentKey, ViewComponent<*>>

    /**
     * Все компоненты, включая общие и сгенерированные.
     */
    @Suppress("UNCHECKED_CAST")
    val components: Map<ComponentKey, ViewComponent<*>> by lazy {
        mutableMapOf<ComponentKey, ViewComponent<*>>().apply {
            putAll(generated)

            val textFieldStyles = (
                generated[ComponentKey.TextField]
                    ?.styleProviders as? Map<String, ViewStyleProvider<String>>
                )
                ?: emptyMap()
            if (textFieldStyles.isNotEmpty()) {
                val maskKey = ComponentKey.Mask
                put(maskKey, ViewComponent(maskKey, textFieldStyles))
            }
        }
    }

    /**
     * Получает компонент представления по ключу.
     *
     * @param key Ключ компонента.
     * @return Компонент представления.
     * @throws IllegalArgumentException если компонент не найден.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <K : Any> get(key: ComponentKey): ViewComponent<K> {
        return components[key] as? ViewComponent<K> ?: throw IllegalArgumentException("No $key exists")
    }
}

/**
 * Провайдер компонентов для Compose.
 */
abstract class ComponentsProviderCompose {

    /**
     * Все cutythbhjdfyyst компоненты
     */
    abstract val generated: Map<ComponentKey, ComposeComponent<*, *>>

    /**
     * Все компоненты, включая общие и сгенерированные.
     */
    @Suppress("UNCHECKED_CAST")
    val components: Map<ComponentKey, ComposeComponent<*, *>> by lazy {
        mutableMapOf<ComponentKey, ComposeComponent<*, *>>().apply {
            putAll(generated)

            val textFieldStyles = (
                generated[ComponentKey.TextField]
                    ?.styleProviders as? Map<String, ComposeStyleProvider<String, TextFieldStyle>>
                )
                ?: emptyMap()
            if (textFieldStyles.isNotEmpty()) {
                val maskKey = ComponentKey.Mask
                put(maskKey, ComposeComponent(maskKey, textFieldStyles))
            }
        }
    }

    /**
     * Получает Compose-компонент по ключу.
     *
     * @param key Ключ компонента.
     * @return Compose-компонент.
     * @throws IllegalArgumentException если компонент не найден.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <K : Any, S : Style> get(key: ComponentKey): ComposeComponent<K, S> {
        return components[key] as? ComposeComponent<K, S> ?: throw IllegalArgumentException("No $key exists")
    }
}

/**
 * Представляет компонент представления (View).
 *
 * @param ViewStyle Тип стиля компонента.
 * @param key Ключ компонента.
 * @param styleProviders Провайдеры стиля для компонента.
 * @param name Имя компонента (по умолчанию совпадает с ключом).
 * @param defaultAppearance внешний вид по умолчанию.
 */
open class ViewComponent<ViewStyle : Any>(
    override val key: ComponentKey,
    val styleProviders: Map<String, ViewStyleProvider<ViewStyle>>,
    override val name: String = key.value,
    override val defaultAppearance: String = styleProviders.keys.firstOrNull().orEmpty(),
) : Component {

    constructor(
        key: ComponentKey,
        styleProvider: ViewStyleProvider<ViewStyle>,
    ) : this(key, mapOf(key.value to styleProvider))
}

/**
 * Представляет компонент Compose.
 *
 * @param Key Тип ключа компонента.
 * @param S Тип стиля компонента.
 * @param key Ключ компонента.
 * @param styleProviders Провайдеры стиля для компонента.
 * @param name Имя компонента (по умолчанию совпадает с ключом).
 * @param defaultAppearance внешний вид по умолчанию.
 */
open class ComposeComponent<Key : Any, S : Style>(
    override val key: ComponentKey,
    val styleProviders: Map<String, ComposeStyleProvider<Key, S>>,
    override val name: String = key.value,
    override val defaultAppearance: String = styleProviders.keys.firstOrNull().orEmpty(),
) : Component {

    constructor(
        key: ComponentKey,
        styleProvider: ComposeStyleProvider<Key, S>,
    ) : this(key, mapOf(key.value to styleProvider))
}

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

    /**
     * Внешний вид по умолчанию
     */
    val defaultAppearance: String
}

/**
 * Ключ для идентификации компонентов.
 *
 * @param value Уникальное значение ключа.
 * @param core Базовый тип компонента.
 * @param group группа, к которой принадлежит компонент
 */
@Suppress("UnsafeOptInUsageError")
@Parcelize
@Serializable
data class ComponentKey(
    val value: String,
    val core: CoreComponent,
    val group: CoreComponentGroup = core.group(),
) : Parcelable {

    /**
     * Набор предопределенных ключей для компонентов.
     */
    @Suppress("UndocumentedPublicProperty")
    companion object {

        val Avatar = ComponentKey("Avatar", CoreComponent.AVATAR)
        val AvatarGroup = ComponentKey("AvatarGroup", CoreComponent.AVATAR_GROUP)

        val Badge = ComponentKey("Badge", CoreComponent.BADGE)
        val IconBadge = ComponentKey("IconBadge", CoreComponent.ICON_BADGE)

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
        val ListItem = ComponentKey("ListItem", CoreComponent.LIST_ITEM)
        val DropdownMenu = ComponentKey("DropdownMenu", CoreComponent.DROPDOWN_MENU)
        val TextSkeleton = ComponentKey("TextSkeleton", CoreComponent.TEXT_SKELETON)
        val Accordion = ComponentKey("Accordion", CoreComponent.ACCORDION)
        val AccordionItem = ComponentKey("AccordionItem", CoreComponent.ACCORDION_ITEM)
        val Wheel = ComponentKey("Wheel", CoreComponent.WHEEL)
        val ScrollBar = ComponentKey("ScrollBar", CoreComponent.SCROLL_BAR)
        val Image = ComponentKey("Image", CoreComponent.IMAGE)
        val ButtonGroup = ComponentKey("ButtonGroup", CoreComponent.BUTTON_GROUP)
        val TabBar = ComponentKey("TabBar", CoreComponent.TAB_BAR)
        val TabBarItem = ComponentKey("TabBarItem", CoreComponent.TAB_BAR_ITEM)
        val Loader = ComponentKey("Loader", CoreComponent.LOADER)
        val CodeInput = ComponentKey("CodeInput", CoreComponent.CODE_INPUT)
        val CodeField = ComponentKey("CodeField", CoreComponent.CODE_FIELD)
        val Drawer = ComponentKey("Drawer", CoreComponent.DRAWER)
        val Tabs = ComponentKey("Tabs", CoreComponent.TABS)
        val TabItem = ComponentKey("TabItem", CoreComponent.TAB_ITEM)
        val IconTabItem = ComponentKey("IconTabItem", CoreComponent.ICON_TAB_ITEM)
        val IconTabs = ComponentKey("IconTabs", CoreComponent.ICON_TABS)
        val Toolbar = ComponentKey("Toolbar", CoreComponent.TOOL_BAR)
        val NavigationBar = ComponentKey("NavigationBar", CoreComponent.NAVIGATION_BAR)
        val PaginationDots = ComponentKey("PaginationDots", CoreComponent.PAGINATION_DOTS)
        val Mask = ComponentKey("Mask", CoreComponent.MASK)
        val Carousel = ComponentKey("Carousel", CoreComponent.CAROUSEL)
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
    LIST_ITEM,
    DROPDOWN_MENU,
    TEXT_SKELETON,
    ACCORDION,
    ACCORDION_ITEM,
    WHEEL,
    SCROLL_BAR,
    IMAGE,
    TAB_BAR,
    TAB_BAR_ITEM,
    LOADER,
    CODE_INPUT,
    CODE_FIELD,
    DRAWER,
    TABS,
    TAB_ITEM,
    ICON_TAB_ITEM,
    ICON_TABS,
    NAVIGATION_BAR,
    PAGINATION_DOTS,
    TOOL_BAR,
    MASK,
    CAROUSEL,
}

/**
 * Группа компонентов
 * @property displayName название группы
 */
enum class CoreComponentGroup(val displayName: String) {
    DATA_DISPLAY("Data Display"),
    DATA_ENTRY("Data Entry"),
    NAVIGATION("Navigation"),
    OVERLAY("Overlay"),
    LAYOUT("Layout"),
}

@Suppress("LongMethod")
private fun CoreComponent.group(): CoreComponentGroup {
    return when (this) {
        CoreComponent.ACCORDION,
        CoreComponent.ACCORDION_ITEM,
        CoreComponent.AVATAR,
        CoreComponent.AVATAR_GROUP,
        CoreComponent.BADGE,
        CoreComponent.ICON_BADGE,
        CoreComponent.CARD,
        CoreComponent.COUNTER,
        CoreComponent.CELL,
        CoreComponent.CHIP,
        CoreComponent.CHIP_GROUP,
        CoreComponent.DIVIDER,
        CoreComponent.IMAGE,
        CoreComponent.INDICATOR,
        CoreComponent.LIST,
        CoreComponent.LIST_ITEM,
        CoreComponent.RECT_SKELETON,
        CoreComponent.SPINNER,
        CoreComponent.TEXT_SKELETON,
        CoreComponent.LOADER,
        CoreComponent.PROGRESS,
        CoreComponent.CIRCULAR_PROGRESS,
        CoreComponent.NOTE,
        CoreComponent.NOTE_COMPACT,
        CoreComponent.PAGINATION_DOTS,
        -> CoreComponentGroup.DATA_DISPLAY

        CoreComponent.BASIC_BUTTON,
        CoreComponent.ICON_BUTTON,
        CoreComponent.LINK_BUTTON,
        CoreComponent.BUTTON_GROUP,
        CoreComponent.CHECKBOX,
        CoreComponent.CHECKBOX_GROUP,
        CoreComponent.CODE_INPUT,
        CoreComponent.CODE_FIELD,
        CoreComponent.RADIOBOX,
        CoreComponent.RADIOBOX_GROUP,
        CoreComponent.TEXT_FIELD,
        CoreComponent.TEXT_AREA,
        CoreComponent.SEGMENT,
        CoreComponent.SEGMENT_ITEM,
        CoreComponent.SWITCH,
        CoreComponent.WHEEL,
        CoreComponent.MASK,
        -> CoreComponentGroup.DATA_ENTRY

        CoreComponent.DROPDOWN_MENU,
        CoreComponent.NAVIGATION_DRAWER,
        CoreComponent.SCROLL_BAR,
        CoreComponent.TABS,
        CoreComponent.TAB_ITEM,
        CoreComponent.ICON_TAB_ITEM,
        CoreComponent.ICON_TABS,
        CoreComponent.TAB_BAR,
        CoreComponent.TAB_BAR_ITEM,
        CoreComponent.CAROUSEL,
        -> CoreComponentGroup.NAVIGATION

        CoreComponent.DRAWER,
        CoreComponent.BOTTOMSHEET,
        CoreComponent.NOTIFICATION,
        CoreComponent.NOTIFICATION_CONTENT,
        CoreComponent.POPOVER,
        CoreComponent.MODAL,
        CoreComponent.TOOLTIP,
        CoreComponent.TOAST,
        CoreComponent.OVERLAY,
        CoreComponent.TOOL_BAR,
        -> CoreComponentGroup.OVERLAY

        CoreComponent.NAVIGATION_BAR -> CoreComponentGroup.NAVIGATION

        CoreComponent.FLOW -> CoreComponentGroup.LAYOUT
    }
}

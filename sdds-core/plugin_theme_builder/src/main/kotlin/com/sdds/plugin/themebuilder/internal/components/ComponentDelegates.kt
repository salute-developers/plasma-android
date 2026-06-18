package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.accordion.AccordionConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.accordion.AccordionItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.aiheader.AiHeaderConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.answer.AiAnswerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.autocomplete.AutoCompleteConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.avatar.group.AvatarGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.bottomsheet.BottomSheetConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate.ButtonType
import com.sdds.plugin.themebuilder.internal.components.buttongroup.ButtonGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.card.CardConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.carousel.CarouselConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.cell.CellConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.checkbox.CheckBoxConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.checkbox.group.CheckBoxGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.chip.ChipConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.chip.group.ChipGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.codefield.CodeFieldConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.codeinput.CodeInputConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.collapsingnavigationbar.CollapsingNavigationBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.combobox.ComboBoxConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.divider.DividerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.drawer.DrawerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.dropzone.DropZoneConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.editable.EditableConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.emptystate.EmptyStateConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.file.FileConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.form.FormItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.image.ImageConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.list.ListConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.list.item.ListItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.loader.LoaderConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.modal.ModalConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.navigationbar.NavigationBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.navigationdrawer.NavigationDrawerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.navigationdrawer.NavigationDrawerItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.note.NoteConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.notification.NotificationConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.notificationcontent.NotificationContentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.overlay.OverlayConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.paginationdots.PaginationDotsConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.popover.PopoverConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.progress.ProgressBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.radiobox.RadioBoxConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.radiobox.group.RadioBoxGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.rectskeleton.RectSkeletonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.scrollbar.ScrollBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.select.SelectConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.select.SelectItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.slider.SliderConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.splitter.SplitterConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.switcher.SwitchConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tabbar.TabBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tabbar.item.TabBarItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tabs.TabsConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tabs.item.TabItemComponent
import com.sdds.plugin.themebuilder.internal.components.tabs.item.TabItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextAreaConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textskeleton.TextSkeletonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.toast.ToastConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.toolbar.ToolBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tooltip.TooltipConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.wheel.WheelConfigDelegate
import com.sdds.plugin.themebuilder.internal.universal.ComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.HybridComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.universal.UniversalComponentConfigDelegate
import org.gradle.api.logging.Logging

internal fun componentDelegates(allMeta: List<ComponentMeta>, allComponents: List<Component> = emptyList()) =
    ComponentDelegatesScope(allMeta, allComponents).run {
        mapOf(
            "avatar" to universal("Avatar") { AvatarConfigDelegate() },
            "ai-answer" to universal("AiAnswer") { AiAnswerConfigDelegate() },
            "ai-header" to universal("AiHeader") { AiHeaderConfigDelegate() },
            "avatar-group" to universal("AvatarGroup") { AvatarGroupConfigDelegate() },
            "text-field" to universal("TextField") { TextFieldConfigDelegate() },
            "text-area" to universal("TextArea") { TextAreaConfigDelegate() },
            "segment" to universal("Segment") { SegmentConfigDelegate() },
            "segment-item" to universal("SegmentItem") { SegmentItemConfigDelegate() },
            "indicator" to universal("Indicator") { IndicatorConfigDelegate() },
            "divider" to universal("Divider") { DividerConfigDelegate() },
            "counter" to universal("Counter") { CounterConfigDelegate() },
            "check-box" to universal("CheckBox") { CheckBoxConfigDelegate() },
            "check-box-group" to universal("CheckBoxGroup") { CheckBoxGroupConfigDelegate() },
            "cell" to universal("Cell") { CellConfigDelegate() },
            "card" to universal("Card") { CardConfigDelegate() },
            "basic-button" to universal("BasicButton") {
                ButtonConfigDelegate(ButtonType.Basic)
            },
            "icon-button" to universal("IconButton") { ButtonConfigDelegate(ButtonType.Icon) },
            "link-button" to universal("LinkButton") { ButtonConfigDelegate(ButtonType.Link) },
            "badge" to universal("Badge") { BadgeConfigDelegate() },
            "icon-badge" to universal("IconBadge") { BadgeConfigDelegate() },
            "bottom-sheet" to universal("ModalBottomSheet") { BottomSheetConfigDelegate() },
            "chip" to universal("Chip") { ChipConfigDelegate() },
            "chip-group" to universal("ChipGroup") { ChipGroupConfigDelegate() },
            "radio-box" to universal("RadioBox") { RadioBoxConfigDelegate() },
            "radio-box-group" to universal("RadioBoxGroup") { RadioBoxGroupConfigDelegate() },
            "circular-progress-bar" to universal("CircularProgressBar") {
                CircularProgressConfigDelegate()
            },
            "progress-bar" to universal("ProgressBar") { ProgressBarConfigDelegate() },
            "switch" to universal("Switch") { SwitchConfigDelegate() },
            "popover" to universal("Popover") { PopoverConfigDelegate() },
            "tooltip" to universal("Tooltip") { TooltipConfigDelegate() },
            "overlay" to universal("Overlay") { OverlayConfigDelegate() },
            "toast" to universal("Toast") { ToastConfigDelegate() },
            "modal" to universal("Modal") { ModalConfigDelegate() },
            "note" to universal("Note") { NoteConfigDelegate() },
            "note-compact" to universal("NoteCompact") { NoteConfigDelegate() },
            "notification" to universal("Notification") { NotificationConfigDelegate() },
            "notification-content" to universal("NotificationContent") {
                NotificationContentConfigDelegate()
            },
            "rect-skeleton" to universal("RectSkeleton") { RectSkeletonConfigDelegate() },
            "spinner" to universal("Spinner") { SpinnerConfigDelegate() },
            "slider" to universal("Slider") { SliderConfigDelegate() },
            "list" to universal("List") { ListConfigDelegate() },
            "list-item" to universal("ListItem") { ListItemConfigDelegate() },
            "dropdown-menu" to universal("DropdownMenu") { DropdownMenuConfigDelegate() },
            "text-skeleton" to universal("TextSkeleton") { TextSkeletonConfigDelegate() },
            "accordion-item" to universal("AccordionItem") { AccordionItemConfigDelegate() },
            "accordion" to universal("Accordion") { AccordionConfigDelegate() },
            "wheel" to universal("Wheel") { WheelConfigDelegate() },
            "scroll-bar" to universal("ScrollBar") { ScrollBarConfigDelegate() },
            "image" to universal("Image") { ImageConfigDelegate() },
            "button-group" to universal("ButtonGroup") { ButtonGroupConfigDelegate() },
            "tab-bar-item" to universal("TabBarItem") { TabBarItemConfigDelegate() },
            "tab-bar" to universal("TabBar") { TabBarConfigDelegate() },
            "loader" to universal("Loader") { LoaderConfigDelegate() },
            "drawer" to universal("Drawer") { DrawerConfigDelegate() },
            "code-input" to universal("CodeInput") { CodeInputConfigDelegate() },
            "code-field" to universal("CodeField") { CodeFieldConfigDelegate() },
            "tabs" to universal("Tabs") { TabsConfigDelegate() },
            "tab-item" to universal("TabItem") {
                TabItemConfigDelegate(TabItemComponent.TabItem)
            },
            "icon-tab-item" to universal("IconTabItem") {
                TabItemConfigDelegate(TabItemComponent.IconTabItem)
            },
            "tool-bar" to universal("ToolBar") { ToolBarConfigDelegate() },
            "navigation-bar" to universal("NavigationBar") { NavigationBarConfigDelegate() },
            "navigation-drawer" to universal("NavigationDrawer") { NavigationDrawerConfigDelegate() },
            "navigation-drawer-item" to universal("NavigationDrawerItem") {
                NavigationDrawerItemConfigDelegate()
            },
            "collapsing-navigation-bar" to universal("CollapsingNavigationBar") {
                CollapsingNavigationBarConfigDelegate()
            },
            "pagination-dots" to universal("PaginationDots") {
                PaginationDotsConfigDelegate()
            },
            "carousel" to universal("Carousel") { CarouselConfigDelegate() },
            "dropdown-empty-state" to universal("DropdownEmptyState") {
                EmptyStateConfigDelegate()
            },
            "autocomplete" to universal("Autocomplete") { AutoCompleteConfigDelegate() },
            "file" to universal("File") { FileConfigDelegate() },
            "form-item" to universal("FormItem") { FormItemConfigDelegate() },
            "editable" to universal("Editable") { EditableConfigDelegate() },
            "select-item" to universal("SelectItem") { SelectItemConfigDelegate() },
            "select" to universal("Select") { SelectConfigDelegate() },
            "combo-box" to universal("ComboBox") { ComboBoxConfigDelegate() },
            "drop-zone" to universal("DropZone") { DropZoneConfigDelegate() },
            "splitter" to universal("Splitter") { SplitterConfigDelegate() },
        )
    }

private val logger = Logging.getLogger("ComponentDelegates")

private class ComponentDelegatesScope(
    private val allMeta: List<ComponentMeta>,
    private val allComponents: List<Component>,
) {
    fun universal(componentName: String): ComponentConfigDelegate<*> {
        val meta = allMeta.firstOrNull { it.componentName == componentName }
            ?: error("[$componentName] ComponentMeta not found. Make sure @ApiInfo is set on the StyleBuilder.")
        return UniversalComponentConfigDelegate(meta, allMeta, allComponents)
    }

    fun <F : ComponentConfigDelegate<*>> universal(
        componentName: String,
        fallback: () -> F,
    ): ComponentConfigDelegate<*> {
        val meta = allMeta.firstOrNull { it.componentName == componentName }
        val fallbackDelegate = fallback()
        return if (meta != null) {
            HybridComponentConfigDelegate(
                UniversalComponentConfigDelegate(meta, allMeta, allComponents),
                fallbackDelegate,
            )
        } else {
            logger.warn("[$componentName] ComponentMeta not found, using legacy fallback delegate")
            fallbackDelegate
        }
    }
}

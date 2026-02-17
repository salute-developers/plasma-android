package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.accordion.AccordionConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.accordion.AccordionItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.autocomplete.AutoCompleteConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.avatar.group.AvatarGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeConfigDelegate
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
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.divider.DividerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.drawer.DrawerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuConfigDelegate
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
import com.sdds.plugin.themebuilder.internal.components.slider.SliderConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerConfigDelegate
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
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.kotlin.dsl.provideDelegate

internal val componentDelegates by unsafeLazy {
    mapOf<String, ComponentConfigDelegate<*>>(
        "avatar" to AvatarConfigDelegate(),
        "avatar-group" to AvatarGroupConfigDelegate(),
        "text-field" to TextFieldConfigDelegate(),
        "text-area" to TextAreaConfigDelegate(),
        "segment" to SegmentConfigDelegate(),
        "segment-item" to SegmentItemConfigDelegate(),
        "indicator" to IndicatorConfigDelegate(),
        "divider" to DividerConfigDelegate(),
        "counter" to CounterConfigDelegate(),
        "check-box" to CheckBoxConfigDelegate(),
        "check-box-group" to CheckBoxGroupConfigDelegate(),
        "cell" to CellConfigDelegate(),
        "card" to CardConfigDelegate(),
        "basic-button" to ButtonConfigDelegate(ButtonType.Basic),
        "icon-button" to ButtonConfigDelegate(ButtonType.Icon),
        "link-button" to ButtonConfigDelegate(ButtonType.Link),
        "badge" to BadgeConfigDelegate(),
        "icon-badge" to BadgeConfigDelegate(),
        "bottom-sheet" to BottomSheetConfigDelegate(),
        "chip" to ChipConfigDelegate(),
        "chip-group" to ChipGroupConfigDelegate(),
        "radio-box" to RadioBoxConfigDelegate(),
        "radio-box-group" to RadioBoxGroupConfigDelegate(),
        "circular-progress-bar" to CircularProgressConfigDelegate(),
        "check-box" to CheckBoxConfigDelegate(),
        "check-box-group" to CheckBoxGroupConfigDelegate(),
        "progress-bar" to ProgressBarConfigDelegate(),
        "switch" to SwitchConfigDelegate(),
        "popover" to PopoverConfigDelegate(),
        "tooltip" to TooltipConfigDelegate(),
        "overlay" to OverlayConfigDelegate(),
        "toast" to ToastConfigDelegate(),
        "modal" to ModalConfigDelegate(),
        "note" to NoteConfigDelegate(),
        "note-compact" to NoteConfigDelegate(),
        "notification" to NotificationConfigDelegate(),
        "notification-content" to NotificationContentConfigDelegate(),
        "rect-skeleton" to RectSkeletonConfigDelegate(),
        "spinner" to SpinnerConfigDelegate(),
        "slider" to SliderConfigDelegate(),
        "list" to ListConfigDelegate(),
        "list-item" to ListItemConfigDelegate(),
        "dropdown-menu" to DropdownMenuConfigDelegate(),
        "text-skeleton" to TextSkeletonConfigDelegate(),
        "accordion-item" to AccordionItemConfigDelegate(),
        "accordion" to AccordionConfigDelegate(),
        "wheel" to WheelConfigDelegate(),
        "scroll-bar" to ScrollBarConfigDelegate(),
        "image" to ImageConfigDelegate(),
        "button-group" to ButtonGroupConfigDelegate(),
        "tab-bar-item" to TabBarItemConfigDelegate(),
        "tab-bar" to TabBarConfigDelegate(),
        "loader" to LoaderConfigDelegate(),
        "drawer" to DrawerConfigDelegate(),
        "code-input" to CodeInputConfigDelegate(),
        "code-field" to CodeFieldConfigDelegate(),
        "drawer" to DrawerConfigDelegate(),
        "tabs" to TabsConfigDelegate(),
        "tab-item" to TabItemConfigDelegate(TabItemComponent.TabItem),
        "icon-tab-item" to TabItemConfigDelegate(TabItemComponent.IconTabItem),
        "toolbar" to ToolBarConfigDelegate(),
        "navigation-bar" to NavigationBarConfigDelegate(),
        "collapsing-navigation-bar" to CollapsingNavigationBarConfigDelegate(),
        "pagination-dots" to PaginationDotsConfigDelegate(),
        "carousel" to CarouselConfigDelegate(),
        "dropdown-empty-state" to EmptyStateConfigDelegate(),
        "autocomplete" to AutoCompleteConfigDelegate(),
        "file" to FileConfigDelegate(),
        "form-item" to FormItemConfigDelegate(),
    )
}

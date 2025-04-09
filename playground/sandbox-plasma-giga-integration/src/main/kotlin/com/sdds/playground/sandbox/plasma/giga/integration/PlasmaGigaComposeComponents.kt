package com.sdds.playground.sandbox.plasma.giga.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.giga.integration.avatar.PlasmaGigaAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.avatar.group.PlasmaGigaAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.PlasmaGigaBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.PlasmaGigaBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.PlasmaGigaBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.icon.PlasmaGigaIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.icon.PlasmaGigaIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.badge.icon.PlasmaGigaIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.bottomsheet.PlasmaGigaBottomSheetVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.button.basic.PlasmaGigaBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.button.icon.PlasmaGigaIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.button.link.PlasmaGigaLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.card.PlasmaGigaCardClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.card.PlasmaGigaCardSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.cell.compose.PlasmaGigaCellVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.checkbox.PlasmaGigaCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.checkbox.group.PlasmaGigaCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.chip.PlasmaGigaChipVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.chip.group.PlasmaGigaChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.chip.group.PlasmaGigaChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.chip.group.PlasmaGigaEmbeddedChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.chip.group.PlasmaGigaEmbeddedChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.counter.PlasmaGigaCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.divider.compose.PlasmaGigaDividerVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.indicator.compose.PlasmaGigaIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.progress.PlasmaGigaProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.radiobox.PlasmaGigaRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.radiobox.group.PlasmaGigaRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.segment.PlasmaGigaSegmentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.segment.item.PlasmaGigaSegmentItemVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.switcher.PlasmaGigaSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.textarea.PlasmaGigaTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.textarea.clear.PlasmaGigaTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.textfield.PlasmaGigaTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.integration.textfield.clear.PlasmaGigaTextFieldClearVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaGigaComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                PlasmaGigaAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                PlasmaGigaAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaGigaBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaGigaBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaGigaBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaGigaIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaGigaIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaGigaIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                PlasmaGigaBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                PlasmaGigaIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                PlasmaGigaLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                PlasmaGigaCardClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                PlasmaGigaCardSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                PlasmaGigaBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                PlasmaGigaCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                PlasmaGigaCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaGigaCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                PlasmaGigaChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaGigaChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaGigaChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaGigaEmbeddedChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaGigaEmbeddedChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                PlasmaGigaCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                PlasmaGigaIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                PlasmaGigaProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                PlasmaGigaRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaGigaRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                PlasmaGigaSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                PlasmaGigaTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                PlasmaGigaTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                PlasmaGigaTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                PlasmaGigaTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                PlasmaGigaSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                PlasmaGigaSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                PlasmaGigaDividerVariationsCompose,
            ),
        ).associateBy { it.key }
}

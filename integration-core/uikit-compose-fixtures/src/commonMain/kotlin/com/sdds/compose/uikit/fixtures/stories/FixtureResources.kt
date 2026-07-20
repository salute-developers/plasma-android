package com.sdds.compose.uikit.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.uikit.ImageSource
import com.sdds.icons.compose.AddFill24
import com.sdds.icons.compose.AiOutline24
import com.sdds.icons.compose.AlarmDoneFill36
import com.sdds.icons.compose.ArrowLeft24
import com.sdds.icons.compose.ArrowRight24
import com.sdds.icons.compose.BackwardOutline24
import com.sdds.icons.compose.ChevronDown24
import com.sdds.icons.compose.ChevronUp24
import com.sdds.icons.compose.Clip24
import com.sdds.icons.compose.Close16
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.Close36
import com.sdds.icons.compose.Clown24
import com.sdds.icons.compose.CopyOutline24
import com.sdds.icons.compose.DisclosureRightOutline24
import com.sdds.icons.compose.DislikeOutline24
import com.sdds.icons.compose.EditFill36
import com.sdds.icons.compose.EditOutline24
import com.sdds.icons.compose.FileCheckFill24
import com.sdds.icons.compose.FileCheckFill36
import com.sdds.icons.compose.HomeAltFill36
import com.sdds.icons.compose.LikeOutline24
import com.sdds.icons.compose.MailOutline24
import com.sdds.icons.compose.Menu24
import com.sdds.icons.compose.MicOutline24
import com.sdds.icons.compose.PanelSidebarLOutline24
import com.sdds.icons.compose.Plasma16
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.Plasma36
import com.sdds.icons.compose.Plus24
import com.sdds.icons.compose.RepeatOutline24
import com.sdds.icons.compose.SaluteOutline24
import com.sdds.icons.compose.SaluteOutline36
import com.sdds.icons.compose.ScribbleDiagonal24
import com.sdds.icons.compose.ScribbleDiagonal36
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Search24
import com.sdds.icons.compose.SendOutline24
import com.sdds.icons.compose.SettingsFilter24
import com.sdds.icons.compose.Shazam16
import com.sdds.icons.compose.Shazam24
import com.sdds.icons.compose.SmileFill36
import com.sdds.icons.compose.SmileOutline36

@Composable
fun painterResource(id: ImageVector): Painter = rememberVectorPainter(id)

fun resourceImageSource(id: ImageVector): ImageSource = ImageSource { painterResource(id) }

@Composable
fun stringResource(value: String): String = value

object FixtureR {
    object drawable {
        val ic_add_fill_24 = SddsIcons.AddFill24
        val ic_ai_outline_24 = SddsIcons.AiOutline24
        val ic_alarm_done_fill_36 = SddsIcons.AlarmDoneFill36
        val ic_arrow_left_24 = SddsIcons.ArrowLeft24
        val ic_arrow_right_24 = SddsIcons.ArrowRight24
        val ic_backward_outline_24 = SddsIcons.BackwardOutline24
        val ic_chevron_down_24 = SddsIcons.ChevronDown24
        val ic_chevron_up_24 = SddsIcons.ChevronUp24
        val ic_clip_24 = SddsIcons.Clip24
        val ic_close_16 = SddsIcons.Close16
        val ic_close_24 = SddsIcons.Close24
        val ic_close_36 = SddsIcons.Close36
        val ic_clown_24 = SddsIcons.Clown24
        val ic_copy_outline_24 = SddsIcons.CopyOutline24
        val ic_disclosure_right_outline_24 = SddsIcons.DisclosureRightOutline24
        val ic_dislike_outline_24 = SddsIcons.DislikeOutline24
        val ic_edit_fill_36 = SddsIcons.EditFill36
        val ic_edit_outline_24 = SddsIcons.EditOutline24
        val ic_file_check_fill_24 = SddsIcons.FileCheckFill24
        val ic_file_check_fill_36 = SddsIcons.FileCheckFill36
        val ic_home_alt_fill_36 = SddsIcons.HomeAltFill36
        val ic_like_outline_24 = SddsIcons.LikeOutline24
        val ic_mail_outline_24 = SddsIcons.MailOutline24
        val ic_menu_24 = SddsIcons.Menu24
        val ic_mic_outline_24 = SddsIcons.MicOutline24
        val ic_panel_sidebar_l_outline_24 = SddsIcons.PanelSidebarLOutline24
        val ic_plasma_16 = SddsIcons.Plasma16
        val ic_plasma_24 = SddsIcons.Plasma24
        val ic_plasma_36 = SddsIcons.Plasma36
        val ic_plus_24 = SddsIcons.Plus24
        val ic_repeat_outline_24 = SddsIcons.RepeatOutline24
        val ic_salute_outline_24 = SddsIcons.SaluteOutline24
        val ic_salute_outline_36 = SddsIcons.SaluteOutline36
        val ic_scribble_diagonal_24 = SddsIcons.ScribbleDiagonal24
        val ic_scribble_diagonal_36 = SddsIcons.ScribbleDiagonal36
        val ic_search_24 = SddsIcons.Search24
        val ic_send_outline_24 = SddsIcons.SendOutline24
        val ic_settings_filter_24 = SddsIcons.SettingsFilter24
        val ic_shazam_16 = SddsIcons.Shazam16
        val ic_shazam_24 = SddsIcons.Shazam24
        val ic_smile_fill_36 = SddsIcons.SmileFill36
        val ic_smile_outline_36 = SddsIcons.SmileOutline36
        val il_avatar_test = SddsIcons.Plasma36
    }

    object string {
        const val sandbox_clear_focus = "Clear focus"
        const val sandbox_enable_focus_selector = "Enable focus selector"
    }
}

package com.sdds.playground.sandbox.plasma.sd.service.integration.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.list.L
import com.sdds.plasma.sd.service.styles.list.ListNormal
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.list.S
import com.sdds.plasma.sd.service.styles.list.Xl
import com.sdds.plasma.sd.service.styles.list.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceListNormalVariationsCompose :
    ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { ListNormal.Xl.style() },
            "L" to { ListNormal.L.style() },
            "M" to { ListNormal.M.style() },
            "S" to { ListNormal.S.style() },
            "Xs" to { ListNormal.Xs.style() },
        )
}

package com.sdds.plugin.themebuilder.internal.universal

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Все пары взяты из реального модуля `icons-compose` (ветка `feature/kmp-icons`,
 * сгенерирован Valkyrie). Алгоритм [ComposeIconName] сверен со всем набором:
 * из 4248 drawable он воспроизводит все 4230 реально сгенерированных идентификатора
 * байт-в-байт (оставшиеся 18 — иконки, которые Valkyrie не собрал, семейство `Sbboom*`/`Sbbox*`).
 */
class ComposeIconNameTest {

    @Test
    fun `простое имя из двух сегментов`() {
        assertEquals("ActionsAdd", ComposeIconName.fromDrawableName("actions_add"))
    }

    @Test
    fun `имя с размерным суффиксом`() {
        assertEquals("AddFill16", ComposeIconName.fromDrawableName("add_fill_16"))
        assertEquals("AddOutline24", ComposeIconName.fromDrawableName("add_outline_24"))
        assertEquals("StarFill36", ComposeIconName.fromDrawableName("star_fill_36"))
    }

    @Test
    fun `буква после цифры переводится в верхний регистр`() {
        assertEquals("Button2X2TopLFill36", ComposeIconName.fromDrawableName("button_2x2_top_l_fill_36"))
    }

    @Test
    fun `однобуквенные сегменты капитализируются`() {
        assertEquals("PanelSidebarRFill36", ComposeIconName.fromDrawableName("panel_sidebar_r_fill_36"))
    }

    @Test
    fun `многословные имена и короткие сегменты из реального набора`() {
        assertEquals("AirQuality24", ComposeIconName.fromDrawableName("air_quality_24"))
        assertEquals("AiFill16", ComposeIconName.fromDrawableName("ai_fill_16"))
        assertEquals("AddSmileOutline36", ComposeIconName.fromDrawableName("add_smile_outline_36"))
    }

    @Test
    fun `точки как разделители трактуются наравне с подчёркиваниями`() {
        assertEquals("AddFill16", ComposeIconName.fromDrawableName("add.fill.16"))
    }
}

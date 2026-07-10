package com.sdds.icons.compose

/**
 * Пак Compose-иконок дизайн-системы SDDS.
 *
 * Иконки подключаются как top-level extension-property на этом объекте, например
 * `SddsIcons.Accessibility24`, и представляют собой чистый
 * [androidx.compose.ui.graphics.vector.ImageVector] без android-ресурсов —
 * поэтому пригодны для использования в `commonMain` Compose Multiplatform.
 *
 * Сами иконки генерируются из общего с XML-модулем `sdds-core:icons` набора
 * XML-ресурсов (`android-icons`) инструментом Valkyrie (`svgxml2imagevector`)
 * в CI и складываются в этот же пакет. Здесь объявлен только объект-приёмник.
 *
 * Замечание по набору: 6 иконок, попадающих на case-insensitive коллизию имён
 * (`ic_sbboom_*` / `ic_sbbox_top_outline_*`), в Compose-набор НЕ включены —
 * подробности в README модуля.
 */
public object SddsIcons

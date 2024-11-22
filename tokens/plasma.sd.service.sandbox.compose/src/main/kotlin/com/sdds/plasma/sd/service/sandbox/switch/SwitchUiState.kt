package com.sdds.plasma.sd.service.sandbox.switch

/**
 * Состояние switch
 *
 * @property active состояние switch
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 */
internal data class SwitchUiState(
    val active: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

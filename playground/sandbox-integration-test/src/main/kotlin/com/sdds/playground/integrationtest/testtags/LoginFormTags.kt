package com.sdds.playground.integrationtest.testtags

/**
 * Тэги для TextField
 */
@Suppress(
    "UndocumentedPublicProperty",
    "UndocumentedPublicClass",
)
internal object LoginFormTags {
    const val ROOT = "login_form_scenario_root"
    const val EMAIL = "login_form_email"
    const val PASSWORD = "login_form_password"
    const val CONTINUE = "login_form_continue"
    const val USE_INVALID = "login_form_use_invalid"
    const val USE_VALID = "login_form_use_valid"
    const val RESET = "login_form_reset"
    const val ERROR = "login_form_error"
    const val LOADING_HINT = "login_form_loading_hint"

    internal fun check(index: Int): String = "login_form_check_$index"
}

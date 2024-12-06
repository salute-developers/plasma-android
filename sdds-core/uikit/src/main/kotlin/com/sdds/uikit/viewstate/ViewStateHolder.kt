package com.sdds.uikit.viewstate

/**
 * Интерфейс владельца [ViewState]
 */
@Deprecated("Использовать ColorStateHolder")
interface ViewStateHolder {

    /**
     * Состояние
     * @see [ViewState]
     */
    var state: ViewState?
}

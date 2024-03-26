package com.sdds.uikit.viewstate

/**
 * Интерфейс владельца [ViewState]
 */
internal interface ViewStateHolder {

    /**
     * Состояния
     * @see [ViewState]
     */
    var state: ViewState?
}

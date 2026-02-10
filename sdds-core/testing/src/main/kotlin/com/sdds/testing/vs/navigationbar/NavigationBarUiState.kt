package com.sdds.testing.vs.navigationbar

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.NavigationBar
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента NavigationBar
 * @property variant вариация
 * @property appearance разновидность компонента
 * @property title заголовок
 * @property description описание
 * @property contentText текст в блоке content
 * @property hasActionStart наличие action в начале компонента
 * @property hasActionEnd наличие action в конце компонента
 * @property textPlacement расположение текствого блока (title + description)
 * @property contentPlacement расположение блока с content
 * @property textAlign выравнивание текстового блока
 * @property centerAlignmentStrategy выравнивание контента, находящегося в блоке с actions
 */
@Parcelize
data class NavigationBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val description: String = "Description",
    val contentText: String = "Content",
    val hasActionStart: Boolean = true,
    val hasActionEnd: Boolean = true,
    val textPlacement: TextPlacement = TextPlacement.Bottom,
    val contentPlacement: ContentPlacement = ContentPlacement.Bottom,
    val textAlign: TextAlignment = TextAlignment.Center,
    val centerAlignmentStrategy: AlignmentStrategy = AlignmentStrategy.Absolute,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Расположение текствого блока (title + description)
 */
@Parcelize
enum class TextPlacement : Parcelable {
    Inner,
    Bottom,
}

/**
 * Преобразует [TextPlacement] в [NavigationBar] TextPlacement
 */
fun TextPlacement.toNavBarTextPlacement(): Int = when (this) {
    TextPlacement.Inner -> NavigationBar.TEXT_PLACEMENT_INNER
    TextPlacement.Bottom -> NavigationBar.TEXT_PLACEMENT_BOTTOM
}

/**
 * Расположение блока content
 */
@Parcelize
enum class ContentPlacement : Parcelable {
    Inner,
    Bottom,
}

/**
 * Преобразует [ContentPlacement] в [NavigationBar] ContentPlacement
 */
fun ContentPlacement.toNavBarContentPlacement(): Int = when (this) {
    ContentPlacement.Inner -> NavigationBar.CONTENT_PLACEMENT_INNER
    ContentPlacement.Bottom -> NavigationBar.CONTENT_PLACEMENT_BOTTOM
}

/**
 * Dыравнивание текстового блока
 */
@Parcelize
enum class TextAlignment : Parcelable {
    Start,
    Center,
    End,
}

/**
 * Преобразует [TextAlignment] в [NavigationBar] TextAlignment
 */
fun TextAlignment.toNavBarTextAlignment(): Int = when (this) {
    TextAlignment.Start -> NavigationBar.TEXT_ALIGNMENT_START
    TextAlignment.Center -> NavigationBar.TEXT_ALIGNMENT_CENTER
    TextAlignment.End -> NavigationBar.TEXT_ALIGNMENT_END
}

/**
 * Выравнивание контента, находящегося в блоке с actions
 */
@Parcelize
enum class AlignmentStrategy : Parcelable {
    Absolute,
    Relative
}

/**
 * Преобразует [AlignmentStrategy] в [NavigationBar] AlignmentStrategy
 */
fun AlignmentStrategy.toNavBarAlignmentStrategy(): Int = when (this) {
    AlignmentStrategy.Absolute -> NavigationBar.ALIGNMENT_STRATEGY_ABSOLUTE
    AlignmentStrategy.Relative -> NavigationBar.ALIGNMENT_STRATEGY_RELATIVE
}
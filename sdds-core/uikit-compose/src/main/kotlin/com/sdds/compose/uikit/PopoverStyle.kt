package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance

///**
// * CompositionLocal c [PopoverStyle] для компонента [Popover]
// */
//val LocalPopoverStyle = compositionLocalOf { PopoverStyle.builder().style() }
//
//@Immutable
//interface PopoverStyle {
//    val shape: CornerBasedShape
//
//    val shadow: ShadowAppearance
//
//    val dimensions: PopoverDimensions
//
//    val colors: PopoverColors
//
//    companion object {
//        /**
//         * Возвращает экземпляр [PopoverStyleBuilder]
//         */
//        fun builder(receiver: Any? = null): PopoverStyleBuilder = DefaultPopoverStyle.Builder()
//    }
//}
//
//@Immutable
//interface PopoverColors {
//    val backgroundColor: StatefulValue<Brush>
//
//    companion object {
//        fun builder(): PopoverColorsBuilder = DefaultPopoverColors.Builder()
//    }
//}
//
//@Immutable
//interface PopoverDimensions {
//
//    val width: Dp //todo зачем?
//
//    val offset: Dp
//
//    val tailWidth: Dp
//
//    val tailHeight: Dp
//
//    val tailPadding: Dp
//
//    companion object {
//        fun builder(): PopoverDimensionsBuilder = DefaultPopoverDimensions.Builder()
//    }
//}
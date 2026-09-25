package com.sdds.plasma.homeds.components.productbottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.modal.BottomSheetState
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.bottomsheet.ModalBottomSheetMotionStyle
import com.sdds.compose.uikit.motion.components.bottomsheet.rememberModalBottomSheetMotion
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.plasma.homeds.motion.productbottomsheet.ProductBottomSheetMotionStyle
import com.sdds.plasma.homeds.motion.productbottomsheet.rememberProductBottomSheetMotion
import com.sdds.plasma.homeds.styles.bottomsheet.ModalBottomSheet

/**
 * Компонент ProductModalBottomSheet
 *
 * @param dimBackground нужно ли затемнять фон
 * @param fitContent ModalBottomSheet открывается по высоте контента
 * @param modifier модификатор
 * @param style стиль компонента [ProductBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [ModalBottomSheet]
 * @param edgeToEdge включает отображение ModalBottomSheet в режиме edge-to-edge
 * @param title заголовок
 * @param subTitle подзаголовок
 * @param footer нижний колонтитул
 * @param body основной контент
 * (компонент рисуется под navBar и под statusBar)
 */
@Suppress("LongMethod")
@Composable
fun ProductBottomSheet(
    dimBackground: Boolean,
    fitContent: Boolean,
    modifier: Modifier = Modifier,
    style: ProductBottomSheetStyle = LocalProductBottomSheetStyle.current,
    sheetState: BottomSheetState = rememberModalBottomSheetState(BottomSheetValue.Hidden),
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    handlePlacement: BottomSheetHandlePlacement = style.bottomSheetStyle.handlePlacement,
    useNativeBlackout: Boolean = true,
    edgeToEdge: Boolean = true,
    title: @Composable (ColumnScope.() -> Unit)? = null,
    subTitle: @Composable (ColumnScope.() -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    body: @Composable (() -> Unit),
    bottomSheetMotion: Motion<ModalBottomSheetMotionStyle> = rememberModalBottomSheetMotion(),
    motion: Motion<ProductBottomSheetMotionStyle> = rememberProductBottomSheetMotion(),
) {
    ModalBottomSheet(
        dimBackground = dimBackground,
        fitContent = fitContent,
        motion = bottomSheetMotion,
        modifier = modifier,
        style = style.bottomSheetStyle,
        sheetState = sheetState,
        sheetGesturesEnabled = sheetGesturesEnabled,
        onDismiss = onDismiss,
        handlePlacement = handlePlacement,
        useNativeBlackout = useNativeBlackout,
        edgeToEdge = edgeToEdge,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            if (title != null || subTitle != null) {
                val pStart by style.dimensions.headerPaddingStart.getValueAsState(motion.context)
                val pEnd by style.dimensions.headerPaddingEnd.getValueAsState(motion.context)
                val pTop by style.dimensions.headerPaddingTop.getValueAsState(motion.context)
                val pBottom by style.dimensions.headerPaddingBottom.getValueAsState(motion.context)
                val gap by style.dimensions.subtitleGap.getValueAsState(motion.context)
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = pStart, end = pEnd, top = pTop, bottom = pBottom),
                    verticalArrangement = Arrangement.spacedBy(gap),
                ) {
                    title?.let { content ->
                        val titleStyle by style.titleStyle.getTextStyleAsState(motion.context, motion.style.titleStyle)
                        CompositionLocalProvider(LocalTextStyle provides titleStyle) {
                            content()
                        }
                    }
                    subTitle?.let { content ->
                        val subTitleStyle by style.subTitleStyle.getTextStyleAsState(
                            motion.context,
                            motion.style.subTitleStyle,
                        )
                        CompositionLocalProvider(LocalTextStyle provides subTitleStyle) {
                            content()
                        }
                    }
                }
            }
            val pStart by style.dimensions.bodyPaddingStart.getValueAsState(motion.context)
            val pEnd by style.dimensions.bodyPaddingEnd.getValueAsState(motion.context)
            val pTop by style.dimensions.bodyPaddingTop.getValueAsState(motion.context)
            val pBottom by style.dimensions.bodyPaddingBottom.getValueAsState(motion.context)
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = pStart, end = pEnd, top = pTop, bottom = pBottom),
            ) {
                body()
            }
            footer?.let {
                val pStart by style.dimensions.footerPaddingStart.getValueAsState(motion.context)
                val pEnd by style.dimensions.footerPaddingEnd.getValueAsState(motion.context)
                val pTop by style.dimensions.footerPaddingTop.getValueAsState(motion.context)
                val pBottom by style.dimensions.footerPaddingBottom.getValueAsState(motion.context)
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = pStart, end = pEnd, top = pTop, bottom = pBottom),
                ) {
                    CompositionLocalProvider(LocalButtonGroupStyle provides style.buttonGroupStyle) {
                        it()
                    }
                }
            }
        }
    }
}

package com.sdds.compose.uikit.ai

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.TextLayoutResult
import com.sdds.api.info.compose.ApiName
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.LocalFileStyle
import com.sdds.compose.uikit.LocalImageStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.motion.aiusermessage.AiUserMessageMotionStyle
import com.sdds.compose.uikit.ai.motion.aiusermessage.rememberAiUserMessageMotion
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

/**
 * Компонент AiUserMessage используется для отображения запроса пользователя в ИИ-сценариях.
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isInEdit находится ли компонент в режиме редактирования текста
 * @param uploadingContent загружаемый пользователем контент
 * @param actions действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup]
 * @param editableActions действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup],
 * отображающиеся в режиме редактирования
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param onTextLayout колбэк, сигнализирующий об окончания лэйаута текста
 * @param motion объект анимаций
 */
@Composable
fun AiUserMessage(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    style: AiUserMessageStyle = LocalAiUserMessageStyle.current,
    isInEdit: Boolean = false,
    uploadingContent: (@Composable ColumnScope.() -> Unit)? = null,
    actions: (ButtonGroupScope.() -> Unit)? = null,
    editableActions: (ButtonGroupScope.() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    motion: Motion<AiUserMessageMotionStyle> = rememberAiUserMessageMotion(),
) {
    SideEffect {
        motion.context.semanticStateSource.set(
            AiUserMessageState.InEdit,
            isInEdit,
        )
    }
    val focusRequester = remember { FocusRequester() }
    val uploadingBackground =
        style.colors.uploadingBackground.getBrushAsState(motion.context, motion.style.uploadingBackground)
    val uploadingShape = style.uploadingShape.getValueAsState(motion.context)
    val messageBackground =
        style.colors.messageBackground.getBrushAsState(motion.context, motion.style.messageBackground)
    val messageShape = style.messageShape.getValueAsState(motion.context)
    val editableActionsGap by style.dimensions.editableActionsGap.getValueAsState(motion.context)
    val actionGap by style.dimensions.actionsGap.getValueAsState(motion.context)
    val uploadingGap by style.dimensions.uploadingGroupGap.getValueAsState(motion.context)
    val uploadingFilesGap by style.dimensions.uploadingFilesGap.getValueAsState(motion.context)
    val titleBrush = style.colors.text.getBrushAsState(motion.context, motion.style.textColor)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.End,
    ) {
        uploadingContent?.let {
            Column(
                modifier = Modifier
                    .clip(uploadingShape.value)
                    .backgroundBrush(
                        brushProducer = { uploadingBackground.value },
                        shape = uploadingShape.value,
                    )
                    .padding(style.dimensions.getUploadingPaddings(motion)),
                verticalArrangement = Arrangement.spacedBy(uploadingFilesGap),
            ) {
                CompositionLocalProvider(
                    LocalFileStyle provides style.uploadingFileStyle,
                    LocalImageStyle provides style.uploadingImageStyle,
                ) {
                    it.invoke(this)
                }
            }
            Spacer(modifier = Modifier.height(uploadingGap))
        }
        Column(
            modifier = Modifier
                .backgroundBrush(
                    brushProducer = { messageBackground.value },
                    shape = messageShape.value,
                )
                .padding(style.dimensions.getMessagePaddings(motion)),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.spacedBy(editableActionsGap),
        ) {
            if (isInEdit) {
                Editable(
                    modifier = Modifier.focusRequester(focusRequester),
                    style = style.editableStyle,
                    value = value,
                    onValueChange = onValueChange,
                    keyboardActions = keyboardActions,
                    keyboardOptions = keyboardOptions,
                    onTextLayout = onTextLayout,
                )
                LaunchedEffect(Unit) {
                    focusRequester.requestFocus()
                }
                editableActions?.let {
                    ButtonGroup(style = style.editableActionsButtonGroupStyle, content = it)
                }
            } else {
                val textStyle by style.textStyle.getTextStyleAsState(motion.context, motion.style.textStyle)
                Text(
                    text = value,
                    brush = { titleBrush.value },
                    style = textStyle,
                )
            }
        }
        actions?.let {
            Spacer(modifier = Modifier.height(actionGap))
            ButtonGroup(style = style.actionsButtonGroupStyle, content = it)
        }
    }
}

/**
 * Семантические состояния [AiUserMessage].
 */
@ApiStateSet
enum class AiUserMessageState : ValueState {

    /**
     * AiUserMessage находится в состоянии, отображающим введенный текст,
     * редактирование не поддерживается.
     */
    Default,

    /**
     * AiUserMessage находится в состоянии редактирования текста.
     */
    @ApiName(name = "in-edit")
    InEdit,
}

@Composable
private fun AiUserMessageDimensions.getUploadingPaddings(
    motion: Motion<AiUserMessageMotionStyle>,
) = PaddingValues(
    uploadingPaddingStart.getValueAsState(motion.context).value,
    uploadingPaddingTop.getValueAsState(motion.context).value,
    uploadingPaddingEnd.getValueAsState(motion.context).value,
    uploadingPaddingBottom.getValueAsState(motion.context).value,
)

@Composable
private fun AiUserMessageDimensions.getMessagePaddings(
    motion: Motion<AiUserMessageMotionStyle>,
) = PaddingValues(
    messagePaddingStart.getValueAsState(motion.context).value,
    messagePaddingTop.getValueAsState(motion.context).value,
    messagePaddingEnd.getValueAsState(motion.context).value,
    messagePaddingBottom.getValueAsState(motion.context).value,
)

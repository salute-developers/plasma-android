package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ai.AiUserMessage
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для [AiUserMessage]
 */

/**
 * PLASMA-T2714, PLASMA-T2719
 */
@Composable
fun AiUserMsgImageHasActionsEditableActionsUploadingContent(
    style: AiUserMessageStyle,
) {
    AiUserMessageCommon(
        style = style,
        uploadingContent = {
            UploadingImage()
        },
        hasActions = true,
        hasEditableActions = true,
    )
}

/**
 * PLASMA-T2715
 */
@Composable
fun AiUserMsgFileGroupUploadingContent(
    style: AiUserMessageStyle,
) {
    AiUserMessageCommon(
        style = style,
        value = LONG_TEXT,
        uploadingContent = {
            repeat(5) {
                AiUserMessageContentFile()
            }
        },
    )
}

/**
 * PLASMA-T2716
 */
@Composable
fun AiUserMsgFileHasActionsEditableActions(
    style: AiUserMessageStyle,
) {
    AiUserMessageCommon(
        style = style,
        value = LONG_TEXT,
        hasActions = true,
        hasEditableActions = true,
    )
}

/**
 * PLASMA-T2717
 */
@Composable
fun AiUserMsgHasActionsEditableUploadingContent(
    style: AiUserMessageStyle,
) {
    AiUserMessageCommon(
        style = style,
        value = LONG_TEXT,
        hasActions = true,
        hasEditableActions = true,
        uploadingContent = { AiUserMessageContentFile() },
    )
}

/**
 * PLASMA-T2718
 */
@Composable
fun AiUserMsgHasActionsUploadingContent(
    style: AiUserMessageStyle,
) {
    AiUserMessageCommon(
        style = style,
        value = LONG_TEXT,
        hasActions = true,
        uploadingContent = { AiUserMessageContentFile() },
    )
}

/**
 * PLASMA-T2720
 */
@Composable
fun AiUserMsgInEdit(
    style: AiUserMessageStyle,
) {
    var editMode by remember { mutableStateOf(true) }
    AiUserMessageCommon(
        style = style,
        value = LONG_TEXT,
        hasActions = true,
        hasEditableActions = true,
        isInEdit = editMode,
        uploadingContent = { AiUserMessageContentFile() },
    )
}

/**
 * Общий тест-кейс
 */
@Composable
fun AiUserMessageCommon(
    modifier: Modifier = Modifier,
    style: AiUserMessageStyle,
    value: String = "Сообщение пользователя",
    uploadingContent: (@Composable ColumnScope.() -> Unit)? = null,
    hasActions: Boolean = false,
    hasEditableActions: Boolean = false,
    isInEdit: Boolean = false,
) {
    var draftMessage by remember { mutableStateOf("") }
    AiUserMessage(
        style = style,
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = { draftMessage = it },
        isInEdit = isInEdit,
        uploadingContent = uploadingContent,
        editableActions = if (hasEditableActions) {
            { aiUserMessageEditableActions() }
        } else {
            null
        },
        actions = if (hasActions) {
            { aiUserMessageActions() }
        } else {
            null
        },
    )
}

/**
 * File для тестов
 */
@Composable
fun AiUserMessageContentFile() {
    File(
        modifier = Modifier.width(200.dp),
        label = "some_file.pdf",
        isLoading = false,
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_24),
                contentDescription = "",
            )
        },
        action = {
            IconButton(
                iconRes = R.drawable.ic_close_16,
                onClick = {},
            )
        },
        actionPlacement = FileActionPlacement.End,
    )
}

private fun ButtonGroupScope.aiUserMessageActions() {
    button { IconButton(iconRes = R.drawable.ic_backward_outline_24, onClick = {}) }
    button { IconButton(iconRes = R.drawable.ic_copy_outline_24, onClick = {}) }
    button { IconButton(iconRes = R.drawable.ic_plasma_24, onClick = {}) }
    button {
        IconButton(iconRes = R.drawable.ic_edit_outline_24, onClick = {})
    }
}

private fun ButtonGroupScope.aiUserMessageEditableActions() {
    button { Button(label = "Сохранить", onClick = {}) }
    button { Button(label = "Отменить", onClick = {}) }
}

@Composable
private fun UploadingImage() {
    Image(
        modifier = Modifier.size(120.dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.TopEnd,
        painter = painterResource(id = com.sdds.compose.uikit.fixtures.R.drawable.il_avatar_for_test),
        contentDescription = "FileImage",
    )
}

private const val LONG_TEXT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
        "It has survived not only five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
        "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
        "like Aldus PageMaker including versions of Lorem Ipsum."

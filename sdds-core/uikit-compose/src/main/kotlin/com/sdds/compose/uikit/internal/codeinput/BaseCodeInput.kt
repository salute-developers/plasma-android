package com.sdds.compose.uikit.internal.codeinput

import androidx.annotation.IntRange
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.animation.ShakeAnimationDefaults.DefaultShakeAnimationDurationMs
import com.sdds.compose.uikit.internal.animation.rememberShakeAnimationSpec
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import kotlinx.coroutines.delay

@Composable
@Suppress("LongMethod")
internal fun BaseCodeInput(
    modifier: Modifier = Modifier,
    dimensions: BaseCodeInputDimensions,
    colors: BaseCodeInputColors,
    textStyles: BaseCodeInputTextStyles,
    cursor: BaseCodeInputCursor?,
    itemShape: CornerBasedShape? = null,
    groupShape: CornerBasedShape? = null,
    onCodeComplete: (String) -> Boolean = { true },
    isItemValid: (String) -> Boolean = { true },
    caption: String? = null,
    captionAlignment: BaseCodeInputCaptionAlignment = BaseCodeInputCaptionAlignment.Center,
    hidden: Boolean = false,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    animationSpec: AnimationSpec<Float>? = rememberShakeAnimationSpec(),
    codeGroupInfo: CodeGroupInfo = remember { defaultCodeGroups() },
) {
    var code by remember { mutableStateOf("") }
    var inputEnabled by remember { mutableStateOf(true) }
    var isCodeValid by remember { mutableStateOf(true) }
    var isCaptionError by remember { mutableStateOf(false) }
    val captionErrorState = remember(isCaptionError) {
        if (!isCaptionError) emptySet() else setOf(CodeInputStates.Error)
    }

    BasicTextField(
        modifier = modifier,
        value = code,
        singleLine = true,
        enabled = enabled,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        onValueChange = { newValue ->
            if (inputEnabled && newValue.length <= codeGroupInfo.codeLength) {
                code = newValue
                if (newValue.length == codeGroupInfo.codeLength && isItemValid.invoke(
                        newValue.last().toString(),
                    )
                ) {
                    isCodeValid = onCodeComplete.invoke(newValue)
                    isCaptionError = !isCodeValid
                } else {
                    isCaptionError = false
                }
            }
        },
        decorationBox = { _ ->
            SubcomposeLayout { constraints ->
                val fieldPlaceable = subcompose("Field") {
                    val shakeOffset by rememberCodeInputShakeAnimation(
                        isActive = !isCodeValid,
                        onStart = { inputEnabled = false },
                        onFinish = {
                            inputEnabled = true
                            isCodeValid = true
                            code = ""
                        },
                        animationSpec = animationSpec,
                    )
                    val (startShape, middleShape, endShape) = rememberShapes(itemShape, groupShape)
                    Row(
                        modifier = Modifier
                            .codeInputShakeModifier(isCodeValid, shakeOffset),
                        horizontalArrangement = Arrangement.spacedBy(dimensions.itemSpacing),
                    ) {
                        repeat(codeGroupInfo.groupCount) { groupIndex ->
                            repeat(codeGroupInfo.groups[groupIndex]) { itemIndex ->
                                val isFieldFocused by interactionSource.collectIsFocusedAsState()
                                val absoluteIndex =
                                    codeGroupInfo.groups.take(groupIndex).sum() + itemIndex
                                val hasPrevious = absoluteIndex in 1..code.length
                                val isPreviousValid =
                                    hasPrevious && isItemValid.invoke(code[absoluteIndex - 1].toString())
                                val canActivate = isPreviousValid || absoluteIndex == 0
                                val isActivated =
                                    absoluteIndex == code.length && isFieldFocused && canActivate

                                CodeItem(
                                    char = getCharOrNull(absoluteIndex, code),
                                    shape = getShape(
                                        itemIndex = itemIndex,
                                        groupIndex = groupIndex,
                                        codeGroupInfo = codeGroupInfo,
                                        startShape = startShape,
                                        endShape = endShape,
                                        middleShape = middleShape,
                                    ),
                                    hidden = hidden,
                                    isActivated = isActivated,
                                    isItemValid = isItemValid,
                                    isCodeValid = isCodeValid,
                                    onStartShake = { inputEnabled = false },
                                    onShakeComplete = {
                                        inputEnabled = true
                                        code = code.dropLast(1)
                                    },
                                    dimensions = dimensions,
                                    colors = colors,
                                    codeStyle = textStyles.valueStyle,
                                    animationSpec = animationSpec,
                                    cursor = cursor,
                                    interactionSource = interactionSource,
                                )
                            }
                            if (groupIndex != codeGroupInfo.groups.lastIndex) {
                                Spacer(Modifier.width(dimensions.groupSpacing))
                            }
                        }
                    }
                }.firstOrNull()?.measure(constraints)

                val captionPlaceable = subcompose("Caption") {
                    if (!caption.isNullOrEmpty()) {
                        val textStyle = remember(textStyles.captionStyle, captionAlignment) {
                            textStyles.captionStyle.copy(
                                textAlign = when (captionAlignment) {
                                    BaseCodeInputCaptionAlignment.Start -> TextAlign.Start
                                    BaseCodeInputCaptionAlignment.Center -> TextAlign.Center
                                },
                            )
                        }
                        StyledText(
                            modifier = Modifier
                                .width(fieldPlaceable.widthOrZero().toDp())
                                .padding(top = dimensions.captionPadding),
                            text = caption,
                            textStyle = textStyle,
                            textColor = colors.captionColor.getValue(
                                interactionSource,
                                captionErrorState,
                            ),
                        )
                    }
                }.firstOrNull()?.measure(constraints.copy(maxWidth = fieldPlaceable.widthOrZero()))

                layout(fieldPlaceable.widthOrZero(), fieldPlaceable.heightOrZero() + captionPlaceable.heightOrZero()) {
                    fieldPlaceable?.place(0, 0)
                    captionPlaceable?.place(0, fieldPlaceable.heightOrZero())
                }
            }
        },
    )
}

internal enum class BaseCodeInputCaptionAlignment {
    Start, Center
}

@Immutable
internal data class BaseCodeInputDimensions(
    val dotSize: Dp,
    val strokeWidth: Dp = 0.dp,
    val height: StatefulValue<Dp>,
    val width: StatefulValue<Dp>,
    val itemSpacing: Dp,
    val groupSpacing: Dp,
    val captionPadding: Dp,
)

@Immutable
internal data class BaseCodeInputColors(
    val valueColor: StatefulValue<Color>,
    val captionColor: StatefulValue<Color>,
    val strokeColor: StatefulValue<Color> = Color.Transparent.asStatefulValue(),
    val dotColor: StatefulValue<Color>,
    val backgroundColor: StatefulValue<Color> = Color.Transparent.asStatefulValue(),
)

@Immutable
internal data class BaseCodeInputTextStyles(
    val valueStyle: TextStyle,
    val captionStyle: TextStyle,
)

@Immutable
internal data class BaseCodeInputCursor(
    val width: Dp = 1.dp,
    val height: Dp = 16.dp,
    val color: Color = Color.Green,
)

internal fun defaultCodeGroups(@IntRange(from = 2) codeLength: Int = 4): CodeGroupInfo {
    return codeGroups {
        if (codeLength < 6 || codeLength % 2 != 0) {
            group(codeLength)
        } else {
            group(codeLength / 2)
            group(codeLength / 2)
        }
    }
}

@Composable
internal fun rememberCodeInputShakeAnimation(
    isActive: Boolean,
    onStart: () -> Unit,
    onFinish: () -> Unit,
    animationSpec: AnimationSpec<Float>?,
): State<Float> {
    val animatable = remember { Animatable(0f) }

    if (isActive) {
        LaunchedEffect(animatable) {
            onStart.invoke()
            if (animationSpec != null) {
                animatable.animateTo(targetValue = 1f, animationSpec = animationSpec)
            } else {
                // fallback delay if no animation spec
                delay(DefaultShakeAnimationDurationMs.toLong())
            }
            onFinish.invoke()
        }
    }

    return animatable.asState()
}

internal fun Modifier.codeInputShakeModifier(isCodeValid: Boolean, shakeOffset: Float): Modifier {
    return run {
        if (isCodeValid) {
            this
        } else {
            this.graphicsLayer { translationX = shakeOffset }
        }
    }
}

@Composable
private fun rememberShapes(
    itemShape: CornerBasedShape?,
    groupShape: CornerBasedShape?,
): Triple<CornerBasedShape?, CornerBasedShape?, CornerBasedShape?> {
    return remember(itemShape, groupShape) {
        val startShape: CornerBasedShape? =
            if (itemShape != null) {
                if (itemShape == groupShape) {
                    itemShape
                } else {
                    RoundedCornerShape(
                        topStart = groupShape?.topStart ?: itemShape.topStart,
                        topEnd = itemShape.topEnd,
                        bottomStart = groupShape?.bottomStart ?: itemShape.bottomStart,
                        bottomEnd = itemShape.bottomEnd,
                    )
                }
            } else {
                null
            }
        val endShape: CornerBasedShape? =
            if (itemShape != null) {
                if (itemShape == groupShape) {
                    itemShape
                } else {
                    RoundedCornerShape(
                        topStart = itemShape.topStart,
                        topEnd = groupShape?.topEnd ?: itemShape.topEnd,
                        bottomStart = itemShape.bottomStart,
                        bottomEnd = groupShape?.bottomEnd ?: itemShape.bottomEnd,
                    )
                }
            } else {
                null
            }
        Triple(startShape, itemShape, endShape)
    }
}

private fun getShape(
    groupIndex: Int,
    itemIndex: Int,
    codeGroupInfo: CodeGroupInfo,
    startShape: CornerBasedShape?,
    endShape: CornerBasedShape?,
    middleShape: CornerBasedShape?,
): CornerBasedShape? {
    val shapeType = when (itemIndex) {
        0 -> CodeItemShapeType.GroupStart
        codeGroupInfo.groups[groupIndex] - 1 -> CodeItemShapeType.GroupEnd
        else -> CodeItemShapeType.GroupMiddle
    }
    return when (shapeType) {
        CodeItemShapeType.GroupStart -> startShape
        CodeItemShapeType.GroupMiddle -> middleShape
        CodeItemShapeType.GroupEnd -> endShape
    }
}

private fun getCharOrNull(absoluteIndex: Int, code: String): String? {
    return if (absoluteIndex < code.length) {
        code[absoluteIndex].toString()
    } else {
        null
    }
}

private enum class CodeItemShapeType {
    GroupStart, GroupMiddle, GroupEnd
}

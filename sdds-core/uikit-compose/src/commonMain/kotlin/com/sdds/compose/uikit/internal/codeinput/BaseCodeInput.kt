package com.sdds.compose.uikit.internal.codeinput

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.focusable
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
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.annotations.IntRange
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.activatable
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.animation.ShakeAnimationDefaults.DefaultShakeAnimationDurationMs
import com.sdds.compose.uikit.internal.animation.rememberShakeAnimationSpec
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.codeinput.CodeInputMotionStyle
import com.sdds.compose.uikit.motion.components.codeinput.rememberCodeInputMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
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
    hasItemFocusSelector: Boolean = LocalFocusSelectorSettings.current.isEnabled(),
    motion: Motion<CodeInputMotionStyle> = rememberCodeInputMotion(),
    animationSpec: AnimationSpec<Float>? = rememberShakeAnimationSpec(),
    codeGroupInfo: CodeGroupInfo = remember { defaultCodeGroups() },

) {
    var code by remember { mutableStateOf("") }
    var inputEnabled by remember { mutableStateOf(true) }
    var isCodeValid by remember { mutableStateOf(true) }
    var isCaptionError by remember { mutableStateOf(false) }
    var isComponentFocused by remember { mutableStateOf(false) }

    SideEffect {
        motion.context.semanticStateSource.set(
            CodeInputStates.Error,
            isCaptionError,
        )
    }
    BasicTextField(
        modifier = modifier.fieldActivatableModifier(
            enabled = enabled,
            hasItemFocusSelector = hasItemFocusSelector,
            interactionSource = motion.context.interactionSource,
        ) { isComponentFocused = it.isFocused },
        value = code,
        singleLine = true,
        enabled = enabled,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        interactionSource = motion.context.interactionSource,
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
                    val itemSpacing by dimensions.itemSpacing.getValueAsState(motion.context)
                    val groupSpacing by dimensions.groupSpacing.getValueAsState(motion.context)
                    Row(
                        modifier = Modifier.codeInputShakeModifier(isCodeValid, shakeOffset),
                        horizontalArrangement = Arrangement.spacedBy(itemSpacing),
                    ) {
                        val codeStyle =
                            textStyles.valueStyle.getTextStyleAsState(motion.context, motion.style.codeStyle)
                        repeat(codeGroupInfo.groupCount) { groupIndex ->
                            repeat(codeGroupInfo.groups[groupIndex]) { itemIndex ->
                                val isFieldFocused by motion.context.interactionSource.collectIsFocusedAsState()
                                val absoluteIndex =
                                    codeGroupInfo.groups.take(groupIndex).sum() + itemIndex
                                val hasPrevious = absoluteIndex in 1..code.length
                                val isPreviousValid =
                                    hasPrevious && isItemValid.invoke(code[absoluteIndex - 1].toString())
                                val canActivate = isPreviousValid || absoluteIndex == 0
                                val isActivated =
                                    absoluteIndex == code.length && isFieldFocused && canActivate
                                val hasFocusSelector = hasItemFocusSelector &&
                                    isComponentFocused &&
                                    absoluteIndex == code.length

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
                                    showFocusSelector = hasFocusSelector,
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
                                    codeStyle = codeStyle,
                                    animationSpec = animationSpec,
                                    cursor = cursor,
                                    interactionSource = motion.context.interactionSource,
                                    motionStyle = motion.style,
                                )
                            }
                            if (groupIndex != codeGroupInfo.groups.lastIndex) {
                                val spacerWidth =
                                    groupSpacing - itemSpacing * 2
                                Spacer(Modifier.width(spacerWidth))
                            }
                        }
                    }
                }.firstOrNull()?.measure(constraints)

                val captionPlaceable = subcompose("Caption") {
                    if (!caption.isNullOrEmpty()) {
                        val captionStyle = rememberCaptionStyle(textStyles, captionAlignment, motion)
                        val padding by dimensions.captionPadding.getValueAsState(motion.context)
                        val captionColor =
                            colors.captionColor.getBrushAsState(motion.context, motion.style.captionColor)
                        Text(
                            modifier = Modifier
                                .focusProperties { canFocus = false }
                                .width(fieldPlaceable.widthOrZero().toDp())
                                .padding(top = padding),
                            text = caption,
                            style = captionStyle,
                            brush = { captionColor.value },
                        )
                    }
                }.firstOrNull()?.measure(constraints.copy(maxWidth = fieldPlaceable.widthOrZero()))

                layout(
                    width = fieldPlaceable.widthOrZero(),
                    height = fieldPlaceable.heightOrZero() + captionPlaceable.heightOrZero(),
                ) {
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
    val dotSize: StatefulValue<Dp>,
    val dotStrokeWidth: StatefulValue<Dp> = 0.dp.asStatefulValue(),
    val fieldStrokeWidth: StatefulValue<Dp> = 0.dp.asStatefulValue(),
    val height: StatefulValue<Dp>,
    val width: StatefulValue<Dp>,
    val itemSpacing: StatefulValue<Dp>,
    val groupSpacing: StatefulValue<Dp>,
    val captionPadding: StatefulValue<Dp>,
)

@Immutable
internal data class BaseCodeInputColors(
    val valueColor: StatefulValue<Brush>,
    val captionColor: StatefulValue<Brush>,
    val dotStrokeColor: StatefulValue<Brush> = Color.Transparent.asStatefulBrush(),
    val fieldStrokeColor: StatefulValue<Brush> = Color.Transparent.asStatefulBrush(),
    val dotColor: StatefulValue<Brush>,
    val backgroundColor: StatefulValue<Brush> = Color.Transparent.asStatefulBrush(),
)

@Immutable
internal data class BaseCodeInputTextStyles(
    val valueStyle: StatefulValue<TextStyle>,
    val captionStyle: StatefulValue<TextStyle>,
)

@Immutable
internal data class BaseCodeInputCursor(
    val width: Dp = 1.dp,
    val height: Dp = 16.dp,
    val color: BrushProducer = BrushProducer { Color.Green.asBrush() },
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

/**
 * Activatable модификатор компонента.
 * Если внещний фокус включен, то компонент должен стать focusable
 * и уметь отправлять ивенты focused и activated.
 */
private fun Modifier.fieldActivatableModifier(
    enabled: Boolean,
    hasItemFocusSelector: Boolean,
    interactionSource: MutableInteractionSource,
    onFocusChanged: (FocusState) -> Unit,
): Modifier {
    return if (hasItemFocusSelector) {
        this
            .activatable(
                enabled = enabled,
                interactionSource = interactionSource,
                onFocusChanged = onFocusChanged,
            )
            .focusable(enabled, interactionSource)
    } else {
        this
            .activatable(
                enabled = enabled,
                interactionSource = interactionSource,
                isActivatedEqualsFocused = true,
                onFocusChanged = onFocusChanged,
            )
            .focusProperties { canFocus = false }
            .focusTarget()
    }
}

@Composable
private fun rememberCaptionStyle(
    textStyles: BaseCodeInputTextStyles,
    captionAlignment: BaseCodeInputCaptionAlignment,
    motion: Motion<CodeInputMotionStyle>,
): TextStyle {
    val captionStyle by textStyles.captionStyle.getTextStyleAsState(motion.context, motion.style.captionStyle)
    return remember(captionStyle, captionAlignment) {
        captionStyle.copy(
            textAlign = when (captionAlignment) {
                BaseCodeInputCaptionAlignment.Start -> TextAlign.Start
                BaseCodeInputCaptionAlignment.Center -> TextAlign.Center
            },
        )
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

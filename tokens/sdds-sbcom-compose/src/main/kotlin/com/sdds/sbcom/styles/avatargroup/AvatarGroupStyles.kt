// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.avatargroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.Size24
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatarGroup : BuilderWrapper<AvatarGroupStyle, AvatarGroupStyleBuilder>

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperAvatarGroupSize24(
    public override val builder: AvatarGroupStyleBuilder,
) : WrapperAvatarGroup

private val AvatarGroupStyleBuilder.invariantProps: AvatarGroupStyleBuilder
    @Composable
    get() = this

public val AvatarGroup.Size24: WrapperAvatarGroupSize24
    @Composable
    @JvmName("WrapperAvatarGroupSize24")
    get() = AvatarGroupStyle.builder(this)
        .invariantProps
        .dimensions {
            itemSpacing(2.0.dp)
            itemOffset(14.0.dp)
        }
        .avatarStyle(Avatar.Size24.style())
        .wrap(::WrapperAvatarGroupSize24)

// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.avatargroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatarGroup : BuilderWrapper<AvatarGroupStyle, AvatarGroupStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAvatarGroupS(
    public override val builder: AvatarGroupStyleBuilder,
) : WrapperAvatarGroup

private val AvatarGroupStyleBuilder.invariantProps: AvatarGroupStyleBuilder
    @Composable
    get() = this

public val AvatarGroup.S: WrapperAvatarGroupS
    @Composable
    @JvmName("WrapperAvatarGroupS")
    get() = AvatarGroupStyle.builder(this)
        .invariantProps
        .dimensions {
            itemSpacing(dimensionResource(R.dimen.sdkit_cmp_avatar_group_itemSpacing_s))
            itemOffset(dimensionResource(R.dimen.sdkit_cmp_avatar_group_itemOffset_s))
        }
        .avatarStyle(Avatar.S.style())
        .wrap(::WrapperAvatarGroupS)

// Copyright 2025, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

package com.sdds.haze

import androidx.compose.ui.node.CompositionLocalConsumerModifierNode

@InternalHazeApi
public expect abstract class PlatformContext

@InternalHazeApi
public expect fun CompositionLocalConsumerModifierNode.requirePlatformContext(): PlatformContext

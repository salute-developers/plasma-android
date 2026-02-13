// Copyright 2025, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

package com.sdds.haze

@InternalHazeApi
public expect inline fun <R> trace(sectionName: String, crossinline block: () -> R): R

@InternalHazeApi
public expect suspend inline fun <R> traceAsync(
    sectionName: String,
    cookie: Int,
    crossinline block: suspend () -> R,
): R

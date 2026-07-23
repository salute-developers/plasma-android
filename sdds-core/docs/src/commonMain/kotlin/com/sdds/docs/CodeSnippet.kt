package com.sdds.docs

import androidx.compose.runtime.Composable

/**
 * Composable код внутри [block] будет извлечен и помещен в документацию
 */
@Composable
inline fun composableCodeSnippet(block: @Composable CodeSnippetScope.() -> Unit) {
    val scope = CodeSnippetScope()
    scope.block()
}

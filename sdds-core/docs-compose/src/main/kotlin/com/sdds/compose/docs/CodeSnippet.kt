package com.sdds.compose.docs

import androidx.compose.runtime.Composable
import com.sdds.docs.CodeSnippetScope

/**
 * Composable код внутри [block] будет извлечен и помещен в документацию
 */
@Composable
inline fun composableCodeSnippet(block: @Composable CodeSnippetScope.() -> Unit) {
    val scope = CodeSnippetScope()
    scope.block()
}

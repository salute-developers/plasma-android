package com.sdds.detekt.rules

import io.gitlab.arturbosch.detekt.api.CodeSmell
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Entity
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Rule
import io.gitlab.arturbosch.detekt.api.Severity
import org.jetbrains.kotlin.com.intellij.psi.PsiComment

/**
 * Запрещено использовать TODO комментариии без указания issue, в рамках которого он будет исправлен и удален
 * @author Малышев Александр on 20.02.2024
 */
internal class TodoPatternRule(config: Config = Config.empty) : Rule(config) {

    override val issue: Issue = Issue(
        id = "TodoPattern",
        severity = Severity.Maintainability,
        debt = Debt(mins = 1),
        description = "TODO комментарии должны быть оформлены в специальном формате"
    )

    override fun visitComment(comment: PsiComment) {
        super.visitComment(comment)

        val text = comment.text
        if (!text.matches(todoCommentPattern)) return

        if (!text.matches(todoPattern)) {
            val codeSmell = CodeSmell(
                issue = issue,
                entity = Entity.from(comment),
                message = MESSAGE,
            )
            report(codeSmell)
            return
        }
    }

    private companion object {
        const val issuePattern = "[A-Z]{2,}-\\d+"
        val todoCommentPattern = Regex("//\\s*todo.*", RegexOption.IGNORE_CASE)
        val todoPattern = Regex("// TODO: $issuePattern.*")
        const val MESSAGE = "Укажите issue, например: " +
            "// TODO: https://github.com/salute-developers/plasma/issues/0"
    }
}

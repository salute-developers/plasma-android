## Context

Манифест собирает Gradle-задача `generatePreviewManifest` из шаблона и списка компонентов генератора фабрик
(`components.txt`). Группа компонента — `StoryEntry.story.component.group` (`ComponentGroup(displayName, ordinal)`);
реестр заполняет `registerStories()`, а JVM-цель модуля плагина уже используется в `jvmTest` (`StyleFactoryCoverageTest`).

## Decisions

1. **Группы строятся на JVM при сборке.** В `jvmMain` модуля плагина лежит `main`, который вызывает `registerStories()`,
   группирует `StoryEntry` по `componentId` и пишет JSON `{ "groups": [{ "name", "components": [...] }] }`: группы по
   `ordinal`, компоненты по алфавиту. Gradle-задача `generatePreviewGroups` (`JavaExec` на classpath JVM-компиляции
   модуля) запускает её, `generatePreviewManifest` зависит от неё и кладёт массив в `groups`.
2. **Порядок и имена как в песочнице.** Имя группы — `displayName` (например, «Data Display», «AI Kit»), порядок — `ordinal`.
3. **Согласованность.** Задача манифеста сверяет, что каждый компонент `components` входит ровно в одну группу, а в группах нет
   компонентов вне `components`; иначе сборка падает с перечнем расхождений.
4. **Тест.** `jvmTest` проверяет те же правила на реальном реестре и фиксирует группу `CircularProgressBar`.
5. **Совместимость.** Поле необязательное: клиент без поддержки его игнорирует, плагин без поля клиент обрабатывает запасной таблицей.

## Risks / Trade-offs

- Сборка манифеста выполняет JVM-код модуля: время сборки растёт на запуск главной функции.
- Компонент, у которого нет истории, в группы не попадёт, и сборка упадёт на сверке; такие компоненты уже отлавливает
  `StyleFactoryCoverageTest`.

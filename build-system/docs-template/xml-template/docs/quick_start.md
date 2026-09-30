---
id: quick_start
title: Быстрый старт
sidebar_position: 1
slug: /
---

1. Добавить в build.gradle файл следующие зависимости
```kotlin
implementation("io.github.salute-developers:{{ docs-artifactId }}:{{ docs-artifactVersion }}")
implementation("io.github.salute-developers:sdds-uikit:{{ docs-uikitVersion }}")
```
Дополнительно, если Вам нужен набор иконок:
```kotlin
implementation("io.github.salute-developers:sdds-icons:{{ docs-iconsVersion }}")
```
2. Унаследовать тему вашего приложения от `{{ docs-theme-codeReference }}`, например:
```xml
 <style name="YourAppTheme" parent="{{ docs-theme-codeReference }}"> ... </style>
```
3. Готово

## Что прочитать дальше

### CLI

Если нужен постоянный локальный контекст проекта или загрузка темы и конфигурации компонентов из терминала, прочитайте [CLI](cli.md) — инструкцию по установке и использованию `dsbuilder`.

### MCP

Если хотите подключить к дизайн-системе AI-агента в IDE (Cursor, Claude Code и другие MCP-клиенты), прочитайте [MCP](mcp.md). Агент получит доступ к документации, токенам и компонентам через CLI `dsbuilder`.
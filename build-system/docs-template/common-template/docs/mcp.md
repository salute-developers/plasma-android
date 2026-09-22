---
id: mcp
title: MCP
sidebar_position: 3
---

## Зачем

MCP (Model Context Protocol) даёт вашему AI-агенту в IDE (Cursor, Claude Code, Windsurf и другим MCP-совместимым клиентам) прямой доступ к дизайн-системе: агент может искать документацию, читать токены и конфигурации компонентов, не полагаясь на то, что вы вручную скопируете нужный фрагмент в чат.

Инструменты доступны только для чтения — агент не может опубликовать или изменить что-либо в дизайн-системе через MCP.

## Быстрый старт

1. Установите и настройте CLI `dsbuilder` — установка, `dsbuilder init` и авторизация описаны на странице [CLI](cli.md).

2. Запустите MCP-сервер:

```bash
dsbuilder mcp serve
```

CLI уже знает `project-id` и `design-system-id` из локального `.sdds/config.json` — в запросе к агенту их указывать не нужно.

3. Добавьте сервер в конфигурацию вашего MCP-клиента. Например, для Claude Code (`.mcp.json`) или Cursor (`mcp.json`):

```json
{
  "mcpServers": {
    "dsbuilder": {
      "command": "dsbuilder",
      "args": ["mcp", "serve"]
    }
  }
}
```

После перезапуска клиента агент увидит инструменты дизайн-системы в списке доступных MCP tools.

## Доступные инструменты

Первая версия MCP-сервера предоставляет только read-only инструменты:

- **Контекст**: `design_system_get_context`, `project_get_status`
- **Документация**: `documentation_search`, `documentation_fetch`, `documentation_get_navigation`, `documentation_get_page`
- **Ссылки на код**: `code_binding_search`, `code_binding_get`
- **Токены**: `tokens_list`, `token_get`, `token_values_get`
- **Компоненты**: `components_list`, `component_get`, `component_config_get`, `component_styles_get`, `component_variations_get`

Ни один из этих инструментов не публикует и не изменяет дизайн-систему.

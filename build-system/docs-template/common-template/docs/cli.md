---
id: cli
title: Использование DS Builder CLI
sidebar_position: 2
---

## Зачем

`dsbuilder` — CLI design-system-builder для локальной работы с проектом дизайн-системы. Он хранит `project-id` и `design-system-id` в локальном `.sdds/config.json` — не нужно передавать их в каждом вызове, в том числе при запуске MCP-сервера.

Эта страница описывает только consumer-сценарий: установку, привязку локального проекта, проверку доступа и загрузку актуальных темы и конфигурации компонентов. Команды, которые публикуют изменения обратно в дизайн-систему (`components push`, `docs publish`), сюда не входят — это отдельный сценарий для мейнтейнеров дизайн-системы.

## Установка

CLI распространяется как release-архив на GitHub Releases `design-system-builder` (на данный момент — только macOS).

```bash
unzip dsbuilder-cli-macos-arm64.zip
cd dsbuilder-cli-macos-arm64
./install.sh
```

По умолчанию скрипт устанавливает бинарник в `~/.dsbuilder/cli/macos/dsbuilder` и создаёт symlink `~/.local/bin/dsbuilder`. Если `~/.local/bin` не входит в `PATH`, добавьте его:

```bash
echo 'export PATH="$HOME/.local/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

Проверка установки:

```bash
dsbuilder --version
```

## Инициализация проекта

Команда `init` создаёт локальный конфиг `.sdds/config.json` в текущей директории. Запускайте её из корня проекта, в котором будет использоваться дизайн-система, указав платформу — тогда её не нужно будет передавать при каждом вызове:

```bash
dsbuilder init --project-id <project-id> --design-system-id <design-system-id> --platform compose
```

Для проектов на View-компонентах используйте `android-view`:

```bash
dsbuilder init --project-id <project-id> --design-system-id <design-system-id> --platform android-view
```

`<project-id>` и `<design-system-id>` — идентификаторы вашего проекта в DS Builder.

## Авторизация

По умолчанию CLI ожидает API key в переменной окружения `DSBUILDER_API_KEY`:

```bash
export DSBUILDER_API_KEY="dev-token"
```

Имя переменной можно сохранить в конфиге проекта через `--api-key-env` при `init`:

```bash
dsbuilder init \
  --project-id <project-id> \
  --design-system-id <design-system-id> \
  --api-key-env DSB_DEV_API_KEY
```

Если project API key недоступен, можно использовать пользовательскую сессию:

```bash
dsbuilder auth login --username <username>
```

## Проверка доступа

```bash
dsbuilder status
```

Команда проверяет доступ к настроенному проекту и дизайн-системе с текущими учётными данными.

## Загрузка темы

Команда `theme fetch` загружает актуальную тему из DS Builder API и записывает её в локальные `.sdds`-файлы согласно конфигу проекта:

```bash
dsbuilder theme fetch
```

## Загрузка конфигов компонентов

Команда `components fetch` выгружает конфигурацию компонентов дизайн-системы в локальную директорию `.sdds/components`:

```bash
dsbuilder components fetch
```

## Генерация кода

Команды `theme generate` и `components generate` превращают загруженные `theme fetch`/`components fetch` данные в код темы и компонентов — CLI делегирует эту работу платформенному инструменту (для Android — тому же Gradle-плагину, что уже используется в этом репозитории):

```bash
dsbuilder theme generate
dsbuilder components generate
```

Платформа берётся из `.sdds/config.json` (см. `dsbuilder init`); если она не объявлена или проект ведёт несколько платформ, укажите её явно:

```bash
dsbuilder theme generate --platform compose
```

## MCP-сервер

CLI умеет поднимать MCP-сервер с постоянным локальным контекстом проекта — не нужно передавать `project-id`/`design-system-id` в каждом запросе. Команду `dsbuilder mcp serve` обычно не запускают вручную — её вызывает сам MCP-клиент по своей конфигурации.

За конфигурацией MCP-клиента и списком доступных инструментов — см. [MCP](mcp.md).

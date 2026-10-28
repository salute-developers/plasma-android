## Why

Клиент DS Builder раскладывает Compose-компоненты по группам меню по собственной таблице, и у 10 компонентов из 79 группа
расходится с песочницей (например, `CircularProgressBar` в песочнице в «Data Display»). Группа задана в песочнице
(`ComponentKey.group`, `sandbox-core`) и известна реестру историй плагина, но манифест `preview-plugin.json` содержит только
список имён компонентов, поэтому клиент получить её не может.

## What Changes

- Сборка плагина формирует в манифесте необязательное поле `groups`: список групп (`name`, `components`) по реестру историй,
  в порядке групп песочницы.
- Каждый компонент манифеста входит ровно в одну группу; иначе сборка падает.
- Остальные поля манифеста и версия схемы (`schemaVersion: 1`) не меняются.

## Capabilities

### New Capabilities

- `compose-preview-component-groups`: группы компонентов песочницы в манифесте плагина.

### Modified Capabilities

Нет.

## Impact

- `integration-core/preview-compose-plugin`: JVM-главная функция групп, Gradle-задача, генерация манифеста, тест.
- Парный change `use-plugin-component-groups` в `design-system-builder` (клиент).

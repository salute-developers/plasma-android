## 1. Плагин

- [x] 1.1 `jvmMain`: главная функция, формирующая группы по реестру историй.
- [x] 1.2 Gradle: задача `generatePreviewGroups`, `generatePreviewManifest` добавляет `groups` и сверяет состав.
- [x] 1.3 Тест: каждый компонент манифеста в ровно одной группе, `CircularProgressBar` в «Data Display».

## 2. Проверка

- [x] 2.1 `preview-plugin.json` артефакта содержит `groups`; полная галерея, `spotlessCheck`, `detekt`.

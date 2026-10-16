## ADDED Requirements

### Requirement: Генерация фабрик является задачей DS Builder plugin

Генерация фабрик стилей Compose preview SHALL выполняться Gradle-задачей `generateComposePreview` плагина `plugin_theme_builder`
(`DsBuilderPlugin`, блок `preview { }`). Задача MUST читать `uikit-compose-api-meta.json` из classpath, как `UikitComposeApiMetaTask`,
писать исходники в каталог `outputLocation` и MUST поддерживать ограничение набора компонентов. Отдельный модуль `preview-generator`
MUST NOT существовать.

#### Scenario: Задача строит фабрики по мете

- **WHEN** запускается `generateComposePreview` на мете `uikit-compose`
- **THEN** вывод MUST совпадать с выводом прежнего `preview-generator` на той же мете.

#### Scenario: Ограничение набора компонентов

- **WHEN** задано `-PpreviewComponents=BasicButton,CheckBox`
- **THEN** фабрики MUST порождаться только для этих компонентов.

#### Scenario: Задача не пересобирается без изменений

- **WHEN** мета и параметры не менялись
- **THEN** задача MUST считаться актуальной (`UP-TO-DATE`).

## MODIFIED Requirements

### Requirement: Генератор соответствует Theme Builder

Генератор фабрик SHALL использовать те же функции выбора перегрузки билдера, что и Theme Builder (`overloadPriority`,
`colorOverloadPriority`, признаки `Brush`, `InteractiveColor`, `Color`), из одного внутреннего исходного файла плагина. Копии этих правил
MUST NOT существовать. Вывод генератора MUST проверяться тестом плагина на эталонных компонентах (golden-файлы) и тестом покрытия меты.

#### Scenario: Единый источник правил

- **WHEN** правило приоритета перегрузок меняется
- **THEN** изменение MUST затрагивать один файл и применяться и к Theme Builder, и к генератору превью.

#### Scenario: Изменение вывода

- **WHEN** генератор порождает для эталонного компонента код, отличный от golden-файла
- **THEN** тест плагина MUST упасть с именем компонента и различием.

### Requirement: Мета подключается как зависимость сборки

Api-мета SHALL подключаться к задаче `generateComposePreview` как ресурс артефакта `uikit-compose` через Gradle-зависимость. Копия
файла в репозитории MUST NOT создаваться.

#### Scenario: Версия меты совпадает с версией UIKit

- **WHEN** обновляется версия `uikit-compose`
- **THEN** при следующей сборке плагина превью фабрики MUST порождаться по мете новой версии без ручного копирования.

#### Scenario: Мета недоступна

- **WHEN** ресурс меты не найден или не парсится
- **THEN** сборка MUST завершаться ошибкой с путём ресурса.

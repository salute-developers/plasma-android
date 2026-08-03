## ADDED Requirements

### Requirement: Style API exposes ImageSource icon properties
Style-интерфейсы в `sdds-core/uikit-compose`, которые имеют публичные style-свойства иконок типа `@DrawableRes Int?`, SHALL предоставлять новое публичное свойство для той же иконки типа `ImageSource?`.

#### Scenario: Новый источник иконки доступен из style
- **WHEN** style-интерфейс содержит drawable-свойство для иконки, например `closeIcon`, `disclosureIcon`, `backIcon` или `overflowNextIcon`
- **THEN** этот style-интерфейс предоставляет соответствующее свойство `ImageSource?` для использования компонентом при рендеринге

#### Scenario: Внешняя реализация старого style не ломается
- **WHEN** внешняя реализация style-интерфейса реализует только существующие drawable-свойства
- **THEN** новый `ImageSource?` contract MUST иметь default-поведение, позволяющее такой реализации компилироваться без немедленного добавления нового свойства

### Requirement: Drawable resource style API remains compatible
Существующие style-свойства и builder-методы с `@DrawableRes Int` SHALL оставаться доступными и рабочими, но SHALL быть помечены `@Deprecated` с миграцией на `ImageSource` API.

#### Scenario: Старый builder-вызов с drawable resource продолжает работать
- **WHEN** клиентский или сгенерированный код вызывает существующий builder-метод с `R.drawable.*`
- **THEN** код компилируется, deprecated builder-метод не записывает drawable id в default style state, а новый `ImageSource` API остается основным путем для рендеринга style-иконок

#### Scenario: Старое drawable-свойство остается доступным
- **WHEN** клиентский код читает существующее style-свойство иконки типа `Int?`
- **THEN** свойство остается доступным, помечено deprecated и по умолчанию возвращает `null`

### Requirement: Style builders accept ImageSource icons
Каждый style builder в `sdds-core/uikit-compose`, который настраивает иконку через `@DrawableRes Int`, SHALL предоставлять новый метод настройки той же иконки через `ImageSource`.

#### Scenario: Новый builder-вызов задает ImageSource
- **WHEN** клиент вызывает builder-метод иконки с `ImageSource`
- **THEN** созданный style возвращает этот источник через соответствующее `ImageSource?` свойство

#### Scenario: Drawable overload не адаптирует ресурс в common style
- **WHEN** клиент вызывает deprecated builder-метод иконки с drawable resource id
- **THEN** common style-код не использует `resourceImageSource` или `painterResource`, не записывает drawable id в style state и не сбрасывает уже заданный `ImageSource`

### Requirement: Components render style icons from ImageSource
Компоненты `uikit-compose` SHALL использовать новые `ImageSource` style-свойства для рендеринга иконок, а не обращаться напрямую к drawable resource style-свойствам.

#### Scenario: Style содержит произвольный ImageSource
- **WHEN** style предоставляет иконку через `ImageSource`, который не является drawable resource
- **THEN** компонент рендерит эту иконку через `Icon(source = ...)` без требования drawable resource id

#### Scenario: Generated drawable style renders through ImageSource
- **WHEN** style сгенерирован Theme Builder из drawable icon token
- **THEN** компонент рендерит иконку через `ImageSource`, переданный сгенерированным Android style-кодом

### Requirement: Generated drawable styles remain source-compatible
Существующий generated Compose style code в `tokens` и `integration-core`, который передает `R.drawable.*` в style builder API, SHALL оставаться source-compatible.

#### Scenario: Existing generated style uses drawable builder
- **WHEN** generated style вызывает deprecated drawable builder-метод
- **THEN** сборка generated style проходит без обязательной миграции исходника на `ImageSource`

#### Scenario: Theme Builder emits ImageSource style icons
- **WHEN** Theme Builder обновлен для генерации нового icon API
- **THEN** он генерирует вызовы builder-методов с `ImageSource`, сохраняя корректные импорты и ссылку на тот же drawable resource

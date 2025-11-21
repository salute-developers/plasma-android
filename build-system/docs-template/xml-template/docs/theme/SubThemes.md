---
title: Подтемы. Инверсия цветов.
---

Подтемы в **View‑системе** позволяют локально переопределять цветовые токены, когда виджет рисуется на фоне с другой «яркостью» или контрастом, чем основной экран.  
Это аналог механизма подтем в Compose, но реализованный через XML‑стили и тему контекста.

В SDDS для XML/View есть четыре подтемы:

- `@style/{{ docs-theme-prefix }}.OnLight`  
- `@style/{{ docs-theme-prefix }}.OnDark`  
- `@style/{{ docs-theme-prefix }}.Inverse`  
- `@style/{{ docs-theme-prefix }}.Default` — базовая тема (обычно совпадает с темой экрана)

Ниже описано, как они работают, чем отличаются и как их применять.

## Общие принципы использования в View

### 1. На уровне Activity/Fragment всегда используйте **базовую тему**

### 2. Подтемы применяются **точечно**, через `ContextThemeWrapper` или `android:theme`

Используйте их вокруг конкретного блока, который визуально живёт на другом фоне:

- светлая карточка внутри тёмного экрана,
- тёмный баннер на светлом фоне,
- акцентный/промо‑блок, где всё должно подстроиться под брендовые цвета.

Компоненты внутри подтемы автоматически используют корректные `text*`, `surface*`, `outline*`, градиенты и состояния (hover/pressed).

---

## `@style/{{ docs-theme-prefix }}.OnLight`

Подтема для блоков, расположенных **на светлом фоне** — белом или близком к нему.

### Пример: белая секция в тёмной теме

```xml
<FrameLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#000"
    android:theme="@style/{{ docs-theme-prefix }}.OnLight">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/{{ docs-theme-prefix }}.Components.BasicButton.M.Default" />
</FrameLayout>
```

---

## `@style/{{ docs-theme-prefix }}.OnDark`

Подтема для блоков на **тёмном фоне** — почти чёрном, тёмно‑сером, затемнённом фото и т.п.

### Пример: тёмная секция в светлой теме

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#000"
    android:theme="@style/{{ docs-theme-prefix }}.OnDark">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/{{ docs-theme-prefix }}.Components.BasicButton.M.Default" />
</LinearLayout>
```

---

## `@style/{{ docs-theme-prefix }}.Inverse`

Подтема **инверсии цветов**.  
Она меняет местами семантику `Default` и `Inverse` токенов.

### Пример: инверсная секция

```xml
<FrameLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="..."
    android:theme="@style/{{ docs-theme-prefix }}.Inverse">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/{{ docs-theme-prefix }}.Components.BasicButton.M.Default" />
</FrameLayout>
```

---

## `@style/{{ docs-theme-prefix }}.Default`

Базовая подтема — соответствует основной теме приложения.

---

## Когда какую подтему выбирать

Ориентируйтесь на **реальный фон**, на котором будет рисоваться контент:

| Ситуация блока                      | Подтема |
|------------------------------------|---------|
| Явно светлый фон                  | `OnLight` |
| Явно тёмный фон                   | `OnDark` |
| Блок должен выглядеть как «обратный» | `Inverse` |
| Обычное состояние экрана          | `Default` |

---

## Практические рекомендации

- Подтемы можно вкладывать, но избегайте длинных цепочек — достаточно 1–2 уровней.
- Применяйте подтему к **контейнеру**, а не к каждому элементу.
- Используйте стандартные SDDS‑компоненты — они автоматически работают с токенами темы.

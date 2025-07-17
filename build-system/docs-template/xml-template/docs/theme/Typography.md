---
title: Токены типографики
---

Токены типографики делятся на группы: `Display`, `Body`, `Header`, `Text`.
И на подгруппы: `Large Screens`, `Medium Screens`, `Small Screens`.

## Структура названия токена начертания
```
Группа + Подгруппа + Уникальное название токена
```

Токену с названием `Body/BodyL B` будет соответствовать в коде стили `@style/{{ docs-theme-prefix }}.Typography.BodyLBold`, `@style/{{ docs-theme-prefix }}.TextAppearance.BodyLBold` и атрибут `{{ docs-theme-resPrefix }}_typographyBodyLBold`.

>Важно отметить, что выбор подгруппы `Large Screens`, `Medium Screens`, `Small Screens` разруливается автоматически при помощи переопределенных ресурсов.
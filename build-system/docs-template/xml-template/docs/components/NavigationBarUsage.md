---
title: NavigationBar
---

Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.
В качестве текста, контента и action может принимать произвольный контент.

```xml
<!-- @sample: com/sdds/uikit/fixtures/NavigationBar_Simple.xml -->
```

## Стиль NavigationBar

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для настройки стиля NavigationBar в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_iconButtonStyleOverlay|оверлэй стиль компонента IconButton|reference|
|sd_shadowAppearance|стиль тени|reference|
|sd_shapeAppearance|форма компонента|reference|
|sd_contentPaddingStart|отступ в начале блока, содержащего actions|dimension|
|sd_contentPaddingEnd|отступ в конце блока, содержащего actions|dimension|
|sd_contentPaddingTop|верхний отступ блока, содержащего actions|dimension|
|sd_contentPaddingBottom|нижний отступ блока, содержащего actions|dimension|
|sd_descriptionMargin|отступ между Title и Description|dimension, reference|
|sd_backIcon|ссылка на ресурс иконки "назад"|reference|
|sd_backIconMargin|отступ от иконки "назад" и ActionStart|dimension|
|sd_textBlockTopMargin|верхний отступ от текстового блока если он находится ниже actions|dimension|
|sd_horizontalSpacing|отступ от actions и между контентом в блоке с actions|dimension|
|sd_actionStartColor|цвет action в начале|reference, color|
|sd_actionEndColor|цвет action в конце|reference, color|
|sd_titleAppearance|стиль текста Title|reference|
|sd_titleColor|цвет текста Title|color|
|sd_backIconTint|окрас иконки "назад"|reference|
|sd_descriptionAppearance|стиль текста Description|reference|
|sd_descriptionColor|цвет текста Description|color|
|sd_background|цвет фона|reference, color|
|sd_navbarContentPlacement|расположение компонента с ролью Content|enum(INLINE, bottom)|
|sd_navbarTextPlacement|расположение компонентов с ролью Title и Description|enum(INLINE, bottom)|
|sd_navbarTextAlignment|выравнивание компонентов с ролью Title и Description|enum(start, center, end)|
|sd_contentAlignmentBetweenActions|выравнивание контента, находящегося между ActionStart и ActionEnd по горизонтали|enum(start, center, end)|
|sd_centerAlignmentStrategy|центрирование контента, находящегося в одном блоке с ActionStart и ActionEnd по горизонтали|enum(absolute, relative)|

### Для расположения дочерних view

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|layout_navigationBarContent|роли компонентов, размещаемых внутри NavigationBar|enum(title, description, action_start,action_end, content)|

##  Роли компонентов внутри NavigationBar

Роли компонентов через xml задаются с помощью атрибута layout_navigationBarContent. В коде реализованы удобные сеттеры 
для каждой роли, например  `setContent(content: View, params: NavigationBarLayoutParams? = null)`. При использовании  
таких сеттеров, задавать параметры не обязательно, они сгенерируются автоматически. Однако, при добавлении view через  
стандартную функцию addView(), при отсутствии NavigationBarLayoutParams и роли компонента в этих параметрах, будет  
установлена роль Content (как по умолчанию).

## Структура компонента NavigationBar

NavigationBar наследник LinearLayout, ориентация - вертикальная. Верхнеуровнево компонент разделен на две части.  
1 - Верхняя часть включает в себя блок, где по бокам расположены actions (ActionStart и ActionEnd), а между ними -  
место для размещения контента при `textPlacement = TEXT_PLACEMENT_INLINE` и/или `contentPlacement = CONTENT_PLACEMENT_INLINE`.  
Ниже блока с actions, при `textPlacement = TEXT_PLACEMENT_BOTTOM` располагается текстовый блок, содержащий Title   
и Description. Вся верхняя часть ограничена заданными padding, с помощью атрибутов   
(sd_contentPaddingStart sd_contentPaddingTop и т.д.) или через функцию ????????.
2 - Нижняя часть компонента, не ограничена padding. В ней размещается Content при   
`contentPlacement = CONTENT_PLACEMENT_BOTTOM`.

## Расположение компонентов с ролями Title и Description внутри NavigationBar

За расположение Title и Description отвечает атрибут sd_navbarTextPlacement или свойство textPlacement.  
Как упоминалось выше, при `textPlacement = TEXT_PLACEMENT_BOTTOM`, текстовый блок, содержащий Title и Description,  
будет размещен в верхней части NavigationBar, ниже блока с actions. При установке `textPlacement = TEXT_PLACEMENT_INLINE`  
текстовый блок будет размещен между ActionStart и ActionEnd.

## Расположение компонента с ролью Content внутри NavigationBar

За расположение Content отвечает атрибут sd_navbarContentPlacement или свойство contentPlacement. Как упоминалось выше,  
при `contentPlacement = CONTENT_PLACEMENT_BOTTOM`, компонент с ролью Content будет размещен в нижней части  
NavigationBar (как обычный элемент вертикального LinearLayout). При установке `contentPlacement = CONTENT_PLACEMENT_INLINE`  
Content будет размещаться в верхней части NavigationBar между ActionStart и ActionEnd. Если Title и Description 
так же находятся в блоке с actions, Content всегда будет размещаться после них (по горизонтали).

## Выравнивание компонента с ролью Content внутри NavigationBar

Так как NavigationBar наследник LinearLayout, выравнивание Content при `contentPlacement = CONTENT_PLACEMENT_BOTTOM`  
осуществляется с помощью установки Gravity самого NavigationBar. Выравнивание при  
`contentPlacement = CONTENT_PLACEMENT_INLINE` описано ниже.

## Выравнивание компонентов с ролями Title и Description внутри NavigationBar

Как упоминалось выше, NavigationBar разделен на две части, поскольку текстовый блок, содержащий Title и Description  
находится в верхней части, он не "подчиняется" Gravity самого компонента. Если 
`textPlacement = TEXT_PLACEMENT_BOTTOM` или атрибут `sd_navbarTextPlacement = bottom` используйте атрибут  
sd_navbarTextAlignment или свойство textBlockAlignment. Стоит отметить, что при выравнивании  
всего текстового блока, так же выравнивается контент внутри него, например, при установке  
`textBlockAlignment = TEXT_ALIGNMENT_START` текстовый блок будет выровнен по краю в начале NavigationBar, а  
Title и Description будут выровнены по краю в начале самого текстового блока. Аналогично для случаев с  
TEXT_ALIGNMENT_CENTER и TEXT_ALIGNMENT_END.

## Выравнивание контента, находящегося между ActionStart и ActionEnd

За выравнивание в этом блоке отвечает атрибут sd_contentAlignmentBetweenActions или свойство  
contentAlignmentBetweenActions. 

## Стратегия выравнивания контента, находящегося между ActionStart и ActionEnd

С помощью атрибута sd_centerAlignmentStrategy или свойства centerAlignmentStrategy определяется как именно 
будет выровнен контент в этом блоке. При `centerAlignmentStrategy = ALIGNMENT_STRATEGY_ABSOLUTE` и 
`contentAlignmentBetweenActions = CONTENT_ALIGNMENT_BETWEEN_ACTIONS_CENTER` возможно добиться центрирования  
контента относительно центра самого компонента NavigationBar, даже, при отсутствии контента в одном из actions.
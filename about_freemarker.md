---
title: Freemarker知识小总结
tags: Freemarker
notebook: Freemarker
---

# Freemarker知识小总结
## Freemarker数学舍入处理
```
1.ceiling 向上取整
  (13/6)?ceiling = 3
2.floor 向下取整
  (13/6)?floor = 2
3.round 四舍五入
  (13/6)?floor = 2
```
## Freemarker循环处理
```
<#assign max=(13/6)?ceiling >
<#list 1..max as i>
  ${i}
</#list>
output:1 2 3
```
```
<#assign user=[['name':'Tom'],['name':'Amy'],['name':'SuSan']] >
<#list item as user>
  ${item.name}
</#list>
output:Tom Amy SuSan
```
```
<#assign user=[['name':'Tom'],['name':'Amy'],['name':'SuSan']] >
<#assign userSize=user?size-1>
<#list 1...userSize as i>
  ${user[i].name}
</#list>
output:Tom Amy SuSan
```
# java学生管理系统
> 这是继前文 [《java数组-学生成绩管理系统。（简）》][1] 的一个复杂版。此次总共分为8个功能。由三个java文件构成。代码中包含详细注释，在此不再赘述。

- student1 为主程序
- student2 为定义成员
- student3 为功能代码

## 体会

> 通过此次编写体会到了程序之间严格的紧密性。可以将想实现的一个功能分成3个或多个框架。将主功能、定义成员、构造函数各分为了三个文件。编程时思路不易混乱。

## 实验问题及解决方法

> 问题：编写删除功能时，输入任意数字后，删除只会删除第一个。 
>解决：i参数传递错误，后单独定义，并添加if判断。


> 问题：添加完学生信息后，没输出学生信息。 
>解决：后自定义功能8是否需要输出所有学生的信息。

## 功能介绍

**功能如下：**

 - 添加学生信息
 - 查找学生信息
 - 修改学生信息
 - 删除学生信息
 - 输入学生成绩
 - 根据某门成绩进行排序
 - 根据总分进行排序
 - 输出所有学生

## End

本小项目发文至自己博客 [java学生管理系统（复杂版）][2]

博客地址：[bingyishow.top][3]


  [1]: https://bingyishow.top/Resources-and-technology/45.html
  [2]: https://bingyishow.top/Resources-and-technology/56.html
  [3]: https://bingyishow.top

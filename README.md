#### 最新版本

模块|Dependencies
---|---
最新版本|[![Download](https://jitpack.io/v/like5188/Dependencies.svg)](https://jitpack.io/#like5188/Dependencies)

## 功能介绍
1、常用库依赖。

## 使用方法：

1、在代码中使用引用

在Project的gradle中加入：
```groovy
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
```
在Module的gradle中加入：
```groovy
    dependencies {
        implementation 'com.github.like5188:Dependencies:版本号'
    }
```

2、在gradle文件中使用引用
  
  在Project的gradle中加入：
  ```groovy
      buildscript {
          repositories {
              maven { url 'https://jitpack.io' }
          }
          dependencies {
              classpath "com.github.like5188:Dependencies:版本号"
          }
      }
  ```

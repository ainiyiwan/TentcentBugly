# TentcentBugly
>请自动忽略'Tentcent'的手误,注册应用的时候写错的，不想改了。

[个人感觉热补丁不是请客吃饭，如果不了解它，直接使用它可能会造成更大的问题，所以在一些接入上面，的确人为的增加了难度。](https://github.com/WeMobileDev/article/blob/master/Tinker%EF%BC%9A%E6%8A%80%E6%9C%AF%E7%9A%84%E5%88%9D%E5%BF%83%E4%B8%8E%E5%9D%9A%E6%8C%81.md)
这是Tinker作者的一番话，意味深长，Tinker的接入对于很多开发者都是很有难度的，好消息是腾讯Bugly帮助我们降低了接入的门槛，那么我为什么还要写这篇文章呢，因为即便如此，还是有很多人不会接入热修复，所以我想写一篇关于热修复最简单的接入，以期所有人都能轻松接入热修复，享受技术带来的快乐！
## 一 基本接入
关于Bugly的接入我想没有什么比官方文档更权威了，所以这一不在赘述。

[Bugly Android热更新使用指南](https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix/?v=20180119105842)

[Bugly Android热更新详解](https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix-demo/?v=20170912151050)

[TinkerSupport插件使用指南](https://bugly.qq.com/docs/utility-tools/plugin-gradle-hotfix/?v=20170912151050)

有人说有了官方文档还要你有何用，是的官方文档很详细，但是很多人还是接入不成功，所以这就是我写这篇文章的目的。

## 二 帮你接入
这篇文章目的是所有人都会Tinker，所以请按照我的步骤。
### 2.1复制粘贴
复制粘贴会吧。

**<font color=red>复制根目录下的build.gradle,app module下的build.gradle,tinker-support.gradle以及MyApplication到你的项目中</font>**
## 三 实战步骤
### 第一步 双击assembleRelease,生成baseApk
![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/assemble_release.png)
![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/bakApk.jpg)

**切记，一定要将bakApk中生成的文件保存，以备后用，最好上传到公司的服务器**
### 第二步 安装bakApk中app-release.apk到你的手机中，启动apk，上报联网数据
<img src="https://github.com/ainiyiwan/TentcentBugly/blob/master/png/before.png" width = "300"/>

### 第三步 修改界面或者bug
本项目中，我在上面展示的那个界面下面加一个图片
### 第四步 生成patch（最重要）
### 4.1修改think-support.gradle
![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/copy_name.jpg)

### 复制上图中画红线的名称到下图中划红线的地方

![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/paste_name.jpg)

### 4.2双击buildTinkerPatchRelease,生成patch
![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/buildTinkerPatchRelease.jpg)
![](https://github.com/ainiyiwan/TentcentBugly/blob/master/png/patch.jpg)

# RainMusic
[![GitHub issues](https://img.shields.io/github/issues/re-ovo/RainMusic)](https://github.com/re-ovo/RainMusic/issues)
[![GitHub forks](https://img.shields.io/github/forks/re-ovo/RainMusic)](https://github.com/re-ovo/RainMusic/network)
[![GitHub stars](https://img.shields.io/github/stars/re-ovo/RainMusic)](https://github.com/re-ovo/RainMusic/stargazers)
[![GitHub license](https://img.shields.io/github/license/re-ovo/RainMusic)](https://github.com/re-ovo/RainMusic/blob/master/LICENSE)

RainMusic是一个使用 [Jetpack Compose](https://developer.android.com/jetpack/compose) 构建的网易云第三方app, 采用Material You设计，专注听歌功能，没有社交功能，还你一个纯净的音乐APP。   
APP完全采用Compose构建UI，采用Kotlin Flow驱动数据, 使用MVVM架构，使用Media3完成播放器服务, 目的是为了实践安卓最前沿的开发技术栈。当然APP中存在许多可改进的地方，欢迎提交PR帮助改进代码和架构！

## 📦️ 下载安装包
* 开发中，暂时不提供下载，感兴趣的可以自行编译试用

## 👀 注意事项
1. 本APP完全免费，请勿用于商业用途或非法用途，仅供个人学习使用
2. 请勿提交任何"破解VIP", "破解灰色歌单" 之类的功能请求或者PR, 此类请求会被直接close
3. 本APP不会实现`黑胶充值功能，注册功能，修改个人资料功能`，请自行使用官方APP完成这类操作

## 🎯 特性
* 推荐
* 搜索
* 歌单
* 私人FM
* 每日推荐
* 自动签到

## 🖼️ 截图展示
| 主页 | 播放器 | 歌词 |
| ----- | ------| ------|
| <img src="art/index.png" align="left" height="400">| <img src="art/player.png" align="left" height="400">| <img src="art/lyric.png" align="left" height="400"> |

## 📭 常见问题
1. **有没有iOS版?**   
   答: 当然没有，用iOS就和小众app说再见吧
2. **使用这个app有账号安全隐患吗?**   
   答: 本app之和网易官方API通信，欢迎检查代码，同时请在这里下载app，请不要下载来路不明的版本
3. **能否添加评论功能?**   
   答: 不会添加

## 🎲 技术栈
* 纯Jetpack Compose构建UI
* Kotlin Flow驱动，无LiveData
* MVVM架构
* Navigation, 单Activity
* Room
* Retrofit
* Hilt 依赖注入
* Androidx Media3

~~快毕业的无业游民, 有无大佬内推~~😅

## 🤩 特别感谢
* 特别感谢 [NeteaseCloudMusicApi](https://github.com/Binaryify/NeteaseCloudMusicApi) 项目，本APP的API调用部分大量参考了该项目的代码
* 特别感谢 [music-java-api](https://github.com/jnwang95/music-java-api) 项目的加密Java实现

## 🔭 参与到本项目
如果你懂Jetpack Compose和Kotlin，欢迎提交PR!

## 📡 开源协议
```text
MIT License

Copyright (c) 2021 RERERE

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
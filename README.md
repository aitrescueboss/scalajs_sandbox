# scalajs_sandbox
将来的にScala.jsでChrome拡張を書くときのための練習

# 検証環境

* Mac OS Sierra 0.12.6（16G1114）
* IntelliJ  
    * IntelliJ IDEA 2018.1.4 (Community Edition)
      Build #IC-181.5087.20, built on May 17, 2018
      JRE: 1.8.0_152-release-1136-b39 x86_64
      JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
      macOS 10.12.6
    * plugins
        * Scala 2018.1.9
* jdk 1.8 u172 (jEnvで指定)

# Knowhow
## IntelliJ

```bash
困ったら → IntelliJ [File] → [Invalidate Cache / Restart]
Cmd+, → [Build tool] → [Use autoimport]
build.sbtが赤い→Shift2回→[Reflesh ...]
```

## Scala.js
まだ公式のチュートリアルでHello, Worldやっただけ
https://www.scala-js.org/tutorial/basic/

### 以下間違っている可能性大のメモ書き

#### なぜ 外部のJavascriptライブラリを使うために，`build.sbt`に`libraryDependencies` と `jsDependencies` の両方が必要か

* `libraryDependencies`への指定
    * → Scala.jsから型定義を使うため(jar, sourceから獲得する)
* `jsDependencies`への指定
    * → Javascriptにクラスロードの仕組みがなく，jarだけだと実行できないため
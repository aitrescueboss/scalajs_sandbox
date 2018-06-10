package com.github.aitrescueboss.scala_js.tutorial

import org.scalajs.dom
import dom.document
import org.querki.jquery._

import scala.scalajs.js.annotation.JSExportTopLevel

object HelloWorld {
  def main(args: Array[String]): Unit = {
//    appendChildParagraphNode(document.body, "Hello, World!")
//    $("body").append("<p>Hello, World!</p>")
    $(() => setupUI())
  }

  /**
    * targetNodeの子要素に`<p>` (段落)ノードを入れる
    * @param targetNode 段落ノードを入れる親ノード
    * @param text 段落に入れる文字列
    */
  def appendChildParagraphNode(targetNode: dom.Node, text: String): Unit = {
    val paragraphNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    paragraphNode.appendChild(textNode)
    targetNode.appendChild(paragraphNode)
  }
  // -- before --
  // <!DOCTYPE html>
  // <html>
  // <head>
  //     <meta charset="UTF-8">
  //     <title>The Scala.js Tutorial</title>
  // </head>
  // <body>
  // <!-- Include Scala.js compiled code -->
  // <script type="text/javascript" src="./target/scala-2.12/scalajs_sandbox-fastopt.js"></script>
  // </body>
  // </html>
  // -- after --
  // (consoleで `document.body.innerHTML` して確認した結果)
  //  <!-- Include Scala.js compiled code -->
  //    <script type="text/javascript" src="./target/scala-2.12/scalajs_sandbox-fastopt.js"></script><p>Hello, World!</p>


  @JSExportTopLevel("addClickedMessage") // JavaScriptからトップレベルの関数として呼べるようになるアノテーション → htmlから呼べるようになる
  def addClickedMessage(): Unit = {
    appendChildParagraphNode(document.body, "You clicked the button!")
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello World</p>")
    $("#click-me-button").click(() => addClickedMessage())
  }
}

# Basic Play App
## Files
```
+- app .. play app
+- conf .. configuration
+- test .. test code
+- project
  +- build.properties
       sbt.version=0.13.12
  +- plugins.sbt
build.sbt
  name := "Play Basic Playground"
  version := "1.0"
  scalaVersion := "2.11.8"

```
* create folders and files
* load project in IDEA and mark folders

### Anatomy of a play application
https://www.playframework.com/documentation/2.5.x/Anatomy


### application.conf
```
play {
  crypto.secret="application secret for encryption and signing"
  i18n.langs="de"
}
```
oder 
```
play {
  crypto {
    secret = "csrf-secret"
  }
  i18n {
    langs = ["de"]
  }
}
```
* HOCON notation .. Human-Optimized Config Object
* idea keep the semantics of JSON for tree structure, types and encoding, 
  but to make it more friendly for humans to read and edit
* possibility to include configuration files
  (write a specific application.conf via puppet and include the common settings 
  for all stages and env via `include "application-internal.conf"`)
  
* used for
  * database config
  * play config
  * akka config
  * thread pool configuration
  * ...


### logback
* play use logback lib
* logback.xml
* see simple logback.xml in project

### add play support
* plugins.sbt
  
  `addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.9")`
* build.sbt
  
  ```
  // configuration of the main project
  lazy val root = (project in file(".")).enablePlugins(PlayScala)
  ```
* try to run play application
  
  `help run`
  `run`


### router
* looks at the RequestHeader, analyzes
  * method
  * URI
  * query string
  
  to  decide which action to pass the request to
* play own textual format
* located conf/routes
* `GET  /test    controllers.Test.testAction` -> try to refresh u're application ;)

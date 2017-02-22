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



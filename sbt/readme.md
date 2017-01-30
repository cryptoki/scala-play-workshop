*cmd> sbt*
- download any requirements

*every project should have two files*
- project/build.properties
- build.sbt
- sbt includes setting for a default project
- it requires no build files to run


*project/build.properties*
- sbt.version=0.13.9
- which version should be used for the project

*build.sbt*
- defines actual setting for the build


*commands*
- tasks .. the tasks you can run on the build
- settings .. the settings you can modify for the project 
- inspect .. information about a given setting or task

*tasks*
Tasks are things that sbt build can do for you, like compiling a project, 
creating documentation, or running tests. For now, let’s look at what sbt 
provides out of the box:


*default project layout*
sbt comes prebaked with many settings and conventions, including an 
assumed project layout. The default project layout is borrowed from Maven 
for familiarity. By default, projects look something like this figure.
````
 <build directory>/
    project/  .. sbt plugins and build helper code
       src/ 
          main/
            scala/  .. Scala and Java sources
            java/      are split by convention.
            resources/
          test/ 
            scala/  .. Scala and Java sources
            java/      are split by convention.
            resources/ .. Resources are all noncompiled files 
                          that should be on the classpath at runtime.
    target/
    build.sbt  ..  Build file
````

*console*
* interacting with the REPL
* exit with :q


*helper*


https://github.com/rtimush/sbt-updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")

https://github.com/jrudolph/sbt-dependency-graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")


* u can add these to u're own build.sbt or set it to the global settings
* I prefer for common utils the global settings
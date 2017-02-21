http://www.scala-sbt.org/0.13/docs/sbt-reference.pdf

### Features of sbt
Source: http://www.scala-sbt.org
- Little or no configuration required for simple projects
- Scala-based build definition that can use the full flexibility of Scala code
- Accurate incremental recompilation using information extracted from the compiler
- Continuous compilation and testing with triggered execution
- Packages and publishes jars
- Generates documentation with scaladoc
- Supports mixed Scala/Java projects
- Supports testing with ScalaCheck, specs, and ScalaTest. JUnit is supported by a plugin.
- Starts the Scala REPL with project classes and dependencies on the classpath
- Modularization supported with sub-projects
- External project support (list a git repository as a dependency!)
- Parallel task execution, including parallel test execution
- Library management support: inline declarations, external Ivy or Maven configuration 
  files, or manual management

### Practice
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

## Library Management
````
libraryDependencies += groupID % artifactID % revision
libraryDependencies += groupID % artifactID % revision % configuration
````

If you are using a dependency that was built with sbt, double the first % to be %%

````
libraryDependencies += groupID %% artifactID % revision
````
This will use the right jar for the dependency built with the version of Scala that you are currently using.

````
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"

org.scalatest:scalatest_2.11:2.2.6:jar
````

## Commands
- tasks .. the tasks you can run on the build
- settings .. the settings you can modify for the project 
- inspect .. information about a given setting or task


### Tasks
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
* interacting with the REPL (Read-Evaluate-Print-Loop) - Scala Console
* exit with :q


### Plugins

#### What is a plugin?
Source: http://www.scala-sbt.org
````text
A plugin extends the build de nition, most commonly by adding new settings. The new settings 
could be new tasks. For example, a plugin could add a codeCoverage task which would generate 
a test coverage report.
````

*Declaring a plugin*
* add a file in the project directory, name special for the plugin or in general plugins.sbt
* `addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")`

*New Tasks for org.scoverage*
* coverage
* coverageAggregate
* coverageCleanSubprojectFiles   
* coverageEnabled
* ...
* coverageOff
* ...
* coverageReport 


### Helper

https://github.com/rtimush/sbt-updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")
* show dependencyUpdate

https://github.com/jrudolph/sbt-dependency-graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
* show dependencyTree and dependencyBrowseGraph
* reminder: remove ```% test``` for presentation purpose


* u can add these to u're own build.sbt or set it to the global settings
  ````~/.sbt/0.13/plugins/plugins.sbt````
* I prefer for common utils the global settings

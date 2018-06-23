val sampleLibrary = project.settings(
  libraryDependencies += "com.example" %% "foo" % "0.1"
)

val sampleMain = project.settings(
  libraryDependencies += "com.example" %% "foo" % "0.2"
).dependsOn(
  sampleLibrary
)

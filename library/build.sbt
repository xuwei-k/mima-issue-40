val v1 = project.settings(
  organization := "com.example",
  name := "foo",
  version := "0.1"
)

val v2 = project.settings(
  mimaPreviousArtifacts := Set(
    organization.value %% name.value % "0.1"
  ),
  organization := "com.example",
  name := "foo",
  version := "0.2"
)

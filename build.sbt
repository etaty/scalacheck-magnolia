name := "scalacheck-magnolia"

version := "1.0"

scalaVersion := "2.12.4"

organization := "digitalgenius"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint:delayedinit-select",    // selecting member of DelayedInit
  "-Xlint:doc-detached",          // warn when a scaladoc is detached from its element
  "-Xlint:infer-any",             // Any shouldn't be infered - it's unsafe
  "-Xlint:missing-interpolator",  // a variable isn't defined in a string interpolation
  "-Xlint:nullary-override",      // warn when 'def f()' overrides 'def f'
  "-Xlint:nullary-unit",          // warn when nullary methods return with Unit
  "-Xlint:private-shadow",        // something shadows a private member
  "-Xlint:stars-align",           // pattern sequence wildcard must align with sequence component
  "-Xlint:type-parameter-shadow", // something local shadows a type parameter
  "-Xlint:unsound-match",         // the used pattern matching is unsafe
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ypartial-unification",
  "-Xmax-classfile-name", "200"
)

libraryDependencies ++= {
  Seq(
    "com.propensive" %% "magnolia" % "0.7.0",
    "org.scalacheck" %% "scalacheck" % "1.13.4",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )
}

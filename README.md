# Scalacheck Magnolia

### Why?

Because scalacheck-shapeless is good but too slow.
Also this is much smaller and understandable, thanks to Magnolia!


### Install

Just copy the files in src/main/scala to your project.
It's 2 files, less than 60 lines in total!


### How to use it?

```scala

import scalacheckmagnolia.MagnoliaArbitrary._
import org.scalacheck._

case class Example(a: String, b: Long)

val arbitraryExample = implicitly[Arbitrary[A]]

println(arbitraryExample.arbitrary.sample.get)

```
# Scalacheck Magnolia

Generation of arbitrary case classes / ADTs instances with [Scalacheck](https://github.com/rickynils/scalacheck) and [Magnolia](https://github.com/propensive/magnolia)!


### Why?

Because [scalacheck-shapeless](https://github.com/alexarchambault/scalacheck-shapeless) is good but too slow.
Also this is much smaller and understandable, thanks to [Magnolia](https://github.com/propensive/magnolia)!


### Install

Just copy the files in src/main/scala to your project.
It's 2 files, less than 60 lines in total!
And you don't have to care about updating Scalacheck or Magnolia


### How to use it?

```scala

import scalacheckmagnolia.MagnoliaArbitrary._
import org.scalacheck._

case class Example(a: String, b: Long)

val arbitraryExample = implicitly[Arbitrary[A]]

println(arbitraryExample.arbitrary.sample.get)

```

# Links

* https://www.scalacheck.org/
* http://magnolia.work/

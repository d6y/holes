# holes
Experimental/WIP on programming with holes in Scala.

The objective is to get helpful type information from a placeholder in the code.
This is like `???` but producing a compile-time error saying what type you need to progress an implementation.

For example:

```
import holes._

object Experiment {
  def compose[A,B,C](f: B=>C, g: A=>B): A=>C =
    a => hole
}

// [error] Hole found which needs to be filled with type: C
```

However that doesn't work (see _main.scala) for examples of what does and doesn't work so far).

Currently you get better help just using:

```
object hole

def compose[A,B,C](f: B=>C, g: A=>B): A=>C =
  a => hole
```

...instead of the hole macro included in this repository.

To try this code out:

```
$ sbt
sbt> ~compile
```

See _app/src/main/scala/main.scala_ for usage.


package example

import underscoreio.holes._

object Example {

  // CORRECT ERRORS:

  // Hole found which needs to be filled with type: Int
  //val x: Int = hole

  // recursive value x needs type
  //val x = hole

  // Hole found which needs to be filled with type: Int
  //def x: Int = hole

  // Hole found which needs to be filled with type: A => C
  //def compose[A,B,C](g: B => C, f: A => B): A => C = hole

  // INCORRECT ERRORS:

  // Hole found which needs to be filled with type: <notype>
  // (we want: C)
  def compose[A,B,C](g: B => C, f: A => B): A => C = a => hole


}
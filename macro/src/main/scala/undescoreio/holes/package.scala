package underscoreio

import scala.language.experimental.macros

package object holes {
  def hole[T]: T = macro MacroImpl.hole
}

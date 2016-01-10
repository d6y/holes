package underscoreio
package holes

import scala.reflect.macros.blackbox.Context

object MacroImpl {

  def hole(c: Context): c.Tree = {
    import c.universe._

    val targetType: Option[c.universe.Type] = {
      c.internal.enclosingOwner match {
        case ts: TermSymbol =>
          println(s"Symbol: $ts, signature: ${ts.typeSignature}")
          Some(ts.typeSignature.finalResultType)
        case o =>
          c.error(c.enclosingPosition, "Hole macro impcomplete: doesn't know what to do with {o.getClass}")
          None
        }
      }

    targetType match {
      case Some(t) => c.error(c.enclosingPosition, s"Hole found which needs to be filled with type: ${t}")
      case None    => c.error(c.enclosingPosition, "Hole exists, but type to fill cannot be determined")
    }

    q"???"
  }

}
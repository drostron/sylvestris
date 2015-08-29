package sylvestris.core

import algebra.Eq
import spray.json._

case class Error(message: String, throwable: Option[Throwable] = None)

object Error {

  implicit object jsonFormatter extends RootJsonFormat[Error] {
    def write(e: Error) = JsObject("message" -> JsString(e.message))
    def read(v: JsValue) = ???
  }

  implicit val eqInstance = Eq.fromUniversalEquals[Error]
}

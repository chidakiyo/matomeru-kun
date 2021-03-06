package clouddeck.util

import spray.json._
import DefaultJsonProtocol._

case class VMX(name: String, image: String, storage: String, fullPath: String, isOn: Option[Boolean] = None, ip: Option[String] = None, host: Option[String] = None, vmwareToolsStatus: Option[String] = None)

object VMXJsonProtocol extends DefaultJsonProtocol {
  implicit val vmxFormat = jsonFormat8(VMX)
}

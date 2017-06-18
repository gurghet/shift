package com.example.routes

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.RouteConcatenation._
import akka.http.scaladsl.server.directives.PathDirectives.{ path, pathEndOrSingleSlash }
import akka.http.scaladsl.server.directives.RouteDirectives.complete
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport._

/**
 * Routes can be defined in separated classes like shown in here
 */
object BaseRoutes {
  case class myInt(int: Int)
  // This route is the one that listens to the top level '/'
  lazy val baseRoutes: Route =
    pathEndOrSingleSlash { // Listens to the top `/`
      complete("Server up and running") // Completes with some text
    } ~ path("world") {
      complete(myInt(5).asJson)
    }
}

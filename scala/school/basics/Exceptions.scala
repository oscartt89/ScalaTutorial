/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object Exceptions {
  //Try-catch block
  try {
    remoteCalculatorService.add(1, 2)
  } catch {
    case e: ServerIsDownException => log.error(e, "the remote calculator service is unavailable. should have kept your trusty HP.")
  } finally {
    remoteCalculatorService.close()
  }

  //Try-catch are also expression-oriented
  val result: Int = try {
    remoteCalculatorService.add(1, 2)
  } catch {
    case e: ServerIsDownException => {
      log.error(e, "the remote calculator service is unavailable. should have kept your trusty HP.")
      0
    }
  } finally {
    remoteCalculatorService.close()
  }
}
package rxscalajs.facade
import rxscalajs.Scheduler

import scala.scalajs.js.annotation.{JSGlobal, JSImport}
import scala.scalajs.js


@js.native
@JSImport("rxjs/Rx","ReplaySubject")
class ReplaySubjectFacade[T] protected() extends SubjectFacade[T] {
  def this(bufferSize: Int = ???, windowTime: Int = ???, scheduler: Scheduler = ???) = this()
}

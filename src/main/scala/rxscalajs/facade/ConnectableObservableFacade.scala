package rxscalajs.facade

import rxscalajs.subscription.Subscription

import scala.scalajs.js.annotation.{JSGlobal, JSImport}
import scala.scalajs.js





@js.native
@JSImport("rxjs/Rx","ConnectableObservable")
class ConnectableObservableFacade[+T] protected() extends ObservableFacade[T] {
  def this(source: ObservableFacade[T], subjectFactory: js.Function0[SubjectFacade[T]]) = this()
  def connect(): Subscription = js.native
  def refCount(): ObservableFacade[T] = js.native
}

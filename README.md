- https://github.com/lightbend/migration-manager/issues/40
- https://travis-ci.org/xuwei-k/mima-issue-40/builds/395711686

```
[info] Running com.example.Main 
[error] (run-main-0) java.lang.ExceptionInInitializerError
[error] java.lang.ExceptionInInitializerError
[error] 	at com.example.Main$.main(Main.scala:6)
[error] 	at com.example.Main.main(Main.scala)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] 	at java.lang.reflect.Method.invoke(Method.java:498)
[error] 	at sbt.Run.invokeMain(Run.scala:93)
[error] 	at sbt.Run.run0(Run.scala:87)
[error] 	at sbt.Run.execute$1(Run.scala:65)
[error] 	at sbt.Run.$anonfun$run$4(Run.scala:77)
[error] 	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
[error] 	at sbt.util.InterfaceUtil$$anon$1.get(InterfaceUtil.scala:10)
[error] 	at sbt.TrapExit$App.run(TrapExit.scala:252)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] Caused by: java.lang.ClassCastException: java.lang.Integer cannot be cast to scala.Option
[error] 	at com.example.A$.foo(A.scala:5)
[error] 	at com.example.B$.<init>(B.scala:4)
[error] 	at com.example.B$.<clinit>(B.scala)
[error] 	at com.example.Main$.main(Main.scala:6)
[error] 	at com.example.Main.main(Main.scala)
```

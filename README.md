im-going-twirly
===============

A very simple Twirl example to report a bug to JetBrains on IntelliJ IDEA 14.0.1. The problem is that IntelliJ 
does not compile Twirl templates except in a Play 2.0 project. If you're using Twirl separately, say with Spray, 
then the templates won't get compiled. This means you need to drop down to "sbt compile" which causes both
compilation systems to recompile. 

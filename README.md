This project provides the revised source of the
<http://sourceforge.net/projects/jsocks/> project as
required by the LGPL. JSocks implement a SOCKS proxy
(see <https://en.wikipedia.org/wiki/SOCKS>) in Java 6 and onwards.

The git repository was started on a blank sheet,
and then importing the sources, so all the
work done is in the git history. The sf repository
does not contain any versioned files, so there
was no history to import.

A source tree with proper packages has been
set up and cleaned up by Eclipse.

Logging has been migrated to slf4j and a
launch configuration using slf4j-simple has
been included, which also allows for creating
runnable jars from inside Eclipse 3.5+

/ravn - 2009-09-07

Mavenized.

/ravn - 2012-11-07

Updated for 2022.

* Note: No code functionality changes.
* Logging was reverted to java.util.logging to keep Java 1.6+ compatibility (slf4j 2.0 requires Java 8)
  and avoid dependencies for
  the runnable jar. If you need another logging framework, consider looking into the various slf4j tools
  (<https://www.slf4j.org/legacy.html>)
* IntelliJ and Eclipse report fewer warnings.
* Creates a runnable jar.
* GitHub Actions support. Exposes runnable jar as build artifact.
* Original source tree converted to default Maven layout.
* `mvn -q exec:java` should work.

Pending:

* Reformat sources according to a known style and add editor config and checkstyle config.
* Handle SonarLint and IntelliJ reports.
* Script running  tests in `helper/` against compiled server. Preferably on Java 6.


Suggestion and bug fixes welcome.

/ravn - 2022-12-17

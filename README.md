# Clojurize

*Motivation: As a Clojurian, I want to be able to uniformly configure access to and utilize virtually any data storage mechanism while ignoring their superficial differences so that I can concentrate on composing problem domain solutions.*

Clojurize aims to provide a simple, intuitive, common DSL for interacting with several different kinds of data sources from within Clojure, along with facilities for authors of adapters such as documentation and common tests.

Clojurize and adapters that implement its protocol handle:

* translation from Clojure expressions to native data store calls
* translation from data store responses to Clojure data structures.

You can read more about Clojurize at [anvil.io](http://anvil.io):

* [Clojurize the Data, Not the Database](http://anvil.io/2010/10/25/clojurize-the-data-not-the-database.html)


## Status

Clojurize is in the inception phase. Your participation is very
welcome and strongly encouraged. Send encouragement, criticism and general thoughts to smith at anvil.io, or skype me for a discussion (anvil.io). If you want to submit code, please do so via GitHub.


## Usage

The Clojurize Protocol is incorporated into Clojurize adapters as a dependency. The jar is on clojars. See related repositories:

* [Clojurize Adapter Starter Kit](http://github.com/christiansmith/clojurize-adapter)
* [Experimental Clojurize CouchDB Adapter](http://github.com/christiansmith/clojurize-couchdb)
* [Experimental Clojurize SQL Adapter](http://github.com/christiansmith/clojurize-sql)


## License

Copyright (C) 2010 Christian Smith

Distributed under the Eclipse Public License, the same as Clojure.

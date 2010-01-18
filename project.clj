(defproject
 org.clojars.blank-appengine-clj
 "1.0.0"
 :compile-path
 "war/WEB-INF/classes"
 :dependencies
 [[org.clojure/clojure "1.1.0-alpha-SNAPSHOT"]
  [lein-gae "1.0.0-SNAPSHOT"]
  [org.clojars.dvgb/compojure "0.3.1"]
  [org.clojars.hiredman/compojure "0.3.1"]
  [com.google.appengine/appengine-api-1.0-sdk "1.2.1"]
  [com.google.appengine/appengine-tools-sdk "1.2.1"]
  [geronimo-spec/geronimo-spec-servlet "2.4-rc4"]
  [org.clojars.hiredman/compojure "0.3.1"]
  [com.google.appengine/appengine-api-1.0-sdk "1.2.1"]
  [com.google.appengine/appengine-tools-sdk "1.2.1"]
  [geronimo-spec/geronimo-spec-servlet "2.4-rc4"]]
 :dev-dependencies
 [[lein-clojars "0.5.0-SNAPSHOT"]]
 :appengine
 {:id "org.clojars.blank-appengine-clj",
  :display-name "org.clojars.blank-appengine-clj",
  :version 1,
  :devport 8080}
 :description
 "A very simple starting off point for appengine-clj.")

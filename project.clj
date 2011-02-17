(defproject blank-appengine-clj "1"
  :description "Blank slate for starting out with clojure on google app engine."
  :namespaces [core]
  :dependencies [[compojure "0.5.2"]
                 [ring/ring-servlet "0.2.1"]
                 [hiccup "0.3.1"]
                 [appengine "0.2"]
                 ;;These must be manually installed using install.sh
                 [com.google.appengine/appengine-api-1.0-sdk "1.4.2"]
                 [com.google.appengine/appengine-api-labs "1.4.2"]] 
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [ring/ring-jetty-adapter "0.2.0"]
                     [com.google.appengine/appengine-local-runtime "1.4.2"]
                    [com.google.appengine/appengine-api-stubs "1.4.2"]]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")

(defproject blank-appengine-clj "1"
  :description "Blank slate for starting out with clojure on google app engine."
  :namespaces [core]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :dependencies [[compojure "0.4.0"]
                 [ring/ring-servlet "0.2.1"]
                 [hiccup "0.2.4"]
                 [appengine "0.2"]
                 ;;These must be manually installed using install.sh
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.5"]
                 [com.google.appengine/appengine-api-labs "1.3.5"]] 
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [ring/ring-jetty-adapter "0.2.0"]
                     [com.google.appengine/appengine-local-runtime "1.3.5"]
                    [com.google.appengine/appengine-api-stubs "1.3.5"]]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")

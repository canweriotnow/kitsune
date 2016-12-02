(defproject kitsune "0.1.0-SNAPSHOT"
  :description "A post-web framework for a post-framework web."
  :url "https://github.com/canweriotnow/kitsune"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]
                 [com.cognitect/transit-clj "0.8.295"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot kitsune.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

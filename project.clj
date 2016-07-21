(defproject messages "1.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.89"]
                 [reagent "0.6.0-rc"]]
  :plugins [[lein-cljsbuild "1.1.3"]]
  :cljsbuild {
    :builds [{
      :source-paths ["src"]
      :compiler {
        :output-to "public/js/main.js"
        :optimizations :whitespace}}]})

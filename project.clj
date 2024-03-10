(defproject com.adaiasmagdiel/sorterfy "0.1.0"
  :description "An experimental Clojure program designed to read lines from an input file, sort them, and write the sorted lines to an output file."
  :url "http://github.com/AdaiasMagdiel/sorterfy"
  :license {:name "MIT"
            :url "https://opensource.org/license/mit"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns .}
  :profiles {:uberjar {:aot :all}}
  :main sorterfy)

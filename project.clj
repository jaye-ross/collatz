(defproject collatz "1.0.0"
  :description "Produce Collatz Sequences (3n + 1)"
  :url "github.com/jacquesattack/collatz"
  :license {:name "MIT License"
            :url "https://choosealicense.com/licenses/mit/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot collatz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

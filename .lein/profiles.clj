{:user {:aliases {"math" ^{:doc "Start a REPL with math dependencies added."}
                    ["with-profile" "+math" "repl"]
                  "eval" ^{:doc
                           "Evaluate a Clojure string with clojure.main/main."}
                    ["run" "-m" "clojure.main/main" "-e"]}
        :plugins [[lein-shell "0.4.0"]
                  [lein-try "0.4.1"]
                  [lein-miditest "0.1.0"]
                  [lein-pprint "1.1.1"]]}
 :math {:dependencies [[org.clojure/math.combinatorics "0.0.2"]
                       [org.clojure/math.numeric-tower "0.0.1"]
                       [com.hypirion/primes "0.2.1"]
                       [org.clojure/tools.trace "0.7.3"]]
        :repl-options {:init (do (use 'clojure.math.combinatorics
                                      'clojure.math.numeric-tower
                                      'clojure.tools.trace)
                                 (require '[clojure.pprint
                                            :refer [pprint cl-format]]
                                          '[com.hypirion.primes :as primes]))}}}

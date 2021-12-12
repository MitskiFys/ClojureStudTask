(ns task-one.core
  (:gen-class))

(require '[clojure.repl :refer :all])

(defn -main
  [string countSymbols]
(clojure.string/replace string (re-pattern (str "(.)\\1{" (str (- countSymbols 1) ",}"))) "")
)

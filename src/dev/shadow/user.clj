(ns shadow.user
  (:require [shadow.cljs.devtools.api :as api]))

(defn cljs-repl
  []
  (api/watch :plugin)
  (api/repl :plugin))

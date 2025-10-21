(ns example.core
  (:require [com.logseq.core :as lc]
            [com.logseq.editor :as le]
            [com.logseq.ui :as lu]
            [promesa.core :as p]))

(defn -init []
  (p/do!
   (lc/ready)
   (lu/show-msg "looks great" :warning)
   (p/let [prop (le/get-property :logseq.property/status)]
     (prn :debug :property prop))
   ;; DB is not loaded yet
   ;; (p/let [pages (le/get-all-pages)]
   ;;   (prn :debug :pages pages))
   ))

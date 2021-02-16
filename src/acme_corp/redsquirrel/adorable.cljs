(ns acme-corp.redsquirrel.adorable
  (:require [acme-corp.redsquirrel.nuts]
            [acme-corp.redsquirrel.cute]))

(defn init! []
  (acme-corp.redsquirrel.nuts)
  (acme-corp.redsquirrel.cute)
  (println "being adorable"))
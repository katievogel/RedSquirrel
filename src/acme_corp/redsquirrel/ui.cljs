(ns acme-corp.redsquirrel.ui
  (:require [acme-corp.redsquirrel.rendering]
            [acme-corp.redsquirrel.routing]))

(defn init! []
  (acme-corp.redsquirrel.rendering/init!)
  (acme-corp.redsquirrel.routing/init!)
  (println "the UI"))